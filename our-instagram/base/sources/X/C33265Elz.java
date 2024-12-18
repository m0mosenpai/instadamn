package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.Elz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33265Elz extends AnonymousClass522 {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33265Elz(EHb eHb, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = eHb;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        String str;
        C35133Fea c35133Fea;
        Context A0L;
        AbstractC12990ll A0o;
        SimpleWebViewConfig simpleWebViewConfig;
        Context requireContext;
        UserSession A0r;
        String str2;
        C2Fb c2Fb;
        switch (this.A00) {
            case 0:
                EHb eHb = (EHb) this.A01;
                A0y = AbstractC25228BEl.A0y(eHb.requireActivity(), AbstractC166987dD.A0r(eHb.A00), C2Fb.A35, this.A02);
                str = "media_picker_info_bottom_sheet";
                A0y.A0S = str;
                A0y.A0A();
                return;
            case 1:
                C32273EJi c32273EJi = (C32273EJi) this.A01;
                FragmentActivity requireActivity = c32273EJi.requireActivity();
                UserSession userSession = c32273EJi.A00;
                if (userSession != null) {
                    A0y = AbstractC25228BEl.A0y(requireActivity, userSession, C2Fb.A35, this.A02);
                    str = "promote";
                    A0y.A0S = str;
                    A0y.A0A();
                    return;
                }
                AbstractC31171DnF.A0u();
                throw C00O.createAndThrow();
            case 2:
                C14360o3.A0B(view, 0);
                c35133Fea = SimpleWebViewActivity.A02;
                A0L = AbstractC166997dE.A0L(view);
                A0o = AbstractC166987dD.A0o(((EN5) this.A01).A04);
                simpleWebViewConfig = new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, this.A02, MSV.A00(466));
                c35133Fea.A02(A0L, A0o, simpleWebViewConfig);
                return;
            case 3:
                EI9 ei9 = (EI9) this.A01;
                requireContext = ei9.requireContext();
                A0r = AbstractC166987dD.A0r(ei9.A02);
                str2 = this.A02;
                c2Fb = C2Fb.A3M;
                A0y = AbstractC25228BEl.A0y(requireContext, A0r, c2Fb, str2);
                A0y.A0A();
                return;
            case 4:
                EI9 ei92 = (EI9) this.A01;
                requireContext = ei92.requireContext();
                A0r = AbstractC166987dD.A0r(ei92.A02);
                str2 = this.A02;
                c2Fb = C2Fb.A2t;
                A0y = AbstractC25228BEl.A0y(requireContext, A0r, c2Fb, str2);
                A0y.A0A();
                return;
            case 5:
                EI9 ei93 = (EI9) this.A01;
                requireContext = ei93.requireContext();
                A0r = AbstractC166987dD.A0r(ei93.A02);
                str2 = this.A02;
                c2Fb = C2Fb.A3E;
                A0y = AbstractC25228BEl.A0y(requireContext, A0r, c2Fb, str2);
                A0y.A0A();
                return;
            case 6:
                EI9 ei94 = (EI9) this.A01;
                requireContext = ei94.requireContext();
                A0r = AbstractC166987dD.A0r(ei94.A02);
                str2 = this.A02;
                c2Fb = C2Fb.A2g;
                A0y = AbstractC25228BEl.A0y(requireContext, A0r, c2Fb, str2);
                A0y.A0A();
                return;
            case 7:
                EI9 ei95 = (EI9) this.A01;
                requireContext = ei95.requireContext();
                A0r = AbstractC166987dD.A0r(ei95.A02);
                str2 = this.A02;
                c2Fb = C2Fb.A0L;
                A0y = AbstractC25228BEl.A0y(requireContext, A0r, c2Fb, str2);
                A0y.A0A();
                return;
            case 8:
                c35133Fea = SimpleWebViewActivity.A02;
                C45474KBm c45474KBm = (C45474KBm) this.A01;
                A0L = c45474KBm.requireContext();
                A0o = AbstractC166987dD.A0o(c45474KBm.A08);
                SXK A0R = AbstractC31171DnF.A0R(AbstractC43591JPw.A00(1032));
                A0R.A02 = this.A02;
                simpleWebViewConfig = new SimpleWebViewConfig(A0R);
                c35133Fea.A02(A0L, A0o, simpleWebViewConfig);
                return;
            case 9:
                EL5 el5 = (EL5) this.A01;
                requireContext = el5.requireActivity();
                A0r = AbstractC166987dD.A0r(el5.A0O);
                str2 = this.A02;
                c2Fb = C2Fb.A1n;
                A0y = AbstractC25228BEl.A0y(requireContext, A0r, c2Fb, str2);
                A0y.A0A();
                return;
            default:
                AbstractC41776Ies.A03(AbstractC31172DnG.A07(this.A01), this.A02);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33265Elz(EI9 ei9, String str, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = ei9;
        this.A02 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33265Elz(EN5 en5, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = en5;
        this.A02 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33265Elz(EL5 el5, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 9;
        this.A01 = el5;
        this.A02 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33265Elz(C32273EJi c32273EJi, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 1;
        this.A01 = c32273EJi;
        this.A02 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33265Elz(C32335EMh c32335EMh, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 10;
        this.A01 = c32335EMh;
        this.A02 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33265Elz(C45474KBm c45474KBm, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 8;
        this.A01 = c45474KBm;
        this.A02 = str;
    }
}
