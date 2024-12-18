package com.facebook.neko.directinstall.digitalturbine;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.X0R;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DTInstallationError extends C0T6 {
    public static final Companion Companion = new Object();
    public final int A00;
    public final DTApplication A01;
    public final String A02;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0R.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DTInstallationError) {
                DTInstallationError dTInstallationError = (DTInstallationError) obj;
                if (this.A00 != dTInstallationError.A00 || !C14360o3.A0K(this.A02, dTInstallationError.A02) || !C14360o3.A0K(this.A01, dTInstallationError.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTInstallationError(DTApplication dTApplication, String str, int i, int i2) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X0R.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = i2;
        this.A02 = str;
        if ((i & 4) != 0) {
            this.A01 = dTApplication;
        }
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, this.A00 * 31) + AbstractC167017dG.A0M(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTInstallationError(code=");
        sb.append(this.A00);
        sb.append(", message=");
        sb.append(this.A02);
        sb.append(", application=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }
}
