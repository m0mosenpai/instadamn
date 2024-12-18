package X;

import java.util.List;

/* renamed from: X.3vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87883vw extends C0T6 implements InterfaceC87893vx {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final List A05;

    @Override // X.InterfaceC87893vx
    public final C87883vw Erf() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87883vw) {
                C87883vw c87883vw = (C87883vw) obj;
                if (!C14360o3.A0K(this.A01, c87883vw.A01) || !C14360o3.A0K(this.A03, c87883vw.A03) || !C14360o3.A0K(this.A00, c87883vw.A00) || !C14360o3.A0K(this.A05, c87883vw.A05) || !C14360o3.A0K(this.A04, c87883vw.A04) || !C14360o3.A0K(this.A02, c87883vw.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.A05;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.A02;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // X.InterfaceC87893vx
    public final Integer Azi() {
        return this.A01;
    }

    @Override // X.InterfaceC87893vx
    public final String BHV() {
        return this.A03;
    }

    @Override // X.InterfaceC87893vx
    public final Boolean Bv0() {
        return this.A00;
    }

    @Override // X.InterfaceC87893vx
    public final List Bx2() {
        return this.A05;
    }

    @Override // X.InterfaceC87893vx
    public final String C87() {
        return this.A04;
    }

    @Override // X.InterfaceC87893vx
    public final Integer C8D() {
        return this.A02;
    }

    public C87883vw(Boolean bool, Integer num, Integer num2, String str, String str2, List list) {
        this.A01 = num;
        this.A03 = str;
        this.A00 = bool;
        this.A05 = list;
        this.A04 = str2;
        this.A02 = num2;
    }
}
