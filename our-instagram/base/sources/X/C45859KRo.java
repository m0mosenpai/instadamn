package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.KRo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45859KRo extends AbstractC161727Mh implements C7AX {
    public final UserSession A00;
    public final C48983LlX A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;
    public final C7AX A05;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C48983LlX c48983LlX = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48983LlX.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
        return this.A05.CFg(directMessageIdentifier);
    }

    public C45859KRo(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C98K c98k, C7ZX c7zx, AnonymousClass988 anonymousClass988, C45891KSu c45891KSu, C7IM c7im) {
        super(AbstractC43594JPz.A0X(layoutInflater, viewGroup, c45891KSu), c45891KSu, c7zx);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A05 = c45891KSu;
        this.A01 = new C48983LlX(c98k);
    }
}
