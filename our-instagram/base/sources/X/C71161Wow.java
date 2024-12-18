package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.Wow, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71161Wow implements InterfaceC71986XDx {
    public final Context A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C67923V2n A05;
    public final WD6 A06;
    public final C70947Wkt A07;

    public C71161Wow(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C67923V2n c67923V2n, WD6 wd6, C70947Wkt c70947Wkt) {
        AbstractC25233BEq.A0x(1, userSession, c67923V2n, c70947Wkt);
        C14360o3.A0B(wd6, 6);
        this.A04 = userSession;
        this.A00 = context;
        this.A01 = fragment;
        this.A05 = c67923V2n;
        this.A07 = c70947Wkt;
        this.A06 = wd6;
        this.A03 = interfaceC11380iw;
        this.A02 = fragment.requireActivity();
    }

    @Override // X.InterfaceC71986XDx
    public final void D6C(C84923qg c84923qg) {
        if (this.A01.mView != null) {
            C67923V2n c67923V2n = this.A05;
            if (c84923qg.A0l && !c84923qg.A0P) {
                X25 x25 = c67923V2n.A06.A00;
                if (!x25.remove(c84923qg)) {
                    ImmutableSet A03 = ImmutableSet.A03(x25);
                    C14360o3.A07(A03);
                    int size = A03.size();
                    if (size < 25) {
                        x25.add(c84923qg);
                    } else {
                        Context context = c67923V2n.A03;
                        C9GR.A03(context, AbstractC167017dG.A0k(context.getResources(), size, R.plurals.selection_max_reached), null, 0);
                    }
                }
                c67923V2n.A00();
            }
        }
    }

    @Override // X.InterfaceC71986XDx
    public final void Cx9(C84923qg c84923qg) {
        this.A06.A01(c84923qg);
    }

    @Override // X.InterfaceC71986XDx
    public final void D9f(C84923qg c84923qg) {
        this.A07.A00(c84923qg);
    }

    @Override // X.InterfaceC71986XDx
    public final void Dxk(User user, String str) {
        UserSession userSession = this.A04;
        new C6XJ(this.A02, AbstractC31364DqT.A03().A01.A01(userSession, AbstractC31402Dr6.A01(userSession, user.getId(), "DefaultLimitedCommentRowDelegate", this.A03.getModuleName()).A03()), userSession, ModalActivity.class, "profile").A0C(this.A00);
    }
}
