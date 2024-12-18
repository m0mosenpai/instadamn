package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Bc7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25852Bc7 extends AbstractC52922bZ {
    public IgSimpleImageView A00;
    public C62832tM A01;
    public final UserSession A02;
    public final C27831COu A03;
    public final String A04;
    public final InterfaceC09390do A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;

    public C25852Bc7(UserSession userSession, C27831COu c27831COu, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A02 = userSession;
        this.A04 = str;
        this.A03 = c27831COu;
        this.A08 = AbstractC25227BEk.A0z();
        C17050sx A01 = AbstractC09440dt.A01(new D88(this, 30));
        this.A05 = A01;
        if (!AbstractC166987dD.A1a(A01.getValue())) {
            A00();
        }
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A06 = c24721Ip;
        this.A07 = AbstractC07080Za.A03(c24721Ip);
    }

    public final void A00() {
        ArrayList A1E = AbstractC166987dD.A1E();
        C27831COu c27831COu = this.A03;
        UserSession userSession = this.A02;
        String str = this.A04;
        CTm cTm = new CTm(userSession, AbstractC40691uc.A01(userSession));
        Map map = c27831COu.A00;
        C14360o3.A0B(map, 1);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A03("section_content_at_stream_initial_count", 0);
        A0b.A01("enable_section_content_at_stream");
        AbstractC25231BEo.A18(AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "creator_inspiration_hub_type"), A0b);
        A0b.A02("enable_section_content_at_stream", true);
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new C15340po(new PZN(A1E, this, null, 35), C0JE.A00(new D54(AbstractC28917CpR.A00(A0b, A0b2), CIN.A00(cTm.A00), cTm, str, map, null)))).CPD(C30170DRa.A00(this, A1E, 19));
    }
}
