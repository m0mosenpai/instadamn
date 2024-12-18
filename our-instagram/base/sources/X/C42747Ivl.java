package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ivl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42747Ivl implements InterfaceC65342xW {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final C42749Ivn A03;
    public final EnumC125765mR A04;
    public final UserDetailFragment A05;
    public final C155396yS A06;
    public final C39144HKx A07;
    public final List A08;
    public final boolean A09;

    public C42747Ivl(Context context, UserSession userSession, C42749Ivn c42749Ivn, EnumC125765mR enumC125765mR, UserDetailFragment userDetailFragment, C155396yS c155396yS, C38U c38u, boolean z) {
        C14360o3.A0B(c38u, 9);
        this.A05 = userDetailFragment;
        this.A04 = enumC125765mR;
        this.A06 = c155396yS;
        this.A03 = c42749Ivn;
        this.A09 = z;
        this.A02 = userSession;
        this.A07 = new C39144HKx(C42411xV.A00(userSession), c38u);
        this.A08 = AbstractC166987dD.A1E();
        this.A01 = context;
    }

    public static final void A00(C42747Ivl c42747Ivl) {
        Iterator it = c42747Ivl.A08.iterator();
        while (it.hasNext()) {
            ((C152906uK) it.next()).A00();
        }
    }

    @Override // X.InterfaceC65342xW
    public final Iterator EWm(InterfaceC61752rc interfaceC61752rc) {
        return this.A07.EWm(interfaceC61752rc);
    }
}
