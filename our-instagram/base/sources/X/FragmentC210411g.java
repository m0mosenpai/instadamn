package X;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.11g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class FragmentC210411g extends Fragment {
    public InterfaceC71835X6s A00;

    private final void A00(C07R c07r) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C14360o3.A07(activity);
            AbstractC210211d.A01(activity, c07r);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A00(C07R.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        A00(C07R.ON_DESTROY);
        this.A00 = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        A00(C07R.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC71835X6s interfaceC71835X6s = this.A00;
        if (interfaceC71835X6s != null) {
            ((C65707Tsf) interfaceC71835X6s).A00.A01();
        }
        A00(C07R.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC71835X6s interfaceC71835X6s = this.A00;
        if (interfaceC71835X6s != null) {
            ((C65707Tsf) interfaceC71835X6s).A00.A02();
        }
        A00(C07R.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        A00(C07R.ON_STOP);
    }
}
