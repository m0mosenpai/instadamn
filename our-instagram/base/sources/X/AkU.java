package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* loaded from: classes4.dex */
public final class AkU implements InterfaceC65982ya {
    public final /* synthetic */ C185738Ls A00;
    public final /* synthetic */ C9ZH A01;

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        if (c47z.A0p()) {
            c47z.A0X(this);
            C9ZH c9zh = this.A01;
            long j = c9zh.A00;
            String str = c9zh.A05;
            String str2 = c9zh.A03;
            String str3 = c9zh.A04;
            ImageUrl imageUrl = c9zh.A01;
            String str4 = c9zh.A02;
            UserSession userSession = this.A00.A02;
            C7TG A00 = AbstractC165967bO.A00(userSession);
            if (str2 != null) {
                if (str3 != null) {
                    if (imageUrl == null) {
                        imageUrl = new SimpleImageUrl("");
                    }
                    A00.A0F(imageUrl, c47z, str, str2, str3, str4, j);
                    AbstractC135966Db.A01(userSession).A0D(EnumC46303KeZ.A0V);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public AkU(C185738Ls c185738Ls, C9ZH c9zh) {
        this.A01 = c9zh;
        this.A00 = c185738Ls;
    }
}
