package X;

import android.os.Handler;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.authenticity.uploader.AuthenticityMediaServiceUploader$upload$2;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.TEg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64446TEg implements InterfaceC65447TkJ {
    public boolean A00;
    public final Handler A01;
    public final UserSession A02;
    public final Map A03;

    public C64446TEg(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AbstractC167007dF.A0J();
        this.A03 = AbstractC166987dD.A1I();
    }

    @Override // X.InterfaceC65447TkJ
    public final void FDB(SO9 so9, Long l, String str, String str2, List list) {
        EnumC40111tc enumC40111tc;
        int i;
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        this.A03.clear();
        this.A00 = A1Y;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51u c51u = (C51u) it.next();
            String str3 = (String) c51u.A00;
            File file = (File) c51u.A01;
            String str4 = (String) c51u.A02;
            int size = list.size();
            if (C14360o3.A0K(str4, AuthenticityUploadMedium.SELFIE_VIDEO_NATIVE.getValue())) {
                enumC40111tc = EnumC40111tc.A0I;
            } else if (C14360o3.A0K(str4, AuthenticityUploadMedium.SELFIE_PHOTO_NATIVE.getValue())) {
                enumC40111tc = EnumC40111tc.A0J;
            } else {
                enumC40111tc = EnumC40111tc.A0H;
            }
            String valueOf = String.valueOf(System.nanoTime());
            String A02 = C6WI.A02();
            C14360o3.A07(A02);
            WVG wvg = new WVG(new OVd(this.A02));
            if (C14360o3.A0K(str4, AuthenticityUploadMedium.SELFIE_VIDEO_NATIVE.getValue())) {
                i = 655;
            } else {
                i = 677;
                if (C14360o3.A0K(str4, AuthenticityUploadMedium.SELFIE_PHOTO_NATIVE.getValue())) {
                    i = 1164305889;
                }
            }
            C19K A01 = AbstractC24771Iv.A01(i, 3);
            AbstractC23641Du.A05(AnonymousClass191.A00, new AuthenticityMediaServiceUploader$upload$2(wvg, this, so9, enumC40111tc, file, valueOf, str, str4, A02, str3, null, size), A01);
        }
    }
}
