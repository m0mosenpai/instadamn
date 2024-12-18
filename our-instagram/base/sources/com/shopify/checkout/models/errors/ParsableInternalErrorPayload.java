package com.shopify.checkout.models.errors;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.InterfaceC71868X8b;
import X.X1A;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class ParsableInternalErrorPayload implements InterfaceC71868X8b {
    public final ErrorGroup A00;
    public final ParsableInternalErrorCode A01;
    public final String A02;
    public final String A03;
    public static final Companion Companion = new Object();
    public static final C3R9[] A04 = {(C3R9) ParsableInternalErrorCode.A00.getValue(), null, null, null};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X1A.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ParsableInternalErrorPayload) {
                ParsableInternalErrorPayload parsableInternalErrorPayload = (ParsableInternalErrorPayload) obj;
                if (this.A01 != parsableInternalErrorPayload.A01 || !C14360o3.A0K(this.A03, parsableInternalErrorPayload.A03) || !C14360o3.A0K(this.A02, parsableInternalErrorPayload.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ParsableInternalErrorPayload(ErrorGroup errorGroup, ParsableInternalErrorCode parsableInternalErrorCode, String str, String str2, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X1A.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A01 = parsableInternalErrorCode;
        if ((i & 2) == 0) {
            this.A03 = null;
        } else {
            this.A03 = str;
        }
        if ((i & 4) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str2;
        }
        if ((i & 8) == 0) {
            this.A00 = ErrorGroup.A06;
        } else {
            this.A00 = errorGroup;
        }
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.A01.hashCode() * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            Group: ");
        sb.append(this.A00);
        sb.append("\n            Reason: ");
        sb.append(this.A02);
        sb.append("\n            Code: ");
        sb.append(this.A01);
        sb.append("\n            Underlying Error: ");
        sb.append(this.A03);
        return AbstractC166997dE.A0x("\n        ", sb);
    }

    public ParsableInternalErrorPayload(ParsableInternalErrorCode parsableInternalErrorCode, String str) {
        this.A01 = parsableInternalErrorCode;
        this.A03 = str;
        this.A02 = "meta_parsable_internal_error";
        this.A00 = ErrorGroup.A06;
    }
}
