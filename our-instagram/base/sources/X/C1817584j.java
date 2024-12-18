package X;

import java.util.List;

/* renamed from: X.84j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1817584j extends C0T6 {
    public final C190178bb A00;
    public final C190168ba A01;
    public final AbstractC193598he A02;
    public final EnumC192868gS A03;
    public final C84B A04;
    public final List A05;

    public C1817584j(C190178bb c190178bb, C190168ba c190168ba, AbstractC193598he abstractC193598he, EnumC192868gS enumC192868gS, C84B c84b, List list) {
        C14360o3.A0B(abstractC193598he, 1);
        C14360o3.A0B(c84b, 2);
        this.A02 = abstractC193598he;
        this.A04 = c84b;
        this.A01 = c190168ba;
        this.A03 = enumC192868gS;
        this.A00 = c190178bb;
        this.A05 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1817584j) {
                C1817584j c1817584j = (C1817584j) obj;
                if (!C14360o3.A0K(this.A02, c1817584j.A02) || !C14360o3.A0K(this.A04, c1817584j.A04) || !C14360o3.A0K(this.A01, c1817584j.A01) || this.A03 != c1817584j.A03 || !C14360o3.A0K(this.A00, c1817584j.A00) || !C14360o3.A0K(this.A05, c1817584j.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A02.hashCode() * 31) + this.A04.hashCode()) * 31;
        C190168ba c190168ba = this.A01;
        int hashCode2 = (hashCode + (c190168ba == null ? 0 : c190168ba.hashCode())) * 31;
        EnumC192868gS enumC192868gS = this.A03;
        int hashCode3 = (hashCode2 + (enumC192868gS == null ? 0 : enumC192868gS.hashCode())) * 31;
        C190178bb c190178bb = this.A00;
        int hashCode4 = (hashCode3 + (c190178bb == null ? 0 : c190178bb.hashCode())) * 31;
        List list = this.A05;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }
}
