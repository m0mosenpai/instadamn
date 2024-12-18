package X;

import com.facebook.pando.PandoConsistencyServiceJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Do, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Do {
    public final PandoConsistencyServiceJNI A00;
    public final List A01;
    public final C19L A02;
    public final C05A A03;
    public final C05A A04;
    public final AnonymousClass139 A05;
    public final boolean A06;

    public final void A01(C17L c17l) {
        C14360o3.A0B(c17l, 0);
        C19L c19l = this.A02;
        C9DS c9ds = new C9DS(this, c17l, (InterfaceC23621Ds) null, 10);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9ds, c19l);
    }

    public /* synthetic */ C1Do(PandoConsistencyServiceJNI pandoConsistencyServiceJNI) {
        C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(492758188, 3));
        C14360o3.A0B(pandoConsistencyServiceJNI, 1);
        C14360o3.A0B(A02, 2);
        this.A00 = pandoConsistencyServiceJNI;
        this.A02 = A02;
        this.A06 = pandoConsistencyServiceJNI.hasSubscribersRacey();
        this.A01 = new ArrayList();
        this.A04 = new C008002u(false);
        this.A03 = new C008002u(false);
        this.A05 = new AnonymousClass139();
        C206649Cv c206649Cv = new C206649Cv(this, null, 27);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, A02);
    }

    public final void A00() {
        C05A c05a = this.A03;
        do {
        } while (!c05a.AIi(c05a.getValue(), true));
    }
}
