package X;

import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.280, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass280 {
    public static final AnonymousClass282 A01 = new Object();
    public static final List A02;
    public final InterfaceC19630xq A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.282] */
    static {
        List singletonList = Collections.singletonList(ScreenTimeScreenType.A04);
        C14360o3.A07(singletonList);
        A02 = new ArrayList(singletonList);
    }

    public AnonymousClass280(UserSession userSession) {
        this.A00 = C1AT.A01(userSession).A04(C1AV.A3S, getClass());
    }
}
