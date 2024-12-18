package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Orr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55903Orr implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "IgdsVariableSamplingLoggingStrategy";
    public Integer A00;
    public final Handler A01;
    public final C18920wW A02;
    public final O36 A03;
    public final O37 A04;
    public final Map A05;
    public final AbstractC50712Us A06;
    public final String A07;
    public volatile boolean A08;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    public C55903Orr(UserSession userSession) {
        O36 o36 = new O36(userSession);
        this.A03 = o36;
        this.A02 = AbstractC12220kQ.A01(this, userSession);
        this.A06 = AbstractC50712Us.A00;
        this.A01 = AbstractC167007dF.A0J();
        this.A04 = new O37(o36);
        this.A05 = AbstractC166987dD.A1I();
        this.A07 = __redex_internal_original_name;
    }
}
