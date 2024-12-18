package X;

import android.app.Activity;

/* renamed from: X.2Ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50552Ua implements InterfaceC12850lX {
    public static C50552Ua A01;
    public final boolean A00;

    @Override // X.InterfaceC12850lX
    public final void Cuw(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cux(Activity activity) {
        C14360o3.A0B(activity, 0);
        if (!C08310bt.A02().A00(activity, activity.getIntent(), activity)) {
            if (this.A00) {
                C12260kU.A0C(activity, C14H.A03.A00().A03(activity, 268435456));
                C03850Ja.A01("killed by killswitch framework");
            }
            activity.finish();
        }
    }

    @Override // X.InterfaceC12850lX
    public final void Cuy(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv0(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv5(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv6(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv7(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv8(Activity activity, boolean z) {
    }

    public C50552Ua(boolean z) {
        this.A00 = z;
    }
}
