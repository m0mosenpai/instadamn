package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;

/* renamed from: X.A9r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22947A9r {
    public C55208OeM A00;
    public final Context A01;
    public final UserSession A02;
    public final CameraSpec A03;
    public final A6L A04;
    public final Point A05;

    public C22947A9r(Context context, UserSession userSession, A6L a6l) {
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = a6l;
        Point A01 = ALe.A01(context, userSession);
        C14360o3.A07(A01);
        this.A05 = A01;
        this.A03 = C75I.A01(userSession, A01.x, A01.y);
    }
}
