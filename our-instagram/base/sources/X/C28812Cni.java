package X;

/* renamed from: X.Cni, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28812Cni implements C5E5 {
    public final /* synthetic */ C28363CfN A00;

    public C28812Cni(C28363CfN c28363CfN) {
        this.A00 = c28363CfN;
    }

    @Override // X.C5E5
    public final /* synthetic */ Object DZz(InterfaceC23621Ds interfaceC23621Ds, long j, long j2) {
        return new C25242BFb(0L);
    }

    @Override // X.C5E5
    public final long Da2(long j, long j2, int i) {
        C28363CfN c28363CfN = this.A00;
        float A02 = C119365at.A02(j2);
        if (A02 < 0.0f) {
            A02 = 0.0f;
        }
        return AbstractC119395aw.A00(0.0f, c28363CfN.A00(A02));
    }

    @Override // X.C5E5
    public final /* synthetic */ Object Da5(InterfaceC23621Ds interfaceC23621Ds, long j) {
        return new C25242BFb(0L);
    }

    @Override // X.C5E5
    public final long DaA(long j, int i) {
        float f;
        C28363CfN c28363CfN = this.A00;
        float A02 = C119365at.A02(j);
        float f2 = A02;
        if (A02 > 0.0f) {
            f2 = 0.0f;
        }
        float A00 = c28363CfN.A00(f2);
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) c28363CfN.A02.getValue();
        if (interfaceC16660sJ != null) {
            f = AbstractC166987dD.A09(interfaceC16660sJ.invoke(Float.valueOf(A02 - A00)));
        } else {
            f = 0.0f;
        }
        return AbstractC119395aw.A00(0.0f, A00 + f);
    }
}
