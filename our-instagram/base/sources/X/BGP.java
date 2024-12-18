package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

/* loaded from: classes5.dex */
public abstract class BGP {
    public static final void A00(LazyListState lazyListState, C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ) {
        A01(lazyListState, c5Tl, interfaceC16820sZ, 0, 0, 1);
    }

    public static final void A01(LazyListState lazyListState, C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        AbstractC167017dG.A1O(lazyListState, interfaceC16820sZ);
        c5Tl.Enr(-1768530169);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, lazyListState) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i4 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                i5 = 5;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1284798676, "com.instagram.compose.ui.loading.AutoLoadMore (AutoLoadMore.kt:37)");
            }
            if (i5 >= 0) {
                InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, interfaceC16820sZ);
                Integer valueOf = Integer.valueOf(i5);
                boolean A1V = AbstractC25228BEl.A1V(c5Tl, A00, AbstractC25228BEl.A1T(i4), AbstractC25233BEq.A1O(c5Tl, -869089739, i4));
                Object EEc = c5Tl.EEc();
                if (A1V || EEc == C5UI.A00) {
                    EEc = new C50530MSj(lazyListState, A00, null, i5, 3);
                    c5Tl.FBy(EEc);
                }
                AbstractC25231BEo.A11(c5Tl, EEc, valueOf);
                if (C0fH.A02()) {
                    C0fH.A00(-1891421840);
                }
            } else {
                throw AbstractC166987dD.A12("loadMoreThreshold must be positive");
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTU(lazyListState, interfaceC16820sZ, i5, i2, i3, 1);
        }
    }

    public static final void A03(LazyGridState lazyGridState, C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        int A06 = AbstractC167007dF.A06(0, lazyGridState, interfaceC16820sZ);
        c5Tl.Enr(408448863);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, lazyGridState) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i4 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                i5 = 5;
            }
            if (C0fH.A02()) {
                C0fH.A01(-25488611, "com.instagram.compose.ui.loading.AutoLoadMore (AutoLoadMore.kt:72)");
            }
            if (i5 >= 0) {
                InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, interfaceC16820sZ);
                Integer valueOf = Integer.valueOf(i5);
                boolean A1V = AbstractC25228BEl.A1V(c5Tl, A00, AbstractC25228BEl.A1T(i4), AbstractC25233BEq.A1O(c5Tl, -869053003, i4));
                Object EEc = c5Tl.EEc();
                if (A1V || EEc == C5UI.A00) {
                    EEc = new C50530MSj(lazyGridState, A00, null, i5, 4);
                    c5Tl.FBy(EEc);
                }
                AbstractC25231BEo.A10(c5Tl, EEc, valueOf);
                if (C0fH.A02()) {
                    C0fH.A00(387924209);
                }
            } else {
                throw AbstractC166987dD.A12("loadMoreThreshold must be positive");
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTU(lazyGridState, interfaceC16820sZ, i5, i2, i3, A06);
        }
    }

    public static final void A04(LazyStaggeredGridState lazyStaggeredGridState, C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        int i4;
        boolean z;
        int i5 = i;
        AbstractC167017dG.A1O(lazyStaggeredGridState, interfaceC16820sZ);
        c5Tl.Enr(1685274999);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, lazyStaggeredGridState, i2) ? 1 : 0) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i4 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                i5 = 5;
            }
            if (C0fH.A02()) {
                C0fH.A01(-51873411, "com.instagram.compose.ui.loading.AutoLoadMore (AutoLoadMore.kt:93)");
            }
            if (i5 >= 0) {
                InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, interfaceC16820sZ);
                Integer valueOf = Integer.valueOf(i5);
                c5Tl.Eno(-869026859);
                if ((i4 & 14) == 4 || ((i4 & 8) != 0 && c5Tl.AH6(lazyStaggeredGridState))) {
                    z = true;
                } else {
                    z = false;
                }
                boolean A1V = AbstractC25228BEl.A1V(c5Tl, A00, AbstractC25228BEl.A1T(i4), z);
                Object EEc = c5Tl.EEc();
                if (A1V || EEc == C5UI.A00) {
                    EEc = new C50530MSj(lazyStaggeredGridState, A00, null, i5, 5);
                    c5Tl.FBy(EEc);
                }
                AbstractC25231BEo.A11(c5Tl, EEc, valueOf);
                if (C0fH.A02()) {
                    C0fH.A00(972357662);
                }
            } else {
                throw AbstractC166987dD.A12("loadMoreThreshold must be positive");
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTU(lazyStaggeredGridState, interfaceC16820sZ, i5, i2, i3, 3);
        }
    }

    public static final void A02(LazyListState lazyListState, C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        AbstractC167027dH.A12(lazyListState, interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(124121991);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, lazyListState) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(511858399, "com.instagram.compose.ui.loading.AutoLoadMorePrevious (AutoLoadMore.kt:58)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -935238070);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25229BEm.A0Q(c5Tl, C29899DGn.A00(interfaceC16820sZ, lazyListState, 27));
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            if (AbstractC25231BEo.A1U((InterfaceC74963Ym) A0q)) {
                C0eB c0eB = C0eB.A00;
                boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, -935232202, i2);
                Object EEc = c5Tl.EEc();
                if (A1Q || EEc == obj) {
                    EEc = new PYX(interfaceC16820sZ2, null, 5);
                    c5Tl.FBy(EEc);
                }
                C117505Tk.A0I(A0J);
                C5UX.A04(c5Tl, c0eB, (InterfaceC16620sF) EEc);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1821454393);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(lazyListState, interfaceC16820sZ, interfaceC16820sZ2, i, 20);
        }
    }
}
