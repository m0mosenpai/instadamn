package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: X.13t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C216713t extends C11X {
    public C1R8 A00;
    public C27101Tj A01;
    public C27381Uq A02;
    public C217313z A03;
    public C1R9 A04;
    public final int A05;
    public final long A06;
    public final Context A07;
    public final InterfaceC215913l A08;
    public final C217013w A09;
    public final boolean A0A = true;
    public final boolean A0B = true;

    public C216713t(Context context, InterfaceC02550Ad interfaceC02550Ad, InterfaceC215913l interfaceC215913l, int i, long j) {
        this.A07 = context;
        this.A08 = interfaceC215913l;
        this.A09 = AbstractC216813u.A00(interfaceC215913l);
        this.A03 = new C217313z(interfaceC02550Ad);
        this.A05 = i;
        this.A06 = j;
    }

    @Override // X.C11X
    public final C27101Tj A01() {
        C27101Tj c27101Tj = this.A01;
        if (c27101Tj != null) {
            return c27101Tj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C11X
    public final C27101Tj A02(Context context) {
        C1R9 c1r9 = this.A04;
        if (c1r9 != null) {
            C27101Tj c27101Tj = new C27101Tj(context, c1r9, this.A05, this.A06, this.A0A, this.A0B);
            C27101Tj c27101Tj2 = this.A01;
            if (c27101Tj2 != null) {
                c27101Tj.A02(((AbstractC215613i) c27101Tj2).A00.getConfiguration().locale);
                Resources resources = context.getResources();
                C27101Tj c27101Tj3 = this.A01;
                if (c27101Tj3 != null) {
                    int i = ((AbstractC215613i) c27101Tj3).A00.getConfiguration().uiMode;
                    if (C20150ym.A07(AbstractC20100yh.A00(36326060295468647L))) {
                        ((AbstractC215613i) c27101Tj).A00 = resources;
                    }
                    if (!AbstractC215613i.A01 && i != c27101Tj.getConfiguration().uiMode) {
                        Configuration configuration = c27101Tj.getConfiguration();
                        configuration.uiMode = i;
                        c27101Tj.updateConfiguration(configuration, c27101Tj.getDisplayMetrics());
                    }
                    return c27101Tj;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
