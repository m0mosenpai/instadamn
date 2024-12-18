package X;

import java.util.List;

/* renamed from: X.4lZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103574lZ extends C0T6 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final int A0A;
    public final InterfaceC103594lb A0B;
    public final C103584la A0C;
    public final String A0D;

    public C103574lZ(InterfaceC103594lb interfaceC103594lb, C103584la c103584la, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(list, 3);
        C14360o3.A0B(str3, 5);
        C14360o3.A0B(list2, 6);
        C14360o3.A0B(list3, 7);
        C14360o3.A0B(list4, 10);
        C14360o3.A0B(str5, 11);
        this.A02 = str;
        this.A03 = str2;
        this.A06 = list;
        this.A0C = c103584la;
        this.A04 = str3;
        this.A07 = list2;
        this.A08 = list3;
        this.A0D = str4;
        this.A0A = i;
        this.A09 = list4;
        this.A05 = str5;
        this.A00 = i2;
        this.A0B = interfaceC103594lb;
        this.A01 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C103574lZ) {
                C103574lZ c103574lZ = (C103574lZ) obj;
                if (!C14360o3.A0K(this.A02, c103574lZ.A02) || !C14360o3.A0K(this.A03, c103574lZ.A03) || !C14360o3.A0K(this.A06, c103574lZ.A06) || !C14360o3.A0K(this.A0C, c103574lZ.A0C) || !C14360o3.A0K(this.A04, c103574lZ.A04) || !C14360o3.A0K(this.A07, c103574lZ.A07) || !C14360o3.A0K(this.A08, c103574lZ.A08) || !C14360o3.A0K(this.A0D, c103574lZ.A0D) || this.A0A != c103574lZ.A0A || !C14360o3.A0K(this.A09, c103574lZ.A09) || !C14360o3.A0K(this.A05, c103574lZ.A05) || this.A00 != c103574lZ.A00 || !C14360o3.A0K(this.A0B, c103574lZ.A0B) || this.A01 != c103574lZ.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A06.hashCode()) * 31;
        C103584la c103584la = this.A0C;
        int hashCode2 = (((((((hashCode + (c103584la == null ? 0 : c103584la.hashCode())) * 31) + this.A04.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A08.hashCode()) * 31;
        String str = this.A0D;
        int hashCode3 = (((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.A0A) * 31) + this.A09.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A00) * 31;
        InterfaceC103594lb interfaceC103594lb = this.A0B;
        return ((hashCode3 + (interfaceC103594lb != null ? interfaceC103594lb.hashCode() : 0)) * 31) + this.A01;
    }
}
