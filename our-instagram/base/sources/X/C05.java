package X;

import android.app.Activity;
import android.view.View;
import com.instagram.api.schemas.ReelsMediaInteractivityType;

/* loaded from: classes5.dex */
public final class C05 extends C33H {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ ReelsMediaInteractivityType A04;
    public final /* synthetic */ C37603Ggy A05;
    public final /* synthetic */ C120985dq A06;
    public final /* synthetic */ C75113Zb A07;
    public final /* synthetic */ C40971v4 A08;
    public final /* synthetic */ SPM A09;
    public final /* synthetic */ CR4 A0A;
    public final /* synthetic */ C37616GhB A0B;
    public final /* synthetic */ InterfaceC16820sZ A0C;
    public final /* synthetic */ boolean A0D;

    @Override // X.C33H, X.C33I
    public final boolean Dtk(C5SW c5sw) {
        C3DO c3do;
        Activity activity;
        C3DN A00;
        C14360o3.A0B(c5sw, 0);
        CR4 cr4 = this.A0A;
        if (cr4.A00 != -1 && cr4.A01.now() - cr4.A00 <= 500) {
            return false;
        }
        cr4.A00 = -1L;
        if (this.A07.A2z && (A00 = (c3do = C3DN.A00).A00((activity = this.A02))) != null && ((C3DP) A00).A0h) {
            C3DN A002 = c3do.A00(activity);
            if (A002 != null) {
                A002.A0U(C05F.A04);
            }
            SPM spm = this.A09;
            if (spm != null) {
                spm.A02("full", "expand", "tooltip_tap");
            }
        } else {
            this.A0B.A05(this.A03, EnumC71343Hv.A0i, null, this.A08, null);
            InterfaceC16820sZ interfaceC16820sZ = this.A0C;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
            }
        }
        return true;
    }

    @Override // X.C33H, X.C33I
    public final void Dto(C5SW c5sw) {
        C14360o3.A0B(c5sw, 0);
        C11T.A04(new RunnableC29598D1z(this.A07, this.A0D), 100L);
        this.A0A.A00 = -1L;
    }

    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        String A00;
        C14360o3.A0B(c5sw, 0);
        C37603Ggy c37603Ggy = this.A05;
        if (c37603Ggy != null) {
            C120985dq c120985dq = this.A06;
            int i = this.A00;
            int i2 = this.A01;
            ReelsMediaInteractivityType reelsMediaInteractivityType = this.A04;
            MUW muw = new MUW(Float.valueOf(i), Float.valueOf(i2), "tooltip_presented", (String) null);
            if (reelsMediaInteractivityType == ReelsMediaInteractivityType.A06) {
                A00 = "single_tap";
            } else {
                A00 = AbstractC111324zv.A00(1085);
            }
            if (c120985dq.A02 != null) {
                C37603Ggy.A01(muw, c37603Ggy, c120985dq, "primary", new DHR("tooltip_presented", A00, 0));
            }
        }
    }

    public C05(Activity activity, View view, ReelsMediaInteractivityType reelsMediaInteractivityType, C37603Ggy c37603Ggy, C120985dq c120985dq, C75113Zb c75113Zb, C40971v4 c40971v4, SPM spm, CR4 cr4, C37616GhB c37616GhB, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        this.A0A = cr4;
        this.A07 = c75113Zb;
        this.A02 = activity;
        this.A09 = spm;
        this.A0B = c37616GhB;
        this.A03 = view;
        this.A08 = c40971v4;
        this.A0C = interfaceC16820sZ;
        this.A05 = c37603Ggy;
        this.A06 = c120985dq;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = reelsMediaInteractivityType;
        this.A0D = z;
    }
}
