package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OFB {
    public final Context A00;
    public final C2GT A01;
    public final C2GT A02;
    public final C2GS A03;
    public final C2GS A04;
    public final AbstractC018607g A05;
    public final UserSession A06;
    public final String A07;
    public final String A08;

    public OFB(Context context, AbstractC018607g abstractC018607g, UserSession userSession, String str, String str2) {
        AbstractC167027dH.A13(userSession, str, str2);
        this.A06 = userSession;
        this.A08 = str;
        this.A07 = str2;
        this.A05 = abstractC018607g;
        this.A00 = context;
        C2GS A0E = MSW.A0E();
        this.A04 = A0E;
        C2GS A0E2 = MSW.A0E();
        this.A03 = A0E2;
        this.A02 = A0E;
        this.A01 = A0E2;
    }
}
