package X;

import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SQ5 {
    public C62496SDy A00;
    public TI5 A01;
    public AbstractC63035SbA A02;
    public C64520THn A03;
    public RBK A04;
    public HashMap A05;
    public HashSet A06;
    public HashSet A07;
    public List A08;
    public boolean A09;
    public final C912845h A0A;
    public final AnonymousClass469 A0B;
    public final C45B A0C;
    public final Map A0D = AbstractC166987dD.A1I();

    /* JADX WARN: Type inference failed for: r7v1, types: [com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.deser.BeanDeserializer] */
    public final BeanDeserializer A00() {
        boolean booleanValue;
        Collection values = this.A0D.values();
        A05(values);
        C912845h c912845h = this.A0A;
        Map A01 = A01(values);
        C45B c45b = this.A0C;
        Boolean A012 = c45b.A00().A01(EnumC61060ReZ.A00);
        if (A012 == null) {
            booleanValue = c912845h.A08(C45Y.A04);
        } else {
            booleanValue = A012.booleanValue();
        }
        C64540TIw c64540TIw = new C64540TIw(values, ((C45T) c912845h).A01.A09, A01, booleanValue);
        Object[] objArr = c64540TIw.A03;
        int length = objArr.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2 += 2) {
            RBV rbv = (RBV) objArr[i2];
            if (rbv != null) {
                rbv.A0H(i);
                i++;
            }
        }
        boolean z = !c912845h.A08(C45Y.A0H);
        if (!z) {
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((RBV) it.next()).A0P()) {
                    z = true;
                    break;
                }
            }
        }
        C64520THn c64520THn = this.A03;
        if (c64520THn != null) {
            c64540TIw = c64540TIw.A03(new R9g(TIH.A08, c64520THn));
        }
        return new BeanDeserializerBase(this, c64540TIw, c45b, this.A05, this.A06, this.A07, this.A09, z);
    }

    public final Map A01(Collection collection) {
        C44W A00 = this.A0A.A00();
        HashMap hashMap = null;
        if (A00 != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                RBV rbv = (RBV) it.next();
                List A0i = A00.A0i(rbv.BSA());
                if (A0i != null && !A0i.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = AbstractC166987dD.A1G();
                    }
                    hashMap.put(rbv.A06.A02, A0i);
                }
            }
            if (hashMap != null) {
                return hashMap;
            }
        }
        return Collections.emptyMap();
    }

    public final void A02(RBV rbv) {
        Map map = this.A0D;
        String str = rbv.A06.A02;
        Object put = map.put(str, rbv);
        if (put != null && put != rbv) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Duplicate property '");
            A1C.append(str);
            A1C.append("' for ");
            throw AbstractC43594JPz.A0n(this.A0C.A05, A1C);
        }
    }

    public final void A03(IllegalArgumentException illegalArgumentException) {
        try {
            this.A0B.A0a(this.A0C, illegalArgumentException.getMessage(), AbstractC58318PtA.A1b());
            throw C00O.createAndThrow();
        } catch (AbstractC102324j7 e) {
            if (e.getCause() == null) {
                e.initCause(illegalArgumentException);
            }
            throw e;
        }
    }

    public final void A04(String str) {
        HashSet hashSet = this.A06;
        if (hashSet == null) {
            hashSet = AbstractC166987dD.A1H();
            this.A06 = hashSet;
        }
        hashSet.add(str);
    }

    public final void A05(Collection collection) {
        C912845h c912845h = this.A0A;
        if (c912845h.A05()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    ((RBV) it.next()).A0J(c912845h);
                } catch (IllegalArgumentException e) {
                    A03(e);
                    throw C00O.createAndThrow();
                }
            }
        }
        TI5 ti5 = this.A01;
        if (ti5 != null) {
            ti5.A04.A0D(c912845h.A07());
        }
        RBK rbk = this.A04;
        if (rbk != null) {
            rbk.A0D(c912845h.A07());
        }
    }

    public SQ5(AnonymousClass469 anonymousClass469, C45B c45b) {
        this.A0C = c45b;
        this.A0B = anonymousClass469;
        this.A0A = anonymousClass469.A02;
    }
}
