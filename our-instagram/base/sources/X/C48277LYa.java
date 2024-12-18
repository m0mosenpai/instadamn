package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.LYa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48277LYa implements InterfaceC60602pj, InterfaceC41501vz, InterfaceC65982ya {
    public java.util.Set A00;
    public final AbstractC59962oe A01;
    public final C25671My A02;
    public final UserSession A03;
    public final PendingMediaStore A04;
    public final Map A05;
    public final boolean A06;

    public C48277LYa(AbstractC59962oe abstractC59962oe, C25671My c25671My, UserSession userSession, boolean z) {
        C14360o3.A0B(abstractC59962oe, 2);
        this.A03 = userSession;
        this.A01 = abstractC59962oe;
        this.A02 = c25671My;
        this.A06 = z;
        this.A04 = C25A.A00(userSession);
        this.A00 = AbstractC166987dD.A1H();
        this.A05 = AbstractC166987dD.A1G();
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        C115435Kd c115435Kd;
        C14360o3.A0B(c47z, 0);
        if (c47z.A1f == EnumC915447k.A02 || ((c115435Kd = c47z.A6I) != null && c115435Kd.A00 == 403)) {
            A01(c47z);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final void A00() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AbstractC43592JPx.A0l(it).A0X(this);
        }
        Map map = this.A05;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            C41451vu.A01.E4s(new C3KI((C54971OTd) AbstractC166987dD.A1K(A15).getValue()));
        }
        this.A00.clear();
        map.clear();
    }

    private final void A01(C47Z c47z) {
        Map map = this.A05;
        if (map.containsKey(c47z.A35)) {
            C54971OTd c54971OTd = (C54971OTd) map.get(c47z.A35);
            if (c54971OTd != null) {
                C41451vu.A01.E4s(new C3KI(c54971OTd));
                map.remove(c47z.A35);
            }
            c47z.A0X(this);
        }
    }

    private final void A02(C47Z c47z) {
        Map map = this.A05;
        if (!map.containsKey(c47z.A35)) {
            Context context = this.A01.getContext();
            if (context != null) {
                C49498LuB c49498LuB = new C49498LuB(context, c47z, this.A06);
                c47z.A0W(c49498LuB);
                c47z.A0W(this);
                C54971OTd c54971OTd = new C54971OTd((C49490Lu3) null, c49498LuB);
                C41451vu.A01.E4s(new C3KH(c54971OTd));
                map.put(c47z.A35, c54971OTd);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        Collection values = this.A04.A06.values();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : values) {
            C47Z c47z = (C47Z) obj;
            if (AbstractC93564Hx.A00(c47z, C05F.A08) && c47z.A0m()) {
                A1E.add(obj);
            }
        }
        java.util.Set A0j = AbstractC001800i.A0j(AbstractC001800i.A0a(JUD.A00(A1E, 52)));
        this.A00 = A0j;
        Iterator it = A0j.iterator();
        while (it.hasNext()) {
            A02(AbstractC43592JPx.A0l(it));
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        A00();
        this.A01.unregisterLifecycleListener(this);
        this.A02.A02(this, LYL.class);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(-401084223);
        LYL lyl = (LYL) obj;
        int A0N = AbstractC167017dG.A0N(lyl, 1680222125);
        C47Z c47z = lyl.A00;
        if (lyl.A01) {
            A01(c47z);
            i = -1167709963;
        } else {
            A02(c47z);
            if (!this.A00.contains(c47z)) {
                this.A00.add(c47z);
            }
            i = -282968467;
        }
        C0f9.A0A(i, A0N);
        C0f9.A0A(2059966476, A03);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        A00();
    }
}
