package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.LIb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47967LIb {
    public InterfaceC41521w1 A00;
    public final C47214Ktn A01;
    public final K3W A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.K3W, com.facebook.msys.mca.MailboxFeature] */
    public C47967LIb(C47214Ktn c47214Ktn, AbstractC135836Cl abstractC135836Cl) {
        this.A02 = new MailboxFeature(abstractC135836Cl);
        this.A01 = c47214Ktn;
    }

    public static final void A01(LK0 lk0) {
        AbstractC46542Kih.A00(lk0, new Exception("api disabled by GK"));
        C0K8.A0C("EncryptedBackupsManagerApi", "api disabled by GK");
    }

    public static final LK0 A00(C47967LIb c47967LIb, int i) {
        LK0 A00 = LK0.A00();
        if (!AbstractC25231BEo.A1b(c47967LIb.A01.A00)) {
            A01(A00);
            return A00;
        }
        K3W k3w = c47967LIb.A02;
        Integer valueOf = Integer.valueOf(i);
        JRS A002 = JRS.A00(A00, 3);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, A002);
        AbstractC43594JPz.A1G(A0H, new JVY(6, valueOf, A0I, k3w), A0I);
        return A00;
    }

    public final LK0 A02(Integer num) {
        LK0 A00 = LK0.A00();
        if (!AbstractC25231BEo.A1b(this.A01.A00)) {
            A01(A00);
            return A00;
        }
        K3W k3w = this.A02;
        C44176Jff c44176Jff = new C44176Jff(this, A00, 3);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, c44176Jff);
        AbstractC43594JPz.A1G(A0H, new JVY(3, num, A0I, k3w), A0I);
        return A00;
    }
}
