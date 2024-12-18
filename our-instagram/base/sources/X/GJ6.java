package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class GJ6 implements InterfaceC37205GaG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ boolean A01;

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onFinish() {
    }

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onStart() {
    }

    public GJ6(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        C9GR.A0B(this.A00, "something_went_wrong");
    }

    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        int i;
        boolean z = this.A01;
        Context context = this.A00;
        if (z) {
            i = 2131952099;
        } else {
            i = 2131952120;
        }
        C9GR.A07(context, i);
    }
}
