package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.KRb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45846KRb extends AbstractC161727Mh {
    public final UserSession A00;
    public final C48969LlJ A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C48969LlJ c48969LlJ = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48969LlJ.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.LlJ] */
    public C45846KRb(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988, C45875KSe c45875KSe, C7IM c7im) {
        super(AbstractC43594JPz.A0X(layoutInflater, viewGroup, c45875KSe), c45875KSe, c7zx);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new Object();
    }
}