package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.C71700Wz9;
import X.C71729Wzu;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class Coordinate3D {
    public static final Companion Companion = new Object();
    public final Number A00;
    public final Number A01;
    public final Number A02;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71729Wzu.A00;
        }
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Coordinate3D(Number number, @Serializable(with = C71700Wz9.class) Number number2, @Serializable(with = C71700Wz9.class) Number number3, @Serializable(with = C71700Wz9.class) int i) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71729Wzu.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A00 = number;
        this.A01 = number2;
        this.A02 = number3;
    }
}
