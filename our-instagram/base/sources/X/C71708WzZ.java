package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.WzZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71708WzZ implements SerialDescriptor, C3Sr {
    public final int A00;
    public final String A01;
    public final InterfaceC09390do A02;
    public final String[] A03;
    public final SerialDescriptor[] A04;
    public final SerialDescriptor[] A05;
    public final List A06;
    public final Map A07;
    public final java.util.Set A08;
    public final C3RG A09;
    public final List[] A0A;
    public final boolean[] A0B;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B0t(String str) {
        C14360o3.A0B(str, 0);
        Number number = (Number) this.A07.get(str);
        if (number != null) {
            return number.intValue();
        }
        return -3;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C71708WzZ) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C14360o3.A0K(this.A01, serialDescriptor.BtR()) && Arrays.equals(this.A05, ((C71708WzZ) obj).A05) && (i = this.A00) == serialDescriptor.B10()) {
                for (int i2 = 0; i2 < i; i2++) {
                    SerialDescriptor[] serialDescriptorArr = this.A04;
                    if (C14360o3.A0K(serialDescriptorArr[i2].BtR(), serialDescriptor.B0r(i2).BtR()) && C14360o3.A0K(serialDescriptorArr[i2].BKw(), serialDescriptor.B0r(i2).BKw())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List B0p(int i) {
        return this.A0A[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor B0r(int i) {
        return this.A04[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String B0v(int i) {
        return this.A03[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B10() {
        return this.A00;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final C3RG BKw() {
        return this.A09;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String BtR() {
        return this.A01;
    }

    @Override // X.C3Sr
    public final java.util.Set BtS() {
        return this.A08;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CSy(int i) {
        return this.A0B[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CZW() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.A06;
    }

    public final int hashCode() {
        return AbstractC167027dH.A01(this.A02);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC001800i.A0P(", ", AnonymousClass001.A0C(this.A01, '('), ")", C17s.A0C(0, this.A00), new C71680WyY(this, 6));
    }

    public C71708WzZ(String str, List list, C69634Vsb c69634Vsb, C3RG c3rg, int i) {
        this.A01 = str;
        this.A09 = c3rg;
        this.A00 = i;
        this.A06 = c69634Vsb.A00;
        List list2 = c69634Vsb.A03;
        this.A08 = AbstractC001800i.A0V(list2);
        int i2 = 0;
        String[] A1b = AbstractC31173DnH.A1b(list2, 0);
        this.A03 = A1b;
        this.A04 = AbstractC192728gE.A02(c69634Vsb.A02);
        this.A0A = (List[]) c69634Vsb.A01.toArray(new List[0]);
        List list3 = c69634Vsb.A04;
        C14360o3.A0B(list3, 0);
        boolean[] zArr = new boolean[list3.size()];
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.A0B = zArr;
        C16900si A0L = AbstractC009903n.A0L(A1b);
        ArrayList A0q = AbstractC167017dG.A0q(A0L);
        Iterator it2 = A0L.iterator();
        while (it2.hasNext()) {
            C0eP c0eP = (C0eP) it2.next();
            AbstractC166997dE.A1R(c0eP.A01, Integer.valueOf(c0eP.A00), A0q);
        }
        this.A07 = AbstractC06930Yk.A08(A0q);
        this.A05 = AbstractC192728gE.A02(list);
        this.A02 = AbstractC09440dt.A01(new C71678WyW(this, 4));
    }
}
