package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.consideration.FanClubConsiderationRepository;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;

/* renamed from: X.EWb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32576EWb extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C32576EWb(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = z;
        this.A02 = str2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        FragmentActivity fragmentActivity = this.A00;
        Application application = fragmentActivity.getApplication();
        C14360o3.A07(application);
        UserSession userSession = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        boolean z = this.A04;
        FanClubConsiderationRepository fanClubConsiderationRepository = new FanClubConsiderationRepository(userSession);
        C14360o3.A0B(userSession, 0);
        return new FanClubConsiderationViewModel(application, userSession, fanClubConsiderationRepository, (C48511Ld7) userSession.A01(C48511Ld7.class, new C50171MDy(25, fragmentActivity, userSession)), AbstractC149676oK.A00(userSession), str, str2, z);
    }
}
