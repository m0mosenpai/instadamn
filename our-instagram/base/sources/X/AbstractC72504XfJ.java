package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.hierynomus.asn1.types.constructed.ASN1Sequence;
import com.hierynomus.asn1.types.constructed.ASN1Set;
import com.hierynomus.asn1.types.primitive.ASN1Enumerated;
import com.hierynomus.asn1.types.primitive.ASN1Null;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.XfJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72504XfJ {
    public C72860XpM A00;

    /* JADX WARN: Type inference failed for: r0v62, types: [X.XfM, java.lang.Object, X.XZ9] */
    /* JADX WARN: Type inference failed for: r0v71, types: [X.XZ4, X.XfM, java.lang.Object, com.hierynomus.asn1.types.primitive.ASN1Integer] */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.XZ4, X.XfM, java.lang.Object, com.hierynomus.asn1.types.primitive.ASN1ObjectIdentifier] */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.XfM, java.lang.Object, X.XZ9] */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.XfM, java.lang.Object, X.XZ9] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.hierynomus.asn1.types.constructed.ASN1TaggedObject, X.XfM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.XZ4, com.hierynomus.asn1.types.primitive.ASN1Boolean, X.XfM, java.lang.Object] */
    public final AbstractC72507XfM A00(Y4A y4a, byte[] bArr) {
        C72339Xbb c72339Xbb;
        int read;
        if (this instanceof C72224XYu) {
            BigInteger bigInteger = new BigInteger(bArr);
            Y4A y4a2 = Y4A.A08;
            ?? obj = new Object();
            obj.A00 = y4a2;
            obj.A00 = bArr;
            obj.A00 = bigInteger;
            return obj;
        }
        if (this instanceof C72219XYp) {
            ArrayList A1E = AbstractC166987dD.A1E();
            try {
                c72339Xbb = new C72339Xbb(this.A00, bArr);
                try {
                    Iterator it = c72339Xbb.iterator();
                    while (it.hasNext()) {
                        A1E.add((AbstractC72507XfM) it.next());
                    }
                    c72339Xbb.close();
                    return new ASN1Sequence(A1E, bArr);
                } finally {
                }
            } catch (IOException e) {
                throw new RuntimeException(String.format("Unable to parse the ASN.1 SEQUENCE contents.", new Object[0]), e);
            }
        } else {
            if (this instanceof C72228XYy) {
                ?? obj2 = new Object();
                obj2.A00 = y4a;
                obj2.A00 = bArr;
                return obj2;
            }
            if (this instanceof C72227XYx) {
                if (AbstractC167007dF.A1X(y4a.A01, EnumC72354Xbq.Constructed)) {
                    C72339Xbb c72339Xbb2 = new C72339Xbb(this.A00, bArr);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (c72339Xbb2.available() > 0) {
                            C72860XpM c72860XpM = c72339Xbb2.A00;
                            Y4A A01 = c72860XpM.A01(c72339Xbb2);
                            Object[] objArr = {A01};
                            if (AbstractC167007dF.A1P(A01.A00, y4a.A00)) {
                                byte[] A02 = c72860XpM.A02(c72339Xbb2, c72860XpM.A00(c72339Xbb2));
                                byteArrayOutputStream.write(A02, 1, A02.length - 1);
                                c72339Xbb2.available();
                            } else {
                                throw AbstractC166987dD.A14(String.format("Expected an ASN.1 BIT STRING as Constructed object, got: %s", objArr));
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ?? obj3 = new Object();
                        obj3.A00 = y4a;
                        obj3.A00 = byteArray;
                        return obj3;
                    } catch (IOException e2) {
                        throw new RuntimeException(String.format("Unable to parse Constructed ASN.1 BIT STRING", new Object[0]), e2);
                    }
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
                ?? obj4 = new Object();
                obj4.A00 = y4a;
                obj4.A00 = copyOfRange;
                return obj4;
            }
            if (this instanceof C72226XYw) {
                Object[] objArr2 = new Object[0];
                if (AbstractC167007dF.A1O(bArr.length)) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    int read2 = byteArrayInputStream.read();
                    A1C.append(read2 / 40);
                    A1C.append('.');
                    int i = read2 % 40;
                    while (true) {
                        A1C.append(i);
                        while (byteArrayInputStream.available() > 0) {
                            i = byteArrayInputStream.read();
                            if (i < 127) {
                                break;
                            }
                            BigInteger valueOf = BigInteger.valueOf(i & StringTreeSet.MAX_SYMBOL_COUNT);
                            do {
                                read = byteArrayInputStream.read();
                                valueOf = valueOf.shiftLeft(7).add(BigInteger.valueOf(read & StringTreeSet.MAX_SYMBOL_COUNT));
                            } while (read > 127);
                            A1C.append('.');
                            A1C.append(valueOf);
                        }
                        String obj5 = A1C.toString();
                        Y4A y4a3 = Y4A.A0A;
                        ?? obj6 = new Object();
                        obj6.A00 = y4a3;
                        obj6.A00 = bArr;
                        obj6.A00 = obj5;
                        return obj6;
                        A1C.append('.');
                    }
                } else {
                    throw AbstractC166987dD.A12(String.format("An ASN.1 OBJECT IDENTIFIER should have at least a one byte value", objArr2));
                }
            } else {
                if (this instanceof C72225XYv) {
                    Object[] objArr3 = new Object[0];
                    if (AbstractC167007dF.A1N(bArr.length)) {
                        return new ASN1Null();
                    }
                    throw AbstractC166987dD.A14(String.format("ASN.1 NULL can not have a value", objArr3));
                }
                if (this instanceof C72223XYt) {
                    return new ASN1Enumerated(new BigInteger(bArr), bArr);
                }
                if (this instanceof C72222XYs) {
                    int length = bArr.length;
                    boolean z = false;
                    boolean A1P = AbstractC167007dF.A1P(length, 1);
                    Object[] A1Y = AbstractC25228BEl.A1Y(length);
                    if (A1P) {
                        if (bArr[0] != 0) {
                            z = true;
                        }
                        Y4A y4a4 = Y4A.A06;
                        ?? obj7 = new Object();
                        obj7.A00 = y4a4;
                        obj7.A00 = bArr;
                        obj7.A00 = z;
                        return obj7;
                    }
                    throw AbstractC166987dD.A14(String.format("Value of ASN1Boolean should have length 1, but was %s", A1Y));
                }
                if (this instanceof C72221XYr) {
                    C72860XpM c72860XpM2 = this.A00;
                    ?? obj8 = new Object();
                    obj8.A00 = y4a;
                    obj8.A01 = bArr;
                    obj8.A00 = c72860XpM2;
                    return obj8;
                }
                HashSet A1H = AbstractC166987dD.A1H();
                try {
                    c72339Xbb = new C72339Xbb(this.A00, bArr);
                    try {
                        Iterator it2 = c72339Xbb.iterator();
                        while (it2.hasNext()) {
                            A1H.add((AbstractC72507XfM) it2.next());
                        }
                        c72339Xbb.close();
                        return new ASN1Set(A1H, bArr);
                    } finally {
                        try {
                            throw th;
                        } finally {
                            try {
                                c72339Xbb.close();
                            } catch (Throwable th) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                            }
                        }
                    }
                } catch (IOException e3) {
                    throw new RuntimeException(String.format("Could not parse ASN.1 SET contents.", new Object[0]), e3);
                }
            }
        }
    }
}
