package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0ko, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12460ko extends AbstractC10920i8 implements InterfaceC018407e, InterfaceC08430c6, C1U9, InterfaceC20340zA, InterfaceC001400c, C1UA, C1UB, C1UC, AnonymousClass036, C06Y {
    public final /* synthetic */ FragmentActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12460ko(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.A00 = fragmentActivity;
    }

    @Override // X.AnonymousClass067
    public final View A00(int i) {
        return this.A00.findViewById(i);
    }

    @Override // X.AnonymousClass067
    public final boolean A01() {
        Window window = this.A00.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC10920i8
    public final LayoutInflater A02() {
        FragmentActivity fragmentActivity = this.A00;
        return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
    }

    @Override // X.AbstractC10920i8
    public final void A03() {
        this.A00.invalidateOptionsMenu();
    }

    @Override // X.AbstractC10920i8
    public final boolean A04(String str) {
        return AbstractC114515Ew.A06(this.A00, str);
    }

    @Override // X.C06Y
    public final void Cxc(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        this.A00.onAttachFragment(fragment);
    }

    @Override // X.AnonymousClass036
    public final void addMenuProvider(C03F c03f) {
        this.A00.addMenuProvider(c03f);
    }

    @Override // X.C1U9
    public final void addOnConfigurationChangedListener(C02N c02n) {
        this.A00.addOnConfigurationChangedListener(c02n);
    }

    @Override // X.C1UA
    public final void addOnMultiWindowModeChangedListener(C02N c02n) {
        this.A00.addOnMultiWindowModeChangedListener(c02n);
    }

    @Override // X.C1UB
    public final void addOnPictureInPictureModeChangedListener(C02N c02n) {
        this.A00.addOnPictureInPictureModeChangedListener(c02n);
    }

    @Override // X.C1UC
    public final void addOnTrimMemoryListener(C02N c02n) {
        this.A00.addOnTrimMemoryListener(c02n);
    }

    @Override // X.InterfaceC001400c
    public final AbstractC001300b getActivityResultRegistry() {
        return this.A00.activityResultRegistry;
    }

    @Override // X.C07X
    public final C07T getLifecycle() {
        return this.A00.mFragmentLifecycleRegistry;
    }

    @Override // X.InterfaceC20340zA
    public final C00M getOnBackPressedDispatcher() {
        return this.A00.getOnBackPressedDispatcher();
    }

    @Override // X.InterfaceC08430c6
    public final C08U getSavedStateRegistry() {
        return this.A00.savedStateRegistryController.A01;
    }

    @Override // X.InterfaceC018407e
    public final C018307d getViewModelStore() {
        return this.A00.getViewModelStore();
    }

    @Override // X.AnonymousClass036
    public final void removeMenuProvider(C03F c03f) {
        this.A00.removeMenuProvider(c03f);
    }

    @Override // X.C1U9
    public final void removeOnConfigurationChangedListener(C02N c02n) {
        this.A00.removeOnConfigurationChangedListener(c02n);
    }

    @Override // X.C1UA
    public final void removeOnMultiWindowModeChangedListener(C02N c02n) {
        this.A00.removeOnMultiWindowModeChangedListener(c02n);
    }

    @Override // X.C1UB
    public final void removeOnPictureInPictureModeChangedListener(C02N c02n) {
        this.A00.removeOnPictureInPictureModeChangedListener(c02n);
    }

    @Override // X.C1UC
    public final void removeOnTrimMemoryListener(C02N c02n) {
        this.A00.removeOnTrimMemoryListener(c02n);
    }
}
