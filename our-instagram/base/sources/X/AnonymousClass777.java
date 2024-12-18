package X;

/* renamed from: X.777, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass777 implements C11R, C1OO {
    public final C1P1 A00;
    public final C1ON A01;

    public final void A00(final C1P1 c1p1) {
        C1P1 c1p12;
        C1ON c1on = this.A01;
        if (c1p1 != null) {
            final C1P1 c1p13 = this.A00;
            c1p12 = new C1P1(c1p13, c1p1, this) { // from class: X.778
                public final C1P1 A00;
                public final C1P1 A01;
                public final /* synthetic */ AnonymousClass777 A02;

                {
                    this.A02 = this;
                    this.A00 = c1p13;
                    this.A01 = c1p1;
                }

                @Override // X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(-371646442);
                    C14360o3.A0B(abstractC115105If, 0);
                    this.A00.onFail(abstractC115105If);
                    this.A01.onFail(abstractC115105If);
                    C0f9.A0A(1392611317, A03);
                }

                @Override // X.C1P1
                public final void onFailInBackground(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(-878368435);
                    C14360o3.A0B(abstractC115105If, 0);
                    this.A00.onFailInBackground(abstractC115105If);
                    this.A01.onFailInBackground(abstractC115105If);
                    C0f9.A0A(2120958448, A03);
                }

                @Override // X.C1P1
                public final void onFinish() {
                    int A03 = C0f9.A03(-1201841572);
                    this.A00.onFinish();
                    this.A01.onFinish();
                    C0f9.A0A(2139316771, A03);
                }

                @Override // X.C1P1
                public final void onStart() {
                    int A03 = C0f9.A03(1524490160);
                    this.A00.onStart();
                    this.A01.onStart();
                    C0f9.A0A(-1101440908, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int A03 = C0f9.A03(974213705);
                    int A032 = C0f9.A03(2006045583);
                    C14360o3.A0B(obj, 0);
                    this.A00.onSuccess(obj);
                    this.A01.onSuccess(obj);
                    C0f9.A0A(1548645671, A032);
                    C0f9.A0A(153171880, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                    int A03 = C0f9.A03(764466790);
                    int A032 = C0f9.A03(-1456889648);
                    C14360o3.A0B(obj, 0);
                    this.A00.onSuccessInBackground(obj);
                    this.A01.onSuccessInBackground(obj);
                    C0f9.A0A(-1066407328, A032);
                    C0f9.A0A(2103112669, A03);
                }
            };
        } else {
            c1p12 = null;
        }
        c1on.A00 = c1p12;
    }

    @Override // X.C1OO
    public final void cancel() {
        this.A01.cancel();
    }

    @Override // X.C11R
    public final String getName() {
        return this.A01.A05;
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return this.A01.A04.runnableId;
    }

    @Override // X.C11R
    public final void onCancel() {
        this.A01.onCancel();
    }

    @Override // X.C11R
    public final void onFinish() {
        this.A01.onFinish();
    }

    @Override // X.C11R
    public final void onStart() {
        this.A01.onStart();
    }

    @Override // X.C11R
    public final void run() {
        this.A01.run();
    }

    public final String toString() {
        return this.A01.toString();
    }

    public AnonymousClass777(C1P1 c1p1, C1ON c1on) {
        this.A01 = c1on;
        this.A00 = c1p1;
    }
}
