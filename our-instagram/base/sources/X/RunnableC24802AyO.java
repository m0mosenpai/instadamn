package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.AyO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24802AyO implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ IgImageView A02;

    public RunnableC24802AyO(ViewGroup viewGroup, UserSession userSession, IgImageView igImageView) {
        this.A02 = igImageView;
        this.A00 = viewGroup;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgImageView igImageView = this.A02;
        C5SU c5su = new C5SU(AbstractC166997dE.A0L(igImageView), this.A00, new C149686oL(2131963356));
        c5su.A03(igImageView);
        c5su.A02();
        c5su.A00().A07(this.A01);
    }
}
