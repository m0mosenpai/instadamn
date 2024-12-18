package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7KZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7KZ implements InterfaceC60602pj, InterfaceC65982ya {
    public List A00;
    public final Context A01;
    public final Fragment A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C7KY A05;
    public final InterfaceC60442pS A06;
    public final Integer A07;
    public final FragmentActivity A08;
    public final PendingMediaStore A09;
    public final C64842wi A0A;
    public final java.util.Set A0B;

    public C7KZ(Context context, Fragment fragment, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7KY c7ky, InterfaceC60442pS interfaceC60442pS, C64842wi c64842wi, Integer num) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A04 = userSession;
        this.A07 = num;
        this.A08 = fragmentActivity;
        this.A02 = fragment;
        this.A06 = interfaceC60442pS;
        this.A03 = interfaceC11380iw;
        this.A0A = c64842wi;
        this.A05 = c7ky;
        this.A09 = C25A.A00(userSession);
        this.A0B = new HashSet();
        this.A00 = new ArrayList();
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        C38321qM c38321qM;
        C14360o3.A0B(c47z, 0);
        if (this.A05 != null && c47z.A1f == EnumC915447k.A02 && (c38321qM = c47z.A1C) != null) {
            java.util.Set set = this.A0B;
            String id = c38321qM.getId();
            if (id != null) {
                if (set.add(id)) {
                    C11T.A02(new GPS(this, c38321qM, c47z));
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
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

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C47Z) it.next()).A0X(this);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        this.A00 = this.A09.A08();
        if (!r0.isEmpty()) {
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = this.A04;
            if (c08730cb.A01(userSession).A0M() == C05F.A01) {
                this.A00.get(r1.size() - 1);
                C77453dV.A08(userSession, this.A06);
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    ((C47Z) it.next()).A0X(this);
                }
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        List A08 = this.A09.A08();
        this.A00 = A08;
        if (!A08.isEmpty()) {
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = this.A04;
            if (c08730cb.A01(userSession).A0M() == C05F.A01) {
                Context context = this.A01;
                AbstractC86593tX.A0N(context, this.A02, userSession, this.A06, (C47Z) this.A00.get(r1.size() - 1));
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    ((C47Z) it.next()).A0W(this);
                }
                C64842wi c64842wi = this.A0A;
                if (c64842wi != null && C18U.A06(C06090Tz.A05, userSession, 36314597027744489L)) {
                    EnumSet of = EnumSet.of(Trigger.A1m);
                    C14360o3.A07(of);
                    c64842wi.AVr(of);
                    return;
                }
                FragmentActivity fragmentActivity = this.A08;
                if (!c08730cb.A01(userSession).A2I() || !AbstractC63302u8.A00(userSession).A06(UserMonetizationProductType.A0E)) {
                    return;
                }
                BonusPromoDialogType bonusPromoDialogType = BonusPromoDialogType.A04;
                if (C1AT.A01(userSession).A03(C1AV.A0Y).getLong("bonuses_self_reel_promo_dialog_last_seen", 0L) >= System.currentTimeMillis() - TimeUnit.DAYS.toMillis(C18U.A01(C06090Tz.A06, userSession, 36594972492957690L)) || !C18U.A06(C06090Tz.A05, userSession, 36313497516443683L)) {
                    return;
                }
                AbstractC23641Du.A05(AnonymousClass191.A00, new B5a(context, fragmentActivity, bonusPromoDialogType, userSession, null, 6), AnonymousClass194.A02(C12L.A00.AOT(891600198, 3)));
            }
        }
    }
}
