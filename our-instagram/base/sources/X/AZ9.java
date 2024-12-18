package X;

import android.os.SystemClock;
import android.util.SparseIntArray;

/* loaded from: classes4.dex */
public final class AZ9 implements InterfaceC179087xK, InterfaceC179447xu, InterfaceC1809180t {
    public int A00;
    public int A01;
    public InterfaceC180227zC A02;
    public final C179457xv A03 = new Object();
    public final AbstractC179397xp A04 = new C179387xo();
    public volatile InterfaceC1809280u A05;

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    public static void A00(AZ9 az9) {
        if (az9.A02 != null) {
            C179457xv c179457xv = az9.A03;
            if (c179457xv.A04 == null) {
                AnonymousClass811 anonymousClass811 = new AnonymousClass811("BlankInput");
                anonymousClass811.A03 = 3553;
                anonymousClass811.A04 = 8;
                anonymousClass811.A02 = 8;
                SparseIntArray sparseIntArray = anonymousClass811.A0B;
                sparseIntArray.put(10241, 9729);
                sparseIntArray.put(10240, 9729);
                sparseIntArray.put(10242, 33071);
                sparseIntArray.put(10243, 33071);
                c179457xv.A04 = new AnonymousClass810(anonymousClass811);
            }
            InterfaceC1809280u interfaceC1809280u = az9.A05;
            if (interfaceC1809280u != null) {
                interfaceC1809280u.DIE();
            }
        }
    }

    public final C179407xq A01(int i, int i2, int i3) {
        AbstractC179397xp abstractC179397xp = this.A04;
        abstractC179397xp.A09(this.A01, this.A00, i, i2, 0, false, false);
        this.A03.A01 = i3;
        return abstractC179397xp.A08();
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        this.A02 = interfaceC180227zC;
        A00(this);
    }

    @Override // X.InterfaceC179447xu
    public final InterfaceC179467xw B8Z() {
        C179457xv c179457xv = this.A03;
        c179457xv.A05 = this.A04.A08();
        c179457xv.A03 = SystemClock.elapsedRealtimeNanos();
        return c179457xv;
    }

    @Override // X.InterfaceC179447xu
    public final /* synthetic */ int BHw() {
        return 0;
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        C179457xv c179457xv;
        AnonymousClass810 anonymousClass810;
        if (this.A02 != null && (anonymousClass810 = (c179457xv = this.A03).A04) != null) {
            anonymousClass810.A01();
            c179457xv.A04 = null;
        }
        this.A02 = null;
    }

    @Override // X.InterfaceC179447xu
    public final void EZr(InterfaceC1809280u interfaceC1809280u) {
        this.A05 = interfaceC1809280u;
    }

    @Override // X.InterfaceC1809180t
    public final C179407xq FBE(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        return A01(i, i2, i6);
    }
}
