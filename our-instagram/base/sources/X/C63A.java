package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.63A, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63A implements InterfaceC13000lm {
    public C1339263a A00;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        List A0a;
        C1339263a c1339263a = this.A00;
        C63W c63w = c1339263a.A04;
        C136206Eu c136206Eu = c1339263a.A05;
        C14360o3.A0B(c136206Eu, 0);
        c63w.A00.remove(c136206Eu);
        C63U c63u = c1339263a.A07.A02;
        java.util.Set singleton = Collections.singleton(EnumC61117RfX.A04);
        C14360o3.A07(singleton);
        c63u.A02(singleton);
        synchronized (c1339263a.A0A) {
            C63O c63o = c1339263a.A08;
            synchronized (c63o.A00) {
                A0a = AbstractC001800i.A0a(c63o.A01);
            }
            for (C1339963h c1339963h : AbstractC001800i.A0a(A0a)) {
                c1339963h.A00.invoke(c1339963h);
                c1339963h.A01 = null;
            }
            c1339263a.A0B.run();
        }
        synchronized (c1339263a.A09) {
            c1339263a.A0C.clear();
        }
    }
}
