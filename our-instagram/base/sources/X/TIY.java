package X;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes10.dex */
public final class TIY implements Cloneable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Proxy A05;
    public final ProxySelector A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final SocketFactory A0B;
    public final HostnameVerifier A0C;
    public final SSLSocketFactory A0D;
    public final InterfaceC65604Tnt A0E;
    public final InterfaceC65604Tnt A0F;
    public final C63201Sf4 A0G;
    public final C62458SCl A0H;
    public final InterfaceC65605Tnu A0I;
    public final C62950SYs A0J;
    public final InterfaceC65606Tnv A0K;
    public final C62459SCm A0L;
    public final AbstractC61529Rp5 A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public static final List A0R = AbstractC63404SjZ.A06(EnumC61215RhF.HTTP_2, EnumC61215RhF.HTTP_1_1);
    public static final List A0Q = AbstractC63404SjZ.A06(C63014Sae.A06, C63014Sae.A04);

    public C62950SYs dispatcher() {
        return this.A0J;
    }

    public TIY(Proxy proxy, ProxySelector proxySelector, List list, List list2, List list3, List list4, SocketFactory socketFactory, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory, InterfaceC65604Tnt interfaceC65604Tnt, InterfaceC65604Tnt interfaceC65604Tnt2, C63201Sf4 c63201Sf4, C62458SCl c62458SCl, InterfaceC65605Tnu interfaceC65605Tnu, C62950SYs c62950SYs, InterfaceC65606Tnv interfaceC65606Tnv, C62459SCm c62459SCm, AbstractC61529Rp5 abstractC61529Rp5, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C63201Sf4 c63201Sf42 = c63201Sf4;
        AbstractC61529Rp5 abstractC61529Rp52 = abstractC61529Rp5;
        this.A0J = c62950SYs;
        this.A05 = proxy;
        this.A0A = list4;
        this.A07 = list;
        byte[] bArr = AbstractC63404SjZ.A07;
        this.A08 = AbstractC58322PtE.A10(list2);
        this.A09 = AbstractC58322PtE.A10(list3);
        this.A0L = c62459SCm;
        this.A06 = proxySelector;
        this.A0I = interfaceC65605Tnu;
        this.A0B = socketFactory;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z4 = z4 || ((C63014Sae) it.next()).A01;
            }
        }
        if (sSLSocketFactory == null && z4) {
            X509TrustManager A07 = AbstractC63404SjZ.A07();
            try {
                C63220SfQ c63220SfQ = C63220SfQ.A01;
                SSLContext A05 = c63220SfQ.A05();
                A05.init(null, new TrustManager[]{A07}, null);
                this.A0D = A05.getSocketFactory();
                abstractC61529Rp52 = c63220SfQ.A08(A07);
            } catch (GeneralSecurityException unused) {
                throw AbstractC58318PtA.A0W("No System TLS");
            }
        } else {
            this.A0D = sSLSocketFactory;
        }
        this.A0M = abstractC61529Rp52;
        SSLSocketFactory sSLSocketFactory2 = this.A0D;
        if (sSLSocketFactory2 != null) {
            C63220SfQ.A01.A07(sSLSocketFactory2);
        }
        this.A0C = hostnameVerifier;
        AbstractC61529Rp5 abstractC61529Rp53 = this.A0M;
        this.A0G = C2I7.A00(c63201Sf42.A01, abstractC61529Rp53) ? c63201Sf42 : new C63201Sf4(c63201Sf42.A00, abstractC61529Rp53);
        this.A0F = interfaceC65604Tnt2;
        this.A0E = interfaceC65604Tnt;
        this.A0H = c62458SCl;
        this.A0K = interfaceC65606Tnv;
        this.A0O = z2;
        this.A0N = z;
        this.A0P = z3;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = i4;
        this.A04 = i5;
        this.A02 = i3;
        if (!this.A08.contains(null)) {
            if (this.A09.contains(null)) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Null network interceptor: ");
                throw AbstractC58320PtC.A0n(this.A09, A1C);
            }
            return;
        }
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append("Null interceptor: ");
        throw AbstractC58320PtC.A0n(this.A08, A1C2);
    }

    public TIY(ProxySelector proxySelector, List list, List list2, List list3, List list4, SocketFactory socketFactory, HostnameVerifier hostnameVerifier, InterfaceC65604Tnt interfaceC65604Tnt, InterfaceC65604Tnt interfaceC65604Tnt2, C63201Sf4 c63201Sf4, C62458SCl c62458SCl, InterfaceC65605Tnu interfaceC65605Tnu, C62950SYs c62950SYs, InterfaceC65606Tnv interfaceC65606Tnv, C62459SCm c62459SCm, int i, int i2, int i3) {
        boolean z;
        AbstractC61529Rp5 A08;
        this.A0J = c62950SYs;
        this.A05 = null;
        this.A0A = list4;
        this.A07 = list;
        byte[] bArr = AbstractC63404SjZ.A07;
        this.A08 = AbstractC58322PtE.A10(list2);
        this.A09 = AbstractC58322PtE.A10(list3);
        this.A0L = c62459SCm;
        this.A06 = proxySelector;
        this.A0I = interfaceC65605Tnu;
        this.A0B = socketFactory;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || ((C63014Sae) it.next()).A01;
            }
        }
        if (!z) {
            this.A0D = null;
            A08 = null;
        } else {
            X509TrustManager A07 = AbstractC63404SjZ.A07();
            try {
                C63220SfQ c63220SfQ = C63220SfQ.A01;
                SSLContext A05 = c63220SfQ.A05();
                A05.init(null, new TrustManager[]{A07}, null);
                this.A0D = A05.getSocketFactory();
                A08 = c63220SfQ.A08(A07);
            } catch (GeneralSecurityException unused) {
                throw AbstractC58318PtA.A0W("No System TLS");
            }
        }
        this.A0M = A08;
        SSLSocketFactory sSLSocketFactory = this.A0D;
        if (sSLSocketFactory != null) {
            C63220SfQ.A01.A07(sSLSocketFactory);
        }
        this.A0C = hostnameVerifier;
        AbstractC61529Rp5 abstractC61529Rp5 = this.A0M;
        this.A0G = C2I7.A00(c63201Sf4.A01, abstractC61529Rp5) ? c63201Sf4 : new C63201Sf4(c63201Sf4.A00, abstractC61529Rp5);
        this.A0F = interfaceC65604Tnt2;
        this.A0E = interfaceC65604Tnt;
        this.A0H = c62458SCl;
        this.A0K = interfaceC65606Tnv;
        this.A0O = true;
        this.A0N = true;
        this.A0P = true;
        this.A00 = 0;
        this.A01 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A02 = 0;
        if (!this.A08.contains(null)) {
            if (this.A09.contains(null)) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Null network interceptor: ");
                throw AbstractC58320PtC.A0n(this.A09, A1C);
            }
            return;
        }
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append("Null interceptor: ");
        throw AbstractC58320PtC.A0n(this.A08, A1C2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TIY() {
        /*
            r20 = this;
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            X.SYs r14 = new X.SYs
            r14.<init>()
            java.util.List r6 = X.TIY.A0R
            java.util.List r3 = X.TIY.A0Q
            X.SUL r1 = X.SUL.A00
            X.SCm r0 = new X.SCm
            r0.<init>(r1)
            java.net.ProxySelector r2 = java.net.ProxySelector.getDefault()
            if (r2 != 0) goto L23
            X.TYj r2 = new X.TYj
            r2.<init>()
        L23:
            X.Tnu r13 = X.InterfaceC65605Tnu.A00
            javax.net.SocketFactory r7 = javax.net.SocketFactory.getDefault()
            X.TVx r8 = X.TVx.A00
            X.Sf4 r11 = X.C63201Sf4.A02
            X.Tnt r9 = X.InterfaceC65604Tnt.A00
            X.SCl r12 = new X.SCl
            r12.<init>()
            X.Tnv r15 = X.InterfaceC65606Tnv.A00
            r17 = 10000(0x2710, float:1.4013E-41)
            r1 = r20
            r10 = r9
            r16 = r0
            r18 = r17
            r19 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TIY.<init>():void");
    }
}
