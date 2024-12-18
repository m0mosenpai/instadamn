package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.Arrays;

/* renamed from: X.ESe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32478ESe extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ AnonymousClass387 A02;

    public C32478ESe(C38321qM c38321qM, AnonymousClass387 anonymousClass387, int i) {
        this.A02 = anonymousClass387;
        this.A01 = c38321qM;
        this.A00 = i;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1280411731);
        int A032 = C0f9.A03(-1986998978);
        UserSession userSession = this.A02.A02;
        for (SavedCollection savedCollection : FBA.A00(userSession).A02(Arrays.asList(EnumC33416Epn.A0C), null)) {
            AbstractC35273Fh8.A07(userSession, this.A01, savedCollection, C05F.A01, this.A00);
        }
        C0f9.A0A(383444636, A032);
        C0f9.A0A(-1081764805, A03);
    }
}
