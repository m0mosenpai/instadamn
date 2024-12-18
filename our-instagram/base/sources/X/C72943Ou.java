package X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.3Ou, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72943Ou extends C3OO implements InterfaceC72953Ov {
    public UserSession A00;
    public IgImageView A01;
    public final C72973Oy A02;
    public final RecyclerReelAvatarView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72943Ou(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.avatar_view);
        C14360o3.A07(requireViewById);
        this.A03 = (RecyclerReelAvatarView) requireViewById;
        this.A02 = new C72973Oy(view);
    }

    @Override // X.InterfaceC72953Ov
    public final void CJH(float f) {
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.InterfaceC72953Ov
    public final View AeT() {
        return this.A02.A02.A00();
    }

    @Override // X.C3Ow
    public final View Aek() {
        UserSession userSession;
        RecyclerReelAvatarView recyclerReelAvatarView = this.A03;
        C3PN c3pn = ((C3P2) recyclerReelAvatarView.getHolder().A03.getValue()).A09;
        if (c3pn != null && c3pn.A04 && (userSession = this.A00) != null && C18U.A06(C06090Tz.A05, userSession, 36325626503836890L)) {
            return ((C3PX) ((C72993Pa) recyclerReelAvatarView.getHolder().A04.getValue()).A01.getValue()).A00();
        }
        return recyclerReelAvatarView.getHolder().A00();
    }

    @Override // X.InterfaceC72953Ov
    public final View BlH() {
        View view = this.itemView;
        C14360o3.A06(view);
        return view;
    }

    @Override // X.InterfaceC72953Ov
    public final String BlW() {
        return this.A02.A02.A01;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return ((C3P2) this.A03.getHolder().A03.getValue()).A0O;
    }

    @Override // X.InterfaceC72953Ov
    public final void EcK(C140626Xq c140626Xq) {
        this.A02.A01 = c140626Xq;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(Aek());
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(Aek());
    }

    @Override // X.C3Ow
    public final void CMM() {
        Aek().setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        Aek().setVisibility(0);
    }
}
