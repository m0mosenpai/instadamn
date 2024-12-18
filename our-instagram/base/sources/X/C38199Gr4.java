package X;

/* renamed from: X.Gr4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38199Gr4 extends AbstractC154286wd {
    public final AbstractC154286wd A00;
    public final /* synthetic */ C38139Gq6 A01;

    public C38199Gr4(C38139Gq6 c38139Gq6, AbstractC154286wd abstractC154286wd) {
        this.A01 = c38139Gq6;
        this.A00 = abstractC154286wd;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 282156245);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(1807112358, A0N);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1889572578);
        this.A00.onFailInBackground(abstractC115105If);
        C0f9.A0A(-1492236396, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1853614515);
        this.A00.onFinish();
        C0f9.A0A(738214729, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1433071285);
        this.A00.onStart();
        C0f9.A0A(913184495, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1590463993);
        int A0N = AbstractC167017dG.A0N(obj, 1077266068);
        this.A00.onSuccess(obj);
        C0f9.A0A(1256658006, A0N);
        C0f9.A0A(1740789866, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(1018912814);
        int A0N = AbstractC167017dG.A0N(obj, 80588365);
        this.A00.onSuccessInBackground(obj);
        C0f9.A0A(1594240711, A0N);
        C0f9.A0A(1051395251, A03);
    }
}
