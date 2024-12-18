package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25301Lk {
    public InterfaceC25281Li A00;
    public int A01;
    public Context A02;
    public InterfaceC24271Gw A03;
    public C18240vB A04;
    public String A05;

    public static synchronized InterfaceC24271Gw A00(C25301Lk c25301Lk) {
        InterfaceC24271Gw interfaceC24271Gw;
        C24251Gu A00;
        synchronized (c25301Lk) {
            interfaceC24271Gw = c25301Lk.A03;
            if (interfaceC24271Gw == null) {
                String str = c25301Lk.A05;
                if (str != null) {
                    A00 = new C24251Gu();
                    File A002 = AbstractC25541Mj.A00(c25301Lk.A02, str, false);
                    if (A002 != null) {
                        A00.A03 = A002;
                    }
                    A00.A01 = 5242880L;
                } else {
                    A00 = C24251Gu.A00(c25301Lk.A01);
                }
                C0o0 A003 = AbstractC14350nz.A00();
                A003.A01 = C25301Lk.class.getName();
                A00.A02 = new C18240vB(A003);
                interfaceC24271Gw = A00.A01();
                c25301Lk.A03 = interfaceC24271Gw;
            }
        }
        return interfaceC24271Gw;
    }

    public final Object A01(String str, long j, boolean z) {
        if (!z) {
            C11T.A05("This operation can't be run on UI thread.");
        }
        C57622kb c57622kb = new C57622kb(this, j);
        this.A04.ATO(new C57672kg(c57622kb, this, str));
        try {
            c57622kb.A01.await(c57622kb.A02, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        return c57622kb.A00;
    }

    public final Object A02(String str, boolean z) {
        return A01(str, 500L, z);
    }

    public final void A03(InterfaceC57632kc interfaceC57632kc, String str) {
        this.A04.ATO(new C57672kg(interfaceC57632kc, this, str));
    }

    public final void A04(String str) {
        this.A04.ATO(new C87403v2(this, str));
    }

    public final void A05(String str, Object obj) {
        this.A04.ATO(new C58501PwU(this, obj, str));
    }

    public final void A06(String str, Object obj) {
        C11T.A05("This operation can't be run on UI thread.");
        new C58501PwU(this, obj, str).run();
    }

    public C25301Lk(Context context, InterfaceC25281Li interfaceC25281Li, int i) {
        this.A02 = context;
        this.A00 = interfaceC25281Li;
        this.A01 = i;
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = AbstractC23201Az.A04(i);
        this.A04 = new C18240vB(A00);
    }

    public C25301Lk(Context context, InterfaceC25281Li interfaceC25281Li, String str) {
        this.A02 = context;
        this.A00 = interfaceC25281Li;
        this.A05 = str;
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = this.A05;
        this.A04 = new C18240vB(A00);
    }
}
