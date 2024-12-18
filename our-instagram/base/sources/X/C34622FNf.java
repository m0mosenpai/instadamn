package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.share.ShopShareInfo;

/* renamed from: X.FNf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34622FNf {
    public RectF A00;
    public RectF A01;
    public final Activity A02;
    public final UserSession A03;
    public final ShopShareInfo A04;
    public final InterfaceC09390do A05;

    public C34622FNf(Activity activity, UserSession userSession, ShopShareInfo shopShareInfo) {
        AbstractC167017dG.A1Q(userSession, shopShareInfo);
        this.A03 = userSession;
        this.A02 = activity;
        this.A04 = shopShareInfo;
        this.A05 = AbstractC09440dt.A01(new C57527Pg1(this, 36));
    }
}
