package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* renamed from: X.LEy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47929LEy {
    public EnumC82333lv A00;
    public C189478aR A01;
    public Integer A02;
    public String A03;
    public final Context A04;
    public final UserSession A05;
    public final C47422KxD A06;
    public final LGj A07;

    public static final void A00(C47929LEy c47929LEy) {
        C14H A00 = C14H.A03.A00();
        Context context = c47929LEy.A04;
        Intent flags = A00.A04(context, AbstractC25227BEk.A0B("instagram://suggested_reply")).setFlags(268435456);
        C14360o3.A07(flags);
        C12260kU.A0C(context, flags);
    }

    public C47929LEy(Context context, UserSession userSession, C47422KxD c47422KxD, LGj lGj) {
        this.A05 = userSession;
        this.A04 = context;
        this.A07 = lGj;
        this.A06 = c47422KxD;
    }
}
