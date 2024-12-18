package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: classes9.dex */
public final class P82 implements InterfaceC146936jV {
    public final /* synthetic */ C55040OZm A00;

    public P82(C55040OZm c55040OZm) {
        this.A00 = c55040OZm;
    }

    @Override // X.InterfaceC146936jV
    public final void D6t() {
        Context context = this.A00.A03.getContext();
        if (context != null) {
            CallerContext callerContext = NVk.A02;
            C55088Oal.A01(context, C05F.A0j, 0);
        }
    }

    @Override // X.InterfaceC146936jV
    public final void onDismiss() {
        Context context = this.A00.A03.getContext();
        if (context != null) {
            CallerContext callerContext = NVk.A02;
            C55088Oal.A01(context, C05F.A00, 0);
        }
    }
}
