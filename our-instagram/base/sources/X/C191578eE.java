package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;
import java.util.List;

/* renamed from: X.8eE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191578eE {
    public Dialog A00;
    public C47947LGc A01;
    public final Activity A02;
    public final Context A03;
    public final Fragment A04;
    public final UserSession A05;
    public final C22C A06;
    public final C23031Ai A07;
    public final C46552Bt A08;
    public final CallerContext A09 = CallerContext.A01("ClipsPanavisionDialogNuxController");

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.EnumC50631MWs r28, X.C191578eE r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191578eE.A04(X.MWs, X.8eE, boolean, boolean):void");
    }

    public static final Drawable A00(C191578eE c191578eE) {
        Context context = c191578eE.A03;
        Drawable drawable = context.getDrawable(R.drawable.instagram_reels_outline_96);
        if (drawable != null) {
            Activity activity = c191578eE.A02;
            return C3LQ.A03(context, drawable, context.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_gradient_red)), context.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_gradient_purple)));
        }
        return null;
    }

    public static final Boolean A01(C191578eE c191578eE) {
        boolean z;
        C200108tF c200108tF = C200108tF.A01;
        UserSession userSession = c191578eE.A05;
        boolean A06 = C200108tF.A06(userSession);
        boolean A0C = c191578eE.A08.A0C();
        if (!A06 && (!c200108tF.A0F(userSession) || !C196218mC.A00(userSession) || AbstractC46542Bs.A00(userSession).A0C())) {
            if (A0C) {
                z = false;
            } else {
                return null;
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final void A02(EnumC50631MWs enumC50631MWs, C191578eE c191578eE, Boolean bool) {
        C22C c22c = c191578eE.A06;
        c22c.A1O(enumC50631MWs, bool, "PANAVIDEO_NOTIFICATION_SETTINGS");
        C448724r c448724r = c22c.A0F;
        C22P c22p = C22P.A0c;
        C14360o3.A0B(enumC50631MWs, 1);
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A27, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_OPEN_CONTROLS");
            String str = c448724r.A04.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("module", "clips_settings");
            A00.A8R(enumC50631MWs, "surface");
            A00.A7v(MSV.A00(1334), bool);
            A00.Cht();
        }
        UserSession userSession = c191578eE.A05;
        Fragment fragment = c191578eE.A04;
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putString(DialogModule.KEY_TITLE, c191578eE.A03.getResources().getString(2131955256));
        String str2 = ((C22F) c22c).A04.A0L;
        if (str2 != null) {
            requireArguments.putString("camera_session_id", str2);
        }
        C6XJ c6xj = new C6XJ(fragment.requireActivity(), requireArguments, userSession, ModalActivity.class, AbstractC111324zv.A00(801));
        c6xj.A07();
        c6xj.A0D(fragment, 9785);
    }

    public static final void A03(EnumC50631MWs enumC50631MWs, C191578eE c191578eE, Boolean bool, String str) {
        c191578eE.A06.A1O(enumC50631MWs, bool, "PANAVIDEO_NOTIFICATION_LEARN_MORE");
        C35133Fea c35133Fea = SimpleWebViewActivity.A02;
        Context context = c191578eE.A03;
        UserSession userSession = c191578eE.A05;
        SXK sxk = new SXK(str);
        sxk.A02 = context.getString(2131965052);
        c35133Fea.A02(context, userSession, new SimpleWebViewConfig(sxk));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
    public static final void A05(EnumC50631MWs enumC50631MWs, C191578eE c191578eE, boolean z, boolean z2) {
        Context context;
        int i;
        InfoItem infoItem;
        ?? obj = new Object();
        if (z) {
            C51624MrH A01 = C200108tF.A01(c191578eE.A09, c191578eE.A05);
            if (A01 != null) {
                int ordinal = A01.A01.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 5) {
                                infoItem = null;
                            } else {
                                context = c191578eE.A03;
                                i = 2131955634;
                            }
                        } else {
                            context = c191578eE.A03;
                            i = 2131955632;
                        }
                    } else {
                        context = c191578eE.A03;
                        i = 2131955633;
                    }
                } else {
                    context = c191578eE.A03;
                    i = 2131955635;
                }
                String string = context.getString(i);
                C14360o3.A07(string);
                infoItem = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_facebook_circle_pano_outline_24), Integer.valueOf(R.color.igds_primary_text), string, null);
            }
            UserSession userSession = c191578eE.A05;
            Activity activity = c191578eE.A02;
            TitleIcon titleIcon = new TitleIcon(new ColorTint(0, AbstractC53242c7.A0H(activity, R.attr.igds_color_gradient_red), AbstractC53242c7.A0H(activity, R.attr.igds_color_gradient_purple)), R.drawable.instagram_reels_outline_96);
            Context context2 = c191578eE.A03;
            String string2 = context2.getString(2131955617);
            C14360o3.A07(string2);
            IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
            Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
            InfoItem infoItem2 = new InfoItem(simpleIconConfig, valueOf, string2, null);
            String string3 = context2.getString(2131955618);
            C14360o3.A07(string3);
            InfoItem infoItem3 = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_user_circle_pano_outline_24), valueOf, string3, null);
            String string4 = context2.getString(2131955631);
            C14360o3.A07(string4);
            InfoItem[] infoItemArr = {infoItem2, infoItem3, new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_remix_pano_outline_24), valueOf, string4, null), (InfoItem) obj.A00};
            C14360o3.A0B(infoItemArr, 0);
            List A0I = AbstractC009903n.A0I(infoItemArr);
            String string5 = context2.getString(2131968948);
            C14360o3.A07(string5);
            String string6 = context2.getString(2131963271);
            C14360o3.A07(string6);
            C47947LGc c47947LGc = new C47947LGc(userSession, new PrimerBottomSheetConfig(titleIcon, null, null, null, null, null, null, null, "ClipsPanavisionDialogNuxController", string5, string6, null, A0I, 2131955639, false, false, false), null, true, true, false);
            Boolean A012 = A01(c191578eE);
            c47947LGc.A00 = new ASM(enumC50631MWs, c191578eE, c47947LGc, A012);
            c47947LGc.A01 = new ASN(enumC50631MWs, c191578eE, c47947LGc, A012);
            c191578eE.A01 = c47947LGc;
            SpannableString spannableString = new SpannableString(context2.getString(2131955628));
            spannableString.setSpan(new ForegroundColorSpan(context2.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_link))), 0, spannableString.length(), 33);
            spannableString.setSpan(new C50768MbZ(enumC50631MWs, c191578eE, c47947LGc, A012, obj), 0, spannableString.length(), 33);
            c47947LGc.A03 = spannableString;
            c47947LGc.A02(context2);
            A06(c191578eE);
        }
        if (z2) {
            context = c191578eE.A03;
            i = 2131955630;
        } else {
            C200108tF c200108tF = C200108tF.A01;
            UserSession userSession2 = c191578eE.A05;
            if (c200108tF.A0F(userSession2) && C196218mC.A00(userSession2) && !AbstractC46542Bs.A00(userSession2).A0C()) {
                context = c191578eE.A03;
                i = 2131955636;
            }
            UserSession userSession3 = c191578eE.A05;
            Activity activity2 = c191578eE.A02;
            TitleIcon titleIcon2 = new TitleIcon(new ColorTint(0, AbstractC53242c7.A0H(activity2, R.attr.igds_color_gradient_red), AbstractC53242c7.A0H(activity2, R.attr.igds_color_gradient_purple)), R.drawable.instagram_reels_outline_96);
            Context context22 = c191578eE.A03;
            String string22 = context22.getString(2131955617);
            C14360o3.A07(string22);
            IconConfig.SimpleIconConfig simpleIconConfig2 = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
            Integer valueOf2 = Integer.valueOf(R.color.igds_primary_text);
            InfoItem infoItem22 = new InfoItem(simpleIconConfig2, valueOf2, string22, null);
            String string32 = context22.getString(2131955618);
            C14360o3.A07(string32);
            InfoItem infoItem32 = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_user_circle_pano_outline_24), valueOf2, string32, null);
            String string42 = context22.getString(2131955631);
            C14360o3.A07(string42);
            InfoItem[] infoItemArr2 = {infoItem22, infoItem32, new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_remix_pano_outline_24), valueOf2, string42, null), (InfoItem) obj.A00};
            C14360o3.A0B(infoItemArr2, 0);
            List A0I2 = AbstractC009903n.A0I(infoItemArr2);
            String string52 = context22.getString(2131968948);
            C14360o3.A07(string52);
            String string62 = context22.getString(2131963271);
            C14360o3.A07(string62);
            C47947LGc c47947LGc2 = new C47947LGc(userSession3, new PrimerBottomSheetConfig(titleIcon2, null, null, null, null, null, null, null, "ClipsPanavisionDialogNuxController", string52, string62, null, A0I2, 2131955639, false, false, false), null, true, true, false);
            Boolean A0122 = A01(c191578eE);
            c47947LGc2.A00 = new ASM(enumC50631MWs, c191578eE, c47947LGc2, A0122);
            c47947LGc2.A01 = new ASN(enumC50631MWs, c191578eE, c47947LGc2, A0122);
            c191578eE.A01 = c47947LGc2;
            SpannableString spannableString2 = new SpannableString(context22.getString(2131955628));
            spannableString2.setSpan(new ForegroundColorSpan(context22.getColor(AbstractC53242c7.A0H(activity2, R.attr.igds_color_link))), 0, spannableString2.length(), 33);
            spannableString2.setSpan(new C50768MbZ(enumC50631MWs, c191578eE, c47947LGc2, A0122, obj), 0, spannableString2.length(), 33);
            c47947LGc2.A03 = spannableString2;
            c47947LGc2.A02(context22);
            A06(c191578eE);
        }
        String string7 = context.getString(i);
        C14360o3.A07(string7);
        infoItem = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_facebook_circle_pano_outline_24), Integer.valueOf(R.color.igds_primary_text), string7, null);
        obj.A00 = infoItem;
        UserSession userSession32 = c191578eE.A05;
        Activity activity22 = c191578eE.A02;
        TitleIcon titleIcon22 = new TitleIcon(new ColorTint(0, AbstractC53242c7.A0H(activity22, R.attr.igds_color_gradient_red), AbstractC53242c7.A0H(activity22, R.attr.igds_color_gradient_purple)), R.drawable.instagram_reels_outline_96);
        Context context222 = c191578eE.A03;
        String string222 = context222.getString(2131955617);
        C14360o3.A07(string222);
        IconConfig.SimpleIconConfig simpleIconConfig22 = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
        Integer valueOf22 = Integer.valueOf(R.color.igds_primary_text);
        InfoItem infoItem222 = new InfoItem(simpleIconConfig22, valueOf22, string222, null);
        String string322 = context222.getString(2131955618);
        C14360o3.A07(string322);
        InfoItem infoItem322 = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_user_circle_pano_outline_24), valueOf22, string322, null);
        String string422 = context222.getString(2131955631);
        C14360o3.A07(string422);
        InfoItem[] infoItemArr22 = {infoItem222, infoItem322, new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_remix_pano_outline_24), valueOf22, string422, null), (InfoItem) obj.A00};
        C14360o3.A0B(infoItemArr22, 0);
        List A0I22 = AbstractC009903n.A0I(infoItemArr22);
        String string522 = context222.getString(2131968948);
        C14360o3.A07(string522);
        String string622 = context222.getString(2131963271);
        C14360o3.A07(string622);
        C47947LGc c47947LGc22 = new C47947LGc(userSession32, new PrimerBottomSheetConfig(titleIcon22, null, null, null, null, null, null, null, "ClipsPanavisionDialogNuxController", string522, string622, null, A0I22, 2131955639, false, false, false), null, true, true, false);
        Boolean A01222 = A01(c191578eE);
        c47947LGc22.A00 = new ASM(enumC50631MWs, c191578eE, c47947LGc22, A01222);
        c47947LGc22.A01 = new ASN(enumC50631MWs, c191578eE, c47947LGc22, A01222);
        c191578eE.A01 = c47947LGc22;
        SpannableString spannableString22 = new SpannableString(context222.getString(2131955628));
        spannableString22.setSpan(new ForegroundColorSpan(context222.getColor(AbstractC53242c7.A0H(activity22, R.attr.igds_color_link))), 0, spannableString22.length(), 33);
        spannableString22.setSpan(new C50768MbZ(enumC50631MWs, c191578eE, c47947LGc22, A01222, obj), 0, spannableString22.length(), 33);
        c47947LGc22.A03 = spannableString22;
        c47947LGc22.A02(context222);
        A06(c191578eE);
    }

    public static final void A06(C191578eE c191578eE) {
        c191578eE.A07.A1S(true);
        InterfaceC19610xo ARD = c191578eE.A08.A04.ARD();
        ARD.E77("PREFERENCE_HAS_SEEN_PANAVISION_POST_CAPTURE_CONTENT_LIQUIDITY_NUX", true);
        ARD.apply();
        UserSession userSession = c191578eE.A05;
        AbstractC201108us.A00(C82G.A0S, EnumC201098ur.VIEW, C82H.A0H, null, userSession);
    }

    public C191578eE(Activity activity, Fragment fragment, UserSession userSession) {
        this.A04 = fragment;
        this.A05 = userSession;
        this.A02 = activity;
        this.A03 = fragment.requireContext();
        this.A07 = AbstractC23021Ah.A00(userSession);
        this.A06 = AnonymousClass229.A01(userSession);
        this.A08 = AbstractC46542Bs.A00(userSession);
    }
}
