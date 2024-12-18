package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ETk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32509ETk extends C1P1 {
    public final /* synthetic */ EOI A00;

    public C32509ETk(EOI eoi) {
        this.A00 = eoi;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -2060826200);
        super.onFail(abstractC115105If);
        EOI eoi = this.A00;
        C32122E9v c32122E9v = eoi.A07;
        if (c32122E9v != null) {
            c32122E9v.A0E("fetch_request_fail");
            C32122E9v c32122E9v2 = eoi.A07;
            if (c32122E9v2 != null) {
                ((MTJ) c32122E9v2).A00.A01();
                eoi.updateUi(MXS.A02, C16930sl.A00);
                EOI.A07(eoi);
                EOI.A06(eoi);
                EOI.A08(eoi);
                C0f9.A0A(-1525074910, A0N);
                return;
            }
        }
        C14360o3.A0F("perfLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.C1P1
    public final void onStart() {
        String str;
        int A03 = C0f9.A03(1390665435);
        super.onStart();
        EOI eoi = this.A00;
        if (eoi.A0E) {
            ArrayList A1E = AbstractC166987dD.A1E();
            int i = 1;
            do {
                A1E.add(new E8W());
                i++;
            } while (i < 11);
            eoi.A0B(A1E);
            ShimmerFrameLayout shimmerFrameLayout = eoi.A03;
            if (shimmerFrameLayout == null) {
                str = "searchBarContainer";
            } else {
                shimmerFrameLayout.A02();
                ViewGroup viewGroup = eoi.A00;
                if (viewGroup == null) {
                    str = "searchBar";
                } else {
                    AbstractC31173DnH.A0z(eoi.requireContext(), viewGroup, R.drawable.searchbar_background_placeholder);
                    ShimmerFrameLayout shimmerFrameLayout2 = eoi.A02;
                    if (shimmerFrameLayout2 == null) {
                        str = "progressContainer";
                    } else {
                        shimmerFrameLayout2.A02();
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        eoi.updateUi(MXS.A04, C16930sl.A00);
        C0f9.A0A(-1972129247, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        E7f e7f;
        C32049E6b c32049E6b;
        List list;
        C45146Jym c45146Jym;
        List list2;
        int A03 = C0f9.A03(-940404409);
        C32151EAy c32151EAy = (C32151EAy) obj;
        int A032 = C0f9.A03(-2139913836);
        C14360o3.A0B(c32151EAy, 0);
        super.onSuccess(c32151EAy);
        EOI eoi = this.A00;
        EOI.A07(eoi);
        EOI.A06(eoi);
        C32122E9v c32122E9v = eoi.A07;
        if (c32122E9v != null) {
            c32122E9v.A0E(MSV.A00(1204));
            C32122E9v c32122E9v2 = eoi.A07;
            if (c32122E9v2 != null) {
                c32122E9v2.A0E("fetch_request_end");
                E67 F7f = c32151EAy.F7f();
                C1DS.A00(AbstractC166987dD.A0r(eoi.A0R));
                List list3 = F7f.A00;
                if (list3 != null && (e7f = (E7f) list3.get(0)) != null && (c32049E6b = e7f.A00) != null && (list = c32049E6b.A01) != null && (c45146Jym = (C45146Jym) list.get(0)) != null && (list2 = c45146Jym.A00) != null) {
                    EOI.A09(eoi, list2);
                    C32122E9v c32122E9v3 = eoi.A07;
                    if (c32122E9v3 != null) {
                        c32122E9v3.A0E(MSV.A00(1681));
                        EOI.A03(eoi);
                        C32122E9v c32122E9v4 = eoi.A07;
                        if (c32122E9v4 != null) {
                            c32122E9v4.A0E(MSV.A00(1680));
                            C32122E9v c32122E9v5 = eoi.A07;
                            if (c32122E9v5 != null) {
                                ((MTJ) c32122E9v5).A00.A05();
                                ProgressButton progressButton = eoi.A0A;
                                if (progressButton != null) {
                                    progressButton.setEnabled(EOI.A0A(eoi));
                                }
                                EOI.A08(eoi);
                            }
                        }
                    }
                }
                C0f9.A0A(-163017619, A032);
                C0f9.A0A(-1096422341, A03);
                return;
            }
        }
        C14360o3.A0F("perfLogger");
        throw C00O.createAndThrow();
    }
}
