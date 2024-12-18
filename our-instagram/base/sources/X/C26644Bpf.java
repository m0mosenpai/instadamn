package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Bpf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26644Bpf extends AbstractC77583di {
    public static final C51532Yb A09 = AbstractC25230BEn.A0i(C28987Cqc.A00, 5);
    public final int A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final User A03;
    public final String A04;
    public final InterfaceC16620sF A05;
    public final InterfaceC16620sF A06;
    public final InterfaceC16620sF A07;
    public final InterfaceC16620sF A08;

    public C26644Bpf(InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, String str, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16620sF interfaceC16620sF3, InterfaceC16620sF interfaceC16620sF4, int i) {
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A0k(3, user, interfaceC16620sF, interfaceC16620sF2, interfaceC16620sF3);
        AbstractC167007dF.A1J(interfaceC16620sF4, 8, interfaceC11380iw);
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = user;
        this.A04 = str;
        this.A06 = interfaceC16620sF;
        this.A07 = interfaceC16620sF2;
        this.A08 = interfaceC16620sF3;
        this.A05 = interfaceC16620sF4;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        C29042CrV c29042CrV = new C29042CrV(this.A02, this.A03, this.A04);
        C2YP A0c = AbstractC25229BEm.A0c(c77993eR, A09, DCJ.A00, new DRQ(this, 30));
        C75933ay c75933ay = C51722Yv.A02;
        return AbstractC25225BEi.A0g(AbstractC25225BEi.A0h(null, new C77863eE(C05F.A00, new DRQ(this, 31), null)).A00(null), c29042CrV, A0c);
    }
}
