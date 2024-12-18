package X;

import android.os.Handler;

/* renamed from: X.758, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass758 implements C2JL {
    public final AbstractC154286wd A00;
    public final C154806xV A01;
    public final InterfaceC16660sJ A02;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        this.A00.onFailInBackground(new C115095Ie(th));
        ((Handler) AbstractC31532DtH.A00.getValue()).post(new J4U(this, th));
    }

    @Override // X.C2JL
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(AnonymousClass436 anonymousClass436) {
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) anonymousClass436;
        if (anonymousClass435 == null) {
            onFailure(new IllegalStateException("Unable to get data from response"));
            return;
        }
        InterfaceC74303Vl interfaceC74303Vl = (InterfaceC74303Vl) this.A02.invoke(anonymousClass435);
        this.A00.onSuccessInBackground(interfaceC74303Vl);
        ((Handler) AbstractC31532DtH.A00.getValue()).post(new RunnableC37998Gnj(interfaceC74303Vl, this, anonymousClass435));
    }

    public AnonymousClass758(AbstractC154286wd abstractC154286wd, C154806xV c154806xV, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = c154806xV;
        this.A00 = abstractC154286wd;
        this.A02 = interfaceC16660sJ;
    }
}
