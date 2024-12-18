package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ETX extends C1P1 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;
    public final /* synthetic */ C6WQ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1029538433);
        ECF ecf = (ECF) obj;
        int A032 = C0f9.A03(1485677757);
        C14360o3.A0B(ecf, 0);
        this.A03.dismiss();
        String str = ecf.A00;
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        String str2 = this.A06;
        String str3 = this.A05;
        if (str != null && Long.parseLong(str) != 0) {
            AbstractC55224Oeq.A0A(fragmentActivity, userSession, str, "fb_fundraiser_sticker", str2, str3, false);
        } else {
            FDJ.A00(fragmentActivity, userSession, this.A02, this.A04);
        }
        C0f9.A0A(-530091678, A032);
        C0f9.A0A(2135079002, A03);
    }

    public ETX(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C6WQ c6wq, String str, String str2, String str3) {
        this.A03 = c6wq;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = interfaceC60442pS;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-2006809126);
        this.A03.dismiss();
        FDJ.A00(this.A00, this.A01, this.A02, this.A04);
        C0f9.A0A(-55133318, A03);
    }
}
