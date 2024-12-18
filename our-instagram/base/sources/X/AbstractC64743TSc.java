package X;

import java.util.Iterator;

/* renamed from: X.TSc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64743TSc implements Iterator {
    public Integer A00 = C05F.A01;
    public Object A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i;
        Integer num = this.A00;
        Integer num2 = C05F.A0N;
        C18C.A0F(AbstractC25229BEm.A1a(num, num2));
        int intValue = num.intValue();
        if (intValue == 2) {
            return false;
        }
        if (intValue == 0) {
            return true;
        }
        this.A00 = num2;
        RPa rPa = (RPa) this;
        int i2 = rPa.A01;
        while (true) {
            int i3 = rPa.A01;
            if (i3 != -1) {
                AbstractC64290T7z abstractC64290T7z = rPa.A04.A00;
                CharSequence charSequence = rPa.A03;
                int A05 = abstractC64290T7z.A05(charSequence, i3);
                if (A05 == -1) {
                    A05 = charSequence.length();
                    rPa.A01 = -1;
                    i = -1;
                } else {
                    i = A05 + 1;
                    rPa.A01 = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    rPa.A01 = i4;
                    if (i4 > charSequence.length()) {
                        rPa.A01 = -1;
                    }
                } else {
                    while (i2 < A05 && rPa.A02.A09(charSequence.charAt(i2))) {
                        i2++;
                    }
                    while (A05 > i2 && rPa.A02.A09(charSequence.charAt(A05 - 1))) {
                        A05--;
                    }
                    int i5 = rPa.A00;
                    if (i5 == 1) {
                        A05 = charSequence.length();
                        rPa.A01 = -1;
                        while (A05 > i2 && rPa.A02.A09(charSequence.charAt(A05 - 1))) {
                            A05--;
                        }
                    } else {
                        rPa.A00 = i5 - 1;
                    }
                    str = charSequence.subSequence(i2, A05).toString();
                }
            } else {
                ((AbstractC64743TSc) rPa).A00 = C05F.A0C;
                str = null;
                break;
            }
        }
        this.A01 = str;
        if (this.A00 == C05F.A0C) {
            return false;
        }
        this.A00 = C05F.A00;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.A00 = C05F.A01;
            Object obj = this.A01;
            this.A01 = null;
            return obj;
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC43592JPx.A11();
    }
}
