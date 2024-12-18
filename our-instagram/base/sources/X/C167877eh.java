package X;

import com.facebook.litho.ComponentTree;

/* renamed from: X.7eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167877eh extends AbstractC77583di {
    public final C84793qT A00;
    public final AbstractC50812Vc A01;
    public final C51722Yv A02;

    public C167877eh(AbstractC50812Vc abstractC50812Vc, C51722Yv c51722Yv, C84793qT c84793qT) {
        C14360o3.A0B(c84793qT, 2);
        this.A01 = abstractC50812Vc;
        this.A00 = c84793qT;
        this.A02 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c77993eR, new C9EX(c77993eR, 14));
        final ComponentTree componentTree = (ComponentTree) A00.A03;
        componentTree.A0M(this.A01);
        return new C78053eX(this.A02, new C2YT(componentTree) { // from class: X.7ei
            public final ComponentTree A00;

            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.2Vj] */
            @Override // X.C2YT
            public final C2YU Cgz(C2YR c2yr, long j) {
                C14360o3.A0B(c2yr, 0);
                ?? obj = new Object();
                ComponentTree.A06(null, this.A00, obj, null, null, AbstractC78603fS.A01(j), AbstractC78603fS.A00(j), 2, false, false);
                return new C2YU(null, Math.max(C78613fT.A03(j), obj.A01), Math.max(C78613fT.A02(j), obj.A00));
            }

            @Override // X.C2VB
            public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
                return CCS.A00(this, (C2YT) obj);
            }

            {
                this.A00 = componentTree;
            }
        }, new C2YP(new C51532Yb(C77603dk.A00, C167907ek.A00, 3, true), C167897ej.A00, new C207179Ew(38, A00, this), c77993eR.A01()));
    }
}
