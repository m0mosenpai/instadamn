package X;

/* loaded from: classes5.dex */
public final class DS7 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DS7(boolean z, boolean z2, int i) {
        super(2);
        this.A00 = i;
        if (i != 0) {
            this.A02 = z;
            this.A01 = z2;
        } else {
            this.A01 = z;
            this.A02 = z2;
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        if (this.A00 != 0) {
            C51u c51u = (C51u) obj;
            C51u c51u2 = (C51u) obj2;
            Number number = (Number) c51u.A01;
            int intValue = number.intValue();
            Number number2 = (Number) c51u2.A01;
            int intValue2 = number2.intValue();
            if (this.A02 && intValue != intValue2) {
                i = number2.intValue() - number.intValue();
            } else {
                long parseLong = Long.parseLong((String) c51u.A02);
                long parseLong2 = Long.parseLong((String) c51u2.A02);
                if (this.A01 && parseLong != parseLong2) {
                    i = (int) (parseLong2 - parseLong);
                } else {
                    i = 0;
                }
            }
            return Integer.valueOf(i);
        }
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1665529397, "com.instagram.compose.startup.TixuUnitPrewarmer.setCompactViewLoadingShimmer.<anonymous>.<anonymous> (TixuUnitPrewarmer.kt:104)");
            }
            C132335yC c132335yC = new C132335yC(null, C05F.A01, "startup", "Threads", C5HZ.A01, AbstractC133095zb.A04(AbstractC25225BEi.A0t(""), AbstractC25225BEi.A0t(""), AbstractC25225BEi.A0t("")), 0, false, this.A01, true, this.A02);
            C5yG c5yG = C5yG.A00;
            C132395yK c132395yK = C132395yK.A00;
            DB1 db1 = DB1.A00;
            DB2 db2 = DB2.A00;
            C30052DMm c30052DMm = C30052DMm.A00;
            AbstractC136446Fx.A00(c5Tl, c132395yK, c5yG, c132335yC, db1, db2, DB3.A00, DB4.A00, c30052DMm, C30053DMn.A00, C30054DMo.A00, C30055DMp.A00, C30412DaJ.A00, 920350128, 224694, 0, false, false, false, false);
            if (C0fH.A02()) {
                C0fH.A00(669438379);
            }
        }
        return C0eB.A00;
    }
}
