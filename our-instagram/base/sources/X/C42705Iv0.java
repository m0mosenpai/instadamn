package X;

/* renamed from: X.Iv0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42705Iv0 implements C33I {
    public final /* synthetic */ C148586mT A00;
    public final /* synthetic */ C38080Gp9 A01;

    @Override // X.C33I
    public final boolean Dtk(C5SW c5sw) {
        return true;
    }

    @Override // X.C33I
    public final void Dtq(C5SW c5sw) {
    }

    public C42705Iv0(C148586mT c148586mT, C38080Gp9 c38080Gp9) {
        this.A00 = c148586mT;
        this.A01 = c38080Gp9;
    }

    @Override // X.C33I
    public final void Dto(C5SW c5sw) {
        this.A00.A04.EJJ();
        AnonymousClass693 anonymousClass693 = this.A01.A0Q.A07.A09;
        if (anonymousClass693 != null) {
            anonymousClass693.stop();
            anonymousClass693.EMk(0.0f);
        }
    }

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        this.A00.A04.EJE("suggested_users_tooltip_shown");
        AnonymousClass693 anonymousClass693 = this.A01.A0Q.A07.A09;
        if (anonymousClass693 != null) {
            anonymousClass693.EH0(2);
            anonymousClass693.E4S();
        }
    }
}
