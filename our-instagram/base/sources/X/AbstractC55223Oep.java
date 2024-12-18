package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Oep, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55223Oep {
    public static final int A00(InterfaceC105354oy interfaceC105354oy) {
        String BDM;
        int i = 0;
        List BHb = interfaceC105354oy.BHb();
        if (BHb != null && BHb.size() >= 1) {
            List BHb2 = interfaceC105354oy.BHb();
            C14360o3.A0C(BHb2, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum>");
            Iterator it = BHb2.iterator();
            while (it.hasNext()) {
                int A05 = AbstractC25227BEk.A05((IGAdsGenericCardInfoTypeEnum) it.next(), 1);
                if (A05 != 2) {
                    if (A05 != 3) {
                        if (A05 != 4) {
                            if (A05 == 10) {
                                BDM = interfaceC105354oy.Bur();
                            }
                        } else if (interfaceC105354oy.BYE() != null) {
                            i++;
                        }
                    } else {
                        BDM = interfaceC105354oy.BKK();
                    }
                } else {
                    BDM = interfaceC105354oy.BDM();
                }
                if (BDM != null && BDM.length() != 0) {
                    i++;
                }
            }
        }
        return i;
    }

    public static final C84823qW A01(Context context, View view, TextView textView, UserSession userSession, C41181vS c41181vS, InterfaceC105354oy interfaceC105354oy, C141596ac c141596ac, InterfaceC145436h2 interfaceC145436h2) {
        String str;
        CharSequence A05 = AbstractC84863qa.A05(context, userSession, c41181vS, false, null, null);
        if (A05.length() == 0) {
            throw AbstractC166987dD.A12("Unsupported empty CTA text on AdsGenericCardInfo");
        }
        Locale A02 = C1Q2.A02();
        String A0R = AnonymousClass001.A0R(AbstractC166997dE.A10(A02, String.valueOf(A05.charAt(0))), AbstractC43592JPx.A0z(AbstractC31172DnG.A16(A02, A05.toString()), 1));
        IGAdsCardStickerCTATypeEnum Atq = interfaceC105354oy.Atq();
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = IGAdsCardStickerCTATypeEnum.A06;
        if (Atq != iGAdsCardStickerCTATypeEnum && Atq != IGAdsCardStickerCTATypeEnum.A07) {
            Atq = iGAdsCardStickerCTATypeEnum;
        }
        textView.setText(A0R);
        if (Atq == IGAdsCardStickerCTATypeEnum.A07) {
            AbstractC166987dD.A1O(context, textView, R.color.igds_icon_on_color);
            AbstractC31173DnH.A0z(context, textView, R.drawable.reel_generic_lead_gen_card_rounded_bottom_corner_background);
        }
        A05(context, textView, userSession, c41181vS, interfaceC145436h2);
        String str2 = A0R.toString();
        if (AbstractC166997dE.A1Z(interfaceC105354oy.Bvm(), true)) {
            str = interfaceC105354oy.CHS();
        } else {
            str = null;
        }
        return A02(context, view, userSession, c41181vS, c141596ac, interfaceC145436h2, AbstractC111324zv.A00(5401), str2, str);
    }

    public static final C84823qW A02(Context context, View view, UserSession userSession, C41181vS c41181vS, C141596ac c141596ac, InterfaceC145436h2 interfaceC145436h2, String str, String str2, String str3) {
        int i;
        C14360o3.A0B(str2, 3);
        int A0A = AbstractC13880nE.A0A(context);
        int A02 = C143726eF.A02(context);
        if (C143726eF.A0B(context)) {
            i = C143726eF.A03(context);
        } else {
            i = 0;
        }
        NSL nsl = new NSL(context);
        C84823qW c84823qW = new C84823qW();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC55501Oku(view, userSession, c41181vS, c84823qW, c141596ac, interfaceC145436h2, nsl, str2, str, str3, A0A, A02, i));
        }
        return c84823qW;
    }

    public static final CharSequence A03(Context context, IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum, InterfaceC105354oy interfaceC105354oy) {
        CharSequence charSequence = "";
        if (iGAdsGenericCardInfoTypeEnum == null) {
            return "";
        }
        int ordinal = iGAdsGenericCardInfoTypeEnum.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 10) {
                        return "";
                    }
                    String Bur = interfaceC105354oy.Bur();
                    CharSequence charSequence2 = charSequence;
                    if (Bur != null) {
                        charSequence2 = charSequence;
                        if (Bur.length() != 0) {
                            CharSequence append = AbstractC37300Gc1.A01().append((CharSequence) interfaceC105354oy.Bur());
                            C14360o3.A0A(append);
                            charSequence2 = append;
                        }
                    }
                    return charSequence2;
                }
                CharSequence charSequence3 = charSequence;
                if (interfaceC105354oy.BYE() != null) {
                    SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
                    A01.append((CharSequence) AbstractC43744JWe.A01(context.getResources(), interfaceC105354oy.BYE(), true));
                    A01.append((CharSequence) " ");
                    A01.append((CharSequence) context.getString(2131971640));
                    charSequence3 = A01;
                }
                return charSequence3;
            }
            String BKK = interfaceC105354oy.BKK();
            CharSequence charSequence4 = charSequence;
            if (BKK != null) {
                charSequence4 = charSequence;
                if (BKK.length() != 0) {
                    SpannableStringBuilder A012 = AbstractC37300Gc1.A01();
                    A012.append((CharSequence) context.getString(2131971639));
                    A012.append((CharSequence) " ");
                    A012.append((CharSequence) interfaceC105354oy.BKK());
                    charSequence4 = A012;
                }
            }
            return charSequence4;
        }
        String BDM = interfaceC105354oy.BDM();
        CharSequence charSequence5 = charSequence;
        if (BDM != null) {
            charSequence5 = charSequence;
            if (BDM.length() != 0) {
                CharSequence append2 = AbstractC37300Gc1.A01().append((CharSequence) interfaceC105354oy.BDM());
                C14360o3.A0A(append2);
                charSequence5 = append2;
            }
        }
        return charSequence5;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.O4M, X.NSK] */
    public static final void A05(Context context, View view, UserSession userSession, C41181vS c41181vS, InterfaceC145436h2 interfaceC145436h2) {
        C71313Hs.A00(userSession).A05(view, EnumC71343Hv.A0H);
        AbstractC77703du.A05(view, EnumC77673dr.A04);
        NSL nsl = new NSL(context);
        ?? o4m = new O4M(0.35d);
        int width = view.getWidth();
        o4m.A01 = width;
        double d = width;
        double d2 = o4m.A00;
        o4m.A00 = d * d2;
        if (d2 != 0.0d && d2 != 0.5d) {
            WeakReference A16 = AbstractC25225BEi.A16(new C57754Pjh(o4m, 10));
            if (C18U.A06(C06090Tz.A05, userSession, 36316199051399273L)) {
                ViewOnLayoutChangeListenerC55476OkV.A00(view, 6, A16);
            } else {
                ViewTreeObserverOnGlobalLayoutListenerC55502Okv.A00(view.getViewTreeObserver(), A16, AbstractC25225BEi.A16(view), 9);
            }
        }
        view.setOnTouchListener(new N29(userSession, interfaceC145436h2, new P9E(c41181vS, interfaceC145436h2), AbstractC16960so.A1Q(nsl, o4m), true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r2 != 1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(android.content.Context r4, X.InterfaceC105354oy r5, X.C6UB r6) {
        /*
            r3 = 1
            r1 = 2
            int r0 = A00(r5)
            if (r0 == 0) goto L9e
            if (r0 == r3) goto L70
            if (r0 <= r1) goto L23
            java.lang.String r2 = "Received more than 2 valid signals: "
            java.util.List r1 = r5.BHb()
            if (r1 == 0) goto L6e
            java.lang.String r0 = ","
            java.lang.String r0 = X.AbstractC31175DnJ.A0a(r0, r1)
        L1a:
            java.lang.String r1 = X.AnonymousClass001.A0R(r2, r0)
            java.lang.String r0 = "GenericCardViewBinder"
            X.C0w9.A03(r0, r1)
        L23:
            java.util.List r1 = r5.BHb()
            if (r1 == 0) goto L6c
            com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum r0 = com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum.A07
            int r2 = r1.indexOf(r0)
            r1 = 0
            if (r2 == r3) goto L33
        L32:
            r1 = 1
        L33:
            java.util.List r0 = r5.BHb()
            if (r0 == 0) goto L69
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L69
            java.util.List r0 = r5.BHb()
            if (r0 == 0) goto L67
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r1)
            com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum r0 = (com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum) r0
        L4b:
            java.lang.CharSequence r1 = A03(r4, r0, r5)
        L4f:
            java.lang.CharSequence r2 = A04(r4, r5, r2)
            int r0 = r1.length()
            if (r0 <= 0) goto L66
            int r0 = r2.length()
            if (r0 <= 0) goto L66
        L5f:
            java.lang.Boolean r0 = r5.Bve()
            r6.Eld(r0, r1, r2)
        L66:
            return
        L67:
            r0 = 0
            goto L4b
        L69:
            java.lang.String r1 = ""
            goto L4f
        L6c:
            r2 = 0
            goto L32
        L6e:
            r0 = 0
            goto L1a
        L70:
            r1 = 0
            java.util.List r0 = r5.BHb()
            if (r0 == 0) goto L9b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9b
            java.util.List r0 = r5.BHb()
            if (r0 == 0) goto L99
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r1)
            com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum r0 = (com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum) r0
        L89:
            java.lang.CharSequence r1 = A03(r4, r0, r5)
        L8d:
            int r0 = r1.length()
            if (r0 != 0) goto L97
            java.lang.CharSequence r1 = A04(r4, r5, r3)
        L97:
            r2 = 0
            goto L5f
        L99:
            r0 = 0
            goto L89
        L9b:
            java.lang.String r1 = ""
            goto L8d
        L9e:
            r6.CMx()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55223Oep.A06(android.content.Context, X.4oy, X.6UB):void");
    }

    public static final void A07(View view, View view2, C41181vS c41181vS) {
        GradientDrawable.Orientation orientation;
        GradientDrawable gradientDrawable;
        C38321qM c38321qM = c41181vS.A0b;
        c38321qM.getClass();
        String A31 = c38321qM.A31();
        String A30 = c38321qM.A30();
        if (A31 != null && A31.length() != 0 && A30 != null && A30.length() != 0) {
            RectF rectF = AbstractC13880nE.A01;
            int parseColor = Color.parseColor(A31);
            int parseColor2 = Color.parseColor(A30);
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            gradientDrawable = new GradientDrawable(orientation, new int[]{parseColor, parseColor2});
        } else {
            Context A0L = AbstractC166997dE.A0L(view);
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            gradientDrawable = new GradientDrawable(orientation, new int[]{AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_grey_09), AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_grey_03)});
            RectF rectF2 = AbstractC13880nE.A01;
        }
        view.setBackground(gradientDrawable);
        Context A0L2 = AbstractC166997dE.A0L(view2);
        view2.setBackground(new GradientDrawable(orientation, new int[]{AbstractC167007dF.A09(A0L2, R.attr.igds_color_drawer_shadow), AbstractC167007dF.A09(A0L2, R.attr.igds_color_legibility_gradient)}));
    }

    public static final void A0B(TextView textView, UserSession userSession, C41181vS c41181vS) {
        User A2E;
        C38321qM c38321qM = c41181vS.A0b;
        c38321qM.getClass();
        String str = "";
        if (c38321qM.CdW() && (A2E = c38321qM.A2E(userSession)) != null) {
            str = A2E.getFullName();
            if ((A2E.A2N() || str == null || str.length() <= 0) && ((str = AbstractC41071vF.A08(userSession, c38321qM)) == null || (!AbstractC41071vF.A0V(userSession, c38321qM) && (!A2E.A2N() || str.length() <= 0)))) {
                str = A2E.getUsername();
            }
        }
        textView.setText(str);
        AbstractC77703du.A05(textView, EnumC77673dr.A07);
    }

    public static final CharSequence A04(Context context, InterfaceC105354oy interfaceC105354oy, int i) {
        List BHb;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum;
        List BHb2 = interfaceC105354oy.BHb();
        if (BHb2 != null && !BHb2.isEmpty() && (BHb = interfaceC105354oy.BHb()) != null && BHb.size() == 2 && A00(interfaceC105354oy) >= 1) {
            List BHb3 = interfaceC105354oy.BHb();
            if (BHb3 != null) {
                iGAdsGenericCardInfoTypeEnum = (IGAdsGenericCardInfoTypeEnum) AbstractC001800i.A0O(BHb3, i);
            } else {
                iGAdsGenericCardInfoTypeEnum = null;
            }
            return A03(context, iGAdsGenericCardInfoTypeEnum, interfaceC105354oy);
        }
        return "";
    }

    public static final void A08(View view, View view2, C41181vS c41181vS, InterfaceC105354oy interfaceC105354oy) {
        if (interfaceC105354oy.Af5() == IGAdsCardBackgroundTypeEnum.A05 && C1AD.A06(C06090Tz.A05, 18310824267363224L)) {
            AbstractC31172DnG.A1B(view.getContext(), view2, R.color.clips_overlay_ads_end_background_color);
        } else {
            A07(view, view2, c41181vS);
        }
    }

    public static final void A09(View view, C84823qW c84823qW, InterfaceC145436h2 interfaceC145436h2) {
        view.setOnTouchListener(new ViewOnTouchListenerC55487Okg(1, new GestureDetector(view.getContext(), new C9TH(2, interfaceC145436h2, c84823qW)), interfaceC145436h2));
    }

    public static final void A0A(TextView textView, InterfaceC11380iw interfaceC11380iw, IgImageView igImageView, C41181vS c41181vS) {
        User A0L = c41181vS.A0L();
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && c38321qM.A5t() && A0L != null && A0L.B8y().length() != 0) {
            A0L.Bhu();
            User A0L2 = c41181vS.A0L();
            if (A0L2 != null) {
                ImageUrl Bhu = A0L2.Bhu();
                String B8y = A0L2.B8y();
                igImageView.setUrl(Bhu, interfaceC11380iw);
                textView.setText(B8y);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
