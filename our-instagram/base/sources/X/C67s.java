package X;

import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.api.schemas.AvatarNoteResponseInfo;
import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.NoteChatResponseInfo;

/* renamed from: X.67s, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67s extends C0T6 implements C67R {
    public final AudioNoteResponseInfo A00;
    public final AvatarNoteResponseInfo A01;
    public final GIFNoteResponseInfo A02;
    public final C67Z A03;
    public final ListeningNowResponseInfo A04;
    public final LiveNoteResponseInfo A05;
    public final LocationNoteResponseInfo A06;
    public final MusicNoteResponseInfo A07;
    public final NoteChatResponseInfo A08;
    public final C67x A09;
    public final InterfaceC1347767n A0A;
    public final C1348267y A0B;
    public final C1348367z A0C;

    @Override // X.C67R
    public final C67s ExR(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C67s) {
                C67s c67s = (C67s) obj;
                if (!C14360o3.A0K(this.A00, c67s.A00) || !C14360o3.A0K(this.A01, c67s.A01) || !C14360o3.A0K(this.A02, c67s.A02) || !C14360o3.A0K(this.A03, c67s.A03) || !C14360o3.A0K(this.A04, c67s.A04) || !C14360o3.A0K(this.A05, c67s.A05) || !C14360o3.A0K(this.A06, c67s.A06) || !C14360o3.A0K(this.A07, c67s.A07) || !C14360o3.A0K(this.A08, c67s.A08) || !C14360o3.A0K(this.A09, c67s.A09) || !C14360o3.A0K(this.A0A, c67s.A0A) || !C14360o3.A0K(this.A0B, c67s.A0B) || !C14360o3.A0K(this.A0C, c67s.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AudioNoteResponseInfo audioNoteResponseInfo = this.A00;
        int hashCode = (audioNoteResponseInfo == null ? 0 : audioNoteResponseInfo.hashCode()) * 31;
        AvatarNoteResponseInfo avatarNoteResponseInfo = this.A01;
        int hashCode2 = (hashCode + (avatarNoteResponseInfo == null ? 0 : avatarNoteResponseInfo.hashCode())) * 31;
        GIFNoteResponseInfo gIFNoteResponseInfo = this.A02;
        int hashCode3 = (hashCode2 + (gIFNoteResponseInfo == null ? 0 : gIFNoteResponseInfo.hashCode())) * 31;
        C67Z c67z = this.A03;
        int hashCode4 = (hashCode3 + (c67z == null ? 0 : c67z.hashCode())) * 31;
        ListeningNowResponseInfo listeningNowResponseInfo = this.A04;
        int hashCode5 = (hashCode4 + (listeningNowResponseInfo == null ? 0 : listeningNowResponseInfo.hashCode())) * 31;
        LiveNoteResponseInfo liveNoteResponseInfo = this.A05;
        int hashCode6 = (hashCode5 + (liveNoteResponseInfo == null ? 0 : liveNoteResponseInfo.hashCode())) * 31;
        LocationNoteResponseInfo locationNoteResponseInfo = this.A06;
        int hashCode7 = (hashCode6 + (locationNoteResponseInfo == null ? 0 : locationNoteResponseInfo.hashCode())) * 31;
        MusicNoteResponseInfo musicNoteResponseInfo = this.A07;
        int hashCode8 = (hashCode7 + (musicNoteResponseInfo == null ? 0 : musicNoteResponseInfo.hashCode())) * 31;
        NoteChatResponseInfo noteChatResponseInfo = this.A08;
        int hashCode9 = (hashCode8 + (noteChatResponseInfo == null ? 0 : noteChatResponseInfo.hashCode())) * 31;
        C67x c67x = this.A09;
        int hashCode10 = (hashCode9 + (c67x == null ? 0 : c67x.hashCode())) * 31;
        InterfaceC1347767n interfaceC1347767n = this.A0A;
        int hashCode11 = (hashCode10 + (interfaceC1347767n == null ? 0 : interfaceC1347767n.hashCode())) * 31;
        C1348267y c1348267y = this.A0B;
        int hashCode12 = (hashCode11 + (c1348267y == null ? 0 : c1348267y.hashCode())) * 31;
        C1348367z c1348367z = this.A0C;
        return hashCode12 + (c1348367z != null ? c1348367z.hashCode() : 0);
    }

    public C67s(AudioNoteResponseInfo audioNoteResponseInfo, AvatarNoteResponseInfo avatarNoteResponseInfo, GIFNoteResponseInfo gIFNoteResponseInfo, C67Z c67z, ListeningNowResponseInfo listeningNowResponseInfo, LiveNoteResponseInfo liveNoteResponseInfo, LocationNoteResponseInfo locationNoteResponseInfo, MusicNoteResponseInfo musicNoteResponseInfo, NoteChatResponseInfo noteChatResponseInfo, C67x c67x, InterfaceC1347767n interfaceC1347767n, C1348267y c1348267y, C1348367z c1348367z) {
        this.A00 = audioNoteResponseInfo;
        this.A01 = avatarNoteResponseInfo;
        this.A02 = gIFNoteResponseInfo;
        this.A03 = c67z;
        this.A04 = listeningNowResponseInfo;
        this.A05 = liveNoteResponseInfo;
        this.A06 = locationNoteResponseInfo;
        this.A07 = musicNoteResponseInfo;
        this.A08 = noteChatResponseInfo;
        this.A09 = c67x;
        this.A0A = interfaceC1347767n;
        this.A0B = c1348267y;
        this.A0C = c1348367z;
    }
}
