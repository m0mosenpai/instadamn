package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDR implements GYB {
    public final FragmentActivity A00;
    public final AbstractC12990ll A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        AbstractC12990ll abstractC12990ll = this.A01;
        Bundle A0b = AbstractC166987dD.A0b();
        C14360o3.A0B(abstractC12990ll, 1);
        AbstractC31173DnH.A1C(A0b, (UserSession) abstractC12990ll);
        V0C v0c = new V0C();
        v0c.setArguments(A0b);
        AbstractC31181DnP.A0a(v0c, fragmentActivity, abstractC12990ll);
    }

    public GDR(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        this.A00 = fragmentActivity;
        this.A01 = abstractC12990ll;
    }
}
