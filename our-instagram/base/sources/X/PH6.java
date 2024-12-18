package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;

/* loaded from: classes9.dex */
public final class PH6 implements InterfaceC58304Psw {
    public final /* synthetic */ View A00;
    public final /* synthetic */ IgLiveWithGuestFragment A01;

    public PH6(View view, IgLiveWithGuestFragment igLiveWithGuestFragment) {
        this.A01 = igLiveWithGuestFragment;
        this.A00 = view;
    }

    @Override // X.InterfaceC57996Png
    public final /* bridge */ /* synthetic */ void Dd7(Object obj) {
        InterfaceC58187Pqt interfaceC58187Pqt = (InterfaceC58187Pqt) obj;
        C14360o3.A0B(interfaceC58187Pqt, 0);
        interfaceC58187Pqt.Csc((ViewStub) AbstractC166987dD.A0c(this.A00, R.id.iglive_guest_layout_sup_debug_stub), AbstractC166987dD.A0r(this.A01.A0G));
    }
}
