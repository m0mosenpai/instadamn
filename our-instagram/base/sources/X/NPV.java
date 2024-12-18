package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NPV extends NEW {
    public final boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NPV(UserSession userSession, InterfaceC58279PsX interfaceC58279PsX, boolean z) {
        super(userSession, interfaceC58279PsX);
        C14360o3.A0B(userSession, 1);
        this.A00 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C52611NPg(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_section_text, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52614NPj.class;
    }
}
