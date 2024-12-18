package X;

import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class NKB extends OX6 {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final AbstractC55082Oac A03;
    public final C19L A04;
    public final InterfaceC06180Ui A05;
    public final C05A A06;
    public final InterfaceC15070pN A07;
    public final C0UO A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NKB(UserSession userSession, AbstractC55082Oac abstractC55082Oac) {
        super(abstractC55082Oac);
        C19K A02 = AnonymousClass194.A02(new C12M().A04);
        AbstractC25233BEq.A0v(1, abstractC55082Oac, userSession, A02);
        this.A03 = abstractC55082Oac;
        this.A02 = userSession;
        this.A04 = A02;
        C008002u A1H = AbstractC25225BEi.A1H(new C51756Mtf((C51685MsG) null, (DefaultConstructorMarker) null, 1, 45));
        this.A06 = A1H;
        this.A08 = A1H;
        AnonymousClass057 A0t = MSY.A0t();
        this.A05 = A0t;
        this.A07 = A0t;
    }

    public final void A08(C51685MsG c51685MsG) {
        C51754Mtd A00;
        String str = c51685MsG.A04;
        if (c51685MsG.A02 == null && str != null) {
            c51685MsG.A02 = Integer.valueOf(AbstractC167017dG.A0K(AbstractC003100w.A0i(new C11L("[^0-9]").A00(str, ""))));
        }
        A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, c51685MsG, null, A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435457, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A07(A00);
    }
}
