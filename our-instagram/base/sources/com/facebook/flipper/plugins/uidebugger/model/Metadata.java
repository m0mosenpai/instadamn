package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C16910sj;
import X.C3R9;
import X.C3RD;
import X.C3RL;
import X.X0D;
import X.X6R;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

@Serializable
/* loaded from: classes11.dex */
public final class Metadata {
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;
    public final Set A07;
    public final boolean A08;
    public static final Companion Companion = new Object();
    public static final C3R9[] A09 = {null, null, null, null, null, new X6R((C3R9) InspectableValue.A00.getValue()), new C3RL(C3RD.A01, JsonPrimitiveSerializer.A01), null, null};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0D.A00;
        }
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Metadata(Integer num, Integer num2, String str, String str2, String str3, Map map, Set set, int i, int i2, boolean z) {
        if (415 != (i & 415)) {
            AbstractC68612VXn.A00(X0D.A01, i, 415);
            throw C00O.createAndThrow();
        }
        this.A00 = i2;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A08 = z;
        if ((i & 32) == 0) {
            this.A07 = C16910sj.A00;
        } else {
            this.A07 = set;
        }
        if ((i & 64) == 0) {
            this.A06 = null;
        } else {
            this.A06 = map;
        }
        this.A02 = num;
        this.A01 = num2;
    }
}
