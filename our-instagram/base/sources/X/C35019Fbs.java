package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Fbs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35019Fbs {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final JR2 A02;

    public C35019Fbs(AbstractC59962oe abstractC59962oe, UserSession userSession, JR2 jr2) {
        C14360o3.A0B(jr2, 2);
        this.A01 = userSession;
        this.A02 = jr2;
        this.A00 = abstractC59962oe;
    }

    public final void A01(View view, C22P c22p) {
        Context A06 = AbstractC31173DnH.A06(view, 0);
        C14360o3.A0A(A06);
        C8QJ c8qj = new C8QJ(A06, this.A01, null, false);
        c8qj.A02(AbstractC16960so.A1Q(A00(A06.getDrawable(R.drawable.instagram_camera_pano_outline_24), AbstractC166997dE.A0p(A06, 2131954577), new C50170MDx(45, c22p, this)), A00(A06.getDrawable(R.drawable.instagram_microphone_pano_outline_24), AbstractC166997dE.A0p(A06, 2131953297), C37031GTn.A00), A00(A06.getDrawable(R.drawable.instagram_photo_gen_ai_pano_outline_24), AbstractC166997dE.A0p(A06, 2131964302), new MHM(this, 39)), A00(A06.getDrawable(R.drawable.instagram_app_imessage_pano_outline_24), AbstractC166997dE.A0p(A06, 2131966351), new MHM(this, 40))));
        if (c22p == C22P.A04) {
            c8qj.showAtLocation(view, 8388693, 0, 0);
        } else {
            c8qj.showAsDropDown(view, (int) ((-AbstractC166987dD.A0H(c8qj.A00().A00)) / 1.5d), 0);
        }
    }

    public static final C199928sw A00(Drawable drawable, String str, InterfaceC16820sZ interfaceC16820sZ) {
        return new C199928sw(null, drawable, null, new G85(interfaceC16820sZ, 10), null, str, 0, 0, 0, false, false, false, true, false, false, false);
    }

    public final void A02(C22P c22p) {
        Bundle A0C = AbstractC31177DnL.A0C(c22p);
        A0C.putSerializable(AbstractC111324zv.A00(1570), c22p);
        UserSession userSession = this.A01;
        AbstractC59962oe abstractC59962oe = this.A00;
        AbstractC31173DnH.A1I(abstractC59962oe, C6XJ.A02(abstractC59962oe.requireActivity(), A0C, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(4273)));
    }
}
