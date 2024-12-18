package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KRD extends AbstractC161727Mh {
    public final UserSession A00;
    public final Ll4 A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        Ll4 ll4 = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A A00 = AnonymousClass189.A00(userSession);
        return ll4.AWm(A03, userSession, this.A02, c160787Im, this.A03, A00, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Ll4, java.lang.Object] */
    public KRD(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, KSJ ksj, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IM c7im) {
        super(AbstractC43594JPz.A0X(layoutInflater, viewGroup, ksj), ksj, c7zx);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A01 = new Object();
    }
}
