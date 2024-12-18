package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.7Wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164307Wt {
    public C70299WQe A00;
    public final Fragment A01;
    public final C14280ns A02;
    public final C164317Wu A03;
    public final AnonymousClass988 A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16820sZ A09;

    public C164307Wt(Fragment fragment, AnonymousClass988 anonymousClass988, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5) {
        C14360o3.A0B(fragment, 1);
        C14360o3.A0B(anonymousClass988, 2);
        this.A01 = fragment;
        this.A04 = anonymousClass988;
        this.A08 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A06 = interfaceC16820sZ3;
        this.A07 = interfaceC16820sZ4;
        this.A09 = interfaceC16820sZ5;
        this.A02 = new C14280ns(702457576, false);
        this.A03 = new C164317Wu(this);
    }

    public final void A00() {
        if (((Boolean) this.A09.invoke()).booleanValue()) {
            this.A02.execute(new RunnableC65766Tth(this.A00, this));
        }
    }
}
