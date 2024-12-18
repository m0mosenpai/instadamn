package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HDE extends C38K implements InterfaceC71989XEc, AbsListView.OnScrollListener, GZU, InterfaceC60122ou, InterfaceC37188GZz {
    public static final String __redex_internal_original_name = "ReelQuizRespondersListFragment";
    public UserSession A00;
    public Reel A01;
    public C41181vS A02;
    public OJL A03;
    public FR7 A04;
    public C31543DtT A05;
    public HEE A06;
    public int A08;
    public C38E A09;
    public Wm1 A0A;
    public String A0B;
    public final C61372qz A0C = new C61372qz();
    public boolean A07 = true;

    @Override // X.InterfaceC71989XEc
    public final void Cw7(C69141ViW c69141ViW) {
    }

    @Override // X.InterfaceC71989XEc
    public final void Czl(C38266GsB c38266GsB) {
    }

    @Override // X.InterfaceC71989XEc
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        String str;
        AbstractC167017dG.A1N(reel, gradientSpinnerAvatarView);
        List A1J = AbstractC166987dD.A1J(reel);
        C38E c38e = this.A09;
        if (c38e == null) {
            str = "reelViewerLauncher";
        } else {
            String str2 = this.A0B;
            if (str2 == null) {
                str = "reelTraySessionId";
            } else {
                c38e.A0C = str2;
                C42790IwS.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), c38e, this, 6);
                c38e.A0A(reel, C3G2.A1g, gradientSpinnerAvatarView, A1J, A1J, A1J);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC71989XEc
    public final void DTP(C38266GsB c38266GsB, C41181vS c41181vS, User user) {
    }

    @Override // X.InterfaceC71989XEc
    public final void DXH(C38266GsB c38266GsB) {
        C14360o3.A0B(c38266GsB, 0);
        User user = c38266GsB.A0L;
        OJL ojl = this.A03;
        if (ojl == null) {
            ojl = new OJL(getRootActivity());
            this.A03 = ojl;
        }
        C14360o3.A0A(ojl);
        if (user != null) {
            Reel reel = this.A01;
            if (reel != null) {
                ojl.A00(reel, new C42802Iwe(1, c38266GsB, this), user, "reel_quiz_responders_list");
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.GZU
    public final void Ddb(User user, boolean z) {
    }

    @Override // X.InterfaceC37188GZz
    public final void Dit() {
    }

    @Override // X.InterfaceC71989XEc
    public final void DtW(C69141ViW c69141ViW) {
    }

    @Override // X.InterfaceC71989XEc
    public final void DtX(User user) {
        C14360o3.A0B(user, 0);
        FR7 fr7 = this.A04;
        if (fr7 == null) {
            UserSession userSession = this.A00;
            if (userSession == null) {
                AbstractC31171DnF.A0y();
                throw C00O.createAndThrow();
            }
            fr7 = new FR7(this, userSession);
            this.A04 = fr7;
        }
        C14360o3.A0A(fr7);
        Reel reel = this.A01;
        if (reel != null) {
            fr7.A01(this, user, "quiz_responders_list", false, reel.A0d());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC71989XEc
    public final void E17(C38266GsB c38266GsB) {
        C14360o3.A0B(c38266GsB, 0);
        User user = c38266GsB.A0L;
        UserSession userSession = this.A00;
        if (userSession != null) {
            if (user != null) {
                C31368DqX A01 = AbstractC31402Dr6.A01(userSession, user.getId(), "reel_quiz_responders_list", "reel_quiz_responders_list");
                FragmentActivity requireActivity = requireActivity();
                UserSession userSession2 = this.A00;
                if (userSession2 != null) {
                    C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession2);
                    C28431Ze A02 = AbstractC31364DqT.A02();
                    UserSession userSession3 = this.A00;
                    if (userSession3 != null) {
                        C31368DqX.A02(A0r, userSession3, A02, A01);
                        return;
                    }
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String string;
        C14360o3.A0B(interfaceC56362iU, 0);
        Wm1 wm1 = this.A0A;
        if (wm1 != null && this.A08 != -1) {
            C14360o3.A0A(wm1);
            List list = wm1.A02.A0C;
            if (list != null) {
                Object obj = list.get(this.A08);
                C14360o3.A0A(obj);
                InterfaceC43540JLa interfaceC43540JLa = (InterfaceC43540JLa) obj;
                C14360o3.A0B(interfaceC43540JLa, 0);
                string = interfaceC43540JLa.getText();
                if (string == null || string.length() > 1000) {
                    string = "";
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            string = requireContext().getString(2131971791);
        }
        AbstractC31175DnJ.A1I(interfaceC56362iU, string);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C61372qz c61372qz = this.A0C;
        C31543DtT c31543DtT = this.A05;
        if (c31543DtT == null) {
            str = "paginationHelper";
        } else {
            c61372qz.A01(c31543DtT);
            AbstractC37300Gc1.A02(this).setOnScrollListener(this);
            HEE hee = this.A06;
            if (hee == null) {
                str = "adapter";
            } else {
                A0U(hee);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A01() {
        if (this.A02 != null) {
            A02(this);
            C31543DtT c31543DtT = this.A05;
            if (c31543DtT != null) {
                c31543DtT.A01 = false;
                UserSession userSession = this.A00;
                if (userSession == null) {
                    AbstractC31171DnF.A0y();
                    throw C00O.createAndThrow();
                }
                C41181vS c41181vS = this.A02;
                if (c41181vS != null) {
                    C38321qM c38321qM = c41181vS.A0b;
                    if (c38321qM != null) {
                        String A38 = c38321qM.A38();
                        Wm1 wm1 = this.A0A;
                        if (wm1 != null) {
                            String str = wm1.A02.A08;
                            if (str == null) {
                                str = "";
                            }
                            int i = this.A08;
                            C31543DtT c31543DtT2 = this.A05;
                            if (c31543DtT2 != null) {
                                String str2 = c31543DtT2.A00;
                                C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                                AbstractC31173DnH.A1Q(A0M, "media/%s/%s/story_quiz_participants/", new Object[]{A38, str});
                                A0M.A0H("max_id", str2);
                                A0M.A0S(HA8.class, C41342IRn.class);
                                if (i != -1) {
                                    A0M.A9s("answer", Integer.toString(i));
                                }
                                C1ON A0N = A0M.A0N();
                                C39030HGg.A00(A0N, this, 40);
                                schedule(A0N);
                                return;
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            C14360o3.A0F("paginationHelper");
            throw C00O.createAndThrow();
        }
    }

    public static final void A02(HDE hde) {
        String str;
        C31543DtT c31543DtT = hde.A05;
        if (c31543DtT == null) {
            str = "paginationHelper";
        } else {
            c31543DtT.A02 = true;
            AbstractC31177DnL.A18(hde, C56352iT.A0t, true);
            HEE hee = hde.A06;
            if (hee == null) {
                str = "adapter";
            } else {
                if (hee.A03.isEmpty()) {
                    A03(hde);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r0 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.HDE r2) {
        /*
            X.DtT r1 = r2.A05
            java.lang.String r0 = "paginationHelper"
            if (r1 != 0) goto Le
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            boolean r0 = r1.isLoading()
            if (r0 == 0) goto L1b
            boolean r0 = r1.CLJ()
            r1 = 1
            if (r0 == 0) goto L1c
        L1b:
            r1 = 0
        L1c:
            android.view.View r0 = r2.mView
            X.AbstractC31557Dth.A00(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HDE.A03(X.HDE):void");
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.InterfaceC37188GZz
    public final boolean CL7() {
        if (this.A06 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return !r0.isEmpty();
    }

    @Override // X.GZU
    public final void Dda() {
        HEE hee = this.A06;
        if (hee == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        C0fA.A00(hee, -337831832);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_quiz_responders_list";
    }

    @Override // X.InterfaceC37188GZz
    public final void Chd() {
        A01();
    }

    @Override // X.InterfaceC71989XEc
    public final void DAN(C38266GsB c38266GsB, C41181vS c41181vS, User user, boolean z) {
        C3DN A0r;
        AbstractC167017dG.A1P(user, c41181vS);
        C28501Zl c28501Zl = C28531Zo.A04.A02;
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        C34725FRo A06 = c28501Zl.A06(this, userSession, "reel_dashboard_viewer");
        AbstractC37304Gc5.A1Q(A06, c41181vS, user, z);
        A06.A01(AbstractC111324zv.A00(1302));
        FragmentActivity activity = getActivity();
        if (activity != null && (A0r = AbstractC31172DnG.A0r(activity)) != null) {
            A0r.A0K(A06.A00());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2015552469);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        String string = requireArguments().getString("ReelQuizRespondersListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelQuizRespondersListFragment.REEL_ITEM_ID");
        this.A08 = requireArguments().getInt("ReelQuizRespondersListFragment.QUIZ_OPTION_INDEX", -1);
        UserSession userSession = this.A00;
        String str = "userSession";
        if (userSession != null) {
            Reel A0I = AbstractC37301Gc2.A0I(userSession, string);
            this.A01 = A0I;
            if (A0I != null) {
                UserSession userSession2 = this.A00;
                if (userSession2 != null) {
                    Iterator it = A0I.A0O(userSession2).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C41181vS c41181vS = (C41181vS) it.next();
                        if (C14360o3.A0K(c41181vS.A0j, string2)) {
                            this.A02 = c41181vS;
                            break;
                        }
                    }
                }
            }
            C41181vS c41181vS2 = this.A02;
            if (c41181vS2 != null) {
                this.A0A = AbstractC97594Zu.A01(c41181vS2);
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                UserSession userSession3 = this.A00;
                if (userSession3 != null) {
                    this.A05 = new C31543DtT(this, userSession3, this);
                    Context requireContext = requireContext();
                    UserSession userSession4 = this.A00;
                    if (userSession4 != null) {
                        C31543DtT c31543DtT = this.A05;
                        if (c31543DtT == null) {
                            str = "paginationHelper";
                        } else {
                            this.A06 = new HEE(requireContext, this, userSession4, this, c31543DtT);
                            UserSession userSession5 = this.A00;
                            if (userSession5 != null) {
                                this.A09 = new C38E(this, userSession5, new C38C(this, -1));
                                this.A0B = AbstractC166997dE.A0n();
                                A01();
                                C0f9.A09(524363634, A02);
                                return;
                            }
                        }
                    }
                }
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(-2132927404, A02);
                throw A0g;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(620161709);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        C0f9.A09(523992116, A02);
        return inflate;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(434041442);
        super.onResume();
        if (!C06P.A00(AbstractC31174DnI.A0I(this)) && this.A02 == null) {
            AbstractC25226BEj.A1Q(this);
        }
        AbstractC37305Gc6.A03(requireActivity(), this);
        C0f9.A09(252587955, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0N = AbstractC167017dG.A0N(absListView, 617834430);
        this.A0C.onScroll(absListView, i, i2, i3);
        C0f9.A0A(601870043, A0N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, 1485744927);
        this.A0C.onScrollStateChanged(absListView, i);
        C0f9.A0A(-1037614783, A0N);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1836176491);
        super.onStart();
        A03(this);
        C0f9.A09(2004232307, A02);
    }
}
