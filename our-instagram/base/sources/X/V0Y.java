package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes11.dex */
public final class V0Y extends AbstractC59962oe implements InterfaceC60122ou, XA8 {
    public static final String __redex_internal_original_name = "PromoteErrorFragment";
    public View A00;
    public ViewStub A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public ErrorIdentifier A05;
    public W65 A06;
    public SpinnerImageView A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public ViewStub A0C;
    public TextView A0D;
    public boolean A0E;
    public final InterfaceC09390do A0I = AbstractC09440dt.A01(new X2v(this, 3));
    public final InterfaceC09390do A0H = AbstractC09440dt.A01(new X2v(this, 4));
    public final InterfaceC09390do A0J = AbstractC09440dt.A01(new X2v(this, 5));
    public final InterfaceC09390do A0F = AbstractC09440dt.A01(new X2v(this, 1));
    public final InterfaceC09390do A0G = AbstractC09440dt.A01(new X2v(this, 2));

    public static final void A04(V0Y v0y) {
        A07(v0y, true);
        VG4 vg4 = VG4.A0k;
        C57312k6 A00 = C07Y.A00(v0y);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MCK(vg4, v0y, (InterfaceC23621Ds) null, 11), A00);
        InterfaceC09390do interfaceC09390do = v0y.A0F;
        ((W6E) interfaceC09390do.getValue()).A06(vg4.toString());
        if (C17060sy.A01.A01(A01(v0y)).A1a()) {
            ((W6E) interfaceC09390do.getValue()).A03(new C70638WeJ(v0y));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r1 != false) goto L12;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r5) {
        /*
            r4 = this;
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            android.content.Context r1 = r4.requireContext()
            com.instagram.api.schemas.ErrorIdentifier r0 = r4.A05
            if (r0 != 0) goto L16
            java.lang.String r0 = "errorIdentifier"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L16:
            java.lang.String r0 = X.AbstractC68463VRt.A00(r1, r0)
            r5.setTitle(r0)
            X.3LO r2 = new X.3LO
            r2.<init>()
            X.0h2 r0 = r4.mFragmentManager
            if (r0 == 0) goto L37
            int r0 = r0.A0L()
            if (r0 != 0) goto L37
            com.instagram.business.promote.model.PromoteData r0 = A00(r4)
            boolean r1 = r0.A2u
            r0 = 2131239093(0x7f0820b5, float:1.8094483E38)
            if (r1 == 0) goto L3a
        L37:
            r0 = 2131237958(0x7f081c46, float:1.8092181E38)
        L3a:
            r2.A01(r0)
            r1 = 60
            X.WNT r0 = new X.WNT
            r0.<init>(r4, r1)
            X.AbstractC31176DnK.A1C(r0, r2, r5)
            r5.EkG(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0Y.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_error";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SpinnerImageView A0V = AbstractC31180DnO.A0V(view);
        this.A07 = A0V;
        if (A0V == null) {
            str = "loadingSpinner";
        } else {
            A0V.setLoadingStatus(C3T1.SUCCESS);
            this.A01 = (ViewStub) view.requireViewById(R.id.promote_empty_view_stub);
            this.A06 = new W65(view, VG4.A0k);
            this.A0C = (ViewStub) view.requireViewById(R.id.promote_error_learn_more_link_view_stub);
            AbstractC65703TsZ.A1K(this);
            if (A09(this)) {
                A03(this);
            }
            if (this.A00 == null) {
                ViewStub viewStub = this.A01;
                if (viewStub == null) {
                    str = "errorViewStub";
                } else {
                    View inflate = viewStub.inflate();
                    this.A00 = inflate;
                    if (inflate != null) {
                        this.A03 = (TextView) inflate.requireViewById(R.id.promote_empty_view_title);
                        View view2 = this.A00;
                        if (view2 != null) {
                            this.A04 = (TextView) view2.requireViewById(R.id.promote_error_meta_status_link_view_stub);
                            TextView textView = this.A03;
                            if (textView == null) {
                                str = "errorViewTitle";
                            } else {
                                textView.setText(2131970729);
                                View view3 = this.A00;
                                if (view3 != null) {
                                    this.A02 = (TextView) view3.findViewById(R.id.promote_empty_view_description);
                                    ErrorIdentifier errorIdentifier = this.A05;
                                    if (errorIdentifier == null) {
                                        str = "errorIdentifier";
                                    } else if (errorIdentifier == ErrorIdentifier.A0C) {
                                        View view4 = this.A00;
                                        if (view4 != null) {
                                            AbstractC31176DnK.A0D(view4, R.id.promote_empty_view_icon).setImageDrawable(AbstractC56412ia.A00(AbstractC166997dE.A0N(this), R.drawable.instagram_business_images_account_unsettled_icon));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F("errorView");
                    throw C00O.createAndThrow();
                }
            }
            A05(this);
            if (A08(this)) {
                W65 w65 = this.A06;
                if (w65 == null) {
                    str = "actionButtonHolder";
                } else {
                    w65.A01();
                    A02(this);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final PromoteData A00(V0Y v0y) {
        return (PromoteData) AbstractC166987dD.A17(v0y.A0I);
    }

    public static final UserSession A01(V0Y v0y) {
        return (UserSession) AbstractC166987dD.A17(v0y.A0J);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.V0Y r9) {
        /*
            X.W65 r4 = r9.A06
            if (r4 != 0) goto Le
            java.lang.String r0 = "actionButtonHolder"
        L6:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            androidx.fragment.app.FragmentActivity r3 = r9.requireActivity()
            com.instagram.common.session.UserSession r5 = A01(r9)
            com.instagram.api.schemas.ErrorIdentifier r2 = r9.A05
            if (r2 != 0) goto L1d
            java.lang.String r0 = "errorIdentifier"
            goto L6
        L1d:
            r1 = 0
            r0 = 3
            X.C14360o3.A0B(r5, r0)
            r4.A05(r1)
            r4.A03(r9)
            int r0 = r2.ordinal()
            switch(r0) {
                case 44: goto L82;
                case 45: goto L76;
                case 46: goto L76;
                case 47: goto L6e;
                case 48: goto L72;
                case 49: goto L86;
                case 50: goto L2f;
                case 51: goto L2f;
                case 52: goto L76;
                case 53: goto L7a;
                case 54: goto L7e;
                case 55: goto L7e;
                case 56: goto L2f;
                case 57: goto L2f;
                case 58: goto L2f;
                case 59: goto L2f;
                case 60: goto L2f;
                case 61: goto L6e;
                case 62: goto L2f;
                case 63: goto L2f;
                case 64: goto L2f;
                case 65: goto L2f;
                case 66: goto L34;
                case 67: goto L30;
                case 68: goto L6a;
                default: goto L2f;
            }
        L2f:
            return
        L30:
            r0 = 2131970712(0x7f134a98, float:1.9578383E38)
            goto L37
        L34:
            r0 = 2131970715(0x7f134a9b, float:1.9578389E38)
        L37:
            r4.A02(r0)
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131970734(0x7f134aae, float:1.9578427E38)
            java.lang.String r6 = X.AbstractC166997dE.A0p(r1, r0)
            r0 = 2131970723(0x7f134aa3, float:1.9578405E38)
            java.lang.String r0 = X.AbstractC31177DnL.A0b(r1, r6, r0)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r0)
            int r9 = X.AbstractC53242c7.A06(r1)
            r0 = 437(0x1b5, float:6.12E-43)
            java.lang.String r7 = X.AbstractC111324zv.A00(r0)
            java.lang.String r8 = "help_link_page_terms"
            X.W65.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r4.A02
            if (r0 == 0) goto L2f
            r0.setFooterText(r2)
            return
        L6a:
            r0 = 2131970725(0x7f134aa5, float:1.957841E38)
            goto L89
        L6e:
            r0 = 2131970464(0x7f1349a0, float:1.957788E38)
            goto L89
        L72:
            r0 = 2131970724(0x7f134aa4, float:1.9578407E38)
            goto L89
        L76:
            r0 = 2131970726(0x7f134aa6, float:1.9578411E38)
            goto L89
        L7a:
            r0 = 2131970722(0x7f134aa2, float:1.9578403E38)
            goto L89
        L7e:
            r0 = 2131970287(0x7f1348ef, float:1.957752E38)
            goto L89
        L82:
            r0 = 2131970713(0x7f134a99, float:1.9578385E38)
            goto L89
        L86:
            r0 = 2131968948(0x7f1343b4, float:1.9574805E38)
        L89:
            r4.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0Y.A02(X.V0Y):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.V0Y r2) {
        /*
            android.widget.TextView r1 = r2.A0D
            if (r1 != 0) goto L24
            android.view.ViewStub r0 = r2.A0C
            if (r0 != 0) goto L12
            java.lang.String r0 = "learnMoreLinkViewStub"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L12:
            android.view.View r1 = r0.inflate()
            r0 = 3
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.A0D = r1
            if (r1 == 0) goto L28
        L24:
            r0 = 0
            r1.setVisibility(r0)
        L28:
            android.widget.TextView r1 = r2.A0D
            if (r1 == 0) goto L31
            r0 = 61
            X.WNT.A00(r1, r0, r2)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0Y.A03(X.V0Y):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.V0Y r6) {
        /*
            com.instagram.api.schemas.ErrorIdentifier r1 = r6.A05
            if (r1 != 0) goto Le
            java.lang.String r5 = "errorIdentifier"
        L6:
            X.C14360o3.A0F(r5)
        L9:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            com.instagram.api.schemas.ErrorIdentifier r0 = com.instagram.api.schemas.ErrorIdentifier.A18
            java.lang.String r5 = "errorViewTitle"
            if (r1 == r0) goto L49
            java.lang.String r1 = r6.A0A
            if (r1 == 0) goto L49
            android.widget.TextView r0 = r6.A03
            if (r0 == 0) goto L6
            r0.setText(r1)
        L1f:
            java.lang.String r2 = r6.A09
            if (r2 != 0) goto L54
            com.instagram.common.session.UserSession r4 = A01(r6)
            r3 = 0
            X.C14360o3.A0B(r4, r3)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321133967975585(0x8109e1000024a1, double:3.0329696025905734E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L48
            android.widget.TextView r0 = r6.A04
            if (r0 == 0) goto L3f
            r0.setVisibility(r3)
        L3f:
            android.widget.TextView r1 = r6.A04
            if (r1 == 0) goto L48
            r0 = 62
            X.WNT.A00(r1, r0, r6)
        L48:
            return
        L49:
            android.widget.TextView r1 = r6.A03
            if (r1 == 0) goto L6
            r0 = 2131970729(0x7f134aa9, float:1.9578417E38)
            r1.setText(r0)
            goto L1f
        L54:
            com.instagram.api.schemas.ErrorIdentifier r1 = r6.A05
            java.lang.String r5 = "errorIdentifier"
            if (r1 == 0) goto L6
            com.instagram.api.schemas.ErrorIdentifier r0 = com.instagram.api.schemas.ErrorIdentifier.A09
            java.lang.String r4 = "errorViewDescription"
            if (r1 == r0) goto L70
            com.instagram.api.schemas.ErrorIdentifier r0 = com.instagram.api.schemas.ErrorIdentifier.A0F
            if (r1 == r0) goto L70
            com.instagram.api.schemas.ErrorIdentifier r0 = com.instagram.api.schemas.ErrorIdentifier.A0G
            if (r1 == r0) goto L70
            android.widget.TextView r0 = r6.A02
            if (r0 == 0) goto Lc0
            r0.setText(r2)
            return
        L70:
            r0 = 2131970717(0x7f134a9d, float:1.9578393E38)
            java.lang.String r3 = X.AbstractC25227BEk.A0v(r6, r0)
            com.instagram.api.schemas.ErrorIdentifier r2 = r6.A05
            if (r2 == 0) goto L6
            com.instagram.api.schemas.ErrorIdentifier r1 = com.instagram.api.schemas.ErrorIdentifier.A0G
            r0 = 2131970718(0x7f134a9e, float:1.9578395E38)
            if (r2 != r1) goto L85
            r0 = 2131970716(0x7f134a9c, float:1.957839E38)
        L85:
            java.lang.String r0 = X.AbstractC31174DnI.A0w(r6, r3, r0)
            X.C14360o3.A0A(r0)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r0)
            android.view.View r0 = r6.A00
            if (r0 != 0) goto L99
            java.lang.String r5 = "errorView"
            goto L6
        L99:
            android.content.Context r1 = r0.getContext()
            android.content.Context r0 = r6.getContext()
            int r0 = X.AbstractC53242c7.A06(r0)
            int r1 = r1.getColor(r0)
            X.VB6 r0 = new X.VB6
            r0.<init>(r6, r1)
            X.AnonymousClass773.A05(r2, r0, r3)
            android.widget.TextView r0 = r6.A02
            if (r0 == 0) goto Lc0
            r0.setText(r2)
            android.widget.TextView r0 = r6.A02
            if (r0 == 0) goto Lc0
            X.AbstractC25227BEk.A11(r0)
            return
        Lc0:
            X.C14360o3.A0F(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0Y.A05(X.V0Y):void");
    }

    public static final void A06(V0Y v0y, AbstractC115105If abstractC115105If) {
        ErrorIdentifier errorIdentifier;
        C67837UzA c67837UzA;
        UPA upa;
        if (abstractC115105If == null || (c67837UzA = (C67837UzA) abstractC115105If.A00()) == null || (upa = c67837UzA.A01) == null || (errorIdentifier = upa.A01) == null) {
            errorIdentifier = ErrorIdentifier.A18;
        }
        v0y.A05 = errorIdentifier;
        A07(v0y, false);
        A05(v0y);
    }

    public static final void A07(V0Y v0y, boolean z) {
        TextView textView;
        int i = 8;
        SpinnerImageView spinnerImageView = v0y.A07;
        if (z) {
            if (spinnerImageView != null) {
                spinnerImageView.setLoadingStatus(C3T1.LOADING);
                View view = v0y.A00;
                if (view != null) {
                    view.setVisibility(8);
                    W65 w65 = v0y.A06;
                    if (w65 != null) {
                        w65.A00.setVisibility(8);
                        TextView textView2 = v0y.A0D;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                        textView = v0y.A04;
                        if (textView == null) {
                            return;
                        }
                        textView.setVisibility(i);
                        return;
                    }
                    C14360o3.A0F("actionButtonHolder");
                }
                C14360o3.A0F("errorView");
            }
            C14360o3.A0F("loadingSpinner");
        } else {
            if (spinnerImageView != null) {
                spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                View view2 = v0y.A00;
                if (view2 != null) {
                    int i2 = 0;
                    view2.setVisibility(0);
                    if (A08(v0y)) {
                        W65 w652 = v0y.A06;
                        if (w652 != null) {
                            w652.A00.setVisibility(0);
                        }
                        C14360o3.A0F("actionButtonHolder");
                    }
                    TextView textView3 = v0y.A0D;
                    if (textView3 != null) {
                        if (!A09(v0y)) {
                            i2 = 8;
                        }
                        textView3.setVisibility(i2);
                    }
                    textView = v0y.A04;
                    if (textView == null) {
                        return;
                    }
                    if (v0y.A09 == null) {
                        i = 0;
                    }
                    textView.setVisibility(i);
                    return;
                }
                C14360o3.A0F("errorView");
            }
            C14360o3.A0F("loadingSpinner");
        }
        throw C00O.createAndThrow();
    }

    public static final boolean A08(V0Y v0y) {
        ErrorIdentifier errorIdentifier = v0y.A05;
        if (errorIdentifier == null) {
            C14360o3.A0F("errorIdentifier");
            throw C00O.createAndThrow();
        }
        if (errorIdentifier != ErrorIdentifier.A0t && errorIdentifier != ErrorIdentifier.A0B && errorIdentifier != ErrorIdentifier.A0C && errorIdentifier != ErrorIdentifier.A08 && errorIdentifier != ErrorIdentifier.A0x && errorIdentifier != ErrorIdentifier.A0y && errorIdentifier != ErrorIdentifier.A0z && errorIdentifier != ErrorIdentifier.A0F && errorIdentifier != ErrorIdentifier.A0H && errorIdentifier != ErrorIdentifier.A0I && errorIdentifier != ErrorIdentifier.A0A && errorIdentifier != ErrorIdentifier.A09 && errorIdentifier != ErrorIdentifier.A0G && errorIdentifier != ErrorIdentifier.A06) {
            return false;
        }
        return true;
    }

    public static final boolean A09(V0Y v0y) {
        ErrorIdentifier errorIdentifier = v0y.A05;
        if (errorIdentifier == null) {
            C14360o3.A0F("errorIdentifier");
            throw C00O.createAndThrow();
        }
        if (errorIdentifier != ErrorIdentifier.A0J && errorIdentifier != ErrorIdentifier.A0t && errorIdentifier != ErrorIdentifier.A0s && errorIdentifier != ErrorIdentifier.A0B) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    @Override // X.XA8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CuW() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0Y.CuW():void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1859127664);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0A = bundle2.getString("error_title");
            this.A09 = bundle2.getString(TraceFieldType.Error);
            this.A08 = bundle2.getString("ad_account_id");
            this.A0B = bundle2.getString("paymentMethodID");
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString("error_type");
        } else {
            str = null;
        }
        ErrorIdentifier errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(str);
        if (errorIdentifier == null) {
            errorIdentifier = ErrorIdentifier.A19;
        }
        this.A05 = errorIdentifier;
        C0f9.A09(-1763667249, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(986148906);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_error_view, viewGroup, false);
        C0f9.A09(622422238, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1633271395);
        super.onDestroyView();
        this.A04 = null;
        C0f9.A09(1278714154, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(750325690);
        super.onResume();
        if (this.A0E) {
            ErrorIdentifier errorIdentifier = this.A05;
            if (errorIdentifier == null) {
                C14360o3.A0F("errorIdentifier");
                throw C00O.createAndThrow();
            }
            if (errorIdentifier == ErrorIdentifier.A0t || errorIdentifier == ErrorIdentifier.A0B || errorIdentifier == ErrorIdentifier.A0C || errorIdentifier == ErrorIdentifier.A08) {
                this.A0E = false;
                A04(this);
            }
        }
        C0f9.A09(-72355982, A02);
    }
}
