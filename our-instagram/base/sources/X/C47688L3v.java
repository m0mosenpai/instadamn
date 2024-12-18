package X;

import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.L3v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47688L3v {
    public final BoostMediaPickerTabType A00;
    public final UserSession A01;
    public final InterfaceC19390xP A02;
    public final C05A A03;
    public final C05A A04;
    public final /* synthetic */ C44523JmT A05;

    /* JADX WARN: Type inference failed for: r2v1, types: [X.1rF, java.lang.Object] */
    public C47688L3v(BoostMediaPickerTabType boostMediaPickerTabType, C44523JmT c44523JmT, UserSession userSession) {
        this.A05 = c44523JmT;
        this.A01 = userSession;
        this.A00 = boostMediaPickerTabType;
        int i = boostMediaPickerTabType.ordinal() == 3 ? 2 : 1;
        ArrayList A1E = AbstractC166987dD.A1E();
        int i2 = 0;
        int[] iArr = new int[i];
        do {
            iArr[i2] = i2;
            i2++;
        } while (i2 < i);
        ArrayList A1E2 = AbstractC166987dD.A1E();
        int i3 = 0;
        do {
            AbstractC166997dE.A1W(A1E2, iArr[i3]);
            i3++;
        } while (i3 < i);
        C008002u A1H = AbstractC25225BEi.A1H(new C45106Jxa("0", A1E2, A1E, i, true));
        this.A03 = A1H;
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        C008002u A1H2 = AbstractC25225BEi.A1H(new C38321qM(new C37761pD(null), new Object()));
        this.A04 = A1H2;
        this.A02 = C10Q.A03(new C57181PaA(this, (InterfaceC23621Ds) null, 2), new C15340po(new MC5(this, null, 32), A1H), A1H2);
    }
}
