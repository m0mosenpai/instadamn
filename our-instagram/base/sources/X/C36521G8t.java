package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;

/* renamed from: X.G8t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36521G8t implements InterfaceC58152PqH {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    public C36521G8t(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A04 = obj3;
        this.A01 = i;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                C31338Dq3 c31338Dq3 = (C31338Dq3) this.A02;
                UserSession userSession = c31338Dq3.A03;
                C14360o3.A0B(userSession, 0);
                AbstractC109484wa.A00(userSession).A00(true);
                C31338Dq3.A04(c31338Dq3, (C5HW) this.A04, AnonymousClass001.A0R(((C9CK) this.A03).A02, "_undo"), this.A01);
                return;
            case 1:
                C31338Dq3 c31338Dq32 = (C31338Dq3) this.A02;
                C5HW c5hw = (C5HW) this.A04;
                int i = this.A01;
                C31338Dq3.A04(c31338Dq32, c5hw, "delete_notification_undo_clicked", i);
                C31338Dq3.A0B.removeCallbacks((Runnable) this.A03);
                c31338Dq32.A06.COe(c5hw, i);
                return;
            default:
                C37600Ggv c37600Ggv = (C37600Ggv) this.A04;
                C38321qM c38321qM = (C38321qM) this.A02;
                C75113Zb c75113Zb = (C75113Zb) this.A03;
                int i2 = this.A01;
                C33172EkJ c33172EkJ = new C33172EkJ(c37600Ggv, 11);
                UserSession userSession2 = c37600Ggv.A03;
                boolean A02 = AbstractC35184Ffb.A02(userSession2);
                C1XH A00 = FB6.A00();
                InterfaceC60442pS interfaceC60442pS = c37600Ggv.A04;
                FragmentActivity fragmentActivity = c37600Ggv.A00;
                if (A02) {
                    A00.A06(fragmentActivity, userSession2, c38321qM, interfaceC60442pS, c75113Zb, c33172EkJ, i2, SaveApiUtil.A09(userSession2, c38321qM));
                } else {
                    A00.A01(fragmentActivity, userSession2, c38321qM, interfaceC60442pS, c75113Zb, c33172EkJ, c37600Ggv.A05, null, AbstractC43591JPw.A00(471), i2);
                }
                c37600Ggv.A06.A00.DY0();
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onTextClick(View view) {
    }
}
