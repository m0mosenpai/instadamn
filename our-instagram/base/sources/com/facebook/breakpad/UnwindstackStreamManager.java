package com.facebook.breakpad;

import X.C09170dP;
import X.C0K8;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class UnwindstackStreamManager {
    public static volatile boolean isRegistered;
    public static boolean isUnwindstackJniLoaded;

    public static native void nativeRegister(String str, String str2);

    public static native void nativeUnregister();

    public static boolean register() {
        String A03;
        boolean z;
        synchronized (UnwindstackStreamManager.class) {
            if (!isRegistered) {
                if (!isUnwindstackJniLoaded) {
                    C0K8.A0C("unwindstack", "Loading unwindstack jni native library failed. Cannot register unwindstack stream to breakpad");
                } else {
                    try {
                        A03 = C09170dP.A03("libunwindstack_binary.so");
                    } catch (IOException e) {
                        C0K8.A0F("unwindstack", "Error registering unwindstack stream", e);
                    }
                    if (A03 == null) {
                        C0K8.A0C("unwindstack", "Unable to find libunwindstack_binary.so");
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("libunwindstack_binary.so");
                        ArrayList arrayList2 = new ArrayList();
                        File parentFile = new File(A03).getParentFile();
                        if (parentFile != null) {
                            arrayList2.add(parentFile.getCanonicalPath());
                        }
                        for (int i = 0; i < arrayList.size(); i++) {
                            String str = (String) arrayList.get(i);
                            ReentrantReadWriteLock reentrantReadWriteLock = C09170dP.A08;
                            reentrantReadWriteLock.readLock().lock();
                            try {
                                String[] strArr = null;
                                if (C09170dP.A0C != null) {
                                    int i2 = 0;
                                    while (i2 < C09170dP.A0C.length) {
                                        strArr = C09170dP.A0C[i2].A03(str);
                                        i2++;
                                        if (strArr != null) {
                                            break;
                                        }
                                    }
                                }
                                if (strArr == null) {
                                    C0K8.A0P("unwindstack", "unable to find dependencies for %s, but it's okay for SystemLoadWrapperSoSource", arrayList.get(i));
                                } else {
                                    for (String str2 : strArr) {
                                        String A032 = C09170dP.A03(str2);
                                        if (A032 == null) {
                                            C0K8.A0P("unwindstack", "unable to find path for %s", str2);
                                        } else if (!arrayList.contains(str2) && !A032.startsWith("/system") && !A032.startsWith("/vendor") && !A032.startsWith("/apex") && !A032.startsWith("/odm")) {
                                            arrayList.add(str2);
                                            File parentFile2 = new File(A032).getParentFile();
                                            if (parentFile2 != null) {
                                                String canonicalPath = parentFile2.getCanonicalPath();
                                                if (!arrayList2.contains(canonicalPath)) {
                                                    arrayList2.add(canonicalPath);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                reentrantReadWriteLock.readLock().unlock();
                            }
                        }
                        StringBuilder sb = new StringBuilder((String) arrayList2.get(0));
                        for (int i3 = 1; i3 < arrayList2.size(); i3++) {
                            sb.append(":");
                            sb.append((String) arrayList2.get(i3));
                        }
                        nativeRegister(A03, sb.toString());
                        z = true;
                        isRegistered = z;
                    }
                }
                z = false;
                isRegistered = z;
            }
        }
        return isRegistered;
    }

    static {
        try {
            C09170dP.A0C("unwindstack_stream");
            isUnwindstackJniLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            C0K8.A0F("unwindstack", "Failed to load unwindstack jni library: ", e);
        }
    }
}
