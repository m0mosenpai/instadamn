package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.KRi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45853KRi extends AbstractC161727Mh {
    public final UserSession A00;
    public final C48980LlU A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;
    public final InterfaceC09390do A05;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C48980LlU c48980LlU = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48980LlU.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }

    public C45853KRi(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988, KSN ksn, C7IM c7im) {
        super(AbstractC43594JPz.A0X(layoutInflater, viewGroup, ksn), ksn, c7zx);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        C17050sx A01 = C50252MHh.A01(this, 19);
        this.A05 = A01;
        this.A01 = new C48980LlU(A01);
    }
}
