package X;

import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OlH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55523OlH implements PopupWindow.OnDismissListener {
    public final int A00;
    public final Object A01;

    public C55523OlH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        long j;
        Long A0j;
        switch (this.A00) {
            case 0:
                ((C69725VuK) this.A01).A01();
                return;
            case 1:
                OW4 ow4 = (OW4) this.A01;
                if (ow4.A05) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    if (!ow4.A0C) {
                        A1E.add(EnumC53348Niy.USER_TAG);
                    }
                    A1E.add(EnumC53348Niy.COLLAB);
                    C22C A01 = AnonymousClass229.A01(ow4.A0A);
                    List A0a = AbstractC001800i.A0a(A1E);
                    C25531Mh A0G = MSW.A0G(A01);
                    EnumC114925Hg A0J = A01.A0J();
                    C22M c22m = ((C22F) A01).A04;
                    String str = c22m.A0L;
                    EnumC50631MWs enumC50631MWs = c22m.A0C;
                    if (AbstractC25226BEj.A1Z(A0G) && A0J != null && str != null && enumC50631MWs != null) {
                        A0G.A0a(A0J);
                        A0G.A0q("MENTION_PROMPT_DISMISS");
                        AbstractC167007dF.A14(A0G, c22m);
                        MSW.A1P(enumC50631MWs, A0G);
                        A0G.A0R("camera_session_id", str);
                        AbstractC167007dF.A13(A0G);
                        A0G.A0c(c22m.A0A);
                        MSY.A1A(A0G);
                        A0G.A0S("mention_prompt_options", A0a);
                        A0G.Cht();
                    }
                }
                ow4.A05 = true;
                return;
            default:
                OF2 of2 = (OF2) this.A01;
                boolean z = ((PJ4) of2.A06.getValue()).A02;
                C51003MgA c51003MgA = (C51003MgA) of2.A07.getValue();
                if (z) {
                    AbstractC166987dD.A1Z(new C57168PZm(c51003MgA, (InterfaceC23621Ds) null, 28), AbstractC141776au.A00(c51003MgA));
                    return;
                }
                C54706OEi c54706OEi = c51003MgA.A03;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c54706OEi.A03, "live_with_request_to_join_waterfall");
                MSY.A16(A0f, c54706OEi.A04.userId);
                String str2 = c54706OEi.A01;
                if (str2 == null) {
                    str2 = "";
                }
                AbstractC37300Gc1.A0l(A0f, str2);
                AbstractC31171DnF.A1A(A0f, AbstractC31178DnM.A0f("REQUEST_CANCELLED"));
                AbstractC37301Gc2.A15(A0f, c54706OEi.A02);
                String str3 = c54706OEi.A00;
                if (str3 != null && (A0j = AbstractC166997dE.A0j(str3)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                MSY.A12(A0f, j);
                MSW.A1U(A0f, c54706OEi.A05.A05());
                MSY.A17(A0f, AbstractC001800i.A0U(c54706OEi.A06));
                return;
        }
    }
}
