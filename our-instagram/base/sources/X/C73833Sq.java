package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3Sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C73833Sq implements SerialDescriptor, C3Sr {
    public int A00 = -1;
    public Map A01;
    public final int A02;
    public final String A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC73823Sp A07;
    public final String[] A08;
    public final List[] A09;
    public final boolean[] A0A;

    public final void A00(String str) {
        A01(str, false);
    }

    public final void A01(String str, boolean z) {
        C14360o3.A0B(str, 0);
        String[] strArr = this.A08;
        int i = this.A00 + 1;
        this.A00 = i;
        strArr[i] = str;
        this.A0A[i] = z;
        this.A09[i] = null;
        if (i == this.A02 - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.A01 = hashMap;
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B0t(String str) {
        C14360o3.A0B(str, 0);
        Number number = (Number) this.A01.get(str);
        if (number != null) {
            return number.intValue();
        }
        return -3;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C73833Sq) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C14360o3.A0K(this.A03, serialDescriptor.BtR()) && Arrays.equals((Object[]) this.A06.getValue(), (Object[]) ((C73833Sq) obj).A06.getValue()) && (i = this.A02) == serialDescriptor.B10()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (C14360o3.A0K(B0r(i2).BtR(), serialDescriptor.B0r(i2).BtR()) && C14360o3.A0K(B0r(i2).BKw(), serialDescriptor.B0r(i2).BKw())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List B0p(int i) {
        List list = this.A09[i];
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor B0r(int i) {
        if (this instanceof C3TD) {
            return ((SerialDescriptor[]) ((C3TD) this).A00.getValue())[i];
        }
        return ((C3R9[]) this.A05.getValue())[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String B0v(int i) {
        return this.A08[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B10() {
        return this.A02;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final C3RG BKw() {
        if (this instanceof C3TD) {
            return ((C3TD) this).A01;
        }
        return C3TE.A00;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String BtR() {
        return this.A03;
    }

    @Override // X.C3Sr
    public final java.util.Set BtS() {
        return this.A01.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CSy(int i) {
        return this.A0A[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CZW() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return C16930sl.A00;
    }

    public int hashCode() {
        return ((Number) this.A04.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        if (this instanceof C100804fj) {
            return true;
        }
        return false;
    }

    public String toString() {
        return AbstractC001800i.A0P(", ", AnonymousClass001.A0C(this.A03, '('), ")", C17s.A0C(0, this.A02), new InterfaceC16660sJ() { // from class: X.Wym
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj) {
                C73833Sq c73833Sq = C73833Sq.this;
                int intValue = ((Number) obj).intValue();
                return AnonymousClass001.A0g(c73833Sq.A08[intValue], ": ", c73833Sq.B0r(intValue).BtR());
            }
        });
    }

    public C73833Sq(String str, InterfaceC73823Sp interfaceC73823Sp, int i) {
        this.A03 = str;
        this.A07 = interfaceC73823Sp;
        this.A02 = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.A08 = strArr;
        this.A09 = new List[i];
        this.A0A = new boolean[i];
        this.A01 = AbstractC06930Yk.A0E();
        EnumC09460dv enumC09460dv = EnumC09460dv.A03;
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new InterfaceC16820sZ() { // from class: X.3Ss
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C3R9[] childSerializers;
                InterfaceC73823Sp interfaceC73823Sp2 = C73833Sq.this.A07;
                if (interfaceC73823Sp2 == null || (childSerializers = interfaceC73823Sp2.childSerializers()) == null) {
                    return AbstractC54355O0n.A00;
                }
                return childSerializers;
            }
        });
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new InterfaceC16820sZ() { // from class: X.3St
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                ArrayList arrayList;
                C3R9[] typeParametersSerializers;
                InterfaceC73823Sp interfaceC73823Sp2 = C73833Sq.this.A07;
                if (interfaceC73823Sp2 != null && (typeParametersSerializers = interfaceC73823Sp2.typeParametersSerializers()) != null) {
                    arrayList = new ArrayList(typeParametersSerializers.length);
                    for (C3R9 c3r9 : typeParametersSerializers) {
                        arrayList.add(c3r9.getDescriptor());
                    }
                } else {
                    arrayList = null;
                }
                return AbstractC192728gE.A02(arrayList);
            }
        });
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new InterfaceC16820sZ() { // from class: X.3Su
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C73833Sq c73833Sq = C73833Sq.this;
                return Integer.valueOf(AbstractC68613VXo.A00(c73833Sq, (SerialDescriptor[]) c73833Sq.A06.getValue()));
            }
        });
    }
}
