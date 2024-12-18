package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewStub;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$5;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$InstagramAutofillOptOutCallbackHandler;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.extensions.autofill.model.AutofillSettings;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.meta.vault.service.base.DefaultVaultService;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import org.json.JSONException;

@Deprecated(message = "New logging should go through the {@link AutofillLoggerDeprecated} and instead use the {@link AutofillLogger}")
/* renamed from: X.QEt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58883QEt extends AbstractC63223SfY implements BEG, InterfaceC65639Tq2, InterfaceC65638Tq1 {
    public long A00;
    public C0SG A01;
    public InterfaceC58362lv A02;
    public AutofillSharedJSBridgeProxy A03;
    public SDQ A04;
    public C63380Siu A05;
    public SOE A06;
    public C62747SOq A07;
    public SKL A08;
    public C63009SaX A09;
    public AutofillData A0A;
    public AutofillSettings A0B;
    public RequestAutofillJSBridgeCall A0C;
    public C31349DqE A0D;
    public DefaultVaultService A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public List A0L;
    public TreeSet A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public final SZA A0W;
    public final SOY A0X;
    public final C5G6 A0Y;
    public final SKK A0Z;
    public final UserSession A0a;
    public final String A0b;
    public final Map A0c;
    public final Map A0d;
    public final Map A0e;
    public final Map A0f;
    public final Map A0g;

    public static void A02(C58883QEt c58883QEt, QF6 qf6) {
        C5G6 c5g6 = c58883QEt.A0Y;
        C63021Sam c63021Sam = c5g6.A02;
        boolean z = false;
        Integer A00 = c63021Sam.A00(null, 772803659, 0);
        String A02 = AbstractC63387Sj3.A02(qf6.A07(0));
        String A022 = AbstractC63387Sj3.A02(qf6.A05());
        if (!TextUtils.isEmpty(A02) && !TextUtils.isEmpty(A022)) {
            java.util.Set set = (java.util.Set) c5g6.A00.A0J.A00;
            if (!set.contains(A02) && !set.contains(A022)) {
                c58883QEt.A0U = false;
                Intent intent = ((AbstractC63223SfY) c58883QEt).A01;
                if (intent != null) {
                    z = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false);
                }
                Map map = c58883QEt.A0f;
                Boolean bool = (Boolean) map.get(A022);
                if (bool != null) {
                    if (z) {
                        Toast.makeText(((AbstractC63223SfY) c58883QEt).A00, AnonymousClass001.A1D("Autofill Opt Out: ", bool.booleanValue()), 0).show();
                    }
                    if (!bool.booleanValue()) {
                        c58883QEt.A0E(qf6);
                    }
                } else {
                    C63305ShB A002 = C63305ShB.A00();
                    AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler = new AutofillController$InstagramAutofillOptOutCallbackHandler(((AbstractC63223SfY) c58883QEt).A00, c58883QEt, qf6, map, z);
                    BrowserLiteCallback browserLiteCallback = A002.A06;
                    if (browserLiteCallback != null) {
                        try {
                            browserLiteCallback.CyU(autofillController$InstagramAutofillOptOutCallbackHandler, A022);
                        } catch (RemoteException e) {
                            C0K8.A0J("BrowserLiteCallbacker", "Error in onAutofillOptOutCall", e);
                        }
                    }
                }
                c63021Sam.A01(A00, null, 772803659);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.RqR, java.lang.Object] */
    public final void A06() {
        this.A0P = false;
        BrowserLiteCallback browserLiteCallback = C63305ShB.A00().A06;
        if (browserLiteCallback != null) {
            try {
                browserLiteCallback.EUK();
            } catch (RemoteException e) {
                C0K8.A0J("BrowserLiteCallbacker", "Error in setHasShownFbPayDisclosure", e);
            }
        }
        C5G6 c5g6 = this.A0Y;
        String str = c5g6.A00.A09.A05;
        AbstractC167017dG.A1N("FBPAY_DISCLOSURE_SHOWN", str);
        ?? obj = new Object();
        obj.A0I = "FBPAY_DISCLOSURE_SHOWN";
        obj.A0B = str;
        AbstractC63402SjX.A0B(c5g6, this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall] */
    public final void A08(Bundle bundle, AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, AutofillData autofillData, Integer num) {
        ?? browserLiteJSBridgeCall = new BrowserLiteJSBridgeCall(super.A00, AbstractC166987dD.A0b(), bundle, "_AutofillExtensions", "requestAutoFill", "");
        this.A0C = browserLiteJSBridgeCall;
        AutofillController$5 autofillController$5 = new AutofillController$5(autofillSharedJSBridgeProxy, this, autofillData, browserLiteJSBridgeCall, num);
        C63305ShB A00 = C63305ShB.A00();
        C63305ShB.A02(new QDr(A00, (BrowserLiteJSBridgeCall) browserLiteJSBridgeCall, autofillController$5), A00, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0134, code lost:
    
        if (r5.A00.A04.A0A(false) == false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.C0SG r15, X.C61602RqR r16, java.lang.Integer r17, java.lang.Integer r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58883QEt.A09(X.0SG, X.RqR, java.lang.Integer, java.lang.Integer, java.lang.String):void");
    }

    public C58883QEt(C5G6 c5g6, SKL skl, C63009SaX c63009SaX, UserSession userSession, DefaultVaultService defaultVaultService, Map map) {
        SKK skk = new SKK(C18950wb.A01);
        this.A0g = AbstractC166987dD.A1G();
        this.A0U = false;
        this.A0Q = false;
        this.A0O = false;
        this.A0N = false;
        this.A01 = null;
        this.A0P = false;
        this.A02 = null;
        this.A0V = false;
        this.A0F = null;
        this.A03 = null;
        this.A0M = null;
        this.A0T = false;
        this.A0R = false;
        this.A0S = false;
        this.A0Y = c5g6;
        this.A08 = skl;
        this.A09 = c63009SaX;
        this.A0f = new ConcurrentHashMap(map);
        this.A0c = AbstractC166987dD.A1G();
        this.A0d = AbstractC166987dD.A1G();
        this.A0e = AbstractC166987dD.A1G();
        this.A0W = new SZA(AbstractC25225BEi.A16(this));
        this.A0b = AbstractC166997dE.A0o();
        this.A0X = new SOY(c5g6, AbstractC25225BEi.A16(this));
        this.A0E = defaultVaultService;
        this.A0Z = skk;
        this.A0a = userSession;
    }

    public static AutofillData A00(C58883QEt c58883QEt, C63380Siu c63380Siu) {
        Map A1G;
        AutofillData autofillData;
        AutofillData autofillData2;
        C62620SJd c62620SJd = c58883QEt.A0Y.A00;
        Object obj = c62620SJd.A06.A00;
        AutofillData autofillData3 = c58883QEt.A0A;
        if (autofillData3 != null && autofillData3.A02()) {
            return c58883QEt.A0A;
        }
        if (obj != null) {
            A1G = AbstractC61726Rsh.A00((QIp) c62620SJd.A06.A00);
        } else {
            A1G = AbstractC166987dD.A1G();
        }
        AutofillData autofillData4 = new AutofillData(A1G);
        if (autofillData4.A02()) {
            return autofillData4;
        }
        QIh qIh = c62620SJd.A09;
        SYH syh = (SYH) c63380Siu.A0T.getOrDefault(qIh.A01, null);
        Map map = c58883QEt.A0d;
        C14360o3.A0B(map, 2);
        if (syh == null || (autofillData = syh.A00) == null) {
            autofillData = (AutofillData) map.get(AbstractC63387Sj3.A02(qIh.A01));
        }
        if (autofillData != null) {
            return autofillData;
        }
        AutofillData autofillData5 = autofillData4;
        if (!AbstractC62771SQn.A01(autofillData4)) {
            autofillData5 = null;
        }
        if (AbstractC62771SQn.A01(c58883QEt.A0A)) {
            autofillData5 = c58883QEt.A0A;
        }
        if (autofillData5 != null) {
            return autofillData5;
        }
        if (!c63380Siu.A0E.isEmpty() && (autofillData2 = (AutofillData) AbstractC166987dD.A16(c63380Siu.A0E)) != null && autofillData2.A02()) {
            return autofillData2;
        }
        return null;
    }

    public static C3O0 A01(C58883QEt c58883QEt) {
        FragmentActivity activity;
        InterfaceC172717mh interfaceC172717mh = ((AbstractC63223SfY) c58883QEt).A03;
        if (interfaceC172717mh != null && (activity = interfaceC172717mh.getActivity()) != null && ((BrowserLiteFragment) interfaceC172717mh).A0D != null) {
            ViewStub viewStub = new ViewStub(activity);
            viewStub.setLayoutResource(R.layout.layout_autofill_snack_bar);
            ((BrowserLiteFragment) ((AbstractC63223SfY) c58883QEt).A03).A0D.addView(viewStub);
            return new C3O0(viewStub, false);
        }
        return null;
    }

    public final Bundle A03() {
        Intent intent = super.A01;
        if (intent != null) {
            return intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        }
        return null;
    }

    public final void A07(Context context, C61602RqR c61602RqR, Integer num, Integer num2, String str, List list) {
        SZA sza = this.A0W;
        if (sza != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C5G6 c5g6 = this.A0Y;
                sza.A01(context, c5g6.A02, c5g6, null, c61602RqR, num, num2, str, list);
            } else {
                C5G6 c5g62 = this.A0Y;
                STG.A00(new TRU(context, sza, c5g62.A02, c5g62, null, c61602RqR, num, num2, str, list));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (r4 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r26, java.lang.Integer r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58883QEt.A0A(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy, java.lang.Integer, java.util.List):void");
    }

    public final void A0B(AutofillData autofillData) {
        QF6 C9a;
        AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy;
        InterfaceC172727mi interfaceC172727mi = super.A04;
        if (interfaceC172727mi != null && (C9a = interfaceC172727mi.C9a()) != null && autofillData != null && (autofillSharedJSBridgeProxy = (AutofillSharedJSBridgeProxy) this.A0g.get(C9a)) != null) {
            try {
                autofillSharedJSBridgeProxy.A0C(autofillSharedJSBridgeProxy.A0A(AbstractC63402SjX.A09(autofillData)));
            } catch (JSONException unused) {
                throw AbstractC166987dD.A14("Illegal JSON for autofill save");
            }
        }
    }

    public final void A0C(AutofillData autofillData) {
        String str;
        Map map = this.A0c;
        C62620SJd c62620SJd = this.A0Y.A00;
        C14360o3.A0B(c62620SJd, 0);
        boolean z = true;
        AbstractC43592JPx.A1W(AbstractC63387Sj3.A02(c62620SJd.A09.A01), map, AbstractC167007dF.A1W(autofillData));
        InterfaceC172727mi interfaceC172727mi = super.A04;
        if (interfaceC172727mi != null) {
            this.A0d.put(((BrowserLiteFragment) interfaceC172727mi).A0m, autofillData);
        }
        if (autofillData == null) {
            z = false;
        }
        this.A0U = z;
        String str2 = null;
        if (autofillData != null) {
            str = AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, autofillData.A00);
        } else {
            str = null;
        }
        this.A0H = str;
        if (autofillData != null) {
            str2 = AbstractC166987dD.A1A("ent_id", autofillData.A00);
        }
        this.A0G = str2;
    }

    public final void A0D(C61602RqR c61602RqR) {
        C62747SOq c62747SOq = this.A07;
        if (c62747SOq != null) {
            List list = (List) c62747SOq.A00.A00.A0C.A00;
            if (!list.isEmpty()) {
                Map A01 = AbstractC62772SQo.A01((C45126Jxv) AbstractC166987dD.A16(list));
                if (!A01.isEmpty()) {
                    AutofillData autofillData = new AutofillData(A01);
                    WeakReference weakReference = c62747SOq.A02;
                    C58883QEt A0K = AbstractC58318PtA.A0K(weakReference);
                    if (A0K != null && A0K.A03 != null) {
                        A0K.A03.A0B(BusinessExtensionJSBridgeCall.A00(A0K.A0Y.A00.A08.A01, autofillData.A01()));
                    }
                    C58883QEt A0K2 = AbstractC58318PtA.A0K(weakReference);
                    if (A0K2 != null) {
                        A0K2.A0C(autofillData);
                    }
                }
            }
            Context context = super.A00;
            C3O0 A012 = A01(this);
            if (context != null && A012 != null) {
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A04();
                c146106i8.A0D = context.getString(2131953433);
                c146106i8.A06();
                c146106i8.A0D(context.getString(2131953429));
                c146106i8.A0A(new TGE(this, c61602RqR));
                c146106i8.A01();
                C31349DqE A00 = c146106i8.A00();
                A012.A06(80);
                A012.A0A(A00);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.QF6 r9) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58883QEt.A0E(X.QF6):void");
    }

    public final void A0F(QF6 qf6) {
        Context context = super.A00;
        if (context != null) {
            C9GR.A03(context, context.getString(2131972724), null, 5000);
            if (A0I()) {
                AbstractC167007dF.A0J().postDelayed(new TNF(this, qf6), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
        }
    }

    public final void A0G(QF6 qf6) {
        Context context = super.A00;
        if (context != null) {
            C9GR.A03(context, context.getString(2131972773), null, 5000);
            if (A0I()) {
                AbstractC167007dF.A0J().postDelayed(new TNF(this, qf6), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
        }
    }

    public final boolean A0H() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A0a);
        return AbstractC167017dG.A1b(A00, A00.A0M, C23031Ai.A8c, 165);
    }

    public final boolean A0I() {
        if (this.A05 != null) {
            C62620SJd c62620SJd = this.A0Y.A00;
            if (c62620SJd.A09.A03 && c62620SJd.A0I.A00.equals(C05F.A01)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0J() {
        if (this.A0P && !AbstractC166987dD.A0x(this.A0a).getBoolean("browser_autofill_fbpay_disclosure_shown", true)) {
            return true;
        }
        return false;
    }

    public final boolean A0K(String str) {
        Boolean bool;
        if (str != null) {
            Map map = this.A0f;
            C14360o3.A0B(map, 1);
            String A02 = AbstractC63387Sj3.A02(str);
            if (A02 == null || (bool = (Boolean) map.get(A02)) == null) {
                return true;
            }
            return bool.booleanValue();
        }
        return true;
    }

    @Override // X.AbstractC63223SfY, X.BCM
    public final void destroy() {
        this.A0g.clear();
        super.destroy();
    }

    public final SO2 A04(boolean z, boolean z2) {
        boolean A0H = A0H();
        C62620SJd c62620SJd = this.A0Y.A00;
        C14360o3.A0B(c62620SJd, 0);
        MUG mug = c62620SJd.A0K;
        Object obj = mug.A03;
        EnumC61149RgA enumC61149RgA = EnumC61149RgA.A04;
        return new SO2(A0H, AbstractC167007dF.A1X(obj, enumC61149RgA), AbstractC167007dF.A1X(mug.A00, enumC61149RgA), z2, z);
    }

    public final void A05() {
        if (A03() != null && super.A00 != null) {
            C6XJ.A06(super.A00, A03(), ModalActivity.class, "browser_settings");
            if (super.A04 != null) {
                SOY soy = this.A0X;
                String str = this.A0Y.A00.A09.A01;
                Bundle A03 = A03();
                C61602RqR A00 = soy.A00("CLICK_BROWSER_SETTING_FROM_TOAST", false);
                A00.A08 = str;
                C63305ShB.A00().A07(A03, A00.A00().A01());
            }
        }
    }
}
