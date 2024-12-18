package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.Eff, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32974Eff extends C32547EUx {
    public final boolean A00;
    public final /* synthetic */ C32262EIw A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32974Eff(X.C32262EIw r10, boolean r11) {
        /*
            r9 = this;
            r0 = r9
            r3 = r10
            r9.A01 = r10
            X.0a1 r4 = r10.A06
            if (r4 != 0) goto L12
            java.lang.String r0 = "loggedOutSession"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L12:
            androidx.fragment.app.FragmentActivity r1 = r10.requireActivity()
            X.DwI r6 = X.EnumC31713DwI.A1X
            java.lang.Integer r7 = X.C05F.A00
            r5 = 0
            android.net.Uri r2 = X.AbstractC31525Dt9.A01(r10)
            r8 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.A00 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32974Eff.<init>(X.EIw, boolean):void");
    }

    @Override // X.C32547EUx
    public final void A04(EfU efU) {
        int A0N = AbstractC167017dG.A0N(efU, -1777652521);
        C32262EIw c32262EIw = this.A01;
        if (c32262EIw.requireArguments().getBoolean("argument_is_from_one_click_flow")) {
            InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
            A0P.E77("has_one_clicked_logged_in", true);
            A0P.apply();
        }
        String id = efU.A00.getId();
        C07270a1 c07270a1 = c32262EIw.A06;
        String str = "loggedOutSession";
        if (c07270a1 != null) {
            if (C83743oJ.A01(c07270a1).A0K(id)) {
                C07270a1 c07270a12 = c32262EIw.A06;
                if (c07270a12 != null) {
                    C83743oJ A01 = C83743oJ.A01(c07270a12);
                    if (c32262EIw.A06 != null) {
                        A01.A0G(id);
                    }
                }
            }
            if (c32262EIw.A0K) {
                C07270a1 c07270a13 = c32262EIw.A06;
                if (c07270a13 != null) {
                    C83743oJ A012 = C83743oJ.A01(c07270a13);
                    Integer num = C05F.A15;
                    C07270a1 c07270a14 = c32262EIw.A06;
                    if (c07270a14 != null) {
                        A012.A09(c32262EIw.getContext(), c32262EIw, c07270a14, num, id, true);
                    }
                }
            }
            C35162Ff4 c35162Ff4 = c32262EIw.A09;
            if (c35162Ff4 == null) {
                str = "twoFacSecureNonceManager";
            } else {
                String str2 = c32262EIw.A0E;
                if (str2 == null) {
                    str = "pk";
                } else {
                    c35162Ff4.A01.remove(str2);
                    if (this.A00) {
                        double A00 = AbstractC31171DnF.A00();
                        double A013 = AbstractC31171DnF.A01();
                        C07270a1 c07270a15 = c32262EIw.A06;
                        if (c07270a15 != null) {
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a15), "two_fac_login_success_with_trusted_device");
                            AbstractC31177DnL.A1B(A0f, A013, A00);
                            AbstractC31177DnL.A1G(A0f, "containermodule", "waterfall_log_in", A00);
                            EnumC31713DwI enumC31713DwI = c32262EIw.A0C;
                            if (enumC31713DwI == null) {
                                str = "twoFacStage";
                            } else {
                                AbstractC31178DnM.A19(A0f, enumC31713DwI.A01);
                                AbstractC31176DnK.A1K(A0f, A013);
                                A0f.Cht();
                            }
                        }
                    }
                    QuickPerformanceLogger quickPerformanceLogger = c32262EIw.A05;
                    if (quickPerformanceLogger == null) {
                        str = "qplLogger";
                    } else {
                        quickPerformanceLogger.markerEnd(203167632, (short) 2);
                        super.A04(efU);
                        C0f9.A0A(733348507, A0N);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    @Override // X.C32547EUx, X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32974Eff.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(2120426756);
        super.onFinish();
        boolean z = this.A00;
        C32262EIw c32262EIw = this.A01;
        if (z) {
            AbstractC63248Sg4.A01(c32262EIw.getParentFragmentManager());
        } else {
            ProgressButton progressButton = c32262EIw.A0B;
            String str = "confirmButton";
            if (progressButton != null) {
                progressButton.setEnabled(true);
                ProgressButton progressButton2 = c32262EIw.A0B;
                if (progressButton2 != null) {
                    progressButton2.setShowProgressBar(false);
                    TextView textView = c32262EIw.A04;
                    str = "secondaryButton";
                    if (textView != null) {
                        textView.setEnabled(true);
                        TextView textView2 = c32262EIw.A04;
                        if (textView2 != null) {
                            textView2.setAlpha(1.0f);
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A0A(1235212423, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        String str;
        int A03 = C0f9.A03(-1406853597);
        super.onStart();
        boolean z = this.A00;
        C32262EIw c32262EIw = this.A01;
        if (z) {
            View view = c32262EIw.A01;
            if (view == null) {
                str = "rootView";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            view.setVisibility(8);
            AbstractC63248Sg4.A02(c32262EIw.getParentFragmentManager());
            C0f9.A0A(-1540164599, A03);
            return;
        }
        ProgressButton progressButton = c32262EIw.A0B;
        str = "confirmButton";
        if (progressButton != null) {
            progressButton.setEnabled(false);
            ProgressButton progressButton2 = c32262EIw.A0B;
            if (progressButton2 != null) {
                progressButton2.setShowProgressBar(true);
                TextView textView = c32262EIw.A04;
                str = "secondaryButton";
                if (textView != null) {
                    textView.setEnabled(false);
                    TextView textView2 = c32262EIw.A04;
                    if (textView2 != null) {
                        textView2.setAlpha(0.25f);
                        C0f9.A0A(-1540164599, A03);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C32547EUx, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C0f9.A0A(-225297542, C32547EUx.A00(this, obj, -365070744));
    }
}
