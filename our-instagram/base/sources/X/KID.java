package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KID extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final EnumC46220Kcw A02;
    public final C47431KxM A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44700Jqj(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.pending_threads_spam_folder_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C4I3 c4i3;
        C48303LZc c48303LZc = (C48303LZc) interfaceC66482zP;
        C44700Jqj c44700Jqj = (C44700Jqj) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c48303LZc, c44700Jqj);
        c44700Jqj.A02.setText(c48303LZc.A01);
        int i = c48303LZc.A00;
        if (AbstractC43593JPy.A1Z(i, 20)) {
            str = "+";
        } else {
            str = "";
        }
        c44700Jqj.A01.setText(AnonymousClass001.A03(i, str));
        boolean z = c48303LZc.A02;
        String str2 = null;
        View view = c44700Jqj.A00;
        if (z) {
            ViewOnClickListenerC48074LPz.A01(view, 33, this);
        } else {
            view.setOnClickListener(null);
        }
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        AbstractC25230BEn.A15(A1a ? 1 : 0, userSession, interfaceC11380iw);
        LEW lew = (LEW) userSession.A01(LEW.class, new C50171MDy(17, interfaceC11380iw, userSession));
        EnumC46220Kcw enumC46220Kcw = this.A02;
        if (enumC46220Kcw != null && (c4i3 = enumC46220Kcw.A02) != null) {
            str2 = c4i3.A00;
        }
        LEW.A00(lew, "filter_tap", str2, null, null, -1);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48303LZc.class;
    }

    public KID(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC46220Kcw enumC46220Kcw, C47431KxM c47431KxM) {
        this.A03 = c47431KxM;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = enumC46220Kcw;
    }
}
