package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.UwB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67684UwB extends AbstractC69677VtM {
    public final Uw5 A00;

    public static void A01(C67689UwG c67689UwG, Uw5 uw5, ImmutableList.Builder builder) {
        c67689UwG.A00(new C67684UwB(uw5), 1);
        builder.add((Object) new C67696UwN(c67689UwG));
    }

    public static void A00(C67689UwG c67689UwG, Uw5 uw5, int i) {
        c67689UwG.A00(new C67684UwB(uw5), i);
    }

    public C67684UwB(Uw5 uw5) {
        super(uw5);
        this.A00 = uw5;
    }

    @Override // X.AbstractC69677VtM
    public final boolean A03(AbstractC69677VtM abstractC69677VtM) {
        boolean A03 = super.A03(abstractC69677VtM);
        if (!(abstractC69677VtM instanceof C67684UwB) || !A03) {
            return false;
        }
        Uw5 uw5 = this.A00;
        C69753Vuo c69753Vuo = uw5.A04;
        Uw5 uw52 = ((C67684UwB) abstractC69677VtM).A00;
        if (!C14360o3.A0K(c69753Vuo, uw52.A04) || !C14360o3.A0K(uw5.A02, uw52.A02) || !C14360o3.A0K(uw5.A03, uw52.A03) || !C14360o3.A0K(uw5.A01, uw52.A01) || !C14360o3.A0K(uw5.A06, uw52.A06) || !C14360o3.A0K(uw5.A00, uw52.A00)) {
            return false;
        }
        return AbstractC25231BEo.A1Z(uw5.A05, uw52.A05, false);
    }
}
