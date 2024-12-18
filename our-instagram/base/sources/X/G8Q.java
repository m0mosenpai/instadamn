package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G8Q implements GZB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ EnumC456327x A01;
    public final /* synthetic */ C455127l A02;

    public G8Q(FragmentActivity fragmentActivity, EnumC456327x enumC456327x, C455127l c455127l) {
        this.A02 = c455127l;
        this.A00 = fragmentActivity;
        this.A01 = enumC456327x;
    }

    @Override // X.GZB
    public final void D3J(Context context) {
        C455127l c455127l = this.A02;
        C455127l.A0B(this.A00, c455127l);
        c455127l.A0S();
        UserSession userSession = c455127l.A02;
        AbstractC31172DnG.A1S(userSession, C05F.A03, this.A01.A00, AbstractC31176DnK.A03(c455127l, userSession));
    }

    @Override // X.GZB
    public final void onDismiss() {
        C455127l c455127l = this.A02;
        c455127l.A0S();
        UserSession userSession = c455127l.A02;
        AbstractC31172DnG.A1S(userSession, C05F.A1I, this.A01.A00, AbstractC31176DnK.A03(c455127l, userSession));
    }
}
