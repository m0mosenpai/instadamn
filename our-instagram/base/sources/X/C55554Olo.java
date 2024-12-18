package X;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: X.Olo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55554Olo implements InterfaceC65626Tpm {
    public final C3I9 A00;
    public final InterfaceC19390xP A01;
    public final WeakReference A02;

    public C55554Olo(Activity activity, C07T c07t) {
        C14360o3.A0B(c07t, 2);
        this.A02 = AbstractC25225BEi.A16(activity);
        this.A00 = C3I7.A01(this, false, true);
        this.A01 = AbstractC208910l.A00(AbstractC57302k5.A00(c07t), C0JE.A00(new C57158PZc(this, null, 10)), new C15020pI(0L), 0);
        c07t.A09(this);
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        this.A00.Dnr((Activity) this.A02.get());
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStop(C07X c07x) {
        this.A00.onStop();
    }
}
