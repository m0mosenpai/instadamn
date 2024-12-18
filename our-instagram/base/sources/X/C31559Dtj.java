package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import com.instagram.model.reels.Reel;

/* renamed from: X.Dtj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31559Dtj extends AbstractC140596Xn {
    public final GYC A00;
    public final Integer A01;

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }

    public static void A00(Activity activity, RectF rectF, C38E c38e, Object obj, int i) {
        c38e.A05 = new C31559Dtj(activity, rectF, new GF3(obj, i));
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        RectF C5U = this.A00.C5U();
        if (C5U == null) {
            return C6PN.A01();
        }
        if (this.A01 == C05F.A00) {
            return C6PN.A04(C5U);
        }
        return C6PN.A03(C5U);
    }

    public final void A0C(RectF rectF) {
        GYC gyc = this.A00;
        if (gyc instanceof C31560Dtl) {
            ((C31560Dtl) gyc).A00 = rectF;
            return;
        }
        throw AbstractC166987dD.A14("can't set Target RectF when a delegate is passed");
    }

    public C31559Dtj(Activity activity, View view, InterfaceC63982vJ interfaceC63982vJ) {
        this(activity, AbstractC13880nE.A0G(view), interfaceC63982vJ);
    }

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.GYC, X.Dtl, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C31559Dtj(android.app.Activity r2, android.graphics.RectF r3, X.InterfaceC63982vJ r4, java.lang.Integer r5) {
        /*
            r1 = this;
            X.Dtl r0 = new X.Dtl
            r0.<init>()
            r0.A00 = r3
            r1.<init>(r2, r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31559Dtj.<init>(android.app.Activity, android.graphics.RectF, X.2vJ, java.lang.Integer):void");
    }

    public C31559Dtj(Activity activity, InterfaceC63982vJ interfaceC63982vJ, GYC gyc, Integer num) {
        super(activity, interfaceC63982vJ);
        this.A00 = gyc;
        this.A01 = num;
    }

    public C31559Dtj(Activity activity, RectF rectF, InterfaceC63982vJ interfaceC63982vJ) {
        this(activity, rectF, interfaceC63982vJ, C05F.A00);
    }
}
