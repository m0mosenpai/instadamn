package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.DuP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31597DuP extends AbstractC66412zI {
    public final InterfaceC55362gb A00;
    public final C66112yn A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32618EXs c32618EXs = (C32618EXs) interfaceC66482zP;
        C81413kB c81413kB = (C81413kB) c3oo;
        AbstractC167017dG.A1N(c32618EXs, c81413kB);
        this.A01.ADw(this.A00, c32618EXs.A00, c81413kB);
    }

    public C31597DuP(UserSession userSession, InterfaceC55362gb interfaceC55362gb) {
        this.A00 = interfaceC55362gb;
        this.A01 = new C66112yn(userSession);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C81413kB(this.A01.Csl(layoutInflater, viewGroup));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32618EXs.class;
    }
}
