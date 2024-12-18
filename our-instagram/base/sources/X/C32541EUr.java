package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.EUr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32541EUr extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C32541EUr(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        Object obj;
        int i;
        String message;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -611055595);
                InterfaceC40801un interfaceC40801un = (InterfaceC40801un) abstractC115105If.A00();
                if (interfaceC40801un != null && interfaceC40801un.getStatusCode() == 400) {
                    obj = this.A04;
                } else {
                    obj = this.A03;
                }
                C131845xK.A00((C6FQ) this.A02, (C6FW) this.A01, (InterfaceC103384lE) obj);
                i = 688600915;
                break;
            case 1:
                A0N = C0f9.A03(233571727);
                C14360o3.A0B(abstractC115105If, 0);
                int A03 = C0f9.A03(668686201);
                Context context = (Context) this.A02;
                String A04 = AbstractC151876sX.A04(abstractC115105If, context.getString(2131972429));
                C14360o3.A07(A04);
                C9GR.A03(context, A04, null, 0);
                C0f9.A0A(-2088558494, A03);
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A04;
                CallerContext callerContext = CategorySearchFragment.A0U;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
                if (businessFlowAnalyticsLogger != null) {
                    String A0g = AbstractC31180DnO.A0g(categorySearchFragment);
                    String str3 = categorySearchFragment.A0C;
                    if (str3 == null) {
                        AbstractC31171DnF.A0x();
                        throw C00O.createAndThrow();
                    }
                    businessFlowAnalyticsLogger.Clv(new Y7A(A0g, str3, "save_info", null, null, null, (Map) this.A01, null));
                }
                i = -1029882795;
                break;
            case 2:
                A0N = C0f9.A03(-920794588);
                Context context2 = (Context) this.A01;
                C9GR.A09(context2, AbstractC151876sX.A04(abstractC115105If, context2.getString(2131972429)));
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                String A02 = AbstractC151876sX.A02(abstractC115105If);
                CallerContext callerContext2 = C35793FrV.A00;
                BusinessFlowAnalyticsLogger A01 = AbstractC151606s6.A01(EnumC151596s5.A07, abstractC12990ll, "facebook_page_claim_helper", AbstractC166997dE.A0n());
                A01.getClass();
                A01.Clv(new Y7A("edit_page", "edit_profile", null, A02, null, null, null, null));
                i = -542855201;
                break;
            case 3:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -923098968);
                super.onFail(abstractC115105If);
                C32862Ed4 c32862Ed4 = (C32862Ed4) this.A04;
                C32862Ed4.A00((InterfaceC74953Yl) this.A02, (InterfaceC74953Yl) this.A01, (C64770TTe) this.A03, c32862Ed4);
                Throwable A012 = abstractC115105If.A01();
                if (A012 != null && (message = A012.getMessage()) != null && message.length() > 0) {
                    FA7.A00(c32862Ed4.A01).A05(EnumC33422Ept.A08, "follow_failure_reason", A012.getMessage());
                }
                UserSession userSession = c32862Ed4.A01;
                FA7.A00(userSession).A04(EnumC33422Ept.A08, abstractC115105If.toString());
                FA7.A00(userSession).A04(EnumC33422Ept.A09, abstractC115105If.toString());
                i = 489315363;
                break;
            case 4:
            default:
                super.onFail(abstractC115105If);
                return;
            case 5:
                A0N = C0f9.A03(-1693983889);
                AbstractC63248Sg4.A01((AbstractC10360h2) this.A03);
                Context context3 = (Context) this.A02;
                C0w9.A03("AppStartupUtil", "SingleMediaRequest onFail");
                C9GR.A0C(context3, "SingleMediaRequest onFail");
                i = 1513799208;
                break;
            case 6:
                A0N = C0f9.A03(1854218214);
                super.onFail(abstractC115105If);
                C9GR.A0C((Context) this.A03, "ClipItemRequestTask onFail");
                i = -886229231;
                break;
            case 7:
                A0N = C0f9.A03(2029849426);
                ((FPP) this.A03).A00((AbstractC115105If) this.A02);
                i = 977249499;
                break;
            case 8:
                A0N = C0f9.A03(1499835712);
                C14360o3.A0B(abstractC115105If, 0);
                ((InterfaceC16620sF) this.A03).invoke(false, null);
                C155506yf c155506yf = (C155506yf) this.A02;
                Throwable A013 = abstractC115105If.A01();
                if (A013 == null || (str = A013.getMessage()) == null) {
                    str = "";
                }
                c155506yf.A02(str);
                c155506yf.A04("edit_profile_link");
                i = -875390458;
                break;
            case 9:
                A0N = C0f9.A03(420771833);
                C14360o3.A0B(abstractC115105If, 0);
                ((InterfaceC16620sF) this.A03).invoke(false, null);
                C155506yf c155506yf2 = (C155506yf) this.A02;
                Throwable A014 = abstractC115105If.A01();
                if (A014 == null || (str2 = A014.getMessage()) == null) {
                    str2 = "";
                }
                c155506yf2.A02(str2);
                c155506yf2.A04("edit_profile_link");
                i = -1765380390;
                break;
            case 10:
                A0N = C0f9.A03(-2102849427);
                GIF.A02((FragmentActivity) this.A03, (GIF) this.A01);
                i = 1641855008;
                break;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(1139979125);
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A04;
                ActionButton actionButton = categorySearchFragment.actionButton;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(0);
                }
                EVY evy = categorySearchFragment.A08;
                if (evy != null) {
                    evy.A00 = true;
                }
                i = 1906981146;
                break;
            case 2:
                A03 = C0f9.A03(-633411296);
                Dialog dialog = (Dialog) this.A02;
                dialog.requireViewById(R.id.disconnect_button_spinner).setVisibility(8);
                dialog.dismiss();
                i = -1407528022;
                break;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                super.onFinish();
                return;
            case 4:
                A03 = C0f9.A03(-881454617);
                C68754VbX c68754VbX = (C68754VbX) this.A02;
                if (c68754VbX != null) {
                    c68754VbX.A00.A00 = false;
                }
                i = 1798680648;
                break;
            case 8:
                A03 = C0f9.A03(1115793485);
                AbstractC31176DnK.A0y((Activity) this.A01, C56352iT.A0t);
                i = 1413517611;
                break;
            case 9:
                A03 = C0f9.A03(103350706);
                AbstractC31176DnK.A0y((Activity) this.A01, C56352iT.A0t);
                i = -995826256;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(283992559);
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A04;
                ActionButton actionButton = categorySearchFragment.actionButton;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(1);
                }
                EVY evy = categorySearchFragment.A08;
                if (evy != null) {
                    evy.A00 = false;
                }
                i = 919705908;
                break;
            case 2:
                A03 = C0f9.A03(169740461);
                Dialog dialog = (Dialog) this.A02;
                dialog.requireViewById(R.id.disconnect_button_spinner).setVisibility(0);
                dialog.requireViewById(R.id.disconnect_button).setVisibility(8);
                i = 283914326;
                break;
            case 3:
            case 7:
            default:
                super.onStart();
                return;
            case 4:
                A03 = C0f9.A03(877551030);
                C68754VbX c68754VbX = (C68754VbX) this.A02;
                if (c68754VbX != null) {
                    c68754VbX.A00.A00 = true;
                }
                i = -2136225446;
                break;
            case 5:
                A03 = C0f9.A03(1900181589);
                AbstractC63248Sg4.A02((AbstractC10360h2) this.A03);
                i = -1667474194;
                break;
            case 6:
                A03 = C0f9.A03(135140157);
                super.onStart();
                i = -1247916649;
                break;
            case 8:
                A03 = C0f9.A03(-184306193);
                AbstractC31176DnK.A0z((Activity) this.A01, C56352iT.A0t);
                i = -1891495109;
                break;
            case 9:
                A03 = C0f9.A03(1888188265);
                AbstractC31176DnK.A0z((Activity) this.A01, C56352iT.A0t);
                i = 1628123283;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [X.EtL, java.lang.Object] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-348541241);
                int A032 = C0f9.A03(-2132867932);
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
                C131845xK.A00((C6FQ) this.A02, (C6FW) this.A01, interfaceC103384lE);
                C0f9.A0A(-2104789211, A032);
                i = 1985708574;
                break;
            case 1:
                A03 = C0f9.A03(344372788);
                C2045893s c2045893s = (C2045893s) obj;
                int A0N = AbstractC167017dG.A0N(c2045893s, 1654111159);
                int A033 = C0f9.A03(1339041065);
                InterfaceC128135qh interfaceC128135qh = c2045893s.A04;
                if (interfaceC128135qh == null) {
                    AbstractC31171DnF.A0w();
                    throw C00O.createAndThrow();
                }
                User CDj = interfaceC128135qh.CDj();
                if (CDj != null) {
                    CDj.A0c((AbstractC12990ll) this.A03);
                }
                C0f9.A0A(184991459, A033);
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A04;
                CallerContext callerContext = CategorySearchFragment.A0U;
                categorySearchFragment.A0K = true;
                categorySearchFragment.A0T.post(new GNS(categorySearchFragment, (Map) this.A01));
                C0f9.A0A(-182168405, A0N);
                i = -726585490;
                break;
            case 2:
                A03 = C0f9.A03(2082691434);
                int A034 = C0f9.A03(-1245493991);
                C9GR.A09((Context) this.A01, "Disconnected");
                ((Fragment) this.A04).onResume();
                C0f9.A0A(-878741763, A034);
                i = 1175277846;
                break;
            case 3:
                A03 = C0f9.A03(-1695347655);
                int A0N2 = AbstractC167017dG.A0N(obj, -1544129414);
                super.onSuccess(obj);
                C32862Ed4 c32862Ed4 = (C32862Ed4) this.A04;
                C32862Ed4.A00((InterfaceC74953Yl) this.A02, (InterfaceC74953Yl) this.A01, (C64770TTe) this.A03, c32862Ed4);
                UserSession userSession = c32862Ed4.A01;
                FA7.A00(userSession).A01(EnumC33422Ept.A08, null);
                FA7.A00(userSession).A01(EnumC33422Ept.A09, null);
                C0f9.A0A(361202399, A0N2);
                i = -654635447;
                break;
            case 4:
                A03 = C0f9.A03(1858664079);
                int A035 = C0f9.A03(-253831646);
                ArrayList A1E = AbstractC166987dD.A1E();
                List list = ((C67816Uyp) obj).A00;
                if (list != null) {
                    A1E.addAll(list);
                }
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                    ImageUrl A00 = mediaMapPin.A00();
                    if (A00 != null) {
                        C69786VvR c69786VvR = (C69786VvR) this.A01;
                        c69786VvR.A00.put(mediaMapPin.getId(), A00);
                    }
                    ((C69786VvR) this.A01).A02((C69619VsM) this.A03, mediaMapPin);
                }
                C0f9.A0A(25631079, A035);
                i = 661474148;
                break;
            case 5:
                A03 = C0f9.A03(-185597492);
                int A036 = C0f9.A03(165868709);
                C1OU.A07((Activity) this.A02, (Fragment) ((AbstractC10360h2) this.A03).A0U.A04().get(0), (UserSession) this.A04, (C38321qM) ((C74293Vk) obj).A06.get(0), "activity_tab", true);
                C0f9.A0A(1681980487, A036);
                i = 1379981444;
                break;
            case 6:
                A03 = C0f9.A03(1295018362);
                C38874H9w c38874H9w = (C38874H9w) obj;
                int A037 = C0f9.A03(36968412);
                super.onSuccess(c38874H9w);
                C38321qM c38321qM = c38874H9w.A00;
                AEM.A00((Bundle) this.A02, (FragmentActivity) this.A03, (UserSession) this.A04, c38321qM);
                C0f9.A0A(-1415689948, A037);
                i = 758939335;
                break;
            case 7:
                A03 = C0f9.A03(-1458704938);
                int A038 = C0f9.A03(-1165056320);
                ((GFE) this.A01).A02.A01((C07270a1) this.A04, ((EfU) obj).A00, C1Q9.A1I, false, false);
                C0f9.A0A(-2076849466, A038);
                i = -2114938964;
                break;
            case 8:
                A03 = C0f9.A03(1752852314);
                EDP edp = (EDP) obj;
                int A0N3 = AbstractC167017dG.A0N(edp, -1610814156);
                C18A A002 = AnonymousClass189.A00((UserSession) this.A04);
                User user = edp.A00;
                C14360o3.A07(user);
                A002.A03(user);
                ((InterfaceC16620sF) this.A03).invoke(AbstractC166997dE.A0b(), edp.A00);
                ((C155506yf) this.A02).A04("edit_profile_link");
                C0f9.A0A(-1577245074, A0N3);
                i = 55083836;
                break;
            case 9:
                A03 = C0f9.A03(-1537271449);
                EDP edp2 = (EDP) obj;
                int A0N4 = AbstractC167017dG.A0N(edp2, 452267130);
                C18A A003 = AnonymousClass189.A00((UserSession) this.A04);
                User user2 = edp2.A00;
                C14360o3.A07(user2);
                A003.A03(user2);
                ((InterfaceC16620sF) this.A03).invoke(AbstractC166997dE.A0b(), edp2.A00);
                ((C155506yf) this.A02).A04("edit_profile_link");
                C0f9.A0A(1750615280, A0N4);
                i = 2122577068;
                break;
            default:
                A03 = C0f9.A03(-548739758);
                EDK edk = (EDK) obj;
                int A039 = C0f9.A03(-1149707909);
                if (edk.isOk()) {
                    AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
                    if (abstractC12990ll instanceof UserSession) {
                        Bundle bundle = (Bundle) this.A02;
                        String string = bundle.getString("bundle_param_route");
                        List list2 = edk.A00;
                        if (list2 != null && !list2.isEmpty()) {
                            C35196Ffo A004 = C35196Ffo.A00();
                            synchronized (A004) {
                                if (!list2.isEmpty()) {
                                    HashSet A0k = AbstractC31171DnF.A0k(list2);
                                    ?? obj2 = new Object();
                                    obj2.A02 = A0k;
                                    obj2.A00 = 1;
                                    obj2.A01 = System.currentTimeMillis();
                                    A004.A00 = obj2;
                                    C35196Ffo.A01(A004);
                                }
                            }
                            if (!TextUtils.isEmpty(string) && list2.contains(string)) {
                                GIF gif = (GIF) this.A01;
                                GIF.A00(bundle, (FragmentActivity) this.A03, abstractC12990ll, string);
                                C6WQ c6wq = gif.A00;
                                if (c6wq != null) {
                                    AbstractC31176DnK.A10(c6wq);
                                }
                                i2 = -1828354416;
                            } else {
                                GIF.A02((FragmentActivity) this.A03, (GIF) this.A01);
                                i2 = 1003326774;
                            }
                        } else {
                            GIF.A02((FragmentActivity) this.A03, (GIF) this.A01);
                            i2 = -1305263683;
                        }
                        C0f9.A0A(i2, A039);
                        i = -1043057856;
                        break;
                    }
                }
                GIF.A02((FragmentActivity) this.A03, (GIF) this.A01);
                i2 = 541925096;
                C0f9.A0A(i2, A039);
                i = -1043057856;
                break;
        }
        C0f9.A0A(i, A03);
    }

    public C32541EUr(Context context, CategorySearchFragment categorySearchFragment, AbstractC18680vv abstractC18680vv, Map map) {
        this.A00 = 1;
        this.A04 = categorySearchFragment;
        this.A01 = map;
        C14360o3.A0A(context);
        C14360o3.A0B(abstractC18680vv, 2);
        this.A02 = context;
        this.A03 = abstractC18680vv;
    }
}
