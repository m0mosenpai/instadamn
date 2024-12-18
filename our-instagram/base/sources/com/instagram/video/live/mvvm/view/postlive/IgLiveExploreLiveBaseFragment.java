package com.instagram.video.live.mvvm.view.postlive;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25651Mw;
import X.AbstractC31178DnM;
import X.AbstractC31180DnO;
import X.AbstractC43592JPx;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C51093Mhs;
import X.C51187MjV;
import X.C51E;
import X.C52834NZr;
import X.C52835NZs;
import X.C56011Oti;
import X.C66362zD;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC189488aT;
import X.InterfaceC58131Ppu;
import X.O67;
import X.OW8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.lifecycleannotations.LifecycleUtil;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;

/* loaded from: classes9.dex */
public abstract class IgLiveExploreLiveBaseFragment extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC189488aT, C51E {
    public O67 A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final boolean A02 = true;
    public RecyclerView recyclerView;

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.6f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return true;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        RecyclerView recyclerView = this.recyclerView;
        boolean z = false;
        if (recyclerView != null && recyclerView.canScrollVertically(1)) {
            z = true;
        }
        return !z;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.recyclerView;
        boolean z = false;
        if (recyclerView != null && AbstractC43592JPx.A1X(recyclerView)) {
            z = true;
        }
        return !z;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.6f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC58131Ppu interfaceC58131Ppu;
        int A02 = C0f9.A02(845230479);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_iglive_post_live, viewGroup, false);
        RecyclerView A08 = AbstractC31180DnO.A08(inflate);
        this.recyclerView = A08;
        FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext(), 2);
        int A06 = AbstractC167017dG.A06(requireContext());
        if (A08 != null) {
            A08.setLayoutManager(fastScrollingGridLayoutManager);
        }
        if (this instanceof C52835NZs) {
            interfaceC58131Ppu = ((C52835NZs) this).A01;
        } else {
            interfaceC58131Ppu = ((C52834NZr) this).A03;
        }
        if (interfaceC58131Ppu != null) {
            C66362zD BlI = interfaceC58131Ppu.BlI();
            if (A08 != null) {
                A08.setAdapter(BlI);
            }
            ((GridLayoutManager) fastScrollingGridLayoutManager).A01 = new C51093Mhs(interfaceC58131Ppu, 4);
            if (A08 != null) {
                A08.A10(new C51187MjV(interfaceC58131Ppu, A06, 1));
            }
        }
        C0f9.A09(241661152, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(79482366);
        super.onDestroy();
        O67 o67 = this.A00;
        if (o67 != null) {
            OW8 ow8 = o67.A00;
            AbstractC25651Mw.A00(ow8.A0G).A02(ow8.A0F, C56011Oti.class);
        }
        C0f9.A09(721433301, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(-1144914344);
        super.onDestroyView();
        LifecycleUtil.cleanupReferences(this);
        this.A00 = null;
        C0f9.A09(-100624689, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1217100203);
        super.onPause();
        C0f9.A09(-1290818822, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-1962124633);
        super.onResume();
        C0f9.A09(-848784005, A02);
    }
}
