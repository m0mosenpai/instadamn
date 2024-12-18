package com.facebook.neko.directinstall.digitalturbine;

import X.AbstractC25236BEt;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.X0X;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class InstallationProgressData extends C0T6 {
    public static final Companion Companion = new Object();
    public final double A00;
    public final int A01;
    public final InstallationProgress A02;
    public final String A03;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0X.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InstallationProgressData) {
                InstallationProgressData installationProgressData = (InstallationProgressData) obj;
                if (!C14360o3.A0K(this.A02, installationProgressData.A02) || !C14360o3.A0K(this.A03, installationProgressData.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A02.hashCode() * 31) + this.A03.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ InstallationProgressData(InstallationProgress installationProgress, String str, double d, int i, int i2) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X0X.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A02 = installationProgress;
        this.A03 = str;
        if ((i & 4) == 0) {
            this.A00 = installationProgress.A00.A00;
        } else {
            this.A00 = d;
        }
        if ((i & 8) == 0) {
            this.A01 = installationProgress.A00.A01;
        } else {
            this.A01 = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallationProgressData(data=");
        sb.append(this.A02);
        sb.append(", taskId=");
        return AbstractC25236BEt.A0Y(this.A03, sb);
    }
}
