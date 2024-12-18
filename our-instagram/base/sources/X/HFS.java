package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;

/* loaded from: classes7.dex */
public final class HFS extends AbstractC65632xz {
    public float A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C53Q A03;
    public final C38N A04;

    public HFS(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C53Q c53q, C38N c38n) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = c38n;
        this.A03 = c53q;
        this.A01 = interfaceC11380iw;
        this.A00 = -1.0f;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return AbstractC31177DnL.A04(AbstractC37300Gc1.A0V(obj));
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return AbstractC153386v7.A00(this.A02, (C38321qM) obj);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1201602383);
        AbstractC167027dH.A13(view, obj, obj2);
        C41129IIu c41129IIu = (C41129IIu) obj2;
        IgMultiImageButton igMultiImageButton = (IgMultiImageButton) view;
        int i2 = c41129IIu.A02;
        int i3 = c41129IIu.A03;
        int i4 = c41129IIu.A01;
        int i5 = c41129IIu.A00;
        float f = this.A00;
        C38N c38n = this.A04;
        C53Q c53q = this.A03;
        AbstractC153416vB.A02(this.A01, this.A02, (C38321qM) obj, c53q, c38n, null, igMultiImageButton, null, null, f, i2, i3, i4, i5, false, false, false);
        AbstractC153416vB.A01(AbstractC166997dE.A0L(igMultiImageButton), igMultiImageButton, c41129IIu.A04);
        C0f9.A0A(250249187, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1241217306);
        IgMultiImageButton A00 = AbstractC153416vB.A00(AbstractC166997dE.A0L(viewGroup));
        C0f9.A0A(1627971993, A0G);
        return A00;
    }
}
