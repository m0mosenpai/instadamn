package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import java.util.List;

/* renamed from: X.Eju, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33151Eju extends ELn {
    public static final /* synthetic */ C0YR[] A0C = {new AnonymousClass013(C33151Eju.class, "currAudienceListName", "getCurrAudienceListName()Ljava/lang/String;", 0), new AnonymousClass013(C33151Eju.class, "isNetworkRequestInFlight", "isNetworkRequestInFlight()Z", 0)};
    public static final String __redex_internal_original_name = "AudienceListsAudiencePickerFragment";
    public C56352iT A00;
    public C31543DtT A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC16530ry A0A = new C57778Pk5(this, 0);
    public final InterfaceC16530ry A0B = new C57778Pk5(this, (Object) false);
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String A03;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.A02 == null) {
            A03 = requireContext().getString(2131956963);
        } else {
            A03 = A03(this);
            if (A03 == null) {
                A03 = AbstractC166997dE.A0p(requireContext(), 2131969516);
            }
        }
        C14360o3.A0A(A03);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35679FpE.A00(this, 9), AbstractC31179DnN.A0B(interfaceC56362iU, A03), interfaceC56362iU);
        if (this.A02 != null) {
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A02(C05F.A00);
            AbstractC31176DnK.A1B(ViewOnClickListenerC35679FpE.A00(this, 10), A0B, interfaceC56362iU);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "audience_lists_audience_picker";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0210  */
    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33151Eju.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final String A03(C33151Eju c33151Eju) {
        return (String) AbstractC31171DnF.A0Y(c33151Eju, c33151Eju.A0A, A0C, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r4 > 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C33151Eju r5) {
        /*
            X.FfI r0 = r5.A03
            java.util.Set r0 = r0.A03
            int r4 = r0.size()
            android.view.View r1 = r5.requireView()
            r0 = 2131432027(0x7f0b125b, float:1.84858E38)
            android.view.View r3 = X.AbstractC166997dE.A0S(r1, r0)
            java.lang.String r0 = r5.A02
            r2 = 0
            if (r0 != 0) goto L1b
            r1 = 0
            if (r4 <= 0) goto L1c
        L1b:
            r1 = 1
        L1c:
            boolean r0 = r5.A08
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L29
            java.lang.String r0 = A03(r5)
            if (r0 == 0) goto L29
            r2 = 1
        L29:
            r1 = r2
        L2a:
            r3.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33151Eju.A05(X.Eju):void");
    }

    public static final void A07(C33151Eju c33151Eju, List list) {
        C35167FfI c35167FfI = ((ELn) c33151Eju).A03;
        c35167FfI.A06(list);
        C35167FfI.A00(c33151Eju, c35167FfI);
        C35167FfI.A01(c33151Eju, c35167FfI);
    }

    public static final void A08(C33151Eju c33151Eju, List list, List list2) {
        C35167FfI c35167FfI = ((ELn) c33151Eju).A03;
        c35167FfI.A07(list);
        c35167FfI.A08(list2);
        C35167FfI.A00(c33151Eju, c35167FfI);
        C35167FfI.A01(c33151Eju, c35167FfI);
    }

    public static final void A09(C33151Eju c33151Eju, boolean z) {
        AbstractC167007dF.A1L(c33151Eju, c33151Eju.A0B, A0C, 1, z);
    }

    public final UserSession A0E() {
        return AbstractC166987dD.A0r(this.A09);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A09);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if ((this.A02 != null && C14360o3.A0K(this.A03, A03(this))) || (this.A02 == null && A03(this) == null)) {
            C34521FJh c34521FJh = super.A03.A02;
            if (c34521FJh.A00.isEmpty() && c34521FJh.A01.isEmpty()) {
                AbstractC25227BEk.A1B(this);
            }
        }
        C193328hC A0b = AbstractC31176DnK.A0b(this);
        int i = 2131960939;
        if (this.A02 == null) {
            i = 2131960943;
        }
        A0b.A05 = getString(i);
        int i2 = 2131960938;
        if (this.A02 == null) {
            i2 = 2131960942;
        }
        AbstractC31179DnN.A11(this, A0b, i2);
        DialogInterfaceOnClickListenerC35452Fk9.A01(A0b, this, 28, 2131960921);
        A0b.A0D(DialogInterfaceOnClickListenerC35390Fj5.A00);
        AbstractC31178DnM.A1R(A0b, true);
        return true;
    }

    public static final void A04(C33151Eju c33151Eju) {
        c33151Eju.A0A().A03(c33151Eju.requireContext(), null, EnumC153216up.A06);
        C31543DtT c31543DtT = c33151Eju.A01;
        if (c31543DtT == null) {
            C14360o3.A0F("suggestedUsersPaginationHelper");
            throw C00O.createAndThrow();
        }
        c31543DtT.A02 = true;
        String str = c33151Eju.A02;
        if (str != null) {
            AbstractC166987dD.A1Z(new C50120MBu(c33151Eju, str, null, 31), C07Y.A00(c33151Eju));
            return;
        }
        Context requireContext = c33151Eju.requireContext();
        C08790ch A00 = AbstractC018607g.A00(c33151Eju);
        InterfaceC09390do interfaceC09390do = c33151Eju.A09;
        C32548EUy.A00(requireContext, A00, FTd.A00(AbstractC166987dD.A0r(interfaceC09390do), 40, null, true, C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36319871248178910L)), c33151Eju, 37);
    }

    public static final void A06(C33151Eju c33151Eju, int i, boolean z) {
        C9GR.A07(c33151Eju.requireContext(), i);
        if (z) {
            c33151Eju.A0A().A03(c33151Eju.requireContext(), ViewOnClickListenerC35679FpE.A00(c33151Eju, 13), EnumC153216up.A04);
        }
    }

    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        AbstractC167017dG.A1N(c32069E6v, igdsCheckBox);
        super.A0D(igdsCheckBox, c32069E6v);
        C35167FfI.A01(this, super.A03);
        A05(this);
        requireView().findViewById(R.id.list_name_edit_text).clearFocus();
        AbstractC13880nE.A0K(requireActivity());
        View A0S = AbstractC166997dE.A0S(requireView(), R.id.edit_text_container);
        A0B().A00();
        if (this.A02 == null || this.A04) {
            A0S.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window A0H;
        int A02 = C0f9.A02(-1737008546);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C56352iT.A0t.A04(this);
        this.A02 = requireArguments.getString("audience_list_id");
        this.A05 = requireArguments.getBoolean("is_bottomsheet");
        this.A03 = requireArguments.getString("audience_list_name");
        this.A07 = requireArguments.getBoolean("delete_enabled");
        AbstractC31171DnF.A1S(this, this.A03, this.A0A, A0C, 0);
        InterfaceC09390do interfaceC09390do = this.A09;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A08 = C18U.A06(c06090Tz, A0r, 36319871247851227L);
        this.A06 = C18U.A06(c06090Tz, AbstractC166987dD.A0r(interfaceC09390do), 36319871248637667L);
        if (this.A02 == null && (A0H = AbstractC31174DnI.A0H(this)) != null) {
            A0H.setSoftInputMode(53);
        }
        C06C.A01(this, "request_key_audience_lists_settings_session_finished", GWI.A00);
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A01 = new C31543DtT(this, AbstractC166987dD.A0r(interfaceC09390do), new C36772GIv(this, 0));
        C0f9.A09(286089314, A02);
    }

    @Override // X.ELn, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2098357761);
        ELn.A01(this, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_audience_lists_audience_picker, viewGroup, false);
        C0f9.A09(-1882709762, A02);
        return inflate;
    }
}
