package com.facebook.neko.directinstall.digitalturbine;

import X.AbstractC25236BEt;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.X0P;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DTGenericError extends C0T6 {
    public static final Companion Companion = new Object();
    public final int A00;
    public final String A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0P.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DTGenericError) {
                DTGenericError dTGenericError = (DTGenericError) obj;
                if (this.A00 != dTGenericError.A00 || !C14360o3.A0K(this.A01, dTGenericError.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTGenericError(String str, int i, int i2) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X0P.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = i2;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTGenericError(code=");
        sb.append(this.A00);
        sb.append(", message=");
        return AbstractC25236BEt.A0Y(this.A01, sb);
    }
}
