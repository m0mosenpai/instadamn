package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.DVf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30278DVf extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30278DVf(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        super(2);
        this.A05 = interfaceC16820sZ;
        this.A08 = interfaceC16660sJ;
        this.A06 = interfaceC16820sZ2;
        this.A07 = interfaceC16660sJ2;
        this.A01 = immutableList;
        this.A02 = immutableList2;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16820sZ interfaceC16820sZ = this.A05;
        InterfaceC16660sJ interfaceC16660sJ = this.A08;
        AbstractC28331CeJ.A00(A0S, this.A01, this.A02, this.A04, this.A03, interfaceC16820sZ, this.A06, interfaceC16660sJ, this.A07, AbstractC25225BEi.A04(this.A00));
        return C0eB.A00;
    }
}
