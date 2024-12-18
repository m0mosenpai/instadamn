package com.hierynomus.asn1.types.constructed;

import X.AbstractC65702TsY;
import X.AbstractC72507XfM;
import X.Y4A;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class ASN1Sequence extends AbstractC72507XfM implements Iterable {
    public byte[] A00;
    public final List A01;

    public ASN1Sequence(List list, byte[] bArr) {
        super.A00 = Y4A.A0C;
        this.A01 = list;
        this.A00 = bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC65702TsY.A0n(this.A01);
    }
}
