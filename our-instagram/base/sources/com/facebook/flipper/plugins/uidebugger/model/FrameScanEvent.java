package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.C3SG;
import X.C71731Wzw;
import X.C71732Wzx;
import X.X0F;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class FrameScanEvent {
    public final long A00;
    public final Snapshot A01;
    public final List A02;
    public final List A03;
    public static final Companion Companion = new Object();
    public static final C3R9[] A04 = {null, new C3SG(X0F.A00), null, new C3SG(C71732Wzx.A00)};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71731Wzw.A00;
        }
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FrameScanEvent(Snapshot snapshot, List list, List list2, int i, long j) {
        if (15 != (i & 15)) {
            AbstractC68612VXn.A00(C71731Wzw.A01, i, 15);
            throw C00O.createAndThrow();
        }
        this.A00 = j;
        this.A03 = list;
        this.A01 = snapshot;
        this.A02 = list2;
    }
}
