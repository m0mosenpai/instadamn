package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igtv.model.IGTVViewerLoggingToken;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.PIz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56807PIz implements InterfaceC58131Ppu, JPc, JGB {
    public C56074Our A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final Context A04;
    public final LiveUserPaySupportTier A05;
    public final UserSession A06;
    public final User A07;
    public final OE7 A08;
    public final C52340NEe A09;
    public final C52835NZs A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final InterfaceC16820sZ A0E;
    public final boolean A0F;
    public final C66362zD A0G;
    public final InterfaceC60442pS A0H;
    public final O61 A0I;
    public final boolean A0J;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.2zJ, java.lang.Object] */
    public C56807PIz(Context context, LiveUserPaySupportTier liveUserPaySupportTier, UserSession userSession, InterfaceC60442pS interfaceC60442pS, User user, C52835NZs c52835NZs, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 2);
        this.A04 = context;
        this.A06 = userSession;
        this.A07 = user;
        this.A05 = liveUserPaySupportTier;
        this.A03 = i;
        this.A0A = c52835NZs;
        this.A0H = interfaceC60442pS;
        this.A0F = z;
        this.A0J = z2;
        this.A0E = interfaceC16820sZ;
        OE7 oe7 = new OE7(context, userSession, C57755Pji.A02(this, 0));
        this.A08 = oe7;
        this.A0C = AbstractC166987dD.A1E();
        this.A0B = AbstractC166987dD.A1E();
        O61 o61 = new O61(this);
        this.A0I = o61;
        this.A0D = AbstractC166987dD.A1E();
        C52340NEe c52340NEe = new C52340NEe(interfaceC60442pS, new O62(this));
        this.A09 = c52340NEe;
        C66392zG A00 = C52351NEp.A00(context, interfaceC60442pS, userSession);
        A00.A01(new C52336NEa(context, interfaceC60442pS));
        A00.A01(new Object());
        A00.A01(new C52338NEc(context, new O60(this)));
        A00.A01(new C52342NEg(context, interfaceC60442pS, o61));
        A00.A01(new C52344NEi(userSession, interfaceC60442pS, this, EnumC39626Hek.A0Q, this));
        A00.A01(c52340NEe);
        A00.A01(new Object());
        A00.A02 = new C5GX() { // from class: X.Oum
            @Override // X.C5GX
            public final void DZi(int i2, int i3) {
                C38321qM c38321qM;
                InterfaceC02590Ai A0f;
                Long A0k;
                FollowStatus followStatus;
                String str;
                C56807PIz c56807PIz = C56807PIz.this;
                InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) AbstractC001800i.A0O(c56807PIz.A0D, i2);
                if (interfaceC66482zP != null) {
                    if (interfaceC66482zP instanceof C51820MvO) {
                        C52835NZs c52835NZs2 = c56807PIz.A0A;
                        C51820MvO c51820MvO = (C51820MvO) interfaceC66482zP;
                        C105824pt c105824pt = c51820MvO.A04;
                        List list = c56807PIz.A0C;
                        int i4 = c51820MvO.A00;
                        AbstractC167017dG.A1N(c105824pt, list);
                        C105824pt c105824pt2 = c52835NZs2.A00;
                        if (c105824pt2 != null) {
                            O94 o94 = (O94) AbstractC147736ky.A00(c52835NZs2, AbstractC166987dD.A0r(c52835NZs2.A08)).A03.getValue();
                            int size = list.size();
                            String str2 = c52835NZs2.A04;
                            if (str2 != null) {
                                String str3 = c52835NZs2.A02;
                                if (str3 != null) {
                                    UserSession userSession2 = o94.A01;
                                    InterfaceC11380iw interfaceC11380iw = o94.A00;
                                    A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession2), "ig_live_suggested_live_impression");
                                    A0f.A9K("a_pk", AbstractC25228BEl.A13(MSX.A0g(c105824pt)));
                                    String str4 = c105824pt.A0X;
                                    str4.getClass();
                                    A0f.A9K("b_pk", AbstractC25228BEl.A13(str4));
                                    String str5 = c105824pt.A0e;
                                    str5.getClass();
                                    AbstractC37300Gc1.A0l(A0f, str5);
                                    AbstractC50522MSa.A1A(A0f, c105824pt2, MSX.A0g(c105824pt2));
                                    A0f.A9K("suggested_live_position", AbstractC31171DnF.A0V(i4));
                                    C57582kX A002 = C57582kX.A00(userSession2);
                                    User user2 = c105824pt.A09;
                                    user2.getClass();
                                    AbstractC50523MSb.A0w(A0f, A002.A0N(user2), size);
                                    AbstractC37301Gc2.A15(A0f, interfaceC11380iw);
                                    A0f.AAP(AbstractC31186DnV.A01(21, 10, 99), str2);
                                    AbstractC25225BEi.A1P(A0f, str2);
                                    AbstractC31171DnF.A1G(A0f, str3);
                                    A0f.Cht();
                                    return;
                                }
                                str = "entryPoint";
                            }
                            str = "viewerSessionId";
                        } else {
                            return;
                        }
                    } else {
                        if (!(interfaceC66482zP instanceof C56105OvP)) {
                            return;
                        }
                        C52835NZs c52835NZs3 = c56807PIz.A0A;
                        C56105OvP c56105OvP = (C56105OvP) interfaceC66482zP;
                        C38895HAr c38895HAr = c56105OvP.A02;
                        List list2 = c56807PIz.A0B;
                        int i5 = c56105OvP.A00;
                        C14360o3.A0B(list2, 1);
                        C105824pt c105824pt3 = c52835NZs3.A00;
                        if (c105824pt3 == null || (c38321qM = c38895HAr.A01) == null) {
                            return;
                        }
                        O94 o942 = (O94) AbstractC147736ky.A00(c52835NZs3, AbstractC166987dD.A0r(c52835NZs3.A08)).A03.getValue();
                        int size2 = list2.size();
                        String str6 = c52835NZs3.A04;
                        if (str6 != null) {
                            String str7 = c52835NZs3.A02;
                            if (str7 != null) {
                                UserSession userSession3 = o942.A01;
                                A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(o942.A00, userSession3), "ig_live_suggested_post_live_impression");
                                User A2E = c38321qM.A2E(userSession3);
                                if (A2E == null || (A0k = AbstractC25231BEo.A0k(A2E)) == null) {
                                    return;
                                }
                                A0f.A9K("parent_a_pk", AbstractC25228BEl.A13(MSX.A0g(c105824pt3)));
                                String str8 = c105824pt3.A0X;
                                str8.getClass();
                                A0f.A9K("parent_b_pk", AbstractC25228BEl.A13(str8));
                                String str9 = c105824pt3.A0e;
                                str9.getClass();
                                A0f.AAP("parent_m_pk", str9);
                                A0f.A9K("suggested_live_position", AbstractC31171DnF.A0V(i5));
                                User A2E2 = c38321qM.A2E(userSession3);
                                if (A2E2 != null) {
                                    followStatus = C57582kX.A00(userSession3).A0N(A2E2);
                                } else {
                                    followStatus = null;
                                }
                                AbstractC50523MSb.A0w(A0f, followStatus, size2);
                                A0f.A9K("a_pk", A0k);
                                String id = c38321qM.getId();
                                if (id != null) {
                                    AbstractC37300Gc1.A0l(A0f, id);
                                    AbstractC25225BEi.A1P(A0f, str6);
                                    AbstractC31171DnF.A1G(A0f, str7);
                                    A0f.Cht();
                                    return;
                                }
                                throw AbstractC166997dE.A0g();
                            }
                            str = "entryPoint";
                        }
                        str = "viewerSessionId";
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
        };
        A00.A08 = true;
        this.A0G = A00.A00();
        if (z) {
            C57541PgF A01 = C57541PgF.A01(this, 20);
            C28271Yo A002 = C2OJ.A00();
            Context context2 = oe7.A03;
            UserSession userSession2 = oe7.A04;
            if (AbstractC166997dE.A1Z(A002.A01(context2, userSession2, "live_broadcast"), false)) {
                oe7.A01 = true;
                oe7.A00 = "off";
                A01.invoke();
            } else {
                C32530EUg c32530EUg = new C32530EUg(8, A01, oe7);
                C1ON A003 = FXB.A00(userSession2, AbstractC111324zv.A00(3157));
                A003.A00 = c32530EUg;
                C1GJ.A03(A003);
            }
        }
        A00(this);
        if (A01()) {
            this.A0E.invoke();
        }
    }

    @Override // X.JPc
    public final boolean ABD() {
        return false;
    }

    @Override // X.InterfaceC58131Ppu
    public final int ApS(int i, int i2) {
        int i3;
        InterfaceC66482zP interfaceC66482zP;
        if (i < 0) {
            return 0;
        }
        int itemViewType = this.A0G.getItemViewType(i);
        if (itemViewType != 6) {
            if (itemViewType != 7 || (interfaceC66482zP = (InterfaceC66482zP) AbstractC001800i.A0O(this.A0D, i)) == null || !(interfaceC66482zP instanceof C56105OvP)) {
                return 0;
            }
            i3 = ((C56105OvP) interfaceC66482zP).A00;
        } else {
            InterfaceC66482zP interfaceC66482zP2 = (InterfaceC66482zP) AbstractC001800i.A0O(this.A0D, i);
            if (interfaceC66482zP2 == null || !(interfaceC66482zP2 instanceof C51820MvO)) {
                return 0;
            }
            i3 = ((C51820MvO) interfaceC66482zP2).A00;
        }
        return i3 % 2;
    }

    @Override // X.InterfaceC58131Ppu
    public final int Bz3(int i, int i2) {
        int itemViewType;
        return (i < 0 || !((itemViewType = this.A0G.getItemViewType(i)) == 6 || itemViewType == 7)) ? 2 : 1;
    }

    @Override // X.JGB
    public final void D2n(JPd jPd, IGTVViewerLoggingToken iGTVViewerLoggingToken, String str, boolean z) {
        Long A0k;
        FollowStatus followStatus;
        C14360o3.A0B(jPd, 0);
        C52835NZs c52835NZs = this.A0A;
        C38321qM BQN = jPd.BQN();
        List list = this.A0B;
        C14360o3.A0B(list, 1);
        C14360o3.A0A(C27971Xb.A00);
        InterfaceC09390do interfaceC09390do = c52835NZs.A08;
        UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do, 0);
        HashMap A1G = AbstractC166987dD.A1G();
        Resources resources = c52835NZs.requireActivity().getResources();
        C38900HAw c38900HAw = (C38900HAw) A1G.get("post_live");
        if (c38900HAw == null) {
            C38900HAw c38900HAw2 = new C38900HAw(EnumC39587Hdx.A0D, "post_live", resources.getString(2131964217));
            c38900HAw = c38900HAw2;
            C38900HAw c38900HAw3 = (C38900HAw) A1G.get(c38900HAw2.A03);
            String str2 = c38900HAw2.A03;
            if (c38900HAw3 != c38900HAw2) {
                if (A1G.containsKey(str2)) {
                    c38900HAw3.A02(A0K, c38900HAw2, true);
                } else {
                    A1G.put(str2, c38900HAw2);
                    AbstractC50102Ry.A00(c38900HAw2.A02, AbstractC166997dE.A0Y(A0K));
                }
            }
            c38900HAw2 = c38900HAw3;
            AbstractC50102Ry.A00(c38900HAw2.A02, AbstractC166997dE.A0Y(A0K));
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38321qM c38321qM = ((C38895HAr) it.next()).A01;
            if (c38321qM != null) {
                A1E.add(c38321qM);
            }
        }
        Iterator it2 = A1E.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            C38321qM A0i = AbstractC31172DnG.A0i(it2);
            if (C38900HAw.A00(A0i)) {
                Map map = c38900HAw.A0F;
                if (!map.containsKey(A0i.getId())) {
                    c38900HAw.A0A.add(A0i);
                    map.put(A0i.getId(), A0i);
                    z2 = true;
                }
            }
        }
        if (z2) {
            AbstractC25651Mw.A00(A0o).A05(new C55992OtP(c38900HAw));
        }
        String A0j = AbstractC167017dG.A0j();
        AbstractC41751IeQ.A03(c52835NZs, AbstractC166987dD.A0r(interfaceC09390do), A0j, AbstractC166987dD.A1F(c38900HAw.A0A));
        FragmentActivity requireActivity = c52835NZs.requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        ClipsViewerSource clipsViewerSource = ClipsViewerSource.A1z;
        String str3 = c52835NZs.A04;
        String str4 = "viewerSessionId";
        if (str3 != null) {
            AbstractC41751IeQ.A00(requireActivity, new C116875Qr(clipsViewerSource, AbstractC166987dD.A0r(interfaceC09390do)), A0r, BQN, c52835NZs, null, str3, A0j, null, 0, true, false, false, false);
            C105824pt c105824pt = c52835NZs.A00;
            if (c105824pt != null) {
                O94 o94 = (O94) AbstractC147736ky.A00(c52835NZs, AbstractC166987dD.A0r(interfaceC09390do)).A03.getValue();
                int size = list.size();
                String str5 = c52835NZs.A04;
                if (str5 != null) {
                    String str6 = c52835NZs.A02;
                    if (str6 == null) {
                        str4 = "entryPoint";
                    } else {
                        UserSession userSession = o94.A01;
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(o94.A00, userSession), "ig_live_suggested_post_live_click");
                        User A2E = BQN.A2E(userSession);
                        if (A2E != null && (A0k = AbstractC25231BEo.A0k(A2E)) != null) {
                            A0f.A9K("parent_a_pk", AbstractC25228BEl.A13(MSX.A0g(c105824pt)));
                            String str7 = c105824pt.A0X;
                            str7.getClass();
                            A0f.A9K("parent_b_pk", AbstractC25228BEl.A13(str7));
                            String str8 = c105824pt.A0e;
                            str8.getClass();
                            A0f.AAP("parent_m_pk", str8);
                            User A2E2 = BQN.A2E(userSession);
                            if (A2E2 != null) {
                                followStatus = C57582kX.A00(userSession).A0N(A2E2);
                            } else {
                                followStatus = null;
                            }
                            AbstractC50523MSb.A0w(A0f, followStatus, size);
                            A0f.A9K("a_pk", A0k);
                            String id = BQN.getId();
                            if (id != null) {
                                AbstractC37300Gc1.A0l(A0f, id);
                                AbstractC25225BEi.A1P(A0f, str5);
                                AbstractC31175DnJ.A17(A0f, str6);
                                return;
                            }
                            throw AbstractC166997dE.A0g();
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }

    @Override // X.JPc
    public final void D3p(Context context, DialogInterfaceOnDismissListenerC41846Ig0 dialogInterfaceOnDismissListenerC41846Ig0, JPd jPd, EnumC39625Hej enumC39625Hej) {
    }

    @Override // X.JGC
    public final void D4F(UserSession userSession, String str, String str2) {
    }

    @Override // X.JPc
    public final void D4O(Context context, UserSession userSession, C38321qM c38321qM, int i) {
    }

    public static final void A00(C56807PIz c56807PIz) {
        Object c56117Ovc;
        C66362zD c66362zD = c56807PIz.A0G;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        List list = c56807PIz.A0D;
        list.clear();
        if (c56807PIz.A01 && c56807PIz.A02) {
            if (c56807PIz.A05 != null) {
                User A01 = C17060sy.A01.A01(c56807PIz.A06);
                String id = A01.getId();
                ImageUrl Bhu = A01.Bhu();
                Context context = c56807PIz.A04;
                String username = c56807PIz.A07.getUsername();
                int i = c56807PIz.A03;
                String quantityString = context.getResources().getQuantityString(R.plurals.post_live_viewer_user_pay_summary_info, i, AbstractC25228BEl.A1Z(username, i));
                C14360o3.A07(quantityString);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(quantityString);
                AbstractC31174DnI.A1B(A0H, username);
                list.add(new C56114OvZ(A0H, Bhu, null, null, id, null, null));
                list.add(new C42286IoA("KEY_VIEWER_LIST_DIVIDER"));
            }
            if (c56807PIz.A01()) {
                UserSession userSession = c56807PIz.A06;
                Context context2 = c56807PIz.A04;
                String string = context2.getString(2131965347);
                String string2 = context2.getString(2131965346);
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322409573263579L);
                int i2 = R.drawable.instagram_facebook_avatars_filled_44;
                if (A06) {
                    i2 = R.drawable.instagram_avatars_filled_44;
                }
                A0E.A00(new C56117Ovc(null, new C44349Jio(context2, Integer.valueOf(R.color.audio_bar_action_color_enabled), i2, AbstractC43594JPz.A03(context2), 0), AbstractC13630mp.A00(context2, R.drawable.instagram_chevron_right_pano_outline_24), null, new ViewOnClickListenerC48068LPt(40, c56807PIz, context2, userSession), string, string2, false, false, false));
            }
            if (c56807PIz.A0F) {
                OE7 oe7 = c56807PIz.A08;
                User user = c56807PIz.A07;
                C57541PgF A012 = C57541PgF.A01(c56807PIz, 21);
                if (oe7.A01) {
                    if ("off".equals(oe7.A00)) {
                        Context context3 = oe7.A03;
                        String string3 = context3.getString(2131965349);
                        String A0c = AbstractC31178DnM.A0c(context3, user, 2131965348);
                        Drawable A00 = AbstractC13630mp.A00(context3, R.drawable.instagram_alert_new_pano_outline_24);
                        P3T p3t = new P3T(oe7, 39);
                        if (oe7.A02) {
                            c56117Ovc = new C56116Ovb(A00, null, null, p3t, EnumC53237Nga.A08, null, Integer.valueOf(R.dimen.action_bar_item_spacing_left), string3, A0c);
                        } else {
                            c56117Ovc = new C56117Ovc(null, A00, null, null, null, string3, A0c, true, false, true);
                        }
                    } else if (IGLiveNotificationPreference.A04 != user.A09()) {
                        Context context4 = oe7.A03;
                        String string4 = context4.getString(2131965349);
                        String A0c2 = AbstractC31178DnM.A0c(context4, user, 2131965348);
                        Drawable A002 = AbstractC13630mp.A00(context4, R.drawable.instagram_alert_new_pano_outline_24);
                        Ok4 ok4 = new Ok4(A012, 29);
                        if (oe7.A02) {
                            c56117Ovc = new C56116Ovb(A002, null, ok4, null, EnumC53237Nga.A04, null, Integer.valueOf(R.dimen.action_bar_item_spacing_left), string4, A0c2);
                        } else {
                            c56117Ovc = new C56117Ovc(null, A002, null, null, ok4, string4, A0c2, false, false, true);
                        }
                    }
                    list.add(c56117Ovc);
                }
            }
            C56074Our c56074Our = c56807PIz.A00;
            if (c56074Our != null && AbstractC166987dD.A1b(c56074Our.A00)) {
                list.add(new C56106OvQ("KEY_UPCOMING_EVENT_SECTION_HEADER", AbstractC166997dE.A0p(c56807PIz.A04, 2131976246), null));
                list.add(c56074Our);
            }
            List list2 = c56807PIz.A0C;
            int i3 = 0;
            if (AbstractC166987dD.A1b(list2)) {
                Context context5 = c56807PIz.A04;
                list.add(new C56106OvQ("KEY_LIVE_NOW_SECTION_HEADER", AbstractC166997dE.A0p(context5, 2131965448), context5.getString(2131965449)));
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : list2) {
                    if (((C105824pt) obj).A02() != null) {
                        A1E.add(obj);
                    }
                }
                Iterator it = A1E.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        break;
                    }
                    C105824pt c105824pt = (C105824pt) next;
                    ImageUrl A02 = c105824pt.A02();
                    if (A02 != null) {
                        int A022 = MSW.A02((AbstractC13880nE.A0A(context5) - ((AbstractC167017dG.A03(context5) * 2) + AbstractC167017dG.A06(context5))) / 2, 0.643f);
                        String str = c105824pt.A0Y;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = c105824pt.A0X;
                        str2.getClass();
                        int A003 = c105824pt.A00();
                        User user2 = c105824pt.A09;
                        user2.getClass();
                        String username2 = user2.getUsername();
                        User user3 = c105824pt.A09;
                        user3.getClass();
                        list.add(new C51820MvO(A02, c105824pt, str2, username2, str, A003, A022, i4, user3.isVerified()));
                    }
                    i4 = i5;
                }
            }
            List list3 = c56807PIz.A0B;
            if (AbstractC166987dD.A1b(list3)) {
                Context context6 = c56807PIz.A04;
                list.add(new C56106OvQ("KEY_POST_LIVE_SECTION_HEADER", AbstractC166997dE.A0p(context6, 2131969817), context6.getString(2131969818)));
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (Object obj2 : list3) {
                    if (((C38895HAr) obj2).A01 != null) {
                        A1E2.add(obj2);
                    }
                }
                Iterator it2 = A1E2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i6 = i3 + 1;
                    if (i3 >= 0) {
                        C38895HAr c38895HAr = (C38895HAr) next2;
                        UserSession userSession2 = c56807PIz.A06;
                        C38321qM c38321qM = c38895HAr.A01;
                        list.add(new C56105OvP(new C56414P3b(userSession2, c38321qM, new C38900HAw(EnumC39587Hdx.A05, AnonymousClass001.A0R("chaining_", c38321qM.A38()), context6.getString(2131969817))), c38895HAr, i3));
                        i3 = i6;
                    } else {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                }
            }
        } else {
            list.add(new Object());
        }
        A0E.A01(list);
        c66362zD.A05(A0E);
    }

    private final boolean A01() {
        UserSession userSession = this.A06;
        if (C14360o3.A0K(C20Y.A00(userSession).A01.A00, C125525ly.A00) && AbstractC109224vo.A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36321219867911403L) && this.A0J) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58131Ppu
    public final C66362zD BlI() {
        return this.A0G;
    }
}
