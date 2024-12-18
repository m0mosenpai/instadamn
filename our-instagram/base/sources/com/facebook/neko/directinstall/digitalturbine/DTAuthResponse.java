package com.facebook.neko.directinstall.digitalturbine;

import X.AbstractC167017dG;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.X0O;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DTAuthResponse extends C0T6 {
    public static final Companion Companion = new Object();
    public final DTSession A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0O.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DTAuthResponse) && C14360o3.A0K(this.A00, ((DTAuthResponse) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTAuthResponse(DTSession dTSession, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X0O.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = dTSession;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTAuthResponse(data=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
