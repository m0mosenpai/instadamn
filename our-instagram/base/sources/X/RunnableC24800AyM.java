package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.AyM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24800AyM implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C218259kx A02;

    public RunnableC24800AyM(View view, UserSession userSession, C218259kx c218259kx) {
        this.A00 = view;
        this.A02 = c218259kx;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!C218259kx.A03) {
            C18720vz c18720vz = AbstractC12960li.A00;
            if (!AbstractC19730y1.A00(c18720vz).A00.getBoolean("has_used_music_sticker_style_selector", false) && AbstractC19730y1.A00(c18720vz).A00.getInt("music_sticker_style_selector_tooltip_impressions", 0) < 3) {
                C149686oL c149686oL = new C149686oL(2131967941);
                View view = this.A00;
                C5SU c5su = new C5SU(AbstractC166997dE.A0L(view), this.A02.A00, c149686oL);
                c5su.A03(view);
                c5su.A02();
                c5su.A04 = new C220409oQ(1);
                c5su.A00().A07(this.A01);
            }
        }
    }
}
