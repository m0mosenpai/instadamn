package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.sponsored.AdTag;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3bO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76193bO {
    public static final Drawable A00(Context context, UserSession userSession, C38321qM c38321qM, C3YE c3ye) {
        int i;
        String BEi;
        Drawable A02;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c3ye, 1);
        C14360o3.A0B(c38321qM, 2);
        C14360o3.A0B(userSession, 3);
        int i2 = R.color.design_dark_default_color_on_background;
        switch (c3ye.ordinal()) {
            case 1:
            case 2:
                i = R.drawable.instagram_user_pano_filled_24;
                break;
            case 3:
            case 4:
                i = R.drawable.instagram_shopping_bag_pano_filled_24;
                break;
            case 5:
                i = R.drawable.instagram_reels_filled_12;
                break;
            case 6:
                i = R.drawable.instagram_camera_filled_16;
                break;
            case 7:
                i = R.drawable.instagram_calendar_pano_filled_24;
                break;
            case 8:
                i = R.drawable.instagram_donations_filled_12;
                break;
            case 9:
                i = R.drawable.instagram_star_pano_filled_24;
                i2 = R.color.igds_active_badge;
                break;
            case 10:
                InterfaceC43558JLs B5l = c38321qM.A0C.B5l();
                if (B5l != null && (BEi = B5l.BEi()) != null && (A02 = AbstractC65877Tvg.A02(context, BEi)) != null) {
                    TypedValue typedValue = AbstractC85953sP.A00;
                    int color = context.getColor(R.color.design_dark_default_color_on_background);
                    Drawable mutate = A02.mutate();
                    C14360o3.A07(mutate);
                    mutate.setColorFilter(C3DY.A00(color));
                    return mutate;
                }
                i = R.drawable.instagram_compass_pano_filled_24;
                break;
                break;
            case 11:
                i = R.drawable.instagram_story_highlight_pano_outline_24;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = R.drawable.instagram_add_pano_filled_24;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = R.drawable.instagram_content_note_add_pano_outline_24;
                break;
            case 14:
            case Process.SIGTERM /* 15 */:
                boolean A0N = C57532kS.A00(userSession).A0N(c38321qM);
                i = R.drawable.instagram_heart_pano_outline_24;
                if (A0N) {
                    i = R.drawable.instagram_heart_pano_filled_24;
                    break;
                }
                break;
            case 16:
                i = R.drawable.instagram_app_horizon_pano_filled_24;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC111324zv.A00(341));
                sb.append(c3ye);
                throw new IllegalStateException(sb.toString());
        }
        return AbstractC85953sP.A01(context, i, i2);
    }

    public static final C3YE A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        return A02(userSession, c38321qM, c38321qM);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    public static final String A03(Context context, UserSession userSession, C38321qM c38321qM, C3YE c3ye) {
        int i;
        String text;
        List AZh;
        InterfaceC107754tK interfaceC107754tK;
        String title;
        C14360o3.A0B(c3ye, 1);
        switch (c3ye.ordinal()) {
            case 1:
            case 2:
            case Process.SIGTERM /* 15 */:
                return "";
            case 3:
            case 4:
                i = 2131976875;
                String string = context.getString(i);
                C14360o3.A07(string);
                return string;
            case 5:
                i = 2131977010;
                String string2 = context.getString(i);
                C14360o3.A07(string2);
                return string2;
            case 6:
                i = 2131976434;
                String string22 = context.getString(i);
                C14360o3.A07(string22);
                return string22;
            case 7:
                UpcomingEvent A2B = c38321qM.A2B(userSession);
                if (A2B != null) {
                    return AbstractC54244NyP.A00(userSession, C13920nI.A00, A2B).A00(context, EnumC53260Ngy.A09);
                }
                throw new IllegalStateException("Required value was null.");
            case 8:
                i = 2131961120;
                String string222 = context.getString(i);
                C14360o3.A07(string222);
                return string222;
            case 9:
                i = 2131956173;
                String string2222 = context.getString(i);
                C14360o3.A07(string2222);
                return string2222;
            case 10:
                InterfaceC43558JLs B5l = c38321qM.A0C.B5l();
                if (B5l == null || (text = B5l.getText()) == null) {
                    String string3 = context.getString(2131957635);
                    C14360o3.A07(string3);
                    return string3;
                }
                return text;
            case 11:
                InterfaceC107774tM BEB = c38321qM.A0C.BEB();
                if (BEB == null || (AZh = BEB.AZh()) == null || (interfaceC107754tK = (InterfaceC107754tK) AbstractC001800i.A0J(AZh)) == null || (title = interfaceC107754tK.getTitle()) == null) {
                    return "";
                }
                return title;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 2131969111;
                String string22222 = context.getString(i);
                C14360o3.A07(string22222);
                return string22222;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 2131955238;
                String string222222 = context.getString(i);
                C14360o3.A07(string222222);
                return string222222;
            case 14:
                if (c38321qM.A0w() <= 0) {
                    return "";
                }
                return String.valueOf(c38321qM.A0w());
            case 16:
                i = 2131963685;
                String string2222222 = context.getString(i);
                C14360o3.A07(string2222222);
                return string2222222;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC111324zv.A00(341));
                sb.append(c3ye);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [com.instagram.model.barcelonashare.BarcelonaTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, com.instagram.model.barcelonashare.BarcelonaTag$BarcelonaTagModel] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.instagram.model.sponsored.AdTag$AdTagModel] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.instagram.model.sponsored.AdTag$AdTagModel] */
    public static final ArrayList A04(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        String str;
        ArrayList A3O;
        PointF pointF;
        AdTag adTag;
        List list;
        C37905Gm2 c37905Gm2;
        ArrayList A3Q;
        C14360o3.A0B(c38321qM, 0);
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            str = A2E.getId();
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList A3M = c38321qM.A3M();
        if (A3M != null) {
            arrayList.addAll(A3M);
        }
        if (c38321qM.A1g(userSession).CdW()) {
            A3O = C5L4.A02(c38321qM);
        } else {
            A3O = c38321qM.A3O();
        }
        if (A3O != null) {
            arrayList.addAll(A3O);
        }
        ArrayList A3Q2 = c38321qM.A3Q();
        if (A3Q2 != null && !A3Q2.isEmpty() && (A3Q = c38321qM.A3Q()) != null && !A3Q.isEmpty() && OWJ.A00.A01(userSession, str, c38321qM.A5P())) {
            arrayList.addAll(A3Q);
        }
        if (A3M == null && c38321qM.A6Q() && C18U.A06(C06090Tz.A06, userSession, 36325897087038967L) && (c37905Gm2 = c75113Zb.A0k) != null) {
            PointF pointF2 = new PointF(c37905Gm2.A04 / c37905Gm2.A06, c37905Gm2.A05 / c37905Gm2.A07);
            ?? obj = new Object();
            ?? obj2 = new Object();
            obj2.A00 = obj;
            obj2.A00 = pointF2;
            arrayList.add(obj2);
        }
        if (arrayList.isEmpty() && AbstractC80233iC.A00(userSession, c38321qM)) {
            C37905Gm2 c37905Gm22 = c75113Zb.A0k;
            if (c38321qM.A5a()) {
                JMF B5y = c38321qM.A0C.B5y();
                if (B5y != null) {
                    list = B5y.BGq();
                } else {
                    list = null;
                }
                if (c37905Gm22 != null && list != null && !list.isEmpty()) {
                    int i = c37905Gm22.A06;
                    int i2 = 2;
                    int i3 = c37905Gm22.A07;
                    double d = i;
                    double d2 = d * 0.03d;
                    double d3 = d2 / 2.0d;
                    double d4 = i / 2;
                    double d5 = d4 - d3;
                    double d6 = i3 / 2;
                    double d7 = d6 - d3;
                    if (AbstractC80233iC.A01(c37905Gm22, d2, d2, d5, d7)) {
                        i2 = 0;
                    } else {
                        double d8 = d4 + d3;
                        double d9 = d - d2;
                        if (AbstractC80233iC.A01(c37905Gm22, d8, d2, d9, d7)) {
                            i2 = 1;
                        } else {
                            double d10 = d6 + d3;
                            double d11 = i3 - d2;
                            if (!AbstractC80233iC.A01(c37905Gm22, d2, d10, d5, d11)) {
                                if (AbstractC80233iC.A01(c37905Gm22, d8, d10, d9, d11)) {
                                    i2 = 3;
                                } else {
                                    c75113Zb.A0k(false);
                                    return arrayList;
                                }
                            }
                        }
                    }
                    InterfaceC87713vf interfaceC87713vf = (InterfaceC87713vf) list.get(i2);
                    C14360o3.A0B(interfaceC87713vf, 1);
                    ?? obj3 = new Object();
                    obj3.A00 = interfaceC87713vf;
                    adTag = new AdTag(new PointF(c37905Gm22.A04 / i, c37905Gm22.A05 / i3), obj3, Integer.valueOf(i2));
                    arrayList.add(adTag);
                }
            } else {
                InterfaceC87713vf A1H = c38321qM.A1H();
                if (A1H != null) {
                    if (c37905Gm22 == null) {
                        pointF = new PointF(0.5f, 0.5f);
                    } else {
                        pointF = new PointF(c37905Gm22.A04 / c37905Gm22.A06, c37905Gm22.A05 / c37905Gm22.A07);
                    }
                    ?? obj4 = new Object();
                    obj4.A00 = A1H;
                    adTag = new AdTag(pointF, obj4, null);
                    arrayList.add(adTag);
                }
            }
        }
        return arrayList;
    }

    public static final boolean A05(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C38321qM c38321qM2, C3YE c3ye) {
        boolean A02;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c38321qM2, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        if (c3ye != null) {
            AbstractC79433gq.A00(userSession);
            A02 = C79453gs.A00(interfaceC11380iw, c38321qM, c3ye);
        } else {
            A02 = AbstractC79433gq.A00(userSession).A02(interfaceC11380iw, c38321qM, c38321qM2);
        }
        if (A02 && !c38321qM.A5n()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (new X.C115655Lb(r4).A01(r5) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5.A0w() > 0) goto L16;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A08(com.instagram.common.session.UserSession r4, X.C38321qM r5, X.C3YE r6) {
        /*
            r2 = 0
            r1 = 1
            int r0 = r6.ordinal()
            switch(r0) {
                case 1: goto L35;
                case 2: goto L35;
                case 3: goto L36;
                case 7: goto La;
                case 14: goto L2c;
                case 15: goto L35;
                default: goto L9;
            }
        L9:
            return r2
        La:
            com.instagram.user.model.UpcomingEvent r3 = r5.A2B(r4)
            if (r3 == 0) goto L33
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = X.AbstractC41774Ieq.A0D(r3, r0)
            if (r0 != 0) goto L33
            boolean r0 = X.C76253bV.A08(r5)
            if (r0 == 0) goto L33
            X.5Lb r0 = new X.5Lb
            r0.<init>(r4)
            boolean r0 = r0.A01(r5)
            if (r0 != 0) goto L33
            goto L32
        L2c:
            int r0 = r5.A0w()
            if (r0 <= 0) goto L33
        L32:
            r2 = 1
        L33:
            r1 = r2 ^ 1
        L35:
            return r1
        L36:
            boolean r1 = X.C76473br.A00(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC76193bO.A08(com.instagram.common.session.UserSession, X.1qM, X.3YE):boolean");
    }

    public static final C3YE A02(UserSession userSession, C38321qM c38321qM, C38321qM c38321qM2) {
        String str;
        String str2;
        if (c38321qM.A6h(userSession) && C18U.A06(C06090Tz.A05, userSession, 36328989463297967L)) {
            return C3YE.A08;
        }
        if (AbstractC76233bT.A00(userSession, c38321qM)) {
            return C3YE.A0H;
        }
        if (c38321qM.A1g(userSession).A6B()) {
            return C3YE.A0F;
        }
        if (c38321qM2.A4o()) {
            InterfaceC109094vY BRN = c38321qM2.BRN();
            if (BRN != null) {
                str2 = BRN.getOverlayType();
            } else {
                str2 = null;
            }
            if (!(!C14360o3.A0K(str2, "MISINFORMATION"))) {
                return C3YE.A06;
            }
        }
        if (!AbstractC76273bX.A02(c38321qM) && (c38321qM.A5P() || c38321qM.A5R())) {
            return C3YE.A03;
        }
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            str = A2E.getId();
        } else {
            str = null;
        }
        if (AbstractC76283bY.A02(c38321qM)) {
            return C3YE.A0E;
        }
        ArrayList A3Q = c38321qM.A3Q();
        if (A3Q != null && !A3Q.isEmpty() && OWJ.A00.A01(userSession, str, c38321qM.A5P())) {
            return C3YE.A05;
        }
        if (!c38321qM.A51() && c38321qM.A2C() == null) {
            return C3YE.A09;
        }
        return C3YE.A0C;
    }

    public static final boolean A06(UserSession userSession, C38321qM c38321qM) {
        if ((c38321qM.BRp() == EnumC40111tc.A0Q || c38321qM.BRp() == EnumC40111tc.A0U || c38321qM.BRp() == EnumC40111tc.A0a) && A07(userSession, c38321qM)) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, C38321qM c38321qM) {
        String str;
        boolean A53;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            str = A2E.getId();
        } else {
            str = null;
        }
        if (!c38321qM.A51()) {
            if (c38321qM.A1g(userSession).CdW()) {
                A53 = C5L4.A03(c38321qM);
            } else {
                A53 = c38321qM.A53();
            }
            if (!A53 && !AbstractC80233iC.A00(userSession, c38321qM)) {
                ArrayList A3Q = c38321qM.A3Q();
                if (A3Q == null || A3Q.isEmpty() || !OWJ.A00.A01(userSession, str, c38321qM.A5P())) {
                    if (c38321qM.A6Q() && C18U.A06(C06090Tz.A06, userSession, 36325897087038967L)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
