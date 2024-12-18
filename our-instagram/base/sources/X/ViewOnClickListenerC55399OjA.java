package X;

import android.view.View;
import com.instagram.model.reels.Reel;

/* renamed from: X.OjA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55399OjA implements View.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ InterfaceC145276gm A01;
    public final /* synthetic */ C55909Os0 A02;

    public ViewOnClickListenerC55399OjA(InterfaceC11380iw interfaceC11380iw, InterfaceC145276gm interfaceC145276gm, C55909Os0 c55909Os0) {
        this.A02 = c55909Os0;
        this.A01 = interfaceC145276gm;
        this.A00 = interfaceC11380iw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(711714709);
        C55909Os0 c55909Os0 = this.A02;
        InterfaceC145276gm interfaceC145276gm = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C55165OdT c55165OdT = C55909Os0.A0Y;
        Reel reel = c55909Os0.A0G.A0H;
        C41181vS c41181vS = c55909Os0.A0F;
        c55165OdT.A04(c55909Os0.A04, c55909Os0.A01, c55909Os0.A06, c55909Os0.A07, c55909Os0.A09, interfaceC11380iw, c55909Os0.A0B, reel, c41181vS, interfaceC145276gm);
        C0f9.A0C(2088231866, A05);
    }
}
