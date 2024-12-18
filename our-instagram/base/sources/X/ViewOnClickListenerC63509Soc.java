package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;
import com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel;
import com.facebook.browser.lite.views.BrowserLiteErrorScreen;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABRefreshEvent;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.common.link.LinkParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.fbpay.hub.orders.api.FBPayOrder;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.appwidget.DirectRecipientSearchActivity;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import com.instagram.direct.appwidget.DirectWidgetConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.Soc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC63509Soc implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC63509Soc(DialogC58693Q0w dialogC58693Q0w, Q7c q7c, int i) {
        this.A00 = i;
        if (12 - i != 0) {
            this.A01 = dialogC58693Q0w;
            this.A02 = q7c;
        } else {
            this.A02 = q7c;
            this.A01 = dialogC58693Q0w;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC63509Soc(i, obj, obj2), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        IABEvent iABRefreshEvent;
        int i;
        Bundle bundle;
        boolean z;
        Drawable drawable;
        String A052;
        String str;
        IABEvent iABEvent;
        int A053;
        int i2;
        C63193Sev A02;
        C58883QEt c58883QEt;
        C62747SOq c62747SOq;
        String str2;
        boolean z2;
        Object obj;
        AbstractC64100SzH abstractC64100SzH;
        Object obj2;
        Rif rif;
        C2GS c2gs;
        Object c63198Sf0;
        Object c63167SeR;
        String str3;
        Rif rif2;
        Bundle bundle2;
        String str4;
        String str5;
        String str6;
        Object c62902SWi;
        C2GS c2gs2;
        String str7;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-518086320);
                BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) this.A01;
                C23016ACq c23016ACq = browserLiteFragment.A0e;
                if (!c23016ACq.A0p) {
                    iABRefreshEvent = IABEvent.A04;
                } else {
                    long now = c23016ACq.A0m.now();
                    iABRefreshEvent = new IABRefreshEvent(now, c23016ACq.A0Z, now, "error_screen_tap");
                }
                browserLiteFragment.Ckl(browserLiteFragment.A09, iABRefreshEvent, browserLiteFragment.A0f);
                BrowserLiteErrorScreen browserLiteErrorScreen = browserLiteFragment.A0b;
                if (browserLiteErrorScreen != null) {
                    browserLiteErrorScreen.A00();
                }
                ((SystemWebView) ((QF6) this.A02)).A04.reload();
                i = -178579618;
                C0f9.A0C(i, A05);
                return;
            case 1:
                BwPBrowserLiteChrome bwPBrowserLiteChrome = (BwPBrowserLiteChrome) this.A01;
                C62614SIw c62614SIw = (C62614SIw) this.A02;
                if (bwPBrowserLiteChrome.A08 != null && (bundle = bwPBrowserLiteChrome.A01) != null) {
                    C63305ShB A00 = C63305ShB.A00();
                    C23016ACq c23016ACq2 = ((BrowserLiteFragment) bwPBrowserLiteChrome.A08).A0e;
                    c23016ACq2.getClass();
                    A00.A06(bundle, c23016ACq2.A00(), ((BrowserLiteFragment) bwPBrowserLiteChrome.A08).A0f);
                    InterfaceC172727mi interfaceC172727mi = c62614SIw.A05;
                    QF6 C9a = interfaceC172727mi.C9a();
                    if (C9a != null) {
                        boolean z3 = true;
                        if (!C9a.A0b || (str = C9a.A0M) == null || str.length() == 0) {
                            z3 = false;
                        }
                        z = false;
                        if (!z3 && ((A052 = C9a.A05()) == null || A052.length() == 0)) {
                            return;
                        }
                        C63193Sev c63193Sev = new C63193Sev();
                        Context context = c62614SIw.A01;
                        AbstractC61710RsR.A00(context, c63193Sev, c62614SIw.A04, interfaceC172727mi, c62614SIw.A06, AbstractC166987dD.A1H());
                        ArrayList arrayList = c63193Sev.A04;
                        if (arrayList != null) {
                            Q5I A002 = Q5I.A00(context, new C63935SwA(c62614SIw), arrayList, false);
                            c62614SIw.A00 = A002;
                            A002.A01(AbstractC53242c7.A0H(context, R.attr.iabMenuBackgroundRes));
                            Q5I q5i = c62614SIw.A00;
                            if (q5i != null) {
                                q5i.setAnchorView(c62614SIw.A03);
                            }
                            Q5I q5i2 = c62614SIw.A00;
                            if (q5i2 != null) {
                                q5i2.show();
                            }
                            Q5I q5i3 = c62614SIw.A00;
                            drawable = null;
                            if (q5i3 == null || (r1 = q5i3.getListView()) == null) {
                                return;
                            }
                            r1.setOverScrollMode(2);
                            r1.setVerticalScrollBarEnabled(z);
                            r1.setDivider(drawable);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                DefaultBrowserLiteChrome defaultBrowserLiteChrome = (DefaultBrowserLiteChrome) this.A01;
                ArrayList arrayList2 = (ArrayList) this.A02;
                C63305ShB A003 = C63305ShB.A00();
                BrowserLiteFragment browserLiteFragment2 = (BrowserLiteFragment) defaultBrowserLiteChrome.A05;
                A003.A06(defaultBrowserLiteChrome.A01, browserLiteFragment2.A0e.A00(), browserLiteFragment2.A0f);
                QF6 C9a2 = defaultBrowserLiteChrome.A06.C9a();
                if (C9a2 != null) {
                    if ((C9a2.A0b && !TextUtils.isEmpty(C9a2.A0M)) || !TextUtils.isEmpty(C9a2.A05())) {
                        C63193Sev c63193Sev2 = new C63193Sev();
                        Context context2 = defaultBrowserLiteChrome.getContext();
                        AbstractC61710RsR.A00(context2, c63193Sev2, defaultBrowserLiteChrome.A05, defaultBrowserLiteChrome.A06, arrayList2, AbstractC166987dD.A1H());
                        ArrayList arrayList3 = c63193Sev2.A04;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            drawable = null;
                            z = false;
                            Q5I A004 = Q5I.A00(context2, new C63936SwB(defaultBrowserLiteChrome), c63193Sev2.A04, false);
                            defaultBrowserLiteChrome.A04 = A004;
                            A004.A01(AbstractC53242c7.A0H(context2, R.attr.iabMenuBackgroundRes));
                            defaultBrowserLiteChrome.A04.setAnchorView(defaultBrowserLiteChrome.A02);
                            defaultBrowserLiteChrome.A04.show();
                            ListView listView = defaultBrowserLiteChrome.A04.getListView();
                            listView.setOverScrollMode(2);
                            listView.setVerticalScrollBarEnabled(z);
                            listView.setDivider(drawable);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                A05 = C0f9.A05(-1010374356);
                IGWatchAndBrowseLiteChrome iGWatchAndBrowseLiteChrome = (IGWatchAndBrowseLiteChrome) this.A02;
                Intent intent = iGWatchAndBrowseLiteChrome.A00;
                if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_OPEN_MENU_AFTER_EXPANSION_ON_PARTIAL_SHEET_THREE_DOTS_CLICKED", false)) {
                    iGWatchAndBrowseLiteChrome.A0H = true;
                    C62569SGu c62569SGu = ((BrowserLiteFragment) ((InterfaceC172717mh) this.A01)).A0g;
                    if (c62569SGu != null) {
                        C63397SjR c63397SjR = c62569SGu.A01;
                        if (!c63397SjR.A0d || !c63397SjR.A0f) {
                            c62569SGu.A02.A0U(C05F.A0u);
                        }
                    }
                } else {
                    C63305ShB A005 = C63305ShB.A00();
                    BrowserLiteFragment browserLiteFragment3 = (BrowserLiteFragment) ((InterfaceC172717mh) this.A01);
                    C23016ACq c23016ACq3 = browserLiteFragment3.A0e;
                    if (c23016ACq3 != null) {
                        iABEvent = c23016ACq3.A00();
                    } else {
                        iABEvent = null;
                    }
                    A005.A06(iGWatchAndBrowseLiteChrome.A01, iABEvent, browserLiteFragment3.A0f);
                    IGWatchAndBrowseLiteChrome.A02(iGWatchAndBrowseLiteChrome);
                }
                i = -856819016;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A053 = C0f9.A05(787030095);
                C63305ShB A006 = C63305ShB.A00();
                com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome defaultBrowserLiteChrome2 = (com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome) this.A01;
                BrowserLiteFragment browserLiteFragment4 = (BrowserLiteFragment) defaultBrowserLiteChrome2.A0D;
                A006.A06(defaultBrowserLiteChrome2.A02, browserLiteFragment4.A0e.A00(), browserLiteFragment4.A0f);
                AbstractCollection abstractCollection = (AbstractCollection) this.A02;
                QF6 qf6 = defaultBrowserLiteChrome2.A0G;
                if (qf6 != null && !TextUtils.isEmpty(qf6.A05())) {
                    HashSet A0k = AbstractC31171DnF.A0k(Collections.singleton("OPEN_SAVED_LINKS"));
                    defaultBrowserLiteChrome2.A01.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON");
                    C63193Sev c63193Sev3 = new C63193Sev();
                    Context context3 = defaultBrowserLiteChrome2.A00;
                    InterfaceC172727mi interfaceC172727mi2 = defaultBrowserLiteChrome2.A0E;
                    InterfaceC172717mh interfaceC172717mh = defaultBrowserLiteChrome2.A0D;
                    if (interfaceC172727mi2.canGoBack() || interfaceC172727mi2.canGoForward()) {
                        C58875QDy.A00(c63193Sev3, interfaceC172727mi2);
                    }
                    Iterator it = abstractCollection.iterator();
                    while (it.hasNext()) {
                        BaseBundle baseBundle = (BaseBundle) it.next();
                        String string = baseBundle.getString("action");
                        if (!A0k.contains(string)) {
                            String string2 = baseBundle.getString("KEY_LABEL");
                            QF6 C9a3 = ((BrowserLiteFragment) interfaceC172727mi2).C9a();
                            if (C9a3 == null || !C9a3.A0b || S8V.A00.contains(string)) {
                                int i3 = baseBundle.getInt("KEY_ICON_RES");
                                if (string == null) {
                                    if (string2.equals("MENU_OPEN_WITH") && (A02 = C58876QDz.A01(context3, interfaceC172717mh, interfaceC172727mi2, i3)) != null) {
                                    }
                                } else {
                                    A02 = C63193Sev.A02(string);
                                    A02.A03 = string2;
                                    if (i3 > 0) {
                                        A02.A00 = i3;
                                    }
                                }
                                if ("ACTION_REPORT".equals(string)) {
                                    A02.A01 = R.style.IgDestructiveText;
                                }
                                c63193Sev3.A04(A02);
                            }
                        }
                    }
                    ArrayList arrayList4 = c63193Sev3.A04;
                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                        Q5I A007 = Q5I.A00(context3, new C63938SwD(defaultBrowserLiteChrome2), c63193Sev3.A04, defaultBrowserLiteChrome2.A0I);
                        defaultBrowserLiteChrome2.A0C = A007;
                        A007.A01(R.drawable.browser_menu_bg);
                        defaultBrowserLiteChrome2.A0C.setAnchorView(defaultBrowserLiteChrome2.A06);
                        defaultBrowserLiteChrome2.A0C.show();
                        defaultBrowserLiteChrome2.A0C.getListView().setOverScrollMode(2);
                        defaultBrowserLiteChrome2.A0C.getListView().setVerticalScrollBarEnabled(false);
                        defaultBrowserLiteChrome2.A0C.getListView().setDivider(null);
                    }
                }
                i2 = 285488700;
                C0f9.A0C(i2, A053);
                return;
            case 5:
                A05 = C0f9.A05(302950328);
                QEA qea = (QEA) this.A01;
                if (((QEB) qea).A00 != null && ((QEB) qea).A02 != null) {
                    IgRadioGroup igRadioGroup = (IgRadioGroup) this.A02;
                    AutofillData autofillData = (AutofillData) igRadioGroup.requireViewById(igRadioGroup.A00).getTag();
                    String str8 = ((QEB) qea).A02.A00.A08.A01;
                    autofillData.getClass();
                    ((QEB) qea).A00.A0B(BusinessExtensionJSBridgeCall.A00(str8, autofillData.A01()));
                    C58883QEt c58883QEt2 = ((QEB) qea).A03;
                    if (c58883QEt2 != null) {
                        c58883QEt2.A0C(autofillData);
                    }
                    SZO szo = null;
                    AbstractC61716RsX.A00(((QEB) qea).A02.A00, autofillData, null, C05F.A00);
                    QIl qIl = ((QEB) qea).A02.A00.A00;
                    java.util.Set set = qIl.A04;
                    java.util.Set set2 = qIl.A07;
                    SOY soy = ((QEB) qea).A01;
                    if (soy != null) {
                        C61602RqR A008 = soy.A00("ACCEPTED_AUTOFILL", false);
                        A008.A0A = ((QEB) qea).A06;
                        A008.A08 = ((QEB) qea).A05;
                        A008.A00 = ((QEB) qea).A07.size();
                        A008.A0G = ((QEB) qea).A02.A00.A00.A00;
                        String str9 = "";
                        if (set == null || set.isEmpty()) {
                            str2 = "";
                        } else {
                            str2 = AbstractC61723Rse.A00(set);
                        }
                        A008.A06 = str2;
                        if (set2 != null && !set2.isEmpty()) {
                            str9 = AbstractC61723Rse.A00(set2);
                        }
                        A008.A0F = str9;
                        A008.A07 = AbstractC63402SjX.A02(AbstractC58320PtC.A1C(((QEB) qea).A07.get(0)));
                        if (!qea.A01) {
                            boolean z4 = ((QEB) qea).A09;
                            boolean z5 = ((QEB) qea).A08;
                            if (!z4 || z5) {
                                z2 = false;
                                A008.A0P = z2;
                                qea.A0H(A008);
                                szo = A008.A00();
                            }
                        }
                        z2 = true;
                        A008.A0P = z2;
                        qea.A0H(A008);
                        szo = A008.A00();
                    }
                    AbstractC63402SjX.A0A(qea.mArguments, ((QEB) qea).A02, szo);
                    if (qea.A0I(false) && ((QEB) qea).A02.A00.A01.A01 && (c58883QEt = ((QEB) qea).A03) != null && (c62747SOq = c58883QEt.A07) != null) {
                        AbstractC63317ShP.A02(c62747SOq.A01, c62747SOq.A00.A00.A01.A00);
                    }
                    qea.A07();
                    i = 1529770702;
                } else {
                    i = 1996394493;
                }
                C0f9.A0C(i, A05);
                return;
            case 6:
                A053 = C0f9.A05(-561701805);
                QE7 qe7 = (QE7) this.A01;
                C5G6 c5g6 = qe7.A00;
                if (c5g6 != null) {
                    C62620SJd c62620SJd = c5g6.A00;
                    Integer num = (Integer) this.A02;
                    AbstractC167017dG.A1N(c62620SJd, num);
                    Integer num2 = C05F.A00;
                    AbstractC62769SQl.A01(c62620SJd, new C51760Mtj(num2, num, num2, 3), C05F.A0N);
                }
                qe7.A06().cancel();
                i2 = 668917952;
                C0f9.A0C(i2, A053);
                return;
            case 7:
                A053 = C0f9.A05(984895735);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING", ((AutofillData) this.A02).A01().toString());
                A0b.putString("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE", "save_autofill_request_fragment");
                C0SG c0sg = (C0SG) this.A01;
                C6XJ.A05(c0sg.requireActivity(), A0b, ModalActivity.class, AbstractC111324zv.A00(2300), 1000);
                c0sg.A07();
                i2 = 1403057514;
                C0f9.A0C(i2, A053);
                return;
            case 8:
                A053 = C0f9.A05(-1266781891);
                FragmentActivity activity = ((InterfaceC172717mh) this.A01).getActivity();
                if (activity != null) {
                    QET qet = (QET) this.A02;
                    UserSession userSession = qet.A01;
                    IGCallExtensionModel iGCallExtensionModel = qet.A00;
                    String str10 = iGCallExtensionModel.A01;
                    String A0R = AnonymousClass001.A0R("tel: +", iGCallExtensionModel.A00);
                    C14360o3.A0B(A0R, 3);
                    C64480TFq c64480TFq = new C64480TFq(userSession, str10, "ig_iab_sticky_footer_clicked");
                    c64480TFq.A02(AbstractC23451Ch.A07(activity, "android.permission.CALL_PHONE"));
                    C193328hC c193328hC = new C193328hC((Activity) activity);
                    c193328hC.A0t(true);
                    String formatNumber = PhoneNumberUtils.formatNumber(AbstractC002300n.A0d(A0R, "tel:", "", false), C1Q2.A02().getCountry());
                    C14360o3.A0A(formatNumber);
                    c193328hC.A0d(new DialogInterfaceOnClickListenerC63422Sk0(activity, c64480TFq, A0R, 4), AbstractC31177DnL.A0b(activity, formatNumber, 2131954463));
                    c193328hC.A0C(new DialogInterfaceOnCancelListenerC63417Sjv(c64480TFq, 0));
                    Dialog A022 = c193328hC.A02();
                    Window window = A022.getWindow();
                    if (window != null) {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        if (attributes != null) {
                            attributes.gravity = 80;
                            ((ViewGroup.LayoutParams) attributes).width = -1;
                        }
                        window.setAttributes(attributes);
                    }
                    C0fJ.A00(A022);
                    C64480TFq.A01(c64480TFq, "ctc_confirmation_dialog_shown");
                }
                i2 = -62597738;
                C0f9.A0C(i2, A053);
                return;
            case 9:
                A053 = C0f9.A05(-1896907363);
                C12260kU.A0A(((View) this.A01).getContext(), AbstractC31177DnL.A07(((QEU) this.A02).A00.A00));
                i2 = 1532175825;
                C0f9.A0C(i2, A053);
                return;
            case 10:
                A053 = C0f9.A05(-1505372154);
                AbstractC58323PtF.A1I(AbstractC58318PtA.A0L(((Q7b) this.A02).A01), C05F.A0Y, C05F.A00, C05F.A0C, new C09530e4[0]);
                ((Dialog) this.A01).dismiss();
                i2 = 421651245;
                C0f9.A0C(i2, A053);
                return;
            case 11:
                A05 = C0f9.A05(-897335318);
                InterfaceC09390do interfaceC09390do = ((Q7b) this.A02).A01;
                Object A023 = AbstractC58318PtA.A0L(interfaceC09390do).A07.A02();
                if (A023 instanceof InterfaceC65651TqQ) {
                    obj = (InterfaceC65208Tfw) A023;
                } else {
                    obj = null;
                }
                Integer num3 = C05F.A01;
                Integer num4 = C05F.A00;
                boolean z6 = true;
                if (obj == null) {
                    z6 = false;
                }
                AbstractC58323PtF.A1I(AbstractC58318PtA.A0L(interfaceC09390do), num3, num4, C05F.A0C, AbstractC25230BEn.A1b(AbstractC43591JPw.A00(1099), String.valueOf(z6)));
                if (obj != null) {
                    SO7 so7 = ((AbstractC64100SzH) obj).A00;
                    so7.A03.A00(new TKO(so7));
                }
                ((Dialog) this.A01).dismiss();
                i = 1274304140;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A053 = C0f9.A05(-1642149846);
                Q7c q7c = (Q7c) this.A02;
                Integer num5 = C05F.A0N;
                Integer num6 = C05F.A00;
                InterfaceC09390do interfaceC09390do2 = q7c.A01;
                AbstractC58318PtA.A0L(interfaceC09390do2).A0E(new L2D(num5, num6, num5, (C09530e4[]) Arrays.copyOf(new C09530e4[0], 0)));
                Object A024 = AbstractC58318PtA.A0L(interfaceC09390do2).A07.A02();
                if ((A024 instanceof QKL) && (abstractC64100SzH = (AbstractC64100SzH) A024) != null) {
                    final SO7 so72 = abstractC64100SzH.A00;
                    so72.A03.A00(new Runnable() { // from class: X.TKP
                        @Override // java.lang.Runnable
                        public final void run() {
                            SO7 so73 = SO7.this;
                            if (so73.A02.A00 instanceof QKL) {
                                C62540SFr c62540SFr = so73.A01;
                                c62540SFr.A00 = null;
                                c62540SFr.A01 = true;
                                so73.A01(null);
                                so73.A00();
                            }
                        }
                    });
                }
                ((Dialog) this.A01).dismiss();
                i2 = -1265366955;
                C0f9.A0C(i2, A053);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A053 = C0f9.A05(551792414);
                ((Dialog) this.A01).dismiss();
                AbstractC25227BEk.A1B((Fragment) this.A02);
                i2 = 1663587764;
                C0f9.A0C(i2, A053);
                return;
            case 14:
                A05 = C0f9.A05(1037366238);
                Q7f q7f = (Q7f) this.A02;
                CompoundButton compoundButton = (CompoundButton) this.A01;
                boolean z7 = true;
                if (compoundButton.getVisibility() != 0 || !compoundButton.isChecked()) {
                    z7 = false;
                }
                Integer num7 = C05F.A00;
                Q7f.A00(q7f, num7, num7, AbstractC25230BEn.A1b(AbstractC43591JPw.A00(746), String.valueOf(z7)));
                C44455JlN A0L = AbstractC58318PtA.A0L(q7f.A01);
                Object A025 = A0L.A07.A02();
                if ((A025 instanceof InterfaceC65652TqR) && (obj2 = (InterfaceC65652TqR) A025) != null) {
                    A0L.A01 = Boolean.valueOf(z7);
                    SZC szc = A0L.A00;
                    SO7 so73 = ((AbstractC64100SzH) obj2).A00;
                    so73.A03.A00(new RunnableC64686TPr(szc, so73, z7));
                }
                i = 527760655;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(593363351);
                C58764Q7t c58764Q7t = (C58764Q7t) this.A01;
                Q8Z q8z = c58764Q7t.A01;
                FragmentActivity requireActivity = c58764Q7t.requireActivity();
                Bundle requireArguments = c58764Q7t.requireArguments();
                boolean isChecked = ((CompoundButton) this.A02).isChecked();
                LinkedHashMap A08 = AbstractC58442PvL.A08(AbstractC58319PtB.A0W(requireArguments));
                A08.put("auth_factor_type", RiX.BIO);
                if (isChecked) {
                    rif = Rif.TURN_OFF_USE_BIO_ID;
                } else {
                    rif = Rif.TURN_ON_USE_BIO_ID;
                }
                C63307ShD.A02("target_name", rif, A08).Chz("user_click_auth_atomic", A08);
                C58770Q8c c58770Q8c = q8z.A06;
                C2GT c2gt = c58770Q8c.A02;
                C63406Sjd A0S = AbstractC58318PtA.A0S(c2gt);
                if (A0S != null) {
                    if (C63406Sjd.A0J(A0S)) {
                        String A009 = Q8Z.A00(q8z);
                        Bundle bundle3 = q8z.A00;
                        if (!C63406Sjd.A0H(AbstractC58318PtA.A0S(c58770Q8c.A03))) {
                            C63406Sjd.A0B(c2gt, new C63615SqN(bundle3, c58770Q8c, A009, 1));
                        }
                    } else if (C63406Sjd.A0G(A0S)) {
                        Throwable th = A0S.A02;
                        if (th instanceof C64864TXp) {
                            th.getClass();
                            int i4 = ((C64864TXp) th).A00;
                            if (i4 == 102) {
                                Object obj3 = A0S.A01;
                                if (obj3 != null) {
                                    c58770Q8c.A02(q8z.A00, Q8Z.A00(q8z), ((C63152Se0) obj3).A06);
                                }
                            } else if (i4 == 11) {
                                c2gs = q8z.A05;
                                c63198Sf0 = new C63198Sf0(null, null, new DialogInterfaceOnClickListenerC63421Sjz(3, requireActivity, q8z), null, null, null, null, null, 2131953333, 2131953335, 0, 0, 1, 2131953336, 2131953334, true);
                                c63167SeR = new C63167SeR(c63198Sf0);
                                c2gs.A0A(c63167SeR);
                            }
                            if (i4 != 12 && i4 != 1) {
                                C63406Sjd A0S2 = AbstractC58318PtA.A0S(q8z.A01);
                                if (C63406Sjd.A0J(A0S2) && "DELETED".equalsIgnoreCase(((SBl) C63406Sjd.A08(A0S2)).A00)) {
                                    str3 = "SETUP_PIN_TO_CREATE_BIO_HUB";
                                } else {
                                    str3 = "VERIFY_PIN_TO_ENABLE_BIO_HUB";
                                }
                                String A0010 = Q8Z.A00(q8z);
                                Bundle bundle4 = q8z.A00;
                                c2gs = c58770Q8c.A04;
                                if (!C63406Sjd.A0H(AbstractC58318PtA.A0S(c2gs))) {
                                    c2gs.A0A(C63406Sjd.A03(null));
                                    int A03 = c58770Q8c.A01.A03(15);
                                    if (A03 != 0) {
                                        c63167SeR = C63406Sjd.A05(null, new C64864TXp(A03));
                                        c2gs.A0A(c63167SeR);
                                    } else {
                                        T2x t2x = new T2x(bundle4, c58770Q8c, str3, A0010, 1);
                                        SE2 A01 = AbstractC63061Sbi.A01(AbstractC58319PtB.A0W(bundle4), A0010);
                                        Bundle bundle5 = A01.A01;
                                        AbstractC63243Sfx.A02(str3, bundle5);
                                        if (bundle4 != null) {
                                            bundle5.putParcelable("logger_data", bundle4.getParcelable("logger_data"));
                                        }
                                        AbstractC58319PtB.A1A(bundle5, "CREATE_AUTH_TICKET_BASED_FACTOR");
                                        c2gs = c58770Q8c.A05;
                                        c63198Sf0 = new SO8(null, null, null, t2x, A01, c58770Q8c.A09.A00.A03);
                                        c63167SeR = new C63167SeR(c63198Sf0);
                                        c2gs.A0A(c63167SeR);
                                    }
                                }
                            }
                        }
                    }
                }
                C2FP.A03().A01.Chz("fbpay_use_faceid_click", SSA.A01(c58764Q7t.requireArguments()));
                i = -2063885562;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A053 = C0f9.A05(2054666974);
                ((View.OnClickListener) this.A02).onClick(view);
                i2 = -895907890;
                C0f9.A0C(i2, A053);
                return;
            case 17:
                A05 = C0f9.A05(-825916332);
                C58764Q7t c58764Q7t2 = (C58764Q7t) this.A01;
                Q8Z q8z2 = c58764Q7t2.A01;
                Bundle requireArguments2 = c58764Q7t2.requireArguments();
                boolean isChecked2 = ((CompoundButton) this.A02).isChecked();
                LinkedHashMap A082 = AbstractC58442PvL.A08(AbstractC58319PtB.A0W(requireArguments2));
                A082.put("auth_factor_type", RiX.PIN);
                if (isChecked2) {
                    rif2 = Rif.TURN_OFF_ALWAYS_ASK_FOR_PIN;
                } else {
                    rif2 = Rif.TURN_ON_ALWAYS_ASK_FOR_PIN;
                }
                C63307ShD.A02("target_name", rif2, A082).Chz("user_click_auth_atomic", A082);
                C2GT c2gt2 = q8z2.A01;
                if (C63406Sjd.A0F(c2gt2)) {
                    Object A026 = c2gt2.A02();
                    A026.getClass();
                    SBl sBl = (SBl) ((C63406Sjd) A026).A01;
                    if (sBl != null) {
                        C2GS c2gs3 = q8z2.A04;
                        String A0011 = Q8Z.A00(q8z2);
                        Bundle bundle6 = q8z2.A00;
                        bundle6.getClass();
                        SE2 A012 = AbstractC63061Sbi.A01(AbstractC58319PtB.A0W(bundle6), A0011);
                        String str11 = sBl.A00;
                        if ("ACTIVE".equalsIgnoreCase(str11)) {
                            Bundle bundle7 = A012.A01;
                            AbstractC63243Sfx.A02("VERIFY_PIN_TO_DISABLE_PIN_HUB", bundle7);
                            if (!TextUtils.isEmpty("DISABLE_PIN")) {
                                bundle7.putString("AUTH_EXTENSION_ID", "DISABLE_PIN");
                            }
                            AbstractC58319PtB.A1A(bundle7, "DISABLE_FBPAY_PIN");
                        } else {
                            if ("DELETED".equalsIgnoreCase(str11)) {
                                bundle2 = A012.A01;
                                AbstractC58319PtB.A1A(bundle2, "ENABLE_FBPAY_PIN");
                                str4 = "CREATE_PIN_FROM_HUB";
                            } else if ("DISABLED".equalsIgnoreCase(str11)) {
                                if (!TextUtils.isEmpty("ENABLE_PIN")) {
                                    A012.A01.putString("AUTH_EXTENSION_ID", "ENABLE_PIN");
                                }
                                bundle2 = A012.A01;
                                AbstractC58319PtB.A1A(bundle2, "ENABLE_FBPAY_PIN");
                                str4 = "VERIFY_PIN_TO_ENABLE_PIN_HUB";
                            } else if ("LOCKED".equalsIgnoreCase(str11)) {
                                if (!TextUtils.isEmpty("ENABLE_PIN")) {
                                    A012.A01.putString("AUTH_EXTENSION_ID", "ENABLE_PIN");
                                }
                                bundle2 = A012.A01;
                                AbstractC58319PtB.A1A(bundle2, "RESET_FBPAY_PIN");
                                str4 = "LOCKED_PIN_RECOVER_WITH_PASSWORD_HUB";
                            }
                            AbstractC63243Sfx.A02(str4, bundle2);
                        }
                        C63167SeR.A01(c2gs3, A012);
                    }
                }
                C2FP.A03().A01.Chz("fbpay_always_ask_for_pin_click", SSA.A01(c58764Q7t2.requireArguments()));
                i = 1638021574;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A053 = C0f9.A05(-588562543);
                REF ref = (REF) this.A01;
                C2JS c2js = (C2JS) this.A02;
                LinkedHashMap A083 = AbstractC58442PvL.A08(ref.A01);
                String A07 = c2js.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                A07.getClass();
                AbstractC43592JPx.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.parseLong(A07), A083);
                ref.A03.Chz("user_edit_shippingaddress_enter", A083);
                FBPayLoggerData fBPayLoggerData = ref.A01;
                String A072 = c2js.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String optionalStringField = c2js.getOptionalStringField(9, "label");
                String A09 = c2js.A09("care_of");
                String optionalStringField2 = c2js.getOptionalStringField(7, "street1");
                String A0D = c2js.A0D("street2");
                String A0A = c2js.A0A("city_name");
                String A0B = c2js.A0B("postal_code");
                String A0C = c2js.A0C("state_name");
                String optionalStringField3 = c2js.getOptionalStringField(6, "country_name");
                AddressFormFieldsConfig addressFormFieldsConfig = ref.A00;
                addressFormFieldsConfig.getClass();
                FormParams A0012 = S20.A00(addressFormFieldsConfig, fBPayLoggerData, new FormLogEvents("fbpay_edit_shipping_address_cancel", "fbpay_delete_shipping_address_cancel", "fbpay_delete_shipping_address_click", "fbpay_edit_shipping_address_display", "fbpay_delete_shipping_address_api_init", "fbpay_delete_shipping_address_display", "fbpay_delete_shipping_address_failure", "fbpay_delete_shipping_address_success", "fbpay_edit_shipping_address_api_init", "fbpay_edit_shipping_address_click", "fbpay_edit_shipping_address_failure", "fbpay_edit_shipping_address_success"), A072, optionalStringField, A09, optionalStringField2, A0D, A0A, A0B, A0C, optionalStringField3, c2js.getCoercedBooleanField(1, "is_default"));
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putParcelable("form_params", A0012);
                C63167SeR.A00(ref.A06, new C62902SWi("form", A0b2));
                i2 = -167640481;
                C0f9.A0C(i2, A053);
                return;
            case Process.SIGSTOP /* 19 */:
                A053 = C0f9.A05(-629043796);
                REF ref2 = (REF) this.A01;
                boolean isEmpty = ((AbstractCollection) this.A02).isEmpty();
                ref2.A03.Chz("user_add_shippingaddress_enter", AbstractC58442PvL.A08(ref2.A01));
                FBPayLoggerData fBPayLoggerData2 = ref2.A01;
                AddressFormFieldsConfig addressFormFieldsConfig2 = ref2.A00;
                addressFormFieldsConfig2.getClass();
                FormParams A0013 = S20.A00(addressFormFieldsConfig2, fBPayLoggerData2, new FormLogEvents("fbpay_add_shipping_address_cancel", "fbpay_delete_shipping_address_cancel", "fbpay_delete_shipping_address_click", "fbpay_add_shipping_address_display", "fbpay_delete_shipping_address_api_init", "fbpay_delete_shipping_address_display", "fbpay_delete_shipping_address_failure", "fbpay_delete_shipping_address_success", "fbpay_add_shipping_address_api_init", "fbpay_add_shipping_address_click", "fbpay_add_shipping_address_failure", "fbpay_add_shipping_address_success"), null, null, C17060sy.A01.A01(C2FP.A0E().A09).getFullName(), null, null, null, null, null, null, isEmpty);
                Bundle A0b3 = AbstractC166987dD.A0b();
                A0b3.putParcelable("form_params", A0013);
                C63167SeR.A00(ref2.A06, new C62902SWi("form", A0b3));
                i2 = -556023607;
                C0f9.A0C(i2, A053);
                return;
            case 20:
                A053 = C0f9.A05(-672648997);
                REL rel = (REL) this.A01;
                C2JS c2js2 = (C2JS) this.A02;
                LinkedHashMap A084 = AbstractC58442PvL.A08(rel.A00);
                String A073 = c2js2.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                A073.getClass();
                AbstractC43592JPx.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.parseLong(A073), A084);
                A084.put("target_name", "edit_email");
                rel.A03.Chz("user_edit_contact_enter", A084);
                REL.A00(rel, S21.A00(rel.A00, new FormLogEvents("fbpay_edit_email_cancel", "fbpay_delete_email_cancel", "fbpay_delete_email_click", "fbpay_edit_email_display", "fbpay_delete_email_api_init", "fbpay_delete_email_display", "fbpay_delete_email_failure", "fbpay_delete_email_success", "fbpay_edit_email_api_init", "fbpay_edit_email_click", "fbpay_edit_email_failure", "fbpay_edit_email_success"), c2js2.A09("normalized_email_address"), c2js2.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID), c2js2.getCoercedBooleanField(1, "is_default")));
                i2 = -870837652;
                C0f9.A0C(i2, A053);
                return;
            case 21:
                A053 = C0f9.A05(-786682584);
                REL rel2 = (REL) this.A01;
                C2JS c2js3 = (C2JS) this.A02;
                LinkedHashMap A085 = AbstractC58442PvL.A08(rel2.A00);
                String A074 = c2js3.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                A074.getClass();
                AbstractC43592JPx.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.parseLong(A074), A085);
                A085.put("target_name", "edit_phone");
                rel2.A03.Chz("user_edit_contact_enter", A085);
                REL.A00(rel2, S22.A00(rel2.A00, new FormLogEvents("fbpay_edit_phone_cancel", "fbpay_delete_phone_cancel", "fbpay_delete_phone_click", "fbpay_edit_phone_display", "fbpay_delete_phone_api_init", "fbpay_delete_phone_display", "fbpay_delete_phone_failure", "fbpay_delete_phone_success", "fbpay_edit_phone_api_init", "fbpay_edit_phone_click", "fbpay_edit_phone_failure", "fbpay_edit_phone_success"), c2js3.A09("normalized_phone_number"), c2js3.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID), c2js3.getCoercedBooleanField(1, "is_default")));
                i2 = 85901543;
                C0f9.A0C(i2, A053);
                return;
            case 22:
                A05 = C0f9.A05(-1848067717);
                FBPayOrder fBPayOrder = (FBPayOrder) this.A02;
                boolean equals = fBPayOrder.A05.equals("CHEXOrderItem");
                Bundle A0b4 = AbstractC166987dD.A0b();
                if (equals) {
                    str5 = "order_id";
                } else {
                    str5 = "transaction_id";
                }
                A0b4.putString(str5, fBPayOrder.A03);
                RED red = (RED) this.A01;
                A0b4.putParcelable("logger_data", red.A00);
                if (equals) {
                    str6 = "order_detail";
                } else {
                    str6 = "transaction_details";
                }
                C63167SeR.A00(red.A06, new C62902SWi(str6, A0b4));
                i = 927265768;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A053 = C0f9.A05(1659789908);
                REC rec = (REC) this.A02;
                FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) this.A01;
                C14360o3.A0A(fbPayPaymentMethod);
                Bundle A0b5 = AbstractC166987dD.A0b();
                FBPayLoggerData fBPayLoggerData3 = rec.A00;
                String str12 = fbPayPaymentMethod.A06;
                String str13 = fbPayPaymentMethod.A07;
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s • %s", str12, str13);
                ImmutableList.Builder builder = new ImmutableList.Builder();
                FormLogEvents formLogEvents = new FormLogEvents(null, null, null, "mcom_payout_method_display", null, null, null, null, null, null, null, null);
                C67663Uuv c67663Uuv = new C67663Uuv(17);
                c67663Uuv.A03 = 2131954907;
                builder.add((Object) c67663Uuv.A00());
                C67664Uuw c67664Uuw = new C67664Uuw(2);
                c67664Uuw.A0B = str12;
                c67664Uuw.A03 = 2131954908;
                ((AbstractC69334Vlg) c67664Uuw).A03 = false;
                builder.add((Object) c67664Uuw.A00());
                C67664Uuw c67664Uuw2 = new C67664Uuw(18);
                c67664Uuw2.A0B = StringFormatUtil.formatStrLocaleSafe("•••• %s", str13);
                c67664Uuw2.A03 = 2131954905;
                ((AbstractC69334Vlg) c67664Uuw2).A03 = false;
                builder.add((Object) c67664Uuw2.A00());
                C67663Uuv c67663Uuv2 = new C67663Uuv(19);
                c67663Uuv2.A03 = 2131954906;
                W4W w4w = new W4W();
                w4w.A01("https://www.facebook.com/policy.php");
                w4w.A01 = 2131962047;
                w4w.A03 = "[[facebook_privacy_policy_token]]";
                LinkParams linkParams = new LinkParams(w4w);
                ImmutableList.Builder builder2 = c67663Uuv2.A08;
                builder2.add((Object) linkParams);
                W4W w4w2 = new W4W();
                w4w2.A01("https://www.kasikornglobalpayment.com/th/privacy-policy");
                w4w2.A01 = 2131964717;
                w4w2.A03 = "[[kasikorn_global_payment_privacy_policy_token]]";
                builder2.add((Object) new LinkParams(w4w2));
                builder.add((Object) c67663Uuv2.A00());
                ImmutableList build = builder.build();
                C18C.A0G(AbstractC25226BEj.A1b(build), "Provide at least one cell params");
                A0b5.putParcelable("form_params", new FormParams(fBPayLoggerData3, formLogEvents, build, formatStrLocaleSafe));
                C63167SeR.A00(rec.A06, new C62902SWi("form", A0b5));
                i2 = -530379898;
                C0f9.A0C(i2, A053);
                return;
            case 24:
                A05 = C0f9.A05(-1285233985);
                REK rek = (REK) this.A01;
                C2JS c2js4 = (C2JS) this.A02;
                LinkedHashMap A086 = AbstractC58442PvL.A08(rek.A01);
                String optionalStringField4 = c2js4.getOptionalStringField(6, "transaction_id");
                optionalStringField4.getClass();
                AbstractC43592JPx.A1V("transaction_id", Long.parseLong(optionalStringField4), A086);
                rek.A08.Chz("fbpay_transactions_details_click", A086);
                if (c2js4.getOptionalTreeField(12, "open_receipt_action", C58994QTe.class, -441181603) != null && c2js4.getOptionalTreeField(12, "open_receipt_action", C58994QTe.class, -441181603).getOptionalTreeField(0, "action_data", C58993QTd.class, 571648010) != null && c2js4.getOptionalTreeField(12, "open_receipt_action", C58994QTe.class, -441181603).getOptionalTreeField(0, "action_data", C58993QTd.class, 571648010).getOptionalEnumField(0, "action_type", EnumC33448EqL.A03) == EnumC33448EqL.A02) {
                    Bundle A0b6 = AbstractC166987dD.A0b();
                    A0b6.putParcelable("logger_data", rek.A01);
                    A0b6.putString("transaction_id", c2js4.getOptionalStringField(6, "transaction_id"));
                    c62902SWi = new C62902SWi(2, "transaction_details_bloks", A0b6);
                } else {
                    if (c2js4.getCoercedBooleanField(7, "show_legacy_receipt_view") && c2js4.A0D("legacy_receipt_view_uri") != null) {
                        if (c2js4.A0D("legacy_receipt_view_uri") != null) {
                            Uri.Builder A04 = AbstractC31175DnJ.A04(c2js4.A0D("legacy_receipt_view_uri"));
                            A04.getClass();
                            String A0014 = rek.A01.A00();
                            A0014.getClass();
                            Uri.Builder appendQueryParameter = A04.appendQueryParameter(AbstractC63083Sc6.A00(), A0014);
                            C2FP.A0E();
                            android.net.Uri A0B2 = AbstractC31174DnI.A0B(appendQueryParameter, "transaction_source", "Instagram");
                            c2gs2 = rek.A0A;
                            c62902SWi = A0B2.toString();
                            C63167SeR.A00(c2gs2, c62902SWi);
                        }
                        i = 1102886619;
                        C0f9.A0C(i, A05);
                        return;
                    }
                    Bundle A0b7 = AbstractC166987dD.A0b();
                    A0b7.putParcelable("logger_data", rek.A01);
                    A0b7.putString("transaction_id", c2js4.getOptionalStringField(6, "transaction_id"));
                    c62902SWi = new C62902SWi("transaction_details", A0b7);
                }
                c2gs2 = ((Q8X) rek).A06;
                C63167SeR.A00(c2gs2, c62902SWi);
                i = 1102886619;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A053 = C0f9.A05(-759209338);
                Rb5 rb5 = (Rb5) this.A02;
                if ("multiple_contact_add_contact_info_fragment".equals(rb5.requireArguments().getString("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"))) {
                    ((InterfaceC56362iU) this.A01).ARk(0, false);
                    ScrollView scrollView = rb5.A01;
                    if (scrollView == null) {
                        str7 = "scrollView";
                    } else {
                        scrollView.setAlpha(0.5f);
                        SpinnerImageView spinnerImageView = rb5.A03;
                        if (spinnerImageView == null) {
                            str7 = "loadingSpinner";
                        } else {
                            spinnerImageView.setVisibility(0);
                            Rb5.A01(rb5);
                            i2 = 1901266836;
                        }
                    }
                    C14360o3.A0F(str7);
                    throw C00O.createAndThrow();
                }
                Rb5.A01(rb5);
                FragmentActivity requireActivity2 = rb5.requireActivity();
                Intent intent2 = rb5.A00;
                if (intent2 == null) {
                    str7 = "resultIntent";
                    C14360o3.A0F(str7);
                    throw C00O.createAndThrow();
                }
                requireActivity2.setResult(-1, intent2);
                AbstractC25226BEj.A1Q(rb5);
                i2 = 1901266836;
                C0f9.A0C(i2, A053);
                return;
            case 26:
                A053 = C0f9.A05(-575947404);
                ((DirectWidgetConfig) this.A02).launchCustomChatSearch((View) this.A01);
                i2 = -936607136;
                C0f9.A0C(i2, A053);
                return;
            default:
                A053 = C0f9.A05(1661851410);
                InterfaceC65291ThO interfaceC65291ThO = ((C58721Q4x) this.A02).A00;
                DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) this.A01;
                DirectRecipientSearchActivity directRecipientSearchActivity = (DirectRecipientSearchActivity) interfaceC65291ThO;
                Intent A042 = AbstractC31171DnF.A04();
                A042.putExtra("direct_widget_custom_chat_info", directThreadWidgetItem);
                String str14 = directRecipientSearchActivity.A02;
                if (str14 == null) {
                    str7 = "customChatRowId";
                    C14360o3.A0F(str7);
                    throw C00O.createAndThrow();
                }
                A042.putExtra("custom_chat_view_tag", str14);
                AbstractC31180DnO.A0y(directRecipientSearchActivity, A042);
                i2 = -1542986206;
                C0f9.A0C(i2, A053);
                return;
        }
    }

    public ViewOnClickListenerC63509Soc(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
