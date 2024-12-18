package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UId, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66453UId extends C3OO {
    public final C69443VnS A00;
    public final WEO A01;

    public C66453UId(View view, UserSession userSession) {
        super(view);
        this.A00 = new C69443VnS(view.requireViewById(R.id.location_info));
        this.A01 = new WEO(userSession);
    }
}
