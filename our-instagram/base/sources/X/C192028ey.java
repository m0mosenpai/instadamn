package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.8ey, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192028ey implements InterfaceC13000lm {
    public final C003701c A00;
    public final C0JO A01;
    public final C191948eq A02;

    public final void A00(AbstractC193008gg abstractC193008gg, String str, long j, long j2) {
        C14360o3.A0B(abstractC193008gg, 1);
        synchronized (this.A02) {
            this.A00.A05(str, new C192818gN(abstractC193008gg, this.A01.now(), j, j2));
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        synchronized (this.A02) {
            this.A00.A04(-1);
        }
    }

    public C192028ey() {
        C191948eq c191948eq = C191948eq.A00;
        C14360o3.A07(c191948eq);
        this.A02 = c191948eq;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        this.A01 = awakeTimeSinceBootClock;
        this.A00 = new C003701c(10);
    }
}
