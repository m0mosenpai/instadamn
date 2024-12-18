package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V1Y extends C38K implements InterfaceC60072op, InterfaceC60122ou, CallerContextable {
    public static final String __redex_internal_original_name = "LocationPageInfoPageFragment";
    public UserSession A00;
    public WDE A01;
    public C67845UzJ A02;
    public C64842wi A03;
    public C64742wY A04;
    public String A05;
    public String A06;
    public C67918V2i A07;
    public String A08;
    public final Handler A09 = AbstractC167007dF.A0J();

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        C69015Vfr c69015Vfr;
        interfaceC56362iU.EkS(true);
        if (getActivity() != null) {
            C3LO c3lo = new C3LO();
            c3lo.A02(C05F.A00);
            AbstractC31176DnK.A1B(new ViewOnClickListenerC35677FpC(this, 15), c3lo, interfaceC56362iU);
            String str2 = this.A02.A08;
            String string = AbstractC166997dE.A0N(this).getString(2131951987);
            AbstractC167007dF.A1D(str2, 1, string);
            interfaceC56362iU.EaW(str2, string);
            C67845UzJ c67845UzJ = this.A02;
            if (c67845UzJ == null || (c69015Vfr = c67845UzJ.A00) == null || c69015Vfr.A01 == null) {
                UserSession userSession = this.A00;
                C08730cb c08730cb = C17060sy.A01;
                if (c08730cb.A01(userSession).CQw() && (str = this.A05) != null && !str.equals(c08730cb.A01(this.A00).A03.Baz())) {
                    if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A00, 36312535443440799L)) {
                        C3LO c3lo2 = new C3LO();
                        c3lo2.A0A = R.layout.location_page_info_page_edit_button;
                        c3lo2.A05 = 2131955174;
                        c3lo2.A0G = new ViewOnClickListenerC35677FpC(this, 16);
                        TextView textView = (TextView) interfaceC56362iU.AAB(new C3LY(c3lo2));
                        textView.setText(2131955174);
                        String A00 = AbstractC111324zv.A00(C3OO.FLAG_MOVED);
                        WDE A01 = A01(this);
                        A01.A04 = "impression";
                        A01.A07 = "information_page";
                        A01.A01 = A00;
                        A01.A05 = this.A05;
                        A01.A06 = this.A06;
                        A01.A01();
                        this.A04.A00(textView, QPTooltipAnchor.A0A, this.A03);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "location_page_info_page";
    }

    public static WDE A01(V1Y v1y) {
        WDE wde = v1y.A01;
        if (wde == null) {
            wde = new WDE(v1y.A00);
            v1y.A01 = wde;
        }
        wde.A02 = v1y.A08;
        return wde;
    }

    public static void A03(V1Y v1y) {
        String str;
        String str2;
        WDE A01 = A01(v1y);
        A01.A04 = "impression";
        A01.A07 = "information_page";
        A01.A01 = "claim_location_success";
        A01.A05 = v1y.A05;
        A01.A06 = v1y.A06;
        A01.A01();
        Context context = v1y.getContext();
        ImageUrl Bhu = C17060sy.A01.A01(v1y.A00).Bhu();
        C67845UzJ c67845UzJ = v1y.A02;
        if (c67845UzJ != null && (str2 = c67845UzJ.A05) != null) {
            str = AnonymousClass001.A11(str2.trim(), " ", c67845UzJ.A07, " ", c67845UzJ.A0B).trim();
        } else {
            str = null;
        }
        WHP whp = new WHP(v1y, 50);
        String A0f = AbstractC167007dF.A0f(context, str, 2131955179);
        int A0A = AbstractC58322PtE.A0A(A0f) - AbstractC58322PtE.A0A(str);
        int A0A2 = AbstractC58322PtE.A0A(A0f);
        SpannableString spannableString = new SpannableString(AbstractC13670mt.A06("%s\n\n%s", A0f, context.getString(2131955180)));
        spannableString.setSpan(new StyleSpan(1), A0A, A0A2, 0);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.grey_9)), A0A, A0A2, 0);
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A0s(true);
        c193328hC.A0t(true);
        c193328hC.A0o(Bhu, v1y);
        c193328hC.A0F(whp);
        c193328hC.A0A(2131955181);
        c193328hC.A0r(spannableString);
        AbstractC166987dD.A1W(c193328hC);
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A00;
    }

    public static void A02(V1Y v1y) {
        C140966Yy c140966Yy = new C140966Yy(v1y.requireActivity(), v1y.A00);
        C28431Ze c28431Ze = AbstractC31364DqT.A03().A01;
        UserSession userSession = v1y.A00;
        C31368DqX.A01(c140966Yy, userSession, c28431Ze, AbstractC31402Dr6.A01(userSession, v1y.A02.A00.A01.getId(), "location_feed_info_page_related_business", "location_page_info_page"));
    }

    public static void A04(V1Y v1y, Integer num) {
        String str;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 4) {
                if (intValue != 5) {
                    str = null;
                } else {
                    str = "call";
                }
            } else {
                str = "website";
            }
        } else {
            str = "address";
        }
        A01(v1y).A02(null, null, "information_page", "tap_component", str, v1y.A06, v1y.A05, null, null);
    }

    public static void A05(V1Y v1y, String str) {
        A01(v1y).A02(null, null, "information_page", "tap_component", str, v1y.A06, v1y.A05, null, null);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        LoginClient$Result loginClient$Result;
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            WDE A01 = A01(this);
            A01.A04 = "finish_step";
            A01.A07 = "edit_location_page";
            A01.A05 = this.A05;
            A01.A06 = this.A06;
            A01.A01();
            return;
        }
        CallerContext callerContext = C1L2.A00;
        if (i != 64206 || i2 != -1) {
            return;
        }
        UserSession userSession = this.A00;
        String str = null;
        boolean z = false;
        if (intent != null && (extras = intent.getExtras()) != null) {
            Object obj = extras.get(MSV.A00(189));
            if ((obj instanceof LoginClient$Result) && (loginClient$Result = (LoginClient$Result) obj) != null) {
                LoginClient$Request loginClient$Request = loginClient$Result.A01;
                str = loginClient$Request.A01;
                z = loginClient$Request.A02;
            }
        }
        C34876FYl.A00();
        HashMap hashMap = new HashMap();
        hashMap.put(MSV.A00(205), String.valueOf(AbstractC23851Es.A03()));
        hashMap.put("exception", null);
        AbstractC62273S4s.A00(userSession, MSV.A00(440), str, hashMap, z);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        WDE A01 = A01(this);
        A01.A04 = "cancel";
        A01.A07 = "information_page";
        A01.A06 = this.A06;
        A01.A05 = this.A05;
        A01.A01();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [X.Vfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.UzJ, X.1um] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.2fr, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1657016802);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A06 = requireArguments.getString("location_id_key");
        this.A05 = requireArguments.getString("fb_page_id_key");
        this.A08 = requireArguments.getString("info_page_logging_entry_point");
        String A00 = AbstractC111324zv.A00(467);
        if (requireArguments.containsKey(A00)) {
            LocationPageInformation locationPageInformation = (LocationPageInformation) requireArguments.getParcelable(A00);
            String str = locationPageInformation.A08;
            String str2 = locationPageInformation.A09;
            String str3 = locationPageInformation.A0A;
            String str4 = locationPageInformation.A06;
            String str5 = locationPageInformation.A05;
            String str6 = locationPageInformation.A07;
            Integer num = locationPageInformation.A04;
            String str7 = locationPageInformation.A0B;
            User A002 = locationPageInformation.A00();
            LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = locationPageInformation.A01;
            boolean z = locationPageInformation.A0C;
            Integer num2 = locationPageInformation.A02;
            ?? c40791um = new C40791um();
            c40791um.A08 = str;
            c40791um.A09 = str2;
            c40791um.A0A = str3;
            c40791um.A06 = str4;
            c40791um.A05 = str5;
            c40791um.A07 = str6;
            c40791um.A04 = num;
            c40791um.A0B = str7;
            ?? obj = new Object();
            c40791um.A00 = obj;
            obj.A01 = A002;
            c40791um.A01 = locationPageInfoPageOperationHourResponse;
            c40791um.A0C = z;
            c40791um.A02 = num2;
            this.A02 = c40791um;
        }
        Context context = getContext();
        C67845UzJ c67845UzJ = this.A02;
        C67918V2i c67918V2i = new C67918V2i(context, this, this.A00, c67845UzJ, new C68824Vcf(this), new W1V(this));
        this.A07 = c67918V2i;
        A0U(c67918V2i);
        WDE A01 = A01(this);
        A01.A04 = "start_step";
        A01.A07 = "information_page";
        A01.A05 = this.A05;
        A01.A06 = this.A06;
        C67845UzJ c67845UzJ2 = this.A02;
        ArrayList arrayList = new ArrayList();
        C69015Vfr c69015Vfr = c67845UzJ2.A00;
        if (c69015Vfr != null && c69015Vfr.A01 != null) {
            arrayList.add("business");
        }
        if (!TextUtils.isEmpty(c67845UzJ2.A05)) {
            arrayList.add("address");
        }
        if (!TextUtils.isEmpty(c67845UzJ2.A06)) {
            arrayList.add("category");
        }
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse2 = c67845UzJ2.A01;
        if (locationPageInfoPageOperationHourResponse2 != null && locationPageInfoPageOperationHourResponse2.A03 != null) {
            arrayList.add("hours");
        }
        if (c67845UzJ2.A03 != null) {
            arrayList.add("price");
        }
        if (!TextUtils.isEmpty(c67845UzJ2.A0A)) {
            arrayList.add("website");
        }
        if (!TextUtils.isEmpty(c67845UzJ2.A09)) {
            arrayList.add("call");
        }
        A01.A08 = arrayList;
        A01.A01();
        C27961Xa A003 = AbstractC54912fq.A00();
        UserSession userSession = this.A00;
        HashMap hashMap = new HashMap();
        hashMap.put(QPTooltipAnchor.A0M, new Object());
        hashMap.put(QPTooltipAnchor.A0A, new Object());
        C64742wY A05 = A003.A05(userSession, hashMap);
        this.A04 = A05;
        registerLifecycleListener(A05);
        C27961Xa A004 = AbstractC54912fq.A00();
        UserSession userSession2 = this.A00;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0d;
        AbstractC54912fq.A00();
        ?? obj2 = new Object();
        obj2.A01(new C70971Wlf(this, 1), this.A04);
        C64842wi A03 = A004.A03(this, this, userSession2, obj2.A00(), quickPromotionSlot);
        this.A03 = A03;
        A03.DiZ();
        C0f9.A09(95494320, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(832165024);
        unregisterLifecycleListener(this.A04);
        super.onDestroy();
        C0f9.A09(-1651159732, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1643288601);
        super.onPause();
        WDE A01 = A01(this);
        A01.A04 = "finish_step";
        A01.A07 = "information_page";
        A01.A05 = this.A05;
        A01.A06 = this.A06;
        A01.A01();
        C0f9.A09(1479322369, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        C69015Vfr c69015Vfr;
        User user;
        int A02 = C0f9.A02(1951326751);
        super.onResume();
        this.A07.A0C();
        C67845UzJ c67845UzJ = this.A02;
        if (c67845UzJ != null && (c69015Vfr = c67845UzJ.A00) != null && (user = c69015Vfr.A01) != null) {
            String id = user.getId();
            C19260xA c19260xA = new C19260xA();
            C19260xA.A00(c19260xA, id, "profile_id");
            C130455uq c130455uq = this.A02.A00.A00;
            if (c130455uq != null) {
                C130485ut c130485ut = c130455uq.A01;
                C14360o3.A0A(c130485ut);
                List list = c130485ut.A0E;
                if (list != null) {
                    C0x9 c0x9 = new C0x9();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c0x9.A04(((C130505uv) it.next()).A00());
                    }
                    C19260xA.A00(c19260xA, c0x9, "available_media");
                }
            }
            WDE A01 = A01(this);
            A01.A04 = "impression";
            A01.A07 = "information_page";
            A01.A01 = "related_profile";
            A01.A05 = this.A05;
            A01.A06 = this.A06;
            A01.A00 = c19260xA;
            A01.A01();
        }
        C0f9.A09(1189106793, A02);
    }
}
