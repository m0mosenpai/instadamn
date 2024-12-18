package X;

/* renamed from: X.6Vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140066Vk implements C2W2 {
    public final C102884kP A00;
    public final C103054kg A01;

    @Override // X.C2W2
    public final C2W5 AF8(C78473fD c78473fD, int i, int i2) {
        C103054kg c103054kg = this.A01;
        C102884kP c102884kP = this.A00;
        String A02 = AnonymousClass001.A02(c102884kP.A05, c102884kP.A04, "RootSignalNode.calculateLayout: ", " | ");
        try {
            if (C1LN.A01.isTracing()) {
                C1LN.A01(A02);
            }
            Object A01 = AbstractC103044kf.A01(EnumC103014kc.A03, c103054kg, new C9FG(this, i, c78473fD, i2, 0));
            C14360o3.A0A(A01);
            return (C2W5) A01;
        } finally {
            if (C1LN.A01.isTracing()) {
                C1LN.A00();
            }
        }
    }

    @Override // X.C2W2
    public final /* synthetic */ C2W5 AF9(C78473fD c78473fD, long j) {
        return AbstractC135286Ad.A00(c78473fD, this, j);
    }

    public C140066Vk(C102884kP c102884kP, C103054kg c103054kg) {
        this.A00 = c102884kP;
        this.A01 = c103054kg;
    }
}
