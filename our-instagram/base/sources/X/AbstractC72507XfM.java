package X;

import com.hierynomus.asn1.types.constructed.ASN1Sequence;
import com.hierynomus.asn1.types.constructed.ASN1Set;
import com.hierynomus.asn1.types.constructed.ASN1TaggedObject;
import com.hierynomus.asn1.types.primitive.ASN1Boolean;
import com.hierynomus.asn1.types.primitive.ASN1Enumerated;
import com.hierynomus.asn1.types.primitive.ASN1Integer;
import com.hierynomus.asn1.types.primitive.ASN1Null;
import com.hierynomus.asn1.types.primitive.ASN1ObjectIdentifier;
import com.hierynomus.asn1.types.string.ASN1BitString;
import com.hierynomus.asn1.types.string.ASN1OctetString;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;

/* renamed from: X.XfM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72507XfM {
    public Y4A A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC72507XfM abstractC72507XfM = (AbstractC72507XfM) obj;
            if (this.A00 == abstractC72507XfM.A00) {
                if (A00() != null) {
                    return A00().equals(abstractC72507XfM.A00());
                }
                return abstractC72507XfM.A00() == null;
            }
        }
        return false;
    }

    public final Object A00() {
        if (this instanceof ASN1OctetString) {
            byte[] bArr = ((XZ9) this).A00;
            return Arrays.copyOf(bArr, bArr.length);
        }
        if (this instanceof ASN1BitString) {
            return BitSet.valueOf(((XZ9) this).A00);
        }
        if (this instanceof ASN1ObjectIdentifier) {
            return ((ASN1ObjectIdentifier) this).A00;
        }
        if (this instanceof ASN1Null) {
            return null;
        }
        if (this instanceof ASN1Integer) {
            return ((ASN1Integer) this).A00;
        }
        if (this instanceof ASN1Enumerated) {
            return ((ASN1Enumerated) this).A00;
        }
        if (this instanceof ASN1Boolean) {
            return Boolean.valueOf(((ASN1Boolean) this).A00);
        }
        if (this instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) this;
            try {
                return new C72339Xbb(aSN1TaggedObject.A00, aSN1TaggedObject.A01).A00();
            } catch (YK5 e) {
                throw new RuntimeException(String.format("Unable to parse the explicit Tagged Object with %s, it might be implicit", ((AbstractC72507XfM) aSN1TaggedObject).A00), e);
            }
        }
        if (this instanceof ASN1Set) {
            return new HashSet(((ASN1Set) this).A01);
        }
        return AbstractC166987dD.A1F(((ASN1Sequence) this).A01);
    }

    public final int hashCode() {
        return this.A00.A00;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(AbstractC31173DnH.A0q(this));
        A1C.append("[");
        A1C.append(A00());
        return AbstractC58319PtB.A0w(A1C);
    }
}
