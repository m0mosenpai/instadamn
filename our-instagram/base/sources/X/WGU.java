package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WGU {
    public static final WGU A00 = new Object();
    public static final Map A01 = AbstractC06930Yk.A06(new C09530e4(EnumC68204VFw.OPEN_LINK, VG5.A08), new C09530e4(EnumC68204VFw.LAUNCH_MEDIA_PICKER, VG5.A07), new C09530e4(EnumC68204VFw.RESUME_AD, VG5.A09), new C09530e4(EnumC68204VFw.INCREASE_ACCOUNT_SPENDING_LIMIT, VG5.A04), new C09530e4(EnumC68204VFw.BOOST_REEL, VG5.A06), new C09530e4(EnumC68204VFw.AD_SLIDER, VG5.A05));

    public static final C193328hC A00(Context context, DialogInterface.OnClickListener onClickListener, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, EnumC193348hE enumC193348hE, String str, String str2, int i, boolean z) {
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A05 = str;
        c193328hC.A0r(str2);
        c193328hC.A0R(onClickListener, enumC193348hE, i);
        c193328hC.A0H(null, 2131970291);
        c193328hC.A0t(true);
        if (z) {
            c193328hC.A08 = true;
            Context context2 = c193328hC.A0Q;
            float A05 = AbstractC167017dG.A05(context2);
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
            ViewStub viewStub = c193328hC.A0W;
            viewStub.setLayoutResource(R.layout.dialog_image);
            View inflate = viewStub.inflate();
            C14360o3.A0C(inflate, MSV.A00(1441));
            RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) inflate;
            boolean z2 = false;
            roundedCornerImageView.setVisibility(0);
            roundedCornerImageView.setRadius(A05);
            roundedCornerImageView.setStrokeWidth(dimensionPixelSize);
            if (dimensionPixelSize > 0) {
                z2 = true;
            }
            roundedCornerImageView.setStrokeEnabled(z2);
            roundedCornerImageView.A0E = new C70823Whg(0, c193328hC, roundedCornerImageView);
            roundedCornerImageView.setRadius(c193328hC.A0O);
            roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
            roundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            roundedCornerImageView.setUrl(imageUrl, interfaceC11380iw);
            return c193328hC;
        }
        c193328hC.A0q(imageUrl, interfaceC11380iw);
        return c193328hC;
    }

    public static final void A02(Activity activity, Context context, String str, String str2, String str3, String str4) {
        if (str != null && str2 != null && str3 != null && str4 != null) {
            C193328hC c193328hC = new C193328hC(context);
            c193328hC.A05 = str;
            c193328hC.A0r(str2);
            DialogInterfaceOnClickListenerC63422Sk0 dialogInterfaceOnClickListenerC63422Sk0 = new DialogInterfaceOnClickListenerC63422Sk0(activity, context, str4, 6);
            EnumC193348hE enumC193348hE = EnumC193348hE.A06;
            c193328hC.A0Z(dialogInterfaceOnClickListenerC63422Sk0, enumC193348hE, str3, true);
            c193328hC.A0Q(null, enumC193348hE, 2131954754);
            c193328hC.A0t(true);
            AbstractC166987dD.A1W(c193328hC);
        }
    }

    public static final void A03(Context context, DialogInterface.OnClickListener onClickListener, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        AbstractC167017dG.A1R(context, interfaceC11380iw);
        AbstractC166987dD.A1W(A00(context, onClickListener, interfaceC11380iw, imageUrl, EnumC193348hE.A03, AbstractC166997dE.A0q(context.getResources(), 2131970308), AbstractC166997dE.A0q(context.getResources(), 2131970307), 2131970295, z));
    }

    public static final void A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A0J().postDelayed(new RunnableC71313Wrh(userSession), 1000L);
    }

    public final void A07(Context context, DialogInterface.OnClickListener onClickListener, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, boolean z) {
        C14360o3.A0B(userSession, 0);
        AbstractC166987dD.A1W(A00(context, onClickListener, interfaceC11380iw, imageUrl, EnumC193348hE.A06, AbstractC166997dE.A0q(context.getResources(), 2131970306), AbstractC166997dE.A0q(context.getResources(), 2131970305), 2131970294, z));
        C70399WUb A002 = C70399WUb.A00(userSession);
        VG4 vg4 = VG4.A0U;
        A002.A01 = "ads_manager";
        A002.A0I(vg4, "promote_edit_pause_dialog");
    }

    public static final String A01(VG5 vg5) {
        Map map = A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            if (entry.getValue() == vg5) {
                AbstractC43594JPz.A1S(linkedHashMap, entry);
            }
        }
        return AbstractC166987dD.A19(AbstractC001800i.A0D(linkedHashMap.keySet()));
    }

    public static final void A04(Context context, String str, String str2) {
        if (str != null && str2 != null) {
            C193328hC c193328hC = new C193328hC(context);
            c193328hC.A05 = str;
            c193328hC.A0r(str2);
            c193328hC.A0H(null, 2131970322);
            c193328hC.A04();
            AbstractC166987dD.A1W(c193328hC);
        }
    }

    public static final void A05(FragmentActivity fragmentActivity, C70654Wea c70654Wea, UserSession userSession, String str, String str2, Map map, boolean z, boolean z2, boolean z3) {
        String str3;
        boolean z4;
        String A002;
        int i;
        AbstractC167027dH.A12(userSession, fragmentActivity, str);
        map.put("target_id", str);
        map.put("origin", str2);
        if (c70654Wea == null || (str3 = c70654Wea.A0F) == null) {
            str3 = "";
        }
        map.put("boosted_id", str3);
        if (c70654Wea != null) {
            z4 = !c70654Wea.BzE().isEmpty();
            if (z4) {
                ImmutableList BzE = c70654Wea.BzE();
                ArrayList A0q = AbstractC167017dG.A0q(BzE);
                Iterator<E> it = BzE.iterator();
                while (it.hasNext()) {
                    InterfaceC72003XEr interfaceC72003XEr = (InterfaceC72003XEr) it.next();
                    C14360o3.A0C(interfaceC72003XEr, "null cannot be cast to non-null type com.instagram.business.promote.model.Promotion");
                    String str4 = ((C70654Wea) interfaceC72003XEr).A0C;
                    if (str4 != null) {
                        A0q.add(str4);
                    } else {
                        C14360o3.A0F("adsMediaIgId");
                        throw C00O.createAndThrow();
                    }
                }
                map.put("split_test_partner_promotion_ids", AbstractC31175DnJ.A0b(A0q));
            }
        } else {
            z4 = false;
        }
        C006802i c006802i = C006802i.A0p;
        String A003 = AbstractC111324zv.A00(2170);
        if (z2) {
            A002 = AbstractC111324zv.A00(821);
            i = 39130588;
            c006802i.markerStart(39130588);
            c006802i.markerAnnotate(39130588, A003, A002);
        } else {
            if (z3) {
                A002 = AbstractC111324zv.A00(2139);
                i = 39137013;
            } else if (z) {
                A002 = AbstractC111324zv.A00(819);
                i = 39124993;
            } else {
                if (z4) {
                    A002 = "com.instagram.insights.media_refresh.split_tests.surface";
                } else {
                    A002 = AbstractC111324zv.A00(817);
                }
                i = 39124994;
            }
            c006802i.markerStart(i);
            c006802i.markerAnnotate(i, A003, A002);
            c006802i.markerAnnotate(i, AbstractC111324zv.A00(1013), "umi");
        }
        AbstractC167007dF.A0J().postDelayed(new RunnableC71480Wug(c006802i, i), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
        int i2 = 2131952248;
        if (C18U.A06(C06090Tz.A06, userSession, 36329955830874711L)) {
            i2 = 2131957604;
        }
        String string = fragmentActivity.getString(i2);
        C14360o3.A0A(string);
        C66277U6x A012 = C66277U6x.A01(A002, map);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = string;
        igBloksScreenConfig.A03 = new EOY(i, 1);
        A012.A04(fragmentActivity, igBloksScreenConfig);
    }
}
