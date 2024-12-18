package X;

import java.util.List;

/* renamed from: X.0Ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06160Ug implements InterfaceC15070pN, InterfaceC14870p1, InterfaceC16480rt {
    public final AnonymousClass195 A00;
    public final /* synthetic */ InterfaceC15070pN A01;

    @Override // X.InterfaceC15070pN
    public final List Bn0() {
        return this.A01.Bn0();
    }

    @Override // X.InterfaceC15070pN, X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A01.collect(interfaceC19960yQ, interfaceC23621Ds);
    }

    @Override // X.InterfaceC14870p1
    public final InterfaceC19390xP AWl(Integer num, C12W c12w, int i) {
        if ((i == 0 || i == -3) && num == C05F.A00) {
            return this;
        }
        return new AnonymousClass055(num, c12w, this, i);
    }

    public C06160Ug(AnonymousClass195 anonymousClass195, InterfaceC15070pN interfaceC15070pN) {
        this.A00 = anonymousClass195;
        this.A01 = interfaceC15070pN;
    }
}
