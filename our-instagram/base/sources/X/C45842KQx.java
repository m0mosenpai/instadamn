package X;

import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import java.util.List;

/* renamed from: X.KQx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45842KQx extends AbstractC46436Kgw {
    public final GIFNoteResponseInfo A00;
    public final LocationNoteResponseInfo A01;
    public final NotePogImageDict A02;
    public final NotePogVideoDict A03;
    public final ImageUrl A04;
    public final ContentNoteMetadata A05;
    public final NoteAudience A06;
    public final C45068Jwx A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final int A0P;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45842KQx) {
                C45842KQx c45842KQx = (C45842KQx) obj;
                if (!C14360o3.A0K(this.A0A, c45842KQx.A0A) || !C14360o3.A0K(this.A0G, c45842KQx.A0G) || !C14360o3.A0K(this.A09, c45842KQx.A09) || !C14360o3.A0K(this.A04, c45842KQx.A04) || !C14360o3.A0K(this.A0B, c45842KQx.A0B) || !C14360o3.A0K(this.A08, c45842KQx.A08) || this.A0P != c45842KQx.A0P || this.A06 != c45842KQx.A06 || !C14360o3.A0K(this.A0F, c45842KQx.A0F) || this.A0L != c45842KQx.A0L || this.A0O != c45842KQx.A0O || this.A0K != c45842KQx.A0K || this.A0J != c45842KQx.A0J || this.A0N != c45842KQx.A0N || this.A0M != c45842KQx.A0M || !C14360o3.A0K(this.A0D, c45842KQx.A0D) || !C14360o3.A0K(this.A0C, c45842KQx.A0C) || !C14360o3.A0K(this.A07, c45842KQx.A07) || !C14360o3.A0K(this.A01, c45842KQx.A01) || !C14360o3.A0K(this.A03, c45842KQx.A03) || !C14360o3.A0K(this.A02, c45842KQx.A02) || !C14360o3.A0K(this.A00, c45842KQx.A00) || !C14360o3.A0K(this.A05, c45842KQx.A05) || this.A0I != c45842KQx.A0I || !C14360o3.A0K(this.A0E, c45842KQx.A0E) || !C14360o3.A0K(this.A0H, c45842KQx.A0H)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A0B, (AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0K(this.A0G, AbstractC166987dD.A0J(this.A0A))) + AbstractC167017dG.A0M(this.A04)) * 31));
        int A00 = AbstractC53644Nnp.A00();
        return ((AbstractC167007dF.A0D(this.A0I, (((((((((((((((((((AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A0O, AbstractC167007dF.A0D(this.A0L, AbstractC166997dE.A0K(this.A0F, AbstractC166997dE.A0J(this.A06, (((A0K + A00) * 31) + this.A0P) * 31)))))))) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + A00) * 31) + A00) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC166997dE.A0I(this.A0H);
    }

    public C45842KQx(GIFNoteResponseInfo gIFNoteResponseInfo, LocationNoteResponseInfo locationNoteResponseInfo, NotePogImageDict notePogImageDict, NotePogVideoDict notePogVideoDict, ImageUrl imageUrl, ContentNoteMetadata contentNoteMetadata, NoteAudience noteAudience, C45068Jwx c45068Jwx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AbstractC167027dH.A13(str, str2, str3);
        AbstractC167017dG.A1T(str4, str5);
        AbstractC25229BEm.A1J(noteAudience, 9, str6);
        this.A0A = str;
        this.A0G = str2;
        this.A09 = str3;
        this.A04 = imageUrl;
        this.A0B = str4;
        this.A08 = str5;
        this.A0P = i;
        this.A06 = noteAudience;
        this.A0F = str6;
        this.A0L = z;
        this.A0O = z2;
        this.A0K = z3;
        this.A0J = z4;
        this.A0N = z5;
        this.A0M = z6;
        this.A0D = str7;
        this.A0C = str8;
        this.A07 = c45068Jwx;
        this.A01 = locationNoteResponseInfo;
        this.A03 = notePogVideoDict;
        this.A02 = notePogImageDict;
        this.A00 = gIFNoteResponseInfo;
        this.A05 = contentNoteMetadata;
        this.A0I = z7;
        this.A0E = str9;
        this.A0H = list;
    }
}
