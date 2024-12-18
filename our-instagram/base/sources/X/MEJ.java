package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class MEJ extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C27V A00;
    public final /* synthetic */ Boolean A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MEJ(C27V c27v, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, String str4, List list) {
        super(0);
        this.A00 = c27v;
        this.A09 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A0A = list;
        this.A02 = bool;
        this.A05 = bool2;
        this.A04 = bool3;
        this.A03 = bool4;
        this.A01 = bool5;
        this.A07 = str4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.A00.A01.add(new C45404K8r(this.A02, this.A05, this.A04, this.A03, this.A01, this.A09, this.A08, this.A06, this.A07, this.A0A));
        return C0eB.A00;
    }
}
