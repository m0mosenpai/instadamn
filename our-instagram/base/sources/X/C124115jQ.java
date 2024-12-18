package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.5jQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124115jQ implements InterfaceC61312qt {
    public final UserSession A00;
    public final AbstractC69533An A01;
    public final C1121854m A02;
    public final WeakReference A03;
    public final WeakReference A04;

    public C124115jQ(Context context, UserSession userSession, AbstractC69533An abstractC69533An, InterfaceC63992vK interfaceC63992vK, C1121854m c1121854m) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1121854m, 3);
        C14360o3.A0B(interfaceC63992vK, 5);
        this.A00 = userSession;
        this.A02 = c1121854m;
        this.A01 = abstractC69533An;
        this.A03 = new WeakReference(context);
        this.A04 = new WeakReference(interfaceC63992vK);
    }

    @Override // X.InterfaceC61312qt
    public final void DKn(boolean z) {
    }

    @Override // X.InterfaceC61312qt
    public final void De4(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC61312qt
    public final void DeD(Integer num, int i, long j, boolean z) {
    }

    @Override // X.InterfaceC61312qt
    public final void DeE(C1OP c1op, String str, int i, long j, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC61312qt
    public final /* synthetic */ void DeG() {
    }

    @Override // X.InterfaceC61322qu
    public final void DXf(long j, int i) {
        InterfaceC63992vK interfaceC63992vK = (InterfaceC63992vK) this.A04.get();
        if (interfaceC63992vK != null) {
            interfaceC63992vK.EI4(j, i);
        }
        this.A01.notifyDataSetChanged();
        Context context = (Context) this.A03.get();
        if (context != null) {
            C9GR.A0F(context, "stories_tray_load_more_failure", 2131974546);
        }
    }

    @Override // X.InterfaceC61322qu
    public final void DXg(long j) {
        ArrayList A0Q;
        InterfaceC63992vK interfaceC63992vK = (InterfaceC63992vK) this.A04.get();
        if (interfaceC63992vK != null) {
            interfaceC63992vK.EI5(j);
        }
        UserSession userSession = this.A00;
        ReelStore A04 = C1OU.A04(userSession);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36324222050643965L);
        C1121854m c1121854m = this.A02;
        if (A06) {
            A0Q = A04.A0T(null);
        } else {
            A0Q = A04.A0Q(c1121854m.A00.getId());
        }
        c1121854m.A04 = A0Q;
        this.A01.EcN(new ArrayList(A0Q), false, userSession);
    }
}
