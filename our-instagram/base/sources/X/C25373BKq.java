package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This class is deprecated for reels ads use case, as it will be migrated to the new timeline framework and subject to clean up.See details here: https://fburl.com/gdoc/8ui5fuai")
/* renamed from: X.BKq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25373BKq implements InterfaceC43071ya {
    public boolean A00;
    public final UserSession A01;
    public final C37556GgC A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C4o9 c4o9;
        String str;
        String name;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        Object obj = c59062n7.A03;
        C120985dq c120985dq = (C120985dq) obj;
        if (c120985dq.CdW()) {
            C0f5 AEp = C18950wb.A01.AEp("ClipsMidSceneViewpointAction", 630204974);
            AEp.ABW("ItemType", c120985dq.A01.name());
            EnumC40111tc enumC40111tc = c120985dq.A0J;
            String str2 = "";
            if (enumC40111tc == null || (str = enumC40111tc.name()) == null) {
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
        if (!c120985dq.CdW()) {
            obj = null;
        }
        C120985dq c120985dq2 = (C120985dq) obj;
        if (c120985dq2 == null || (c4o9 = c120985dq2.A06().A0N) == null) {
            return;
        }
        Object obj2 = c59062n7.A04;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        C75113Zb c75113Zb = c37644Ghd.A0E;
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                return;
            }
            if (c75113Zb != null && c75113Zb.A1l == A1R) {
                return;
            }
            if (this.A00) {
                if (c75113Zb == null) {
                    return;
                }
                c75113Zb.A0j(false);
                c75113Zb.A2I = false;
                c75113Zb.A1K = null;
                ((BP3) BP3.A03.getValue()).A01(c75113Zb);
                return;
            }
            if (c75113Zb == null || !c75113Zb.A0n()) {
                return;
            }
            c75113Zb.A2I = A1R;
            return;
        }
        long A06 = AbstractC25227BEk.A06(c4o9.AwU(), 0);
        C59942oc c59942oc = AbstractC25470BOj.A00;
        C14360o3.A06(obj2);
        UserSession userSession = this.A01;
        long A0F = A06 + c59942oc.A0F(c120985dq, c37644Ghd, userSession);
        if (c75113Zb == null) {
            return;
        }
        BP3 bp3 = (BP3) BP3.A03.getValue();
        C14360o3.A06(obj);
        bp3.A00(c120985dq, userSession, c75113Zb, A0F);
    }

    public C25373BKq(UserSession userSession, C37556GgC c37556GgC) {
        AbstractC167017dG.A1P(userSession, c37556GgC);
        this.A01 = userSession;
        this.A02 = c37556GgC;
    }
}
