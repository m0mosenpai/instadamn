package X;

import android.widget.PopupWindow;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class PMH implements Runnable {
    public final /* synthetic */ OW4 A00;

    public PMH(OW4 ow4) {
        this.A00 = ow4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OW4 ow4 = this.A00;
        if (!ow4.A04) {
            UserSession userSession = ow4.A0A;
            if (C18U.A06(C06090Tz.A05, userSession, 36323337286200492L)) {
                AbstractC59962oe abstractC59962oe = ow4.A09;
                if (abstractC59962oe.isAdded()) {
                    abstractC59962oe.requireActivity();
                    PopupWindow popupWindow = ow4.A02;
                    if (popupWindow == null) {
                        C14360o3.A0F("popupWindow");
                        throw C00O.createAndThrow();
                    }
                    popupWindow.showAsDropDown(ow4.A08);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    if (!ow4.A0C) {
                        A1E.add(EnumC53348Niy.USER_TAG);
                    }
                    A1E.add(EnumC53348Niy.COLLAB);
                    C22C A01 = AnonymousClass229.A01(userSession);
                    List A0a = AbstractC001800i.A0a(A1E);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_mention_prompt_impression");
                    EnumC114925Hg A0J = A01.A0J();
                    C22M c22m = ((C22F) A01).A04;
                    String str = c22m.A0L;
                    EnumC50631MWs enumC50631MWs = c22m.A0C;
                    if (A0f.isSampled() && A0J != null && str != null && enumC50631MWs != null) {
                        AbstractC166987dD.A1S(A0f, str);
                        A0f.A8R(A0J, "camera_destination");
                        AbstractC167007dF.A11(A0f, A01);
                        AbstractC50522MSa.A16(c22m.A09, A0f, 2);
                        MSX.A1G(A0f, c22m);
                        AbstractC167017dG.A1B(A0f);
                        MSW.A1M(enumC50631MWs, A0f);
                        AbstractC37302Gc3.A0t(A0f);
                        A0f.AAk("mention_prompt_options", A0a);
                        A0f.Cht();
                    }
                }
            }
        }
    }
}
