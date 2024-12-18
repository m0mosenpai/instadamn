package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N9D extends AbstractC65632xz {
    public final Context A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final ENZ A03;

    public N9D(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, ENZ enz) {
        C14360o3.A0B(userSession, 3);
        this.A00 = context;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = enz;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0120, code lost:
    
        if (r5.length() == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011a, code lost:
    
        if (r5 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0Zx, X.MnJ] */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r18, android.view.View r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N9D.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        if (C55628OnD.A00 != null) {
            AbstractC25651Mw.A00(userSession).A02(C55628OnD.A00, C211849aB.class);
            C55628OnD.A00 = null;
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 977007881);
        Context context = this.A00;
        UserSession userSession = this.A02;
        boolean A06 = C18U.A06(AbstractC25225BEi.A0j(userSession, 2), userSession, 36329762557280783L);
        int i2 = R.layout.row_share_to_fb_layout;
        if (A06) {
            i2 = R.layout.row_share_to_fb_large_icon_layout;
        }
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, i2);
        C14360o3.A0A(A0A);
        A0A.setTag(new OFL(A0A));
        C0f9.A0A(1385155892, A0G);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
