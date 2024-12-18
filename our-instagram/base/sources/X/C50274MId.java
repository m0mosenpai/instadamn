package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.MId, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50274MId extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C148286ly A00;
    public final /* synthetic */ AnonymousClass442 A01;
    public final /* synthetic */ JTa A02;
    public final /* synthetic */ C7TI A03;
    public final /* synthetic */ C47711L4s A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50274MId(C148286ly c148286ly, AnonymousClass442 anonymousClass442, JTa jTa, C7TI c7ti, C47711L4s c47711L4s, DirectThreadKey directThreadKey, boolean z, boolean z2) {
        super(1);
        this.A02 = jTa;
        this.A05 = directThreadKey;
        this.A00 = c148286ly;
        this.A03 = c7ti;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = anonymousClass442;
        this.A04 = c47711L4s;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer num;
        C126475ni c126475ni;
        C7Q4 c7q4 = (C7Q4) obj;
        JTa jTa = this.A02;
        DirectThreadKey directThreadKey = this.A05;
        C148286ly c148286ly = this.A00;
        C7TI c7ti = this.A03;
        UserSession userSession = c7ti.A01;
        Long A01 = LCT.A01(userSession, directThreadKey);
        long A05 = AbstractC31177DnL.A05();
        boolean z = this.A07;
        AnonymousClass442 anonymousClass442 = this.A01;
        AbstractC439521d abstractC439521d = c7ti.A00.A01;
        Integer num2 = null;
        if ((abstractC439521d instanceof C126475ni) && (c126475ni = (C126475ni) abstractC439521d) != null) {
            num2 = c126475ni.A00.A00;
        }
        if (num2 == C05F.A0C) {
            num = 2;
        } else {
            num = null;
        }
        C33311ht c33311ht = new C33311ht(userSession, c148286ly, anonymousClass442, jTa, c7q4, directThreadKey, num, A01, A05, z);
        C47711L4s c47711L4s = this.A04;
        UserSession userSession2 = c47711L4s.A00;
        AbstractC31173DnH.A1U(userSession2, c33311ht);
        C7TG c7tg = c47711L4s.A02;
        String str = c47711L4s.A05;
        String A06 = c33311ht.A06();
        DirectThreadKey directThreadKey2 = c47711L4s.A03;
        C7TG.A0B(c7tg, str, A06, directThreadKey2.A00, 14, c47711L4s.A07, c47711L4s.A06);
        AbstractC147806l5.A00(userSession2).A0H(C2EY.A0O, c47711L4s.A04, directThreadKey2.A00, AbstractC167007dF.A1W(c47711L4s.A01));
        return C0eB.A00;
    }
}
