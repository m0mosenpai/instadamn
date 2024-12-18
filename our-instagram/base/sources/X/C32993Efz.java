package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Efz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32993Efz extends Eg1 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AbstractC18680vv A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC02900Bo A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32993Efz(android.net.Uri uri, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, AbstractC18680vv abstractC18680vv, UserSession userSession, G9Q g9q, InterfaceC02900Bo interfaceC02900Bo, EnumC31713DwI enumC31713DwI, Long l, String str, String str2, String str3, String str4, String str5) {
        super(uri, fragmentActivity, interfaceC11380iw, c07270a1, g9q, enumC31713DwI, str, str2);
        this.A00 = fragmentActivity;
        this.A06 = str3;
        this.A01 = abstractC18680vv;
        this.A05 = str4;
        this.A04 = l;
        this.A07 = str5;
        this.A03 = interfaceC02900Bo;
        this.A02 = userSession;
    }

    @Override // X.Eg1, X.C32547EUx
    public final void A04(EfU efU) {
        long j;
        int A03 = C0f9.A03(1940093362);
        C14360o3.A0B(efU, 0);
        super.A04(efU);
        String str = this.A06;
        if (str != null) {
            AbstractC18680vv abstractC18680vv = this.A01;
            synchronized (C31514Dsy.class) {
                j = C31514Dsy.A00;
            }
            String str2 = this.A05;
            Long l = this.A04;
            C31514Dsy.A03(abstractC18680vv, l, l, "intra_app", str2, "horizontal_switch", str, "logged_out", this.A07, null, j, false, true, true);
        }
        C0f9.A0A(668462601, A03);
    }

    @Override // X.Eg1, X.C32547EUx, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1191968056);
        InterfaceC02900Bo interfaceC02900Bo = this.A03;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        AbstractC35178FfV.A00().A01(fragmentActivity, interfaceC02900Bo.AEY(fragmentActivity, null, userSession, null, false).A00, userSession, false);
        C0f9.A0A(163469280, A03);
    }

    @Override // X.Eg1, X.C32547EUx, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C0f9.A0A(-537481837, C32547EUx.A00(this, obj, 322603563));
    }
}
