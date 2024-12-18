package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.Eab, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32710Eab extends C32711Eac {
    public final C35967FuR A00;
    public final UserSession A01;

    @Override // X.C32711Eac, X.E48
    public void A01(C32716Eah c32716Eah) {
        super.A01(c32716Eah);
        User user = c32716Eah.A01.A02;
        if (user != null) {
            LGr lGr = ((C32711Eac) this).A02;
            CircularImageView A01 = lGr.A01();
            View view = lGr.A0D.getView();
            C35967FuR c35967FuR = this.A00;
            AbstractC167027dH.A13(A01, view, c35967FuR);
            AbstractC31173DnH.A1T(c35967FuR, A01, user);
            view.setVisibility(0);
            AbstractC31172DnG.A1T(lGr.A0J, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.FuR, java.lang.Object] */
    public C32710Eab(View view, UserSession userSession, FQ9 fq9, int i, boolean z) {
        super(view, userSession, fq9, i, z);
        AbstractC167017dG.A1P(userSession, fq9);
        this.A01 = userSession;
        this.A00 = new Object();
    }
}
