package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC58318PtA;
import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass001;
import X.AnonymousClass182;
import X.SX7;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* loaded from: classes10.dex */
public class InetSocketAddressSerializer extends StdScalarSerializer {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
        SX7 A00 = SX7.A00(anonymousClass182, abstractC63023Sar, InetSocketAddress.class, inetSocketAddress);
        A03(anonymousClass182, inetSocketAddress);
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        A03(anonymousClass182, (InetSocketAddress) obj);
    }

    public static final void A03(AnonymousClass182 anonymousClass182, InetSocketAddress inetSocketAddress) {
        String trim;
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            trim = inetSocketAddress.getHostName();
        } else {
            trim = address.toString().trim();
        }
        int indexOf = trim.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                if (address instanceof Inet6Address) {
                    trim = AnonymousClass001.A0g("[", trim.substring(1), "]");
                } else {
                    trim = trim.substring(1);
                }
            } else {
                trim = AbstractC58318PtA.A0j(trim, indexOf);
            }
        }
        anonymousClass182.A0u(AnonymousClass001.A0b(trim, ":", inetSocketAddress.getPort()));
    }
}
