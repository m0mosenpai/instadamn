package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl;
import java.util.LinkedHashSet;

/* renamed from: X.7bP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165977bP implements InterfaceC13000lm {
    public ContentFilterEngineImpl A00;
    public C36741nX A01;
    public boolean A02;
    public final UserSession A03;
    public final C165987bQ A04;
    public final java.util.Set A05;
    public final C19L A06;
    public final C14090nZ A07;

    public C165977bP(C12N c12n, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c12n, 2);
        this.A03 = userSession;
        this.A04 = new C165987bQ(userSession, EnumC2043192h.A07, this);
        this.A05 = new LinkedHashSet();
        C14090nZ AOT = c12n.AOT(967036599, 3);
        this.A07 = AOT;
        this.A06 = AnonymousClass194.A02(AOT);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02 = false;
        this.A05.clear();
        C36741nX c36741nX = this.A01;
        if (c36741nX != null) {
            c36741nX.A02(this.A04);
        }
    }
}
