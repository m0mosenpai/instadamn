package com.shopify.checkout.models;

import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.X17;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class ProgressButton {
    public static final Companion Companion = new Object();
    public final ProgressButtonStage A00;
    public final ProgressButtonState A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X17.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProgressButton) {
                ProgressButton progressButton = (ProgressButton) obj;
                if (this.A01 != progressButton.A01 || this.A00 != progressButton.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public /* synthetic */ ProgressButton(ProgressButtonStage progressButtonStage, ProgressButtonState progressButtonState, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X17.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A01 = progressButtonState;
        this.A00 = progressButtonStage;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProgressButton(state=");
        sb.append(this.A01);
        sb.append(", stage=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
