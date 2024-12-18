package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KQX extends AbstractC44597Jow {
    public final int A00;
    public final View A01;
    public final MRG A02;
    public final UserSession A03;

    public static final void A00(KQX kqx, C43795JYi c43795JYi, JUS jus, int i, int i2) {
        C25313BIi c25313BIi = (C25313BIi) jus.A01.get(i);
        C43792JYf A00 = AbstractC43791JYe.A00(AbstractC166997dE.A0L(kqx.A01), c25313BIi, kqx.A03, jus.A02);
        Object obj = c25313BIi.A02;
        MRG mrg = kqx.A02;
        c43795JYi.A00(A00, new MHX(i, 12, A00, kqx, jus), C14360o3.A0K(obj, mrg.Bsj()));
        c43795JYi.itemView.setMinimumWidth(i2);
        mrg.DHk(AbstractC31171DnF.A06(kqx), A00, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KQX(View view, UserSession userSession, MRG mrg) {
        super(view);
        AbstractC167017dG.A1Q(userSession, mrg);
        this.A03 = userSession;
        this.A01 = view;
        this.A02 = mrg;
        this.A00 = AbstractC13880nE.A0A(AbstractC166997dE.A0L(view));
    }
}
