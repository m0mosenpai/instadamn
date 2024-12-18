package X;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.nux.ui.NetzDgTermsTextView;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.DnP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31181DnP {
    public static float A00(TextView textView, List list, int i) {
        CharSequence charSequence = (CharSequence) list.get(i);
        float measureText = textView.getPaint().measureText(charSequence, 0, charSequence.length());
        if (charSequence instanceof SpannableStringBuilder) {
            Spanned spanned = (Spanned) charSequence;
            if (((C85973sR[]) spanned.getSpans(0, spanned.length(), C85973sR.class)).length != 0) {
                return measureText + r1[0].getDrawable().getIntrinsicWidth();
            }
            return measureText;
        }
        return measureText;
    }

    public static Bundle A06(Object obj, String str, String str2, String str3) {
        C14360o3.A0B(obj, 1);
        Bundle bundle = new Bundle();
        bundle.putString("invoice_id", str);
        bundle.putString("order_item_id", str2);
        bundle.putString("referrer", str3);
        AbstractC27401Ut.getInstance();
        return bundle;
    }

    public static void A0L(Activity activity, Window window) {
        window.setBackgroundDrawable(new ColorDrawable(0));
        activity.getWindow().setStatusBarColor(activity.getColor(R.color.fds_transparent));
    }

    public static void A0Z(Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0F = true;
        C14360o3.A0A(fragment);
        c140966Yy.A0B(null, fragment);
        c140966Yy.A04();
    }

    public static void A0l(C25531Mh c25531Mh, C142846ck c142846ck, Map map) {
        c25531Mh.A0r(null);
        c25531Mh.A0h(null);
        c25531Mh.A0u(c142846ck.A01);
        c25531Mh.A0v(map);
        c25531Mh.Cht();
    }

    public static void A0t(SuggestBusinessFragment suggestBusinessFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.CjK(new Y7A("pro_account_suggestions", suggestBusinessFragment.A05, null, null, null, null, null, null));
        }
        if (suggestBusinessFragment.getContext() != null) {
            C9GR.A07(suggestBusinessFragment.getContext(), 2131961896);
            SpinnerImageView spinnerImageView = suggestBusinessFragment.mLoadingSpinner;
            if (spinnerImageView != null && suggestBusinessFragment.mBusinessNavBar != null) {
                spinnerImageView.setVisibility(8);
            }
        }
    }

    public static int A01(Parcel parcel, Number number) {
        if (number == null) {
            return 0;
        }
        parcel.writeInt(1);
        return number.intValue();
    }

    public static AnimatorSet A04() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public static Intent A05(android.net.Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.VIEW").setData(uri).setPackage(str);
        C14360o3.A07(intent);
        return intent;
    }

    public static InterfaceC02590Ai A07(AbstractC12990ll abstractC12990ll) {
        C12210kP c12210kP = new C12210kP(abstractC12990ll);
        c12210kP.A01 = "direct_inbox";
        C18920wW A00 = c12210kP.A00();
        return A00.A00(A00.A00, "direct_inbox_action");
    }

    public static UserSession A08(Activity activity) {
        C09Y c09y = C023409i.A0A;
        Intent intent = activity.getIntent();
        C14360o3.A07(intent);
        return c09y.A06(AbstractC13580mk.A00(intent));
    }

    public static AnonymousClass988 A0A(InterfaceC09390do interfaceC09390do) {
        AnonymousClass989 anonymousClass989 = AnonymousClass988.A1Z;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        Parcelable.Creator creator = Capabilities.CREATOR;
        return anonymousClass989.A00(userSession, AbstractC2054797v.A00(C16930sl.A00));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3Mu, androidx.fragment.app.Fragment, X.EHM] */
    public static EHM A0C(String str, String str2) {
        ?? abstractC72473Mu = new AbstractC72473Mu();
        Bundle bundle = new Bundle();
        bundle.putString(DialogModule.KEY_TITLE, str);
        bundle.putString("body", str2);
        abstractC72473Mu.setArguments(bundle);
        return abstractC72473Mu;
    }

    public static C3NX A0D(Object obj) {
        return new C3NX(((C3DC) ((C3NX) obj).A00).F7f());
    }

    public static Long A0F(Object obj) {
        C47Z c47z = (C47Z) obj;
        return Long.valueOf(Math.max(c47z.A04(), c47z.A0g));
    }

    public static String A0G(AbstractC23721Ec abstractC23721Ec, String str, int i, int i2, int i3) {
        abstractC23721Ec.A0E = str;
        abstractC23721Ec.A9s("year", String.valueOf(i));
        abstractC23721Ec.A9s("month", String.valueOf(i2));
        return String.valueOf(i3);
    }

    public static void A0K(Activity activity, Intent intent, Bundle bundle, int i) {
        intent.putExtra("argument_client_extras_bundle", bundle);
        intent.setFlags(536870912);
        C12260kU.A08(activity, intent, i);
        activity.overridePendingTransition(R.anim.signup_content_slide_in, R.anim.signup_content_fade_out);
    }

    public static void A0M(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectMessageSearchMessage directMessageSearchMessage, InterfaceC83713oG interfaceC83713oG) {
        C36881nl A01 = C36881nl.A01(activity, interfaceC11380iw, userSession, "direct_message_search");
        A01.A0B = interfaceC83713oG;
        A01.A0X = directMessageSearchMessage.A07;
        A01.A0I = Long.valueOf(directMessageSearchMessage.A00);
        A01.A0J = Long.valueOf(directMessageSearchMessage.A01);
        A01.A0j = directMessageSearchMessage.A03;
        A01.A06();
    }

    public static void A0N(Context context, android.net.Uri uri) {
        Intent A01 = C14H.A03.A00().A01(context);
        A01.setData(uri);
        C12260kU.A0C(context, A01);
    }

    public static void A0O(Context context, AttributeSet attributeSet, NetzDgTermsTextView netzDgTermsTextView) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1n);
        C14360o3.A07(obtainStyledAttributes);
        netzDgTermsTextView.A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 0);
    }

    public static void A0R(BaseBundle baseBundle, String str, String str2, String str3, boolean z) {
        baseBundle.putString("COUNTRY_CODE", str);
        baseBundle.putString("NATIONAL_NUMBER", str2);
        baseBundle.putBoolean("IS_PHONE_CONFIRMED", z);
        baseBundle.putString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER, str3);
    }

    public static void A0S(Bundle bundle, Fragment fragment, AbstractC12990ll abstractC12990ll) {
        C6XJ c6xj = new C6XJ(fragment.requireActivity(), bundle, abstractC12990ll, ModalActivity.class, "bloks");
        c6xj.A07();
        c6xj.A0C(fragment.requireActivity());
    }

    public static void A0a(Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0D(fragment);
        c140966Yy.A0D = false;
        c140966Yy.A04();
    }

    public static void A0b(Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0E(fragment);
        c140966Yy.A0G = true;
        c140966Yy.A04();
    }

    public static void A0c(InterfaceC02590Ai interfaceC02590Ai) {
        String A05 = C1QE.A00(C34918Fa4.A01, "two_factor").A05();
        C14360o3.A07(A05);
        interfaceC02590Ai.AAP(AbstractC31182DnR.A04(), A05);
        interfaceC02590Ai.AAP("flow_id", C34918Fa4.A00);
    }

    public static void A0e(InterfaceC02590Ai interfaceC02590Ai, C154886xd c154886xd, User user, String str) {
        interfaceC02590Ai.AAP("event", str);
        interfaceC02590Ai.AAP("actor_id", c154886xd.A02);
        interfaceC02590Ai.AAP("follower_status", C154886xd.A01(c154886xd, user.B7L(), user.getId()));
        interfaceC02590Ai.AAP("subscriber_status", C154886xd.A02(c154886xd, user.A02, user.getId()));
        interfaceC02590Ai.A9K("profile_user_igid", Long.valueOf(Long.parseLong(user.getId())));
        interfaceC02590Ai.A9M("extra", new HashMap());
    }

    public static void A0f(InterfaceC02590Ai interfaceC02590Ai, C38321qM c38321qM, C75113Zb c75113Zb, Long l, String str) {
        interfaceC02590Ai.A9K("media_author_id", l);
        interfaceC02590Ai.A9K("m_ix", Long.valueOf(c75113Zb.getPosition()));
        interfaceC02590Ai.A9K("recs_ix", Long.valueOf(c75113Zb.A0W));
        interfaceC02590Ai.AAP("ranking_session_id", str);
        interfaceC02590Ai.A9K("m_t", Long.valueOf(c38321qM.BRp().A00));
        interfaceC02590Ai.Cht();
    }

    public static void A0h(InterfaceC02590Ai interfaceC02590Ai, Long l, String str, String str2, String str3) {
        interfaceC02590Ai.AAP("message_id", str);
        interfaceC02590Ai.A9K("sender_id", l);
        interfaceC02590Ai.AAP("bot_response_id", str2);
        interfaceC02590Ai.A8R(EnumC72433Xdd.A02, "thread_type");
        interfaceC02590Ai.AAP("thread_session_id", str3);
    }

    public static void A0i(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, String str3) {
        interfaceC02590Ai.AAP("action", str);
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        interfaceC02590Ai.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
        interfaceC02590Ai.Cht();
    }

    public static void A0m(C25621Ms c25621Ms) {
        c25621Ms.A05();
        c25621Ms.A03();
        String A0u = AnonymousClass001.A0u("api/", "v1/", "users/", "set_birthday_opt_in_settings/");
        C14360o3.A07(A0u);
        c25621Ms.A0E = A0u;
        c25621Ms.A0R(EA1.class, C34733FRw.class);
    }

    public static void A0o(AbstractC23721Ec abstractC23721Ec, RegFlowExtras regFlowExtras) {
        UserBirthDate userBirthDate = regFlowExtras.A03;
        if (userBirthDate != null) {
            abstractC23721Ec.A9s("year", Integer.toString(userBirthDate.A02));
            abstractC23721Ec.A9s("month", Integer.toString(regFlowExtras.A03.A01));
            abstractC23721Ec.A9s("day", Integer.toString(regFlowExtras.A03.A00));
        }
    }

    public static void A0p(AbstractC32247EIg abstractC32247EIg, JZ8 jz8) {
        UserSession userSession = (UserSession) abstractC32247EIg.A0E.getValue();
        jz8.A01(abstractC32247EIg.requireActivity(), abstractC32247EIg.A0A(), userSession, abstractC32247EIg.A0H(), abstractC32247EIg.A0G());
    }

    public static void A0u(C18920wW c18920wW, String str, String str2) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP("module", str2);
        if (A00.isSampled()) {
            A00.Cht();
        }
    }

    public static void A0v(C18920wW c18920wW, String str, String str2, String str3) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.A9K("business_igid", AbstractC003100w.A0k(10, str2));
            A00.A9K("consumer_igid", AbstractC003100w.A0k(10, str3));
            A00.Cht();
        }
    }

    public static boolean A11(AbstractC12990ll abstractC12990ll, String str) {
        C14360o3.A0B(abstractC12990ll, 2);
        return !AMd.A04("ig_android_access_library_fx_fetch_active_msgr_token", str, new C200898uW(abstractC12990ll, null));
    }

    public static int A02(Fragment fragment) {
        return fragment.requireContext().getColor(AbstractC53242c7.A0C(fragment.getContext()));
    }

    public static int A03(InterfaceC09390do interfaceC09390do) {
        C2ED c2ed = (C2ED) interfaceC09390do.getValue();
        if (c2ed != null) {
            return c2ed.C7g();
        }
        return 0;
    }

    public static IgImageView A09(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.fragment_direct_reply_modal_circular_profile);
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.CircularImageView");
        return (IgImageView) inflate;
    }

    public static RegFlowExtras A0B(RegFlowExtras regFlowExtras) {
        Parcel obtain = Parcel.obtain();
        regFlowExtras.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        RegFlowExtras regFlowExtras2 = (RegFlowExtras) RegFlowExtras.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return regFlowExtras2;
    }

    public static Integer A0E(EOJ eoj) {
        C81663kb A0F = eoj.A0F();
        if (A0F != null) {
            return Integer.valueOf(A0F.AdZ());
        }
        return null;
    }

    public static String A0H(String str) {
        String country = C1Q2.A02().getCountry();
        if (country != null) {
            return PhoneNumberUtils.formatNumber(str, country);
        }
        return PhoneNumberUtils.formatNumber(str);
    }

    public static StringBuilder A0I(Context context, String str) {
        if (AbstractC13620mo.A02(context)) {
            StringBuilder sb = new StringBuilder();
            List asList = Arrays.asList(str.split(" "));
            Collections.reverse(asList);
            sb.append(C71473Il.A00(' ').A02(asList));
            sb.append('+');
            return sb;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('+');
        sb2.append(str);
        return sb2;
    }

    public static HashMap A0J(Object obj, Object obj2, Object obj3, Object obj4) {
        C14360o3.A07(obj);
        HashMap hashMap = new HashMap();
        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, obj2);
        hashMap.put("waterfall_id", obj3);
        hashMap.put("prior_module", obj4);
        hashMap.put("presentation_style", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        return hashMap;
    }

    public static void A0P(Resources resources, C38321qM c38321qM, C146106i8 c146106i8, int i, int i2) {
        c146106i8.A0D = resources.getQuantityString(i, i2);
        c146106i8.A09 = c38321qM.A1S();
        c146106i8.A03();
        c146106i8.A0L = true;
    }

    public static void A0Q(android.net.Uri uri, String str, JSONObject jSONObject) {
        if (uri.getQueryParameter(str) != null && !uri.getQueryParameter(str).isEmpty()) {
            jSONObject.put(str, uri.getQueryParameter(str));
        }
    }

    public static void A0T(Bundle bundle, FragmentActivity fragmentActivity, C64501TGn c64501TGn, int i) {
        c64501TGn.A07 = fragmentActivity.getString(i);
        c64501TGn.A00(bundle);
        c64501TGn.EqV(fragmentActivity).A04();
    }

    public static void A0U(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, Object obj, int i) {
        spannableStringBuilder.append(charSequence);
        C14360o3.A07(spannableStringBuilder.append('\n'));
        spannableStringBuilder.setSpan(obj, i, spannableStringBuilder.length(), 17);
    }

    public static void A0V(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof IgLinearLayout) && (viewGroup = (ViewGroup) parent) != null) {
            TransitionManager.beginDelayedTransition(viewGroup, new AutoTransition());
        }
    }

    public static void A0W(View view, InterfaceC148366m6 interfaceC148366m6) {
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            AbstractC34082F2k.A00(findViewById);
            interfaceC148366m6.DWL();
        }
    }

    public static void A0X(TextView textView, float f) {
        textView.setWidth((int) (textView.getWidth() * f));
        textView.setHeight(textView.getHeight());
    }

    public static void A0Y(Fragment fragment) {
        if (fragment.getContext() != null) {
            ((Activity) fragment.getContext()).onBackPressed();
        }
    }

    public static void A0d(InterfaceC02590Ai interfaceC02590Ai, C154886xd c154886xd) {
        C154886xd.A03(c154886xd);
        interfaceC02590Ai.AAP("parent_surface", "instagram");
        interfaceC02590Ai.AAP("surface", "dm_thread_view");
    }

    public static void A0g(InterfaceC02590Ai interfaceC02590Ai, InterfaceC83733oI interfaceC83733oI) {
        if (AbstractC1345466e.A02(interfaceC83733oI) != null) {
            interfaceC02590Ai.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, AbstractC1345466e.A01(interfaceC83733oI).A00);
        }
    }

    public static void A0j(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, String str3, String str4) {
        interfaceC02590Ai.AAK(C4SX.A00(str), "merchant_id");
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("prior_module", str2);
        c0Zx.A06("prior_submodule", str3);
        c0Zx.A06("shopping_session_id", str4);
        interfaceC02590Ai.AAQ(c0Zx, "navigation_info");
    }

    public static void A0k(C0Zx c0Zx, UserSession userSession, C46552Bt c46552Bt, boolean z) {
        c0Zx.A03("is_account_linked", Boolean.valueOf(z));
        c0Zx.A03("reels_ccp_xpost_setting", Boolean.valueOf(C200108tF.A06(userSession)));
        c0Zx.A03("reels_xar_xpost_setting", Boolean.valueOf(c46552Bt.A0C()));
    }

    public static void A0n(C25621Ms c25621Ms, String str, String str2, String str3, String str4) {
        c25621Ms.A03();
        c25621Ms.A0B("api/v1/direct_v2/collection/grid_view_items/");
        c25621Ms.A0R(C67800UyZ.class, C69866Vwr.class);
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        c25621Ms.A9s("client_context", str2);
        c25621Ms.A9s("collection_type", str3);
        c25621Ms.A9s("collection_id", str4);
    }

    public static void A0q(EKa eKa) {
        eKa.requireActivity().setResult(-1, eKa.A0E);
        eKa.requireActivity().finishAfterTransition();
    }

    public static void A0r(AbstractC59962oe abstractC59962oe) {
        Activity rootActivity = abstractC59962oe.getRootActivity();
        rootActivity.getClass();
        Window window = rootActivity.getWindow();
        window.getClass();
        window.setSoftInputMode(48);
    }

    public static void A0s(C140966Yy c140966Yy, AbstractC12990ll abstractC12990ll, String str, String str2, Map map) {
        C66277U6x A01 = C66277U6x.A01(str, map);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(abstractC12990ll);
        igBloksScreenConfig.A0U = str2;
        c140966Yy.A0D(W6d.A02(igBloksScreenConfig, A01));
    }

    public static void A0w(UserSession userSession, C38321qM c38321qM, Object obj, AbstractMap abstractMap) {
        abstractMap.put("media_id", c38321qM.getId());
        abstractMap.put("ranking_token", c38321qM.A0C.getLoggingInfoToken());
        abstractMap.put("media_owner_id", c38321qM.A2E(userSession).getId());
        abstractMap.put("option", c38321qM.BRp().name());
        abstractMap.put("share_surface", obj);
    }

    public static void A0x(UserSession userSession, C3o9 c3o9) {
        AbstractC46876KoJ.A00(userSession).A00(JRE.A03(c3o9).A00, 0L);
    }

    public static void A0y(ELT elt, Boolean bool) {
        Context requireContext = elt.requireContext();
        UserSession userSession = elt.A02;
        Bitmap bitmap = elt.A00;
        boolean booleanValue = bool.booleanValue();
        C14360o3.A0B(userSession, 1);
        if (bitmap != null) {
            AbstractC33774Ew0.A00(requireContext, bitmap, new C32548EUy(requireContext, 2), userSession, C1GJ.A01(), booleanValue);
        }
    }

    public static void A0z(EM6 em6, List list) {
        if (em6.isAdded()) {
            GI1 gi1 = em6.A0B;
            C14360o3.A0B(list, 0);
            C31787Dy6 c31787Dy6 = gi1.A06;
            int size = c31787Dy6.A01.size();
            for (int i = 0; i < size; i++) {
                InterfaceC37211GaM interfaceC37211GaM = (InterfaceC37211GaM) c31787Dy6.A00.get(i);
                if (interfaceC37211GaM != null) {
                    interfaceC37211GaM.EFj(list);
                }
            }
            EM6.A09(em6, EM6.A00(list));
            EM6.A05(em6);
        }
    }

    public static void A10(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((User) it.next()).Bhu().getUrl());
    }
}
