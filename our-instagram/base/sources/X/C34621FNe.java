package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;

/* renamed from: X.FNe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34621FNe {
    public RectF A00;
    public RectF A01;
    public final Activity A02;
    public final UserSession A03;
    public final ProductCollectionShareInfo A04;
    public final InterfaceC09390do A05;

    public C34621FNe(Activity activity, UserSession userSession, ProductCollectionShareInfo productCollectionShareInfo) {
        AbstractC167017dG.A1Q(userSession, productCollectionShareInfo);
        this.A03 = userSession;
        this.A02 = activity;
        this.A04 = productCollectionShareInfo;
        this.A05 = AbstractC09440dt.A01(new C57527Pg1(this, 33));
    }
}
