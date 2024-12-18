package X;

import android.content.Intent;

/* renamed from: X.3Ug, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3Ug {
    public Intent A00;
    public C3VB A01;

    public final InterfaceC127765q1 A00() {
        boolean z = this instanceof C3Uf;
        this.A01.getClass();
        this.A00.getClass();
        final C3VA c3va = (C3VA) this.A01;
        if (z) {
            final Intent intent = this.A00;
            return new InterfaceC127765q1(intent, c3va) { // from class: X.5q0
                public Integer A00 = null;
                public final Intent A01;
                public final C3VA A02;

                @Override // X.InterfaceC127765q1
                public final boolean Cfa() {
                    Integer A01 = this.A02.A01(this.A01.getPackage());
                    this.A00 = A01;
                    return C05F.A05.equals(A01);
                }

                @Override // X.InterfaceC127765q1
                public final boolean Cfc() {
                    Integer A01 = this.A02.A01(C3VA.A00(this.A01));
                    this.A00 = A01;
                    return C05F.A05.equals(A01);
                }

                {
                    this.A02 = c3va;
                    this.A01 = intent;
                }

                @Override // X.InterfaceC127765q1
                public final void FDb() {
                    if (!Cfa()) {
                        Integer num = this.A00;
                        if (num == null) {
                            num = C05F.A06;
                        }
                        throw new C42X(AnonymousClass001.A0R("Invalid package ", this.A01.getPackage()), num);
                    }
                }
            };
        }
        return new T10(this.A00, c3va, null);
    }
}
