package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.KRm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45857KRm extends AbstractC161727Mh {
    public static final C47725L5m A05 = new Object();
    public final UserSession A00;
    public final C48975LlP A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C48975LlP c48975LlP = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48975LlP.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.LlP, java.lang.Object] */
    public C45857KRm(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IM c7im, C45879KSi c45879KSi) {
        super(AbstractC43594JPz.A0X(layoutInflater, viewGroup, c45879KSi), c45879KSi, c7zx);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new Object();
    }
}