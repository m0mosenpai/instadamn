package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.DpH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31295DpH extends AbstractC46524KiP {
    public final C7O4 A00;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        View inflate = View.inflate(context, R.layout.banner_message_island, null);
        C14360o3.A07(inflate);
        View findViewById = inflate.findViewById(R.id.action);
        if (findViewById != null) {
            ViewOnClickListenerC35691FpR.A01(findViewById, 26, this);
        }
        return inflate;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        C14360o3.A0B(interfaceC37159GYw, 1);
        if (this.A00.A04()) {
            interfaceC37159GYw.Dpu(this);
        } else {
            interfaceC37159GYw.onFailure();
        }
    }

    public C31295DpH(C7O4 c7o4) {
        this.A00 = c7o4;
        c7o4.A0D.add(new C31296DpI(this));
    }
}
