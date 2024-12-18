package com.facebook.neko.directinstall.digitalturbine;

import X.AbstractC25236BEt;
import X.AbstractC28006CWd;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C3R9;
import X.X0L;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class AIDLInstallationProgress extends C0T6 {
    public static final Companion Companion = new Object();
    public final double A00;
    public final int A01;
    public final int A02;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0L.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AIDLInstallationProgress) {
                AIDLInstallationProgress aIDLInstallationProgress = (AIDLInstallationProgress) obj;
                if (Double.compare(this.A00, aIDLInstallationProgress.A00) != 0 || this.A01 != aIDLInstallationProgress.A01 || this.A02 != aIDLInstallationProgress.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC28006CWd.A00(this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AIDLInstallationProgress(double d, int i, int i2, int i3) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X0L.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = d;
        this.A01 = i2;
        if ((i & 4) != 0) {
            this.A02 = i3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AIDLInstallationProgress(value=");
        sb.append(this.A00);
        sb.append(", action=");
        sb.append(this.A01);
        sb.append(", status=");
        return AbstractC25236BEt.A0Z(sb, this.A02);
    }
}
