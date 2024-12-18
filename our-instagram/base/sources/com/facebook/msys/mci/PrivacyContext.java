package com.facebook.msys.mci;

import X.C53882dS;
import com.facebook.simplejni.NativeHolder;
import java.util.Set;

/* loaded from: classes.dex */
public class PrivacyContext {
    public final NativeHolder mNativeHolder;

    public static native PrivacyContext newPrivacyContext(Set set);

    public native Set getKeys();

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof PrivacyContext)) {
            return getKeys().equals(((PrivacyContext) obj).getKeys());
        }
        return false;
    }

    static {
        C53882dS.A00();
    }

    public PrivacyContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public int hashCode() {
        return getKeys().hashCode();
    }
}
