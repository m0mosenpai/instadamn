package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.KRn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45858KRn extends AbstractC161727Mh implements C7AX {
    public final UserSession A00;
    public final AnonymousClass988 A01;
    public final C7IM A02;
    public final C18A A03;
    public final C7AX A04;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C48998Llm c48998Llm = C48998Llm.A00;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A03;
        return c48998Llm.AWm(A03, userSession, this.A01, c160787Im, this.A02, c18a, false);
    }

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
        return this.A04.CFg(directMessageIdentifier);
    }

    public C45858KRn(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988, C45890KSt c45890KSt, C7IM c7im) {
        super(AbstractC43594JPz.A0X(layoutInflater, viewGroup, c45890KSt), c45890KSt, c7zx);
        this.A00 = userSession;
        this.A02 = c7im;
        this.A01 = anonymousClass988;
        this.A03 = AnonymousClass189.A00(userSession);
        this.A04 = c45890KSt;
    }
}
