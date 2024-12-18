package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.75Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75Z extends AbstractC161677Mc {
    public final UserSession A00;
    public final C1574575b A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.75b, java.lang.Object] */
    public C75Z(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C75Y c75y, AnonymousClass988 anonymousClass988, C7IM c7im) {
        super(C75Y.A00(layoutInflater, viewGroup), c75y);
        C14360o3.A0B(c75y, 2);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new Object();
    }
}
