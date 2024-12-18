package X;

import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.NoteChatResponseInfo;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import java.util.List;

/* renamed from: X.KQt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45838KQt extends AbstractC46435Kgv {
    public final GIFNoteResponseInfo A00;
    public final ListeningNowResponseInfo A01;
    public final LocationNoteResponseInfo A02;
    public final MusicNoteResponseInfo A03;
    public final NoteChatResponseInfo A04;
    public final NotePogImageDict A05;
    public final NotePogVideoDict A06;
    public final C68B A07;
    public final C6C9 A08;
    public final ImageUrl A09;
    public final NoteAudienceItem A0A;
    public final Boolean A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final int A0L;
    public final LiveNoteResponseInfo A0M;

    public C45838KQt(GIFNoteResponseInfo gIFNoteResponseInfo, ListeningNowResponseInfo listeningNowResponseInfo, LiveNoteResponseInfo liveNoteResponseInfo, LocationNoteResponseInfo locationNoteResponseInfo, MusicNoteResponseInfo musicNoteResponseInfo, NoteChatResponseInfo noteChatResponseInfo, NotePogImageDict notePogImageDict, NotePogVideoDict notePogVideoDict, C68B c68b, C6C9 c6c9, ImageUrl imageUrl, NoteAudienceItem noteAudienceItem, Boolean bool, String str, String str2, String str3, String str4, List list, List list2, List list3, int i, boolean z, boolean z2) {
        C14360o3.A0B(str, 3);
        C14360o3.A0B(str4, 18);
        C14360o3.A0B(list, 19);
        C14360o3.A0B(list2, 21);
        C14360o3.A0B(list3, 22);
        this.A08 = c6c9;
        this.A09 = imageUrl;
        this.A0C = str;
        this.A0L = i;
        this.A0A = noteAudienceItem;
        this.A0J = z;
        this.A03 = musicNoteResponseInfo;
        this.A02 = locationNoteResponseInfo;
        this.A0M = liveNoteResponseInfo;
        this.A01 = listeningNowResponseInfo;
        this.A00 = gIFNoteResponseInfo;
        this.A06 = notePogVideoDict;
        this.A05 = notePogImageDict;
        this.A0E = str2;
        this.A0F = str3;
        this.A0B = bool;
        this.A04 = noteChatResponseInfo;
        this.A0D = str4;
        this.A0I = list;
        this.A07 = c68b;
        this.A0G = list2;
        this.A0H = list3;
        this.A0K = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45838KQt) {
                C45838KQt c45838KQt = (C45838KQt) obj;
                if (!C14360o3.A0K(this.A08, c45838KQt.A08) || !C14360o3.A0K(this.A09, c45838KQt.A09) || !C14360o3.A0K(this.A0C, c45838KQt.A0C) || this.A0L != c45838KQt.A0L || !C14360o3.A0K(this.A0A, c45838KQt.A0A) || this.A0J != c45838KQt.A0J || !C14360o3.A0K(this.A03, c45838KQt.A03) || !C14360o3.A0K(this.A02, c45838KQt.A02) || !C14360o3.A0K(this.A0M, c45838KQt.A0M) || !C14360o3.A0K(this.A01, c45838KQt.A01) || !C14360o3.A0K(this.A00, c45838KQt.A00) || !C14360o3.A0K(this.A06, c45838KQt.A06) || !C14360o3.A0K(this.A05, c45838KQt.A05) || !C14360o3.A0K(this.A0E, c45838KQt.A0E) || !C14360o3.A0K(this.A0F, c45838KQt.A0F) || !C14360o3.A0K(this.A0B, c45838KQt.A0B) || !C14360o3.A0K(this.A04, c45838KQt.A04) || !C14360o3.A0K(this.A0D, c45838KQt.A0D) || !C14360o3.A0K(this.A0I, c45838KQt.A0I) || !C14360o3.A0K(this.A07, c45838KQt.A07) || !C14360o3.A0K(this.A0G, c45838KQt.A0G) || !C14360o3.A0K(this.A0H, c45838KQt.A0H) || this.A0K != c45838KQt.A0K) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0K, AbstractC166997dE.A0J(this.A0H, AbstractC166997dE.A0J(this.A0G, (AbstractC166997dE.A0J(this.A0I, AbstractC166997dE.A0K(this.A0D, (((((((((((((((((((((AbstractC167007dF.A0D(this.A0J, AbstractC166997dE.A0J(this.A0A, (AbstractC166997dE.A0K(this.A0C, (AbstractC166987dD.A0G(this.A08) + AbstractC167017dG.A0M(this.A09)) * 31) + this.A0L) * 31)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A0M)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31)) + AbstractC166997dE.A0I(this.A07)) * 31)));
    }
}
