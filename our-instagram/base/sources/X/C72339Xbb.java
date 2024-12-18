package X;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.util.Iterator;

/* renamed from: X.Xbb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72339Xbb extends FilterInputStream implements Iterable {
    public final C72860XpM A00;

    public C72339Xbb(C72860XpM c72860XpM, byte[] bArr) {
        super(new ByteArrayInputStream(bArr));
        this.A00 = c72860XpM;
    }

    public final AbstractC72507XfM A00() {
        try {
            C72860XpM c72860XpM = this.A00;
            Y4A A01 = c72860XpM.A01(this);
            return A01.A01(c72860XpM).A00(A01, c72860XpM.A02(this, c72860XpM.A00(this)));
        } catch (YK5 e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(String.format("Cannot parse ASN.1 object from stream", new Object[0]), e2);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new YJ1(this);
    }
}
