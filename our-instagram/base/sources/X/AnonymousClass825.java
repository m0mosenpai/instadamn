package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.List;

/* renamed from: X.825, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass825 extends AbstractC52922bZ {
    public C22P A00;
    public C174757qB A01;
    public CameraSpec A02;
    public final C2GS A03;
    public final C2GS A04;
    public final C2GS A05;
    public final UserSession A06;
    public final InterfaceC19630xq A07;
    public final List A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final Context A0C;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2GT, X.2GS] */
    public AnonymousClass825(Context context, UserSession userSession) {
        this.A0C = context;
        this.A06 = userSession;
        Float valueOf = Float.valueOf(1.0f);
        this.A0B = new C008002u(new C3AY(0, valueOf));
        this.A04 = new C2GT(true);
        this.A05 = new C2GT(AnonymousClass826.A05);
        this.A03 = new C2GT(new C3AY(valueOf, false));
        this.A0A = new C008002u(false);
        this.A09 = new C008002u(false);
        this.A08 = AnonymousClass827.A01(userSession);
        this.A07 = C1AT.A01(userSession).A03(C1AV.A0e);
        this.A00 = C22P.A5N;
    }

    public final CameraSpec A00() {
        CameraSpec cameraSpec = this.A02;
        if (cameraSpec == null) {
            cameraSpec = C75I.A00(this.A0C, this.A06);
        }
        this.A02 = cameraSpec;
        return cameraSpec;
    }
}
