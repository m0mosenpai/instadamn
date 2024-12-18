package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This is slated to be merged with PortraitXmaMessageItemDefinitionShimViewHolder")
/* loaded from: classes8.dex */
public final class KRL extends AbstractC161727Mh {
    public final UserSession A00;
    public final C48956Ll2 A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C48956Ll2 c48956Ll2 = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48956Ll2.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Ll2, java.lang.Object] */
    public KRL(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, KSI ksi, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IM c7im) {
        super(AbstractC43594JPz.A0X(layoutInflater, viewGroup, ksi), ksi, c7zx);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new Object();
    }
}
