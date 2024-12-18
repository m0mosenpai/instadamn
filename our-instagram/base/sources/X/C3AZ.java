package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.3AZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AZ implements InterfaceC60602pj, InterfaceC61312qt {
    public static final Handler A09 = new Handler(Looper.getMainLooper());
    public C69473Ah A00;
    public final UserSession A02;
    public final InterfaceC11380iw A05;
    public final java.util.Set A08 = new LinkedHashSet();
    public final HashSet A03 = new HashSet();
    public final Runnable A07 = new Runnable() { // from class: X.3Aa
        @Override // java.lang.Runnable
        public final void run() {
            C3AZ c3az = C3AZ.this;
            C69473Ah c69473Ah = c3az.A00;
            if (c69473Ah != null) {
                C3AZ.A01(C3G5.A09, c3az, C3AZ.A00(c3az, c69473Ah.A02()));
            }
        }
    };
    public final double A01 = 0.03d;
    public final int A04 = 3;
    public final AbstractC69423Ac A06 = new C69413Ab(this);

    public static final synchronized ArrayList A00(C3AZ c3az, List list) {
        ArrayList arrayList;
        synchronized (c3az) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                java.util.Set set = c3az.A08;
                if (!set.contains(reel.getId())) {
                    if (!C18U.A06(C06090Tz.A05, c3az.A02, 36325794008675713L)) {
                        String id = reel.getId();
                        C14360o3.A07(id);
                        set.add(id);
                    }
                    boolean z = false;
                    if (reel.A0P == ReelType.A0n) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(reel);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC61312qt
    public final void DKn(boolean z) {
    }

    @Override // X.InterfaceC61322qu
    public final void DXf(long j, int i) {
    }

    @Override // X.InterfaceC61322qu
    public final void DXg(long j) {
    }

    @Override // X.InterfaceC61312qt
    public final void De4(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC61312qt
    public final /* synthetic */ void DeD(Integer num, int i, long j, boolean z) {
    }

    @Override // X.InterfaceC61312qt
    public final synchronized void DeE(C1OP c1op, String str, int i, long j, boolean z, boolean z2) {
        if (!z && (i == -1 || i == 1)) {
            A09.removeCallbacks(this.A07);
            this.A08.clear();
            A01(C3G5.A0B, this, A00(this, C1OU.A04(this.A02).A0U(false)));
        }
    }

    @Override // X.InterfaceC61312qt
    public final /* synthetic */ void DeG() {
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
    public final /* synthetic */ void onDestroy() {
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

    public static final void A01(C3G5 c3g5, C3AZ c3az, Collection collection) {
        int i;
        int i2;
        Double d;
        ArrayList arrayList = new ArrayList();
        if (c3g5 == C3G5.A0B) {
            UserSession userSession = c3az.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            i = (int) C18U.A01(c06090Tz, userSession, 36607268985181766L);
            i2 = (int) C18U.A01(c06090Tz, userSession, 36607268985509448L);
        } else {
            i = 0;
            i2 = c3az.A04;
        }
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                if (i <= 0 || arrayList.size() >= i) {
                    UserSession userSession2 = c3az.A02;
                    C06090Tz c06090Tz2 = C06090Tz.A05;
                    if (C18U.A06(c06090Tz2, userSession2, 36312204732924920L)) {
                        if (!reel.A1c) {
                            continue;
                        }
                    } else {
                        C38491qd c38491qd = reel.A0M;
                        if ((c38491qd == null || (d = c38491qd.A0T) == null || d.doubleValue() <= c3az.A01) && !C18U.A06(c06090Tz2, AbstractC25351Lp.A00(userSession2).A00, 36317212663288770L)) {
                        }
                    }
                }
                String id = reel.getId();
                C14360o3.A07(id);
                UserSession userSession3 = c3az.A02;
                arrayList.add(new C81943lE(c3g5, id, 1, reel.A03(userSession3), -1));
                C06090Tz c06090Tz3 = C06090Tz.A05;
                if (C18U.A06(c06090Tz3, userSession3, 36325794008675713L)) {
                    java.util.Set set = c3az.A08;
                    String id2 = reel.getId();
                    C14360o3.A07(id2);
                    set.add(id2);
                }
                if (arrayList.size() == i2 && !C18U.A06(c06090Tz3, userSession3, 36312204732924920L)) {
                    break;
                }
            }
        }
        C3G6.A00(c3az.A02).A0A(c3az.A05.getModuleName(), null, arrayList);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C69473Ah c69473Ah;
        C61252qn A00 = AbstractC61242qm.A00(this.A02);
        A00.A0H(this);
        A00.A08 = null;
        if ((!C18U.A06(C06090Tz.A05, r4, 36325794007692661L)) && (c69473Ah = this.A00) != null) {
            AbstractC69423Ac abstractC69423Ac = this.A06;
            C14360o3.A0B(abstractC69423Ac, 0);
            RecyclerView recyclerView = c69473Ah.A03;
            if (recyclerView != null) {
                recyclerView.A15(abstractC69423Ac);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C69473Ah c69473Ah;
        C61252qn A00 = AbstractC61242qm.A00(this.A02);
        A00.A0G(this);
        A00.A08 = this;
        if ((!C18U.A06(C06090Tz.A05, r4, 36325794007692661L)) && (c69473Ah = this.A00) != null) {
            AbstractC69423Ac abstractC69423Ac = this.A06;
            C14360o3.A0B(abstractC69423Ac, 0);
            RecyclerView recyclerView = c69473Ah.A03;
            if (recyclerView != null) {
                recyclerView.A14(abstractC69423Ac);
            }
        }
    }

    public C3AZ(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A05 = interfaceC11380iw;
        C61252qn A00 = AbstractC61242qm.A00(userSession);
        A00.A0G(this);
        A00.A08 = this;
    }
}
