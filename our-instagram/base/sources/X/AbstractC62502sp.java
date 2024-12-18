package X;

/* renamed from: X.2sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC62502sp implements C2JL {
    public boolean A00;

    public void A00(AnonymousClass436 anonymousClass436) {
        C4OZ c4oz = (C4OZ) anonymousClass436;
        final AnonymousClass435 anonymousClass435 = new AnonymousClass435(c4oz.A00, c4oz.A01);
        boolean isOk = anonymousClass435.isOk();
        final C1P1 c1p1 = ((C62492so) this).A00;
        if (!isOk) {
            c1p1.onFailInBackground(new C115115Ig(anonymousClass435));
        } else {
            c1p1.onSuccessInBackground(anonymousClass435);
        }
        C1W2.A00().A01(new Runnable() { // from class: X.4Q1
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass435 anonymousClass4352 = anonymousClass435;
                boolean isOk2 = anonymousClass4352.isOk();
                C1P1 c1p12 = c1p1;
                if (!isOk2) {
                    c1p12.onFail(new C115115Ig(anonymousClass4352));
                } else {
                    c1p12.onSuccess(anonymousClass4352);
                }
                c1p12.onFinish();
            }
        });
    }

    @Override // X.C2JL
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized void onSuccess(AnonymousClass436 anonymousClass436) {
        if (!this.A00) {
            this.A00 = true;
            if (anonymousClass436 != null) {
                A00(anonymousClass436);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public void A02(Throwable th) {
        C1P1 c1p1 = ((C62492so) this).A00;
        c1p1.onFailInBackground(new C115095Ie(th));
        C1W2.A00().A01(new GOF(c1p1, th));
    }

    @Override // X.C2JL
    public final synchronized void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        if (!this.A00) {
            this.A00 = true;
            A02(th);
        }
    }
}
