package X;

import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SJc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62619SJc {
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final InterfaceC65366Tiy A0A;
    public final C62945SYn A0B;
    public final C93744Je A0C;
    public final Q4B A0D;
    public final InterfaceC65590TnV A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final Map A0I;
    public final Map A0J;
    public final AtomicInteger A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public C62619SJc(InterfaceC65366Tiy interfaceC65366Tiy, C62945SYn c62945SYn, C93744Je c93744Je, InterfaceC65590TnV interfaceC65590TnV, String str, String str2, String str3, String str4, String str5, List list, Map map, Map map2, AtomicInteger atomicInteger, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3) {
        String str6;
        int length;
        this.A00 = str;
        this.A01 = str2;
        this.A06 = i;
        this.A02 = i2;
        this.A0N = z;
        this.A0C = c93744Je;
        this.A0D = new Q4B(str3, str4, Long.MAX_VALUE);
        this.A0F = str5;
        this.A0B = c62945SYn;
        this.A0K = atomicInteger;
        this.A03 = i3;
        this.A08 = i4;
        this.A04 = i5;
        this.A07 = i6;
        this.A05 = i7;
        this.A09 = i8;
        this.A0A = interfaceC65366Tiy;
        this.A0H = list;
        this.A0M = z2;
        this.A0L = z3;
        this.A0J = map2;
        try {
            try {
                byte[] bytes = AnonymousClass001.A13(c62945SYn.A01(), " ", (String) ((Pair) c93744Je).second, " ", str3, " ").getBytes("utf-8");
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] digest = messageDigest.digest();
                    if (digest == null || (length = digest.length) == 0) {
                        str6 = "";
                    } else {
                        char[] cArr = new char[length * 2];
                        int i9 = 0;
                        int i10 = 0;
                        do {
                            byte b = digest[i9];
                            int i11 = i10 + 1;
                            char[] cArr2 = AbstractC62315S6k.A00;
                            cArr[i10] = cArr2[(b & 240) >>> 4];
                            i10 = i11 + 1;
                            AbstractC58318PtA.A1Z(cArr2, cArr, b, i11);
                            i9++;
                        } while (i9 < length);
                        str6 = new String(cArr);
                    }
                } catch (NoSuchAlgorithmException unused) {
                    throw new Exception();
                }
            } catch (UnsupportedEncodingException unused2) {
                throw new Exception();
            }
        } catch (C61252Rjq unused3) {
            str6 = null;
        }
        this.A0G = str6;
        this.A0I = map;
        this.A0E = interfaceC65590TnV;
    }
}
