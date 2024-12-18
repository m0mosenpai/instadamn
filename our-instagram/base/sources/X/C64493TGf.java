package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.TGf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64493TGf implements InterfaceC65531Tm1 {
    public final Fragment A00;
    public final InterfaceC60602pj A01;
    public final InterfaceC65531Tm1 A02;

    @Override // X.InterfaceC65531Tm1
    public final void D6d(boolean z, String str) {
        IgFragmentActivity igFragmentActivity;
        Fragment fragment = this.A00;
        InterfaceC60602pj interfaceC60602pj = this.A01;
        FragmentActivity activity = fragment.getActivity();
        if ((activity instanceof BaseFragmentActivity) && (igFragmentActivity = (IgFragmentActivity) activity) != null) {
            igFragmentActivity.unregisterOnActivityResultListener(interfaceC60602pj);
        }
        this.A02.D6d(z, str);
    }

    @Override // X.InterfaceC65531Tm1
    public final void DgW(InterfaceC37130GXr interfaceC37130GXr) {
        this.A02.DgW(new C64494TGg(interfaceC37130GXr, this));
    }

    public C64493TGf(Fragment fragment, InterfaceC60602pj interfaceC60602pj, InterfaceC65531Tm1 interfaceC65531Tm1) {
        this.A00 = fragment;
        this.A01 = interfaceC60602pj;
        this.A02 = interfaceC65531Tm1;
    }
}
