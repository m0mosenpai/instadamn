package com.facebook.browser.helium.content;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.facebook.browser.helium.util.voltron.HeliumVoltronHelper;
import dalvik.system.InMemoryDexClassLoader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public class SandboxedProcessService extends Service {
    public static long A01;
    public Object A00 = null;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.facebook.browser.helium.content.IHeliumChildProcessDelegate$Stub$Proxy] */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IHeliumChildProcessDelegate iHeliumChildProcessDelegate;
        ParcelFileDescriptor B4H;
        long B4J;
        long B4I;
        InMemoryDexClassLoader inMemoryDexClassLoader;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            IBinder binder = extras.getBinder("helium_delegate");
            if (binder != null) {
                IInterface queryLocalInterface = binder.queryLocalInterface("com.facebook.browser.helium.content.IHeliumChildProcessDelegate");
                if (queryLocalInterface != null && (queryLocalInterface instanceof IHeliumChildProcessDelegate)) {
                    iHeliumChildProcessDelegate = (IHeliumChildProcessDelegate) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.A00 = binder;
                    iHeliumChildProcessDelegate = obj;
                }
                if (iHeliumChildProcessDelegate != null) {
                    boolean z = extras.getBoolean("use_goofy_library", false);
                    try {
                        try {
                            iHeliumChildProcessDelegate.Cnb("helium_child_dex_start", System.currentTimeMillis());
                        } catch (RemoteException unused) {
                        }
                        try {
                            AssetFileDescriptor childDexFd = HeliumVoltronHelper.getChildDexFd(getApplicationContext());
                            B4H = childDexFd.getParcelFileDescriptor();
                            B4J = childDexFd.getStartOffset();
                            B4I = childDexFd.getDeclaredLength();
                        } catch (IOException e) {
                            e.printStackTrace();
                            try {
                                iHeliumChildProcessDelegate.Cnb("helium_child_dex_map_fail", System.currentTimeMillis());
                            } catch (RemoteException unused2) {
                            }
                            B4H = iHeliumChildProcessDelegate.B4H();
                            B4J = iHeliumChildProcessDelegate.B4J();
                            B4I = iHeliumChildProcessDelegate.B4I();
                        }
                        MappedByteBuffer map = new FileInputStream(B4H.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, B4J, B4I);
                        if (Build.VERSION.SDK_INT >= 29) {
                            inMemoryDexClassLoader = new InMemoryDexClassLoader(new ByteBuffer[]{map}, getApplicationInfo().nativeLibraryDir, null);
                        } else if (!z) {
                            inMemoryDexClassLoader = new InMemoryDexClassLoader(map, getClassLoader());
                        } else {
                            throw new RuntimeException("Goofy linking is not supported on Android SDK <29");
                        }
                        try {
                            iHeliumChildProcessDelegate.Cnb("helium_child_dex_end", System.currentTimeMillis());
                        } catch (RemoteException unused3) {
                        }
                        if (z) {
                            try {
                                iHeliumChildProcessDelegate.Cnb("helium_child_library_start", System.currentTimeMillis());
                            } catch (RemoteException unused4) {
                            }
                            Class<?> loadClass = inMemoryDexClassLoader.loadClass("org.chromium.base.library_loader.LibraryLoader");
                            Object invoke = loadClass.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                            ParcelFileDescriptor BAC = iHeliumChildProcessDelegate.BAC();
                            if (BAC != null) {
                                loadClass.getMethod("initializeGoofyLinker", ParcelFileDescriptor.class).invoke(invoke, BAC);
                                try {
                                    iHeliumChildProcessDelegate.Cnb("helium_child_library_end", System.currentTimeMillis());
                                } catch (RemoteException unused5) {
                                }
                            } else {
                                throw new FileNotFoundException("Library file was null");
                            }
                        }
                        try {
                            Object invoke2 = inMemoryDexClassLoader.loadClass("org.chromium.content_public.app.ChildProcessServiceFactory").getMethod("create", Service.class, Context.class).invoke(null, this, getApplicationContext());
                            this.A00 = invoke2;
                            if (invoke2 != null) {
                                Class<?> cls = invoke2.getClass();
                                Method method = cls.getMethod("onCreate", new Class[0]);
                                try {
                                    iHeliumChildProcessDelegate.Cnb("helium_child_service_create_start", System.currentTimeMillis());
                                } catch (RemoteException unused6) {
                                }
                                method.invoke(this.A00, new Object[0]);
                                try {
                                    iHeliumChildProcessDelegate.Cnb("helium_child_service_create_end", System.currentTimeMillis());
                                } catch (RemoteException unused7) {
                                }
                                Method method2 = cls.getMethod("onBind", Intent.class);
                                try {
                                    iHeliumChildProcessDelegate.Cnb("helium_child_service_bind_start", System.currentTimeMillis());
                                } catch (RemoteException unused8) {
                                }
                                IBinder iBinder = (IBinder) method2.invoke(this.A00, intent);
                                try {
                                    iHeliumChildProcessDelegate.Cnb("helium_child_service_bind_end", System.currentTimeMillis());
                                } catch (RemoteException unused9) {
                                }
                                try {
                                    iHeliumChildProcessDelegate.EHO(A01);
                                } catch (RemoteException unused10) {
                                }
                                return iBinder;
                            }
                            throw new RuntimeException("Failed to create ChildProcessService");
                        } catch (ReflectiveOperationException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (RemoteException | IOException | ReflectiveOperationException e3) {
                        throw new RuntimeException("Failed to bootstrap child process", e3);
                    }
                }
                throw new RuntimeException("Helium child processes require a HeliumChildProcessDelegate");
            }
            throw new RuntimeException("Helium child processes require a HeliumChildProcessDelegate");
        }
        throw new RuntimeException("Helium child processes require a bundle");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Object obj = this.A00;
        if (obj != null) {
            try {
                try {
                    obj.getClass().getMethod("onDestroy", new Class[0]).invoke(this.A00, new Object[0]);
                } catch (ReflectiveOperationException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                this.A00 = null;
            }
        }
    }
}
