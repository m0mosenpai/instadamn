package X;

/* renamed from: X.0tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17480tj implements C0LR {
    public static boolean A00;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A19;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        if (!A00) {
            C47964LHk.A00("App ANR because of QE sync takes a long time and blocking main thread.Skip Test as infra issue");
            C0K8.A0C("JESTE2EHeadlessLoginInitializer", "App ANR before headless login finish");
        }
    }
}
