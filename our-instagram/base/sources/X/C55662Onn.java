package X;

/* renamed from: X.Onn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55662Onn implements InterfaceC48192Ji {
    public final /* synthetic */ InterfaceC41501vz A00;

    public C55662Onn(InterfaceC41501vz interfaceC41501vz) {
        this.A00 = interfaceC41501vz;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS A0k;
        C2JS A05;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (A05 = A0k.A05(Qn4.class, "xdt_live_question_submission_status_event(input:$input)", -760305250)) != null) {
            this.A00.onEvent(new NYP(A05.getRequiredIntField(3, "live_question_count"), A05.getRequiredBooleanField(2, AbstractC58317Pt9.A00(835))));
        }
    }
}
