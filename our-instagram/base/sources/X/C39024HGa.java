package X;

/* renamed from: X.HGa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39024HGa extends C1P1 {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ C1ON A01;
    public final /* synthetic */ C1563370d A02;

    public C39024HGa(C1P1 c1p1, C1ON c1on, C1563370d c1563370d) {
        this.A02 = c1563370d;
        this.A01 = c1on;
        this.A00 = c1p1;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -636964199);
        this.A02.A00.remove(this.A01);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(-1383612903, A0N);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 604290986);
        this.A02.A00.remove(this.A01);
        this.A00.onFailInBackground(abstractC115105If);
        C0f9.A0A(1738368171, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(285612079);
        this.A00.onFinish();
        C0f9.A0A(495582865, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1843930877);
        this.A02.A00.add(this.A01);
        this.A00.onStart();
        C0f9.A0A(-54520453, A03);
    }

    @Override // X.C1P1
    public final void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1473237684);
        this.A02.A00.remove(this.A01);
        this.A00.onSuccess(obj);
        C0f9.A0A(2140688780, A03);
    }

    @Override // X.C1P1
    public final void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(2073161206);
        this.A02.A00.remove(this.A01);
        this.A00.onSuccessInBackground(obj);
        C0f9.A0A(1595154880, A03);
    }
}
