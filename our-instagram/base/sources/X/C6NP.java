package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6NP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NP implements C59Z, C6NO {
    public final /* synthetic */ C6NM A00;
    public final /* synthetic */ C6NN A01;

    @Override // X.InterfaceC1131259a
    public final boolean CXp() {
        return this.A01.CXp();
    }

    @Override // X.C59Z
    public final InterfaceC119205ac Cgx(Map map, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        return this.A01.Cgx(map, interfaceC16660sJ, i, i2);
    }

    public C6NP(C6NM c6nm) {
        this.A00 = c6nm;
        this.A01 = c6nm.A08;
    }

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A01.A00;
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A01.A01;
    }

    @Override // X.InterfaceC1128957x
    public final int EL8(float f) {
        return AbstractC119105aS.A01(this.A01, f);
    }

    @Override // X.C6NO
    public final List Ep4(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C6NM c6nm = this.A00;
        AnonymousClass599 anonymousClass599 = (AnonymousClass599) c6nm.A0C.get(obj);
        if (anonymousClass599 != null) {
            return anonymousClass599.A0U.A0J.A0L();
        }
        C57S c57s = c6nm.A06;
        int i = c57s.A00;
        int i2 = c6nm.A01;
        if (i >= i2) {
            if (i == i2) {
                c57s.A09(obj);
            } else {
                c57s.A02[i2] = obj;
            }
            c6nm.A01++;
            HashMap hashMap = c6nm.A0B;
            if (!hashMap.containsKey(obj)) {
                c6nm.A0D.put(obj, c6nm.A04(obj, interfaceC16620sF));
                AnonymousClass599 anonymousClass5992 = c6nm.A09;
                if (anonymousClass5992.A0U.A06 == C05F.A0C) {
                    anonymousClass5992.A0X(true);
                } else {
                    anonymousClass5992.A0Z(true, true, true);
                }
            }
            AnonymousClass599 anonymousClass5993 = (AnonymousClass599) hashMap.get(obj);
            if (anonymousClass5993 != null) {
                List A0L = anonymousClass5993.A0U.A0J.A0L();
                int size = A0L.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((C113385Aa) A0L.get(i3)).A0S.A09 = true;
                }
                return A0L;
            }
            return C16930sl.A00;
        }
        throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
    }

    @Override // X.C57y
    public final float EqG(long j) {
        return AbstractC122655h0.A00(this.A01, j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqH(float f) {
        return f / this.A01.A00;
    }

    @Override // X.InterfaceC1128957x
    public final float EqI(int i) {
        return i / this.A01.A00;
    }

    @Override // X.InterfaceC1128957x
    public final long EqJ(long j) {
        return AbstractC119105aS.A03(this.A01, j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqS(long j) {
        return AbstractC119105aS.A00(this.A01, j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqT(float f) {
        return f * this.A01.A00;
    }

    @Override // X.InterfaceC1128957x
    public final long F7k(long j) {
        return AbstractC119105aS.A04(this.A01, j);
    }

    @Override // X.C57y
    public final long F7l(float f) {
        return AbstractC122655h0.A01(this.A01, f);
    }

    @Override // X.InterfaceC1128957x
    public final long F7m(float f) {
        C6NN c6nn = this.A01;
        return c6nn.F7l(c6nn.EqH(f));
    }

    @Override // X.InterfaceC1131259a
    public final AnonymousClass583 getLayoutDirection() {
        return this.A01.A02;
    }
}
