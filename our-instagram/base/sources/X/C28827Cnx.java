package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.Cnx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28827Cnx implements InterfaceC1127857k {
    public final /* synthetic */ InterfaceC74963Ym A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C28827Cnx(InterfaceC74963Ym interfaceC74963Ym, Integer num, boolean z, boolean z2) {
        this.A00 = interfaceC74963Ym;
        this.A02 = z;
        this.A01 = num;
        this.A03 = z2;
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A00(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A01(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        String A00;
        InterfaceC1131559d interfaceC1131559d;
        C59W c59w;
        Object obj;
        AbstractC167007dF.A1K(c59z, list);
        int A01 = Constraints.A01(j);
        int A002 = Constraints.A00(j);
        long A04 = Constraints.A04(0, A01, 0, A002);
        int EL8 = c59z.EL8(8.0f);
        int EL82 = c59z.EL8(6.0f);
        int EL83 = c59z.EL8(8.0f);
        int i = -EL83;
        int i2 = i - EL8;
        long A06 = C5AU.A06(A04, 0, i2);
        Iterator it = list.iterator();
        do {
            boolean hasNext = it.hasNext();
            A00 = MSV.A00(1);
            if (hasNext) {
                interfaceC1131559d = (InterfaceC1131559d) it.next();
            } else {
                throw new NoSuchElementException(A00);
            }
        } while (!C14360o3.A0K(CBL.A00(interfaceC1131559d), "Label"));
        C59W CpF = interfaceC1131559d.CpF(A06);
        int AX8 = CpF.AX8(AbstractC122945hV.A01);
        if (AX8 == Integer.MIN_VALUE) {
            AX8 = CpF.A00;
        }
        int A012 = C1H4.A01(AX8 * 0.75f);
        int A03 = Constraints.A03(j);
        long A062 = C5AU.A06(Constraints.A04(A03, A01, 0, A002), 0, ((i - EL82) - A012) - EL8);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC1131559d interfaceC1131559d2 = (InterfaceC1131559d) it2.next();
            if (C14360o3.A0K(CBL.A00(interfaceC1131559d2), "TextField")) {
                C59W CpF2 = interfaceC1131559d2.CpF(A062);
                int max = Math.max(CpF2.A01, Math.max(CpF.A01, A03));
                int max2 = Math.max(A012 + EL8 + EL82 + CpF2.A00 + EL83, Constraints.A02(j));
                long A063 = C5AU.A06(A04, 0, i2);
                Iterator it3 = list.iterator();
                while (true) {
                    c59w = null;
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (C14360o3.A0K(CBL.A00((InterfaceC1131559d) obj), "CharacterCount")) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                InterfaceC1131559d interfaceC1131559d3 = (InterfaceC1131559d) obj;
                if (interfaceC1131559d3 != null) {
                    c59w = interfaceC1131559d3.CpF(A063);
                }
                return AbstractC25229BEm.A0Z(c59z, new DIV(this.A00, CpF2, CpF, c59w, this.A01, max2, EL83, EL8, max, this.A02, this.A03), max, max2);
            }
        }
        throw new NoSuchElementException(A00);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A02(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A03(interfaceC1131259a, this, list, i);
    }
}
