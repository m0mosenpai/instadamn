package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Gj5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37730Gj5 implements InterfaceC13000lm {
    public Map A00;
    public Map A01;
    public Map A02;
    public Map A03;
    public final UserSession A04;
    public final InterfaceC19630xq A05;

    public C37730Gj5(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A05 = C1AT.A01(userSession).A03(C1AV.A0i);
        this.A03 = AbstractC166987dD.A1G();
        this.A01 = AbstractC166987dD.A1G();
        Map synchronizedMap = Collections.synchronizedMap(AbstractC166987dD.A1G());
        C14360o3.A07(synchronizedMap);
        this.A02 = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(AbstractC166987dD.A1G());
        C14360o3.A07(synchronizedMap2);
        this.A00 = synchronizedMap2;
        this.A01.put("like_reels", 30);
        this.A01.put("save_reels", 50);
        this.A01.put("open_profile_page", 30);
        this.A01.put("open_share_sheet", 30);
        this.A01.put("loop_playback_25_percent", 4);
        this.A01.put("on_touch_down", 1073741823);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.clear();
        this.A02.clear();
        this.A00.clear();
        InterfaceC19610xo ARD = this.A05.ARD();
        ARD.AHW();
        ARD.apply();
    }

    public final void A00(UserSession userSession, String str, String str2, String str3) {
        AbstractC167027dH.A13(str2, userSession, str3);
        C14120nc.A00().ATO(new HJV(this, userSession, str, str2, str3));
    }
}
