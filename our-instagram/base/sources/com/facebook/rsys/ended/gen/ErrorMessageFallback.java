package com.facebook.rsys.ended.gen;

import X.AnonymousClass001;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class ErrorMessageFallback {
    public static C2N9 CONVERTER = YAN.A00(45);
    public static long sMcfTypeId;
    public final String message;

    public static native ErrorMessageFallback createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorMessageFallback)) {
            return false;
        }
        return this.message.equals(((ErrorMessageFallback) obj).message);
    }

    public int hashCode() {
        return 527 + this.message.hashCode();
    }

    public String toString() {
        return AnonymousClass001.A0g("ErrorMessageFallback{message=", this.message, "}");
    }

    public ErrorMessageFallback(String str) {
        str.getClass();
        this.message = str;
    }
}
