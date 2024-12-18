package com.facebook.neko.directinstall.digitalturbine;

import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.X0S;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DTInstallationErrorResponse extends C0T6 {
    public static final Companion Companion = new Object();
    public final DTInstallationError A00;
    public final String A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0S.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DTInstallationErrorResponse) {
                DTInstallationErrorResponse dTInstallationErrorResponse = (DTInstallationErrorResponse) obj;
                if (!C14360o3.A0K(this.A00, dTInstallationErrorResponse.A00) || !C14360o3.A0K(this.A01, dTInstallationErrorResponse.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTInstallationErrorResponse(DTInstallationError dTInstallationError, String str, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X0S.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = dTInstallationError;
        if ((i & 2) != 0) {
            this.A01 = str;
        }
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + AbstractC167017dG.A0O(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTInstallationErrorResponse(data=");
        sb.append(this.A00);
        sb.append(", taskId=");
        return AbstractC25236BEt.A0Y(this.A01, sb);
    }
}
