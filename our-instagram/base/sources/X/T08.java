package X;

import android.util.SparseArray;
import com.facebook.react.modules.core.TimingModule;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class T08 implements InterfaceC65542TmH {
    public RunnableC64688TPt A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final R3M A05;
    public final C63192Seu A08;
    public final TimingModule A09;
    public final InterfaceC65655TqV A0F;
    public final Object A0B = AbstractC58318PtA.A0b();
    public final Object A0A = AbstractC58318PtA.A0b();
    public final SparseArray A04 = AbstractC58318PtA.A0G();
    public final AtomicBoolean A0D = new AtomicBoolean(true);
    public final AtomicBoolean A0E = AbstractC166997dE.A17();
    public final ChoreographerFrameCallbackC63493So7 A07 = new ChoreographerFrameCallbackC63493So7(this);
    public final ChoreographerFrameCallbackC63491So5 A06 = new ChoreographerFrameCallbackC63491So5(this);
    public final PriorityQueue A0C = new PriorityQueue(11, TSJ.A00);

    public T08(R3M r3m, InterfaceC65655TqV interfaceC65655TqV, C63192Seu c63192Seu, TimingModule timingModule) {
        this.A05 = r3m;
        this.A09 = timingModule;
        this.A08 = c63192Seu;
        this.A0F = interfaceC65655TqV;
        r3m.A0A(this);
    }

    public static final void A00(T08 t08) {
        C63150Sdx A00 = C63150Sdx.A00(t08.A05);
        if (t08.A01 && t08.A0D.get() && A00.A02.size() <= 0) {
            t08.A08.A03(t08.A07, EnumC61159RgK.A07);
            t08.A01 = false;
        }
    }

    public static final void A01(T08 t08) {
        if (t08.A0D.get() && !t08.A0E.get()) {
            A00(t08);
        }
    }

    public static final void A02(T08 t08) {
        synchronized (t08.A0A) {
            if (t08.A03 && !t08.A02) {
                t08.A08.A02(t08.A06, EnumC61159RgK.A04);
                t08.A02 = true;
            }
        }
    }

    public void deleteTimer(int i) {
        synchronized (this.A0B) {
            SparseArray sparseArray = this.A04;
            SHU shu = (SHU) sparseArray.get(i);
            if (shu != null) {
                sparseArray.remove(i);
                this.A0C.remove(shu);
            }
        }
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostPause() {
        this.A0D.set(true);
        A00(this);
        A01(this);
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostResume() {
        this.A0D.set(false);
        if (!this.A01) {
            this.A08.A02(this.A07, EnumC61159RgK.A07);
            this.A01 = true;
        }
        A02(this);
    }

    public void setSendIdleEvents(boolean z) {
        synchronized (this.A0A) {
            this.A03 = z;
        }
        C63255SgD.A01(new RunnableC64631TNn(this, z));
    }

    public void createTimer(int i, long j, boolean z) {
        SHU shu = new SHU(i, (int) j, z, (System.nanoTime() / 1000000) + j);
        synchronized (this.A0B) {
            this.A0C.add(shu);
            this.A04.put(i, shu);
        }
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostDestroy() {
        A00(this);
        A01(this);
    }
}
