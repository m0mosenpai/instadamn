package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.user.model.User;

/* renamed from: X.V1g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67898V1g extends AbstractC60672pq implements InterfaceC60442pS, XEO, XLU, InterfaceC60122ou, InterfaceC71958XCk, XLQ, XLR, XLT {
    public static final String __redex_internal_original_name = "EditSearchHistoryFragment";
    public C67922V2m A00;
    public InterfaceC190488c6 A01;
    public U0K A02;
    public C66151U1s A03;
    public C43812JYz A04;
    public C66152U1t A05;
    public C70728Wfu A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0B = AbstractC09440dt.A01(new X2z(this, 23));

    @Override // X.InterfaceC71958XCk
    public final void D3E() {
        int i;
        int i2;
        U0K u0k = this.A02;
        String str = "searchTabType";
        if (u0k != null) {
            int ordinal = u0k.ordinal();
            if (ordinal != 1) {
                if (ordinal != 4) {
                    i = 2131955200;
                    i2 = 2131955199;
                } else {
                    C43812JYz c43812JYz = this.A04;
                    if (c43812JYz == null) {
                        str = "trackPreviewController";
                    } else {
                        c43812JYz.A00();
                        C67922V2m c67922V2m = this.A00;
                        if (c67922V2m == null) {
                            str = "editSearchHistoryAdapter";
                        } else {
                            c67922V2m.A00();
                            i = 2131955190;
                            i2 = 2131955189;
                        }
                    }
                }
            } else {
                i = 2131955187;
                i2 = 2131955186;
            }
            Context requireContext = requireContext();
            UserSession userSession = (UserSession) this.A0C.getValue();
            U0K u0k2 = this.A02;
            if (u0k2 != null) {
                C14360o3.A0B(userSession, 1);
                C193328hC c193328hC = new C193328hC(requireContext);
                c193328hC.A0A(i);
                c193328hC.A09(i2);
                c193328hC.A0J(new DialogInterfaceOnClickListenerC70207WHl(4, requireContext, this, userSession, u0k2), 2131955188);
                AbstractC31176DnK.A16(null, c193328hC, 2131968687);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.XLU
    public final void D3d(Reel reel, C3Ow c3Ow, Tx0 tx0, C65741TtG c65741TtG, boolean z) {
    }

    @Override // X.XLU
    public final void DFE(Tx0 tx0, C65741TtG c65741TtG) {
    }

    @Override // X.XLR
    public final void DOO(C66130U0o c66130U0o, Tx0 tx0) {
        Integer num;
        int i = tx0.A00;
        Keyword keyword = c66130U0o.A01;
        C14360o3.A0B(keyword, 0);
        if (keyword.A0A && !tx0.A0F) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        A02(c66130U0o, num, i);
        if (C14360o3.A0K(c66130U0o.A01.A07, "meta_ai_suggestion") && !this.A09) {
            C66151U1s c66151U1s = this.A03;
            if (c66151U1s != null) {
                c66151U1s.A05(null, AbstractC111324zv.A00(852), "", c66130U0o.A01.A04, null);
                AbstractC66132U0y.A00((UserSession) this.A0C.getValue()).A00(c66130U0o.A01);
                return;
            }
            C14360o3.A0F("searchNavigationController");
            throw C00O.createAndThrow();
        }
        C66151U1s c66151U1s2 = this.A03;
        if (c66151U1s2 != null) {
            c66151U1s2.A0B(c66130U0o.A01.A04, null, getModuleName(), null, null, "0", null, AbstractC111324zv.A00(2505), 0, true);
            AbstractC66132U0y.A00((UserSession) this.A0C.getValue()).A00(c66130U0o.A01);
            return;
        }
        C14360o3.A0F("searchNavigationController");
        throw C00O.createAndThrow();
    }

    @Override // X.XLU
    public final void DWI() {
    }

    @Override // X.InterfaceC71958XCk
    public final void Djl(Integer num) {
    }

    @Override // X.XLU
    public final void Dxr(InterfaceC11380iw interfaceC11380iw, Tx0 tx0, C65741TtG c65741TtG) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(2131963158));
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C67922V2m c67922V2m = this.A00;
        if (c67922V2m != null) {
            setAdapter(c67922V2m);
            C67922V2m c67922V2m2 = this.A00;
            if (c67922V2m2 != null) {
                c67922V2m2.A00();
                return;
            }
        }
        C14360o3.A0F("editSearchHistoryAdapter");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[LOOP:0: B:20:0x0059->B:22:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C65956Tx8 A00(X.C67898V1g r7) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67898V1g.A00(X.V1g):X.Tx8");
    }

    private final void A01(AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
        InterfaceC190488c6 interfaceC190488c6 = this.A01;
        if (interfaceC190488c6 == null) {
            C14360o3.A0F("searchLogger");
            throw C00O.createAndThrow();
        }
        interfaceC190488c6.Clb("", abstractC65924TwV.A01(), abstractC65924TwV.A02(), abstractC65924TwV.A04(), tx0.A08, tx0.A00);
    }

    @Override // X.XEO
    public final Integer CAI(JIN jin) {
        C43812JYz c43812JYz = this.A04;
        if (c43812JYz == null) {
            C14360o3.A0F("trackPreviewController");
            throw C00O.createAndThrow();
        }
        return c43812JYz.A02.CAJ(jin.BVb());
    }

    @Override // X.XEO
    public final void Cy9(HYY hyy, Tx0 tx0) {
        String str;
        A02(hyy, C05F.A0C, tx0.A00);
        C43812JYz c43812JYz = this.A04;
        if (c43812JYz == null) {
            str = "trackPreviewController";
        } else {
            c43812JYz.A00();
            C66151U1s c66151U1s = this.A03;
            if (c66151U1s == null) {
                str = "searchNavigationController";
            } else {
                JIN A06 = hyy.A06();
                if (A06 != null) {
                    c66151U1s.A03(C8JW.A0W, A06);
                    U2R A00 = U1X.A00((UserSession) this.A0C.getValue());
                    JIN A062 = hyy.A06();
                    if (A062 != null) {
                        A00.A00(A062);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.XEO
    public final void CyA(HYY hyy, Tx0 tx0) {
        String str;
        C43812JYz c43812JYz = this.A04;
        if (c43812JYz == null) {
            str = "trackPreviewController";
        } else {
            c43812JYz.A00();
            A01(hyy, tx0);
            C66152U1t c66152U1t = this.A05;
            if (c66152U1t == null) {
                str = "hideSearchEntryController";
            } else {
                JIN A06 = hyy.A06();
                if (A06 != null) {
                    c66152U1t.A04(A06, tx0);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.XEO
    public final void D1M(MusicAttributionConfig musicAttributionConfig) {
        C66151U1s c66151U1s = this.A03;
        if (c66151U1s == null) {
            C14360o3.A0F("searchNavigationController");
            throw C00O.createAndThrow();
        }
        c66151U1s.A09(musicAttributionConfig);
    }

    @Override // X.XLQ
    public final void DK6(C68090V9z c68090V9z, Tx0 tx0) {
        A02(c68090V9z, C05F.A0C, tx0.A00);
        C66151U1s c66151U1s = this.A03;
        if (c66151U1s == null) {
            C14360o3.A0F("searchNavigationController");
            throw C00O.createAndThrow();
        }
        c66151U1s.A07(c68090V9z.A00, "", "", tx0.A00);
        AbstractC66131U0x.A00((UserSession) this.A0C.getValue()).A00(c68090V9z.A00);
    }

    @Override // X.XLT
    public final void DYm(HYX hyx, Tx0 tx0) {
        A02(hyx, C05F.A0C, tx0.A00);
        C66151U1s c66151U1s = this.A03;
        if (c66151U1s == null) {
            C14360o3.A0F("searchNavigationController");
            throw C00O.createAndThrow();
        }
        c66151U1s.A08(hyx.A00, "", "", tx0.A00);
        U0z A00 = U0w.A00((UserSession) this.A0C.getValue());
        C69794Vvd c69794Vvd = hyx.A00;
        C14360o3.A0B(c69794Vvd, 0);
        A00.A00.A04(c69794Vvd);
    }

    @Override // X.XEO
    public final void DYu(JIN jin, C69449VnY c69449VnY) {
        C43812JYz c43812JYz = this.A04;
        if (c43812JYz == null) {
            C14360o3.A0F("trackPreviewController");
            throw C00O.createAndThrow();
        }
        c43812JYz.A01(jin, c69449VnY.A03);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("moduleName");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0C.getValue();
    }

    @Override // X.XEO
    public final void onStopButtonClicked() {
        C43812JYz c43812JYz = this.A04;
        if (c43812JYz == null) {
            C14360o3.A0F("trackPreviewController");
            throw C00O.createAndThrow();
        }
        c43812JYz.A00();
    }

    private final void A02(AbstractC65924TwV abstractC65924TwV, Integer num, int i) {
        Integer num2;
        String str;
        C70108W4f A00 = VWT.A00(abstractC65924TwV);
        A00.A01 = "recent";
        A00.A07 = "null_state_recent";
        C66166U2h A01 = A00.A01();
        InterfaceC190488c6 interfaceC190488c6 = this.A01;
        if (interfaceC190488c6 == null) {
            str = "searchLogger";
        } else {
            U0K u0k = this.A02;
            if (u0k == null) {
                str = "searchTabType";
            } else {
                int ordinal = u0k.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                num2 = C05F.A08;
                            } else {
                                num2 = C05F.A0u;
                            }
                        } else {
                            num2 = C05F.A0C;
                        }
                    } else {
                        num2 = C05F.A0N;
                    }
                } else {
                    num2 = C05F.A01;
                }
                interfaceC190488c6.ClZ(A01, num2, num, "", "", i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.XBC
    public final void DAv(InterfaceC11380iw interfaceC11380iw, AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
        boolean A1a = AbstractC167017dG.A1a(abstractC65924TwV, tx0);
        A01(abstractC65924TwV, tx0);
        int i = abstractC65924TwV.A01;
        if (i != 0) {
            if (i != A1a) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 7) {
                            C66152U1t c66152U1t = this.A05;
                            if (c66152U1t != null) {
                                JIN A06 = ((HYY) abstractC65924TwV).A06();
                                if (A06 != null) {
                                    c66152U1t.A04(A06, tx0);
                                    return;
                                }
                                throw AbstractC166997dE.A0g();
                            }
                        } else {
                            throw new IllegalStateException("Invalid entry type");
                        }
                    } else {
                        C66152U1t c66152U1t2 = this.A05;
                        if (c66152U1t2 != null) {
                            Keyword keyword = ((C66130U0o) abstractC65924TwV).A01;
                            if (this.A02 != null) {
                                c66152U1t2.A02(keyword, tx0);
                                return;
                            }
                            C14360o3.A0F("searchTabType");
                        }
                    }
                } else {
                    C66152U1t c66152U1t3 = this.A05;
                    if (c66152U1t3 != null) {
                        c66152U1t3.A03(((HYX) abstractC65924TwV).A00, tx0, null);
                        return;
                    }
                }
            } else {
                C66152U1t c66152U1t4 = this.A05;
                if (c66152U1t4 != null) {
                    c66152U1t4.A01(((C68090V9z) abstractC65924TwV).A00, tx0, null);
                    return;
                }
            }
            C14360o3.A0F("hideSearchEntryController");
        } else {
            C66152U1t c66152U1t5 = this.A05;
            if (c66152U1t5 != null) {
                User A062 = ((C65741TtG) abstractC65924TwV).A06();
                U0K u0k = this.A02;
                if (u0k != null) {
                    c66152U1t5.A00(interfaceC11380iw, tx0, u0k, A062);
                    return;
                }
                C14360o3.A0F("searchTabType");
            }
            C14360o3.A0F("hideSearchEntryController");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.XLU
    public final void Dxi(InterfaceC11380iw interfaceC11380iw, Tx0 tx0, C65741TtG c65741TtG) {
        AbstractC167017dG.A1N(c65741TtG, tx0);
        A02(c65741TtG, C05F.A0C, tx0.A00);
        C66151U1s c66151U1s = this.A03;
        if (c66151U1s == null) {
            C14360o3.A0F("searchNavigationController");
            throw C00O.createAndThrow();
        }
        c66151U1s.A0A(c65741TtG.A06(), "", "", tx0.A00);
        AbstractC65792TuA.A00((UserSession) this.A0C.getValue()).A01(c65741TtG.A06());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0093, code lost:
    
        if (X.C18U.A06(r7, r9, 36318041591584614L) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0073, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC25230BEn.A0k(r4, 0), 36318041591519077L) == false) goto L8;
     */
    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67898V1g.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1131605784);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_search_history_rv, false);
        C0f9.A09(1055762646, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-304653481);
        super.onPause();
        C43812JYz c43812JYz = this.A04;
        if (c43812JYz == null) {
            C14360o3.A0F("trackPreviewController");
            throw C00O.createAndThrow();
        }
        c43812JYz.A00();
        C0f9.A09(814097651, A02);
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManagerCompat(AbstractC31176DnK.A05(this, recyclerView)));
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2099263164);
        super.onResume();
        C67922V2m c67922V2m = this.A00;
        if (c67922V2m == null) {
            C14360o3.A0F("editSearchHistoryAdapter");
            throw C00O.createAndThrow();
        }
        c67922V2m.A00 = A00(this);
        c67922V2m.A00();
        C0f9.A09(450553061, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1280138467);
        super.onStart();
        C66152U1t c66152U1t = this.A05;
        if (c66152U1t != null) {
            C70728Wfu c70728Wfu = this.A06;
            if (c70728Wfu != null) {
                c66152U1t.A08.add(c70728Wfu);
                C66152U1t c66152U1t2 = this.A05;
                if (c66152U1t2 != null) {
                    C70728Wfu c70728Wfu2 = this.A06;
                    if (c70728Wfu2 != null) {
                        c66152U1t2.A04.add(c70728Wfu2);
                        C66152U1t c66152U1t3 = this.A05;
                        if (c66152U1t3 != null) {
                            C70728Wfu c70728Wfu3 = this.A06;
                            if (c70728Wfu3 != null) {
                                c66152U1t3.A07.add(c70728Wfu3);
                                C66152U1t c66152U1t4 = this.A05;
                                if (c66152U1t4 != null) {
                                    C70728Wfu c70728Wfu4 = this.A06;
                                    if (c70728Wfu4 != null) {
                                        c66152U1t4.A05.add(c70728Wfu4);
                                        C66152U1t c66152U1t5 = this.A05;
                                        if (c66152U1t5 != null) {
                                            C70728Wfu c70728Wfu5 = this.A06;
                                            if (c70728Wfu5 != null) {
                                                c66152U1t5.A03.add(c70728Wfu5);
                                                C25671My A0Q = AbstractC31176DnK.A0Q(this.A0C);
                                                C70728Wfu c70728Wfu6 = this.A06;
                                                if (c70728Wfu6 != null) {
                                                    A0Q.A01(c70728Wfu6, C70710WfZ.class);
                                                    C0f9.A09(-918332858, A02);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("recentsUpdatedListener");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("hideSearchEntryController");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        int A02 = C0f9.A02(-1744349652);
        super.onStop();
        C43812JYz c43812JYz = this.A04;
        if (c43812JYz == null) {
            str = "trackPreviewController";
        } else {
            c43812JYz.A00();
            C66152U1t c66152U1t = this.A05;
            if (c66152U1t != null) {
                C70728Wfu c70728Wfu = this.A06;
                str = "recentsUpdatedListener";
                if (c70728Wfu != null) {
                    c66152U1t.A08.remove(c70728Wfu);
                    C66152U1t c66152U1t2 = this.A05;
                    if (c66152U1t2 != null) {
                        C70728Wfu c70728Wfu2 = this.A06;
                        if (c70728Wfu2 != null) {
                            c66152U1t2.A04.remove(c70728Wfu2);
                            C66152U1t c66152U1t3 = this.A05;
                            if (c66152U1t3 != null) {
                                C70728Wfu c70728Wfu3 = this.A06;
                                if (c70728Wfu3 != null) {
                                    c66152U1t3.A07.remove(c70728Wfu3);
                                    C66152U1t c66152U1t4 = this.A05;
                                    if (c66152U1t4 != null) {
                                        C70728Wfu c70728Wfu4 = this.A06;
                                        if (c70728Wfu4 != null) {
                                            c66152U1t4.A05.remove(c70728Wfu4);
                                            C66152U1t c66152U1t5 = this.A05;
                                            if (c66152U1t5 != null) {
                                                C70728Wfu c70728Wfu5 = this.A06;
                                                if (c70728Wfu5 != null) {
                                                    c66152U1t5.A03.remove(c70728Wfu5);
                                                    C25671My A0Q = AbstractC31176DnK.A0Q(this.A0C);
                                                    C70728Wfu c70728Wfu6 = this.A06;
                                                    if (c70728Wfu6 != null) {
                                                        A0Q.A02(c70728Wfu6, C70710WfZ.class);
                                                        C0f9.A09(-626385478, A02);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("hideSearchEntryController");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
