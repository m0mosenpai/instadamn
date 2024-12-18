package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.OCr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54665OCr {
    public int A00;
    public final Context A01;
    public final C197368o7 A02;
    public final UserSession A03;
    public final FilterGroupModel A04 = new FilterGroupModelImpl(new FilterChain(), null, C05F.A00, -1, true);

    public C54665OCr(Context context, C197368o7 c197368o7, UserSession userSession) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = c197368o7;
    }
}
