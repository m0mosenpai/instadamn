package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.SMy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62710SMy {
    public int A00;
    public int A01;
    public BluetoothAdapter A02;
    public BluetoothLeScanner A03;
    public Q1O A04;
    public C0JM A05;
    public C0JO A06;
    public boolean A07;
    public final C64478TFo A08;
    public final List A0A = AbstractC166987dD.A1E();
    public final List A09 = AbstractC58318PtA.A11();

    public final synchronized void A00() {
        Q1O q1o = this.A04;
        if (q1o != null) {
            try {
                try {
                    this.A07 = false;
                    this.A03.flushPendingScanResults(q1o);
                    C0fB.A00(this.A03, this.A04);
                    Object A0b = AbstractC58318PtA.A0b();
                    try {
                        synchronized (A0b) {
                            AbstractC167007dF.A0J().post(new RunnableC64545TJb(A0b));
                            A0b.wait(200L);
                        }
                    } catch (Exception unused) {
                    }
                    if (C0K8.A01.isLoggable(3)) {
                        List list = this.A0A;
                        synchronized (list) {
                            try {
                                this.A06.now();
                                list.size();
                            } finally {
                            }
                        }
                    }
                    C64478TFo c64478TFo = this.A08;
                    if (c64478TFo != null) {
                        synchronized (c64478TFo) {
                            try {
                                List list2 = c64478TFo.A00;
                                ListIterator listIterator = list2.listIterator();
                                while (listIterator.hasNext()) {
                                    if (((WeakReference) listIterator.next()).get() == this) {
                                        listIterator.remove();
                                    }
                                }
                                if (list2.size() == 0) {
                                    C218914p.A07(c64478TFo);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    this.A04 = null;
                    throw th2;
                }
            } catch (Exception e) {
                C0K8.A05(C62710SMy.class, "Couldn't stop scanning", e);
            }
            this.A04 = null;
        }
    }

    public C62710SMy(C0JM c0jm, C0JO c0jo, C64478TFo c64478TFo) {
        this.A05 = c0jm;
        this.A06 = c0jo;
        this.A08 = c64478TFo;
    }
}
