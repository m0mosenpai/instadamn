package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: X.6Ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139756Ue extends AbstractC139766Uf {
    public final C0JO A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ InterfaceC103384lE A03;

    public C139756Ue(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A02 = c102884kP;
        this.A01 = c6fg;
        this.A03 = interfaceC103384lE;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        C14360o3.A07(realtimeSinceBootClock);
        this.A00 = realtimeSinceBootClock;
    }

    @Override // X.C5GG
    public final void DH1(Drawable drawable, C3QB c3qb, int i, long j) {
        C6BR.A03(this.A01, this.A02, this.A03, "ImageFinalRendered", this.A00.now());
    }
}
