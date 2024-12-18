package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.4yF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110434yF extends C0T6 {
    public String A00;
    public String A01;
    public boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final InterfaceC110384yA A07;

    public C110434yF(InterfaceC110384yA interfaceC110384yA) {
        C14360o3.A0B(interfaceC110384yA, 1);
        this.A07 = interfaceC110384yA;
        C110374y9 c110374y9 = (C110374y9) interfaceC110384yA;
        Collection collection = c110374y9.A05;
        this.A06 = AbstractC001800i.A0U(collection == null ? C16930sl.A00 : collection);
        this.A03 = c110374y9.A00;
        this.A05 = c110374y9.A04;
        this.A04 = c110374y9.A03;
        this.A01 = c110374y9.A02;
        this.A00 = c110374y9.A01;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C110434yF) && C14360o3.A0K(this.A07, ((C110434yF) obj).A07));
    }

    public final int hashCode() {
        return this.A07.hashCode();
    }
}
