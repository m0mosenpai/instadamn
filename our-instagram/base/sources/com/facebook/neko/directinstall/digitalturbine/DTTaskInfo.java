package com.facebook.neko.directinstall.digitalturbine;

import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.X0V;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DTTaskInfo extends C0T6 {
    public static final Companion Companion = new Object();
    public final int A00;
    public final DTApplication A01;
    public final Double A02;
    public final String A03;
    public final String A04;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0V.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DTTaskInfo) {
                DTTaskInfo dTTaskInfo = (DTTaskInfo) obj;
                if (!C14360o3.A0K(this.A04, dTTaskInfo.A04) || this.A00 != dTTaskInfo.A00 || !C14360o3.A0K(this.A01, dTTaskInfo.A01) || !C14360o3.A0K(this.A02, dTTaskInfo.A02) || !C14360o3.A0K(this.A03, dTTaskInfo.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTTaskInfo(DTApplication dTApplication, Double d, String str, String str2, int i, int i2) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X0V.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A04 = str;
        this.A00 = i2;
        if ((i & 4) != 0) {
            this.A01 = dTApplication;
        }
        if ((i & 8) != 0) {
            this.A02 = d;
        }
        if ((i & 16) != 0) {
            this.A03 = str2;
        }
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.A04.hashCode() * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTTaskInfo(taskId=");
        sb.append(this.A04);
        sb.append(", status=");
        sb.append(this.A00);
        sb.append(", application=");
        sb.append(this.A01);
        sb.append(", progressValue=");
        sb.append(this.A02);
        sb.append(", partnerMetadata=");
        return AbstractC25236BEt.A0Y(this.A03, sb);
    }
}
