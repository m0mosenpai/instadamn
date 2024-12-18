package X;

import android.graphics.Rect;

/* renamed from: X.6Vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140086Vm extends AbstractC79173gO {
    public final C140096Vn A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6Vn] */
    public C140086Vm(final AnonymousClass630 anonymousClass630) {
        C14360o3.A0B(anonymousClass630, 1);
        this.A00 = new C2X7(anonymousClass630) { // from class: X.6Vn
            public C103054kg A00;
            public final AnonymousClass630 A01;

            @Override // X.C2X7
            public final /* bridge */ /* synthetic */ Object A0A() {
                return null;
            }

            @Override // X.C2X7
            public final void A0C(C79073gE c79073gE) {
                AbstractC103024kd.A01.set(this.A00);
                this.A00 = null;
            }

            {
                this.A01 = anonymousClass630;
            }

            @Override // X.C2X7
            public final /* bridge */ /* synthetic */ void A0B(Rect rect, C79073gE c79073gE, Object obj) {
                this.A00 = AbstractC103044kf.A00();
                ThreadLocal threadLocal = AbstractC103024kd.A01;
                AnonymousClass630 anonymousClass6302 = this.A01;
                AbstractC79383gk.A02("Evaluation Context can only be gotten from the UI Thread");
                threadLocal.set(anonymousClass6302.A07);
            }
        };
    }
}
