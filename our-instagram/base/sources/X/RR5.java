package X;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.RegularImmutableMultiset;

/* loaded from: classes10.dex */
public class RR5 extends AbstractC24851Je {
    public C63033Sb7 A00;
    public boolean A01 = false;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.Sb7] */
    public RR5() {
        ?? obj = new Object();
        obj.A09(4, 1.0f);
        this.A00 = obj;
    }

    @Override // X.AbstractC24851Je
    public /* bridge */ /* synthetic */ AbstractC24851Je add(Object element) {
        if (this instanceof RRL) {
            ((RRL) this).A04(element, 1);
            return this;
        }
        A02(element, 1);
        return this;
    }

    @Override // X.AbstractC24851Je
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final ImmutableMultiset build() {
        if (this instanceof RRL) {
            return ((RRL) this).build();
        }
        this.A00.getClass();
        C63033Sb7 c63033Sb7 = this.A00;
        if (c63033Sb7.A02 == 0) {
            return RegularImmutableMultiset.A03;
        }
        this.A01 = true;
        return new RegularImmutableMultiset(c63033Sb7);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.Sb7] */
    public final void A02(Object element, int occurrences) {
        int i;
        if (this instanceof RRL) {
            ((RRL) this).A04(element, occurrences);
            return;
        }
        this.A00.getClass();
        if (occurrences == 0) {
            return;
        }
        if (this.A01) {
            C63033Sb7 c63033Sb7 = this.A00;
            ?? obj = new Object();
            obj.A09(c63033Sb7.A02, 1.0f);
            for (int A02 = c63033Sb7.A02(); A02 != -1; A02 = c63033Sb7.A03(A02)) {
                C18C.A01(A02, c63033Sb7.A02);
                Object obj2 = c63033Sb7.A06[A02];
                C18C.A01(A02, c63033Sb7.A02);
                obj.A0A(obj2, c63033Sb7.A05[A02]);
            }
            this.A00 = obj;
        }
        this.A01 = false;
        element.getClass();
        C63033Sb7 c63033Sb72 = this.A00;
        int A05 = c63033Sb72.A05(element);
        if (A05 == -1) {
            i = 0;
        } else {
            i = c63033Sb72.A05[A05];
        }
        c63033Sb72.A0A(element, occurrences + i);
    }
}
