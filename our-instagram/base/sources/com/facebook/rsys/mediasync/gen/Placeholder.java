package com.facebook.rsys.mediasync.gen;

import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class Placeholder {
    public static C2N9 CONVERTER = C55648OnZ.A00(50);
    public static long sMcfTypeId;
    public final String contentId;
    public final String message;
    public final String title;

    public static native Placeholder createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return this.contentId.equals(placeholder.contentId) && this.title.equals(placeholder.title) && this.message.equals(placeholder.message);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.message, AbstractC166997dE.A0K(this.title, AbstractC50523MSb.A02(this.contentId)));
    }

    public String toString() {
        return AnonymousClass001.A15("Placeholder{contentId=", this.contentId, ",title=", this.title, ",message=", this.message, "}");
    }

    public Placeholder(String str, String str2, String str3) {
        AbstractC31180DnO.A1U(str, str2, str3);
        this.contentId = str;
        this.title = str2;
        this.message = str3;
    }
}
