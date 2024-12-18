package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FNm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34629FNm {
    public final Activity A00;
    public final UserSession A02;
    public final OFY A03;
    public final String A04;
    public final C19270xB A01 = AbstractC31171DnF.A0D("broadcast_channel_participation_hub");
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C37017GSy(this, 42));
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C37017GSy(this, 41));

    public C34629FNm(Activity activity, UserSession userSession, OFY ofy) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A03 = ofy;
        this.A04 = ofy.A06.C7I();
    }
}
