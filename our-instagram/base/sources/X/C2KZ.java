package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2KZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2KZ implements InterfaceC12870lZ {
    public boolean A00;
    public boolean A01;
    public final C006802i A02;
    public final C19740y2 A03;

    public C2KZ(C006802i c006802i, C19740y2 c19740y2) {
        C14360o3.A0B(c19740y2, 2);
        this.A02 = c006802i;
        this.A03 = c19740y2;
    }

    public static final void A00(C71933Kq c71933Kq, C2KZ c2kz) {
        C006802i c006802i = c2kz.A02;
        c006802i.markerAnnotate(20133815, "direct_inbox_icon_badge_count", c71933Kq.A02);
        int i = c71933Kq.A00;
        if (i != -1) {
            c006802i.markerAnnotate(20133815, "open_direct_inbox_icon_badge_count", i);
        }
        int i2 = c71933Kq.A01;
        if (i2 != -1) {
            c006802i.markerAnnotate(20133815, "e2ee_direct_inbox_icon_badge_count", i2);
        }
    }

    public static final void A01(C2KZ c2kz) {
        C006802i c006802i = c2kz.A02;
        c006802i.markerAnnotate(20133815, "cancel_reason", AnonymousClass001.A0R("app startup trigger changed: ", C1CC.A02));
        c006802i.markerEnd(20133815, (short) 4);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1837103014);
        this.A01 = false;
        this.A00 = false;
        C0f9.A0A(565032560, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int i;
        int A03 = C0f9.A03(-1465458303);
        if (this.A01 && C14360o3.A0K(C1CC.A02, "normal")) {
            C006802i c006802i = this.A02;
            c006802i.markerStart(20133815, 0, C1CC.A08, TimeUnit.MILLISECONDS);
            c006802i.markerPoint(20133815, "app_foregrounded");
            InterfaceC19630xq interfaceC19630xq = this.A03.A00;
            c006802i.markerAnnotate(20133815, "app_icon_badge_count", interfaceC19630xq.getInt("launcher_badge_count", 0));
            int i2 = interfaceC19630xq.getInt("launcher_badge_count_direct", 0);
            int i3 = interfaceC19630xq.getInt("open_thread_count_for_launcher_badge", -1);
            int i4 = interfaceC19630xq.getInt("armadillo_thread_count_for_launcher_badge", -1);
            c006802i.markerAnnotate(20133815, "app_icon_badge_count_direct", i2);
            if (i3 != -1) {
                c006802i.markerAnnotate(20133815, "open_app_icon_badge_count_direct", i3);
            }
            if (i4 != -1) {
                c006802i.markerAnnotate(20133815, "e2ee_app_icon_badge_count_direct", i4);
            }
            c006802i.markerAnnotate(20133815, "app_startup_type", C1CC.A09.toString());
            i = -886715019;
        } else {
            i = 273021290;
        }
        C0f9.A0A(i, A03);
    }
}
