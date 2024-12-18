package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.Serializable;

/* renamed from: X.EIw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32262EIw extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "TwoFacLoginVerifyFragment";
    public Handler A00;
    public View A01;
    public View A02;
    public CheckBox A03;
    public TextView A04;
    public QuickPerformanceLogger A05;
    public C07270a1 A06;
    public EnumC33400EpX A07;
    public FJE A08;
    public C35162Ff4 A09;
    public ConfirmationCodeEditText A0A;
    public ProgressButton A0B;
    public EnumC31713DwI A0C;
    public Integer A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public final View.OnClickListener A0W = new ViewOnClickListenerC35677FpC(this, 67);
    public final TextView.OnEditorActionListener A0Z = new C35754Fqr(this, 12);
    public final TextWatcher A0V = new Em2(this, 7);
    public final InterfaceC41501vz A0c = C31650DvG.A00(this, 51);
    public final AbstractC86353t7 A0T = new C33172EkJ(this, 4);
    public final View.OnClickListener A0X = new ViewOnClickListenerC35677FpC(this, 68);
    public final View.OnLongClickListener A0Y = new ViewOnLongClickListenerC35702Fpc(this, 3);
    public final C1P1 A0a = new C32539EUp(this, 7);
    public final C32539EUp A0b = new C32539EUp(this, 6);
    public final C1P1 A0R = new C32539EUp(this, 8);
    public final Runnable A0U = new RunnableC36843GLq(this);
    public final C1P1 A0S = new C32539EUp(this, 9);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        EnumC33400EpX enumC33400EpX = this.A07;
        if (enumC33400EpX == null) {
            C14360o3.A0F("twoFacClearMethod");
            throw C00O.createAndThrow();
        }
        bundle.putSerializable("saved_two_fac_clear_method", enumC33400EpX);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0Q) {
            C35162Ff4 c35162Ff4 = this.A09;
            if (c35162Ff4 == null) {
                str2 = "twoFacSecureNonceManager";
            } else {
                String str3 = this.A0E;
                if (str3 == null) {
                    str2 = "pk";
                } else {
                    C35162Ff4.A00(c35162Ff4);
                    C34557FKr c34557FKr = (C34557FKr) c35162Ff4.A00.get(str3);
                    if (c34557FKr != null) {
                        str = c34557FKr.A01;
                    } else {
                        str = null;
                    }
                    FragmentActivity requireActivity = requireActivity();
                    C07270a1 c07270a1 = this.A06;
                    if (c07270a1 != null) {
                        String str4 = this.A0H;
                        if (str4 == null) {
                            str2 = AbstractC31182DnR.A01();
                        } else {
                            String str5 = this.A0G;
                            if (str5 == null) {
                                str2 = "twoFacIdentifier";
                            } else {
                                C1ON A00 = AbstractC35177FfU.A00(requireActivity, c07270a1, str4, str5, str, String.valueOf(5), null, false);
                                A00.A00 = new C32974Eff(this, true);
                                schedule(A00);
                                double A002 = AbstractC31171DnF.A00();
                                double A01 = AbstractC31171DnF.A01();
                                C07270a1 c07270a12 = this.A06;
                                if (c07270a12 != null) {
                                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a12), "two_fac_login_attempt_with_trusted_device");
                                    AbstractC31177DnL.A1B(A0f, A01, A002);
                                    AbstractC31177DnL.A1G(A0f, "containermodule", "waterfall_log_in", A002);
                                    EnumC31713DwI enumC31713DwI = this.A0C;
                                    if (enumC31713DwI == null) {
                                        str2 = "twoFacStage";
                                    } else {
                                        AbstractC31178DnM.A19(A0f, enumC31713DwI.A01);
                                        AbstractC31176DnK.A1K(A0f, A01);
                                        A0f.Cht();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    str2 = "loggedOutSession";
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r0.isChecked() != true) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C32262EIw r12) {
        /*
            X.Fc4 r2 = X.C35031Fc4.A00
            X.0a1 r1 = r12.A06
            java.lang.String r3 = "loggedOutSession"
            if (r1 == 0) goto Le
            X.DwI r0 = r12.A0C
            if (r0 != 0) goto L16
            java.lang.String r3 = "twoFacStage"
        Le:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L16:
            java.lang.String r0 = r0.A01
            r10 = 0
            r2.A00(r1, r10, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r12.A0B
            if (r0 != 0) goto L23
            java.lang.String r3 = "confirmButton"
            goto Le
        L23:
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L87
            com.facebook.quicklog.QuickPerformanceLogger r2 = r12.A05
            if (r2 != 0) goto L30
            java.lang.String r3 = "qplLogger"
            goto Le
        L30:
            r1 = 203167632(0xc1c1790, float:1.2024893E-31)
            java.lang.String r0 = "CONFIRM_CLICK"
            r2.markerPoint(r1, r0)
            android.content.Context r4 = r12.requireContext()
            X.0a1 r5 = r12.A06
            if (r5 == 0) goto Le
            java.lang.String r6 = r12.A0H
            if (r6 != 0) goto L49
            java.lang.String r3 = X.AbstractC31182DnR.A01()
            goto Le
        L49:
            java.lang.String r7 = r12.A0G
            if (r7 != 0) goto L50
            java.lang.String r3 = "twoFacIdentifier"
            goto Le
        L50:
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r1 = r12.A0A
            if (r1 != 0) goto L57
            java.lang.String r3 = "confirmationCodeEditText"
            goto Le
        L57:
            android.graphics.RectF r0 = X.AbstractC13880nE.A01
            java.lang.String r8 = X.AbstractC31174DnI.A0v(r1)
            android.widget.CheckBox r0 = r12.A03
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6a
            boolean r0 = r0.isChecked()
            r11 = 1
            if (r0 == r1) goto L6b
        L6a:
            r11 = 0
        L6b:
            X.EpX r0 = r12.A07
            if (r0 != 0) goto L72
            java.lang.String r3 = "twoFacClearMethod"
            goto Le
        L72:
            int r0 = r0.A00
            java.lang.String r9 = java.lang.String.valueOf(r0)
            X.1ON r1 = X.AbstractC35177FfU.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            X.Eff r0 = new X.Eff
            r0.<init>(r12, r2)
            r1.A00 = r0
            r12.schedule(r1)
            return
        L87:
            android.content.Context r1 = r12.requireContext()
            r0 = 2131973159(0x7f135427, float:1.9583346E38)
            java.lang.String r0 = r12.getString(r0)
            X.AbstractC35254Fgn.A06(r1, r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32262EIw.A00(X.EIw):void");
    }

    public static final void A01(C32262EIw c32262EIw) {
        String str;
        C07270a1 c07270a1 = c32262EIw.A06;
        if (c07270a1 == null) {
            str = "loggedOutSession";
        } else {
            String str2 = c32262EIw.A0H;
            if (str2 == null) {
                str = AbstractC31182DnR.A01();
            } else {
                String A0c = AbstractC31180DnO.A0c(c32262EIw);
                String str3 = c32262EIw.A0G;
                if (str3 == null) {
                    str = "twoFacIdentifier";
                } else {
                    String A01 = AbstractC31182DnR.A01();
                    C25621Ms A0c2 = AbstractC167017dG.A0c(c07270a1);
                    AbstractC31172DnG.A1Q(A0c2, 737, 42, 38);
                    A0c2.A0R(C32133EAg.class, C34746FSl.class);
                    A0c2.A9s(AbstractC31182DnR.A00(), A0c);
                    A0c2.A9s(A01, str2);
                    C1ON A0T = AbstractC31172DnG.A0T(A0c2, AbstractC31178DnM.A0a(), str3);
                    A0T.A00 = c32262EIw.A0b;
                    c32262EIw.schedule(A0T);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C32262EIw r12) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32262EIw.A02(X.EIw):void");
    }

    public static final void A03(C32262EIw c32262EIw, boolean z) {
        String str;
        C07270a1 c07270a1 = c32262EIw.A06;
        if (c07270a1 != null) {
            C18920wW A02 = AbstractC12220kQ.A02(c07270a1);
            double A00 = AbstractC31171DnF.A00();
            double A01 = AbstractC31171DnF.A01();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "two_fac_resend_sms_tapped");
            if (A0f.isSampled()) {
                AbstractC31177DnL.A1B(A0f, A01, A00);
                AbstractC31177DnL.A1G(A0f, "containermodule", "waterfall_log_in", A00);
                EnumC31713DwI enumC31713DwI = c32262EIw.A0C;
                if (enumC31713DwI == null) {
                    str = "twoFacStage";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                AbstractC31178DnM.A19(A0f, enumC31713DwI.A01);
                AbstractC35274Fh9.A07(A0f, A01);
                A0f.Cht();
            }
            if (!z) {
                FJE fje = c32262EIw.A08;
                str = "twoFacPhoneVerificationHelper";
                if (fje != null) {
                    if (SystemClock.elapsedRealtime() - fje.A01 < fje.A00 * 1000) {
                        AbstractC34238F8k.A00(c32262EIw.requireContext(), fje.A00);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            Context requireContext = c32262EIw.requireContext();
            C07270a1 c07270a12 = c32262EIw.A06;
            if (c07270a12 != null) {
                String str2 = c32262EIw.A0H;
                if (str2 == null) {
                    str = AbstractC31182DnR.A01();
                } else {
                    String str3 = c32262EIw.A0G;
                    if (str3 == null) {
                        str = "twoFacIdentifier";
                    } else {
                        C25621Ms A0c = AbstractC167017dG.A0c(c07270a12);
                        A0c.A0B("accounts/send_two_factor_login_sms/");
                        AbstractC31175DnJ.A1J(A0c);
                        A0c.A9s(AbstractC31182DnR.A01(), str2);
                        AbstractC31179DnN.A0j(requireContext, A0c, AbstractC31178DnM.A0a(), str3);
                        C1ON A0P = AbstractC31176DnK.A0P(A0c);
                        A0P.A00 = c32262EIw.A0a;
                        c32262EIw.schedule(A0P);
                        QuickPerformanceLogger quickPerformanceLogger = c32262EIw.A05;
                        if (quickPerformanceLogger == null) {
                            str = "qplLogger";
                        } else {
                            quickPerformanceLogger.markerPoint(203167632, "RESEND_CODE_CLICK");
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        str = "loggedOutSession";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59972of
    public final void beforeOnPause() {
        Handler handler = this.A00;
        if (handler == null) {
            C14360o3.A0F("notificationStatusHandler");
            throw C00O.createAndThrow();
        }
        handler.removeCallbacks(this.A0U);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        C07270a1 c07270a1 = this.A06;
        if (c07270a1 == null) {
            C14360o3.A0F("loggedOutSession");
            throw C00O.createAndThrow();
        }
        return c07270a1;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        String str;
        super.afterOnResume();
        EnumC33400EpX enumC33400EpX = this.A07;
        if (enumC33400EpX == null) {
            str = "twoFacClearMethod";
        } else if (enumC33400EpX == EnumC33400EpX.A07) {
            Handler handler = this.A00;
            if (handler == null) {
                str = "notificationStatusHandler";
            } else {
                handler.postDelayed(this.A0U, 3000L);
                return;
            }
        } else {
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC33400EpX enumC33400EpX;
        Serializable serializable;
        String str;
        int A02 = C0f9.A02(-1862661960);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C09Y c09y = C023409i.A0A;
        C14360o3.A0A(requireArguments);
        this.A06 = c09y.A02(requireArguments);
        this.A08 = new FJE();
        int i = requireArguments.getInt("resend_sms_delay_sec");
        FJE fje = this.A08;
        if (fje == null) {
            str = "twoFacPhoneVerificationHelper";
        } else {
            fje.A00 = i;
            int i2 = requireArguments.getInt("argument_two_fac_clear_method");
            EnumC33400EpX[] values = EnumC33400EpX.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    enumC33400EpX = values[i3];
                    if (enumC33400EpX.A00 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    enumC33400EpX = EnumC33400EpX.A08;
                    break;
                }
            }
            this.A07 = enumC33400EpX;
            C41451vu.A01.A02(this.A0c, C36041Fvd.class);
            EnumC33400EpX enumC33400EpX2 = this.A07;
            if (enumC33400EpX2 == null) {
                str = "twoFacClearMethod";
            } else {
                this.A0I = AbstractC167007dF.A1X(enumC33400EpX2, EnumC33400EpX.A05);
                this.A0K = requireArguments.getBoolean("ARGUMENT_SHOULD_REMEMBER_PASSWORD");
                this.A0H = requireArguments.getString("argument_username", "");
                this.A0E = requireArguments.getString("argument_pk", "");
                this.A0G = requireArguments.getString("argument_two_fac_identifier", "");
                this.A0O = requireArguments.getString("argument_abfuscated_phone_number", "");
                this.A0J = requireArguments.getBoolean("argument_should_opt_in_trusted_device_option");
                this.A0F = requireArguments.getString("argument_sms_not_allowed_reason", "");
                this.A0P = requireArguments.getBoolean("eligible_for_multiple_totp");
                this.A0Q = requireArguments.getBoolean("argument_is_trusted_device");
                if (this.A06 == null) {
                    str = "loggedOutSession";
                } else {
                    C006802i c006802i = C006802i.A0p;
                    this.A05 = c006802i;
                    if (c006802i == null) {
                        str = "qplLogger";
                    } else {
                        c006802i.markerStart(203167632);
                        this.A00 = AbstractC167007dF.A0J();
                        this.A0C = EnumC31713DwI.A1Y;
                        this.A09 = AbstractC35179FfW.A02();
                        if (bundle != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle.getSerializable("saved_two_fac_clear_method", EnumC33400EpX.class);
                            } else {
                                serializable = bundle.getSerializable("saved_two_fac_clear_method");
                            }
                            C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.login.twofac.constants.TwoFacConstants.TwoFacClearMethod");
                            this.A07 = (EnumC33400EpX) serializable;
                        }
                        C0f9.A09(1313565939, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-479853866);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_confirm_phone_number_fragment, viewGroup, false);
        this.A01 = inflate;
        if (inflate != null) {
            TextView A0T = AbstractC166997dE.A0T(inflate, R.id.two_fac_confirm_phone_number_title);
            this.A0N = A0T;
            if (A0T == null) {
                C14360o3.A0F("titleTextView");
                throw C00O.createAndThrow();
            }
            ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(A0T);
            A0G.setMargins(A0G.leftMargin, 0, A0G.rightMargin, A0G.bottomMargin);
            A0T.setLayoutParams(A0G);
            View view = this.A01;
            if (view != null) {
                ImageView A08 = AbstractC31171DnF.A08(view, R.id.two_fac_back_icon);
                if (A08 != null) {
                    A08.setVisibility(0);
                    C0fQ.A00(this.A0X, A08);
                    AbstractC31173DnH.A11(requireContext(), A08, AbstractC53242c7.A08(A08.getContext()));
                }
                View view2 = this.A01;
                if (view2 != null) {
                    this.A0L = AbstractC166997dE.A0T(view2, R.id.two_fac_confirm_phone_number_body);
                    View view3 = this.A01;
                    if (view3 != null) {
                        this.A0M = AbstractC166997dE.A0T(view3, R.id.two_fac_confirm_phone_number_description);
                        View view4 = this.A01;
                        if (view4 != null) {
                            ProgressButton A0U = AbstractC31180DnO.A0U(view4);
                            A0U.setText(2131956564);
                            C0fQ.A00(this.A0W, A0U);
                            A0U.setEnabled(false);
                            this.A0B = A0U;
                            View view5 = this.A01;
                            if (view5 != null) {
                                ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) view5.requireViewById(R.id.edit_text);
                                confirmationCodeEditText.addTextChangedListener(this.A0V);
                                confirmationCodeEditText.setOnEditorActionListener(this.A0Z);
                                confirmationCodeEditText.setOnLongClickListener(this.A0Y);
                                confirmationCodeEditText.A02 = 0;
                                this.A0A = confirmationCodeEditText;
                                View view6 = this.A01;
                                if (view6 != null) {
                                    this.A02 = view6.requireViewById(R.id.two_fac_trusted_device_login_checkbox);
                                    View view7 = this.A01;
                                    if (view7 != null) {
                                        this.A03 = (CheckBox) view7.findViewById(R.id.two_fac_trusted_device_checkbox);
                                        View view8 = this.A01;
                                        if (view8 != null) {
                                            TextView A0T2 = AbstractC166997dE.A0T(view8, R.id.two_fac_bottom_button_secondary);
                                            A0T2.setText(2131975927);
                                            ViewOnClickListenerC35677FpC.A00(A0T2, 69, this);
                                            A0T2.setVisibility(0);
                                            this.A04 = A0T2;
                                            View view9 = this.A01;
                                            if (view9 != null) {
                                                AbstractC167007dF.A0x(view9.findViewById(R.id.footer));
                                                A02(this);
                                                View view10 = this.A01;
                                                if (view10 != null) {
                                                    C0f9.A09(-942325051, A02);
                                                    return view10;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("rootView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1537464454);
        super.onDestroy();
        C41451vu.A01.A03(this.A0c, C36041Fvd.class);
        C0f9.A09(1003426354, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        int A02 = C0f9.A02(1743958678);
        super.onPause();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(0);
            ConfirmationCodeEditText confirmationCodeEditText = this.A0A;
            if (confirmationCodeEditText == null) {
                C14360o3.A0F("confirmationCodeEditText");
                throw C00O.createAndThrow();
            }
            AbstractC13880nE.A0O(confirmationCodeEditText);
        }
        C0f9.A09(383855930, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        int A02 = C0f9.A02(703619229);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(16);
            ConfirmationCodeEditText confirmationCodeEditText = this.A0A;
            if (confirmationCodeEditText != null) {
                confirmationCodeEditText.requestFocus();
                ConfirmationCodeEditText confirmationCodeEditText2 = this.A0A;
                if (confirmationCodeEditText2 != null) {
                    AbstractC13880nE.A0R(confirmationCodeEditText2);
                }
            }
            C14360o3.A0F("confirmationCodeEditText");
            throw C00O.createAndThrow();
        }
        C0f9.A09(-1627768489, A02);
    }
}
