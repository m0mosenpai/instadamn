package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* renamed from: X.ODu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54694ODu {
    public final C2GS A00;
    public final MusicProduct A01;
    public final UserSession A02;
    public final C154796xU A03;
    public final C54428O3i A04;
    public final String A05;

    public C54694ODu(Context context, AbstractC018607g abstractC018607g, MusicProduct musicProduct, UserSession userSession, C54428O3i c54428O3i, String str) {
        AbstractC25233BEq.A0x(1, userSession, musicProduct, str);
        C14360o3.A0B(c54428O3i, 6);
        this.A02 = userSession;
        this.A01 = musicProduct;
        this.A05 = str;
        this.A04 = c54428O3i;
        this.A00 = MSW.A0E();
        this.A03 = new C154796xU(context, abstractC018607g, userSession);
    }
}
