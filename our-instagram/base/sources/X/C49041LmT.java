package X;

import android.app.Activity;

/* renamed from: X.LmT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49041LmT implements InterfaceC165577ak {
    public final Activity A00;

    public C49041LmT(Activity activity) {
        this.A00 = activity;
    }

    @Override // X.InterfaceC165577ak
    public final void ElD(C44995Jvl c44995Jvl) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("debugInteractor is not available for current build type: ");
        throw AbstractC166987dD.A14(AbstractC166997dE.A0v(EnumC12900lc.A02.getValue(), A1C));
    }
}
