package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: X.GoH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38028GoH implements JIJ {
    public final /* synthetic */ ContextualFeedFragment A00;

    @Override // X.JIJ
    public final void Dfz() {
    }

    @Override // X.JIJ
    public final void DgU(String str, String str2, List list, List list2, boolean z, boolean z2) {
        String str3;
        C3FR c3fr;
        C210679Tk A02;
        C14360o3.A0B(list, 1);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        UserDetailFragment userDetailFragment = contextualFeedFragment.A0I;
        if (userDetailFragment != null) {
            C154776xS c154776xS = userDetailFragment.A0j;
            EnumC125775mS enumC125775mS = EnumC125775mS.A06;
            C154776xS.A00(c154776xS, enumC125775mS).A03.A03.A09 = str;
            C154776xS c154776xS2 = userDetailFragment.A0j;
            C14360o3.A0B(enumC125775mS, 0);
            C154776xS.A00(c154776xS2, enumC125775mS).A03.A03.A07 = str2;
            if (userDetailFragment.A1w && list2 != null && !list2.isEmpty()) {
                userDetailFragment.A0z.A0Q(enumC125775mS, (List) list2.stream().map(new TVN(userDetailFragment, 2)).collect(Collectors.toList()));
            } else {
                userDetailFragment.A0z.A0P(enumC125775mS, list);
            }
        }
        if (contextualFeedFragment.A0V && AbstractC166987dD.A1b(list)) {
            if (contextualFeedFragment.isResumed() && !z2) {
                UserSession A00 = ContextualFeedFragment.A00(contextualFeedFragment);
                String moduleName = contextualFeedFragment.getModuleName();
                boolean A1T = AbstractC31175DnJ.A1T(1, A00, moduleName);
                C06090Tz c06090Tz = C06090Tz.A06;
                if (C18U.A06(c06090Tz, A00, 36321408846407064L)) {
                    if (("shopping_consumer_bau_ad_click_and_interaction_reminder".equals(moduleName) || "shopping_consumer_bau_ad_click_reminder".equals(moduleName) || "shopping_consumer_bau_ad_like_reminder".equals(moduleName) || "shopping_consumer_bau_ad_save_reminder".equals(moduleName) || "shopping_consumer_bau_ad_caption_expand_reminder".equals(moduleName) || "shopping_consumer_bau_ad_click_percentage_off".equals(moduleName) || "shopping_consumer_bau_ad_click_free_shipping".equals(moduleName)) && C18U.A06(c06090Tz, A00, 36321408846472601L) && !AbstractC166987dD.A0x(ContextualFeedFragment.A00(contextualFeedFragment)).getBoolean("preference_has_seen_recon_notifications_scroll_toast", A1T) && (A02 = C9GR.A02(contextualFeedFragment.requireContext(), contextualFeedFragment.getString(2131972990), null, A1T ? 1 : 0)) != null) {
                        A02.setGravity(80, A1T ? 1 : 0, AbstractC166997dE.A0N(contextualFeedFragment).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height));
                        A02.show();
                        String string = contextualFeedFragment.requireArguments().getString(AbstractC111324zv.A00(849), "");
                        C14360o3.A07(string);
                        long parseLong = Long.parseLong(string);
                        String string2 = contextualFeedFragment.requireArguments().getString(AbstractC111324zv.A00(196), "");
                        C14360o3.A07(string2);
                        long parseLong2 = Long.parseLong(string2);
                        IC5 ic5 = contextualFeedFragment.A0D;
                        if (ic5 != null) {
                            String moduleName2 = contextualFeedFragment.getModuleName();
                            C14360o3.A0B(moduleName2, 2);
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ic5.A00, "instagram_recon_scroll_more_toast_impression");
                            if (A0f.isSampled()) {
                                AbstractC37301Gc2.A0z(A0f, parseLong);
                                A0f.AAP("module_name", moduleName2);
                                AbstractC25230BEn.A1B(A0f, parseLong2);
                                A0f.Cht();
                            }
                        }
                        AbstractC31177DnL.A1N(AbstractC166987dD.A0x(ContextualFeedFragment.A00(contextualFeedFragment)), "preference_has_seen_recon_notifications_scroll_toast", true);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!z2 && AbstractC166987dD.A1b(list)) {
            C61712rY c61712rY = contextualFeedFragment.A0E;
            if (c61712rY == null) {
                str3 = "feedMediaLoadingLogger";
            } else {
                c61712rY.A01(null, C05F.A0C, C05F.A0j, contextualFeedFragment.getModuleName());
                C38321qM A0x = AbstractC25225BEi.A0x(list, 0);
                String id = AbstractC25225BEi.A0x(list, 0).getId();
                if (A0x.A5M()) {
                    C38321qM A1e = A0x.A1e(0);
                    if (A1e != null) {
                        id = A1e.getId();
                    } else {
                        id = null;
                    }
                }
                C37445GeP c37445GeP = contextualFeedFragment.A0G;
                if (c37445GeP == null) {
                    str3 = "feedMediaLoadingTracker";
                } else {
                    c37445GeP.A03 = id;
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
        str3 = "adapter";
        if (z) {
            HY4 hy4 = contextualFeedFragment.A0N;
            if (hy4 != null) {
                hy4.A0B(list);
                ContextualFeedFragment.A02(contextualFeedFragment);
                C3CO c3co = contextualFeedFragment.A0C;
                if (c3co == null) {
                    str3 = "mediaUpdateListener";
                } else {
                    c3co.A00();
                    if (contextualFeedFragment.mView != null || (c3fr = (C3FR) contextualFeedFragment.getScrollingViewProxy()) == null) {
                        return;
                    }
                    c3fr.EWc(false);
                    return;
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
        if (z2) {
            HY4 hy42 = contextualFeedFragment.A0N;
            if (hy42 != null) {
                hy42.A05();
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
        HY4 hy43 = contextualFeedFragment.A0N;
        if (hy43 != null) {
            hy43.A0B(list);
            if (contextualFeedFragment.mView != null) {
                return;
            } else {
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    public C38028GoH(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.JIJ
    public final void A8t(List list) {
        String str;
        ContextualFeedFragment contextualFeedFragment = this.A00;
        AbstractC37439GeJ abstractC37439GeJ = contextualFeedFragment.A0B;
        if (abstractC37439GeJ == null) {
            str = "contextualFeedController";
        } else {
            boolean A0a = abstractC37439GeJ.A0a();
            str = "adapter";
            HY4 hy4 = contextualFeedFragment.A0N;
            if (A0a) {
                if (hy4 != null) {
                    boolean z = hy4 instanceof C37432GeC;
                    AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) hy4).A00;
                    if (z) {
                        abstractC65332xV.A0B(list);
                        return;
                    } else {
                        abstractC65332xV.A0B(C3XG.A0A.A06(list));
                        return;
                    }
                }
            } else if (hy4 != null) {
                hy4.A0B(list);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.JIJ
    public final void AVM(User user) {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.A09(user);
    }

    @Override // X.JIJ
    public final List AZV() {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return hy4.A04();
    }

    @Override // X.JIJ
    public final C75113Zb BRb(String str) {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (hy4 instanceof C38284GsT) {
            return (C75113Zb) ((C38284GsT) hy4).A0B.get(str);
        }
        return null;
    }

    @Override // X.JIJ
    public final void CtR(C38321qM c38321qM) {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.CtR(c38321qM);
    }

    @Override // X.JIJ
    public final void DGM(String str) {
        this.A00.A05("favorites_feed_nav_bar");
    }

    @Override // X.JIJ
    public final void Dfp() {
        ContextualFeedFragment contextualFeedFragment = this.A00;
        C61712rY c61712rY = contextualFeedFragment.A0E;
        String str = "feedMediaLoadingLogger";
        if (c61712rY != null) {
            String moduleName = contextualFeedFragment.getModuleName();
            Integer num = C05F.A0C;
            c61712rY.A01(null, num, C05F.A0u, moduleName);
            C61712rY c61712rY2 = contextualFeedFragment.A0E;
            if (c61712rY2 != null) {
                c61712rY2.A03(null, num, contextualFeedFragment.getModuleName());
                HY4 hy4 = contextualFeedFragment.A0N;
                if (hy4 == null) {
                    str = "adapter";
                } else {
                    hy4.CtR(null);
                    AbstractC37303Gc4.A19(contextualFeedFragment);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.JIJ
    public final void DgF() {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.CtR(null);
    }

    @Override // X.JIJ
    public final void F9B(String str) {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.A0A(str);
    }

    @Override // X.JIJ
    public final void FAg() {
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        hy4.FAg();
    }

    @Override // X.JIJ
    public final /* bridge */ /* synthetic */ C75113Zb BRa(Object obj) {
        C38321qM A0H = AbstractC37301Gc2.A0H(obj);
        HY4 hy4 = this.A00.A0N;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return hy4.BRZ(A0H);
    }

    @Override // X.JIJ
    public final /* bridge */ /* synthetic */ void EFT(Object obj) {
    }
}
