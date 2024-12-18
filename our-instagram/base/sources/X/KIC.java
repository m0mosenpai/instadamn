package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* loaded from: classes8.dex */
public final class KIC extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C7ZT A02;
    public final Lo1 A03;

    public KIC(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7ZT c7zt, Lo1 lo1) {
        C14360o3.A0B(c7zt, 4);
        this.A03 = lo1;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = c7zt;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        C44778Jrz c44778Jrz = new C44778Jrz(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_standard_dxma_message, false));
        c44778Jrz.A02.EZv(new C48558Ldv(A1R ? 1 : 0, this, c44778Jrz));
        return c44778Jrz;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C45186JzS c45186JzS = (C45186JzS) interfaceC66482zP;
        C44778Jrz c44778Jrz = (C44778Jrz) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c45186JzS, c44778Jrz);
        C7QY c7qy = c45186JzS.A00.A01;
        C158747Ak c158747Ak = c7qy.A0A;
        TextView textView = c44778Jrz.A01;
        if (c158747Ak != null) {
            textView.setText(c158747Ak.A02);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        C7TW c7tw = (C7TW) userSession.A01(C163377Ta.class, C7TZ.A00);
        DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
        String str2 = directMessageIdentifier.A02;
        boolean A02 = c7tw.A02(str2);
        InterfaceC56392iX interfaceC56392iX = c44778Jrz.A02;
        if (!A02) {
            interfaceC56392iX.setVisibility(8);
            return;
        }
        interfaceC56392iX.setVisibility(0);
        Lo1 lo1 = this.A03;
        C44780Js1 c44780Js1 = c44778Jrz.A00;
        if (c44780Js1 != null) {
            lo1.ADy(c7qy, c44780Js1);
            if (str2 == null || (str = c7qy.A0Y) == null) {
                return;
            }
            this.A02.AFl(str2, str, c7qy.Ar9().A00, directMessageIdentifier.A00, A1R);
            return;
        }
        C14360o3.A0F("standardDxmaViewHolder");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45186JzS.class;
    }
}
