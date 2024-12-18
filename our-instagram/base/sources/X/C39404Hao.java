package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Hao, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39404Hao extends AnonymousClass522 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39404Hao(InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        InterfaceC16820sZ interfaceC16820sZ;
        String str;
        switch (this.A00) {
            case 0:
                interfaceC16820sZ = ((C42317Iof) this.A01).A01.A02;
                break;
            case 1:
                C14360o3.A0B(view, 0);
                C12260kU.A0G(((ID8) this.A01).A00.requireContext(), AbstractC08820cl.A03("https://www.facebook.com/help/instagram/518659859068596"));
                return;
            case 2:
                HZ1 hz1 = ((C41593Iag) this.A01).A03;
                C41729Ie0 c41729Ie0 = hz1.A01;
                User user = hz1.A03.BUL().Bgk().A0B;
                FragmentActivity fragmentActivity = c41729Ie0.A05;
                UserSession userSession = c41729Ie0.A08;
                if (user != null) {
                    str = AbstractC37300Gc1.A0U(user);
                } else {
                    str = null;
                }
                AbstractC41356ISb.A01(fragmentActivity, userSession, str, c41729Ie0.A09.getModuleName(), "attribute_section", c41729Ie0.A0J);
                return;
            case 3:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                break;
            default:
                super.onClick(view);
                return;
        }
        interfaceC16820sZ.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39404Hao(ID8 id8, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = id8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39404Hao(C41593Iag c41593Iag, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = c41593Iag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39404Hao(C42317Iof c42317Iof, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = c42317Iof;
    }
}
