package com.facebook.flipper.plugins.bloksdebugger;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C192398fh;
import X.C3R9;
import X.C3SG;
import X.C71699Wz8;
import X.C71719Wzk;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class StateUpdateV2 extends Event {
    public final Object A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public static final Companion Companion = new Object();
    public static final C3R9[] A06 = {null, null, null, null, null, new C3SG(C192398fh.A00)};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71719Wzk.A00;
        }
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ StateUpdateV2(Object obj, String str, String str2, String str3, @Serializable(with = C71699Wz8.class) String str4, List list, int i) {
        if (63 != (i & 63)) {
            AbstractC68612VXn.A00(C71719Wzk.A01, i, 63);
            throw C00O.createAndThrow();
        }
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = obj;
        this.A01 = str4;
        this.A05 = list;
    }
}
