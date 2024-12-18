package X;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import com.instagram.api.schemas.ReelsMediaInteractivityType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Crx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29070Crx implements InterfaceC31031DkU {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC31130DmD A01;
    public final /* synthetic */ C120985dq A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C75113Zb A05;
    public final /* synthetic */ C40971v4 A06;
    public final /* synthetic */ SPM A07;
    public final /* synthetic */ C27845CPi A08;
    public final /* synthetic */ C37616GhB A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ InterfaceC16820sZ A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    public C29070Crx(Activity activity, InterfaceC31130DmD interfaceC31130DmD, C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C75113Zb c75113Zb, C40971v4 c40971v4, SPM spm, C27845CPi c27845CPi, C37616GhB c37616GhB, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3) {
        this.A02 = c120985dq;
        this.A01 = interfaceC31130DmD;
        this.A0A = str;
        this.A0E = z;
        this.A0B = interfaceC16820sZ;
        this.A09 = c37616GhB;
        this.A06 = c40971v4;
        this.A05 = c75113Zb;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A08 = c27845CPi;
        this.A00 = activity;
        this.A07 = spm;
        this.A0D = z2;
        this.A0C = z3;
    }

    @Override // X.InterfaceC31031DkU
    public final void D3j(CUB cub) {
        C25419BMk c25419BMk = C25419BMk.A00;
        C120985dq c120985dq = this.A02;
        InterfaceC31130DmD interfaceC31130DmD = this.A01;
        String str = this.A0A;
        View view = cub.A02;
        PointF pointF = cub.A00;
        ReelsMediaInteractivityType reelsMediaInteractivityType = ReelsMediaInteractivityType.A06;
        InterfaceC16820sZ interfaceC16820sZ = this.A0B;
        C37616GhB c37616GhB = this.A09;
        C40971v4 c40971v4 = this.A06;
        C75113Zb c75113Zb = this.A05;
        UserSession userSession = this.A04;
        c25419BMk.A02(this.A00, pointF, view, reelsMediaInteractivityType, interfaceC31130DmD, c120985dq, this.A03, userSession, c75113Zb, c40971v4, this.A07, this.A08, c37616GhB, str, interfaceC16820sZ, this.A0D, false);
    }

    @Override // X.InterfaceC31031DkU
    public final void DQU(CUB cub) {
        C25419BMk c25419BMk = C25419BMk.A00;
        C120985dq c120985dq = this.A02;
        InterfaceC31130DmD interfaceC31130DmD = this.A01;
        String str = this.A0A;
        View view = cub.A02;
        PointF pointF = cub.A00;
        ReelsMediaInteractivityType reelsMediaInteractivityType = ReelsMediaInteractivityType.A05;
        InterfaceC16820sZ interfaceC16820sZ = this.A0B;
        C37616GhB c37616GhB = this.A09;
        C40971v4 c40971v4 = this.A06;
        C75113Zb c75113Zb = this.A05;
        UserSession userSession = this.A04;
        c25419BMk.A02(this.A00, pointF, view, reelsMediaInteractivityType, interfaceC31130DmD, c120985dq, this.A03, userSession, c75113Zb, c40971v4, this.A07, this.A08, c37616GhB, str, interfaceC16820sZ, this.A0D, this.A0C);
    }

    @Override // X.InterfaceC31031DkU
    public final void D3M(CUB cub) {
        D3j(cub);
    }
}
