package org.webrtc;

import X.AbstractC58318PtA;
import X.AnonymousClass001;

/* loaded from: classes12.dex */
public class NativeLibrary {
    public static String TAG = "NativeLibrary";
    public static boolean libraryLoaded;
    public static Object lock = AbstractC58318PtA.A0b();

    /* loaded from: classes12.dex */
    public class DefaultLoader implements NativeLibraryLoader {
        @Override // org.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            boolean z = Logging.loggingEnabled;
            try {
                System.loadLibrary(str);
                return true;
            } catch (UnsatisfiedLinkError e) {
                Logging.e(NativeLibrary.TAG, AnonymousClass001.A0R("Failed to load native library: ", str), e);
                return false;
            }
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            if (libraryLoaded) {
                boolean z = Logging.loggingEnabled;
            } else {
                boolean z2 = Logging.loggingEnabled;
                libraryLoaded = nativeLibraryLoader.load(str);
            }
        }
    }

    public static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }
}
