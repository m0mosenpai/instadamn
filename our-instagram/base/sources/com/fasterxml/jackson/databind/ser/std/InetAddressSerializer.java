package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC58318PtA;
import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C46K;
import X.SX7;
import java.net.InetAddress;

/* loaded from: classes10.dex */
public class InetAddressSerializer extends StdScalarSerializer implements C46K {
    public final boolean A00;

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this.A00 = z;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        SX7 A00 = SX7.A00(anonymousClass182, abstractC63023Sar, InetAddress.class, inetAddress);
        A0E(anonymousClass182, inetAddress);
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        A0E(anonymousClass182, (InetAddress) obj);
    }

    public final void A0E(AnonymousClass182 anonymousClass182, InetAddress inetAddress) {
        String trim;
        if (this.A00) {
            trim = inetAddress.getHostAddress();
        } else {
            trim = inetAddress.toString().trim();
            int indexOf = trim.indexOf(47);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    trim = trim.substring(1);
                } else {
                    trim = AbstractC58318PtA.A0j(trim, indexOf);
                }
            }
        }
        anonymousClass182.A0u(trim);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[RETURN] */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r3, X.AbstractC913345m r4) {
        /*
            r2 = this;
            java.lang.Class r0 = r2.A00
            X.45U r0 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r3, r4, r0)
            if (r0 == 0) goto L1f
            X.45V r1 = r0.A00
            boolean r0 = r1.A00()
            if (r0 != 0) goto L14
            X.45V r0 = X.C45V.ARRAY
            if (r1 != r0) goto L1f
        L14:
            r1 = 1
        L15:
            boolean r0 = r2.A00
            if (r1 == r0) goto L21
            com.fasterxml.jackson.databind.ser.std.InetAddressSerializer r0 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
            r0.<init>(r1)
            return r0
        L1f:
            r1 = 0
            goto L15
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.InetAddressSerializer.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public InetAddressSerializer() {
        this(false);
    }
}
