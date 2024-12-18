package com.google.vr.dynamite.client;

import X.AnonymousClass001;
import X.C62730SNu;
import X.C62742SOj;
import X.Rk7;
import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;

/* loaded from: classes10.dex */
public final class DynamiteClient {
    public static final ArrayMap a = new ArrayMap();

    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        INativeLibraryLoader newNativeLibraryLoader;
        synchronized (DynamiteClient.class) {
            C62742SOj c62742SOj = new C62742SOj(str, str2);
            C62730SNu remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(c62742SOj);
            try {
                newNativeLibraryLoader = remoteLibraryLoaderFromInfo.A01(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.A00(context)), new ObjectWrapper(context));
            } catch (Rk7 | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                Log.e("DynamiteClient", AnonymousClass001.A0g("Failed to load native library ", c62742SOj.toString(), " from remote package:\n  "), e);
            }
            if (newNativeLibraryLoader == null) {
                Log.e("DynamiteClient", AnonymousClass001.A0g("Failed to load native library ", c62742SOj.toString(), " from remote package: no loader available."));
                return -1;
            }
            return newNativeLibraryLoader.checkVersion(str3);
        }
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        ClassLoader classLoader;
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext != null) {
                classLoader = remoteContext.getClassLoader();
            } else {
                classLoader = null;
            }
        }
        return classLoader;
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context context2;
        synchronized (DynamiteClient.class) {
            C62742SOj c62742SOj = new C62742SOj(str, str2);
            try {
                context2 = getRemoteLibraryLoaderFromInfo(c62742SOj).A00(context);
            } catch (Rk7 e) {
                Log.e("DynamiteClient", AnonymousClass001.A0g("Failed to get remote Context", c62742SOj.toString(), " from remote package:\n  "), e);
                context2 = null;
            }
        }
        return context2;
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, null);
            if (remoteContext == null) {
                return null;
            }
            try {
                return new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
            } catch (RuntimeException e) {
                Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e);
                return null;
            }
        }
    }

    public static synchronized C62730SNu getRemoteLibraryLoaderFromInfo(C62742SOj c62742SOj) {
        C62730SNu c62730SNu;
        synchronized (DynamiteClient.class) {
            ArrayMap arrayMap = a;
            c62730SNu = (C62730SNu) arrayMap.get(c62742SOj);
            if (c62730SNu == null) {
                c62730SNu = new C62730SNu(c62742SOj);
                arrayMap.put(c62742SOj, c62730SNu);
            }
        }
        return c62730SNu;
    }

    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        INativeLibraryLoader newNativeLibraryLoader;
        synchronized (DynamiteClient.class) {
            C62742SOj c62742SOj = new C62742SOj(str, str2);
            C62730SNu remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(c62742SOj);
            try {
                newNativeLibraryLoader = remoteLibraryLoaderFromInfo.A01(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.A00(context)), new ObjectWrapper(context));
            } catch (Rk7 | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                Log.e("DynamiteClient", AnonymousClass001.A0g("Failed to load native library ", c62742SOj.toString(), " from remote package:\n  "), e);
            }
            if (newNativeLibraryLoader == null) {
                Log.e("DynamiteClient", AnonymousClass001.A0g("Failed to load native library ", c62742SOj.toString(), " from remote package: no loader available."));
                return 0L;
            }
            return newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
        }
    }
}
