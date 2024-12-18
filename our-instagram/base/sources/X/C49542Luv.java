package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1;
import java.util.List;

/* renamed from: X.Luv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49542Luv implements InterfaceC65982ya {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C128175qm A03;
    public final /* synthetic */ C47Z A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ C19L A07;
    public final /* synthetic */ boolean A08;

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        String str = c47z.A3V;
        if (str != null) {
            C19L c19l = this.A07;
            C47Z c47z2 = this.A04;
            UserSession userSession = this.A02;
            List list = this.A06;
            AbstractC166987dD.A1Z(new ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1(this.A00, this.A01, userSession, this.A03, c47z2, str, null, this.A05, list, null, false, this.A08), c19l);
            c47z2.A0X(this);
        }
    }

    public C49542Luv(Context context, FragmentActivity fragmentActivity, UserSession userSession, C128175qm c128175qm, C47Z c47z, String str, List list, C19L c19l, boolean z) {
        this.A07 = c19l;
        this.A04 = c47z;
        this.A02 = userSession;
        this.A06 = list;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = c128175qm;
        this.A05 = str;
        this.A08 = z;
    }
}
