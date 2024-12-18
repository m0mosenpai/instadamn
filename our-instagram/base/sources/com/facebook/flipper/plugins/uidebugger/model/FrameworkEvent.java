package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.C3RD;
import X.C3RL;
import X.C71732Wzx;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class FrameworkEvent {
    public static final C3R9[] A07;
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final long A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71732Wzx.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.flipper.plugins.uidebugger.model.FrameworkEvent$Companion] */
    static {
        C3RD c3rd = C3RD.A01;
        A07 = new C3R9[]{null, null, null, null, null, null, new C3RL(c3rd, c3rd)};
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FrameworkEvent(Long l, String str, String str2, Map map, int i, int i2, int i3, long j) {
        if (127 != (i & StringTreeSet.MAX_SYMBOL_COUNT)) {
            AbstractC68612VXn.A00(C71732Wzx.A01, i, StringTreeSet.MAX_SYMBOL_COUNT);
            throw C00O.createAndThrow();
        }
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = str;
        this.A02 = j;
        this.A03 = l;
        this.A04 = str2;
        this.A06 = map;
    }
}
