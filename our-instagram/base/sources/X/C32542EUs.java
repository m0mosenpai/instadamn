package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.EUs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32542EUs extends C1P1 {
    public static final AtomicInteger A05 = new AtomicInteger();
    public final Context A00;
    public final AbstractC12990ll A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C32542EUs(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, boolean z) {
        this.A00 = context.getApplicationContext();
        this.A01 = abstractC12990ll;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C35037FcA A06;
        int A03 = C0f9.A03(1656113754);
        C41451vu.A01.E4s(new C36049Fvl(this.A03, null, null));
        boolean z = this.A04;
        AbstractC12990ll abstractC12990ll = this.A01;
        if (z) {
            A06 = C1Q9.A1D.A02(abstractC12990ll).A06(EnumC33445EqI.A06, EnumC31713DwI.A0V);
        } else {
            A06 = C1Q9.A0E.A02(abstractC12990ll).A06(EnumC33445EqI.A06, null);
        }
        A06.A04("error", "request_failed");
        A06.A02();
        C0f9.A0A(-1042035816, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1vw, java.lang.Object] */
    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(132043585);
        if (A05.decrementAndGet() == 0) {
            C41451vu.A01.E4s(new Object());
        }
        C0f9.A0A(666010955, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1984366167);
        if (A05.getAndIncrement() == 0) {
            C41451vu.A01.E4s(new C36042Fve(this.A02));
        }
        C0f9.A0A(167723914, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C35037FcA A06;
        C1Q9 c1q9;
        int A03 = C0f9.A03(1241802302);
        EgL egL = (EgL) obj;
        int A032 = C0f9.A03(1794662422);
        if (egL.A01) {
            boolean z = this.A04;
            AbstractC12990ll abstractC12990ll = this.A01;
            if (!z) {
                c1q9 = C1Q9.A0G;
            } else {
                c1q9 = C1Q9.A0y;
            }
            C35037FcA A062 = c1q9.A02(abstractC12990ll).A06(EnumC33445EqI.A06, null);
            A062.A04("locale", C1Q2.A02().toString());
            A062.A02();
            C41451vu.A01.E4s(new C36050Fvm(egL, this.A03, this.A02));
            C35231FgO.A03.A05(this.A00);
        } else {
            C41451vu.A01.E4s(new C36049Fvl(this.A03, C05F.A15, egL.A00));
            boolean z2 = this.A04;
            AbstractC12990ll abstractC12990ll2 = this.A01;
            if (z2) {
                A06 = C1Q9.A1D.A02(abstractC12990ll2).A06(EnumC33445EqI.A06, EnumC31713DwI.A0V);
            } else {
                A06 = C1Q9.A0E.A02(abstractC12990ll2).A06(EnumC33445EqI.A06, null);
            }
            A06.A04("error", "validation_failed");
            A06.A02();
        }
        C0f9.A0A(-290632523, A032);
        C0f9.A0A(-984025733, A03);
    }
}
