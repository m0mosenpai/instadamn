package X;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.XPg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC72134XPg extends Handler {
    public C39841t8 A00;
    public Y11 A01;
    public Queue A02;
    public Stack A03;
    public final C38201qA A04;
    public final Integer A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final /* synthetic */ C72853Xp9 A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC72134XPg(Looper looper, C72853Xp9 c72853Xp9, C38201qA c38201qA, Integer num) {
        super(looper);
        this.A09 = c72853Xp9;
        this.A07 = AbstractC58318PtA.A0b();
        this.A08 = AbstractC58318PtA.A0b();
        this.A06 = AbstractC58318PtA.A0b();
        this.A04 = c38201qA;
        this.A05 = num;
    }

    private Y0t A00() {
        C72853Xp9 c72853Xp9 = this.A09;
        Y0t y0t = c72853Xp9.A00;
        if (y0t == null) {
            C72818Xni c72818Xni = c72853Xp9.A04;
            Context context = c72818Xni.A03;
            AbstractC40011tS A00 = AbstractC40011tS.A00(!C39981tM.A00(context).A01());
            String str = c72818Xni.A0D;
            File A002 = C0eS.A00(context, 1543572765);
            A002.mkdirs();
            File file = new File(A002, str);
            file.mkdirs();
            InterfaceC38311qL interfaceC38311qL = c72818Xni.A06;
            int ByY = interfaceC38311qL.ByY();
            int BAy = interfaceC38311qL.BAy();
            int Aif = interfaceC38311qL.Aif();
            C39901tE c39901tE = c72818Xni.A07;
            C04060Jx c04060Jx = c72818Xni.A0A;
            String A003 = C1UY.A00();
            if (A003 == null) {
                A003 = "unknown";
            }
            C40071tY c40071tY = new C40071tY(c72818Xni.A04, c39901tE, A00, c04060Jx, new File(file, A003), ByY, BAy, Aif, c72818Xni.A01);
            int i = c72818Xni.A00;
            C40401u8 c40401u8 = new C40401u8(c72818Xni.A08, file, HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
            InterfaceC38191q6 interfaceC38191q6 = c72818Xni.A05;
            Class cls = c72818Xni.A0C;
            InterfaceC39191rv interfaceC39191rv = c72818Xni.A09;
            Y0t y0t2 = new Y0t(c40071tY, new C63896SvU(context, interfaceC38191q6, c40401u8, interfaceC39191rv.B7t(), interfaceC39191rv.Af2(), c72818Xni.A0B, cls, i, c72818Xni.A0E));
            c72853Xp9.A00 = y0t2;
            return y0t2;
        }
        return y0t;
    }

    private Y0t A01() {
        C72853Xp9 c72853Xp9 = this.A09;
        if (c72853Xp9.A01 == null) {
            C72818Xni c72818Xni = c72853Xp9.A04;
            InterfaceC38311qL interfaceC38311qL = c72818Xni.A06;
            int ByY = interfaceC38311qL.ByY();
            int BAy = interfaceC38311qL.BAy();
            int Aif = interfaceC38311qL.Aif();
            C39901tE c39901tE = c72818Xni.A07;
            C04060Jx c04060Jx = c72818Xni.A0A;
            Y0t y0t = new Y0t(new AbstractC40081tZ(c72818Xni.A04, c39901tE, c04060Jx, ByY, BAy, Aif), new Y9J(c72818Xni.A03, c72818Xni.A08, c04060Jx, c72818Xni.A0B));
            c72853Xp9.A01 = y0t;
            y0t.A00.A03(this.A00);
        }
        return c72853Xp9.A01;
    }

    private void A02(C39851t9 c39851t9) {
        AbstractC020908f.A00("doWrite");
        C0CA c0ca = c39851t9.A03;
        try {
            AbstractC020908f.A00("writeToDisk");
            try {
                try {
                    Y0t A00 = A00();
                    A00.A00.A04(c0ca);
                    Y0t.A00(A00);
                    A05(this, c0ca, "event.persisted", c39851t9.A05, c39851t9.A06);
                } finally {
                    AbstractC021008g.A00();
                    InterfaceC37451oi interfaceC37451oi = this.A09.A02;
                    if (interfaceC37451oi != null) {
                        interfaceC37451oi.onEventsWritten(1);
                    }
                }
            } catch (AnonymousClass404 | AnonymousClass405 | IOException unused) {
                String str = c39851t9.A05;
                String str2 = c39851t9.A06;
                A05(this, c0ca, "event.not_processed.persist.failed", str, str2);
                try {
                    Y0t A01 = A01();
                    A01.A00.A04(c0ca);
                    Y0t.A00(A01);
                    A05(this, c0ca, "event.persisted.in_memory", str, str2);
                    AbstractC021008g.A00();
                    InterfaceC37451oi interfaceC37451oi2 = this.A09.A02;
                    if (interfaceC37451oi2 != null) {
                    }
                    A06(c0ca);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            c0ca.A02();
            AbstractC021008g.A00();
        }
    }

    private void A03(C39841t8 c39841t8) {
        AbstractC020908f.A00("doStartNewSession");
        try {
            AbstractC05810Sj.A01(c39841t8, "A new batch session should never be null");
            this.A00 = c39841t8;
            A00().A00.A03(this.A00);
            Y0t y0t = this.A09.A01;
            if (y0t != null) {
                y0t.A00.A03(this.A00);
            }
            boolean A08 = A08();
            LinkedList linkedList = new LinkedList();
            synchronized (this.A08) {
                Queue queue = this.A02;
                if (queue != null) {
                    linkedList.addAll(queue);
                    this.A02.clear();
                    this.A02 = null;
                }
            }
            while (!linkedList.isEmpty()) {
                Message message = (Message) linkedList.poll();
                if (message != null) {
                    A07(!A08, message);
                    message.recycle();
                    A08 = true;
                }
            }
        } finally {
            AbstractC021008g.A00();
        }
    }

    public static void A04(HandlerC72134XPg handlerC72134XPg) {
        if (handlerC72134XPg.A09.A03.B1S()) {
            synchronized (handlerC72134XPg.A07) {
                handlerC72134XPg.A01 = null;
            }
        }
    }

    public static void A05(HandlerC72134XPg handlerC72134XPg, C0CA c0ca, String str, String str2, String str3) {
        C38951rU c38951rU = handlerC72134XPg.A09.A06;
        if (c38951rU.A01()) {
            c38951rU.A00().Chy(str, str2, str3, new XOa(c0ca, 0), 1L, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1y3, java.lang.Object] */
    private void A06(C0CA c0ca) {
        InterfaceC37451oi interfaceC37451oi = this.A09.A02;
        if (interfaceC37451oi != null) {
            AbstractC020908f.A00("eventListener");
            try {
                AbstractC42781y6.A00(interfaceC37451oi, new Object(), c0ca);
            } finally {
                AbstractC021008g.A00();
            }
        }
    }

    private void A07(boolean z, Message message) {
        C0CA[] c0caArr;
        C38201qA c38201qA;
        int i = message.what;
        if (i != 1) {
            if (i != 3) {
                try {
                    if (i != 4) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i == 9) {
                                    AbstractC020908f.A00("doUpload");
                                    A00().A01.F8b();
                                    Y0t y0t = this.A09.A01;
                                    if (y0t != null) {
                                        y0t.A01.F8b();
                                    }
                                } else {
                                    throw AbstractC25230BEn.A0n("Unknown what=", i);
                                }
                            } else {
                                return;
                            }
                        } else {
                            ((ConditionVariable) message.obj).open();
                            return;
                        }
                    } else {
                        String str = (String) message.obj;
                        AbstractC020908f.A00("doUserLogout");
                        A00().A01.CtY(str);
                        Y0t y0t2 = this.A09.A01;
                        if (y0t2 != null) {
                            y0t2.A01.CtY(str);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    AbstractC021008g.A00();
                    throw th;
                }
            } else {
                A03((C39841t8) message.obj);
                return;
            }
        } else {
            if (z && (c38201qA = this.A04) != null) {
                AbstractC020908f.A00("doWaitForWriteBlockRelease");
                c38201qA.A00(this.A05);
                AbstractC021008g.A00();
            }
            int i2 = message.arg1;
            Object obj = message.obj;
            if (i2 != 2) {
                A02((C39851t9) obj);
                return;
            }
            Y11 y11 = (Y11) obj;
            AbstractC020908f.A00("doWrites");
            try {
                synchronized (this.A07) {
                    try {
                        y11.A03 = true;
                        if (this.A01 == y11) {
                            this.A01 = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                AbstractC020908f.A00("writeToDisk");
                try {
                    try {
                        try {
                            Y0t A00 = A00();
                            c0caArr = y11.A04;
                            A00.A01(c0caArr, y11.A01);
                            InterfaceC37451oi interfaceC37451oi = this.A09.A02;
                            if (interfaceC37451oi != null) {
                                interfaceC37451oi.onEventsWritten(y11.A01);
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (Throwable th3) {
                        InterfaceC37451oi interfaceC37451oi2 = this.A09.A02;
                        if (interfaceC37451oi2 != null) {
                            interfaceC37451oi2.onEventsWritten(y11.A01);
                        }
                        AbstractC021008g.A00();
                        throw th3;
                    }
                } catch (AnonymousClass404 | AnonymousClass405 | IOException unused) {
                    Y0t A01 = A01();
                    c0caArr = y11.A04;
                    A01.A01(c0caArr, y11.A01);
                    InterfaceC37451oi interfaceC37451oi3 = this.A09.A02;
                    if (interfaceC37451oi3 != null) {
                        interfaceC37451oi3.onEventsWritten(y11.A01);
                    }
                }
                AbstractC021008g.A00();
                for (int i3 = 0; i3 < y11.A01; i3++) {
                    C0CA c0ca = c0caArr[i3];
                    if (c0ca != null) {
                        A06(c0ca);
                    }
                }
                y11.A00();
            } catch (Throwable th4) {
                th = th4;
                y11.A00();
                AbstractC021008g.A00();
                throw th;
            }
        }
        AbstractC021008g.A00();
    }

    private boolean A08() {
        C39851t9 c39851t9;
        boolean z = false;
        if (!this.A09.A03.B1R()) {
            return false;
        }
        while (true) {
            synchronized (this.A06) {
                Stack stack = this.A03;
                if (stack == null || stack.isEmpty()) {
                    break;
                }
                c39851t9 = (C39851t9) this.A03.pop();
            }
            AbstractC020908f.A00("handleAsapMessage");
            if (!z) {
                try {
                    C38201qA c38201qA = this.A04;
                    if (c38201qA != null) {
                        AbstractC020908f.A00("doWaitForWriteBlockRelease");
                        c38201qA.A00(this.A05);
                        AbstractC021008g.A00();
                    }
                    z = true;
                } finally {
                    AbstractC021008g.A00();
                }
            }
            A02(c39851t9);
        }
        return z;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        C39841t8 c39841t8 = this.A00;
        if (c39841t8 == null && message.what != 3) {
            synchronized (this.A08) {
                Queue queue = this.A02;
                if (queue == null) {
                    queue = new LinkedList();
                    this.A02 = queue;
                }
                queue.add(Message.obtain(message));
            }
            return;
        }
        boolean z2 = false;
        if (c39841t8 != null) {
            z = A08();
        } else {
            z = false;
        }
        AbstractC020908f.A00("handleMessage");
        if (!z) {
            z2 = true;
        }
        try {
            A07(z2, message);
        } finally {
            AbstractC021008g.A00();
        }
    }
}
