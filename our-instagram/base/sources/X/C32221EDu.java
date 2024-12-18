package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EDu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32221EDu extends AnonymousClass935 {
    public final /* synthetic */ AnonymousClass935 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32221EDu(AnonymousClass935 anonymousClass935, UserSession userSession) {
        super(userSession);
        this.A00 = anonymousClass935;
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -999892683);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(-1161675478, A0N);
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-240387475);
        int A0N = AbstractC167017dG.A0N(obj, 379667996);
        this.A00.onSuccess(obj);
        C0f9.A0A(738356760, A0N);
        C0f9.A0A(-1608529788, A03);
    }
}
