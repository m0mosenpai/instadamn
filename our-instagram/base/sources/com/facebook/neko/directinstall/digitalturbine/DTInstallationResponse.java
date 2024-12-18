package com.facebook.neko.directinstall.digitalturbine;

import X.AbstractC167017dG;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.MSV;
import X.X0T;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DTInstallationResponse extends C0T6 {
    public static final Companion Companion = new Object();
    public final DTApplication A00;
    public final String A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0T.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DTInstallationResponse) {
                DTInstallationResponse dTInstallationResponse = (DTInstallationResponse) obj;
                if (!C14360o3.A0K(this.A01, dTInstallationResponse.A01) || !C14360o3.A0K(this.A00, dTInstallationResponse.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTInstallationResponse(DTApplication dTApplication, String str, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X0T.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        this.A00 = dTApplication;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTInstallationResponse(taskId=");
        sb.append(this.A01);
        sb.append(MSV.A00(287));
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
