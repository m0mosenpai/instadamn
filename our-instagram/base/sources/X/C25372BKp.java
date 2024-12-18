package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This class is deprecated for reels ads use case, as it will be migrated to the new timeline framework and subject to clean up. We will later repurpose this to be solely used for overlay ads. See details here: https://fburl.com/gdoc/8ui5fuai")
/* renamed from: X.BKp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25372BKp implements InterfaceC43071ya {
    public boolean A00;
    public C120985dq A01;
    public final UserSession A02;
    public final C37556GgC A03;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        EnumC40111tc enumC40111tc;
        String str;
        String name;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C120985dq c120985dq = (C120985dq) c59062n7.A03;
        if (c120985dq.CdW()) {
            C0f5 AEp = C18950wb.A01.AEp("ClipsCTADwellViewpointAction", 630204974);
            AEp.ABW("ItemType", c120985dq.A01.name());
            EnumC40111tc enumC40111tc2 = c120985dq.A0J;
            String str2 = "";
            if (enumC40111tc2 == null || (str = enumC40111tc2.name()) == null) {
                str = "";
            }
            AEp.ABW("MediaType", str);
            AdFormatType adFormatType = c120985dq.A0E;
            if (adFormatType != null && (name = adFormatType.name()) != null) {
                str2 = name;
            }
            AEp.ABW("FormatType", str2);
            AEp.report();
            return;
        }
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                return;
            }
            C75113Zb c75113Zb = ((C37644Ghd) c59062n7.A04).A0E;
            if (c75113Zb != null && c75113Zb.A1l == A1R) {
                return;
            }
            if (this.A00) {
                if (c75113Zb == null) {
                    return;
                }
                C120985dq c120985dq2 = this.A01;
                if (c120985dq2 != null && c120985dq2.CdW() && (enumC40111tc = c120985dq2.A0J) != EnumC40111tc.A0Q && enumC40111tc != EnumC40111tc.A0V && !c120985dq2.A0I()) {
                    if (C18U.A06(C06090Tz.A05, this.A02, 36315748080881170L)) {
                        c75113Zb.A0m(A1R, A1R);
                    }
                }
                c75113Zb.A0m(false, A1R);
                c75113Zb.A2O = false;
                c75113Zb.A2H = false;
                c75113Zb.A1K = null;
                AbstractC115715Lh.A00().A00(c75113Zb);
                return;
            }
            if (c75113Zb == null || !c75113Zb.A28) {
                return;
            }
            c75113Zb.A2H = A1R;
            return;
        }
        C37556GgC c37556GgC = this.A03;
        this.A01 = c37556GgC.A09(AbstractC25234BEr.A03(c37556GgC, A1R ? 1 : 0));
        Object obj = c59062n7.A04;
        C37644Ghd c37644Ghd = (C37644Ghd) obj;
        C75113Zb c75113Zb2 = c37644Ghd.A0E;
        C59942oc c59942oc = AbstractC25470BOj.A00;
        C14360o3.A06(obj);
        long A0F = c59942oc.A0F(c120985dq, c37644Ghd, this.A02);
        if (c75113Zb2 == null) {
            return;
        }
        AbstractC115715Lh.A00().A01(c75113Zb2, A0F);
    }

    public C25372BKp(UserSession userSession, C37556GgC c37556GgC) {
        AbstractC167017dG.A1P(userSession, c37556GgC);
        this.A02 = userSession;
        this.A03 = c37556GgC;
    }
}
