package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.1WO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WO {
    public final /* synthetic */ C27661Vu A00;

    public final void A00(UserSession userSession, String str) {
        Integer num;
        String str2;
        String[] strArr;
        C68836Vcs parseFromJson;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C27661Vu c27661Vu = this.A00;
        Context applicationContext = c27661Vu.A00.getApplicationContext();
        C14360o3.A07(applicationContext);
        C56139Ovz A01 = MWJ.A01(c27661Vu.A00(applicationContext, userSession).A06);
        if (A01 != null) {
            C69245VkE c69245VkE = null;
            try {
                parseFromJson = VWK.parseFromJson(C16V.A00(str));
            } catch (IOException unused) {
            }
            if (parseFromJson != null) {
                c69245VkE = parseFromJson.A00;
                if (c69245VkE != null) {
                    C52693NTe c52693NTe = A01.A09.A04;
                    String str3 = c69245VkE.A02;
                    if (str3 != null) {
                        if (C14360o3.A0K(c69245VkE.A03, "video_call_snapshot_captured")) {
                            num = C05F.A0N;
                        } else {
                            num = C05F.A0D;
                        }
                        FHJ fhj = c69245VkE.A01;
                        if (fhj != null) {
                            str2 = fhj.A00;
                        } else {
                            str2 = null;
                        }
                        if ("video_call_snapshot_captured".equals(c69245VkE.A03) && str2 != null) {
                            strArr = new String[]{str3, str2};
                        } else {
                            strArr = new String[]{str3};
                        }
                        c52693NTe.A00.A02(new C51874MwI(num, C05F.A00, strArr, System.currentTimeMillis(), false));
                    }
                }
            }
        }
    }

    public C1WO(C27661Vu c27661Vu) {
        this.A00 = c27661Vu;
    }
}
