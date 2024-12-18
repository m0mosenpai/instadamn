package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G7K implements MP4 {
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;

    public G7K(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(interfaceC11380iw, 4);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A03 = interfaceC60442pS;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.MP4
    public final void D17(C44Q c44q, C38321qM c38321qM, C75113Zb c75113Zb) {
        int i;
        AbstractC167027dH.A12(c38321qM, c75113Zb, c44q);
        C44O Ast = c44q.Ast();
        if (Ast != null) {
            i = Ast.AdZ();
        } else {
            i = 1;
        }
        if (!c38321qM.CdW()) {
            UserSession userSession = this.A02;
            if (C18U.A06(C06090Tz.A05, userSession, 2342170985064905750L)) {
                AbstractC40635Hzt.A00(userSession, c38321qM, this.A03, c75113Zb);
            }
        }
        C28531Zo c28531Zo = C28531Zo.A04;
        UserSession userSession2 = this.A02;
        c28531Zo.A03(this.A00.requireActivity(), this.A01, userSession2, c44q.C7K(), c44q.BJP(), null, AbstractC111324zv.A00(2257), i);
    }
}
