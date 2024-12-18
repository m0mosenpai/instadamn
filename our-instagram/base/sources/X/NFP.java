package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class NFP extends C2AH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C41627IbI A02;
    public final /* synthetic */ String A03;

    public NFP(Context context, C38321qM c38321qM, C41627IbI c41627IbI, String str) {
        this.A01 = c38321qM;
        this.A02 = c41627IbI;
        this.A00 = context;
        this.A03 = str;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C47Z A02;
        File file = (File) obj;
        C14360o3.A0B(file, 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            String A0x = AbstractC43593JPy.A0x();
            C38321qM c38321qM = this.A01;
            User A14 = AbstractC25226BEj.A14(c38321qM);
            if (A14 != null) {
                String id = A14.getId();
                if (!c38321qM.Cff()) {
                    A02 = AbstractC209399Nx.A01(A0x);
                    String str = this.A03;
                    A02.A33 = canonicalPath;
                    A02.A3L = canonicalPath;
                    A02.A0c(ShareType.A0H);
                    A02.A0N = 14;
                    A02.A3D = str;
                    A02.A3E = id;
                    A02.A5e = true;
                    A02.A32 = c38321qM.A2u();
                    ImageUrl A1S = c38321qM.A1S();
                    if (A1S != null) {
                        A02.A39 = A1S.getUrl();
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    C44059Jdk A00 = C44059Jdk.A00(canonicalPath, 0);
                    C14360o3.A07(A00);
                    String str2 = A00.A07;
                    C14360o3.A07(str2);
                    long j = A00.A03;
                    ClipInfo A03 = MY3.A03(this.A02.A00, str2, j, j);
                    File A01 = AbstractC916948n.A01();
                    C55201OeB.A01(A03, A01, A03.A09, A03.A06, 100, 0L, true);
                    String canonicalPath2 = A01.getCanonicalPath();
                    A02 = AbstractC209399Nx.A02(A0x);
                    String str3 = this.A03;
                    A02.A0g(A00.A07);
                    A02.A33 = canonicalPath2;
                    String str4 = A00.A07;
                    A02.A3L = str4;
                    A02.A02 = A03.A00;
                    A02.A3Z = str4;
                    A02.A0c(ShareType.A0H);
                    A02.A3D = str3;
                    A02.A3E = id;
                    A02.A0N = 14;
                    A02.A5e = true;
                    A02.A32 = c38321qM.A2u();
                    ImageUrl A1S2 = c38321qM.A1S();
                    if (A1S2 != null) {
                        A02.A39 = A1S2.getUrl();
                        MY3.A04(A03, A02);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C40131tg c40131tg = C40121td.A0G;
                Context context = this.A00;
                UserSession userSession = this.A02.A00;
                C40121td A012 = c40131tg.A01(context, userSession);
                if (A02.A11()) {
                    A012.A0D(A02);
                } else {
                    A012.A0C(A02);
                }
                C25A.A00(userSession).A0B(AbstractC166987dD.A0O(context));
                A012.A09(A02);
            }
        } catch (IOException e) {
            C0w9.A06("open_carousel_network_helper", "Error getting image file path", e);
        }
    }
}
