package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9C6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9C6 extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final Object A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9C6(X.C50092Rx r2, X.C2E4 r3, X.C2E4 r4, java.lang.String r5, kotlin.jvm.internal.DefaultConstructorMarker r6, int r7, int r8, boolean r9) {
        /*
            r1 = this;
            r6 = 0
            r1.A05 = r6
            r2 = 0
            X.2Dz r0 = X.C2Dz.A00
            java.lang.Object r3 = r0.A00
            X.2E4 r3 = (X.C2E4) r3
            r4 = r3
            r5 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C6.<init>(X.2Rx, X.2E4, X.2E4, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker, int, int, boolean):void");
    }

    public final void A00(C2E4 c2e4, String str, String str2, boolean z, boolean z2) {
        if (z2) {
            ((Map) this.A06).clear();
        }
        if (str.equals("all")) {
            this.A02 = c2e4;
            this.A04 = z;
            this.A03 = str2;
            return;
        }
        ((Map) this.A06).put(str, new JWd(c2e4, str2, z));
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A05) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C9C6)) {
                        return false;
                    }
                    C9C6 c9c6 = (C9C6) obj;
                    if (c9c6.A05 != 0 || !C14360o3.A0K(this.A00, c9c6.A00) || !C14360o3.A0K(this.A03, c9c6.A03) || this.A04 != c9c6.A04 || !C14360o3.A0K(this.A02, c9c6.A02)) {
                        return false;
                    }
                    obj2 = this.A01;
                    obj3 = c9c6.A01;
                    break;
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C9C6)) {
                        return false;
                    }
                    C9C6 c9c62 = (C9C6) obj;
                    if (c9c62.A05 != 1 || !C14360o3.A0K(this.A03, c9c62.A03) || !C14360o3.A0K(this.A00, c9c62.A00) || !C14360o3.A0K(this.A06, c9c62.A06) || !C14360o3.A0K(this.A02, c9c62.A02) || !C14360o3.A0K(this.A01, c9c62.A01) || this.A04 != c9c62.A04) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    if (obj instanceof C9C6) {
                        C9C6 c9c63 = (C9C6) obj;
                        if (c9c63.A05 == 2 && this.A04 == c9c63.A04 && C14360o3.A0K(this.A00, c9c63.A00) && C14360o3.A0K(this.A01, c9c63.A01) && C14360o3.A0K(this.A03, c9c63.A03) && C14360o3.A0K(this.A06, c9c63.A06)) {
                            obj2 = this.A02;
                            obj3 = c9c63.A02;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Object obj;
        int hashCode3;
        int i;
        switch (this.A05) {
            case 0:
                Object obj2 = this.A00;
                int i2 = 0;
                if (obj2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj2.hashCode();
                }
                int i3 = hashCode * 31;
                String str = this.A03;
                if (str != null) {
                    i2 = str.hashCode();
                }
                int i4 = (i3 + i2) * 31;
                int i5 = 1237;
                if (this.A04) {
                    i5 = 1231;
                }
                hashCode2 = (((i4 + i5) * 31) + this.A02.hashCode()) * 31;
                obj = this.A01;
                i = obj.hashCode();
                break;
            case 1:
                int hashCode4 = ((((((this.A03.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A02.hashCode()) * 31;
                Object obj3 = this.A01;
                if (obj3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = obj3.hashCode();
                }
                hashCode2 = (hashCode4 + hashCode3) * 31;
                i = 1237;
                if (this.A04) {
                    i = 1231;
                    break;
                }
                break;
            default:
                int i6 = 1237;
                if (this.A04) {
                    i6 = 1231;
                }
                hashCode2 = ((((((((i6 * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A06.hashCode()) * 31;
                obj = this.A02;
                i = obj.hashCode();
                break;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        if (this.A05 != 0) {
            return super.toString();
        }
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC50082Rw.A00(this, A0A);
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return super.toString();
        }
    }

    public C9C6(C50092Rx c50092Rx, C2E4 c2e4, C2E4 c2e42, String str, boolean z) {
        this.A05 = 0;
        C14360o3.A0B(c2e4, 4);
        C14360o3.A0B(c2e42, 5);
        this.A00 = c50092Rx;
        this.A03 = str;
        this.A04 = z;
        this.A02 = c2e4;
        this.A01 = c2e42;
        this.A06 = new LinkedHashMap();
    }

    public C9C6(InterfaceC99494dO interfaceC99494dO, C38321qM c38321qM, String str, C5Hc c5Hc, C5Hc c5Hc2, boolean z) {
        this.A05 = 1;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c5Hc, 3);
        C14360o3.A0B(c5Hc2, 4);
        this.A03 = str;
        this.A00 = c38321qM;
        this.A06 = c5Hc;
        this.A02 = c5Hc2;
        this.A01 = interfaceC99494dO;
        this.A04 = z;
    }

    public C9C6(C9BH c9bh, UserSession userSession, C76623c7 c76623c7, C75113Zb c75113Zb, String str, boolean z) {
        this.A05 = 2;
        this.A04 = z;
        this.A00 = c76623c7;
        this.A01 = c75113Zb;
        this.A03 = str;
        this.A06 = c9bh;
        this.A02 = userSession;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9C6() {
        /*
            r7 = this;
            r6 = 0
            r1 = r7
            r7.A05 = r6
            r2 = 0
            r7.A05 = r6
            X.2Dz r0 = X.C2Dz.A00
            java.lang.Object r3 = r0.A00
            X.2E4 r3 = (X.C2E4) r3
            r4 = r3
            r5 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C6.<init>():void");
    }
}
