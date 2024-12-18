package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2Tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50452Tp extends AbstractC50462Tq implements Serializable {
    public final int A00;
    public final String A01;
    public final MessageDigest A02;
    public final boolean A03;

    public C50452Tp() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.A02 = messageDigest;
            this.A00 = messageDigest.getDigestLength();
            this.A01 = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.A03 = z;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // X.AbstractC50462Tq
    public final C50502Tv A02() {
        if (this.A03) {
            try {
                return new C50502Tv((MessageDigest) this.A02.clone(), this.A00);
            } catch (CloneNotSupportedException unused) {
            }
        }
        try {
            return new C50502Tv(MessageDigest.getInstance(this.A02.getAlgorithm()), this.A00);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.A01;
    }
}
