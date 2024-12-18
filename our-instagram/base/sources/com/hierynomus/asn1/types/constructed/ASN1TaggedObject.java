package com.hierynomus.asn1.types.constructed;

import X.AbstractC166987dD;
import X.AbstractC31173DnH;
import X.AbstractC58319PtB;
import X.AbstractC72507XfM;
import X.C72860XpM;
import X.Y4A;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class ASN1TaggedObject extends AbstractC72507XfM implements Iterable {
    public C72860XpM A00;
    public byte[] A01;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Y4A y4a = Y4A.A0C;
        byte[] bArr = this.A01;
        if (bArr != null) {
            return ((ASN1Sequence) y4a.A01(this.A00).A00(y4a, bArr)).iterator();
        }
        throw new RuntimeException(String.format("Unable to parse the implicit Tagged Object with %s, it is explicit", y4a));
    }

    @Override // X.AbstractC72507XfM
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(AbstractC31173DnH.A0q(this));
        A1C.append("[");
        A1C.append(super.A00);
        A1C.append(",<unknown>");
        return AbstractC58319PtB.A0w(A1C);
    }
}
