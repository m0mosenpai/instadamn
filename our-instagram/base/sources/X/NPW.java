package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NPW extends NEW {
    public final Fragment A00;
    public final UserSession A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NPW(Fragment fragment, UserSession userSession, InterfaceC58279PsX interfaceC58279PsX, boolean z) {
        super(userSession, interfaceC58279PsX);
        C14360o3.A0B(userSession, 2);
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C52613NPi(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_section_profiles, false), this.A00, this.A01, this.A02);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52616NPl.class;
    }
}
