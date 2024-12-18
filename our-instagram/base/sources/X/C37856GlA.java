package X;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GlA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37856GlA implements InterfaceC62852tO {
    public final int A00;
    public final Object A01;

    public C37856GlA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC62852tO
    public final void D5C(C120985dq c120985dq, Integer num, int i) {
        if (this.A00 == 0) {
            C14360o3.A0B(c120985dq, 0);
            C38085GpE c38085GpE = (C38085GpE) this.A01;
            C130535uy c130535uy = c38085GpE.A00;
            if (c130535uy != null && c120985dq.A01 == EnumC129395t1.A0G && !AbstractC37655Gho.A04(c120985dq)) {
                c38085GpE.A01 = true;
                c130535uy.A00 = Math.max(c130535uy.A03(c38085GpE.A04).indexOf(c120985dq), 0);
                if (num != null) {
                    c130535uy.A01 = num.intValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    @Override // X.InterfaceC62852tO
    public final void D5D(InterfaceC111084zP interfaceC111084zP, List list, boolean z, boolean z2) {
        ?? A1G;
        AbstractC153666vb abstractC153666vb;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(list, 0);
                C38085GpE c38085GpE = (C38085GpE) this.A01;
                C130535uy c130535uy = c38085GpE.A00;
                if (c130535uy != null) {
                    if (z && list.isEmpty()) {
                        return;
                    }
                    c38085GpE.A01 = true;
                    if (z) {
                        c130535uy.A02().clear();
                    }
                    c130535uy.A04(list);
                    if (interfaceC111084zP != null) {
                        c130535uy.A03 = interfaceC111084zP;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                EffectsPageFragment effectsPageFragment = (EffectsPageFragment) this.A01;
                if (effectsPageFragment.A03 != null) {
                    ShimmerFrameLayout shimmerFrameLayout = effectsPageFragment.mClipsGridShimmerContainer;
                    if (shimmerFrameLayout != null) {
                        shimmerFrameLayout.A05();
                    }
                    boolean z3 = false;
                    if (z) {
                        effectsPageFragment.A0E.A03();
                        boolean isEmpty = list.isEmpty();
                        C154846xZ c154846xZ = effectsPageFragment.A05;
                        if (isEmpty) {
                            ((MTJ) c154846xZ).A00.A07("empty_page");
                            effectsPageFragment.mReelsEmptyMessageView.setText(2131961695);
                            effectsPageFragment.mReelsEmptyMessageView.setVisibility(0);
                        } else {
                            c154846xZ.A00 = Integer.valueOf(list.size());
                            ((MTJ) effectsPageFragment.A05).A00.A05();
                        }
                    }
                    UserSession userSession = effectsPageFragment.A07;
                    if (effectsPageFragment.A03 == null) {
                        A1G = Collections.emptyMap();
                    } else {
                        A1G = AbstractC166987dD.A1G();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C120985dq A0A = AbstractC37300Gc1.A0A(it);
                            C38321qM c38321qM = A0A.A02;
                            if (c38321qM != null && c38321qM.A2E(effectsPageFragment.A07) != null && A0A.A02.A2E(effectsPageFragment.A07).getId().equals(effectsPageFragment.A03.A09)) {
                                A1G.put(A0A.A0D(), AbstractC37301Gc2.A0C(2131969272));
                            }
                        }
                    }
                    ArrayList A00 = AbstractC37873GlS.A00(userSession, effectsPageFragment.A0E.A0L, null, list, A1G);
                    C153766vl c153766vl = effectsPageFragment.A0E;
                    if (interfaceC111084zP != null) {
                        z3 = interfaceC111084zP.BUt();
                    }
                    c153766vl.A05(A00, z3);
                    if (z) {
                        effectsPageFragment.A0E.A0I.notifyDataSetChanged();
                    }
                    abstractC153666vb = effectsPageFragment.A06;
                    break;
                } else {
                    return;
                }
            default:
                C14360o3.A0B(list, 0);
                HCZ hcz = (HCZ) this.A01;
                ShimmerFrameLayout shimmerFrameLayout2 = hcz.A01;
                if (shimmerFrameLayout2 != null) {
                    shimmerFrameLayout2.A05();
                }
                String str = "clipsGridAdapter";
                if (z) {
                    C153766vl c153766vl2 = hcz.A04;
                    if (c153766vl2 != null) {
                        c153766vl2.A03();
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                UserSession A0r = AbstractC166987dD.A0r(hcz.A0E);
                Map emptyMap = Collections.emptyMap();
                C14360o3.A07(emptyMap);
                C153766vl c153766vl3 = hcz.A04;
                if (c153766vl3 != null) {
                    ArrayList A002 = AbstractC37873GlS.A00(A0r, c153766vl3.A0L, null, list, emptyMap);
                    C153766vl c153766vl4 = hcz.A04;
                    if (c153766vl4 != null) {
                        boolean z4 = true;
                        if (interfaceC111084zP == null || !interfaceC111084zP.BUt()) {
                            z4 = false;
                        }
                        c153766vl4.A05(A002, z4);
                        abstractC153666vb = hcz.A05;
                        if (abstractC153666vb == null) {
                            str = "clipsSavedTabFetcher";
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
        abstractC153666vb.A02(interfaceC111084zP);
    }

    @Override // X.InterfaceC62852tO
    public final void D5I(InterfaceC111084zP interfaceC111084zP, List list, boolean z, boolean z2) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(list, 0);
                C38085GpE c38085GpE = (C38085GpE) this.A01;
                C130535uy c130535uy = c38085GpE.A00;
                if (c130535uy == null) {
                    return;
                }
                int i = 0;
                List A03 = c130535uy.A03(c38085GpE.A04);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C120985dq c120985dq = (C120985dq) it.next();
                    EnumC129395t1 enumC129395t1 = c120985dq.A01;
                    if (enumC129395t1 == EnumC129395t1.A02 || enumC129395t1 == EnumC129395t1.A03 || enumC129395t1 == EnumC129395t1.A0A) {
                        if (!A03.contains(c120985dq)) {
                            i++;
                        }
                    }
                }
                if (i <= 0 && !z2) {
                    return;
                }
                c130535uy.A02().clear();
                c130535uy.A04(list);
                return;
            case 1:
                return;
            default:
                C14360o3.A0B(list, 0);
                HCZ hcz = (HCZ) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(hcz.A0E);
                Map emptyMap = Collections.emptyMap();
                C14360o3.A07(emptyMap);
                C153766vl c153766vl = hcz.A04;
                if (c153766vl != null) {
                    ArrayList A00 = AbstractC37873GlS.A00(A0r, c153766vl.A0L, null, list, emptyMap);
                    C153766vl c153766vl2 = hcz.A04;
                    if (c153766vl2 != null) {
                        boolean z3 = true;
                        if (interfaceC111084zP == null || !interfaceC111084zP.BUt()) {
                            z3 = false;
                        }
                        c153766vl2.A06(A00, z3);
                        return;
                    }
                }
                C14360o3.A0F("clipsGridAdapter");
                throw C00O.createAndThrow();
        }
    }
}
