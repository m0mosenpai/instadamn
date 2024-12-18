package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.lang.ref.WeakReference;

/* renamed from: X.XRk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72176XRk extends C197938p4 {
    public final WeakReference A00;
    public final C72805XnS A01;
    public final WeakReference A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72176XRk(AbstractC55102ObF abstractC55102ObF, YQR yqr, boolean z) {
        super(yqr.getSurface(), EnumC185798Lz.CAPTURE, yqr.C4S(), yqr.C4O());
        C72805XnS c72805XnS;
        C14360o3.A0B(yqr, 1);
        this.A02 = AbstractC25225BEi.A16(yqr);
        this.A00 = AbstractC25225BEi.A16(abstractC55102ObF);
        if (z) {
            RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
            C14360o3.A07(realtimeSinceBootClock);
            c72805XnS = new C72805XnS(realtimeSinceBootClock, new C72692XlL(this));
        } else {
            c72805XnS = null;
        }
        this.A01 = c72805XnS;
    }

    @Override // X.C197938p4, X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final boolean AFZ() {
        YQR yqr = (YQR) this.A02.get();
        Object obj = this.A00.get();
        if (super.AFZ() && yqr != null && !yqr.Ca8() && obj != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final void DrC() {
        AbstractC55102ObF abstractC55102ObF;
        C72805XnS c72805XnS = this.A01;
        if (c72805XnS != null) {
            c72805XnS.A06++;
        }
        super.DrC();
        YQR yqr = (YQR) this.A02.get();
        if (yqr != null && (abstractC55102ObF = (AbstractC55102ObF) this.A00.get()) != null) {
            abstractC55102ObF.A0I(yqr);
        }
        if (c72805XnS != null) {
            c72805XnS.A01++;
            C72780Xn0 c72780Xn0 = c72805XnS.A04;
            c72780Xn0.A02++;
            long now = c72805XnS.A03.now();
            long j = c72805XnS.A02;
            if (j == 0) {
                c72780Xn0.A00 = -1;
                c72780Xn0.A02 = 0L;
                c72780Xn0.A01 = c72780Xn0.A03.now();
                c72805XnS.A02 = now;
                j = now;
            }
            if (now - j >= 1000) {
                long now2 = c72780Xn0.A03.now();
                long j2 = now2 - c72780Xn0.A01;
                if (j2 >= 1000) {
                    c72780Xn0.A00 = (int) ((c72780Xn0.A02 * 1000) / j2);
                    c72780Xn0.A01 = now2;
                    c72780Xn0.A02 = 0L;
                }
                c72805XnS.A00 = c72780Xn0.A00;
                c72805XnS.A02 = now;
                C11T.A02(new RunnableC73534YIe((AbstractC55102ObF) c72805XnS.A05.A00.A00.get(), c72805XnS.A06, c72805XnS.A01, c72805XnS.A00));
            }
        }
    }

    @Override // X.C197938p4
    public final void A00(long j) {
        super.A00(j);
        long j2 = ((C197938p4) this).A02;
        YQR yqr = (YQR) this.A02.get();
        if (yqr != null) {
            yqr.Ecc(j2 / 1000000);
        }
        AbstractC55102ObF abstractC55102ObF = (AbstractC55102ObF) this.A00.get();
        if (abstractC55102ObF != null) {
            abstractC55102ObF.A0G(j2);
        }
    }
}
