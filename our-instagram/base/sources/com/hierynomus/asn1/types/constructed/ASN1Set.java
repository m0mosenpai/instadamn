package com.hierynomus.asn1.types.constructed;

import X.AbstractC72507XfM;
import X.Y4A;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes12.dex */
public final class ASN1Set extends AbstractC72507XfM implements Iterable {
    public byte[] A00;
    public final Set A01;

    public ASN1Set(Set set, byte[] bArr) {
        super.A00 = Y4A.A0D;
        this.A01 = set;
        this.A00 = bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new HashSet(this.A01).iterator();
    }
}
