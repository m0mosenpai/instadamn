package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NPX extends NEW {
    public final C66392zG A00;
    public final C54421O3b A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NPX(C66392zG c66392zG, UserSession userSession, InterfaceC58279PsX interfaceC58279PsX, boolean z) {
        super(userSession, interfaceC58279PsX);
        C14360o3.A0B(userSession, 1);
        this.A00 = c66392zG;
        this.A02 = z;
        C06090Tz c06090Tz = C06090Tz.A05;
        C18U.A06(c06090Tz, userSession, 36316267770613966L);
        this.A01 = new C54421O3b(C18U.A06(c06090Tz, userSession, 36316267770155213L));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C52612NPh(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_section_post, false), this.A02);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52615NPk.class;
    }
}
