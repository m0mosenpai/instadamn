package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.StH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63761StH implements InterfaceC65471Tko, InterfaceC65474Tkr {
    public int A00;
    public List A01;
    public int A02 = -1;
    public int A03;
    public InterfaceC65617To8 A04;
    public C63731Ssl A05;
    public File A06;
    public final InterfaceC65536Tm8 A07;
    public final C62757SPo A08;
    public volatile SFV A09;

    @Override // X.InterfaceC65471Tko
    public final void D9H(Object obj) {
        this.A07.D9F(this.A04, this.A05, this.A09.A01, C05F.A0N, obj);
    }

    @Override // X.InterfaceC65471Tko
    public final void DPj(Exception exc) {
        this.A07.D9E(this.A05, this.A09.A01, exc, C05F.A0N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.SOp, java.lang.Object] */
    @Override // X.InterfaceC65474Tkr
    public final boolean Ene() {
        List list;
        ArrayList A1E;
        C62757SPo c62757SPo = this.A08;
        List A02 = c62757SPo.A02();
        if (A02.isEmpty()) {
            return false;
        }
        SQE A00 = InterfaceC65610To1.A00(c62757SPo);
        Class<?> cls = c62757SPo.A0A.getClass();
        Class cls2 = c62757SPo.A08;
        Class cls3 = c62757SPo.A09;
        SDK sdk = A00.A06;
        AtomicReference atomicReference = sdk.A01;
        C62746SOp c62746SOp = (C62746SOp) atomicReference.getAndSet(null);
        C62746SOp c62746SOp2 = c62746SOp;
        if (c62746SOp == null) {
            c62746SOp2 = new Object();
        }
        c62746SOp2.A00 = cls;
        c62746SOp2.A01 = cls2;
        c62746SOp2.A02 = cls3;
        C20030yX c20030yX = sdk.A00;
        synchronized (c20030yX) {
            try {
                list = (List) c20030yX.get(c62746SOp2);
            } catch (Throwable th) {
                throw th;
            }
        }
        atomicReference.set(c62746SOp2);
        List list2 = list;
        if (list == null) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            SDF sdf = A00.A01;
            synchronized (sdf) {
                try {
                    C62954SYw c62954SYw = sdf.A01;
                    synchronized (c62954SYw) {
                        A1E = AbstractC166987dD.A1E();
                        for (SFW sfw : c62954SYw.A02) {
                            Class cls4 = sfw.A01;
                            if (!A1E.contains(cls4) && sfw.A02.isAssignableFrom(cls)) {
                                A1E.add(cls4);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                Iterator it2 = A00.A07.A00((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls5 = (Class) it2.next();
                    if (!A00.A02.A00(cls5, cls3).isEmpty()) {
                        MSZ.A1P(cls5, A1E2);
                    }
                }
            }
            List unmodifiableList = Collections.unmodifiableList(A1E2);
            synchronized (c20030yX) {
                try {
                    ?? obj = new Object();
                    obj.A00 = cls;
                    obj.A01 = cls2;
                    obj.A02 = cls3;
                    c20030yX.put(obj, unmodifiableList);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            list2 = A1E2;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(c62757SPo.A09)) {
                return false;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Failed to find any load path from ");
            AbstractC58318PtA.A1U(A1C, c62757SPo.A0A);
            A1C.append(" to ");
            throw AbstractC58320PtC.A0n(c62757SPo.A09, A1C);
        }
        while (true) {
            List list3 = this.A01;
            if (list3 != null && this.A00 < list3.size()) {
                this.A09 = null;
                while (this.A00 < this.A01.size()) {
                    List list4 = this.A01;
                    int i = this.A00;
                    this.A00 = i + 1;
                    this.A09 = ((InterfaceC65477Tku) list4.get(i)).AEj(c62757SPo.A05, this.A06, c62757SPo.A01, c62757SPo.A00);
                    if (this.A09 != null && c62757SPo.A01(this.A09.A01.Avg()) != null) {
                        this.A09.A01.ChQ(c62757SPo.A03, this);
                        return true;
                    }
                }
                return false;
            }
            int i2 = this.A02 + 1;
            this.A02 = i2;
            if (i2 >= list2.size()) {
                int i3 = this.A03 + 1;
                this.A03 = i3;
                if (i3 >= A02.size()) {
                    return false;
                }
                this.A02 = 0;
            }
            InterfaceC65617To8 interfaceC65617To8 = (InterfaceC65617To8) A02.get(this.A03);
            Class cls6 = (Class) list2.get(this.A02);
            InterfaceC65632Tpt A002 = c62757SPo.A00(cls6);
            C63361SiK c63361SiK = c62757SPo.A02.A04;
            this.A05 = new C63731Ssl(interfaceC65617To8, c62757SPo.A04, c62757SPo.A05, A002, c63361SiK, cls6, c62757SPo.A01, c62757SPo.A00);
            File AXN = c62757SPo.A07.A00().AXN(this.A05);
            this.A06 = AXN;
            if (AXN != null) {
                this.A04 = interfaceC65617To8;
                this.A01 = InterfaceC65610To1.A00(c62757SPo).A02(AXN);
                this.A00 = 0;
            }
        }
    }

    @Override // X.InterfaceC65474Tkr
    public final void cancel() {
        SFV sfv = this.A09;
        if (sfv != null) {
            sfv.A01.cancel();
        }
    }

    public C63761StH(InterfaceC65536Tm8 interfaceC65536Tm8, C62757SPo c62757SPo) {
        this.A08 = c62757SPo;
        this.A07 = interfaceC65536Tm8;
    }
}
