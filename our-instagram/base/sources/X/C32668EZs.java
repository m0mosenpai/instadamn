package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.EZs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32668EZs extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C32538EUo A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32668EZs(C32538EUo c32538EUo, String str, String str2, int i) {
        super(1929956249, 3, false, false);
        this.A01 = c32538EUo;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32538EUo c32538EUo = this.A01;
        Context context = c32538EUo.A00;
        C14360o3.A0A(context);
        UserSession userSession = c32538EUo.A02;
        String str = this.A03;
        String str2 = this.A02;
        AbstractC167007dF.A1K(context, userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("session/flush_session/");
        AbstractC31171DnF.A1J(A0c, str);
        A0c.A9s(AbstractC37314GcG.A01(0, 9, 28), C16030qx.A00(context));
        A0c.A9s("session_flush_nonce", str2);
        C1ON A0K = AbstractC31178DnM.A0K(A0c, "guid", AbstractC31172DnG.A10(context));
        A0K.A00 = new C32482ESi(c32538EUo, str2, str, this.A00);
        A0K.run();
    }
}
