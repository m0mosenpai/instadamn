package com.facebook.neko.directinstall.digitalturbine;

import X.AbstractC167017dG;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.X0W;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class InstallationProgress extends C0T6 {
    public static final Companion Companion = new Object();
    public final AIDLInstallationProgress A00;
    public final DTApplication A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0W.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InstallationProgress) {
                InstallationProgress installationProgress = (InstallationProgress) obj;
                if (!C14360o3.A0K(this.A00, installationProgress.A00) || !C14360o3.A0K(this.A01, installationProgress.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ InstallationProgress(AIDLInstallationProgress aIDLInstallationProgress, DTApplication dTApplication, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X0W.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = aIDLInstallationProgress;
        this.A01 = dTApplication;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallationProgress(progress=");
        sb.append(this.A00);
        sb.append(", application=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }
}
