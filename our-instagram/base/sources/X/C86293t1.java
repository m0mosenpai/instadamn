package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.InterestPivotRedirect;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3t1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86293t1 implements InterfaceC86303t2 {
    public final Fragment A00;
    public final C684436h A01;
    public final InterfaceC60442pS A02;
    public final UserSession A03;
    public final C79973hm A04;
    public final C3t0 A05;
    public final C86313t3 A06;
    public final User A07;
    public final C1M1 A08;
    public final String A09;

    public C86293t1(Fragment fragment, C684436h c684436h, UserSession userSession, C57112jm c57112jm, C79973hm c79973hm, InterfaceC60442pS interfaceC60442pS, C3t0 c3t0, User user, C1M1 c1m1, String str) {
        C14360o3.A0B(c79973hm, 3);
        C14360o3.A0B(c1m1, 6);
        this.A03 = userSession;
        this.A00 = fragment;
        this.A04 = c79973hm;
        this.A02 = interfaceC60442pS;
        this.A09 = str;
        this.A08 = c1m1;
        this.A07 = user;
        this.A01 = c684436h;
        this.A05 = c3t0;
        this.A06 = new C86313t3(userSession, c57112jm, interfaceC60442pS, str);
    }

    @Override // X.InterfaceC86303t2
    public final void D56(View view, EnumC120795dP enumC120795dP, InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(enumC120795dP, 4);
        this.A04.A00(view, enumC120795dP, EnumC116885Qs.A04, interfaceC11380iw, c38321qM, c75113Zb, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC86303t2
    public final void D5S(C38321qM c38321qM) {
        long j;
        Long l;
        Long A0k;
        Fragment fragment = this.A00;
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) fragment;
        UserSession userSession = this.A03;
        String sessionId = this.A08.getSessionId();
        String A00 = AbstractC111324zv.A00(5544);
        C14360o3.A0B(interfaceC11380iw, 0);
        C14360o3.A0B(sessionId, 2);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, MSV.A00(482));
        if (A002.isSampled()) {
            A002.AAP(MSV.A00(1463), A00);
            A002.AAP(MSV.A00(1464), "feed_preview");
            A002.AAP("containermodule", interfaceC11380iw.getModuleName());
            A002.A8p("media_index", -1);
            A002.AAP("viewer_session_id", sessionId);
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            A002.A9K("media_id", Long.valueOf(j));
            User CDj = c38321qM.A0C.CDj();
            if (CDj != null) {
                l = AbstractC003100w.A0k(10, CDj.getId());
            } else {
                l = null;
            }
            A002.A9K("media_author_id", l);
            A002.Cht();
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            AbstractC40927IAz.A00(activity, fragment, C22P.A2l, null, userSession, c38321qM, null, true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC86303t2
    public final void DKm(View view, C38321qM c38321qM, C75113Zb c75113Zb, User user) {
        List AZh;
        InterfaceC107754tK interfaceC107754tK;
        String BlW;
        List AZh2;
        InterfaceC107754tK interfaceC107754tK2;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        if (user != null) {
            InterfaceC107774tM BEB = c38321qM.A0C.BEB();
            String str = null;
            if (BEB != null && (AZh = BEB.AZh()) != null && (interfaceC107754tK = (InterfaceC107754tK) AbstractC001800i.A0O(AZh, 0)) != null && (BlW = interfaceC107754tK.BlW()) != null && view != null) {
                C3t0 c3t0 = this.A05;
                if (c3t0 != null) {
                    InterfaceC107774tM BEB2 = c38321qM.A0C.BEB();
                    if (BEB2 != null && (AZh2 = BEB2.AZh()) != null && (interfaceC107754tK2 = (InterfaceC107754tK) AbstractC001800i.A0J(AZh2)) != null) {
                        str = interfaceC107754tK2.getMediaId();
                    }
                    RectF rectF = AbstractC13880nE.A01;
                    RectF rectF2 = new RectF();
                    AbstractC13880nE.A0M(rectF2, view);
                    c3t0.A00(rectF2, new CP7(c75113Zb), C3G2.A15, user, BlW, str);
                    return;
                }
                return;
            }
            C0w9.A03("DefaultMediaTagIndicatorDelegateImpl#onHighlightIndicatorClick", "Reel id is null");
        }
    }

    @Override // X.InterfaceC86303t2
    public final void DY7(C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC86363t8 interfaceC86363t8) {
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            UserSession userSession = this.A03;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            if (AbstractC76193bO.A01(interfaceC60442pS, userSession, c38321qM) != C3YE.A0C && AbstractC76193bO.A01(interfaceC60442pS, userSession, c38321qM) != C3YE.A05) {
                throw new IllegalArgumentException(AbstractC111324zv.A00(23));
            }
            AbstractC55229Oez.A09(fragment, userSession, c38321qM, interfaceC60442pS, interfaceC86363t8, null, false, false);
        }
    }

    @Override // X.InterfaceC86303t2
    public final void Dwr(C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC86363t8 interfaceC86363t8, InterfaceC43588JPt interfaceC43588JPt) {
        UserSession userSession = this.A03;
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B != null) {
            AbstractC40640Hzy.A00(userSession, c38321qM, this.A02, A2B);
        }
        if (c38321qM.A53()) {
            C1XJ.A00.A0s(this.A00.requireActivity(), userSession, c38321qM, this.A02, c75113Zb, interfaceC86363t8, interfaceC43588JPt, this.A09, null);
            return;
        }
        if (c38321qM.A51()) {
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0X = interfaceC86363t8;
            Fragment fragment = this.A00;
            c189448aO.A0d = AbstractC55229Oez.A03(fragment.requireContext(), c38321qM);
            c189448aO.A00().A03(fragment.requireContext(), AbstractC40898I9w.A00(userSession, c38321qM, this.A02, c75113Zb.A0o, interfaceC43588JPt, null, null));
            return;
        }
        if (A2B == null) {
            return;
        }
        C28341Yv A00 = AbstractC22762A2g.A00();
        Context requireContext = this.A00.requireContext();
        InterfaceC60442pS interfaceC60442pS = this.A02;
        A00.A01(requireContext, userSession, interfaceC60442pS, interfaceC43588JPt, A2B, c38321qM.A1g(userSession).getId(), interfaceC60442pS.getModuleName(), AbstractC111324zv.A00(537), false, false);
    }

    @Override // X.InterfaceC86303t2
    public final void Dyk(View view, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, EnumC86843tw enumC86843tw) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(enumC86843tw, 2);
        if (enumC86843tw == EnumC86843tw.A06) {
            Integer num = C05F.A00;
            if (c75113Zb.A13 != num) {
                c75113Zb.A13 = num;
                C75113Zb.A00(c75113Zb, 50);
                return;
            }
            return;
        }
        this.A04.A00(view, EnumC120795dP.A0M, EnumC116885Qs.A04, interfaceC60442pS, c38321qM, c75113Zb, null, true);
    }

    @Override // X.InterfaceC86303t2
    public final void E0w(C38321qM c38321qM, C75113Zb c75113Zb) {
        C140966Yy A00;
        boolean z;
        int ordinal;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            FragmentActivity requireActivity = fragment.requireActivity();
            UserSession userSession = this.A03;
            String sessionId = this.A08.getSessionId();
            InterfaceC60442pS interfaceC60442pS = this.A02;
            C14360o3.A0B(sessionId, 4);
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A002 = A01.A00(A01.A00, "ig_interest_pivot_click");
            if (A002.isSampled()) {
                A002.AAP("module", interfaceC60442pS.getModuleName());
                String BJN = c38321qM.A0C.BJN();
                if (BJN == null) {
                    BJN = "";
                }
                A002.AAP("inventory_source", BJN);
                A002.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
                A002.AAP("feed_request_id", c38321qM.A0R);
                A002.A9K("recs_ix", Long.valueOf(c75113Zb.A0W));
                A002.A9K("m_ix", Long.valueOf(c75113Zb.getPosition()));
                A002.AAP("m_pk", c38321qM.getId());
                A002.Cht();
            }
            InterfaceC43558JLs B5l = c38321qM.A0C.B5l();
            if (B5l != null) {
                InterestPivotRedirect BlM = B5l.BlM();
                if (BlM != null && (ordinal = BlM.ordinal()) != 1 && ordinal == 2) {
                    A00 = new C140966Yy(requireActivity, userSession);
                    C66277U6x A012 = C66277U6x.A01("com.instagram.feed.interest_pivot_grid_screen", AbstractC06930Yk.A02(new C09530e4("seed_media_pk", c38321qM.A38())));
                    IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
                    String Bqp = B5l.Bqp();
                    if (Bqp == null) {
                        Bqp = requireActivity.getString(2131964593);
                        C14360o3.A07(Bqp);
                    }
                    igBloksScreenConfig.A0U = Bqp;
                    igBloksScreenConfig.A0l = true;
                    A00.A0D(W6d.A02(igBloksScreenConfig, A012));
                } else {
                    A00 = AbstractC40628Hzm.A00(requireActivity, userSession);
                    String id = c38321qM.getId();
                    if (id != null) {
                        String id2 = c38321qM.getId();
                        if (id2 != null) {
                            String A04 = C38801rC.A04(id2);
                            C14360o3.A0B(A04, 2);
                            EnumC39592He2 enumC39592He2 = EnumC39592He2.A05;
                            int i = c38321qM.BRp().A00;
                            String B3P = c38321qM.A0C.B3P();
                            Object[] objArr = {null, null, null};
                            C14360o3.A0B(objArr, 0);
                            int size = AbstractC009903n.A0I(objArr).size();
                            if (size != 0) {
                                if (size == 3) {
                                    z = true;
                                } else {
                                    throw new IllegalArgumentException(AbstractC111324zv.A00(3497));
                                }
                            } else {
                                z = false;
                            }
                            DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(enumC39592He2, null, null, null, id, A04, B3P, null, null, null, null, null, null, null, null, null, null, null, null, i, z);
                            String Bqp2 = B5l.Bqp();
                            if (Bqp2 == null) {
                                Bqp2 = requireActivity.getString(2131964593);
                                C14360o3.A07(Bqp2);
                            }
                            String moduleName = interfaceC60442pS.getModuleName();
                            String A003 = AbstractC111324zv.A00(4713);
                            C14360o3.A0B(moduleName, 5);
                            A00.A0B(null, AbstractC40602HzM.A00(new DiscoveryChainingConfig(null, discoveryChainingItem, null, null, null, Bqp2, A003, sessionId, moduleName, null, null, null, null, null, null, null, C16910sj.A00, false, false, false, false, false, false, false, false, true, true, false)));
                            A00.A08();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                A00.A04();
            }
        }
    }

    @Override // X.InterfaceC86303t2
    public final void EDR(View view, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (AbstractC76193bO.A01(this.A02, this.A03, c38321qM) == C3YE.A0E) {
            C86313t3 c86313t3 = this.A06;
            String A0R = AnonymousClass001.A0R("tags_list_entry_point_impression_", c38321qM.getId());
            C57112jm c57112jm = c86313t3.A01;
            C0eB c0eB = C0eB.A00;
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(c38321qM, c0eB, A0R);
            c59072n8.A00(c86313t3.A00);
            c57112jm.A05(view, c59072n8.A01());
        }
    }

    @Override // X.InterfaceC86303t2
    public final String CGJ() {
        return this.A08.getSessionId();
    }

    @Override // X.InterfaceC86303t2
    public final void D5b(C38321qM c38321qM) {
        C684436h c684436h = this.A01;
        if (c684436h != null) {
            Fragment fragment = this.A00;
            FragmentActivity requireActivity = fragment.requireActivity();
            UserSession userSession = this.A03;
            new FRV(requireActivity, c684436h, userSession).A02(null, fragment, EnumC33409Epg.CLIPS_VIEWER, new C55885OrZ(userSession, c38321qM), new C35934Fts(this), this.A02);
        }
    }

    @Override // X.InterfaceC86303t2
    public final void DIj(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM) {
        String str;
        String A34 = c38321qM.A34();
        if (A34 != null) {
            c38321qM.A0C.B99();
            UserSession userSession = this.A03;
            User A2E = c38321qM.A2E(userSession);
            C18920wW A01 = AbstractC12220kQ.A01(this.A02, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_cg_click_fundraiser_donate_pill");
            A00.A9K("fundraiser_id", AbstractC003100w.A0k(10, A34));
            A00.Cht();
            AbstractC72143Ln.A01 = c38321qM.getId();
            AbstractC72143Ln.A00 = A34;
            Fragment fragment = this.A00;
            FragmentActivity requireActivity = fragment.requireActivity();
            String str2 = null;
            if (A2E != null) {
                str = A2E.getId();
            } else {
                str = null;
            }
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                AbstractC55224Oeq.A0A(requireActivity, userSession, A34, "FEED_POST", str, A2u, true);
                Context applicationContext = fragment.requireActivity().getApplicationContext();
                C14360o3.A07(applicationContext);
                if (A2E != null) {
                    str2 = A2E.getId();
                }
                String A2u2 = c38321qM.A2u();
                if (A2u2 != null) {
                    AbstractC55224Oeq.A03(applicationContext, userSession, A34, "FEED_POST", str2, A2u2);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC86303t2
    public final void DLD(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM) {
        String iconicHorizonWorldDeeplink;
        InterfaceC43580JMo CHL = c38321qM.A0C.CHL();
        if (CHL != null && (iconicHorizonWorldDeeplink = CHL.getIconicHorizonWorldDeeplink()) != null) {
            C47993LKk.A00.A03(interfaceC11380iw, this.A03, c38321qM, C05F.A01);
            AbstractC41776Ies.A03(this.A00.requireContext(), iconicHorizonWorldDeeplink);
        }
    }

    @Override // X.InterfaceC86303t2
    public final void DbR(C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC86363t8 interfaceC86363t8, User user, boolean z) {
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            InterfaceC60442pS interfaceC60442pS = this.A02;
            UserSession userSession = this.A03;
            String str = this.A09;
            AbstractC41775Ier.A0B(userSession, c38321qM, interfaceC60442pS, str, z);
            C1XJ.A00.A0s(activity, userSession, c38321qM, interfaceC60442pS, c75113Zb, interfaceC86363t8, null, str, "shopping_indicator");
            try {
                C1XJ c1xj = C1XJ.A00;
                C14360o3.A0C(fragment, AbstractC43591JPw.A00(0));
                c1xj.A1G((AbstractC59962oe) fragment, userSession, null);
            } catch (ClassCastException e) {
                C18950wb c18950wb = C18950wb.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("DefaultMediaTagIndicatorDelegateImpl#onProductTagsIndicatorClick ");
                sb.append(e);
                c18950wb.AEp(sb.toString(), 817899586).report();
            }
            I7L.A00(userSession).A00();
        }
    }
}
