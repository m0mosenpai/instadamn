package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Azk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24885Azk implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ C198248pZ A04;
    public final /* synthetic */ String A05;

    public RunnableC24885Azk(Context context, View view, ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, C198248pZ c198248pZ, String str) {
        this.A05 = str;
        this.A00 = context;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A04 = c198248pZ;
        this.A03 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU c5su = new C5SU(this.A00, this.A02, new C149686oL(this.A05));
        c5su.A03(this.A01);
        c5su.A02();
        C198248pZ c198248pZ = this.A04;
        c5su.A04 = new C220479oX(6, this.A03, c198248pZ);
        c5su.A00().A07(c198248pZ.A07);
    }
}
