package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.SjZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63404SjZ {
    public static final Method A00;
    public static final Comparator A01;
    public static final TimeZone A02;
    public static final Pattern A03;
    public static final C62878SVc A05;
    public static final THH A06;
    public static final byte[] A07;
    public static final Charset A09;
    public static final Charset A0A;
    public static final TZE A0B;
    public static final String[] A08 = new String[0];
    public static final C63365SiO A04 = C63365SiO.A01(new String[0]);

    /* JADX WARN: Type inference failed for: r1v0, types: [X.TWX, X.TsN, java.lang.Object] */
    static {
        byte[] bArr = new byte[0];
        A07 = bArr;
        Method method = null;
        ?? obj = new Object();
        obj.A0J(bArr, 0);
        A06 = new C65138TeD(obj);
        A05 = new C62878SVc(bArr);
        A0B = TZE.A00(C64531TIl.A01("efbbbf"), C64531TIl.A01("feff"), C64531TIl.A01("fffe"), C64531TIl.A01("0000ffff"), C64531TIl.A01("ffff0000"));
        A09 = Charset.forName("UTF-32BE");
        A0A = Charset.forName("UTF-32LE");
        A02 = TimeZone.getTimeZone("GMT");
        A01 = new TSE(9);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        A00 = method;
        A03 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static int A00(char c) {
        char c2;
        if (c < '0') {
            return -1;
        }
        if (c <= '9') {
            return c - '0';
        }
        char c3 = 'a';
        if (c >= 'a') {
            c2 = 'f';
        } else {
            c3 = 'A';
            if (c < 'A') {
                return -1;
            }
            c2 = 'F';
        }
        if (c <= c2) {
            return (c - c3) + 10;
        }
        return -1;
    }

    public static int A01(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00b7, code lost:
    
        if (r5 == 16) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b9, code lost:
    
        if (r4 == (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00bb, code lost:
    
        r1 = r5 - r4;
        java.lang.System.arraycopy(r10, r4, r10, 16 - r1, r1);
        java.util.Arrays.fill(r10, r4, (16 - r5) + r4, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e7, code lost:
    
        r17 = java.net.InetAddress.getByAddress(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f0, code lost:
    
        throw X.AbstractC58318PtA.A0V();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.TWX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A03(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63404SjZ.A03(java.lang.String):java.lang.String");
    }

    public static String A04(String str, int i, int i2) {
        int i3;
        while (true) {
            if (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    break;
                }
                i++;
            } else {
                i = i2;
                break;
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                char charAt2 = str.charAt(i2);
                if (charAt2 != '\t' && charAt2 != '\n' && charAt2 != '\f' && charAt2 != '\r' && charAt2 != ' ') {
                    i3 = i2 + 1;
                    break;
                }
            } else {
                i3 = i;
                break;
            }
        }
        return str.substring(i, i3);
    }

    public static String A05(C63379Sit c63379Sit, boolean z) {
        String str = c63379Sit.A02;
        if (str.contains(":")) {
            str = AnonymousClass001.A0g("[", str, "]");
        }
        if (z || c63379Sit.A00 != C63379Sit.A00(c63379Sit.A03)) {
            return AnonymousClass001.A0b(str, ":", c63379Sit.A00);
        }
        return str;
    }

    public static C63365SiO A08(List list) {
        SNS sns = new SNS();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63205Sf9 c63205Sf9 = (C63205Sf9) it.next();
            sns.A01(c63205Sf9.A01.A07(), c63205Sf9.A02.A07());
        }
        return new C63365SiO(sns);
    }

    public static void A09(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A0A(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!A0B(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean A0D(C63379Sit c63379Sit, C63379Sit c63379Sit2) {
        if (c63379Sit.A02.equals(c63379Sit2.A02) && c63379Sit.A00 == c63379Sit2.A00 && c63379Sit.A03.equals(c63379Sit2.A03)) {
            return true;
        }
        return false;
    }

    public static int A02(TimeUnit timeUnit, long j) {
        if (j >= 0) {
            long millis = timeUnit.toMillis(j);
            if (millis <= 2147483647L) {
                if (millis == 0 && j > 0) {
                    throw AbstractC167007dF.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, " too small.");
                }
                return (int) millis;
            }
            throw AbstractC167007dF.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, " too large.");
        }
        throw AbstractC167007dF.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, " < 0");
    }

    public static List A06(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static X509TrustManager A07() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw AbstractC31175DnJ.A0V("Unexpected default trust managers:", Arrays.toString(trustManagers));
        } catch (GeneralSecurityException unused) {
            throw AbstractC58318PtA.A0W("No System TLS");
        }
    }

    public static boolean A0B(AssertionError assertionError) {
        if (assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        if (r0 == Long.MAX_VALUE) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        r13.Eq9().A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r13.Eq9().A04(r2 + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r0 != Long.MAX_VALUE) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.TWX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0C(java.util.concurrent.TimeUnit r12, X.InterfaceC65677Tr7 r13, int r14) {
        /*
            long r2 = java.lang.System.nanoTime()
            X.Sb2 r0 = r13.Eq9()
            boolean r0 = r0.A07()
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L2e
            X.Sb2 r0 = r13.Eq9()
            long r0 = r0.A00()
            long r0 = r0 - r2
        L1c:
            X.Sb2 r6 = r13.Eq9()
            long r4 = (long) r14
            long r4 = r12.toNanos(r4)
            long r4 = java.lang.Math.min(r0, r4)
            long r4 = r4 + r2
            r6.A04(r4)
            goto L34
        L2e:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1c
        L34:
            X.TWX r9 = new X.TWX     // Catch: java.lang.Throwable -> L49 java.io.InterruptedIOException -> L5b
            r9.<init>()     // Catch: java.lang.Throwable -> L49 java.io.InterruptedIOException -> L5b
        L39:
            r4 = 8192(0x2000, double:4.0474E-320)
            long r7 = r13.E7q(r9, r4)     // Catch: java.lang.Throwable -> L49 java.io.InterruptedIOException -> L5b
            r5 = -1
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L61
            r9.A0A()     // Catch: java.lang.Throwable -> L49 java.io.InterruptedIOException -> L5b
            goto L39
        L49:
            r6 = move-exception
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            X.Sb2 r4 = r13.Eq9()
            if (r5 != 0) goto L56
            r4.A02()
            throw r6
        L56:
            long r2 = r2 + r0
            r4.A04(r2)
            throw r6
        L5b:
            r5 = 0
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 != 0) goto L6e
            goto L66
        L61:
            r5 = 1
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 != 0) goto L6e
        L66:
            X.Sb2 r0 = r13.Eq9()
            r0.A02()
            return r5
        L6e:
            X.Sb2 r4 = r13.Eq9()
            long r2 = r2 + r0
            r4.A04(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63404SjZ.A0C(java.util.concurrent.TimeUnit, X.Tr7, int):boolean");
    }

    public static String[] A0E(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    A1E.add(str);
                    break;
                }
                i++;
            }
        }
        return AbstractC58319PtB.A1b(A1E, A1E.size());
    }
}
