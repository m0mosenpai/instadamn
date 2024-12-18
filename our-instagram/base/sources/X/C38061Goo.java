package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Goo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38061Goo {
    public static final C41694IdN A0J = new Object();
    public MUD A00;
    public MUD A01;
    public H2I A02;
    public H2J A03;
    public C38690H2b A04;
    public OriginalSoundData A05;
    public OriginalSoundData A06;
    public C38070Goz A07;
    public TrackDataImpl A08;
    public TrackMetadata A09;
    public TrackMetadata A0A;
    public MusicSearchArtist A0B;
    public C42734IvU A0C;
    public C39685HjH A0D;
    public MusicSearchPlaylist A0E;
    public C42733IvT A0F;
    public Integer A0G;
    public C37964Gn6 A0H;
    public C42733IvT A0I;

    public C38061Goo(JL3 jl3) {
        C14360o3.A0B(jl3, 1);
        this.A09 = jl3.BTR();
        OriginalSoundDataIntf BZv = jl3.BZv();
        if (BZv != null) {
            C0w9.A03("unexpected_original_sound", "OriginalSound found as search item for browse request");
            this.A0F = new C42733IvT(BZv);
        }
        TrackData CA8 = jl3.CA8();
        if (CA8 != null) {
            this.A0H = new C37964Gn6(CA8);
        }
        A02();
    }

    public final JIN A00() {
        JIN jin = this.A0H;
        if (jin == null && (jin = this.A0F) == null) {
            jin = this.A0I;
        }
        return jin;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A01() {
        /*
            r4 = this;
            java.lang.Integer r0 = r4.A0G
            if (r0 != 0) goto L78
            r0 = -1
        L5:
            java.lang.String r1 = "Required value was null."
            switch(r0) {
                case 1: goto L1d;
                case 2: goto L28;
                case 3: goto L31;
                case 4: goto La;
                case 5: goto L3d;
                case 6: goto L3d;
                case 7: goto L4a;
                case 8: goto L55;
                case 9: goto L60;
                default: goto La;
            }
        La:
            r0 = 0
        Lb:
            r3 = 0
            if (r0 == 0) goto L1c
            r2 = 95
            java.lang.Integer r1 = r4.A0G
            if (r1 == 0) goto L18
            java.lang.String r3 = X.AbstractC40747I4b.A00(r1)
        L18:
            java.lang.String r3 = X.AnonymousClass001.A0T(r0, r3, r2)
        L1c:
            return r3
        L1d:
            X.JIN r0 = r4.A00()
            if (r0 == 0) goto L7d
            java.lang.String r0 = r0.BgD()
            goto Lb
        L28:
            X.MUD r0 = r4.A01
            if (r0 != 0) goto L3a
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        L31:
            X.MUD r0 = r4.A00
            if (r0 != 0) goto L3a
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        L3a:
            java.lang.String r0 = r0.A01
            goto Lb
        L3d:
            com.instagram.music.common.model.MusicSearchPlaylist r0 = r4.A0E
            if (r0 == 0) goto L82
            X.JM8 r0 = r0.A00()
            java.lang.String r0 = r0.getId()
            goto Lb
        L4a:
            X.IvU r0 = r4.A0C
            if (r0 == 0) goto L87
            X.JKp r0 = r0.A00
            java.lang.String r0 = r0.getId()
            goto Lb
        L55:
            com.instagram.music.common.model.MusicSearchArtist r0 = r4.A0B
            if (r0 == 0) goto L8c
            X.PrI r0 = r0.A01
            X.H2I r0 = (X.H2I) r0
            java.lang.String r0 = r0.A03
            goto Lb
        L60:
            X.HjH r2 = r4.A0D
            if (r2 == 0) goto L91
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "collection_"
            r1.append(r0)
            X.JIP r0 = r2.A00
            X.H2J r0 = (X.H2J) r0
            com.instagram.api.schemas.AudioBrowserCollectionType r0 = r0.A00
            java.lang.String r0 = X.AbstractC166997dE.A0v(r0, r1)
            goto Lb
        L78:
            int r0 = r0.intValue()
            goto L5
        L7d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        L82:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        L87:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        L8c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38061Goo.A01():java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, X.HjH] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.IvU] */
    public final void A02() {
        Integer num;
        Boolean Cer;
        TrackDataImpl trackDataImpl = this.A08;
        if (trackDataImpl != null) {
            this.A0H = new C37964Gn6(trackDataImpl);
        }
        OriginalSoundData originalSoundData = this.A05;
        if (originalSoundData != null) {
            this.A0F = new C42733IvT(originalSoundData);
        }
        OriginalSoundData originalSoundData2 = this.A06;
        if (originalSoundData2 != null) {
            this.A0I = new C42733IvT(originalSoundData2);
        }
        H2I h2i = this.A02;
        MusicSearchPlaylistType musicSearchPlaylistType = null;
        if (h2i != null) {
            this.A0B = new MusicSearchArtist(h2i);
        }
        C38070Goz c38070Goz = this.A07;
        if (c38070Goz != null) {
            this.A0E = new MusicSearchPlaylist(c38070Goz);
        }
        C38690H2b c38690H2b = this.A04;
        if (c38690H2b != null) {
            ?? obj = new Object();
            obj.A00 = c38690H2b;
            this.A0C = obj;
        }
        H2J h2j = this.A03;
        if (h2j != null) {
            ?? obj2 = new Object();
            obj2.A00 = h2j;
            this.A0D = obj2;
        }
        C37964Gn6 c37964Gn6 = this.A0H;
        if (c37964Gn6 != null) {
            TrackMetadata trackMetadata = this.A09;
            if (trackMetadata != null && (Cer = trackMetadata.Cer()) != null) {
                c37964Gn6.A02 = Cer.booleanValue();
            }
            c37964Gn6.A00 = this.A0A;
        }
        if (A00() != null) {
            num = C05F.A01;
        } else if (this.A01 != null) {
            num = C05F.A0C;
        } else if (this.A00 != null) {
            num = C05F.A0N;
        } else {
            MusicSearchPlaylist musicSearchPlaylist = this.A0E;
            if (musicSearchPlaylist != null) {
                List Bfr = musicSearchPlaylist.A00().Bfr();
                if (Bfr != null && !Bfr.isEmpty()) {
                    MusicSearchPlaylist musicSearchPlaylist2 = this.A0E;
                    if (musicSearchPlaylist2 != null) {
                        musicSearchPlaylistType = musicSearchPlaylist2.A01();
                    }
                    if (musicSearchPlaylistType == MusicSearchPlaylistType.A02) {
                        num = C05F.A0Y;
                    } else {
                        num = C05F.A0j;
                    }
                } else {
                    num = C05F.A0u;
                }
            } else if (this.A0C != null) {
                num = C05F.A15;
            } else if (this.A0D != null) {
                num = C05F.A1I;
            } else if (this.A0B != null) {
                num = C05F.A1F;
            } else {
                num = C05F.A00;
            }
        }
        this.A0G = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
            return C14360o3.A0K(A01(), ((C38061Goo) obj).A01());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{A01()});
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.IvU] */
    public C38061Goo(InterfaceC43511JJx interfaceC43511JJx) {
        C14360o3.A0B(interfaceC43511JJx, 1);
        JM8 Be5 = interfaceC43511JJx.Be5();
        if (Be5 != null) {
            this.A0E = new MusicSearchPlaylist(Be5);
        }
        InterfaceC43529JKp AmX = interfaceC43511JJx.AmX();
        if (AmX != null) {
            ?? obj = new Object();
            obj.A00 = AmX;
            this.A0C = obj;
        }
        A02();
    }

    public C38061Goo() {
    }
}
