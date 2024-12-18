package X;

import com.instagram.user.model.User;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ETC extends C1P1 {
    public final /* synthetic */ C4LL A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public ETC(C4LL c4ll, String str, Map map) {
        this.A00 = c4ll;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-892355843);
        C4LL.A00(this.A00, this.A01, this.A02);
        C0f9.A0A(1131201166, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1371420767);
        int A032 = C0f9.A03(-107315367);
        User user = ((EC7) obj).A00;
        if (user != null) {
            AnonymousClass189.A00(this.A00.A01).A04(user, true);
        }
        C4LL.A00(this.A00, this.A01, this.A02);
        C0f9.A0A(-1110410636, A032);
        C0f9.A0A(1684770415, A03);
    }
}
