package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.KBz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45485KBz extends AbstractC59962oe implements InterfaceC50489MQr {
    public static final String __redex_internal_original_name = "EffectGalleryCategoryPageFragment";
    public int A00;
    public int A01;
    public ViewGroup A03;
    public GridLayoutManager A04;
    public RecyclerView A05;
    public JoI A06;
    public Jo1 A07;
    public C44542Jmm A08;
    public C87T A09;
    public JoQ A0A;
    public boolean A0C;
    public C1I4 A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Integer A0B = C05F.A0N;
    public int A02 = 3;
    public final InterfaceC09390do A0H = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC50489MQr
    public final void DXQ() {
        String str;
        this.A0E = false;
        A02(this);
        C44542Jmm c44542Jmm = this.A08;
        if (c44542Jmm != null) {
            c44542Jmm.A03.A01("page_deselected");
            c44542Jmm.A08.clear();
        }
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            JoQ joQ = this.A0A;
            if (joQ == null) {
                str = "paginationScrollListener";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            recyclerView.A15(joQ);
        }
        RecyclerView recyclerView2 = this.A05;
        if (recyclerView2 != null) {
            C1I4 c1i4 = this.A0D;
            if (c1i4 == null) {
                str = "onScrollListener";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            recyclerView2.A15(c1i4);
        }
    }

    @Override // X.InterfaceC50489MQr
    public final void DXZ() {
        String str;
        this.A0E = true;
        A02(this);
        C44542Jmm c44542Jmm = this.A08;
        if (c44542Jmm != null) {
            HashSet hashSet = c44542Jmm.A05.A0H;
            String str2 = c44542Jmm.A07;
            if (!hashSet.contains(str2)) {
                hashSet.add(str2);
            }
        }
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            JoQ joQ = this.A0A;
            if (joQ == null) {
                str = "paginationScrollListener";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            recyclerView.A14(joQ);
        }
        RecyclerView recyclerView2 = this.A05;
        if (recyclerView2 != null) {
            C1I4 c1i4 = this.A0D;
            if (c1i4 == null) {
                str = "onScrollListener";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            recyclerView2.A14(c1i4);
        }
        A01(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_camera_mini_gallery_category_page";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C44542Jmm c44542Jmm;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = AbstractC31173DnH.A0F(view, R.id.saved_empty_state);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            view.setId(bundle2.getInt("category_index_key"));
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), this.A02);
        gridLayoutManager.A03 = true;
        JnN.A00(gridLayoutManager, this, 2);
        this.A04 = gridLayoutManager;
        JoQ joQ = new JoQ(gridLayoutManager, new C49676Lx7(this), 8);
        joQ.A00 = true;
        this.A0A = joQ;
        this.A06 = new JoI(this.A02, AbstractC167017dG.A06(requireContext()), this.A0C, AbstractC13620mo.A02(view.getContext()));
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.camera_effect_preview_video_recycler_view);
        A0G.setLayoutManager(this.A04);
        A0G.setAdapter(this.A07);
        JoI joI = this.A06;
        if (joI != null) {
            A0G.A10(joI);
            this.A05 = A0G;
            this.A0D = new C44220JgP(this, 0);
            this.A0F = true;
            if (this.A0G && (c44542Jmm = this.A08) != null) {
                c44542Jmm.A01();
            }
            if (this.A0E) {
                DXZ();
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A00(C45485KBz c45485KBz) {
        C44542Jmm c44542Jmm;
        Jo1 jo1;
        C87T c87t = c45485KBz.A09;
        if (c87t != null && (c44542Jmm = c45485KBz.A08) != null && (jo1 = c45485KBz.A07) != null) {
            int i = c45485KBz.A00;
            int i2 = c45485KBz.A01;
            ArrayList A1E = AbstractC166987dD.A1E();
            if (i >= 0) {
                List list = jo1.A06;
                if (i < list.size() && i2 >= 0 && i2 < list.size() && i <= i2) {
                    while (true) {
                        C46520KiJ c46520KiJ = ((LHy) list.get(i)).A00;
                        if (c46520KiJ != null) {
                            A1E.add(c46520KiJ);
                        }
                        if (i == i2) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            c87t.A0B(c44542Jmm.A07, A1E);
        }
    }

    public static final void A01(C45485KBz c45485KBz) {
        GridLayoutManager gridLayoutManager;
        Jo1 jo1;
        String A01;
        int A02;
        C87T c87t = c45485KBz.A09;
        if (c87t != null && (gridLayoutManager = c45485KBz.A04) != null && (jo1 = c45485KBz.A07) != null && (A01 = AbstractC189108Zb.A01((C85D) c87t.A04.A00.getValue())) != null && (A02 = jo1.A02(A01)) >= 0) {
            gridLayoutManager.A1p(A02, AbstractC167017dG.A06(c45485KBz.requireContext()));
        }
    }

    public static final void A02(C45485KBz c45485KBz) {
        RecyclerView recyclerView;
        Jo1 jo1;
        C87T c87t = c45485KBz.A09;
        if (c87t != null && (recyclerView = c45485KBz.A05) != null && (jo1 = c45485KBz.A07) != null) {
            int A0H = AbstractC166987dD.A0H(c87t.A0N.getValue());
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int i = A0H - 219;
            int i2 = jo1.A02;
            int i3 = jo1.A03;
            int i4 = i2 + i3;
            int i5 = computeVerticalScrollOffset / i4;
            int i6 = i2 - (computeVerticalScrollOffset % i4);
            float f = i2;
            int i7 = i5 + 1;
            if (i6 / f > 0.5d) {
                i7 = i5;
            }
            int i8 = ((i - i6) - i3) / i4;
            boolean A1O = AbstractC167007dF.A1O((((r14 % i4) / f) > 0.5d ? 1 : (((r14 % i4) / f) == 0.5d ? 0 : -1)));
            if (i6 > 0) {
                i5 = i7;
            }
            int i9 = i5 + i8;
            if (!A1O) {
                i9--;
            }
            int i10 = jo1.A04;
            int i11 = i7 * i10;
            int i12 = ((i9 * i10) + i10) - 1;
            int A03 = AbstractC31172DnG.A03(jo1.A06, 1);
            if (i12 > A03) {
                i12 = A03;
            }
            int i13 = new int[]{i11, i12}[0];
            if (i13 < 0) {
                i13 = 0;
            }
            c45485KBz.A00 = i13;
            if (i12 < 0) {
                i12 = 0;
            }
            c45485KBz.A01 = i12;
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0H);
    }

    @Override // X.InterfaceC50489MQr
    public final boolean isScrolledToBottom() {
        RecyclerView recyclerView = this.A05;
        boolean z = true;
        if (recyclerView != null) {
            z = recyclerView.canScrollVertically(1);
        }
        return !z;
    }

    @Override // X.InterfaceC50489MQr
    public final boolean isScrolledToTop() {
        boolean z;
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            z = AbstractC43592JPx.A1X(recyclerView);
        } else {
            z = true;
        }
        return !z;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        C44542Jmm c44542Jmm;
        super.onSetUserVisibleHint(this.A0G, z2);
        this.A0G = z;
        if (isVisible() && this.A0F && (c44542Jmm = this.A08) != null) {
            c44542Jmm.A01();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1670327476);
        super.onCreate(bundle);
        requireArguments();
        this.A0B = C05F.A0Y;
        this.A02 = 3;
        setModuleNameV2("ig_camera_mini_gallery_category_page");
        C0f9.A09(-983293024, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (X.C14360o3.A0K(r6.A07, "SAVED") == false) goto L16;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45485KBz.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
