package X;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.SPn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62756SPn {
    public final Proxy A00;
    public final ProxySelector A01;
    public final List A02;
    public final List A03;
    public final SocketFactory A04;
    public final HostnameVerifier A05;
    public final SSLSocketFactory A06;
    public final InterfaceC65604Tnt A07;
    public final C63201Sf4 A08;
    public final InterfaceC65606Tnv A09;
    public final C63379Sit A0A;

    public final boolean A00(C62756SPn c62756SPn) {
        if (this.A09.equals(c62756SPn.A09) && this.A07.equals(c62756SPn.A07) && this.A03.equals(c62756SPn.A03) && this.A02.equals(c62756SPn.A02) && this.A01.equals(c62756SPn.A01) && C2I7.A00(this.A00, c62756SPn.A00) && C2I7.A00(this.A06, c62756SPn.A06) && C2I7.A00(this.A05, c62756SPn.A05) && C2I7.A00(this.A08, c62756SPn.A08) && this.A0A.A00 == c62756SPn.A0A.A00) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C62756SPn) {
            C62756SPn c62756SPn = (C62756SPn) obj;
            if (this.A0A.equals(c62756SPn.A0A) && A00(c62756SPn)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A01, (((AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A09, JQ0.A01(this.A0A.hashCode()))) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A08);
    }

    public C62756SPn(String str, Proxy proxy, ProxySelector proxySelector, List list, List list2, SocketFactory socketFactory, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory, InterfaceC65604Tnt interfaceC65604Tnt, C63201Sf4 c63201Sf4, InterfaceC65606Tnv interfaceC65606Tnv, int i) {
        String str2;
        C62754SPl c62754SPl = new C62754SPl();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        String str3 = "http";
        if (!str2.equalsIgnoreCase("http")) {
            str3 = "https";
            if (!str2.equalsIgnoreCase("https")) {
                throw AbstractC167007dF.A0c("unexpected scheme: ", str2);
            }
        }
        c62754SPl.A05 = str3;
        if (str != null) {
            String A03 = AbstractC63404SjZ.A03(C63379Sit.A01(str, 0, str.length(), false));
            if (A03 != null) {
                c62754SPl.A04 = A03;
                if (i > 0 && i <= 65535) {
                    c62754SPl.A00 = i;
                    this.A0A = c62754SPl.A00();
                    if (interfaceC65606Tnv != null) {
                        this.A09 = interfaceC65606Tnv;
                        if (socketFactory != null) {
                            this.A04 = socketFactory;
                            if (interfaceC65604Tnt != null) {
                                this.A07 = interfaceC65604Tnt;
                                if (list != null) {
                                    this.A03 = AbstractC58322PtE.A10(list);
                                    if (list2 != null) {
                                        this.A02 = AbstractC58322PtE.A10(list2);
                                        if (proxySelector != null) {
                                            this.A01 = proxySelector;
                                            this.A00 = proxy;
                                            this.A06 = sSLSocketFactory;
                                            this.A05 = hostnameVerifier;
                                            this.A08 = c63201Sf4;
                                            return;
                                        }
                                        throw AbstractC166987dD.A15("proxySelector == null");
                                    }
                                    throw AbstractC166987dD.A15("connectionSpecs == null");
                                }
                                throw AbstractC166987dD.A15("protocols == null");
                            }
                            throw AbstractC166987dD.A15("proxyAuthenticator == null");
                        }
                        throw AbstractC166987dD.A15("socketFactory == null");
                    }
                    throw AbstractC166987dD.A15("dns == null");
                }
                throw AbstractC25230BEn.A0n("unexpected port: ", i);
            }
            throw AbstractC167007dF.A0c("unexpected host: ", str);
        }
        throw AbstractC166987dD.A15("host == null");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Address{");
        C63379Sit c63379Sit = this.A0A;
        A1C.append(c63379Sit.A02);
        A1C.append(":");
        A1C.append(c63379Sit.A00);
        Object obj = this.A00;
        if (obj != null) {
            A1C.append(", proxy=");
        } else {
            A1C.append(", proxySelector=");
            obj = this.A01;
        }
        return JQ0.A0l(obj, A1C);
    }
}
