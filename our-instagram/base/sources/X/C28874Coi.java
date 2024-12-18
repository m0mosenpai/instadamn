package X;

/* renamed from: X.Coi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C28874Coi implements InterfaceC30915DiS {
    public static final float A02;
    public static final float A03;
    public final InterfaceC1128957x A00;
    public final C72 A01;

    public /* synthetic */ C28874Coi(InterfaceC1128957x interfaceC1128957x, C72 c72) {
        C14360o3.A0B(interfaceC1128957x, 2);
        this.A01 = c72;
        this.A00 = interfaceC1128957x;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0036. Please report as an issue. */
    @Override // X.InterfaceC30915DiS
    public final long AFF(C28268CdD c28268CdD, AnonymousClass583 anonymousClass583, long j, long j2) {
        int A06;
        InterfaceC1128957x interfaceC1128957x;
        int A062;
        float f;
        InterfaceC1128957x interfaceC1128957x2;
        int A063;
        float f2;
        int i;
        if (this instanceof C27103BxS) {
            C14360o3.A0B(c28268CdD, 0);
            int i2 = c28268CdD.A01;
            A062 = i2 + ((c28268CdD.A02 - i2) / 3);
            f = 12.0f;
            interfaceC1128957x = ((C27103BxS) this).A00;
        } else {
            C14360o3.A0B(c28268CdD, 0);
            switch (this.A01.ordinal()) {
                case 0:
                    int i3 = c28268CdD.A01;
                    A06 = (i3 + ((c28268CdD.A02 - i3) / 2)) - (AbstractC25225BEi.A06(j2) / 2);
                    i = c28268CdD.A00 + 4;
                    return AbstractC113765Bo.A00(A06, i);
                case 1:
                    interfaceC1128957x2 = this.A00;
                    int i4 = c28268CdD.A01;
                    A063 = (i4 + ((c28268CdD.A02 - i4) / 2)) - AbstractC25225BEi.A06(j2);
                    f2 = 12.0f + (A03 / 2.0f);
                    A06 = A063 + ((int) (f2 * interfaceC1128957x2.Awk()));
                    i = c28268CdD.A00 + 4;
                    return AbstractC113765Bo.A00(A06, i);
                case 2:
                    interfaceC1128957x2 = this.A00;
                    A063 = c28268CdD.A01;
                    f2 = 12.0f;
                    A06 = A063 + ((int) (f2 * interfaceC1128957x2.Awk()));
                    i = c28268CdD.A00 + 4;
                    return AbstractC113765Bo.A00(A06, i);
                case 3:
                    int i5 = c28268CdD.A01;
                    A06 = (i5 + ((c28268CdD.A02 - i5) / 2)) - (AbstractC25225BEi.A06(j2) / 2);
                    i = (c28268CdD.A03 - C119055aN.A00(j2)) - 4;
                    return AbstractC113765Bo.A00(A06, i);
                case 4:
                    interfaceC1128957x = this.A00;
                    A062 = c28268CdD.A01;
                    f = 12.0f;
                    break;
                case 5:
                    interfaceC1128957x = this.A00;
                    int i6 = c28268CdD.A01;
                    A062 = (i6 + ((c28268CdD.A02 - i6) / 2)) - AbstractC25225BEi.A06(j2);
                    f = 12.0f + (A03 / 2.0f);
                    break;
                default:
                    throw B4Z.A00();
            }
        }
        A06 = A062 + ((int) (f * interfaceC1128957x.Awk()));
        i = (c28268CdD.A03 - C119055aN.A00(j2)) - 4;
        return AbstractC113765Bo.A00(A06, i);
    }

    static {
        float f = 21.0f;
        if (C14640oc.A0G()) {
            f = 18.0f;
        }
        A03 = f;
        float f2 = 8.0f;
        if (C14640oc.A0G()) {
            f2 = 6.0f;
        }
        A02 = f2;
    }
}
