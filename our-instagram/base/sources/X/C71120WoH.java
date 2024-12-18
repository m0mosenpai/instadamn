package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.WoH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71120WoH implements InterfaceC72016XFe {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.InterfaceC72016XFe
    public final /* bridge */ /* synthetic */ boolean AFe(C69427VnC c69427VnC, Object obj) {
        C68251VJn c68251VJn = (C68251VJn) obj;
        if (c69427VnC.A04 == null) {
            C69026Vg2 c69026Vg2 = c68251VJn.A02;
            if ((c69026Vg2 != null && c69026Vg2.A00 != null) || (!TextUtils.isEmpty(c68251VJn.A07)) || (!TextUtils.isEmpty(c68251VJn.A06))) {
                AbstractC69975Vyq.A00(this.A01, c69427VnC.A07, C05F.A02);
                C193328hC c193328hC = new C193328hC((Activity) this.A00);
                c193328hC.A0A(2131972711);
                c193328hC.A09(2131970146);
                c193328hC.A0J(new WHj(3, this, c69427VnC, c68251VJn), 2131972710);
                AbstractC31176DnK.A16(new DialogInterfaceOnClickListenerC70206WHe(14, this, c69427VnC), c193328hC, 2131960929);
                return false;
            }
            return true;
        }
        return true;
    }

    public C71120WoH(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
