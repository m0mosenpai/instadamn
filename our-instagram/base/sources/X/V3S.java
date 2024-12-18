package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V3S extends AbstractC168697g3 {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final XEF A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC31176DnK.A1T(anonymousClass306);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0091, code lost:
    
        if (r13.length() == 0) goto L9;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r25, android.view.View r26, android.view.ViewGroup r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V3S.getView(int, android.view.View, android.view.ViewGroup, java.lang.Object, java.lang.Object):android.view.View");
    }

    public V3S(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, XEF xef, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1R(userSession, interfaceC11380iw);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = xef;
        this.A04 = z;
        this.A06 = z2;
        this.A05 = z3;
    }
}
