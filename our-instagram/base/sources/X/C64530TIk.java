package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: X.TIk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64530TIk implements Comparable, Serializable {
    public static final char[] A02 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final byte[] A00;
    public transient int A01;

    public C64530TIk(byte[] bArr) {
        C14360o3.A0B(bArr, 1);
        this.A00 = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        int length2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C64530TIk) && (length = (bArr = ((C64530TIk) obj).A00).length) == (length2 = (bArr2 = this.A00).length) && 0 <= length - length2 && 0 <= length2 - length2) {
            for (int i = 0; i < length2; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final byte[] A00() {
        return (byte[]) this.A00.clone();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C64530TIk c64530TIk = (C64530TIk) obj;
        C14360o3.A0B(c64530TIk, 0);
        byte[] bArr = this.A00;
        int length = bArr.length;
        byte[] bArr2 = c64530TIk.A00;
        int length2 = bArr2.length;
        int min = Math.min(length, length2);
        for (int i = 0; i < min; i++) {
            int i2 = bArr[i] & 255;
            int i3 = bArr2[i] & 255;
            if (i2 != i3) {
                if (i2 < i3) {
                    return -1;
                }
                return 1;
            }
        }
        if (length == length2) {
            return 0;
        }
        if (length < length2) {
            return -1;
        }
        return 1;
    }

    public final int hashCode() {
        int i = this.A01;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.A00);
            this.A01 = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        Object[] copyOf;
        String str;
        byte[] bArr = this.A00;
        int length = bArr.length;
        if (length == 0) {
            return "ByteString[size=0]";
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(length);
        if (length <= 16) {
            char[] cArr = new char[length * 2];
            int i = 0;
            for (byte b : bArr) {
                int i2 = i + 1;
                char[] cArr2 = A02;
                AbstractC58318PtA.A1Z(cArr2, cArr, b >> 4, i);
                i = i2 + 1;
                AbstractC58318PtA.A1Z(cArr2, cArr, b, i2);
            }
            objArr[1] = new String(cArr);
            copyOf = Arrays.copyOf(objArr, 2);
            str = "ByteString[size=%s data=%s]";
        } else {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
                byte[] bArr2 = S5W.A00(Arrays.copyOf(digest, digest.length)).A00;
                char[] cArr3 = new char[bArr2.length * 2];
                int i3 = 0;
                for (byte b2 : bArr2) {
                    int i4 = i3 + 1;
                    char[] cArr4 = A02;
                    AbstractC58318PtA.A1Z(cArr4, cArr3, b2 >> 4, i3);
                    i3 = i4 + 1;
                    AbstractC58318PtA.A1Z(cArr4, cArr3, b2, i4);
                }
                objArr[1] = new String(cArr3);
                copyOf = Arrays.copyOf(objArr, 2);
                str = "ByteString[size=%s md5=%s]";
            } catch (NoSuchAlgorithmException e) {
                throw AbstractC58318PtA.A0W(e);
            }
        }
        return AbstractC166997dE.A0z(str, copyOf);
    }
}
