package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;

/* renamed from: X.6yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155526yh extends AbstractC33567Esf {
    public InterfaceC678133v A00;
    public C155506yf A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final AnonymousClass309 A05;
    public final MusicOnProfileProvider A06;
    public final boolean A07;
    public final boolean A08;
    public final C155476ya A09;

    public C155526yh(Context context, UserSession userSession, AnonymousClass309 anonymousClass309, C155476ya c155476ya, MusicOnProfileProvider musicOnProfileProvider, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(musicOnProfileProvider, 4);
        C14360o3.A0B(c155476ya, 7);
        this.A04 = userSession;
        this.A03 = context;
        this.A05 = anonymousClass309;
        this.A06 = musicOnProfileProvider;
        this.A08 = z;
        this.A07 = z2;
        this.A09 = c155476ya;
        this.A02 = true;
    }
}
