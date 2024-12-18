package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.DrM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31417DrM extends C03E implements InterfaceC16660sJ {
    public C31417DrM(Object obj) {
        super(1, obj, C31413DrI.class, "launchFanClubConsiderationScreen", "launchFanClubConsiderationScreen(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C14360o3.A0B(str, 0);
        C31413DrI c31413DrI = (C31413DrI) this.receiver;
        C1YY A01 = FVI.A01();
        FragmentActivity fragmentActivity = c31413DrI.A00;
        UserSession userSession = c31413DrI.A01;
        java.util.Set set = FE3.A00;
        A01.A04(fragmentActivity, userSession, false, AbstractC166997dE.A0b(), str, "subscribe_cta_in_reels");
        return C0eB.A00;
    }
}
