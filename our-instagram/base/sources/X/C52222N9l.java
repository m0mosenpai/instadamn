package X;

import android.content.Context;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.common.session.UserSession;

/* renamed from: X.N9l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52222N9l extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C171177k9 A02;
    public final /* synthetic */ C4NL A03;
    public final /* synthetic */ InterfaceC55362gb A04;

    public C52222N9l(Context context, UserSession userSession, C171177k9 c171177k9, C4NL c4nl, InterfaceC55362gb interfaceC55362gb) {
        this.A04 = interfaceC55362gb;
        this.A03 = c4nl;
        this.A00 = context;
        this.A02 = c171177k9;
        this.A01 = userSession;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C0f9.A0A(-1120556372, C0f9.A03(13175455));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-2114810355);
        N39 n39 = (N39) obj;
        int A0N = AbstractC167017dG.A0N(n39, 1097366495);
        if (n39.A03 && n39.A00 == IGLiveBadgeSettings.A07) {
            C27961Xa A00 = AbstractC54912fq.A00();
            InterfaceC55362gb interfaceC55362gb = this.A04;
            C4NL c4nl = this.A03;
            Context context = this.A00;
            AbstractC59962oe abstractC59962oe = this.A02.A0B;
            A00.A07(context, abstractC59962oe, c4nl, interfaceC55362gb);
            UserSession userSession = this.A01;
            IGLiveBadgeSettings iGLiveBadgeSettings = IGLiveBadgeSettings.A05;
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("users/set_live_settings/");
            abstractC59962oe.schedule(AbstractC31178DnM.A0K(A0c, "live_badge_setting", iGLiveBadgeSettings.A00));
        }
        C0f9.A0A(-164951685, A0N);
        C0f9.A0A(235735173, A03);
    }
}
