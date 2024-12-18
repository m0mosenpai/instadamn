package X;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.Ok8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55454Ok8 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final Object A0D;
    public final Object A0E;

    public ViewOnClickListenerC55454Ok8(DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, InterfaceC145276gm interfaceC145276gm, InterfaceC58312Pt4 interfaceC58312Pt4, InterfaceC57978PnO interfaceC57978PnO, InterfaceC57979PnP interfaceC57979PnP, C55909Os0 c55909Os0, InterfaceC1119153d interfaceC1119153d, C145326gr c145326gr, C145296go c145296go, C145246gj c145246gj, C145316gq c145316gq, C145306gp c145306gp, CharSequence charSequence, int i) {
        this.A00 = i;
        this.A06 = c55909Os0;
        this.A0A = charSequence;
        this.A07 = interfaceC58312Pt4;
        this.A0E = onDismissListener;
        this.A02 = interfaceC145276gm;
        this.A01 = interfaceC11380iw;
        this.A0B = c145326gr;
        this.A03 = c145246gj;
        this.A0C = c145296go;
        this.A09 = c145306gp;
        this.A08 = c145316gq;
        this.A0D = interfaceC1119153d;
        this.A05 = interfaceC57979PnP;
        this.A04 = interfaceC57978PnO;
    }

    public static void A00(ViewOnClickListenerC55454Ok8 viewOnClickListenerC55454Ok8) {
        C55909Os0 c55909Os0 = (C55909Os0) viewOnClickListenerC55454Ok8.A06;
        CharSequence charSequence = (CharSequence) viewOnClickListenerC55454Ok8.A0A;
        InterfaceC58312Pt4 interfaceC58312Pt4 = (InterfaceC58312Pt4) viewOnClickListenerC55454Ok8.A07;
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) viewOnClickListenerC55454Ok8.A0E;
        InterfaceC145276gm interfaceC145276gm = (InterfaceC145276gm) viewOnClickListenerC55454Ok8.A02;
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) viewOnClickListenerC55454Ok8.A01;
        C145326gr c145326gr = (C145326gr) viewOnClickListenerC55454Ok8.A0B;
        C145246gj c145246gj = (C145246gj) viewOnClickListenerC55454Ok8.A03;
        C145296go c145296go = (C145296go) viewOnClickListenerC55454Ok8.A0C;
        C145306gp c145306gp = (C145306gp) viewOnClickListenerC55454Ok8.A09;
        C145316gq c145316gq = (C145316gq) viewOnClickListenerC55454Ok8.A08;
        InterfaceC1119153d interfaceC1119153d = (InterfaceC1119153d) viewOnClickListenerC55454Ok8.A0D;
        C55909Os0.A02(onDismissListener, interfaceC11380iw, interfaceC145276gm, interfaceC58312Pt4, (InterfaceC57978PnO) viewOnClickListenerC55454Ok8.A04, (InterfaceC57979PnP) viewOnClickListenerC55454Ok8.A05, c55909Os0, interfaceC1119153d, c145326gr, c145296go, c145246gj, c145316gq, c145306gp, charSequence);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A00 != 0) {
            A05 = C0f9.A05(952741111);
            A00(this);
            i = 260057667;
        } else {
            A05 = C0f9.A05(-285865731);
            A00(this);
            i = 1051763672;
        }
        C0f9.A0C(i, A05);
    }
}
