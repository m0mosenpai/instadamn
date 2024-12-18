package X;

import com.hierynomus.asn1.types.constructed.ASN1Sequence;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes12.dex */
public abstract class XZ9 extends AbstractC72507XfM implements Iterable {
    public byte[] A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.XpM, java.lang.Object] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (super.A00.A01 == EnumC72354Xbq.Constructed) {
            Y4A y4a = Y4A.A0C;
            return ((ASN1Sequence) y4a.A01(new Object()).A00(y4a, this.A00)).iterator();
        }
        return Collections.singletonList(this).iterator();
    }
}
