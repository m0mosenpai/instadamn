package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity;
import java.util.Locale;

/* renamed from: X.140, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass140 extends AbstractC211911v {
    public final C211211o A00;
    public final C11X A01;

    @Override // X.AbstractC211911v
    public final String A06() {
        return "LanguageInitializer";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0iw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.1Uq, X.0lX] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.1R7] */
    @Override // X.AbstractC211911v
    public final void A07() {
        C11X c11x = this.A01;
        AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
        C216713t c216713t = (C216713t) c11x;
        C18920wW A01 = AbstractC12220kQ.A01(new Object(), A08);
        C1R6 c1r6 = new C1R6(c216713t.A08);
        c216713t.A03 = new C217313z(A01);
        C229019s c229019s = new C229019s(A01);
        C217013w c217013w = c216713t.A09;
        c216713t.A00 = new C1R8(new Object(), c217013w, c1r6, c229019s);
        Context context = c216713t.A07;
        Resources resources = context.getResources();
        C217313z c217313z = c216713t.A03;
        C1R8 c1r8 = c216713t.A00;
        if (c1r8 != null) {
            if (C1R9.A0F == null) {
                synchronized (C1R9.class) {
                    if (C1R9.A0F == null) {
                        C1R9.A0F = new C1R9(context, resources, c1r6, c1r8, c217313z, A08, c217013w);
                    }
                }
            }
            if (C1R9.A0F.A0C != A08) {
                C0K8.A0D("QCE_IQ", "user session changed");
            }
            C1R9.A0F.A0C = A08;
            C1R9 c1r9 = C1R9.A0F;
            c216713t.A04 = c1r9;
            if (c1r9 != null) {
                int i = c216713t.A05;
                long j = c216713t.A06;
                boolean z = c216713t.A0A;
                boolean z2 = c216713t.A0B;
                if (C27101Tj.A02 == null) {
                    synchronized (C27101Tj.class) {
                        if (C27101Tj.A02 == null) {
                            C27101Tj.A02 = new C27101Tj(context, c1r9, i, j, z, z2);
                        }
                    }
                }
                c216713t.A01 = C27101Tj.A02;
                C1R9 c1r92 = c216713t.A04;
                if (c1r92 != null) {
                    ?? r1 = new AbstractC18730w0(c1r92) { // from class: X.1Uq
                        public final C1R9 A00;

                        @Override // X.AbstractC18730w0, X.InterfaceC12850lX
                        public final void Cux(Activity activity) {
                            C14360o3.A0B(activity, 0);
                            Resources resources2 = activity.getResources();
                            if ((resources2 instanceof C27101Tj) && resources2 != null) {
                                C1R9 c1r93 = this.A00;
                                Locale AcO = c1r93.A06.AcO();
                                if (c1r93.A0D && !AcO.equals(c1r93.A09.getAndSet(AcO))) {
                                    C1R9.A01(c1r93);
                                }
                                if (!InterfaceC53202c2.class.isAssignableFrom(activity.getClass()) && !c1r93.A05()) {
                                    Intent intent = new Intent(activity, (Class<?>) WaitingForStringsActivity.class);
                                    intent.putExtra("return_intent", activity.getIntent());
                                    C08600cO c08600cO = new C08600cO();
                                    c08600cO.A01();
                                    if (c08600cO.A00().A03(activity.getApplicationContext(), intent, null)) {
                                        intent.putExtra("from_trusted_caller", true);
                                    }
                                    C12260kU.A0C(activity, intent);
                                    activity.finish();
                                }
                            }
                        }

                        {
                            this.A00 = c1r92;
                        }
                    };
                    c216713t.A02 = r1;
                    AbstractC12860lY.A07(r1);
                    C11X.A00 = c11x;
                    C11X.A01 = true;
                    C20150ym.A07(AbstractC20100yh.A00(36318050181453672L));
                    C1Q2.A04();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass140(C211211o c211211o, C11X c11x) {
        this.A01 = c11x;
        this.A00 = c211211o;
    }
}
