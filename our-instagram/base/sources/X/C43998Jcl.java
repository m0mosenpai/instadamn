package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.Jcl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43998Jcl extends AbstractC66422zJ {
    public final UserSession A00;

    public C43998Jcl(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44731JrE(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_encrypted_backup_banner, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        MQZ c48672Lg0;
        C48301LZa c48301LZa = (C48301LZa) interfaceC66482zP;
        C44731JrE c44731JrE = (C44731JrE) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c48301LZa, c44731JrE);
        EnumC46164Kc2 enumC46164Kc2 = c48301LZa.A01;
        Integer num = c48301LZa.A02;
        View view = c44731JrE.A01;
        Activity A00 = AbstractC13330mJ.A00(AbstractC166997dE.A0L(view));
        UserSession userSession = c44731JrE.A03;
        int ordinal = enumC46164Kc2.ordinal();
        if (ordinal != 0) {
            if (ordinal != A1R) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            c48672Lg0 = new C48673Lg1(A00, userSession, num);
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        c48672Lg0 = new C48671Lfz(A00, userSession, num);
                    }
                } else {
                    c48672Lg0 = new Lg3(A00, userSession, num);
                }
            } else {
                c48672Lg0 = new C48674Lg2(A00, userSession, num);
            }
        } else {
            c48672Lg0 = new C48672Lg0(A00, userSession, num);
        }
        MQZ mqz = c48672Lg0;
        int A0H = AbstractC166987dD.A0H(mqz.BUI().A05);
        if (A0H != 0) {
            if (A0H == A1R) {
                AbstractC46509Ki8 abstractC46509Ki8 = c48301LZa.A00;
                c44731JrE.A04.setVisibility(8);
                ViewStub viewStub = c44731JrE.A02;
                if (viewStub.getParent() == null) {
                    View view2 = c44731JrE.A00;
                    if (view2 == null) {
                        view2 = view.requireViewById(R.id.megaphone);
                        c44731JrE.A00 = view2;
                        if (view2 == null) {
                            return;
                        }
                    }
                    AbstractC46731Klo.A00(view2, abstractC46509Ki8, mqz);
                    view2.setVisibility(0);
                    return;
                }
                viewStub.setOnInflateListener(new ViewStubOnInflateListenerC48089LQp(A1R ? 1 : 0, abstractC46509Ki8, mqz, c44731JrE));
                viewStub.setVisibility(0);
                return;
            }
            throw B4Z.A00();
        }
        AbstractC46509Ki8 abstractC46509Ki82 = c48301LZa.A00;
        AbstractC167007dF.A0x(c44731JrE.A00);
        IgdsBanner igdsBanner = c44731JrE.A04;
        igdsBanner.setVisibility(0);
        igdsBanner.setBody((CharSequence) mqz.BUI().A04, false);
        igdsBanner.setIcon(mqz.BUI().A03);
        igdsBanner.setAction((CharSequence) mqz.BUI().A00);
        igdsBanner.setDismissible(A1R);
        igdsBanner.setIconBackground(null);
        igdsBanner.A00 = new C49476Ltp(A1R ? 1 : 0, mqz, abstractC46509Ki82);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48301LZa.class;
    }
}
