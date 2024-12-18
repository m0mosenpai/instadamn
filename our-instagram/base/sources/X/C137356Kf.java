package X;

import java.util.List;

/* renamed from: X.6Kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137356Kf extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C5XY A00;
    public final /* synthetic */ C59Z A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ C15100pQ A03;
    public final /* synthetic */ C15100pQ A04;
    public final /* synthetic */ C59W[] A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137356Kf(C5XY c5xy, C59Z c59z, List list, C15100pQ c15100pQ, C15100pQ c15100pQ2, C59W[] c59wArr) {
        super(1);
        this.A05 = c59wArr;
        this.A02 = list;
        this.A01 = c59z;
        this.A04 = c15100pQ;
        this.A03 = c15100pQ2;
        this.A00 = c5xy;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5AW c5aw = (C5AW) obj;
        C59W[] c59wArr = this.A05;
        List list = this.A02;
        C59Z c59z = this.A01;
        C15100pQ c15100pQ = this.A04;
        C15100pQ c15100pQ2 = this.A03;
        C5XY c5xy = this.A00;
        int length = c59wArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C59W c59w = c59wArr[i];
            C14360o3.A0C(c59w, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            C5XX.A03(c5xy.A00, (InterfaceC1131559d) list.get(i2), c5aw, c59w, c59z.getLayoutDirection(), c15100pQ.A00, c15100pQ2.A00);
            i++;
            i2++;
        }
        return C0eB.A00;
    }
}
