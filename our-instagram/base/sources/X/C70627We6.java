package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.We6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70627We6 implements XA6 {
    public final /* synthetic */ BaseFragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public C70627We6(BaseFragmentActivity baseFragmentActivity, UserSession userSession, String str) {
        this.A00 = baseFragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.XA6
    public final void onComplete() {
        AbstractC70398WUa.A01(this.A00, this.A01, this.A02, null);
    }
}
