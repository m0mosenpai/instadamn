package com.facebook.odin.signals.model;

import X.AbstractC06930Yk;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25233BEq;
import X.AbstractC25236BEt;
import X.AbstractC50523MSb;
import X.C0T6;
import X.C0YZ;
import X.C14360o3;
import X.C16920sk;
import X.C3R9;
import X.C3RD;
import X.C3RJ;
import X.C3RL;
import X.C3SG;
import X.C3TW;
import com.facebook.odin.model.OdinContext;
import java.util.Map;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class SignalResult extends C0T6 {
    public static final C3R9[] A09;
    public static final Companion Companion = new Object();
    public final long A00;
    public final OdinContext A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return SignalResult$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.odin.signals.model.SignalResult$Companion] */
    static {
        C3RD c3rd = C3RD.A01;
        A09 = new C3R9[]{null, null, new C3RL(c3rd, C3RJ.A00), new C3RL(c3rd, C3TW.A00), new C3RL(c3rd, c3rd), new C3RL(c3rd, new C3SG(c3rd)), null, null, new ContextualSerializer(new C0YZ(OdinContext.class), new C3R9[0])};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignalResult) {
                SignalResult signalResult = (SignalResult) obj;
                if (!C14360o3.A0K(this.A03, signalResult.A03) || !C14360o3.A0K(this.A04, signalResult.A04) || !C14360o3.A0K(this.A06, signalResult.A06) || !C14360o3.A0K(this.A05, signalResult.A05) || !C14360o3.A0K(this.A08, signalResult.A08) || !C14360o3.A0K(this.A07, signalResult.A07) || !C14360o3.A0K(this.A02, signalResult.A02) || this.A00 != signalResult.A00 || !C14360o3.A0K(this.A01, signalResult.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A01 = AbstractC25236BEt.A01(this.A00, (AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A06, ((this.A03.hashCode() * 31) + AbstractC167017dG.A0O(this.A04)) * 31)))) + AbstractC167017dG.A0O(this.A02)) * 31);
        OdinContext odinContext = this.A01;
        if (odinContext != null) {
            i = odinContext.hashCode();
        }
        return A01 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC50523MSb.A1N("(id:", this.A03, sb);
        Map map = this.A06;
        if (!map.isEmpty()) {
            sb.append(AbstractC167017dG.A0n(map, ",L: ", new StringBuilder()));
        }
        Map map2 = this.A05;
        if (!map2.isEmpty()) {
            sb.append(AbstractC167017dG.A0n(map2, ",F: ", new StringBuilder()));
        }
        Map map3 = this.A08;
        if (!map3.isEmpty()) {
            sb.append(AbstractC167017dG.A0n(map3, ",S: ", new StringBuilder()));
        }
        Map map4 = this.A07;
        if (!map4.isEmpty()) {
            sb.append(AbstractC167017dG.A0n(map4, ",SL: ", new StringBuilder()));
        }
        String A0x = AbstractC166997dE.A0x(")", sb);
        C14360o3.A07(A0x);
        return A0x;
    }

    public /* synthetic */ SignalResult(OdinContext odinContext, String str, String str2, String str3, Map map, Map map2, Map map3, Map map4, int i, long j) {
        this.A03 = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str2;
        }
        if ((i & 4) == 0) {
            this.A06 = AbstractC06930Yk.A0E();
        } else {
            this.A06 = map;
        }
        if ((i & 8) == 0) {
            this.A05 = AbstractC06930Yk.A0E();
        } else {
            this.A05 = map2;
        }
        if ((i & 16) == 0) {
            this.A08 = AbstractC06930Yk.A0E();
        } else {
            this.A08 = map3;
        }
        if ((i & 32) == 0) {
            this.A07 = AbstractC06930Yk.A0E();
        } else {
            this.A07 = map4;
        }
        if ((i & 64) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str3;
        }
        if ((i & 128) == 0) {
            this.A00 = 0L;
        } else {
            this.A00 = j;
        }
        if ((i & 256) == 0) {
            this.A01 = null;
        } else {
            this.A01 = odinContext;
        }
    }

    public SignalResult() {
        C16920sk A0E = AbstractC06930Yk.A0E();
        C16920sk A0E2 = AbstractC06930Yk.A0E();
        C16920sk A0E3 = AbstractC06930Yk.A0E();
        C16920sk A0E4 = AbstractC06930Yk.A0E();
        AbstractC25233BEq.A0x(3, A0E, A0E2, A0E3);
        C14360o3.A0B(A0E4, 6);
        this.A03 = "";
        this.A04 = null;
        this.A06 = A0E;
        this.A05 = A0E2;
        this.A08 = A0E3;
        this.A07 = A0E4;
        this.A02 = null;
        this.A00 = 0L;
        this.A01 = null;
    }
}
