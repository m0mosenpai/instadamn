package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PIy implements InterfaceC58131Ppu {
    public static final C42286IoA A0O = new C42286IoA("KEY_VIEWER_LIST_DIVIDER");
    public int A00;
    public EnumC53221NgJ A01;
    public C51623MrG A02;
    public Integer A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final QIz A09;
    public final UserSession A0A;
    public final C3PO A0B;
    public final C52834NZr A0C;
    public final Boolean A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final C66362zD A0N;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.2zJ, java.lang.Object] */
    public PIy(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3PO c3po, C52834NZr c52834NZr, Boolean bool, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        QIz qIz;
        C14360o3.A0B(userSession, 2);
        this.A08 = context;
        this.A0A = userSession;
        this.A05 = z;
        this.A0H = z2;
        this.A0L = z3;
        this.A0J = z4;
        this.A0I = z5;
        this.A0M = z6;
        this.A0K = z7;
        this.A0G = z8;
        this.A0B = c3po;
        this.A0C = c52834NZr;
        this.A0E = str;
        this.A0D = bool;
        this.A04 = C16930sl.A00;
        this.A0F = AbstractC166987dD.A1E();
        C46h c46h = (C46h) ((O95) OYB.A02(userSession).A01.getValue()).A00.A0W();
        if (c46h != null) {
            qIz = (QIz) c46h.A04();
        } else {
            qIz = null;
        }
        this.A09 = qIz;
        OYB.A02(userSession).A01.getValue();
        C66392zG A00 = C52351NEp.A00(context, interfaceC11380iw, userSession);
        A00.A01(new C27058Bwh(context, interfaceC11380iw));
        A00.A01(new C52336NEa(context, interfaceC11380iw));
        A00.A01(new Object());
        A00.A01(new Object());
        A00.A01(new C52342NEg(context, interfaceC11380iw, null));
        A00.A01(new C52338NEc(context, null));
        A00.A02 = new C5GX() { // from class: X.Oun
            @Override // X.C5GX
            public final void DZi(int i, int i2) {
                String str2;
                String str3;
                C52834NZr c52834NZr2;
                String str4;
                C105824pt c105824pt;
                java.util.Set A06;
                PIy pIy = PIy.this;
                InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) AbstractC001800i.A0O(pIy.A0F, i);
                if (interfaceC66482zP != null) {
                    if (interfaceC66482zP instanceof C56117Ovc) {
                        str2 = ((C56117Ovc) interfaceC66482zP).A06;
                    } else if (interfaceC66482zP instanceof C56116Ovb) {
                        str2 = ((C56116Ovb) interfaceC66482zP).A08;
                    } else {
                        return;
                    }
                    if (str2 != null && str2.equals(pIy.A08.getString(2131965439)) && (str3 = pIy.A0E) != null && (str4 = (c52834NZr2 = pIy.A0C).A07) != null) {
                        InterfaceC09390do interfaceC09390do = c52834NZr2.A0D;
                        Reel A0G = AbstractC50523MSb.A0G(str3, interfaceC09390do);
                        java.util.Set set = null;
                        if (A0G != null) {
                            c105824pt = A0G.A0H;
                        } else {
                            c105824pt = null;
                        }
                        C18920wW A01 = AbstractC12220kQ.A01(c52834NZr2, AbstractC25230BEn.A0k(interfaceC09390do, 1));
                        String A0t = AbstractC31173DnH.A0t(interfaceC09390do);
                        if (c105824pt != null && (A06 = c105824pt.A06()) != null) {
                            ArrayList A0q = AbstractC167017dG.A0q(A06);
                            Iterator it = A06.iterator();
                            while (it.hasNext()) {
                                AbstractC167017dG.A1V(A0q, it);
                            }
                            set = AbstractC001800i.A0k(A0q);
                        }
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_live_moderator_review");
                        if (A0t == null) {
                            A0t = "0";
                        }
                        MSY.A16(A0f, A0t);
                        AbstractC31171DnF.A1A(A0f, "cell_impression");
                        MSY.A12(A0f, AbstractC167027dH.A03(str3));
                        AbstractC37300Gc1.A0l(A0f, str4);
                        AbstractC37301Gc2.A15(A0f, c52834NZr2);
                        MSX.A1D(A0f);
                        MSY.A17(A0f, MSY.A0l(set));
                    }
                }
            }
        };
        A00.A08 = true;
        this.A0N = A00.A00();
        A04(this);
    }

    private final InterfaceC66482zP A00(Typeface typeface, Drawable drawable, Drawable drawable2, SpannableStringBuilder spannableStringBuilder, View.OnClickListener onClickListener, String str, boolean z, boolean z2) {
        InterfaceC66482zP c56117Ovc;
        Integer num;
        EnumC53237Nga enumC53237Nga;
        if (this.A07) {
            if (z) {
                num = Integer.valueOf(this.A08.getResources().getColor(R.color.igds_error_or_destructive));
            } else {
                num = null;
            }
            if (z2) {
                enumC53237Nga = EnumC53237Nga.A04;
            } else {
                enumC53237Nga = EnumC53237Nga.A09;
            }
            c56117Ovc = new C56116Ovb(drawable, spannableStringBuilder, onClickListener, null, enumC53237Nga, num, null, str, null);
        } else {
            c56117Ovc = new C56117Ovc(typeface, drawable, drawable2, spannableStringBuilder, onClickListener, str, null, false, z, true);
        }
        return c56117Ovc;
    }

    private final InterfaceC66482zP A01(Drawable drawable, View.OnClickListener onClickListener, String str) {
        return A00(null, drawable, null, null, onClickListener, str, false, false);
    }

    @Override // X.InterfaceC58131Ppu
    public final int ApS(int i, int i2) {
        return 0;
    }

    @Override // X.InterfaceC58131Ppu
    public final int Bz3(int i, int i2) {
        return 2;
    }

    public static void A03(Drawable drawable, PIy pIy, String str, List list, int i) {
        list.add(pIy.A01(drawable, new Ok4(pIy, i), str));
    }

    public static final void A04(PIy pIy) {
        String str;
        String str2;
        String str3;
        ImageUrl imageUrl;
        String quantityString;
        String str4;
        String str5;
        C66362zD c66362zD = pIy.A0N;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        List list = pIy.A0F;
        list.clear();
        if (pIy.A0I) {
            list.add(new LZW(AbstractC166997dE.A0p(pIy.A08, 2131954185), null));
        }
        QIz qIz = pIy.A09;
        UserSession userSession = pIy.A0A;
        if (pIy.A0J) {
            SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
            Context context = pIy.A08;
            A01.append((CharSequence) context.getString(2131969806));
            AbstractC31174DnI.A1B(A01, AbstractC166997dE.A0p(context, 2131965052));
            list.add(pIy.A00(Typeface.DEFAULT, AbstractC13630mp.A00(context, R.drawable.instagram_warning_pano_outline_24), null, A01, new Ok4(pIy, 21), null, true, false));
        }
        C51623MrG c51623MrG = pIy.A02;
        if (c51623MrG != null && (str4 = c51623MrG.A02) != null && (str5 = c51623MrG.A03) != null) {
            User user = c51623MrG.A00;
            if (!C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36312402299520102L)) {
                list.add(pIy.A02(user, c51623MrG.A01, str4, str5));
            }
        }
        boolean z = pIy.A0G;
        if (z) {
            Context context2 = pIy.A08;
            String A0p = AbstractC166997dE.A0p(context2, 2131969810);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(context2, A0p, 2131969809));
            AbstractC31174DnI.A1B(A0H, A0p);
            list.add(pIy.A00(null, AbstractC13630mp.A00(context2, R.drawable.instagram_creator_experience_assets_badges_onboarding_qp_illustration_android), null, A0H, new Ok4(pIy, 25), null, false, false));
        }
        User user2 = (User) AbstractC001800i.A0O(pIy.A04, 0);
        if (user2 != null) {
            User user3 = (User) AbstractC001800i.A0O(pIy.A04, 1);
            String username = user2.getUsername();
            ImageUrl Bhu = user2.Bhu();
            if (user3 != null) {
                str3 = user3.getUsername();
                imageUrl = user3.Bhu();
            } else {
                str3 = "";
                imageUrl = null;
            }
            SpannableStringBuilder A012 = AbstractC37300Gc1.A01();
            if (pIy.A00 == 2 && imageUrl != null) {
                quantityString = AbstractC31174DnI.A0t(pIy.A08, username, str3, 2131969826);
            } else {
                Resources resources = pIy.A08.getResources();
                int i = pIy.A00;
                quantityString = resources.getQuantityString(R.plurals.post_live_viewer_count, i, username, str3, Integer.valueOf(i - 2));
            }
            A012.append((CharSequence) quantityString);
            AbstractC31174DnI.A1B(A012, username);
            if (!TextUtils.isEmpty(str3)) {
                AbstractC31174DnI.A1B(A012, str3);
            }
            list.add(new OvU(A012, Bhu, imageUrl, pIy.A03));
        }
        if (pIy.A05) {
            Context context3 = pIy.A08;
            A03(AbstractC13630mp.A00(context3, R.drawable.instagram_shield_pano_outline_24), pIy, context3.getString(2131965439), list, 24);
        }
        C51623MrG c51623MrG2 = pIy.A02;
        if (c51623MrG2 != null && (str = c51623MrG2.A02) != null && (str2 = c51623MrG2.A03) != null) {
            User user4 = c51623MrG2.A00;
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36312402299520102L)) {
                list.add(pIy.A02(user4, c51623MrG2.A01, str, str2));
                Integer A0i = AbstractC003100w.A0i(str2);
                if (A0i != null && A0i.intValue() != 0 && !pIy.A06) {
                    Context context4 = pIy.A08;
                    A03(AbstractC13630mp.A00(context4, R.drawable.instagram_new_story_pano_outline_24), pIy, context4.getString(2131969807), list, 20);
                }
            }
        }
        if (qIz != null || pIy.A02 != null || AbstractC166987dD.A1b(pIy.A04) || z) {
            list.add(A0O);
        }
        if (!pIy.A0L && !pIy.A0K) {
            if (pIy.A0B != C3PO.A07 && C18U.A06(C06090Tz.A05, userSession, 36311637795275453L)) {
                Context context5 = pIy.A08;
                list.add(pIy.A00(null, AbstractC13630mp.A00(context5, R.drawable.instagram_insights_pano_outline_24), AbstractC13630mp.A00(context5, R.drawable.instagram_chevron_right_pano_outline_16), null, new Ok4(pIy, 28), context5.getString(2131969825), false, true));
            }
            if (pIy.A01 == EnumC53221NgJ.A04) {
                Context context6 = pIy.A08;
                A03(AbstractC13630mp.A00(context6, R.drawable.instagram_history_pano_outline_24), pIy, context6.getString(2131965309), list, 27);
            }
        }
        Context context7 = pIy.A08;
        A03(AbstractC13630mp.A00(context7, R.drawable.instagram_delete_pano_outline_24), pIy, context7.getString(2131965306), list, 22);
        if (pIy.A0M) {
            A03(AbstractC13630mp.A00(context7, R.drawable.instagram_heart_pano_outline_24), pIy, context7.getString(2131969814), list, 26);
        }
        if (pIy.A0H) {
            list.add(A0O);
            list.add(new LZW(AbstractC166997dE.A0p(context7, 2131969823), pIy.A03));
        }
        if (pIy.A0B == C3PO.A07 && AbstractC166997dE.A1Z(pIy.A0D, false)) {
            A03(AbstractC13630mp.A00(context7, R.drawable.instagram_live_pano_outline_24), pIy, context7.getString(2131969815), list, 23);
        }
        A0E.A01(list);
        c66362zD.A05(A0E);
    }

    @Override // X.InterfaceC58131Ppu
    public final C66362zD BlI() {
        return this.A0N;
    }

    private final C56114OvZ A02(User user, Integer num, String str, String str2) {
        String string;
        int intValue;
        String id = user.getId();
        ImageUrl Bhu = user.Bhu();
        Context context = this.A08;
        Integer A0i = AbstractC003100w.A0i(str2);
        if (A0i != null && (intValue = A0i.intValue()) != 0) {
            string = context.getResources().getQuantityString(R.plurals.post_live_broadcaster_user_pay_summary_info, intValue, AbstractC25228BEl.A1Z(str, intValue));
        } else {
            string = context.getString(2131969812);
        }
        C14360o3.A0A(string);
        return new C56114OvZ(null, Bhu, new OCS(this, num, str, str2), this.A03, id, string, context.getResources().getString(2131969811));
    }
}
