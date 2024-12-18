package com.facebook.msys.mca;

import X.C137306Jk;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

/* loaded from: classes3.dex */
public class MailboxHealthReport {
    public NativeHolder mNativeHolder;

    public static native void cleanupContext();

    public static native void endHealthReport();

    private native boolean nativeEquals(Object obj);

    public static native boolean nativeStart(Mailbox mailbox, String str);

    public static native MailboxHealthReport retrieve();

    public native List getAllErrors();

    public native List getAllExtendedErrors();

    public native int getError();

    public native long getExtendedError();

    public native long getStatCount(int i);

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MailboxHealthReport) {
            return nativeEquals(obj);
        }
        return false;
    }

    static {
        C137306Jk.A00();
    }

    public MailboxHealthReport(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static boolean start(Mailbox mailbox, String str) {
        return nativeStart(mailbox, str);
    }
}
