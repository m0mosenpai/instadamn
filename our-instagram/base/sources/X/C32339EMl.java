package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.model.business.ProfileAddressData;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.EMl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32339EMl extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ProfileMultipleAddressesBottomsheetFragment";
    public FL7 A00;
    public RecyclerView A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final C36168Fxi A04;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_multiple_addresses_bottomsheet";
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ?? r6;
        RandomAccess randomAccess;
        C05A c05a;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        C66392zG A00 = C66362zD.A00(requireContext);
        A00.A01(new EYU(this));
        A00.A03 = this.A04;
        C66362zD A002 = A00.A00();
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.multiple_addresses_bottomsheet_recycler_view);
        this.A01 = A0G;
        if (A0G != null) {
            A0G.setAdapter(A002);
            AbstractC31174DnI.A15(requireContext, A0G);
            A0G.A10(new E0C(this, 3));
        }
        InterfaceC09390do interfaceC09390do = this.A03;
        C05A c05a2 = ((C31811DyV) interfaceC09390do.getValue()).A02;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), AbstractC58232lf.A00(anonymousClass191, c05a2), new C57748Pjb(A002, 26), 69);
        C31811DyV c31811DyV = (C31811DyV) interfaceC09390do.getValue();
        User A02 = c31811DyV.A00.A02(c31811DyV.A01);
        if (A02 == null) {
            c05a = c31811DyV.A02;
            randomAccess = C16930sl.A00;
        } else {
            ArrayList A1E = AbstractC166987dD.A1E();
            String Ani = A02.A03.Ani();
            if (Ani != null && Ani.length() != 0) {
                A1E.add(new ProfileAddressData(A02.A03.BMH(), A02.A03.BPG(), "primary", A02.A03.AZq(), A02.A03.Anh(), A02.A03.Ani(), A02.A03.CIk(), A02.A03.BIO()));
            }
            List<InterfaceC37278GbV> AZk = A02.A03.AZk();
            if (AZk != null) {
                r6 = AbstractC167017dG.A0q(AZk);
                for (InterfaceC37278GbV interfaceC37278GbV : AZk) {
                    r6.add(new ProfileAddressData(interfaceC37278GbV.BMH(), interfaceC37278GbV.BPG(), interfaceC37278GbV.AZj(), interfaceC37278GbV.AZq(), interfaceC37278GbV.Anh(), interfaceC37278GbV.Ani(), interfaceC37278GbV.CIl(), interfaceC37278GbV.BIO()));
                }
            } else {
                r6 = C16930sl.A00;
            }
            A1E.addAll(r6);
            c05a = c31811DyV.A02;
            randomAccess = A1E;
        }
        c05a.Egh(randomAccess);
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(this.A02, 0);
        if (C3BQ.A00(A0k).booleanValue() && C18U.A06(C06090Tz.A05, A0k, 2342172050216927211L)) {
            C31811DyV c31811DyV2 = (C31811DyV) interfaceC09390do.getValue();
            String A0t = AbstractC25231BEo.A0t(c31811DyV2.A00.A02(c31811DyV2.A01));
            View A0S = AbstractC166997dE.A0S(view, R.id.links_promo_container_bottom);
            AbstractC23641Du.A05(anonymousClass191, new MVR(this, A0S, A0t, null, 19), AbstractC25235BEs.A0S(this));
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null || recyclerView.computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }

    public C32339EMl() {
        GSv gSv = new GSv(this, 21);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new GSv(new GSv(this, 18), 19));
        this.A03 = AbstractC25225BEi.A0a(new GSv(A00, 20), gSv, new C57257Pbf(6, null, A00), AbstractC25225BEi.A1D(C31811DyV.class));
        this.A02 = AbstractC60492pY.A02(this);
        this.A04 = new C36168Fxi(this);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1058640147);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_profile_multiple_addresses_bottomsheet_fragment, false);
        C0f9.A09(787820259, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(534700101);
        super.onDestroyView();
        this.A01 = null;
        C0f9.A09(-189302267, A02);
    }
}
