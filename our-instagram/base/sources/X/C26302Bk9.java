package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Bk9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26302Bk9 extends AbstractC51572Yf {
    public final C51722Yv A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        Object A06 = c76223bS.A05.A06(FoaUserSession.class);
        if (A06 != null) {
            FoaUserSession foaUserSession = (FoaUserSession) A06;
            Drawable A00 = AbstractC27723CKq.A00(c76223bS, C29905DGt.A01(c76223bS, 13), AbstractC25225BEi.A1b());
            C51722Yv c51722Yv = this.A00;
            AbstractC77363dM.A00(c76223bS);
            C14360o3.A0B(foaUserSession, 1);
            return new C26620BpH(A00, null, ImageView.ScaleType.CENTER_CROP, null, C59182nJ.A04, C6BY.A01(AbstractC166987dD.A10(AbstractC28057CYl.A00(foaUserSession)).A0C().getUrl()), null, c51722Yv, "MetaAiProfilePictureComponent", 0);
        }
        throw AbstractC166997dE.A0g();
    }

    public C26302Bk9(C51722Yv c51722Yv) {
        this.A00 = c51722Yv;
    }
}
