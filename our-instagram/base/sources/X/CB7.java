package X;

/* loaded from: classes5.dex */
public abstract class CB7 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A00(InterfaceC1130858v interfaceC1130858v, long j) {
        if (!((C58J) interfaceC1130858v).A03.A08) {
            return false;
        }
        C59T c59t = AbstractC114335Dx.A02(interfaceC1130858v).A0W.A06;
        if (!c59t.CQ7()) {
            return false;
        }
        long j2 = ((C59W) c59t).A03;
        int A06 = AbstractC25225BEi.A06(j2);
        int A00 = C119055aN.A00(j2);
        long Chn = c59t.Chn(0L);
        float A01 = C119365at.A01(Chn);
        float A02 = C119365at.A02(Chn);
        float f = A06 + A01;
        float f2 = A00 + A02;
        float A012 = C119365at.A01(j);
        if (A01 > A012 || A012 > f) {
            return false;
        }
        float A022 = C119365at.A02(j);
        if (A02 > A022 || A022 > f2) {
            return false;
        }
        return true;
    }
}
