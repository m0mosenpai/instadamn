package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.EMk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32338EMk extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ClipsPreloadedSettingsBottomSheetFragment";
    public ABY A00;
    public C31891Dzx A01;
    public List A02;
    public RecyclerView A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

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
        return "clips_preloading_audio_effect_bottom_sheet_fragment";
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
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        List list = this.A02;
        if (list == null) {
            str = "preloadedSettingItems";
        } else {
            this.A01 = new C31891Dzx(requireContext, this, list);
            RecyclerView A0F = AbstractC31176DnK.A0F(view);
            this.A03 = A0F;
            str = "recyclerView";
            if (A0F != null) {
                AbstractC31177DnL.A0s(requireContext(), A0F);
                RecyclerView recyclerView = this.A03;
                if (recyclerView != null) {
                    C31891Dzx c31891Dzx = this.A01;
                    if (c31891Dzx == null) {
                        str = "adapter";
                    } else {
                        recyclerView.setAdapter(c31891Dzx);
                        C64P c64p = (C64P) view.requireViewById(R.id.bottom_bottom_layout);
                        if (c64p != null) {
                            Context context = view.getContext();
                            c64p.setPrimaryAction(context.getString(2131955651), ViewOnClickListenerC35679FpE.A00(this, 49));
                            c64p.setSecondaryAction(context.getString(2131955652), ViewOnClickListenerC35679FpE.A00(this, 50));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
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
    public final void onCreate(Bundle bundle) {
        List emptyList;
        int A02 = C0f9.A02(1328139266);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (emptyList = bundle2.getParcelableArrayList(AbstractC111324zv.A00(1486))) == null) {
            emptyList = Collections.emptyList();
            C14360o3.A07(emptyList);
        }
        this.A02 = emptyList;
        C0f9.A09(1817739171, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1919972204);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_preloaded_settings_bottom_sheet, viewGroup, false);
        C0f9.A09(2009215065, A02);
        return inflate;
    }
}
