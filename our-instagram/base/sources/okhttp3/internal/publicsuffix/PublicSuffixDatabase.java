package okhttp3.internal.publicsuffix;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AnonymousClass001;
import X.C63220SfQ;
import X.C64845TWl;
import X.C64847TWn;
import X.TWW;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class PublicSuffixDatabase {
    public static final byte EXCEPTION_MARKER = 33;
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    public byte[] publicSuffixExceptionListBytes;
    public byte[] publicSuffixListBytes;
    public static final byte[] WILDCARD_LABEL = {42};
    public static final String[] EMPTY_RULE = new String[0];
    public static final String[] PREVAILING_RULE = {"*"};
    public static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    public final AtomicBoolean listRead = AbstractC166997dE.A17();
    public final CountDownLatch readCompleteLatch = AbstractC58319PtB.A15();

    public static String binarySearchBytes(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = (i3 + length) / 2;
            while (i4 > -1 && bArr[i4] != 10) {
                i4--;
            }
            int i5 = i4 + 1;
            int i6 = 1;
            do {
                i2 = i5 + i6;
                i6++;
            } while (bArr[i2] != 10);
            int i7 = i2 - i5;
            int i8 = i;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = bArr2[i8][i9] & 255;
                while (true) {
                    int i12 = i11 - (bArr[i5 + i10] & 255);
                    if (i12 != 0) {
                        if (i12 < 0) {
                        }
                    } else {
                        i10++;
                        i9++;
                        if (i10 != i7) {
                            if (bArr2[i8].length == i9) {
                                if (i8 == bArr2.length - 1) {
                                    break;
                                }
                                i8++;
                                i9 = -1;
                                i11 = 46;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            int i13 = i7 - i10;
            int length2 = bArr2[i8].length - i9;
            while (true) {
                i8++;
                if (i8 >= bArr2.length) {
                    break;
                }
                length2 += bArr2[i8].length;
            }
            if (length2 < i13) {
                length = i5 - 1;
            } else {
                if (length2 <= i13) {
                    return AbstractC58318PtA.A0n(StandardCharsets.UTF_8, bArr, i5, i7);
                }
                i3 = i2 + 1;
            }
        }
        return null;
    }

    private void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    C63220SfQ.A01.A03("Failed to read public suffix list", e, 5);
                }
            } finally {
                if (z) {
                    AbstractC58318PtA.A18();
                }
            }
        }
    }

    private String[] findMatchingRule(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                AbstractC58318PtA.A18();
            }
        }
        synchronized (this) {
            if (this.publicSuffixListBytes == null) {
                throw AbstractC166987dD.A14("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = strArr[i2].getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 < length) {
                str2 = binarySearchBytes(this.publicSuffixListBytes, bArr, i3);
                if (str2 != null) {
                    break;
                }
                i3++;
            } else {
                str2 = null;
                break;
            }
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = WILDCARD_LABEL;
                str3 = binarySearchBytes(this.publicSuffixListBytes, bArr2, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String binarySearchBytes = binarySearchBytes(this.publicSuffixExceptionListBytes, bArr, i);
                if (binarySearchBytes != null) {
                    str = binarySearchBytes;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return AnonymousClass001.A0R("!", str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        if (str2 != null) {
            strArr2 = str2.split("\\.");
        } else {
            strArr2 = EMPTY_RULE;
        }
        if (str3 != null) {
            strArr3 = str3.split("\\.");
        } else {
            strArr3 = EMPTY_RULE;
        }
        if (strArr2.length > strArr3.length) {
            return strArr2;
        }
        return strArr3;
    }

    public static PublicSuffixDatabase get() {
        return instance;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Sb2, java.lang.Object] */
    private void readTheList() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream != null) {
            TWW tww = new TWW(new C64847TWn(new C64845TWl(resourceAsStream, new Object())));
            try {
                byte[] bArr = new byte[tww.readInt()];
                tww.readFully(bArr);
                byte[] bArr2 = new byte[tww.readInt()];
                tww.readFully(bArr2);
                tww.close();
                synchronized (this) {
                    this.publicSuffixListBytes = bArr;
                    this.publicSuffixExceptionListBytes = bArr2;
                }
                this.readCompleteLatch.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        tww.close();
                        throw th2;
                    } catch (Throwable th3) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th3);
                        throw th2;
                    }
                }
            }
        }
    }

    public String getEffectiveTldPlusOne(String str) {
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] findMatchingRule = findMatchingRule(split);
            int length = split.length;
            int length2 = findMatchingRule.length;
            if (length == length2 && findMatchingRule[0].charAt(0) != '!') {
                return null;
            }
            int i = length2 + 1;
            if (findMatchingRule[0].charAt(0) == '!') {
                i = length2;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            String[] split2 = str.split("\\.");
            for (int i2 = length - i; i2 < split2.length; i2++) {
                A1C.append(split2[i2]);
                A1C.append('.');
            }
            A1C.deleteCharAt(A1C.length() - 1);
            return A1C.toString();
        }
        throw AbstractC166987dD.A15("domain == null");
    }

    public void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
