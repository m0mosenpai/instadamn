package X;

import java.util.List;

/* renamed from: X.84d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1817184d extends C0T6 {
    public final float A00;
    public final C190178bb A01;
    public final C190168ba A02;
    public final AbstractC193598he A03;
    public final C84U A04;
    public final EnumC192868gS A05;
    public final List A06;

    public C1817184d(C190178bb c190178bb, C190168ba c190168ba, AbstractC193598he abstractC193598he, C84U c84u, EnumC192868gS enumC192868gS, List list, float f) {
        C14360o3.A0B(abstractC193598he, 1);
        C14360o3.A0B(c84u, 2);
        this.A03 = abstractC193598he;
        this.A04 = c84u;
        this.A00 = f;
        this.A02 = c190168ba;
        this.A05 = enumC192868gS;
        this.A01 = c190178bb;
        this.A06 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1817184d) {
                C1817184d c1817184d = (C1817184d) obj;
                if (!C14360o3.A0K(this.A03, c1817184d.A03) || !C14360o3.A0K(this.A04, c1817184d.A04) || Float.compare(this.A00, c1817184d.A00) != 0 || !C14360o3.A0K(this.A02, c1817184d.A02) || this.A05 != c1817184d.A05 || !C14360o3.A0K(this.A01, c1817184d.A01) || !C14360o3.A0K(this.A06, c1817184d.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        C190168ba c190168ba = this.A02;
        int hashCode2 = (hashCode + (c190168ba == null ? 0 : c190168ba.hashCode())) * 31;
        EnumC192868gS enumC192868gS = this.A05;
        int hashCode3 = (hashCode2 + (enumC192868gS == null ? 0 : enumC192868gS.hashCode())) * 31;
        C190178bb c190178bb = this.A01;
        int hashCode4 = (hashCode3 + (c190178bb == null ? 0 : c190178bb.hashCode())) * 31;
        List list = this.A06;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }
}
