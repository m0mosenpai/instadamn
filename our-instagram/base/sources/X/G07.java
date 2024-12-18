package X;

/* loaded from: classes6.dex */
public final class G07 implements InterfaceC25601Mq {
    public final int A00;
    public final Object A01;

    public G07(C31535DtK c31535DtK, int i) {
        this.A00 = i;
        this.A01 = c31535DtK;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        if (this.A00 != 0) {
            AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
            C14360o3.A0B(anonymousClass435, 0);
            return new C33301Enw(C31535DtK.A03((C31535DtK) this.A01), anonymousClass435);
        }
        AnonymousClass435 anonymousClass4352 = (AnonymousClass435) obj;
        C14360o3.A0B(anonymousClass4352, 0);
        return new C33300Env(C31535DtK.A03((C31535DtK) this.A01), anonymousClass4352);
    }
}
