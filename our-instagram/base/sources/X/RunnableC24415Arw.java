package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* renamed from: X.Arw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24415Arw implements Runnable {
    public final /* synthetic */ C191478dz A00;

    public RunnableC24415Arw(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22C c22c;
        boolean z;
        C191578eE c191578eE = this.A00.A0n;
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0I;
        Dialog dialog = c191578eE.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        C47947LGc c47947LGc = c191578eE.A01;
        if (c47947LGc != null) {
            c47947LGc.A01();
        }
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = c191578eE.A05;
        Integer A0M = c08730cb.A01(userSession).A0M();
        Integer num = C05F.A01;
        boolean A1X = AbstractC167007dF.A1X(A0M, num);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36315687949831668L) && C18U.A06(c06090Tz, userSession, 36315687950028277L)) {
            boolean A06 = C18U.A06(c06090Tz, userSession, 36315687949700595L);
            if (c08730cb.A01(userSession).A0M() == num) {
                if (A06) {
                    C189448aO c189448aO = new C189448aO(userSession);
                    c189448aO.A0k = false;
                    c189448aO.A0q = false;
                    c189448aO.A11 = true;
                    c189448aO.A0y = false;
                    C189478aR A00 = c189448aO.A00();
                    Boolean A01 = C191578eE.A01(c191578eE);
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                    C52131N5f c52131N5f = new C52131N5f();
                    c52131N5f.setArguments(A0b);
                    Context context = c191578eE.A03;
                    SpannableString spannableString = new SpannableString(context.getString(2131955628));
                    spannableString.setSpan(new ForegroundColorSpan(context.getColor(AbstractC53242c7.A06(c191578eE.A02))), 0, spannableString.length(), 33);
                    spannableString.setSpan(new C50766MbX(2, A01, c191578eE, enumC50631MWs), 0, spannableString.length(), 33);
                    c52131N5f.A03 = spannableString;
                    c52131N5f.A00 = new ViewOnClickListenerC55417OjS(3, A00, enumC50631MWs, A01, c191578eE);
                    c52131N5f.A01 = new ViewOnClickListenerC55459OkE(11, enumC50631MWs, A01, c191578eE);
                    A00.A02(c191578eE.A04.requireActivity(), c52131N5f);
                } else {
                    C200108tF c200108tF = C200108tF.A01;
                    if (C200108tF.A05(userSession) && (C200108tF.A04(null, userSession, c200108tF) || !C200108tF.A07(userSession))) {
                        C191578eE.A05(enumC50631MWs, c191578eE, C200108tF.A06(userSession), false);
                    } else if ((!C200108tF.A05(userSession) || (!C200108tF.A04(null, userSession, c200108tF) && C200108tF.A07(userSession))) && !C18U.A06(c06090Tz, userSession, 36315687949831668L) && C18U.A06(c06090Tz, userSession, 36315687950028277L) && C200108tF.A07(userSession)) {
                        C191578eE.A05(enumC50631MWs, c191578eE, false, c191578eE.A08.A0C());
                    }
                }
                c22c = c191578eE.A06;
                z = C191578eE.A01(c191578eE);
            } else {
                C200108tF c200108tF2 = C200108tF.A01;
                if (!C200108tF.A05(userSession)) {
                    return;
                }
                if (!C200108tF.A04(null, userSession, c200108tF2) && C200108tF.A07(userSession)) {
                    return;
                }
                if (c200108tF2.A0F(userSession)) {
                    C191578eE.A04(enumC50631MWs, c191578eE, false, A06);
                } else if (C200108tF.A06(userSession)) {
                    C191578eE.A04(enumC50631MWs, c191578eE, true, A06);
                } else {
                    C193328hC c193328hC = new C193328hC(c191578eE.A03);
                    c193328hC.A0j(C191578eE.A00(c191578eE));
                    c193328hC.A0t(true);
                    c193328hC.A0C(new DialogInterfaceOnCancelListenerC55247OfL(4, c191578eE, enumC50631MWs));
                    c193328hC.A0A(2131955639);
                    c193328hC.A09(2131955620);
                    c193328hC.A0F(new DialogInterfaceOnClickListenerC55321Ogj(13, enumC50631MWs, c191578eE));
                    c193328hC.A0h(new DialogInterfaceOnShowListenerC55325Ogn(c191578eE, 0));
                    c193328hC.A0H(new DialogInterfaceOnClickListenerC55321Ogj(14, enumC50631MWs, c191578eE), 2131965052);
                    Dialog A02 = c193328hC.A02();
                    c191578eE.A00 = A02;
                    if (!c191578eE.A02.isFinishing()) {
                        C0fJ.A00(A02);
                    }
                }
                c22c = c191578eE.A06;
                z = true;
            }
            c22c.A1M(enumC50631MWs, z);
            return;
        }
        if (A1X) {
            Activity activity = c191578eE.A02;
            TitleIcon titleIcon = new TitleIcon(new ColorTint(0, AbstractC53242c7.A0H(activity, R.attr.igds_color_gradient_red), AbstractC53242c7.A0H(activity, R.attr.igds_color_gradient_purple)), R.drawable.instagram_reels_outline_96);
            Context context2 = c191578eE.A03;
            String A0p = AbstractC166997dE.A0p(context2, 2131955617);
            IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
            Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
            InfoItem[] infoItemArr = {new InfoItem(simpleIconConfig, valueOf, A0p, null), new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_user_circle_pano_outline_24), valueOf, AbstractC166997dE.A0p(context2, 2131955629), null), new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_remix_pano_outline_24), valueOf, AbstractC166997dE.A0p(context2, 2131955631), null)};
            C14360o3.A0B(infoItemArr, 0);
            C47947LGc c47947LGc2 = new C47947LGc(userSession, new PrimerBottomSheetConfig(titleIcon, null, null, null, null, null, null, null, "ClipsPanavisionDialogNuxController", AbstractC166997dE.A0p(context2, 2131968948), AbstractC166997dE.A0p(context2, 2131963271), null, AbstractC009903n.A0I(infoItemArr), 2131955639, false, false, false), null, true, true, false);
            c47947LGc2.A00 = new ViewOnClickListenerC55459OkE(9, enumC50631MWs, c47947LGc2, c191578eE);
            c47947LGc2.A01 = new ViewOnClickListenerC55459OkE(10, enumC50631MWs, c47947LGc2, c191578eE);
            SpannableString spannableString2 = new SpannableString(context2.getString(2131955628));
            spannableString2.setSpan(new C50766MbX(1, c47947LGc2, c191578eE, enumC50631MWs), 0, spannableString2.length(), 33);
            c47947LGc2.A03 = spannableString2;
            c191578eE.A01 = c47947LGc2;
            c47947LGc2.A02(context2);
            c191578eE.A06.A1M(enumC50631MWs, null);
        } else {
            C193328hC c193328hC2 = new C193328hC(c191578eE.A03);
            c193328hC2.A0j(C191578eE.A00(c191578eE));
            c193328hC2.A0F(new DialogInterfaceOnClickListenerC55321Ogj(11, enumC50631MWs, c191578eE));
            c193328hC2.A0t(true);
            c193328hC2.A0C(new DialogInterfaceOnCancelListenerC55247OfL(3, c191578eE, enumC50631MWs));
            c193328hC2.A0A(2131955637);
            c193328hC2.A09(2131955620);
            c193328hC2.A0H(new DialogInterfaceOnClickListenerC55321Ogj(12, enumC50631MWs, c191578eE), 2131965052);
            Dialog A022 = c193328hC2.A02();
            if (!c191578eE.A02.isFinishing()) {
                c191578eE.A00 = A022;
                C0fJ.A00(A022);
                c191578eE.A06.A1M(enumC50631MWs, null);
            }
        }
        c191578eE.A07.A1S(true);
        AbstractC201108us.A00(C82G.A0S, EnumC201098ur.VIEW, C82H.A0H, null, userSession);
    }
}
