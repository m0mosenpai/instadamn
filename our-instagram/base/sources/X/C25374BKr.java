package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This class is deprecated for reels ads use case, as it will be migrated to the new timeline framework and subject to clean up. We will later repurpose this to be solely used for overlay ads. See details here: https://fburl.com/gdoc/8ui5fuai")
/* renamed from: X.BKr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25374BKr implements InterfaceC43071ya {
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
            C0f5 AEp = C18950wb.A01.AEp("ClipsAdViewpointAction", 630204974);
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
        C59942oc c59942oc = AbstractC25470BOj.A00;
        Object obj = c59062n7.A04;
        C14360o3.A06(obj);
        C37644Ghd c37644Ghd = (C37644Ghd) obj;
        UserSession userSession = this.A02;
        long A0E = c59942oc.A0E(c120985dq, c37644Ghd, userSession);
        boolean A1O = AbstractC167007dF.A1O((A0E > 0L ? 1 : (A0E == 0L ? 0 : -1)));
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                return;
            }
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null && c75113Zb.A1l == A1R) {
                return;
            }
            if (this.A00) {
                if (c75113Zb == null) {
                    return;
                }
                c75113Zb.A0Z(C05F.A00);
                if (!A1O) {
                    return;
                }
                C120985dq c120985dq2 = this.A01;
                if (c120985dq2 != null && c120985dq2.CdW() && (enumC40111tc = c120985dq2.A0J) != EnumC40111tc.A0Q && enumC40111tc != EnumC40111tc.A0V && !c120985dq2.A0I() && C18U.A06(C06090Tz.A05, userSession, 36315748080881170L)) {
                    c75113Zb.A0e(A1R);
                } else {
                    c75113Zb.A0e(false);
                    if (c75113Zb.A1k) {
                        c75113Zb.A1k = false;
                    }
                    c75113Zb.A2J = false;
                    c75113Zb.A1K = null;
                    AbstractC124495k7.A00(userSession).A00(c75113Zb);
                    return;
                }
            } else if (c75113Zb == null || !A1O || !c75113Zb.A2A) {
                return;
            }
            c75113Zb.A2J = A1R;
            return;
        }
        C37556GgC c37556GgC = this.A03;
        C120985dq A09 = c37556GgC.A09(c37556GgC.A03());
        this.A01 = A09;
        if (A09 != null && !A09.CdW()) {
            this.A01 = c37556GgC.A09(AbstractC25234BEr.A03(c37556GgC, A1R ? 1 : 0));
        }
        C75113Zb c75113Zb2 = c37644Ghd.A0E;
        if (c75113Zb2 == null || !A1O) {
            return;
        }
        AbstractC124495k7.A00(userSession).A01(c75113Zb2, A0E);
    }

    public C25374BKr(UserSession userSession, C37556GgC c37556GgC) {
        AbstractC167017dG.A1P(userSession, c37556GgC);
        this.A02 = userSession;
        this.A03 = c37556GgC;
    }
}
