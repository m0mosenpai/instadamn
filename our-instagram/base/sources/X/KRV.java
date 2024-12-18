package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KRV extends AbstractC161727Mh {
    public final UserSession A00;
    public final C48982LlW A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KRV(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988, KSR ksr, C7IM c7im, Map map) {
        super(ksr.createViewHolder(layoutInflater, viewGroup), ksr, c7zx);
        AbstractC167007dF.A1I(ksr, 3, map);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new C48982LlW(map);
    }

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C48982LlW c48982LlW = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48982LlW.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }
}
