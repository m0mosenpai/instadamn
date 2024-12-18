package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.realtime.requeststream.streamref.NativeStream;

/* renamed from: X.1s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39231s0 implements InterfaceC39221rz {
    public C39841t8 A00;
    public final Context A01;
    public final InterfaceC39211ry A02;
    public final InterfaceC37451oi A03;
    public final C38961rV A04;
    public final C39161rr A05;
    public final Class A06;
    public final HandlerC39691ss A07;
    public final C38951rU A08;

    @Override // X.InterfaceC39221rz
    public final synchronized void CtZ(C39831t7 c39831t7) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC39221rz
    public final synchronized void E6E(C39851t9 c39851t9) {
        HandlerC39691ss handlerC39691ss = this.A07;
        handlerC39691ss.sendMessage(handlerC39691ss.obtainMessage(2, c39851t9));
    }

    @Override // X.InterfaceC39221rz
    public final synchronized void E6F(C39851t9 c39851t9) {
        HandlerC39691ss handlerC39691ss = this.A07;
        handlerC39691ss.sendMessage(handlerC39691ss.obtainMessage(1, c39851t9));
    }

    @Override // X.InterfaceC39221rz
    public final synchronized void Enc(C39841t8 c39841t8) {
        boolean A0a;
        C38961rV c38961rV;
        C4Cx c4Cx;
        C1UK c1uk;
        this.A00 = c39841t8;
        Boolean bool = c39841t8.A00;
        if (bool != null) {
            A0a = bool.booleanValue();
        } else {
            A0a = AbstractC001900j.A0a(c39841t8.A02, "bg", false);
        }
        if (A0a && (c38961rV = this.A04) != null && c38961rV.A0F && (c1uk = (c4Cx = (C4Cx) c38961rV.A0B.getValue()).A00) != null && c4Cx.A0D) {
            ((NativeStream) c1uk).nativeCancel();
        }
        HandlerC39691ss handlerC39691ss = this.A07;
        handlerC39691ss.sendMessage(handlerC39691ss.obtainMessage(3, c39841t8));
    }

    @Override // X.InterfaceC39221rz
    public final synchronized void F8b() {
        HandlerC39691ss handlerC39691ss = this.A07;
        handlerC39691ss.sendMessage(handlerC39691ss.obtainMessage(5));
    }

    public static void A00(C39231s0 c39231s0, final C0CA c0ca, String str, String str2, String str3) {
        C38951rU c38951rU = c39231s0.A08;
        if (c38951rU.A02) {
            c38951rU.A00().Chy(str, str2, str3, new InterfaceC16820sZ() { // from class: X.YJJ
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C5KW.A00(C0CA.this).get("extra");
                }
            }, 1L, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1ss] */
    public C39231s0(Context context, InterfaceC39211ry interfaceC39211ry, InterfaceC37451oi interfaceC37451oi, C38951rU c38951rU, C38961rV c38961rV, C39161rr c39161rr, Class cls) {
        this.A01 = context;
        this.A02 = interfaceC39211ry;
        this.A06 = cls;
        this.A04 = c38961rV;
        this.A05 = c39161rr;
        this.A03 = interfaceC37451oi;
        this.A08 = c38951rU;
        final Looper looper = C39251s2.A00(context).A04(this.A06.getName()).ALb("Analytics2-EventProcessorProxy", 0).getLooper();
        AbstractC05810Sj.A01(looper, "Event Proxy HandlerThread is not started.");
        this.A07 = new Handler(looper) { // from class: X.1ss
            public boolean A00 = false;

            /* JADX WARN: Removed duplicated region for block: B:158:0x023c  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x0259  */
            /* JADX WARN: Removed duplicated region for block: B:190:0x00b2  */
            /* JADX WARN: Removed duplicated region for block: B:194:0x027f  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0324  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0420  */
            /* JADX WARN: Type inference failed for: r0v33, types: [X.1y3, java.lang.Object] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void A00(X.C39851t9 r19, int r20) {
                /*
                    Method dump skipped, instructions count: 1071
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.HandlerC39691ss.A00(X.1t9, int):void");
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    this.A02.F8b();
                                    return;
                                }
                                throw new IllegalArgumentException(AnonymousClass001.A0O("Unsupported handler message: msg.what = ", i));
                            }
                            this.A02.CtZ((C39831t7) message.obj);
                            return;
                        }
                        AbstractC05810Sj.A01(message.obj, "Cannot start new session with null BatchSession.");
                        this.A02.Enc((C39841t8) message.obj);
                        return;
                    }
                    AbstractC05810Sj.A01(message.obj, "Cannot process null event.");
                    A00((C39851t9) message.obj, 1);
                    return;
                }
                AbstractC05810Sj.A01(message.obj, "Cannot process null event.");
                A00((C39851t9) message.obj, 0);
            }
        };
    }
}
