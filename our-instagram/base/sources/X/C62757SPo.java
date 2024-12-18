package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SPo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62757SPo {
    public int A00;
    public int A01;
    public Q20 A02;
    public EnumC61107RfN A03;
    public InterfaceC65617To8 A04;
    public C63729Ssj A05;
    public S9K A06;
    public SL0 A07;
    public Class A08;
    public Class A09;
    public Object A0A;
    public Map A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final List A0H = AbstractC166987dD.A1E();
    public final List A0G = AbstractC166987dD.A1E();

    public final InterfaceC65632Tpt A00(Class cls) {
        InterfaceC65632Tpt interfaceC65632Tpt = (InterfaceC65632Tpt) this.A0B.get(cls);
        if (interfaceC65632Tpt == null) {
            Iterator A15 = AbstractC166997dE.A15(this.A0B);
            while (true) {
                if (!A15.hasNext()) {
                    break;
                }
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (((Class) A1K.getKey()).isAssignableFrom(cls)) {
                    InterfaceC65632Tpt interfaceC65632Tpt2 = (InterfaceC65632Tpt) A1K.getValue();
                    if (interfaceC65632Tpt2 != null) {
                        return interfaceC65632Tpt2;
                    }
                }
            }
            if (this.A0B.isEmpty() && this.A0F) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Missing transformation for ");
                A1C.append(cls);
                throw AbstractC58320PtC.A0m(". If you wish to ignore unknown resource types, use the optional transformation methods.", A1C);
            }
            return C63758StE.A00;
        }
        return interfaceC65632Tpt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.SOp, java.lang.Object] */
    public final SLR A01(Class cls) {
        SLR slr;
        SLR slr2;
        ArrayList A1E;
        InterfaceC65326Ti7 interfaceC65326Ti7;
        SQE A00 = InterfaceC65610To1.A00(this);
        Class cls2 = this.A08;
        Class cls3 = this.A09;
        SWA swa = A00.A05;
        AtomicReference atomicReference = swa.A01;
        C62746SOp c62746SOp = (C62746SOp) atomicReference.getAndSet(null);
        C62746SOp c62746SOp2 = c62746SOp;
        if (c62746SOp == null) {
            c62746SOp2 = new Object();
        }
        c62746SOp2.A00 = cls;
        c62746SOp2.A01 = cls2;
        c62746SOp2.A02 = cls3;
        C20030yX c20030yX = swa.A00;
        synchronized (c20030yX) {
            slr = (SLR) c20030yX.get(c62746SOp2);
        }
        atomicReference.set(c62746SOp2);
        SLR slr3 = SWA.A02;
        if (slr3.equals(slr)) {
            return null;
        }
        if (slr == null) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            SL2 sl2 = A00.A07;
            Iterator it = sl2.A00(cls, cls2).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                SKD skd = A00.A02;
                Iterator it2 = skd.A00(cls4, cls3).iterator();
                while (it2.hasNext()) {
                    Class cls5 = (Class) it2.next();
                    synchronized (sl2) {
                        A1E = AbstractC166987dD.A1E();
                        Iterator it3 = sl2.A00.iterator();
                        while (it3.hasNext()) {
                            List<SFY> A12 = AbstractC43592JPx.A12(AbstractC166987dD.A1B(it3), sl2.A01);
                            if (A12 != null) {
                                for (SFY sfy : A12) {
                                    if (sfy.A01.isAssignableFrom(cls) && cls4.isAssignableFrom(sfy.A02)) {
                                        A1E.add(sfy.A00);
                                    }
                                }
                            }
                        }
                    }
                    synchronized (skd) {
                        if (cls5.isAssignableFrom(cls4)) {
                            interfaceC65326Ti7 = C63863Suv.A00;
                        } else {
                            for (SFX sfx : skd.A00) {
                                if (sfx.A01.isAssignableFrom(cls4) && cls5.isAssignableFrom(sfx.A02)) {
                                    interfaceC65326Ti7 = sfx.A00;
                                }
                            }
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append("No transcoder registered to transcode from ");
                            A1C.append(cls4);
                            throw AbstractC37303Gc4.A0M(cls5, " to ", A1C);
                        }
                    }
                    A1E2.add(new SMQ(A00.A00, interfaceC65326Ti7, cls, cls4, cls5, A1E));
                }
            }
            if (A1E2.isEmpty()) {
                slr2 = null;
            } else {
                slr2 = new SLR(A00.A00, cls, cls2, cls3, A1E2);
            }
            SLR slr4 = slr2;
            synchronized (c20030yX) {
                ?? obj = new Object();
                obj.A00 = cls;
                obj.A01 = cls2;
                obj.A02 = cls3;
                if (slr2 == null) {
                    slr4 = slr3;
                }
                c20030yX.put(obj, slr4);
            }
            return slr2;
        }
        return slr;
    }

    public final List A02() {
        if (!this.A0C) {
            this.A0C = true;
            List list = this.A0G;
            list.clear();
            List A03 = A03();
            int size = A03.size();
            for (int i = 0; i < size; i++) {
                SFV sfv = (SFV) A03.get(i);
                if (!list.contains(sfv.A00)) {
                    list.add(sfv.A00);
                }
                for (int i2 = 0; i2 < sfv.A02.size(); i2++) {
                    if (!list.contains(sfv.A02.get(i2))) {
                        list.add(sfv.A02.get(i2));
                    }
                }
            }
        }
        return this.A0G;
    }

    public final List A03() {
        if (!this.A0D) {
            this.A0D = true;
            List list = this.A0H;
            list.clear();
            List A02 = InterfaceC65610To1.A00(this).A02(this.A0A);
            int size = A02.size();
            for (int i = 0; i < size; i++) {
                SFV AEj = ((InterfaceC65477Tku) A02.get(i)).AEj(this.A05, this.A0A, this.A01, this.A00);
                if (AEj != null) {
                    list.add(AEj);
                }
            }
        }
        return this.A0H;
    }
}
