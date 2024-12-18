package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.ENt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32369ENt extends C53Z implements InterfaceC11380iw, InterfaceC60072op, InterfaceC60122ou, CallerContextable, C08V {
    public static final String __redex_internal_original_name = "ChangePasswordV2Fragment";
    public IgFormField A00;
    public IgFormField A01;
    public IgFormField A02;
    public FQE A03;
    public C35016Fbp A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public View A0A;
    public TextView A0B;
    public boolean A0C;
    public final Handler A0D = new Handler();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "change_password";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r5.A06 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C32369ENt r5) {
        /*
            com.instagram.igds.components.form.IgFormField r4 = r5.A00
            android.view.View r3 = r5.A0A
            if (r3 == 0) goto L3d
            if (r4 == 0) goto L3d
            X.FQE r1 = r5.A03
            com.instagram.igds.components.form.IgFormField r0 = r1.A04
            java.lang.String r2 = X.AbstractC31174DnI.A0x(r0)
            com.instagram.igds.components.form.IgFormField r0 = r1.A03
            java.lang.String r1 = X.AbstractC31174DnI.A0x(r0)
            if (r2 == 0) goto L39
            int r0 = r2.length()
            if (r0 == 0) goto L39
            if (r1 == 0) goto L39
            int r0 = r1.length()
            if (r0 == 0) goto L39
            java.lang.CharSequence r0 = r4.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L39
            boolean r0 = r5.A06
            r1 = 1
            if (r0 == 0) goto L3a
        L39:
            r1 = 0
        L3a:
            r3.setEnabled(r1)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32369ENt.A01(X.ENt):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r2 == X.C05F.A0C) goto L8;
     */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r6) {
        /*
            r5 = this;
            X.Ffp r4 = new X.Ffp
            r4.<init>()
            android.content.res.Resources r3 = X.AbstractC166997dE.A0N(r5)
            java.lang.Integer r2 = r5.A05
            java.lang.Integer r0 = X.C05F.A01
            if (r2 == r0) goto L1a
            java.lang.Integer r0 = X.C05F.A00
            if (r2 == r0) goto L1a
            java.lang.Integer r1 = X.C05F.A0C
            r0 = 2131969371(0x7f13455b, float:1.9575663E38)
            if (r2 != r1) goto L1d
        L1a:
            r0 = 2131955012(0x7f130d44, float:1.954654E38)
        L1d:
            X.C35197Ffp.A02(r3, r4, r0)
            r1 = 21
            X.FpC r0 = new X.FpC
            r0.<init>(r5, r1)
            com.instagram.actionbar.ActionButton r0 = X.C31722DwR.A00(r0, r6, r4)
            r5.A0A = r0
            boolean r0 = r5.A07
            r6.setIsLoading(r0)
            A01(r5)
            java.lang.Integer r1 = r5.A05
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L49
            X.3LO r2 = X.AbstractC31176DnK.A0I()
            r1 = 22
            X.FpC r0 = new X.FpC
            r0.<init>(r5, r1)
            X.AbstractC31176DnK.A1C(r0, r2, r6)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32369ENt.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A08) {
            C9GR.A03(getContext(), getString(2131969375), null, 1);
            return false;
        }
        return false;
    }

    public static void A00(final C32369ENt c32369ENt) {
        Intent intent;
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c32369ENt.getSession()), "instagram_change_password_success");
        if (A0f.isSampled()) {
            if (c32369ENt.A05 == C05F.A01) {
                str = "inauthentic_engagement";
            } else {
                str = null;
            }
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            A0f.Cht();
        }
        c32369ENt.A08 = false;
        if (c32369ENt.getTargetFragment() != null) {
            Fragment targetFragment = c32369ENt.getTargetFragment();
            C07K.A02(c32369ENt);
            int i = c32369ENt.mTargetRequestCode;
            Bundle bundle = c32369ENt.mArguments;
            if (bundle != null) {
                intent = AbstractC31171DnF.A04();
                String A00 = MSV.A00(1020);
                intent.putExtra(A00, bundle.getString(A00));
            } else {
                intent = null;
            }
            targetFragment.onActivityResult(i, -1, intent);
        }
        c32369ENt.A0D.post(new Runnable() { // from class: X.GLe
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC25226BEj.A1Q(C32369ENt.this);
            }
        });
        C9GR.A03(c32369ENt.getContext(), c32369ENt.getString(2131955016), null, 1);
    }

    public static void A02(C32369ENt c32369ENt, String str) {
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c32369ENt.getSession()), "instagram_change_password_failure");
        if (A0f.isSampled()) {
            if (str == null) {
                str = "";
            }
            A0f.AAP("reason", str);
            if (c32369ENt.A05 == C05F.A01) {
                str2 = "inauthentic_engagement";
            } else {
                str2 = null;
            }
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
            A0f.Cht();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        String str;
        int A02 = C0f9.A02(20520812);
        super.onCreate(bundle);
        this.A04 = new C35016Fbp(getSession());
        String string = requireArguments().getString(MSV.A00(405));
        Integer[] A00 = C05F.A00(5);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                switch (num.intValue()) {
                    case 1:
                        str = "inauthentic";
                        break;
                    case 2:
                        str = "two_fac_trusted_notification";
                        break;
                    case 3:
                        str = "activity_center";
                        break;
                    case 4:
                        str = NetInfoModule.CONNECTION_TYPE_NONE;
                        break;
                    default:
                        str = "suspicious";
                        break;
                }
                if (!str.equals(string)) {
                    i++;
                }
            } else {
                num = C05F.A0Y;
            }
        }
        this.A05 = num;
        C0f9.A09(-545924551, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A02 = C0f9.A02(1315054174);
        View inflate = layoutInflater.inflate(R.layout.fragment_change_password_v2, viewGroup, false);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.change_password_inauthenticate_title);
        TextView A0T2 = AbstractC166997dE.A0T(inflate, R.id.change_password_inauthenticate_content);
        View requireViewById = inflate.requireViewById(R.id.change_password_requirement);
        int intValue = this.A05.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                if (intValue != 2) {
                    requireViewById.setVisibility(0);
                    this.A00 = AbstractC31172DnG.A0k(inflate, R.id.current_password);
                    this.A02 = AbstractC31172DnG.A0k(inflate, R.id.new_password);
                    this.A01 = AbstractC31172DnG.A0k(inflate, R.id.confirm_new_password);
                    this.A00.setInputType(129);
                    this.A02.setInputType(129);
                    this.A01.setInputType(129);
                    TextView A0T3 = AbstractC166997dE.A0T(inflate, R.id.reset_password);
                    this.A0B = A0T3;
                    C0fQ.A00(new ViewOnClickListenerC35677FpC(this, 23), A0T3);
                    this.A0B.setVisibility(0);
                    FQE fqe = new FQE(requireContext(), this.A02, this.A01);
                    this.A03 = fqe;
                    fqe.A00 = new C34448FGm(this);
                    this.A00.A0H(new C35469Fl4(this, 19));
                    C106904rr A00 = C106904rr.A00(getSession());
                    this.A00.getMEditText().addTextChangedListener(A00);
                    this.A02.getMEditText().addTextChangedListener(A00);
                    this.A01.getMEditText().addTextChangedListener(A00);
                    this.A04.A00.markerEnd(857808781, (short) 2);
                    C0f9.A09(-1378706872, A02);
                    return inflate;
                }
                A0T.setVisibility(0);
                A0T.setText(2131955014);
                A0T2.setVisibility(0);
                i = 2131955018;
            } else {
                A0T.setVisibility(0);
                A0T.setText(2131955014);
                A0T2.setVisibility(0);
                i = 2131955017;
            }
        } else {
            A0T.setVisibility(0);
            A0T.setText(2131955014);
            A0T2.setVisibility(0);
            i = 2131955013;
        }
        A0T2.setText(i);
        this.A00 = AbstractC31172DnG.A0k(inflate, R.id.current_password);
        this.A02 = AbstractC31172DnG.A0k(inflate, R.id.new_password);
        this.A01 = AbstractC31172DnG.A0k(inflate, R.id.confirm_new_password);
        this.A00.setInputType(129);
        this.A02.setInputType(129);
        this.A01.setInputType(129);
        TextView A0T32 = AbstractC166997dE.A0T(inflate, R.id.reset_password);
        this.A0B = A0T32;
        C0fQ.A00(new ViewOnClickListenerC35677FpC(this, 23), A0T32);
        this.A0B.setVisibility(0);
        FQE fqe2 = new FQE(requireContext(), this.A02, this.A01);
        this.A03 = fqe2;
        fqe2.A00 = new C34448FGm(this);
        this.A00.A0H(new C35469Fl4(this, 19));
        C106904rr A002 = C106904rr.A00(getSession());
        this.A00.getMEditText().addTextChangedListener(A002);
        this.A02.getMEditText().addTextChangedListener(A002);
        this.A01.getMEditText().addTextChangedListener(A002);
        this.A04.A00.markerEnd(857808781, (short) 2);
        C0f9.A09(-1378706872, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1329229455);
        super.onDestroyView();
        C106904rr A00 = C106904rr.A00(getSession());
        AbstractC31173DnH.A1D(A00, this.A00);
        AbstractC31173DnH.A1D(A00, this.A02);
        AbstractC31173DnH.A1D(A00, this.A01);
        FQE fqe = this.A03;
        fqe.A00 = null;
        fqe.A04.setRuleChecker(null);
        fqe.A03.setRuleChecker(null);
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A0A = null;
        this.A0B = null;
        C0f9.A09(-1684310981, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(87142180);
        super.onPause();
        AbstractC917648y.A00(requireActivity(), this.A09);
        Window window = getRootActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        AbstractC31171DnF.A16(this);
        C0f9.A09(2012067815, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1578526936);
        super.onResume();
        this.A09 = requireActivity().getRequestedOrientation();
        AbstractC917648y.A00(requireActivity(), -1);
        Window window = getRootActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        if (!this.A0C) {
            this.A00.requestFocus();
            AbstractC13880nE.A0R(this.A00);
            this.A0C = true;
        }
        C0f9.A09(-1614652809, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-2002635071);
        super.onStart();
        AbstractC31179DnN.A1K(this, 8);
        C25621Ms A0D = AbstractC31179DnN.A0D(getSession());
        A0D.A03();
        A0D.A0B("api/v1/accounts/last_password_change_timestamp/");
        C1ON A0e = AbstractC25227BEk.A0e(A0D, EAK.class, FSZ.class);
        C14360o3.A0C(A0e, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.LastPasswordChangeTimestampResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.LastPasswordChangeTimestampResponse>>");
        AbstractC32533EUj.A00(getParentFragmentManager(), this, A0e, 1);
        C0f9.A09(1054738976, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1638807173);
        super.onStop();
        AbstractC31179DnN.A1K(this, 0);
        C0f9.A09(-2043463736, A02);
    }
}
