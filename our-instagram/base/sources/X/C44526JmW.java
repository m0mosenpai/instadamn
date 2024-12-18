package X;

import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JmW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44526JmW extends AbstractC52922bZ {
    public InterfaceC83713oG A00;
    public final UserSession A01;
    public final C47302KvD A02;
    public final C47381KwW A03;
    public final C2DS A04;
    public final InterfaceC06180Ui A05;
    public final C05A A06;
    public final InterfaceC15070pN A07;
    public final C0UO A08;
    public final C46859Kns A09;

    public final void A00(boolean z) {
        InterfaceC83703oF A02;
        C83693oE A00;
        String str;
        String str2;
        InterfaceC83703oF A022;
        C83693oE A002;
        String str3;
        C05A c05a = this.A06;
        if (((C51758Mth) c05a.getValue()).A00 != C05F.A0C) {
            InterfaceC19630xq interfaceC19630xq = this.A03.A00.A01;
            if (!interfaceC19630xq.getBoolean("direct_media_gallery_hd_media_nux", false)) {
                UserSession userSession = this.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36330063205778073L)) {
                    MCO.A04(this, AbstractC141776au.A00(this), 25);
                    InterfaceC83713oG interfaceC83713oG = this.A00;
                    if (interfaceC83713oG != null && (A022 = AbstractC140946Yw.A02(interfaceC83713oG)) != null && (A002 = AbstractC140956Yx.A00(A022)) != null && (str3 = A002.A00) != null && C18U.A06(c06090Tz, userSession, 36330063205712536L)) {
                        C18920wW c18920wW = this.A02.A00;
                        C14360o3.A0B(c18920wW, 0);
                        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c18920wW, "direct_media_hd_toggle_nux_impression"), 144);
                        if (AbstractC25226BEj.A1Z(A0A)) {
                            A0A.A0R("open_thread_id", str3);
                            A0A.Cht();
                        }
                    }
                    AbstractC31177DnL.A1N(interfaceC19630xq, "direct_media_gallery_hd_media_nux", true);
                    return;
                }
            }
            Integer num = (Integer) ((C51758Mth) c05a.getValue()).A00;
            C14360o3.A0B(num, 1);
            c05a.F8m(new C51758Mth(z, num, 22));
            UserSession userSession2 = this.A01;
            C06090Tz c06090Tz2 = C06090Tz.A05;
            if (C18U.A06(c06090Tz2, userSession2, 36330063205646999L)) {
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E77("direct_media_gallery_hd_media_checked", z);
                ARD.apply();
            }
            InterfaceC83713oG interfaceC83713oG2 = this.A00;
            if (interfaceC83713oG2 == null || (A02 = AbstractC140946Yw.A02(interfaceC83713oG2)) == null || (A00 = AbstractC140956Yx.A00(A02)) == null || (str = A00.A00) == null || !C18U.A06(c06090Tz2, userSession2, 36330063205712536L)) {
                return;
            }
            C47302KvD c47302KvD = this.A02;
            boolean z2 = ((C51758Mth) c05a.getValue()).A01;
            C18920wW c18920wW2 = c47302KvD.A00;
            C14360o3.A0B(c18920wW2, 0);
            C25531Mh A0A2 = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c18920wW2, "direct_media_hd_toggle_action"), 143);
            if (!AbstractC25226BEj.A1Z(A0A2)) {
                return;
            }
            A0A2.A0R("open_thread_id", str);
            if (z2) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            A0A2.A0j(str2);
            A0A2.Cht();
        }
    }

    public final boolean A01() {
        C05A c05a = this.A06;
        if (((C51758Mth) c05a.getValue()).A01 && AbstractC167007dF.A1X(((C51758Mth) c05a.getValue()).A00, C05F.A00)) {
            return true;
        }
        return false;
    }

    public C44526JmW(UserSession userSession, C47302KvD c47302KvD, C46859Kns c46859Kns, C47381KwW c47381KwW, C2DS c2ds) {
        boolean A1V = AbstractC167007dF.A1V(c46859Kns);
        AbstractC167007dF.A1F(c2ds, 3, c47381KwW);
        this.A01 = userSession;
        this.A09 = c46859Kns;
        this.A04 = c2ds;
        this.A03 = c47381KwW;
        this.A02 = c47302KvD;
        C008002u A1H = AbstractC25225BEi.A1H(new C51758Mth(false, (Integer) null, 3, (DefaultConstructorMarker) null, 22));
        this.A06 = A1H;
        this.A08 = A1H;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, A1V ? 1 : 0, 0);
        this.A05 = A00;
        this.A07 = new C06160Ug(null, A00);
    }
}
