package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.A8q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22920A8q {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final C38321qM A03;

    public C22920A8q(Context context, UserSession userSession, C38321qM c38321qM) {
        AbstractC167017dG.A1P(context, userSession);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = c38321qM;
        c38321qM.A0C.Ebf(ProductType.MEMORY.A00);
    }
}
