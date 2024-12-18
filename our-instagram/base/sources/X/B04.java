package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes4.dex */
public final class B04 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1GL A02;
    public final /* synthetic */ AbstractC24481Hr A03;
    public final /* synthetic */ C22925A8v A04;
    public final /* synthetic */ FilterGroupModel A05;
    public final /* synthetic */ C47Z A06;
    public final /* synthetic */ C183978Ee A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ boolean A0A;

    public B04(Context context, UserSession userSession, C1GL c1gl, AbstractC24481Hr abstractC24481Hr, C22925A8v c22925A8v, FilterGroupModel filterGroupModel, C47Z c47z, C183978Ee c183978Ee, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        this.A06 = c47z;
        this.A07 = c183978Ee;
        this.A09 = interfaceC16660sJ;
        this.A08 = interfaceC16660sJ2;
        this.A00 = context;
        this.A05 = filterGroupModel;
        this.A0A = z;
        this.A04 = c22925A8v;
        this.A01 = userSession;
        this.A03 = abstractC24481Hr;
        this.A02 = c1gl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47Z c47z = this.A06;
        C183978Ee c183978Ee = this.A07;
        InterfaceC16660sJ interfaceC16660sJ = this.A09;
        InterfaceC16660sJ interfaceC16660sJ2 = this.A08;
        Context context = this.A00;
        FilterGroupModel filterGroupModel = this.A05;
        boolean z = this.A0A;
        C22925A8v c22925A8v = this.A04;
        A04.A00(context, this.A01, this.A02, this.A03, c22925A8v, filterGroupModel, c47z, c183978Ee, interfaceC16660sJ, interfaceC16660sJ2, z);
    }
}
