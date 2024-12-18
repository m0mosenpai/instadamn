package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GJ8 implements InterfaceC37205GaG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C31539DtP A02;

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onFinish() {
    }

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onStart() {
    }

    public GJ8(Context context, FragmentActivity fragmentActivity, C31539DtP c31539DtP) {
        this.A01 = fragmentActivity;
        this.A02 = c31539DtP;
        this.A00 = context;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        C9GR.A03(AbstractC13110lx.A00(this.A01), this.A00.getString(2131974293), "something_went_wrong", 0);
    }

    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        C9GR.A07(AbstractC13110lx.A00(this.A01), 2131952120);
        this.A02.A03.ChP();
    }
}
