package X;

import java.util.Map;

/* renamed from: X.BGn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25273BGn implements C59Z, InterfaceC1131259a {
    public final AnonymousClass583 A00;
    public final /* synthetic */ InterfaceC1131259a A01;

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A01.Awk();
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A01.B7e();
    }

    @Override // X.InterfaceC1131259a
    public final boolean CXp() {
        return this.A01.CXp();
    }

    @Override // X.C59Z
    public final /* synthetic */ InterfaceC119205ac Cgx(Map map, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            return new C25275BGp(i, i2, map);
        }
        AbstractC28290Cdc.A01(AnonymousClass001.A0n("Size(", " x ", AbstractC111324zv.A00(3346), i, i2));
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC1128957x
    public final int EL8(float f) {
        return this.A01.EL8(f);
    }

    @Override // X.C57y
    public final float EqG(long j) {
        return this.A01.EqG(j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqH(float f) {
        return this.A01.EqH(f);
    }

    @Override // X.InterfaceC1128957x
    public final float EqI(int i) {
        return this.A01.EqI(i);
    }

    @Override // X.InterfaceC1128957x
    public final long EqJ(long j) {
        return this.A01.EqJ(j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqS(long j) {
        return this.A01.EqS(j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqT(float f) {
        return this.A01.EqT(f);
    }

    @Override // X.InterfaceC1128957x
    public final long F7k(long j) {
        return this.A01.F7k(j);
    }

    @Override // X.C57y
    public final long F7l(float f) {
        return this.A01.F7l(f);
    }

    @Override // X.InterfaceC1128957x
    public final long F7m(float f) {
        return this.A01.F7m(f);
    }

    public C25273BGn(InterfaceC1131259a interfaceC1131259a, AnonymousClass583 anonymousClass583) {
        this.A00 = anonymousClass583;
        this.A01 = interfaceC1131259a;
    }

    public static C25273BGn A00(InterfaceC1131259a interfaceC1131259a) {
        return new C25273BGn(interfaceC1131259a, interfaceC1131259a.getLayoutDirection());
    }

    @Override // X.InterfaceC1131259a
    public final AnonymousClass583 getLayoutDirection() {
        return this.A00;
    }
}
