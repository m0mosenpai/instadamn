package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.N9v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52232N9v extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogInterface.OnDismissListener A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ InterfaceC145226gh A04;
    public final /* synthetic */ InterfaceC145276gm A05;
    public final /* synthetic */ InterfaceC58312Pt4 A06;
    public final /* synthetic */ InterfaceC57978PnO A07;
    public final /* synthetic */ InterfaceC57979PnP A08;
    public final /* synthetic */ InterfaceC57980PnQ A09;
    public final /* synthetic */ C55909Os0 A0A;
    public final /* synthetic */ InterfaceC1119153d A0B;
    public final /* synthetic */ User A0C;
    public final /* synthetic */ C145326gr A0D;
    public final /* synthetic */ C145296go A0E;
    public final /* synthetic */ C145246gj A0F;
    public final /* synthetic */ C145316gq A0G;
    public final /* synthetic */ C145306gp A0H;

    public C52232N9v(Context context, DialogInterface.OnDismissListener onDismissListener, View view, InterfaceC11380iw interfaceC11380iw, InterfaceC145226gh interfaceC145226gh, InterfaceC145276gm interfaceC145276gm, InterfaceC58312Pt4 interfaceC58312Pt4, InterfaceC57978PnO interfaceC57978PnO, InterfaceC57979PnP interfaceC57979PnP, InterfaceC57980PnQ interfaceC57980PnQ, C55909Os0 c55909Os0, InterfaceC1119153d interfaceC1119153d, User user, C145326gr c145326gr, C145296go c145296go, C145246gj c145246gj, C145316gq c145316gq, C145306gp c145306gp) {
        this.A0A = c55909Os0;
        this.A0C = user;
        this.A00 = context;
        this.A02 = view;
        this.A04 = interfaceC145226gh;
        this.A06 = interfaceC58312Pt4;
        this.A01 = onDismissListener;
        this.A05 = interfaceC145276gm;
        this.A0D = c145326gr;
        this.A0F = c145246gj;
        this.A0E = c145296go;
        this.A0H = c145306gp;
        this.A0G = c145316gq;
        this.A03 = interfaceC11380iw;
        this.A0B = interfaceC1119153d;
        this.A09 = interfaceC57980PnQ;
        this.A08 = interfaceC57979PnP;
        this.A07 = interfaceC57978PnO;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(1547056824);
        C3DB c3db = (C3DB) obj;
        int A032 = C0f9.A03(219190256);
        C14360o3.A0B(c3db, 0);
        User A00 = C72W.A00(c3db);
        if (A00 == null) {
            onFail(new C115115Ig(c3db));
            i = 346114507;
        } else {
            C55909Os0 c55909Os0 = this.A0A;
            AnonymousClass189.A00(c55909Os0.A0B).A01(A00, true, false);
            this.A0C.A0n(A00.A0M());
            Context context = this.A00;
            View view = this.A02;
            InterfaceC145226gh interfaceC145226gh = this.A04;
            InterfaceC58312Pt4 interfaceC58312Pt4 = this.A06;
            DialogInterface.OnDismissListener onDismissListener = this.A01;
            InterfaceC145276gm interfaceC145276gm = this.A05;
            C145326gr c145326gr = this.A0D;
            C145246gj c145246gj = this.A0F;
            C145296go c145296go = this.A0E;
            C145306gp c145306gp = this.A0H;
            C145316gq c145316gq = this.A0G;
            InterfaceC11380iw interfaceC11380iw = this.A03;
            InterfaceC1119153d interfaceC1119153d = this.A0B;
            c55909Os0.A0X(context, onDismissListener, view, interfaceC11380iw, interfaceC145226gh, interfaceC145276gm, interfaceC58312Pt4, this.A07, this.A08, interfaceC1119153d, c145326gr, c145296go, c145246gj, c145316gq, c145306gp);
            i = 1404457662;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(1330358415, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-668175322);
        super.onFinish();
        AbstractC63248Sg4.A01(this.A0A.A07);
        C0f9.A0A(-1149609718, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-48906741);
        super.onStart();
        AbstractC63248Sg4.A02(this.A0A.A07);
        C0f9.A0A(936863454, A03);
    }
}
