package X;

import android.content.Context;

/* renamed from: X.Etc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33626Etc {
    public final void A00() {
        if (this instanceof C32986Efs) {
            C32986Efs c32986Efs = (C32986Efs) this;
            if (1 - c32986Efs.A00 == 0) {
                EUZ euz = (EUZ) c32986Efs.A01;
                LIA lia = euz.A08;
                C07270a1 c07270a1 = euz.A03;
                String str = euz.A05;
                String str2 = euz.A06;
                LIA.A00(euz.A02, euz.A01, c07270a1, lia, euz.A04, str, str2, euz.A07);
                return;
            }
        }
        throw C00O.createAndThrow();
    }

    public final void A01() {
        if (this instanceof C32987Eft) {
            C32987Eft c32987Eft = (C32987Eft) this;
            Context context = c32987Eft.A00;
            EKE eke = c32987Eft.A01;
            AbstractC35276FhB.A01(context, eke.A01, null, null, eke.A0A, null, true, false);
            return;
        }
        if (this instanceof C32986Efs) {
            C32986Efs c32986Efs = (C32986Efs) this;
            if (c32986Efs.A00 == 0) {
                ELA.A00((ELA) c32986Efs.A01);
                return;
            }
        }
        throw C00O.createAndThrow();
    }
}
