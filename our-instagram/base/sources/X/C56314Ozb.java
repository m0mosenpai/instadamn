package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Ozb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56314Ozb implements InterfaceC37150GYl {
    public final /* synthetic */ C128175qm A00;
    public final /* synthetic */ DialogC50731MaZ A01;
    public final /* synthetic */ C47Z A02;
    public final /* synthetic */ AbstractC51174MjI A03;

    @Override // X.InterfaceC37150GYl
    public final void DY2() {
    }

    public C56314Ozb(C128175qm c128175qm, DialogC50731MaZ dialogC50731MaZ, C47Z c47z, AbstractC51174MjI abstractC51174MjI) {
        this.A03 = abstractC51174MjI;
        this.A02 = c47z;
        this.A00 = c128175qm;
        this.A01 = dialogC50731MaZ;
    }

    @Override // X.InterfaceC37150GYl
    public final void DY3() {
        Long l;
        AbstractC51174MjI abstractC51174MjI = this.A03;
        UserSession userSession = abstractC51174MjI.A07;
        Activity activity = abstractC51174MjI.A03;
        C47Z c47z = this.A02;
        C128175qm c128175qm = this.A00;
        boolean z = c128175qm.A17;
        String str = c47z.A2Z;
        C110204xp c110204xp = c128175qm.A08;
        if (c110204xp != null) {
            l = Long.valueOf(c110204xp.A00);
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        C29901DGp c29901DGp = new C29901DGp(42, c128175qm, this.A01, abstractC51174MjI, c47z);
        C14360o3.A0B(userSession, 0);
        c47z.A2Z = str;
        c47z.A0c(ShareType.A08);
        c47z.A5P = z;
        c47z.A3n = valueOf;
        C47Z A01 = AbstractC189168Zk.A01(userSession, c47z);
        C40121td A012 = C40121td.A0G.A01(activity, userSession);
        if (A01.A1G == EnumC40111tc.A0A) {
            A012.A0B(A01);
        } else {
            A012.A0D(A01);
        }
        A012.A09(A01);
        c29901DGp.invoke();
        abstractC51174MjI.A00++;
        AbstractC86593tX.A0N(activity, abstractC51174MjI.A05, userSession, null, c47z);
    }
}
