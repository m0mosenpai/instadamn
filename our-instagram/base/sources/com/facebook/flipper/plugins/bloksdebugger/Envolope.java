package com.facebook.flipper.plugins.bloksdebugger;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C73833Sq;
import X.X1G;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Serializable
/* loaded from: classes11.dex */
public final class Envolope {
    public static final SerialDescriptor A03;
    public final long A00;
    public final Event A01;
    public static final Companion Companion = new Object();
    public static final C3R9[] A02 = {null, (C3R9) Event.A00.getValue()};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer(C3R9 c3r9) {
            C14360o3.A0B(c3r9, 0);
            return new X1G(c3r9);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.flipper.plugins.bloksdebugger.Envolope$Companion, java.lang.Object] */
    static {
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.bloksdebugger.Envolope", null, 2);
        c73833Sq.A01("t", false);
        c73833Sq.A01("d", false);
        A03 = c73833Sq;
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Envolope(Event event, int i, long j) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(A03, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = j;
        this.A01 = event;
    }
}
