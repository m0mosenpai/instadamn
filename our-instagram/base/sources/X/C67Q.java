package X;

import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.api.schemas.AudioNoteResponseInfoIntf;
import com.instagram.api.schemas.AvatarNoteResponseInfo;
import com.instagram.api.schemas.AvatarNoteResponseInfoImpl;
import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.GIFNoteResponseInfoImpl;
import com.instagram.api.schemas.ImmutablePandoAudioNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoAvatarNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoGIFNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo;
import com.instagram.api.schemas.ImmutablePandoLiveNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoLocationNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoMusicNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoNoteChatResponseInfo;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.ListeningNowResponseInfoIntf;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LiveNoteResponseInfoIntf;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfoImpl;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.MusicNoteResponseInfoIntf;
import com.instagram.api.schemas.NoteChatResponseInfo;
import com.instagram.api.schemas.NoteChatResponseInfoImpl;

/* renamed from: X.67Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67Q extends C17T implements C67R {
    @Override // X.C67R
    public final C67s ExR(C1DY c1dy) {
        AudioNoteResponseInfo audioNoteResponseInfo;
        AvatarNoteResponseInfoImpl avatarNoteResponseInfoImpl;
        GIFNoteResponseInfoImpl gIFNoteResponseInfoImpl;
        H3R h3r;
        ListeningNowResponseInfo listeningNowResponseInfo;
        LiveNoteResponseInfo liveNoteResponseInfo;
        LocationNoteResponseInfoImpl locationNoteResponseInfoImpl;
        MusicNoteResponseInfo musicNoteResponseInfo;
        NoteChatResponseInfoImpl noteChatResponseInfoImpl;
        C67x c67x;
        C38737H4b c38737H4b;
        C1348267y c1348267y;
        AudioNoteResponseInfoIntf audioNoteResponseInfoIntf = (AudioNoteResponseInfoIntf) A05(752630632, ImmutablePandoAudioNoteResponseInfo.class);
        C1348367z c1348367z = null;
        if (audioNoteResponseInfoIntf != null) {
            audioNoteResponseInfo = audioNoteResponseInfoIntf.Er5();
        } else {
            audioNoteResponseInfo = null;
        }
        AvatarNoteResponseInfo avatarNoteResponseInfo = (AvatarNoteResponseInfo) A05(-572282619, ImmutablePandoAvatarNoteResponseInfo.class);
        if (avatarNoteResponseInfo != null) {
            avatarNoteResponseInfoImpl = avatarNoteResponseInfo.Er8();
        } else {
            avatarNoteResponseInfoImpl = null;
        }
        GIFNoteResponseInfo gIFNoteResponseInfo = (GIFNoteResponseInfo) A05(914011322, ImmutablePandoGIFNoteResponseInfo.class);
        if (gIFNoteResponseInfo != null) {
            gIFNoteResponseInfoImpl = gIFNoteResponseInfo.Etk();
        } else {
            gIFNoteResponseInfoImpl = null;
        }
        C67Z c67z = (C67Z) A05(2094867999, C67Y.class);
        if (c67z != null) {
            h3r = c67z.Etx(c1dy);
        } else {
            h3r = null;
        }
        ListeningNowResponseInfoIntf listeningNowResponseInfoIntf = (ListeningNowResponseInfoIntf) A05(1798408639, ImmutablePandoListeningNowResponseInfo.class);
        if (listeningNowResponseInfoIntf != null) {
            listeningNowResponseInfo = listeningNowResponseInfoIntf.Evy(c1dy);
        } else {
            listeningNowResponseInfo = null;
        }
        LiveNoteResponseInfoIntf liveNoteResponseInfoIntf = (LiveNoteResponseInfoIntf) A05(1284862610, ImmutablePandoLiveNoteResponseInfo.class);
        if (liveNoteResponseInfoIntf != null) {
            liveNoteResponseInfo = liveNoteResponseInfoIntf.Ew0(c1dy);
        } else {
            liveNoteResponseInfo = null;
        }
        LocationNoteResponseInfo locationNoteResponseInfo = (LocationNoteResponseInfo) A05(22484265, ImmutablePandoLocationNoteResponseInfo.class);
        if (locationNoteResponseInfo != null) {
            locationNoteResponseInfoImpl = locationNoteResponseInfo.Ew7();
        } else {
            locationNoteResponseInfoImpl = null;
        }
        MusicNoteResponseInfoIntf musicNoteResponseInfoIntf = (MusicNoteResponseInfoIntf) A05(53399737, ImmutablePandoMusicNoteResponseInfo.class);
        if (musicNoteResponseInfoIntf != null) {
            musicNoteResponseInfo = musicNoteResponseInfoIntf.Ex2(c1dy);
        } else {
            musicNoteResponseInfo = null;
        }
        NoteChatResponseInfo noteChatResponseInfo = (NoteChatResponseInfo) A05(-838397262, ImmutablePandoNoteChatResponseInfo.class);
        if (noteChatResponseInfo != null) {
            noteChatResponseInfoImpl = noteChatResponseInfo.ExH(c1dy);
        } else {
            noteChatResponseInfoImpl = null;
        }
        InterfaceC1347567l interfaceC1347567l = (InterfaceC1347567l) A05(-1090566300, C1347467k.class);
        if (interfaceC1347567l != null) {
            c67x = interfaceC1347567l.ExP();
        } else {
            c67x = null;
        }
        InterfaceC1347767n interfaceC1347767n = (InterfaceC1347767n) A05(947688995, C1347667m.class);
        if (interfaceC1347767n != null) {
            c38737H4b = interfaceC1347767n.EyA();
        } else {
            c38737H4b = null;
        }
        InterfaceC1347967p interfaceC1347967p = (InterfaceC1347967p) A05(-350707174, C1347867o.class);
        if (interfaceC1347967p != null) {
            c1348267y = interfaceC1347967p.Eyk(c1dy);
        } else {
            c1348267y = null;
        }
        InterfaceC1348167r interfaceC1348167r = (InterfaceC1348167r) A05(-1552091569, C1348067q.class);
        if (interfaceC1348167r != null) {
            c1348367z = interfaceC1348167r.Eyl();
        }
        return new C67s(audioNoteResponseInfo, avatarNoteResponseInfoImpl, gIFNoteResponseInfoImpl, h3r, listeningNowResponseInfo, liveNoteResponseInfo, locationNoteResponseInfoImpl, musicNoteResponseInfo, noteChatResponseInfoImpl, c67x, c38737H4b, c1348267y, c1348367z);
    }
}
