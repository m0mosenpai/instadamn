package X;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.36g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C684336g implements InterfaceC55932he {
    public InterfaceC684236f A01;
    public WeakReference A02;
    public final C55982hj A03;
    public final Handler A05;
    public final C55982hj A06;
    public static final C55942hf A08 = C55942hf.A04(60.0d, 5.0d);
    public static final C55942hf A09 = C55942hf.A03(6.0d, 9.0d);
    public static final C55942hf A07 = C55942hf.A03(6.0d, 8.0d);
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public int A00 = -1;

    public final void A02(InterfaceC53832dN interfaceC53832dN) {
        C14360o3.A0B(interfaceC53832dN, 0);
        this.A04.add(interfaceC53832dN);
        C55982hj c55982hj = this.A03;
        if (!c55982hj.A0C()) {
            Dnm(c55982hj);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        C55982hj c55982hj2 = this.A03;
        if (c55982hj == c55982hj2 && c55982hj2.A05 == A09 && c55982hj2.A0E(1.0d)) {
            this.A05.postDelayed(new RunnableC43091J3g(this), 300L);
            return;
        }
        if (c55982hj != c55982hj2 || c55982hj2.A05 != A07 || !c55982hj2.A0E(0.0d)) {
            return;
        }
        Iterator it = this.A04.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            ((InterfaceC53832dN) it.next()).DZb(this.A00);
        }
        this.A00 = -1;
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        InterfaceC684236f interfaceC684236f;
        C55942hf c55942hf;
        C14360o3.A0B(c55982hj, 0);
        C55942hf c55942hf2 = c55982hj.A05;
        float f = (float) c55982hj.A09.A00;
        boolean z = true;
        if (c55982hj == this.A06) {
            WeakReference weakReference = this.A02;
            if (weakReference != null && (interfaceC684236f = (InterfaceC684236f) weakReference.get()) != null) {
                c55942hf = A08;
            } else {
                return;
            }
        } else if (c55982hj != this.A03 || (interfaceC684236f = this.A01) == null) {
            return;
        } else {
            c55942hf = A09;
        }
        if (c55942hf2 != c55942hf) {
            z = false;
        }
        interfaceC684236f.Cwl(z, f);
    }

    public final void A00() {
        C55982hj c55982hj = this.A06;
        c55982hj.A09(A08);
        c55982hj.A08(0.0d, true);
        c55982hj.A06(1.0d);
    }

    public final void A01(int i) {
        this.A00 = i;
        C55982hj c55982hj = this.A03;
        c55982hj.A09(A09);
        c55982hj.A06 = false;
        c55982hj.A08(0.0d, true);
        c55982hj.A06(1.0d);
    }

    public final void A03(InterfaceC684236f interfaceC684236f) {
        this.A01 = interfaceC684236f;
        C55982hj c55982hj = this.A03;
        if (!c55982hj.A0C()) {
            Dnm(c55982hj);
        }
    }

    public final void A04(WeakReference weakReference) {
        this.A02 = weakReference;
        C55982hj c55982hj = this.A06;
        if (!c55982hj.A0C()) {
            Dnm(c55982hj);
        }
    }

    public C684336g() {
        C55952hg A00 = AbstractC13560mi.A00();
        C55982hj A02 = A00.A02();
        A02.A0A(this);
        this.A06 = A02;
        C55982hj A022 = A00.A02();
        A022.A0A(this);
        this.A03 = A022;
        this.A05 = new Handler();
    }
}
