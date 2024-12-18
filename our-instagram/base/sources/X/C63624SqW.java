package X;

import java.util.concurrent.Executor;

/* renamed from: X.SqW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63624SqW implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public C63624SqW(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A01 = obj5;
        this.A03 = obj2;
        this.A07 = str;
        this.A04 = obj4;
        this.A02 = obj;
        this.A05 = obj6;
        this.A06 = obj3;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Executor executor;
        Runnable tr4;
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        if (this.A00 != 0) {
            if (C63406Sjd.A0J(c63406Sjd)) {
                AbstractC58318PtA.A1I(this, this.A04);
                executor = ((SZ5) this.A01).A01;
                tr4 = new TOL(this, c63406Sjd);
            } else {
                if (!C63406Sjd.A0G(c63406Sjd)) {
                    return;
                }
                AbstractC58318PtA.A1I(this, this.A04);
                SZ5 sz5 = (SZ5) this.A01;
                Throwable th = c63406Sjd.A02;
                InterfaceC65388TjL interfaceC65388TjL = (InterfaceC65388TjL) this.A05;
                executor = (Executor) this.A03;
                tr4 = new TR4(interfaceC65388TjL, sz5, null, null, th);
            }
            executor.execute(tr4);
            return;
        }
        Throwable th2 = c63406Sjd.A02;
        if (th2 instanceof C64864TXp) {
            int i = ((C64864TXp) th2).A00;
            if (i != 7 && i != 9 && i != 13) {
                if (i == 104) {
                    return;
                }
            } else {
                AbstractC58318PtA.A1I(this, this.A03);
                C63345Si1 c63345Si1 = (C63345Si1) this.A01;
                c63345Si1.A03.A01();
                String str = this.A07;
                SE2 se2 = (SE2) this.A04;
                C63345Si1.A01((C1N8) this.A02, (C58252li) this.A06, se2, c63345Si1, this.A05, str);
                return;
            }
        }
        ((C2GT) this.A06).A0A(c63406Sjd);
    }
}
