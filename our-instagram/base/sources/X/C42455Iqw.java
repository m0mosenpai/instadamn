package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iqw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42455Iqw implements InterfaceC30994Djt {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC686136y A02;
    public final InterfaceC60442pS A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.EnumC39641HiW r9, X.C4SX r10, X.C38321qM r11, java.lang.Boolean r12, java.lang.Long r13, java.lang.String r14, int r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42455Iqw.A00(X.HiW, X.4SX, X.1qM, java.lang.Boolean, java.lang.Long, java.lang.String, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r4 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025d  */
    @Override // X.InterfaceC30994Djt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DmW(android.view.View r35, X.C3Y6 r36, X.C38321qM r37, X.C38321qM r38, X.C75113Zb r39, int r40) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42455Iqw.DmW(android.view.View, X.3Y6, X.1qM, X.1qM, X.3Zb, int):void");
    }

    public C42455Iqw(Fragment fragment, UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        this.A02 = interfaceC686136y;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A03 = interfaceC60442pS;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.InterfaceC30994Djt
    public final boolean Dt7(MotionEvent motionEvent, View view, C3Y6 c3y6, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1P(c3y6, c75113Zb);
        if (motionEvent.getAction() == 0) {
            motionEvent.setLocation(motionEvent.getX() + (view.getWidth() * i), motionEvent.getY() + c3y6.A0F.getHeight());
            c75113Zb.A0k = I0O.A00(motionEvent, c3y6.A01);
            return false;
        }
        return false;
    }
}
