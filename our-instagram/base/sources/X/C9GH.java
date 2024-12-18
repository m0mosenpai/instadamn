package X;

import java.util.List;

/* renamed from: X.9GH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GH extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9GH(Object obj, Object obj2, String str, String str2, String str3, String str4, String str5, int i) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A03 = str5;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean doesFulfillSpread;
        if (this.A00 != 0) {
            ((C5yI) this.A02).DZt(this.A04, this.A05, this.A07, null, this.A06, this.A03, (List) this.A01);
            return C0eB.A00;
        }
        C2JS c2js = (C2JS) this.A02;
        doesFulfillSpread = c2js.doesFulfillSpread(this.A05, this.A07, this.A06, this.A04, this.A03);
        if (doesFulfillSpread) {
            return c2js.reinterpret((Class) this.A01);
        }
        return null;
    }
}
