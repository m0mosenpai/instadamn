package X;

import android.content.Context;
import android.view.TextureView;
import com.instagram.common.session.UserSession;

/* renamed from: X.OEn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54711OEn {
    public final int A00;
    public final int A01;
    public final C55208OeM A02;
    public final InterfaceC142616cN A03;
    public final InterfaceC178337w7 A04;
    public final W5s A05;
    public final UserSession A06;

    /* JADX WARN: Type inference failed for: r13v1, types: [X.XC9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.PzK, java.lang.Object] */
    public C54711OEn(Context context, TextureView textureView, UserSession userSession, String str, int i, int i2) {
        AZ0 az0;
        C178317w5 c178317w5;
        AbstractC167017dG.A1R(userSession, textureView);
        this.A06 = userSession;
        this.A01 = i;
        this.A00 = i2;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36330003075449469L)) {
            az0 = new AZ0(0, userSession, context);
        } else {
            az0 = null;
        }
        this.A03 = az0;
        if (C18U.A06(c06090Tz, userSession, 36330003075580543L)) {
            c178317w5 = new C178317w5(userSession);
        } else {
            c178317w5 = null;
        }
        this.A04 = c178317w5;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36330003075515006L);
        W5s A05 = AbstractC86593tX.A05(userSession, C18U.A06(c06090Tz, userSession, 36316018662510465L), false, false, false, false);
        this.A05 = A05;
        C52250NAo c52250NAo = new C52250NAo(textureView, AbstractC53867Nrv.A00(userSession), AbstractC53867Nrv.A00(userSession));
        C23518AbY A00 = AbstractC224689vt.A00(context, az0, c178317w5, A06);
        C50665MYi c50665MYi = new C50665MYi(userSession);
        C68920VeK A0P = AbstractC50522MSa.A0P(A05.A0q ? 1 : 0);
        this.A02 = new C55208OeM(context, c50665MYi, new Object(), new Object(), C55768Opc.A00, A0P, null, A00, A05, c52250NAo, str, null, null, AbstractC53947NtK.A00("reels_sound_sync", null), 59008);
    }
}
