package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.profile.editprofile.viewmodel.EditMusicOnProfileViewModel$special$$inlined$map$1$2;
import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;

/* renamed from: X.6ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155476ya extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final MusicOnProfileProvider A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final UserSession A06;

    public C155476ya(UserSession userSession, MusicOnProfileProvider musicOnProfileProvider) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(musicOnProfileProvider, 2);
        this.A06 = userSession;
        this.A02 = musicOnProfileProvider;
        final C008002u A00 = C10E.A00(null);
        this.A05 = A00;
        this.A00 = musicOnProfileProvider.A01;
        this.A01 = AbstractC58232lf.A00(AnonymousClass191.A00, new InterfaceC19390xP(this) { // from class: X.6yg
            public final /* synthetic */ C155476ya A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = A00.collect(new EditMusicOnProfileViewModel$special$$inlined$map$1$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        });
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A03 = c24721Ip;
        this.A04 = AbstractC07080Za.A03(c24721Ip);
    }

    public final void A00() {
        AudioOverlayTrack audioOverlayTrack;
        MWW mww = (MWW) this.A00.A02();
        if (mww != null) {
            audioOverlayTrack = new AudioOverlayTrack(mww.A02, mww.A01, mww.A00);
        } else {
            audioOverlayTrack = null;
        }
        this.A05.Egh(audioOverlayTrack);
    }
}
