package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OFb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54724OFb {
    public View A00;
    public final View A01;
    public final View A02;
    public final OL4 A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    public C54724OFb(View view, Fragment fragment, UserSession userSession, OL4 ol4, EnumC142806cg enumC142806cg, int i) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A03 = ol4;
        this.A0A = C1XM.A00(new C57250PbY(view, i, A1V ? 1 : 0));
        this.A07 = C57547PgL.A00(view, 20);
        this.A09 = C57547PgL.A00(view, 22);
        this.A08 = C57547PgL.A00(view, 21);
        this.A04 = C57547PgL.A00(view, 17);
        this.A06 = C57547PgL.A00(view, 19);
        this.A05 = C57547PgL.A00(view, 18);
        this.A01 = AbstractC166997dE.A0S(view, R.id.avatar_likes_container);
        this.A02 = AbstractC166997dE.A0S(view, R.id.iglive_reactions_shadow_bottom);
        C57532Pg6 A00 = C57532Pg6.A00(userSession, enumC142806cg, 30);
        InterfaceC09390do A01 = C57547PgL.A01(new C57547PgL(fragment, 23), EnumC09460dv.A02, 24);
        C60842q8 A0a = AbstractC25225BEi.A0a(new C57547PgL(A01, 25), A00, C57532Pg6.A00(null, A01, 29), AbstractC25225BEi.A1D(C50916Mel.class));
        this.A0B = A0a;
        if (enumC142806cg != EnumC142806cg.A05) {
            AbstractC37301Gc2.A0w(fragment.getViewLifecycleOwner(), ((C50916Mel) A0a.getValue()).A00, C57755Pji.A02(this, 4), 20);
        }
    }
}
