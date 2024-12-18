package X;

/* renamed from: X.LXw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48273LXw implements MPZ {
    public final /* synthetic */ C1579977j A00;
    public final /* synthetic */ C43678JTm A01;
    public final /* synthetic */ C7SX A02;

    @Override // X.MPZ
    public final /* synthetic */ void DEI(String str, int i, String str2) {
        C14360o3.A0B(str, 1);
        C0K8.A0C("Failed to load voice message from Armadillo Express store", str);
    }

    @Override // X.MPZ
    public final void DqE(String str, boolean z) {
        C14360o3.A0B(str, 0);
        AbstractC167007dF.A0J().post(new RunnableC49995M5k(this.A00, this.A01, AbstractC46828KnN.A00(this.A02, str)));
    }

    public C48273LXw(C1579977j c1579977j, C43678JTm c43678JTm, C7SX c7sx) {
        this.A00 = c1579977j;
        this.A01 = c43678JTm;
        this.A02 = c7sx;
    }
}
