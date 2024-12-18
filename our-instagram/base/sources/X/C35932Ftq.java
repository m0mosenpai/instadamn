package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

/* renamed from: X.Ftq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35932Ftq implements InterfaceC37148GYj, CallerContextable {
    public static final String __redex_internal_original_name = "IGUXFlowLifecycleIGWALinkingProcessor";
    public final Fragment A00;
    public final C45126Jxv A01;
    public final UserSession A02;
    public final String A03;

    public C35932Ftq(Fragment fragment, C45126Jxv c45126Jxv, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A03 = str;
        this.A01 = c45126Jxv;
    }

    @Override // X.InterfaceC37148GYj
    public final void Dgx(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC37148GYj
    public final void Csx() {
        String A00;
        Fragment fragment = this.A00;
        AbstractC25226BEj.A1P(fragment);
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A02;
        if (c08730cb.A01(userSession).A1a()) {
            A00 = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        } else {
            A00 = AbstractC111324zv.A00(46);
        }
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC31171DnF.A1T(this.A03, A1G);
        C45126Jxv c45126Jxv = this.A01;
        String str = c45126Jxv.A01;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        A1G.put("back_stack_tag", str);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A17(fragment, A0C, 2131977068);
        C6XJ A0a = AbstractC31174DnI.A0a(fragment.requireActivity(), W6d.A00(A0C, C66277U6x.A01(A00, A1G)), userSession, ModalActivity.class, "bloks");
        A0a.A07 = true;
        String str3 = c45126Jxv.A01;
        if (str3 != null) {
            str2 = str3;
        }
        A0a.A06 = str2;
        AbstractC31172DnG.A1M(fragment, A0a);
    }
}
