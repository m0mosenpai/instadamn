package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bp9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26612Bp9 extends AbstractC77583di {
    public final Activity A00;
    public final UserSession A01;
    public final CR3 A02;
    public final C26269Bjc A03;
    public final C51722Yv A04;

    public C26612Bp9(Activity activity, C51722Yv c51722Yv, UserSession userSession, CR3 cr3, C26269Bjc c26269Bjc) {
        AbstractC167027dH.A0a(1, activity, userSession, c26269Bjc, c51722Yv);
        C14360o3.A0B(cr3, 5);
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = c26269Bjc;
        this.A04 = c51722Yv;
        this.A02 = cr3;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.0oy, java.lang.Object] */
    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        ?? obj = new Object();
        obj.A00 = -1.0d;
        C51762Yz A00 = AbstractC77073ct.A00(c77993eR, DGQ.A00);
        C19270xB c19270xB = new C19270xB("ig_threads_in_reels_unit");
        C29065Crs c29065Crs = C29065Crs.A00;
        C2YP A0c = AbstractC25229BEm.A0c(c77993eR, AbstractC25230BEn.A0j(BVS.A00, false), DGP.A00, DRY.A00(this, c19270xB, 43));
        C51722Yv c51722Yv = this.A04;
        C75933ay c75933ay = C51722Yv.A02;
        return AbstractC25225BEi.A0g(c51722Yv.A00(AbstractC25230BEn.A0e(AbstractC25225BEi.A0h(null, new C77863eE(C05F.A01, new C29925DHn(0, A00, this, obj, c19270xB), null)), C05F.A0Y, C30180DRl.A00(obj, 32), null)), c29065Crs, A0c);
    }
}
