package X;

/* renamed from: X.8Z0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Z0 extends C2AH {
    public final C2AH A00;
    public final /* synthetic */ C189088Yy A01;

    public C8Z0(C189088Yy c189088Yy, C2AH c2ah) {
        C14360o3.A0B(c2ah, 2);
        this.A01 = c189088Yy;
        this.A00 = c2ah;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        this.A00.onFail(exc);
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C14360o3.A0B(obj, 0);
        this.A00.onSuccess(obj);
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        this.A00.onFinish();
        this.A01.A04.clear();
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        this.A00.onStart();
    }
}
