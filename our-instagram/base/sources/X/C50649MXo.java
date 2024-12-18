package X;

import android.content.Context;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.MXo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50649MXo {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final C57012jc A05;
    public final C9L7 A06;

    public static final void A00(C50649MXo c50649MXo, Integer num) {
        MXX.A02(c50649MXo.A04, num);
        c50649MXo.A00 = false;
        AbstractC166997dE.A1L(c50649MXo.A05.A01(), true);
        C8JT c8jt = c50649MXo.A06.A00;
        C8JT.A0m(c8jt);
        C8JT.A1B(c8jt, true);
        c8jt.A1U.A00().Ekh();
    }

    public C50649MXo(Context context, ViewStub viewStub, FragmentActivity fragmentActivity, UserSession userSession, C9L7 c9l7, boolean z) {
        Integer A00;
        this.A02 = context;
        this.A03 = fragmentActivity;
        this.A04 = userSession;
        this.A06 = c9l7;
        this.A05 = new C57012jc(viewStub);
        if (z && (A00 = MXX.A00(userSession)) != null) {
            A01(this, A00);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C50649MXo r10, java.lang.Integer r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50649MXo.A01(X.MXo, java.lang.Integer):void");
    }
}
