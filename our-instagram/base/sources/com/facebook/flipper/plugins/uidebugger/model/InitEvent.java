package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.C3SG;
import X.C71730Wzv;
import X.C71733Wzy;
import X.C71734Wzz;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class InitEvent {
    public final int A00;
    public final List A01;
    public final List A02;
    public static final Companion Companion = new Object();
    public static final C3R9[] A03 = {null, new C3SG(C71733Wzy.A00), new C3SG(C71730Wzv.A00)};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71734Wzz.A00;
        }
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ InitEvent(List list, List list2, int i, int i2) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71734Wzz.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A00 = i2;
        this.A02 = list;
        this.A01 = list2;
    }
}
