package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Deprecated;

/* renamed from: X.1ON, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ON implements C11R, C1OO {
    public static InterfaceC16620sF A08;
    public C1P1 A00;
    public InterfaceC151096rC A01;
    public boolean A02;
    public int A03;
    public final AbstractC24481Hr A04;
    public final String A05;
    public final C1OK A06;
    public final String A07;

    public final Object A00(int i, InterfaceC23621Ds interfaceC23621Ds) {
        return A02(interfaceC23621Ds, i, 3, false);
    }

    public final Object A02(InterfaceC23621Ds interfaceC23621Ds, int i, int i2, final boolean z) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        final C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        this.A00 = new C1P1() { // from class: X.3Ip
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-1038864198);
                C14360o3.A0B(abstractC115105If, 0);
                c24891Jo.resumeWith(new C194848jk(abstractC115105If));
                C0f9.A0A(689658036, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(-515900618);
                int A032 = C0f9.A03(761574318);
                C14360o3.A0B(obj, 0);
                if (!z) {
                    c24891Jo.resumeWith(new C3NX(obj));
                }
                C0f9.A0A(1918195663, A032);
                C0f9.A0A(-1933789626, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                int A03 = C0f9.A03(1474658502);
                int A032 = C0f9.A03(1061021562);
                C14360o3.A0B(obj, 0);
                if (z) {
                    c24891Jo.resumeWith(new C3NX(obj));
                }
                C0f9.A0A(1206571206, A032);
                C0f9.A0A(-849576076, A03);
            }
        };
        c24891Jo.CPA(new C9EB(this, 4));
        C1GJ.A06(this, i, i2, true, false);
        return c24891Jo.A0E();
    }

    public final C008302x A03(int i) {
        return A05(i, 3);
    }

    public final C008302x A04(int i, int i2) {
        return C0JE.A00(new C9DC(this, null, i, i2, 0, true, false));
    }

    public final C008302x A05(int i, int i2) {
        return C0JE.A00(new C9DC(this, null, i, i2, 1, true, false));
    }

    @Override // X.C1OO
    @Deprecated(message = "")
    public final void cancel() {
        C1OK c1ok = this.A06;
        if (c1ok != null) {
            c1ok.A00();
        } else {
            C0w9.A03("HttpRequestTask_cancel", "Attempted to cancel without a CancellationTokenSource");
        }
    }

    @Override // X.C11R
    public final String getName() {
        return this.A05;
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return this.A04.runnableId;
    }

    @Override // X.C11R
    public final void onCancel() {
        InterfaceC151096rC interfaceC151096rC = this.A01;
        if (interfaceC151096rC != null) {
            interfaceC151096rC.Ckj();
        }
    }

    @Override // X.C11R
    public final void onFinish() {
        int A00;
        AbstractC115105If A002;
        String str;
        C1P1 c1p1 = this.A00;
        InterfaceC151096rC interfaceC151096rC = this.A01;
        if (interfaceC151096rC != null) {
            interfaceC151096rC.Ckk();
        }
        if (c1p1 != null) {
            String str2 = this.A05;
            Class<?> cls = c1p1.getClass();
            int A003 = C2UD.A00(cls, str2, "onFinish");
            c1p1.onFinish();
            C2UD.A00.ASS(A003);
            AbstractC24481Hr abstractC24481Hr = this.A04;
            if (!abstractC24481Hr.A0D()) {
                C3NY c3ny = (C3NY) abstractC24481Hr.A07();
                if (!this.A02) {
                    if (c3ny instanceof C3NX) {
                        A00 = C2UD.A00(cls, str2, "onSuccess");
                        if (interfaceC151096rC != null) {
                            interfaceC151096rC.Clw();
                        }
                        c1p1.onSuccess(((C3NX) c3ny).A00);
                    } else {
                        A00 = C2UD.A00(cls, str2, "onFail");
                        if (c3ny instanceof C194848jk) {
                            A002 = new C115115Ig(((C194848jk) c3ny).A00);
                        } else {
                            A002 = C7J2.A00();
                        }
                        if (interfaceC151096rC != null) {
                            Throwable A01 = A002.A01();
                            if (A01 == null || (str = A01.toString()) == null) {
                                str = "no_error_message";
                            }
                            interfaceC151096rC.Cj9(str);
                        }
                        c1p1.onFail(A002);
                        InterfaceC16620sF interfaceC16620sF = A08;
                        if (interfaceC16620sF != null) {
                            interfaceC16620sF.invoke(str2, A002);
                        }
                    }
                } else {
                    if (interfaceC151096rC == null) {
                        return;
                    }
                    interfaceC151096rC.Ci5();
                    return;
                }
            } else {
                A00 = C2UD.A00(cls, str2, "onFail");
                if (interfaceC151096rC != null) {
                    interfaceC151096rC.CjI(String.valueOf(abstractC24481Hr.A06()));
                }
                Exception A06 = abstractC24481Hr.A06();
                C14360o3.A0A(A06);
                c1p1.onFail(new C115095Ie(A06));
                InterfaceC16620sF interfaceC16620sF2 = A08;
                if (interfaceC16620sF2 != null) {
                    Exception A062 = abstractC24481Hr.A06();
                    C14360o3.A0A(A062);
                    interfaceC16620sF2.invoke(str2, new C115095Ie(A062));
                }
            }
            C2UD.A00.ASS(A00);
        }
    }

    @Override // X.C11R
    public final void onStart() {
        InterfaceC151096rC interfaceC151096rC = this.A01;
        if (interfaceC151096rC != null) {
            interfaceC151096rC.Cko();
        }
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onStart();
        }
        int i = this.A03 + 1;
        this.A03 = i;
        if (i > 1) {
            C0w9.A06("HttpRequestTask_onStart", "Attempted to start the task more than once", new Exception());
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.C11R
    public final void run() {
        C1P1 c1p1;
        AbstractC115105If c115095Ie;
        InterfaceC151096rC interfaceC151096rC = this.A01;
        if (interfaceC151096rC != null) {
            interfaceC151096rC.ClN();
        }
        ThreadLocal threadLocal = C1P5.A00;
        threadLocal.set(this.A07);
        try {
            AbstractC24481Hr abstractC24481Hr = this.A04;
            abstractC24481Hr.run();
            InterfaceC151096rC interfaceC151096rC2 = this.A01;
            if (interfaceC151096rC2 != null) {
                interfaceC151096rC2.ClO();
            }
            threadLocal.remove();
            if (!abstractC24481Hr.A0D()) {
                C3NY c3ny = (C3NY) abstractC24481Hr.A07();
                if (c3ny instanceof C3NX) {
                    C1P1 c1p12 = this.A00;
                    if (c1p12 != null) {
                        c1p12.onSuccessInBackground(((C3NX) c3ny).A00);
                        return;
                    }
                    return;
                }
                if (c3ny instanceof C194848jk) {
                    c1p1 = this.A00;
                    if (c1p1 == null) {
                        return;
                    } else {
                        c115095Ie = new C115115Ig(((C194848jk) c3ny).A00);
                    }
                } else if (c3ny == null) {
                    c1p1 = this.A00;
                    if (c1p1 == null) {
                        return;
                    } else {
                        c115095Ie = C7J2.A00();
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                abstractC24481Hr.A06();
                c1p1 = this.A00;
                if (c1p1 == null) {
                    return;
                }
                Exception A06 = abstractC24481Hr.A06();
                C14360o3.A0A(A06);
                c115095Ie = new C115095Ie(A06);
            }
            c1p1.onFailInBackground(c115095Ie);
        } catch (Throwable th) {
            InterfaceC151096rC interfaceC151096rC3 = this.A01;
            if (interfaceC151096rC3 != null) {
                interfaceC151096rC3.ClO();
            }
            threadLocal.remove();
            throw th;
        }
    }

    public final String toString() {
        return this.A04.toString();
    }

    @Deprecated(message = "Please use {@link HttpRequestTask#HttpRequestTask(String, Task, String, String)}\n        and track your {@link CancellationTokenSource} externally instead.")
    public C1ON(C1OK c1ok, AbstractC24481Hr abstractC24481Hr, String str, String str2) {
        this.A04 = abstractC24481Hr;
        this.A06 = c1ok;
        String str3 = ((String[]) new C11L("\\?").A03(str2).toArray(new String[0]))[0];
        this.A07 = str3;
        this.A05 = AnonymousClass001.A0T(str, str3, ' ');
    }

    public final Object A01(InterfaceC23621Ds interfaceC23621Ds) {
        return A02(interfaceC23621Ds, 722993640, 2, false);
    }
}
