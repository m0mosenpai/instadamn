package X;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Ep, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47232Ep implements InterfaceC13000lm {
    public final C006802i A00;
    public final C2Et A01;
    public final C2Et A02;
    public final C2Et A03;
    public final C13920nI A04;
    public final C47252Er A05;
    public final C47262Es A06;
    public final C221315o A07;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2Et, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2Et, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2Et, java.lang.Object] */
    public C47232Ep(C006802i c006802i, C13920nI c13920nI, C47252Er c47252Er, C221315o c221315o) {
        C14360o3.A0B(c13920nI, 1);
        C14360o3.A0B(c47252Er, 4);
        this.A04 = c13920nI;
        this.A07 = c221315o;
        this.A00 = c006802i;
        this.A05 = c47252Er;
        C47262Es c47262Es = new C47262Es(this);
        this.A06 = c47262Es;
        int i = c221315o.A00.A00;
        ?? obj = new Object();
        obj.A09 = false;
        obj.A08 = false;
        obj.A00 = i;
        obj.A06 = -1L;
        obj.A04 = -1L;
        obj.A01 = 0;
        obj.A07 = false;
        obj.A05 = -1L;
        obj.A03 = -1L;
        obj.A02 = -1L;
        this.A01 = obj;
        ?? obj2 = new Object();
        obj2.A00(obj);
        this.A03 = obj2;
        ?? obj3 = new Object();
        obj3.A00(obj);
        this.A02 = obj3;
        List list = c221315o.A04;
        if (!list.contains(c47262Es)) {
            list.add(c47262Es);
            C221315o.A00(c47262Es, c221315o);
        }
    }

    private final void A01(String str, short s) {
        if (s == 2) {
            this.A05.A00("Iris");
        }
        C006802i c006802i = this.A00;
        c006802i.markerAnnotate(20119557, "end_reason", str);
        c006802i.markerEnd(20119557, s, SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    public static final void A00(C47232Ep c47232Ep) {
        int i;
        while (true) {
            C2Et c2Et = c47232Ep.A01;
            C2Et c2Et2 = c47232Ep.A02;
            if (!C14360o3.A0K(c2Et, c2Et2)) {
                C2Et c2Et3 = c47232Ep.A03;
                c2Et3.A00(c2Et);
                c2Et.A00(c2Et2);
                if (!c2Et.A08) {
                    int i2 = c2Et.A00;
                    if (i2 == 0) {
                        continue;
                    } else {
                        if (i2 != 1 && i2 != 2) {
                            throw new IllegalStateException(AnonymousClass001.A0O("Not supported startup type: ", i2));
                        }
                        if (c2Et3.A00 == 0 || (!c2Et3.A09 && c2Et.A09)) {
                            c2Et2.A08 = true;
                            c2Et2.A02 = c2Et.A04;
                        }
                    }
                } else if (!c2Et.A09) {
                    if (c2Et3.A09) {
                        c47232Ep.A01("user_session_ended", (short) 3);
                        c2Et2.A08 = false;
                    }
                } else {
                    int i3 = c2Et.A00;
                    if (i3 != 0) {
                        if (i3 != 1 && i3 != 2) {
                            throw new IllegalStateException(AnonymousClass001.A0O("Not supported startup type: ", i3));
                        }
                        long j = c2Et.A04;
                        if (j == -1) {
                            continue;
                        } else {
                            i = c2Et.A01;
                            if (i == 0) {
                                break;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 4) {
                                            throw new IllegalStateException(AnonymousClass001.A0O("Illegal Iris sequence id source: ", i));
                                        }
                                    }
                                } else {
                                    long j2 = c2Et.A02;
                                    if (j2 == -1 || j2 < j) {
                                        c47232Ep.A01("snapshot", (short) 2);
                                        c2Et2.A08 = false;
                                    }
                                }
                            }
                            if (c2Et.A07) {
                                long j3 = c2Et.A04;
                                if (j3 >= c2Et.A05) {
                                    if (j3 <= ((long) Math.max(c2Et.A02, c2Et.A03))) {
                                        c47232Ep.A01("nothing_new", (short) 2);
                                    } else {
                                        c47232Ep.A01("delta_received", (short) 2);
                                    }
                                    c2Et2.A08 = false;
                                }
                            }
                        }
                    } else {
                        c2Et2.A08 = true;
                    }
                }
            } else {
                return;
            }
        }
        throw new IllegalStateException(AnonymousClass001.A0O("Illegal Iris sequence id source: ", i));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A09 = false;
        A00(this);
        C221315o c221315o = this.A07;
        c221315o.A04.remove(this.A06);
    }

    public final void A02() {
        SystemClock.uptimeMillis();
        C006802i c006802i = this.A00;
        c006802i.markerStart(20119557, 0, false);
        c006802i.markerAnnotate(20119557, "startup_type", "user_session_started");
        c006802i.markerAnnotate(20119557, "is_badge_only", false);
        this.A02.A09 = true;
        A00(this);
    }
}
