package com.facebook.neko.directinstall.digitalturbine;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.AnonymousClass001;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.X0M;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DTApplication extends C0T6 {
    public static final Companion Companion = new Object();
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0M.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DTApplication) && C14360o3.A0K(this.A00, ((DTApplication) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("DTApplication(packageName=", this.A00, ')');
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTApplication(String str, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X0M.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = str;
    }
}
