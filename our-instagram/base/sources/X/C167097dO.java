package X;

import java.util.List;

/* renamed from: X.7dO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167097dO extends C0T6 implements InterfaceC166427cB {
    public final EnumC53178Nfa A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final java.util.Set A04;

    public C167097dO(EnumC53178Nfa enumC53178Nfa, String str, List list, List list2, java.util.Set set) {
        C14360o3.A0B(set, 1);
        this.A04 = set;
        this.A00 = enumC53178Nfa;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167097dO) {
                C167097dO c167097dO = (C167097dO) obj;
                if (!C14360o3.A0K(this.A04, c167097dO.A04) || this.A00 != c167097dO.A00 || !C14360o3.A0K(this.A03, c167097dO.A03) || !C14360o3.A0K(this.A02, c167097dO.A02) || !C14360o3.A0K(this.A01, c167097dO.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A00.hashCode()) * 31;
        List list = this.A03;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A02;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.A01;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }
}
