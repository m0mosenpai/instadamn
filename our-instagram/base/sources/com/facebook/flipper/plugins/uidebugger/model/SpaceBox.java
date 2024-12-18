package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.X0J;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class SpaceBox {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0J.A00;
        }
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SpaceBox(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            AbstractC68612VXn.A00(X0J.A01, i, 15);
            throw C00O.createAndThrow();
        }
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A01 = i5;
    }
}
