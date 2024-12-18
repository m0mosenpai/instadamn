package X;

/* renamed from: X.V7x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68045V7x extends AbstractC154286wd {
    public final AbstractC154286wd A00;
    public final /* synthetic */ C69132ViN A01;

    public C68045V7x(AbstractC154286wd abstractC154286wd, C69132ViN c69132ViN) {
        this.A01 = c69132ViN;
        this.A00 = abstractC154286wd;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-671151561);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(1172234905, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1924370006);
        this.A00.onFailInBackground(abstractC115105If);
        C0f9.A0A(1091418131, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1955313401);
        this.A00.onFinish();
        C0f9.A0A(-1634637403, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-331932548);
        this.A00.onStart();
        C0f9.A0A(600694363, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1353903062);
        C67848UzT c67848UzT = (C67848UzT) obj;
        int A032 = C0f9.A03(1776177059);
        C69132ViN c69132ViN = this.A01;
        c69132ViN.A01 = c67848UzT.A05;
        c69132ViN.A00 = c67848UzT.A04;
        this.A00.onSuccess(c67848UzT);
        C0f9.A0A(1580671326, A032);
        C0f9.A0A(-1854217297, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-2015610747);
        int A032 = C0f9.A03(-1453076502);
        this.A00.onSuccessInBackground(obj);
        C0f9.A0A(234973500, A032);
        C0f9.A0A(1676821253, A03);
    }
}
