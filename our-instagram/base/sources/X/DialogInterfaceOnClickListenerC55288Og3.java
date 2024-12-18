package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Og3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55288Og3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC145276gm A02;
    public final /* synthetic */ C55909Os0 A03;

    public DialogInterfaceOnClickListenerC55288Og3(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC145276gm interfaceC145276gm, C55909Os0 c55909Os0) {
        this.A03 = c55909Os0;
        this.A01 = userSession;
        this.A02 = interfaceC145276gm;
        this.A00 = interfaceC11380iw;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != 0) {
            if (i == 1) {
                C55909Os0 c55909Os0 = this.A03;
                C41181vS c41181vS = c55909Os0.A0F;
                Activity activity = c55909Os0.A04;
                UserSession userSession = c55909Os0.A0B;
                C55165OdT.A01(activity, c55909Os0.A01, c55909Os0.A07, c55909Os0.A08, userSession, c41181vS);
            }
        } else {
            C55165OdT c55165OdT = C55909Os0.A0Y;
            C55909Os0 c55909Os02 = this.A03;
            Reel reel = c55909Os02.A0G.A0H;
            C41181vS c41181vS2 = c55909Os02.A0F;
            Activity activity2 = c55909Os02.A04;
            Fragment fragment = c55909Os02.A06;
            AbstractC10360h2 abstractC10360h2 = c55909Os02.A07;
            InterfaceC11380iw interfaceC11380iw = c55909Os02.A09;
            c55165OdT.A04(activity2, c55909Os02.A01, fragment, abstractC10360h2, interfaceC11380iw, this.A00, this.A01, reel, c41181vS2, this.A02);
        }
        this.A03.A01 = null;
    }
}
