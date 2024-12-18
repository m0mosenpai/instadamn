package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39013HFp extends C1P1 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public C39013HFp(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = str;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(2002370459);
        C38874H9w c38874H9w = (C38874H9w) obj;
        int A032 = C0f9.A03(1413389628);
        super.onSuccess(c38874H9w);
        if (c38874H9w != null) {
            C38321qM c38321qM = c38874H9w.A00;
            if (c38321qM != null) {
                UserSession userSession = this.A01;
                FragmentActivity fragmentActivity = this.A00;
                String str = this.A02;
                AbstractC37301Gc2.A1O(userSession, c38321qM);
                AbstractC40916IAo.A00(fragmentActivity, userSession, str);
            } else {
                C14360o3.A0F("clipsMedia");
                throw C00O.createAndThrow();
            }
        }
        C0f9.A0A(-895704647, A032);
        C0f9.A0A(-1903167790, A03);
    }
}
