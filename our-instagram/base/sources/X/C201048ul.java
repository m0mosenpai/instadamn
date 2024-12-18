package X;

import java.util.List;

/* renamed from: X.8ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201048ul extends C0T6 {
    public final Boolean A00;
    public final Boolean A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C201048ul) {
                C201048ul c201048ul = (C201048ul) obj;
                if (!C14360o3.A0K(this.A00, c201048ul.A00) || !C14360o3.A0K(this.A01, c201048ul.A01) || !C14360o3.A0K(this.A03, c201048ul.A03) || !C14360o3.A0K(this.A02, c201048ul.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.A03;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A02;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public C201048ul(Boolean bool, Boolean bool2, String str, List list) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A03 = list;
        this.A02 = str;
    }
}
