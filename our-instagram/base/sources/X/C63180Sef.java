package X;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.Sef, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63180Sef {
    public final int A00;
    public final int A01;
    public final InterfaceC65434Tk5 A02;
    public final java.util.Set A03;
    public final java.util.Set A04;
    public final java.util.Set A05;

    public static void A01(Class cls, Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(A00(cls, obj, new Class[0]));
    }

    public static C63180Sef A00(Class cls, final Object obj, Class... clsArr) {
        return C63194Sew.A01(new C63194Sew(cls, clsArr), new InterfaceC65434Tk5(obj) { // from class: X.T9R
            public final Object A00;

            {
                this.A00 = obj;
            }

            @Override // X.InterfaceC65434Tk5
            public final Object ALR(AbstractC61607RqW abstractC61607RqW) {
                return this.A00;
            }
        });
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("Component<");
        A0s.append(Arrays.toString(this.A04.toArray()));
        A0s.append(">{");
        A0s.append(this.A00);
        A0s.append(", type=");
        A0s.append(this.A01);
        A0s.append(", deps=");
        return AbstractC50523MSb.A0W(Arrays.toString(this.A03.toArray()), A0s);
    }

    public C63180Sef(InterfaceC65434Tk5 interfaceC65434Tk5, java.util.Set set, java.util.Set set2, java.util.Set set3, int i, int i2) {
        this.A04 = Collections.unmodifiableSet(set);
        this.A03 = Collections.unmodifiableSet(set2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = interfaceC65434Tk5;
        this.A05 = Collections.unmodifiableSet(set3);
    }
}
