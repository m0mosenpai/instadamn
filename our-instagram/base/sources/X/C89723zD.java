package X;

import android.graphics.drawable.ColorDrawable;

/* renamed from: X.3zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89723zD extends AbstractC51572Yf {
    public final AnonymousClass414 A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String A0F;
        C14360o3.A0B(c76223bS, 0);
        AnonymousClass414 anonymousClass414 = this.A00;
        C51722Yv c51722Yv = null;
        if (anonymousClass414 == null) {
            return null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv2 = new C51722Yv(null, new C9CV(C05F.A00, new ColorDrawable(c76223bS.BoZ().A02(AbstractC53242c7.A04(c76223bS.A05.A0C))), 4));
        Integer num = C05F.A01;
        C51722Yv c51722Yv3 = new C51722Yv(c51722Yv2, new C9CV(num, "android.widget.Button", 0));
        String str = anonymousClass414.A03;
        if (str != null) {
            A0F = AbstractC77623dm.A0G(c76223bS, str, 2131952054);
        } else {
            A0F = AbstractC77623dm.A0F(c76223bS, 2131952054);
        }
        C51722Yv c51722Yv4 = new C51722Yv(new C51722Yv(c51722Yv3, new C9CV(C05F.A0N, A0F, 0)), new C9CV(C05F.A1F, new DRQ(this, 17), 4));
        if (anonymousClass414.A04) {
            c51722Yv = new C51722Yv(null, new C9CU(num, 0, 9221401712017801264L));
        }
        return AbstractC76963ci.A0M(c76223bS, c51722Yv4.A00(c51722Yv));
    }

    public C89723zD(AnonymousClass414 anonymousClass414) {
        this.A00 = anonymousClass414;
    }
}
