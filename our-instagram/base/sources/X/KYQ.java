package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KYQ extends C33H {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ String A04;

    public KYQ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c38321qM;
        this.A00 = context;
        this.A04 = str;
    }

    @Override // X.C33H, X.C33I
    public final boolean Dtk(C5SW c5sw) {
        C47993LKk.A00(this.A01, this.A02, this.A03, C05F.A0C, "sticker_nav");
        Context context = this.A00;
        C14360o3.A0A(context);
        AbstractC41776Ies.A03(context, this.A04);
        return true;
    }
}
