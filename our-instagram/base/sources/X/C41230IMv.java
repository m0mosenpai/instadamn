package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.IMv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41230IMv {
    public InterfaceC678133v A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final MusicDataSource A04;

    public final void A00() {
        Context context = this.A02;
        UserSession userSession = this.A03;
        InterfaceC678133v A00 = AbstractC677833s.A00(context, userSession, null, new C677733r(context, userSession), "OverrideMusicPlayer", AbstractC677833s.A02(userSession));
        A00.ESz(this.A04, new C42737IvX(), null, 0, -1, -1, false, false);
        A00.seekTo(this.A01);
        this.A00 = A00;
    }

    public final void A01() {
        InterfaceC678133v interfaceC678133v;
        InterfaceC678133v interfaceC678133v2 = this.A00;
        if (interfaceC678133v2 == null) {
            A00();
        } else if (interfaceC678133v2.isPlaying() && (interfaceC678133v = this.A00) != null) {
            interfaceC678133v.pause();
        }
        InterfaceC678133v interfaceC678133v3 = this.A00;
        if (interfaceC678133v3 != null) {
            interfaceC678133v3.seekTo(this.A01);
        }
        InterfaceC678133v interfaceC678133v4 = this.A00;
        if (interfaceC678133v4 != null) {
            interfaceC678133v4.E4S();
        }
    }

    public C41230IMv(Context context, UserSession userSession, MusicDataSource musicDataSource, int i) {
        AbstractC167017dG.A1P(context, userSession);
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = musicDataSource;
        this.A01 = i;
        A00();
    }
}
