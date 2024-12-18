package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.KRv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45866KRv extends AbstractC161677Mc {
    public final UserSession A00;
    public final LlA A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.LlA, java.lang.Object] */
    public C45866KRv(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C75Y c75y, AnonymousClass988 anonymousClass988, C7IM c7im) {
        super(C75Y.A00(layoutInflater, viewGroup), c75y);
        C14360o3.A0B(c75y, 2);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new Object();
    }

    @Override // X.AbstractC161687Md
    public final boolean A01() {
        return false;
    }

    @Override // X.AbstractC161677Mc
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A04(C7VC c7vc) {
        C14360o3.A0B(c7vc, 0);
        LlA llA = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return llA.AWm(A03, userSession, this.A02, c7vc, this.A03, c18a, false);
    }
}
