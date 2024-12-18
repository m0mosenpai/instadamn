package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.AnonymousClass001;
import X.C00O;
import X.C3R9;
import X.C71725Wzq;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class Bounds {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71725Wzq.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Bounds) {
                Bounds bounds = (Bounds) obj;
                if (this.A02 != bounds.A02 || this.A03 != bounds.A03 || this.A01 != bounds.A01 || this.A00 != bounds.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A02 * 31) + this.A03) * 31) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0w("Bounds(x=", ", y=", ", width=", ", height=", ')', this.A02, this.A03, this.A01, this.A00);
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Bounds(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            AbstractC68612VXn.A00(C71725Wzq.A01, i, 15);
            throw C00O.createAndThrow();
        }
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = i5;
    }
}
