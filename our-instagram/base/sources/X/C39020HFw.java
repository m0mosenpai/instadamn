package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39020HFw extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ boolean A02;

    public C39020HFw(UserSession userSession, Context context, boolean z) {
        this.A01 = userSession;
        this.A02 = z;
        this.A00 = context;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(2038220269);
        UserSession userSession = this.A01;
        Context context = this.A00;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(context, A0K, 2131957490);
        A0K.A05();
        A0K.A0H = "daisy_snackbar_error";
        A0K.A06();
        A0K.A0L = true;
        AbstractC31175DnJ.A0l(context, A0K, 2131957489);
        A0K.A0A(new G9A(13, context, userSession));
        AbstractC25233BEq.A1F(A0K);
        C0f9.A0A(867947872, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1243299161);
        int A032 = C0f9.A03(861570859);
        UserSession userSession = this.A01;
        C3YZ.A00(userSession).A00(this.A02);
        C57342k9 c57342k9 = C57332k8.A0m;
        Context context = this.A00;
        c57342k9.A00(context, userSession).A0K(context);
        AbstractC25651Mw.A00(userSession).E4s(new Object());
        C0f9.A0A(732484660, A032);
        C0f9.A0A(-1849015064, A03);
    }
}
