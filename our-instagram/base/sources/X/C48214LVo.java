package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.LVo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48214LVo implements InterfaceC55932he {
    public static int A06;
    public static final C47938LFn A07 = C47938LFn.A01;
    public int A00;
    public final CopyOnWriteArrayList A01;
    public final C55942hf A02;
    public final C55942hf A03;
    public final C55952hg A04;
    public final CopyOnWriteArrayList A05;

    public final void A00() {
        List A1F;
        this.A00 = 0;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        if (copyOnWriteArrayList.get(0) != null) {
            Collection values = this.A04.A02.values();
            if (values instanceof List) {
                A1F = (List) values;
            } else {
                A1F = AbstractC166987dD.A1F(values);
            }
            Iterator it = Collections.unmodifiableList(A1F).iterator();
            while (it.hasNext()) {
                ((C55982hj) it.next()).A09(this.A02);
            }
            ((C55982hj) copyOnWriteArrayList.get(this.A00)).A09(this.A03);
        }
    }

    public final void A01(InterfaceC55932he interfaceC55932he) {
        C55982hj A02 = this.A04.A02();
        A02.A0A(this);
        A02.A09(this.A02);
        this.A01.add(A02);
        this.A05.add(interfaceC55932he);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        ((InterfaceC55932he) this.A05.get(this.A01.indexOf(c55982hj))).Dnj(c55982hj);
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        ((InterfaceC55932he) this.A05.get(this.A01.indexOf(c55982hj))).Dnk(c55982hj);
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
        ((InterfaceC55932he) this.A05.get(this.A01.indexOf(c55982hj))).Dnl(c55982hj);
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        int i;
        int i2;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int indexOf = copyOnWriteArrayList.indexOf(c55982hj);
        InterfaceC55932he interfaceC55932he = (InterfaceC55932he) this.A05.get(indexOf);
        int i3 = this.A00;
        if (indexOf == i3) {
            i2 = indexOf - 1;
            i = indexOf + 1;
        } else {
            if (indexOf < i3) {
                i2 = indexOf - 1;
                if (i2 > -1 && i2 < copyOnWriteArrayList.size()) {
                    ((C55982hj) copyOnWriteArrayList.get(i2)).A06(c55982hj.A09.A00);
                }
                interfaceC55932he.Dnm(c55982hj);
            }
            if (indexOf > i3) {
                i = indexOf + 1;
                i2 = -1;
            }
            interfaceC55932he.Dnm(c55982hj);
        }
        if (i > -1 && i < copyOnWriteArrayList.size()) {
            ((C55982hj) copyOnWriteArrayList.get(i)).A06(c55982hj.A09.A00);
        }
        if (i2 > -1) {
            ((C55982hj) copyOnWriteArrayList.get(i2)).A06(c55982hj.A09.A00);
        }
        interfaceC55932he.Dnm(c55982hj);
    }

    public C48214LVo(C55942hf c55942hf, C55942hf c55942hf2) {
        this.A04 = C55952hg.A00();
        this.A05 = new CopyOnWriteArrayList();
        this.A01 = new CopyOnWriteArrayList();
        this.A00 = -1;
        this.A03 = c55942hf;
        this.A02 = c55942hf2;
        C47938LFn c47938LFn = A07;
        int i = A06;
        A06 = i + 1;
        c47938LFn.A00(c55942hf, AnonymousClass001.A0O("main spring ", i));
        int i2 = A06;
        A06 = i2 + 1;
        c47938LFn.A00(c55942hf2, AnonymousClass001.A0O("attachment spring ", i2));
    }

    public C48214LVo() {
        this(C55942hf.A04(40.0d, 6.0d), C55942hf.A04(70.0d, 10.0d));
    }
}
