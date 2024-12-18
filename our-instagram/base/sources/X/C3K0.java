package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.3K0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3K0 extends C1I7 {
    public int A00;
    public Dialog A01;
    public Dialog A02;
    public TextView A03;
    public C41155IJu A04;
    public C41006IEb A05;
    public boolean A06;
    public boolean A07;
    public final Activity A09;
    public final UserSession A0B;
    public final InterfaceC61352qx A0C;
    public final InterfaceC60442pS A0D;
    public final C71763Jz A0E;
    public final Handler A0A = new Handler(this) { // from class: X.3K1
        public final WeakReference A00;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C71763Jz c71763Jz;
            AnonymousClass396 anonymousClass396;
            boolean z;
            int i;
            TextView textView;
            AdapterView adapterView;
            Dialog dialog;
            String str;
            C14360o3.A0B(message, 0);
            C3K0 c3k0 = (C3K0) this.A00.get();
            if (c3k0 != null && message.what == 3) {
                int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                Activity activity = c3k0.A09;
                if (activity.hasWindowFocus() && (c71763Jz = c3k0.A0E) != null && ((anonymousClass396 = c71763Jz.A00) == null || !C3u9.A00(anonymousClass396.A05.A0G.A0J()))) {
                    C41155IJu c41155IJu = c3k0.A04;
                    if (c41155IJu != null) {
                        if (c41155IJu.A00 == C05F.A01 && !c3k0.A0D.isSponsoredEligible()) {
                            C3K0.A02(c3k0);
                            return;
                        }
                        DialogInterfaceOnClickListenerC23169AOi dialogInterfaceOnClickListenerC23169AOi = DialogInterfaceOnClickListenerC23169AOi.A00;
                        DialogInterfaceOnClickListenerC41794IfA dialogInterfaceOnClickListenerC41794IfA = new DialogInterfaceOnClickListenerC41794IfA(c41155IJu, c3k0);
                        c3k0.A05 = new C41006IEb(c41155IJu, c3k0);
                        if (c41155IJu.A06) {
                            C35166FfG c35166FfG = new C35166FfG(activity, R.layout.multiple_question_dialog, R.style.IgDialogDeprecated);
                            z = true;
                            DialogC31731Dwc dialogC31731Dwc = c35166FfG.A0D;
                            dialogC31731Dwc.setCancelable(true);
                            dialogC31731Dwc.setCanceledOnTouchOutside(true);
                            i = 2131975026;
                            c35166FfG.A01(2131975026);
                            c35166FfG.A03(dialogInterfaceOnClickListenerC23169AOi, c35166FfG.A02.getString(2131975023));
                            c35166FfG.A02(dialogInterfaceOnClickListenerC41794IfA, 2131975028);
                            c3k0.A01 = c35166FfG.A00();
                        } else {
                            String string = activity.getResources().getString(2131975023);
                            C14360o3.A07(string);
                            Locale locale = activity.getResources().getConfiguration().locale;
                            C14360o3.A06(locale);
                            String upperCase = string.toUpperCase(locale);
                            C14360o3.A07(upperCase);
                            C35166FfG c35166FfG2 = new C35166FfG(activity, R.layout.multiple_question_dialog, R.style.IgDialogDeprecated);
                            z = true;
                            DialogC31731Dwc dialogC31731Dwc2 = c35166FfG2.A0D;
                            dialogC31731Dwc2.setCancelable(true);
                            dialogC31731Dwc2.setCanceledOnTouchOutside(true);
                            i = 2131975026;
                            c35166FfG2.A01(2131975026);
                            DialogInterfaceOnClickListenerC41791If7 dialogInterfaceOnClickListenerC41791If7 = new DialogInterfaceOnClickListenerC41791If7(c3k0);
                            TextView textView2 = c35166FfG2.A09;
                            textView2.getClass();
                            textView2.setText(upperCase);
                            C0fQ.A00(new ViewOnClickListenerC35582FnZ(dialogInterfaceOnClickListenerC41791If7, c35166FfG2, -1), textView2);
                            textView2.setVisibility(0);
                            DialogC31731Dwc A00 = c35166FfG2.A00();
                            c3k0.A01 = A00;
                            View findViewById = A00.findViewById(R.id.close_button);
                            if (findViewById != null) {
                                C0fQ.A00(new ViewOnClickListenerC41876IhE(c3k0), findViewById);
                            }
                            Dialog dialog2 = c3k0.A01;
                            if (dialog2 != null) {
                                View findViewById2 = dialog2.findViewById(R.id.button_blue);
                                C14360o3.A07(findViewById2);
                                findViewById2.setVisibility(8);
                            }
                        }
                        Dialog dialog3 = c3k0.A01;
                        if (dialog3 != null) {
                            textView = (TextView) dialog3.findViewById(R.id.multi_question_survey_title);
                        } else {
                            textView = null;
                        }
                        c3k0.A03 = textView;
                        Dialog dialog4 = c3k0.A01;
                        if (dialog4 != null) {
                            adapterView = (AdapterView) dialog4.findViewById(R.id.multiQuestionSurveyList);
                            dialog4.setOnShowListener(new DialogInterfaceOnShowListenerC41847Ig1(c3k0));
                        } else {
                            adapterView = null;
                        }
                        C3K0.A00(dialog4, c41155IJu, c3k0, c3k0.A00);
                        if (adapterView != null) {
                            adapterView.setOnItemClickListener(new C42069Ikc(c41155IJu, c3k0));
                        }
                        Dialog dialog5 = c3k0.A01;
                        if (dialog5 != null) {
                            dialog5.setOnDismissListener(new DialogInterfaceOnDismissListenerC41839Ift(c3k0));
                        }
                        if (c41155IJu.A05 && (str = c41155IJu.A02) != null) {
                            String string2 = activity.getResources().getString(2131968535);
                            C14360o3.A07(string2);
                            Locale locale2 = activity.getResources().getConfiguration().locale;
                            C14360o3.A06(locale2);
                            String upperCase2 = string2.toUpperCase(locale2);
                            C14360o3.A07(upperCase2);
                            C193328hC c193328hC = new C193328hC(activity);
                            c193328hC.A0r(str);
                            c193328hC.A0A(i);
                            c193328hC.A0Z(new DialogInterfaceOnClickListenerC41795IfB(c41155IJu, c3k0), EnumC193348hE.A03, upperCase2, false);
                            c193328hC.A0C(new DialogInterfaceOnCancelListenerC41788If4(c41155IJu, c3k0));
                            c193328hC.A0s(z);
                            c193328hC.A0t(false);
                            Dialog A02 = c193328hC.A02();
                            c3k0.A02 = A02;
                            if (A02 != null) {
                                A02.setOnShowListener(new DialogInterfaceOnShowListenerC41848Ig2(c3k0));
                            }
                            dialog = c3k0.A02;
                        } else {
                            dialog = c3k0.A01;
                        }
                        if (dialog == null) {
                            return;
                        }
                        C0fJ.A00(dialog);
                        return;
                    }
                    return;
                }
                C3K0.A03(c3k0);
            }
        }

        {
            this.A00 = new WeakReference(this);
        }
    };
    public final long A08 = SystemClock.elapsedRealtime();

    public static final void A00(Dialog dialog, C41155IJu c41155IJu, C3K0 c3k0, int i) {
        AbsListView absListView = dialog != null ? (AbsListView) dialog.findViewById(R.id.multiQuestionSurveyList) : null;
        C41128IIt c41128IIt = (C41128IIt) c41155IJu.A04.get(i);
        String str = c41128IIt.A03;
        C14360o3.A07(str);
        TextView textView = c3k0.A03;
        if (textView != null) {
            textView.setText(str);
        }
        if (absListView != null) {
            C41006IEb c41006IEb = c3k0.A05;
            if (c41006IEb == null) {
                C14360o3.A0F("multiSelectNextListener");
                throw C00O.createAndThrow();
            }
            absListView.setAdapter((ListAdapter) new HEB(c41128IIt, c41006IEb));
        }
        if (c41155IJu.A00 == C05F.A00) {
            UserSession userSession = c3k0.A0B;
            InterfaceC60442pS interfaceC60442pS = c3k0.A0D;
            C14360o3.A0B(userSession, 0);
            C19280xC A00 = C19280xC.A00(interfaceC60442pS, "user_sentiment_survey_presented");
            A00.A0C("survey_id", c41155IJu.A01);
            AbstractC11060iN.A00(userSession).EHW(A00);
        }
    }

    public static final void A02(C3K0 c3k0) {
        c3k0.A01 = null;
        c3k0.A02 = null;
        c3k0.A04 = null;
        c3k0.A06 = false;
        c3k0.A03 = null;
        c3k0.A0A.removeMessages(3);
        InterfaceC61352qx interfaceC61352qx = c3k0.A0C;
        if (interfaceC61352qx != null) {
            interfaceC61352qx.F9f(c3k0);
        }
    }

    public static final void A01(C41155IJu c41155IJu, C3K0 c3k0, String[] strArr) {
        View view;
        Dialog dialog;
        View findViewById;
        C41128IIt c41128IIt = (C41128IIt) c41155IJu.A04.get(c3k0.A00);
        c41128IIt.A00++;
        UserSession userSession = c3k0.A0B;
        InterfaceC60442pS interfaceC60442pS = c3k0.A0D;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(strArr, 3);
        C14360o3.A0B(interfaceC60442pS, 4);
        Integer num = c41155IJu.A00;
        Integer num2 = C05F.A01;
        if (num == num2) {
            String A00 = AbstractC111324zv.A00(1320);
            C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, AnonymousClass001.A0R("instagram_ad_", A00));
            c82713mZ.A8A = AbstractC16960so.A1Q(Arrays.copyOf(strArr, strArr.length));
            boolean z = true;
            boolean z2 = false;
            if (c41155IJu.A02 != null) {
                z2 = true;
            }
            c82713mZ.A2E = Boolean.valueOf(z2);
            c82713mZ.A6e = c41128IIt.A02;
            c82713mZ.A7Q = c41155IJu.A03;
            if (!C5I7.A00(userSession, c82713mZ, interfaceC60442pS, num2)) {
                C19280xC A002 = C19280xC.A00(interfaceC60442pS, AnonymousClass001.A0R("instagram_ad_", A00));
                A002.A0E("responses", strArr);
                if (c41155IJu.A02 == null) {
                    z = false;
                }
                A002.A09("show_primer", Boolean.valueOf(z));
                A002.A0C("question_id", c41128IIt.A02);
                A002.A0C("tracking_token", c41155IJu.A03);
                AbstractC11060iN.A00(userSession).EIu(A002);
            }
        } else {
            C19280xC A003 = C19280xC.A00(interfaceC60442pS, "user_sentiment_survey");
            A003.A0C("survey_id", c41155IJu.A01);
            A003.A0C("selected_survey_answer", strArr[0]);
            AbstractC11060iN.A00(userSession).EHW(A003);
        }
        c3k0.A00++;
        int size = c41155IJu.A04.size() - 1;
        int i = c3k0.A00;
        Dialog dialog2 = c3k0.A01;
        if (i > size) {
            if (dialog2 != null && (findViewById = dialog2.findViewById(R.id.alertTitleContainer)) != null) {
                findViewById.setVisibility(8);
            }
            if (!c41155IJu.A06 && (dialog = c3k0.A01) != null) {
                View findViewById2 = dialog.findViewById(R.id.button_blue);
                C14360o3.A07(findViewById2);
                findViewById2.setVisibility(0);
            }
            Dialog dialog3 = c3k0.A01;
            if (dialog3 != null) {
                view = dialog3.findViewById(R.id.surveyFlipper);
            } else {
                view = null;
            }
            C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.ViewFlipper");
            ((ViewAnimator) view).showNext();
            c3k0.A00 = 0;
            return;
        }
        A00(dialog2, c41155IJu, c3k0, i);
    }

    public static final void A03(C3K0 c3k0) {
        Handler handler = c3k0.A0A;
        handler.removeMessages(3);
        InterfaceC61352qx interfaceC61352qx = c3k0.A0C;
        if (interfaceC61352qx != null && interfaceC61352qx.Auo() == 0 && !c3k0.A07) {
            handler.sendEmptyMessageDelayed(3, (int) Math.max(2000L, 15000 - (SystemClock.elapsedRealtime() - c3k0.A08)));
        }
    }

    public C3K0(Activity activity, UserSession userSession, InterfaceC61352qx interfaceC61352qx, InterfaceC60442pS interfaceC60442pS, C71763Jz c71763Jz) {
        this.A09 = activity;
        this.A0B = userSession;
        this.A0D = interfaceC60442pS;
        this.A0E = c71763Jz;
        this.A0C = interfaceC61352qx;
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03 = C0f9.A03(1709331444);
        A03(this);
        C0f9.A0A(1326561033, A03);
    }
}
