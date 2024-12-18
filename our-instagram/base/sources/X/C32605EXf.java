package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EXf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32605EXf extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C57112jm A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(null, 0);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E3J(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_active_now_user, false), this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
    }

    public C32605EXf(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm) {
        AbstractC167027dH.A13(userSession, interfaceC11380iw, c57112jm);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = c57112jm;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E8P.class;
    }
}
