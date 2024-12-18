package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Eif, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33082Eif extends AbstractC82033lP {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C31195Dne A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C141586ab A03;
    public final /* synthetic */ List A04;

    public C33082Eif(FragmentActivity fragmentActivity, C31195Dne c31195Dne, UserSession userSession, C141586ab c141586ab, List list) {
        this.A01 = c31195Dne;
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = c141586ab;
        this.A04 = list;
    }

    @Override // X.AbstractC82033lP
    public final void A02(Map map) {
        C31195Dne.A01(this.A00, this.A02, this.A03, this.A04);
    }
}
