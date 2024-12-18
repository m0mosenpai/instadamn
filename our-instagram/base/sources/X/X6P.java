package X;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes11.dex */
public final class X6P extends C3TB {
    public List A00;
    public final Map A01;
    public final Map A02;
    public final InterfaceC09390do A03;
    public final InterfaceC16510rw A04;

    @Override // X.C3TB
    public final InterfaceC16510rw A00() {
        return this.A04;
    }

    @Override // X.C3TB
    public final C3RB A01(String str, C3T8 c3t8) {
        C3RB c3rb = (C3RB) this.A02.get(str);
        if (c3rb == null) {
            return super.A01(str, c3t8);
        }
        return c3rb;
    }

    @Override // X.C3TB
    public final C3RA A02(Object obj, Encoder encoder) {
        C3RA c3ra = (C3RA) this.A01.get(AbstractC25229BEm.A0r(obj));
        if (c3ra == null) {
            C3RA A02 = super.A02(obj, encoder);
            if (A02 == null) {
                return null;
            }
            return A02;
        }
        return c3ra;
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A03.getValue();
    }

    public X6P(final String str, InterfaceC16510rw interfaceC16510rw, Annotation[] annotationArr, InterfaceC16510rw[] interfaceC16510rwArr, C3R9[] c3r9Arr) {
        this.A04 = interfaceC16510rw;
        this.A00 = C16930sl.A00;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A03, new InterfaceC16820sZ() { // from class: X.Wyg
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                String str2 = str;
                X6P x6p = this;
                int A1Y = AbstractC25229BEm.A1Y(x6p);
                return AbstractC70142W6u.A00(str2, new C71680WyY(x6p, 5), X6M.A00, new SerialDescriptor[A1Y]);
            }
        });
        int length = interfaceC16510rwArr.length;
        int length2 = c3r9Arr.length;
        if (length == length2) {
            int min = Math.min(length, length2);
            ArrayList arrayList = new ArrayList(min);
            for (int i = 0; i < min; i++) {
                AbstractC166997dE.A1R(interfaceC16510rwArr[i], c3r9Arr[i], arrayList);
            }
            Map A08 = AbstractC06930Yk.A08(arrayList);
            this.A01 = A08;
            java.util.Set<Map.Entry> entrySet = A08.entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : entrySet) {
                String BtR = ((C3R9) entry.getValue()).getDescriptor().BtR();
                Object obj = linkedHashMap.get(BtR);
                if (obj == null) {
                    linkedHashMap.containsKey(BtR);
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 == null) {
                    linkedHashMap.put(BtR, entry);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple sealed subclasses of '");
                    sb.append(this.A04);
                    sb.append("' have the same serial name '");
                    sb.append(BtR);
                    sb.append("': '");
                    sb.append(entry2.getKey());
                    sb.append("', '");
                    sb.append(entry.getKey());
                    sb.append('\'');
                    throw new IllegalStateException(sb.toString());
                }
            }
            LinkedHashMap A0y = AbstractC43594JPz.A0y(linkedHashMap);
            Iterator A14 = AbstractC166997dE.A14(linkedHashMap);
            while (A14.hasNext()) {
                Map.Entry entry3 = (Map.Entry) A14.next();
                A0y.put(entry3.getKey(), ((Map.Entry) entry3.getValue()).getValue());
            }
            this.A02 = A0y;
            this.A00 = AbstractC06960Yn.A0S(annotationArr);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0g("All subclasses of sealed class ", AbstractC13230m9.A01(((C0YZ) this.A04).A00), " should be marked @Serializable"));
    }
}
