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
public final class HDD extends C38K implements InterfaceC71989XEc, AbsListView.OnScrollListener, GZU, InterfaceC60122ou, InterfaceC37188GZz {
    public static final String __redex_internal_original_name = "ReelSliderVotersListFragment";
    public UserSession A00;
    public Reel A01;
    public C41181vS A02;
    public OJL A03;
    public FR7 A04;
    public C31543DtT A05;
    public HEF A06;
    public C38E A08;
    public String A09;
    public final C61372qz A0A = new C61372qz();
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
        C38E c38e = this.A08;
        if (c38e == null) {
            str = "reelViewerLauncher";
        } else {
            String str2 = this.A09;
            if (str2 == null) {
                str = "reelTraySessionId";
            } else {
                c38e.A0C = str2;
                C42790IwS.A00(requireActivity(), gradientSpinnerAvatarView.getAvatarBounds(), c38e, this, 7);
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
        if (user != null) {
            OJL ojl = this.A03;
            if (ojl == null) {
                ojl = new OJL(getRootActivity());
                this.A03 = ojl;
            }
            Reel reel = this.A01;
            if (reel != null) {
                ojl.A00(reel, new C42802Iwe(2, c38266GsB, this), user, "reel_slider_voters_list");
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
        Reel reel = this.A01;
        if (reel != null) {
            fr7.A01(this, user, "slider_voters_list", false, reel.A0d());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC71989XEc
    public final void E17(C38266GsB c38266GsB) {
        C14360o3.A0B(c38266GsB, 0);
        User user = c38266GsB.A0L;
        if (user != null) {
            UserSession userSession = this.A00;
            if (userSession != null) {
                C31368DqX A01 = AbstractC31402Dr6.A01(userSession, user.getId(), "reel_slider_voters_list", "reel_slider_voters_list");
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
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C61372qz c61372qz = this.A0A;
        C31543DtT c31543DtT = this.A05;
        if (c31543DtT == null) {
            str = "paginationHelper";
        } else {
            c61372qz.A01(c31543DtT);
            AbstractC37300Gc1.A02(this).setOnScrollListener(this);
            HEF hef = this.A06;
            if (hef == null) {
                str = "adapter";
            } else {
                A0U(hef);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A01() {
        List BlY;
        C38321qM c38321qM;
        if (this.A02 != null) {
            A02(this);
            C31543DtT c31543DtT = this.A05;
            String str = "paginationHelper";
            String str2 = null;
            if (c31543DtT != null) {
                c31543DtT.A01 = false;
                C41181vS c41181vS = this.A02;
                if (c41181vS != null && (BlY = c41181vS.BlY(EnumC75383a5.A1C)) != null) {
                    Wm2 A0F = ((C84823qW) BlY.get(0)).A0F();
                    UserSession userSession = this.A00;
                    if (userSession == null) {
                        str = "userSession";
                    } else {
                        C41181vS c41181vS2 = this.A02;
                        if (c41181vS2 != null && (c38321qM = c41181vS2.A0b) != null) {
                            str2 = c38321qM.getId();
                        }
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (A0F != null) {
                            String str4 = A0F.A00.A08;
                            if (str4 == null) {
                                str4 = "";
                            }
                            str3 = str4;
                        }
                        C31543DtT c31543DtT2 = this.A05;
                        if (c31543DtT2 != null) {
                            String str5 = c31543DtT2.A00;
                            C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append("media/");
                            A1C.append(str2);
                            A1C.append('/');
                            A1C.append(str3);
                            A0M.A0B(AbstractC166997dE.A0x("/story_slider_voters/", A1C));
                            A0M.A9s("max_id", str5);
                            C1ON A0e = AbstractC25227BEk.A0e(A0M, HA9.class, C41343IRo.class);
                            C39030HGg.A00(A0e, this, 42);
                            schedule(A0e);
                            return;
                        }
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A02(HDD hdd) {
        String str;
        C31543DtT c31543DtT = hdd.A05;
        if (c31543DtT == null) {
            str = "paginationHelper";
        } else {
            c31543DtT.A02 = true;
            AbstractC31178DnM.A10(hdd, true);
            HEF hef = hdd.A06;
            if (hef == null) {
                str = "adapter";
            } else {
                if (hef.A03.isEmpty()) {
                    A03(hdd);
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
    public static final void A03(X.HDD r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.HDD.A03(X.HDD):void");
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
        HEF hef = this.A06;
        if (hef == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        C0fA.A00(hef, -542473350);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_slider_voters_list";
    }

    @Override // X.InterfaceC37188GZz
    public final void Chd() {
        A01();
    }

    @Override // X.InterfaceC71989XEc
    public final void DAN(C38266GsB c38266GsB, C41181vS c41181vS, User user, boolean z) {
        AbstractC167017dG.A1P(user, c41181vS);
        C28501Zl c28501Zl = C28531Zo.A04.A02;
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        C34725FRo A06 = c28501Zl.A06(this, userSession, "reel_dashboard_viewer");
        AbstractC37304Gc5.A1Q(A06, c41181vS, user, z);
        A06.A01(AbstractC111324zv.A00(1307));
        C3DN A01 = C3DN.A00.A01(requireContext());
        if (A01 != null) {
            A01.A0K(A06.A00());
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131971836));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1436335440);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        String string = requireArguments().getString("ReelSliderVotersListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelSliderVotersListFragment.REEL_ITEM_ID");
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
                        this.A06 = new HEF(requireContext, this, userSession4, this, c31543DtT);
                        UserSession userSession5 = this.A00;
                        if (userSession5 != null) {
                            this.A08 = new C38E(this, userSession5, AbstractC37301Gc2.A0L(this));
                            this.A09 = AbstractC166997dE.A0n();
                            A01();
                            C0f9.A09(-628114669, A02);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1067271789);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        C0f9.A09(-1730772301, A02);
        return inflate;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1629672085);
        super.onResume();
        if (!C06P.A00(AbstractC31174DnI.A0I(this)) && this.A02 == null) {
            AbstractC25226BEj.A1Q(this);
        }
        AbstractC37305Gc6.A03(requireActivity(), this);
        C0f9.A09(215666976, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0N = AbstractC167017dG.A0N(absListView, -1088583778);
        this.A0A.onScroll(absListView, i, i2, i3);
        C0f9.A0A(539182330, A0N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, 1911596511);
        this.A0A.onScrollStateChanged(absListView, i);
        C0f9.A0A(-1864352988, A0N);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1165145818);
        super.onStart();
        A03(this);
        C0f9.A09(-1070616665, A02);
    }
}
