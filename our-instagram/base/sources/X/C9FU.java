package X;

import android.content.Context;

/* renamed from: X.9FU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FU extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FU(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i3;
        this.A05 = obj;
        this.A02 = i;
        this.A03 = obj2;
        this.A01 = i2;
        this.A04 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int AB4;
        C119135aV c119135aV;
        AbstractC119735bX abstractC119735bX;
        switch (this.A00) {
            case 0:
                C5AW c5aw = (C5AW) obj;
                C59W[] c59wArr = (C59W[]) this.A04;
                C5X0 c5x0 = (C5X0) this.A05;
                int i = this.A02;
                int i2 = this.A01;
                int[] iArr = (int[]) this.A03;
                int length = c59wArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    C59W c59w = c59wArr[i3];
                    int i5 = i4 + 1;
                    C14360o3.A0A(c59w);
                    Object BbJ = c59w.BbJ();
                    if ((BbJ instanceof C119135aV) && (c119135aV = (C119135aV) BbJ) != null && (abstractC119735bX = c119135aV.A01) != null) {
                        AB4 = abstractC119735bX.A00(c59w, AnonymousClass583.Ltr, i - c59w.A00, i2);
                    } else {
                        AB4 = c5x0.A00.AB4(0, i - c59w.A00);
                    }
                    c5aw.A05(c59w, 0.0f, iArr[i4], AB4);
                    i3++;
                    i4 = i5;
                }
                return C0eB.A00;
            case 1:
                InterfaceC16620sF interfaceC16620sF = ((C5Zh) this.A05).A01;
                int i6 = this.A02;
                C59W c59w2 = (C59W) this.A03;
                ((C5AW) obj).A06(c59w2, 0.0f, ((C119235af) interfaceC16620sF.invoke(new C119055aN(AbstractC119215ad.A00(i6 - c59w2.A01, this.A01 - c59w2.A00)), ((InterfaceC1131259a) this.A04).getLayoutDirection())).A00);
                return C0eB.A00;
            case 2:
            case 3:
            default:
                C105184oY c105184oY = (C105184oY) obj;
                C14360o3.A0B(c105184oY, 0);
                ((C105214ob) this.A05).A01.AmS().Dmg((C38321qM) this.A03, null, c105184oY, (C75113Zb) this.A04, this.A02, this.A01);
                return C0eB.A00;
            case 4:
                C105184oY c105184oY2 = (C105184oY) obj;
                C14360o3.A0B(c105184oY2, 0);
                Context context = c105184oY2.A0J.getContext();
                C14360o3.A07(context);
                C105214ob c105214ob = (C105214ob) this.A05;
                return new C105274oh(context, c105214ob.A01.AmS(), c105184oY2, (C38321qM) this.A03, (C75113Zb) this.A04, this.A02, this.A01, C18U.A06(C06090Tz.A05, c105214ob.A00, 36330514176623501L));
        }
    }
}
