package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;

/* loaded from: classes8.dex */
public final class KIO extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final L44 A01;
    public final MQ2 A02;
    public final boolean A03;
    public final UserSession A04;

    public KIO(InterfaceC11380iw interfaceC11380iw, UserSession userSession, L44 l44, MQ2 mq2, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A02 = mq2;
        this.A04 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = l44;
        this.A03 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44766Jrn(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.emoji_reaction_row, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r20, X.C3OO r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIO.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return ReactionViewModel.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C45115Jxk c45115Jxk;
        L44 l44;
        String str;
        C44766Jrn c44766Jrn = (C44766Jrn) c3oo;
        if (c44766Jrn != null && (c45115Jxk = c44766Jrn.A00) != null && (l44 = this.A01) != null) {
            String str2 = c45115Jxk.A06;
            L2Y l2y = l44.A00;
            if (l2y != null) {
                str = l2y.A00;
            } else {
                str = null;
            }
            if (C14360o3.A0K(str2, str)) {
                L2Y l2y2 = l44.A00;
                if (l2y2 != null) {
                    C47985LJk.A00(l2y2.A01, l2y2.A02, l2y2.A03);
                }
                l44.A00 = null;
            }
            l44.A03.remove(c45115Jxk);
        }
    }
}
