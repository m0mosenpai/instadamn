package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class M7G implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ C41551w4 A04;
    public final /* synthetic */ InterfaceC143576dw A05;
    public final /* synthetic */ InterfaceC148826mr A06;
    public final /* synthetic */ C148796mo A07;

    public M7G(Context context, View view, ViewGroup viewGroup, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, InterfaceC148826mr interfaceC148826mr, C148796mo c148796mo) {
        this.A07 = c148796mo;
        this.A00 = context;
        this.A02 = viewGroup;
        this.A06 = interfaceC148826mr;
        this.A03 = c41181vS;
        this.A04 = c41551w4;
        this.A01 = view;
        this.A05 = interfaceC143576dw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C148796mo c148796mo = this.A07;
        InterfaceC145156ga interfaceC145156ga = c148796mo.A01;
        if (interfaceC145156ga != null) {
            interfaceC145156ga.Dm4();
        }
        Context context = this.A00;
        ViewGroup viewGroup = this.A02;
        InterfaceC148826mr interfaceC148826mr = this.A06;
        UserSession userSession = c148796mo.A04;
        C41181vS c41181vS = this.A03;
        C5SU c5su = new C5SU(context, viewGroup, interfaceC148826mr.C9O(context, userSession, c41181vS, this.A04));
        c5su.A06(interfaceC148826mr.C9M());
        c5su.A0F = false;
        c5su.A04 = new KYR(this, 15);
        InterfaceC143576dw interfaceC143576dw = this.A05;
        View C9K = interfaceC148826mr.C9K(c41181vS, interfaceC143576dw);
        C207559Gj C9L = interfaceC148826mr.C9L(userSession, c41181vS, interfaceC143576dw);
        if (C9K != null) {
            c5su.A03(C9K);
        } else if (C9L == null) {
            return;
        } else {
            c5su.A03 = C9L;
        }
        C5SW A00 = c5su.A00();
        c148796mo.A00 = A00;
        A00.A06();
    }
}
