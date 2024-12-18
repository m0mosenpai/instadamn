package com.instagram.debug.devoptions.fbpay;

import X.AbstractC10360h2;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31177DnL;
import X.AbstractC58322PtE;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C0fQ;
import X.C12260kU;
import X.C14360o3;
import X.C16910sj;
import X.C1H6;
import X.C2FP;
import X.C2Fb;
import X.C63397SjR;
import X.C63406Sjd;
import X.C67752UxP;
import X.C69642Vsj;
import X.MSW;
import X.SPR;
import X.VEY;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.EditText;
import com.facebook.R;
import com.facebookpay.confirmation.model.ECPConfirmationParams;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellAction;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.webview.WebViewActivity;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class IgECPPlaygroundActivity extends IgFragmentActivity {
    public static final Companion Companion = new Object();
    public static final String DEEPLINK_URL = "instagram://ecp_checkout?product_id=235936865236184&receiver_id=283912516944685&order_id=1003374073922800";
    public static final String DOMAIN = "ECP_CHECKOUT";
    public static final String DOMAIN_E2E = "ECP_E2E";
    public static final String MODULE_NAME = "ecp_playground";
    public static final String OFFSITE_DEFAULT_URL = "https://fb-qa-test-store.myshopify.com/";
    public static final int REQUEST_CODE_ECP_AVAILABLE = 10;
    public EditText deeplinkE2EUrlInputEditText;
    public C69642Vsj ecpLauncher;
    public EditText offsiteUrlInputEditText;

    public static final Intent getActivityIntent(Context context) {
        return Companion.getActivityIntent(context);
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public final Intent getActivityIntent(Context context) {
            C14360o3.A0B(context, 0);
            return MSW.A08(context, IgECPPlaygroundActivity.class);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final void expandTouchArea(final View view, final View view2, final int i) {
        view.post(new Runnable() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$expandTouchArea$1
            @Override // java.lang.Runnable
            public final void run() {
                Rect A0U = AbstractC166987dD.A0U();
                view2.getHitRect(A0U);
                int i2 = A0U.top;
                int i3 = i;
                A0U.top = i2 - i3;
                A0U.left -= i3;
                A0U.right += i3;
                A0U.bottom += i3;
                view.setTouchDelegate(new TouchDelegate(A0U, view2));
            }
        });
    }

    @Override // X.InterfaceC12980lk
    public /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return MSW.A0Q(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(1625164523);
        super.onCreate(bundle);
        C1H6.A01(this);
        this.ecpLauncher = new C69642Vsj(this);
        setContentView(R.layout.ig_ecp_playground_activity);
        this.offsiteUrlInputEditText = (EditText) findViewById(R.id.express_checkout_edittext_offsite_url_input);
        this.deeplinkE2EUrlInputEditText = (EditText) findViewById(R.id.express_checkout_edittext_deeplink_e2e_url_input);
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$1$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2049809960);
                C69642Vsj c69642Vsj = IgECPPlaygroundActivity.this.ecpLauncher;
                if (c69642Vsj == null) {
                    C14360o3.A0F("ecpLauncher");
                    throw C00O.createAndThrow();
                }
                VEY vey = VEY.A0T;
                c69642Vsj.A00(new EcpUIConfiguration(null, vey, vey, VEY.A0Z, VEY.A0a, VEY.A0V, VEY.A0c, VEY.A0D, null, new ItemDetails(C05F.A00, null)), "FORCE_PUX");
                C0f9.A0C(908965828, A05);
            }
        }, findViewById(R.id.express_checkout_button));
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$2$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int A05 = C0f9.A05(1425300274);
                EditText editText = IgECPPlaygroundActivity.this.offsiteUrlInputEditText;
                if (editText == null) {
                    C14360o3.A0F("offsiteUrlInputEditText");
                    throw C00O.createAndThrow();
                }
                Editable text = editText.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                IgECPPlaygroundActivity igECPPlaygroundActivity = IgECPPlaygroundActivity.this;
                UserSession A0Q = MSW.A0Q(igECPPlaygroundActivity);
                if (str.length() <= 0) {
                    str = IgECPPlaygroundActivity.OFFSITE_DEFAULT_URL;
                }
                C63397SjR c63397SjR = new C63397SjR(igECPPlaygroundActivity, A0Q, C2Fb.A1Y, str, false);
                c63397SjR.A0S = IgECPPlaygroundActivity.MODULE_NAME;
                c63397SjR.A0A();
                C0f9.A0C(1399628834, A05);
            }
        }, findViewById(R.id.express_checkout_button_offsite));
        View findViewById = findViewById(R.id.clear_url_input_text);
        View findViewById2 = findViewById(R.id.express_checkout_edittext_offsite_url_layout);
        C14360o3.A07(findViewById2);
        C14360o3.A0A(findViewById);
        expandTouchArea(findViewById2, findViewById, 100);
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$3$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1573141281);
                EditText editText = IgECPPlaygroundActivity.this.offsiteUrlInputEditText;
                if (editText == null) {
                    C14360o3.A0F("offsiteUrlInputEditText");
                    throw C00O.createAndThrow();
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                C0f9.A0C(-288484769, A05);
            }
        }, findViewById);
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$4$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1392880789);
                AbstractC58322PtE.A0Z().A0G(IgECPPlaygroundActivity.this, MSW.A08(IgECPPlaygroundActivity.this, IgECPOnsitePlaygroundActivity.class));
                C0f9.A0C(-871236356, A05);
            }
        }, findViewById(R.id.express_checkout_button_onsite));
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$5$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1475407370);
                C69642Vsj c69642Vsj = IgECPPlaygroundActivity.this.ecpLauncher;
                if (c69642Vsj == null) {
                    C14360o3.A0F("ecpLauncher");
                    throw C00O.createAndThrow();
                }
                VEY vey = VEY.A0T;
                c69642Vsj.A00(new EcpUIConfiguration(null, vey, vey, VEY.A0Z, VEY.A0a, VEY.A0V, VEY.A0c, VEY.A0D, null, new ItemDetails(C05F.A00, null)), "FORCE_NUX");
                C0f9.A0C(-1969291607, A05);
            }
        }, findViewById(R.id.express_checkout_button_nux));
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$6$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1907787588);
                IgECPPlaygroundActivity igECPPlaygroundActivity = IgECPPlaygroundActivity.this;
                if (igECPPlaygroundActivity.ecpLauncher == null) {
                    C14360o3.A0F("ecpLauncher");
                    throw C00O.createAndThrow();
                }
                AbstractC10360h2 supportFragmentManager = igECPPlaygroundActivity.getSupportFragmentManager();
                C14360o3.A07(supportFragmentManager);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("STYLE_RES", R.style.FBPayUIWidget_BottomSheets);
                C67752UxP c67752UxP = new C67752UxP();
                c67752UxP.setArguments(bundle2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ECPConfirmationUpsellAction("LINK", "Connected", "messages", "Stay connected", "https://m.facebook.com/facebook_pay/connect_learn_more"));
                arrayList.add(new ECPConfirmationUpsellAction("LINK", "Invite", "envelope_invitation", "Invite your friends", ""));
                arrayList.add(new ECPConfirmationUpsellAction("LINK", "Share", "share", "Share fundraiser", ""));
                ECPConfirmationParams eCPConfirmationParams = new ECPConfirmationParams(new ECPConfirmationUpsellSection("Up Next", arrayList), "Thanks for your purchase", "A confirmation email was sent to example@fb.com", "See Receipt", "https://m.facebook.com/facebook_pay/connect_learn_more", "Add extra security with PIN", "CLOSE");
                C16910sj c16910sj = C16910sj.A00;
                LoggingContext loggingContext = new LoggingContext(null, "uplclienttest_1634071535_403977fe-132e-4c89-9498-8e1ef4bf95e1", c16910sj, c16910sj, 137885231632764L, false);
                SPR A01 = C2FP.A01();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("ECP_CONFIRMATION_FRAGMENT_PARAMS", eCPConfirmationParams);
                bundle3.putParcelable("logging_context", loggingContext);
                c67752UxP.A0J(A01.A01(bundle3, "content_confirmation_fragment"), supportFragmentManager, "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
                C0f9.A0C(1805183970, A05);
            }
        }, findViewById(R.id.express_checkout_confirmation));
        View findViewById3 = findViewById(R.id.web_view);
        final Intent A08 = MSW.A08(this, WebViewActivity.class);
        A08.putExtra("WEB_VIEW_URL", "https://google.com");
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$7$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2109311381);
                C2FP.A07();
                Intent intent = A08;
                IgECPPlaygroundActivity igECPPlaygroundActivity = this;
                AbstractC167017dG.A1O(intent, igECPPlaygroundActivity);
                C12260kU.A08(igECPPlaygroundActivity, intent, 10);
                C0f9.A0C(1479152038, A05);
            }
        }, findViewById3);
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$8$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1772067967);
                Intent A07 = AbstractC31177DnL.A07(IgECPPlaygroundActivity.DEEPLINK_URL);
                C2FP.A07();
                IgECPPlaygroundActivity igECPPlaygroundActivity = IgECPPlaygroundActivity.this;
                C14360o3.A0B(igECPPlaygroundActivity, 2);
                C12260kU.A00.A08(IgECPPlaygroundActivity.DOMAIN).A0F(igECPPlaygroundActivity, A07, 10);
                C0f9.A0C(-285887452, A05);
            }
        }, findViewById(R.id.express_checkout_deeplink));
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$9$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int A05 = C0f9.A05(1180212003);
                EditText editText = IgECPPlaygroundActivity.this.deeplinkE2EUrlInputEditText;
                if (editText == null) {
                    C14360o3.A0F("deeplinkE2EUrlInputEditText");
                    throw C00O.createAndThrow();
                }
                Editable text = editText.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    Intent A07 = AbstractC31177DnL.A07(str);
                    C2FP.A07();
                    IgECPPlaygroundActivity igECPPlaygroundActivity = IgECPPlaygroundActivity.this;
                    C14360o3.A0B(igECPPlaygroundActivity, 2);
                    C12260kU.A00.A08(IgECPPlaygroundActivity.DOMAIN_E2E).A0F(igECPPlaygroundActivity, A07, 10);
                }
                C0f9.A0C(-1876500321, A05);
            }
        }, findViewById(R.id.express_checkout_deeplink_e2e));
        View findViewById4 = findViewById(R.id.express_checkout_edittext_deeplink_e2e_url_input_text);
        View findViewById5 = findViewById(R.id.express_checkout_edittext_deeplink_e2e_url_layout);
        C14360o3.A07(findViewById5);
        C14360o3.A0A(findViewById4);
        expandTouchArea(findViewById5, findViewById4, 100);
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$10$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-878775855);
                EditText editText = IgECPPlaygroundActivity.this.deeplinkE2EUrlInputEditText;
                if (editText == null) {
                    C14360o3.A0F("deeplinkE2EUrlInputEditText");
                    throw C00O.createAndThrow();
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                C0f9.A0C(166765097, A05);
            }
        }, findViewById4);
        final FBPayAnimationButton fBPayAnimationButton = (FBPayAnimationButton) findViewById(R.id.pay_button);
        fBPayAnimationButton.setEnabled(true);
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$11$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1247109414);
                FBPayAnimationButton.this.A07();
                C0f9.A0C(-1061826291, A05);
            }
        }, fBPayAnimationButton);
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$12$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2098197849);
                FBPayAnimationButton.this.A08(C63406Sjd.A04(""));
                C0f9.A0C(1428162463, A05);
            }
        }, findViewById(R.id.pay_button_confirm));
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$13$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2119573064);
                FBPayAnimationButton.this.A08(C63406Sjd.A05(null, null));
                C0f9.A0C(1624205306, A05);
            }
        }, findViewById(R.id.pay_button_cancel));
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity$onCreate$14$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1867217143);
                FBPayAnimationButton fBPayAnimationButton2 = FBPayAnimationButton.this;
                CharSequence text = fBPayAnimationButton2.getButtonView().getText();
                FBPayAnimationButton.A01(fBPayAnimationButton2);
                fBPayAnimationButton2.removeAllViews();
                FBPayAnimationButton.A00(fBPayAnimationButton2);
                fBPayAnimationButton2.getButtonView().setText(text);
                fBPayAnimationButton2.setFocusable(false);
                fBPayAnimationButton2.setImportantForAccessibility(2);
                fBPayAnimationButton2.getProgressMsgView().setImportantForAccessibility(2);
                C0f9.A0C(-1588239294, A05);
            }
        }, findViewById(R.id.pay_button_reset));
        C0f9.A07(1746430926, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return MSW.A0Q(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public UserSession getSession() {
        return MSW.A0Q(this);
    }
}
