package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wed, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70657Wed implements XCQ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70657Wed(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.XCQ
    public final void Dwe() {
        switch (this.A00) {
            case 0:
                ((C68952Veq) this.A01).A01.Dh1(V20.A00);
                return;
            case 1:
                VG4 vg4 = VG4.A0k;
                V0Y v0y = (V0Y) this.A02;
                W8S.A00(vg4, V0Y.A01(v0y), "promote_no_permissions");
                C9GR.A04(v0y.getActivity());
                return;
            default:
                ((XCQ) this.A02).Dwe();
                return;
        }
    }

    @Override // X.XCQ
    public final void E65(String str) {
        C68952Veq c68952Veq;
        AbstractC68953Ver abstractC68953Ver;
        switch (this.A00) {
            case 0:
                UserSession userSession = ((C69285Vkt) this.A02).A02;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36317998641846029L) && !C18U.A06(c06090Tz, userSession, 36317998641977102L)) {
                    c68952Veq = (C68952Veq) this.A01;
                    abstractC68953Ver = new AbstractC68953Ver(C05F.A00, str);
                } else {
                    c68952Veq = (C68952Veq) this.A01;
                    abstractC68953Ver = new AbstractC68953Ver(C05F.A00, "");
                }
                String str2 = abstractC68953Ver.A01;
                if (str2 != null) {
                    C69285Vkt c69285Vkt = c68952Veq.A00;
                    C69094Vhk c69094Vhk = c69285Vkt.A01;
                    VRO.A00(c69094Vhk, c69094Vhk.A00, "promote_client_token_stored");
                    ((C68725Vb4) c69285Vkt.A03.getValue()).A00 = str2;
                }
                c68952Veq.A01.Dh1(abstractC68953Ver);
                return;
            case 1:
                V0Y v0y = (V0Y) this.A02;
                C70399WUb.A00(V0Y.A01(v0y)).A0T("promote_no_permissions", VG4.A0k.toString());
                VRN.A00((BaseFragmentActivity) this.A01, V0Y.A01(v0y), "promote_no_permissions");
                return;
            default:
                ((C68725Vb4) this.A01).A00 = str;
                ((XCQ) this.A02).E65(str);
                return;
        }
    }
}
