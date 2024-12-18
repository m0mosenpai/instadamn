package X;

import java.util.List;

/* renamed from: X.8ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190888ck extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final InterfaceC190908cm A03;
    public final AbstractC190968cs A04;
    public final EnumC190948cq A05;
    public final C190958cr A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C190888ck)) {
            return false;
        }
        return C14360o3.A0K(this.A09, ((C190888ck) obj).A09);
    }

    public final int hashCode() {
        return this.A09.hashCode();
    }

    public C190888ck(InterfaceC190908cm interfaceC190908cm, AbstractC190968cs abstractC190968cs, EnumC190948cq enumC190948cq, C190958cr c190958cr, Integer num, Integer num2, String str, List list, List list2, int i, int i2, int i3, boolean z, boolean z2) {
        this.A09 = str;
        this.A0C = z;
        this.A0D = z2;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A07 = num;
        this.A08 = num2;
        this.A04 = abstractC190968cs;
        this.A03 = interfaceC190908cm;
        this.A05 = enumC190948cq;
        this.A06 = c190958cr;
        this.A0A = list;
        this.A0B = list2;
    }
}
