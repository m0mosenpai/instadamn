package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.5hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123225hx {
    public final android.net.Uri A00;
    public final List A01;

    @Deprecated
    public final List A02;
    public final Map A03;

    @Deprecated
    public final Map A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C123225hx)) {
            return false;
        }
        C123225hx c123225hx = (C123225hx) obj;
        return this.A05.equals(c123225hx.A05) && Util.A0I(this.A00, c123225hx.A00) && Util.A0I(this.A03, c123225hx.A03) && this.A08 == c123225hx.A08 && this.A07 == c123225hx.A07 && this.A09 == c123225hx.A09 && this.A01.equals(c123225hx.A01) && Arrays.equals(this.A0A, c123225hx.A0A);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A05.hashCode() * 31;
        android.net.Uri uri = this.A00;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        return ((((((((((((hashCode + i) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r4.A00 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C123225hx(X.C96634Vy r4) {
        /*
            r3 = this;
            r3.<init>()
            boolean r2 = r4.A04
            if (r2 == 0) goto Lc
            android.net.Uri r1 = r4.A00
            r0 = 0
            if (r1 == 0) goto Ld
        Lc:
            r0 = 1
        Ld:
            X.C4B8.A04(r0)
            java.util.UUID r0 = r4.A03
            r0.getClass()
            r3.A05 = r0
            r3.A06 = r0
            android.net.Uri r0 = r4.A00
            r3.A00 = r0
            java.util.Map r0 = r4.A02
            r3.A04 = r0
            r3.A03 = r0
            boolean r0 = r4.A05
            r3.A08 = r0
            r3.A07 = r2
            boolean r0 = r4.A06
            r3.A09 = r0
            java.util.List r0 = r4.A01
            r3.A02 = r0
            r3.A01 = r0
            byte[] r1 = r4.A07
            if (r1 == 0) goto L3f
            int r0 = r1.length
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
        L3c:
            r3.A0A = r0
            return
        L3f:
            r0 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123225hx.<init>(X.4Vy):void");
    }
}
