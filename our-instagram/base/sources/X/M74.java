package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* loaded from: classes8.dex */
public final class M74 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ EnumC46246KdN A03;
    public final /* synthetic */ DirectThreadKey A04;
    public final /* synthetic */ PendingMediaStore A05;
    public final /* synthetic */ String A06;

    public M74(Bitmap bitmap, View view, UserSession userSession, EnumC46246KdN enumC46246KdN, DirectThreadKey directThreadKey, PendingMediaStore pendingMediaStore, String str) {
        this.A05 = pendingMediaStore;
        this.A06 = str;
        this.A04 = directThreadKey;
        this.A02 = userSession;
        this.A03 = enumC46246KdN;
        this.A01 = view;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47Z A03 = this.A05.A03(this.A06);
        if (A03 != null) {
            DirectThreadKey directThreadKey = this.A04;
            UserSession userSession = this.A02;
            EnumC46246KdN enumC46246KdN = this.A03;
            C49540Lut c49540Lut = new C49540Lut(this.A00, this.A01, userSession, enumC46246KdN, directThreadKey);
            A03.A0W(c49540Lut);
            c49540Lut.Dbp(A03);
        }
    }
}
