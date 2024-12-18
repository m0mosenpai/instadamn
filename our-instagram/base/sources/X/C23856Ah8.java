package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Ah8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23856Ah8 implements InterfaceC25185BCi {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1GL A02;
    public final /* synthetic */ AbstractC24481Hr A03;
    public final /* synthetic */ C22925A8v A04;
    public final /* synthetic */ FilterGroupModel A05;
    public final /* synthetic */ C47Z A06;
    public final /* synthetic */ C183978Ee A07;
    public final /* synthetic */ Runnable A08;
    public final /* synthetic */ boolean A09;

    public C23856Ah8(Context context, UserSession userSession, C1GL c1gl, AbstractC24481Hr abstractC24481Hr, C22925A8v c22925A8v, FilterGroupModel filterGroupModel, C47Z c47z, C183978Ee c183978Ee, Runnable runnable, boolean z) {
        this.A01 = userSession;
        this.A06 = c47z;
        this.A09 = z;
        this.A00 = context;
        this.A07 = c183978Ee;
        this.A05 = filterGroupModel;
        this.A04 = c22925A8v;
        this.A02 = c1gl;
        this.A08 = runnable;
        this.A03 = abstractC24481Hr;
    }

    @Override // X.InterfaceC25185BCi
    public final void DXL() {
        C9O1.A07(this.A00, this.A01, this.A06, "template_overlay_failed_to_save");
    }

    @Override // X.InterfaceC25185BCi
    public final void DXM(String str) {
        ShareType shareType = ShareType.A0Y;
        UserSession userSession = this.A01;
        C47Z A03 = C9O1.A03(userSession, shareType);
        A03.A33 = str;
        C47Z c47z = this.A06;
        c47z.A0V(A03);
        if (this.A09) {
            Context context = this.A00;
            C183978Ee c183978Ee = this.A07;
            FilterGroupModel filterGroupModel = this.A05;
            C22925A8v c22925A8v = this.A04;
            C9O1.A05(context, userSession, this.A02, this.A03, c22925A8v, filterGroupModel, c47z, c183978Ee, this.A08, false);
            return;
        }
        this.A08.run();
    }
}
