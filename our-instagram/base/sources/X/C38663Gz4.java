package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* renamed from: X.Gz4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38663Gz4 extends C0T6 {
    public Integer A00;
    public final int A01;
    public final C26123Bh8 A02;
    public final ClipsACRMidCardSubType A03;
    public final ClipsMidCardSubtype A04;
    public final InstagramMidcardType A05;
    public final C26136BhN A06;
    public final C26143BhU A07;
    public final C38786H6b A08;
    public final InterfaceC88553xD A09;
    public final AudioOverlayTrack A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38663Gz4) {
                C38663Gz4 c38663Gz4 = (C38663Gz4) obj;
                if (!C14360o3.A0K(this.A0D, c38663Gz4.A0D) || !C14360o3.A0K(this.A0H, c38663Gz4.A0H) || this.A01 != c38663Gz4.A01 || !C14360o3.A0K(this.A09, c38663Gz4.A09) || !C14360o3.A0K(this.A0I, c38663Gz4.A0I) || !C14360o3.A0K(this.A0A, c38663Gz4.A0A) || !C14360o3.A0K(this.A0J, c38663Gz4.A0J) || !C14360o3.A0K(this.A0N, c38663Gz4.A0N) || !C14360o3.A0K(this.A0M, c38663Gz4.A0M) || !C14360o3.A0K(this.A08, c38663Gz4.A08) || !C14360o3.A0K(this.A02, c38663Gz4.A02) || !C14360o3.A0K(this.A07, c38663Gz4.A07) || this.A03 != c38663Gz4.A03 || this.A05 != c38663Gz4.A05 || this.A04 != c38663Gz4.A04 || !C14360o3.A0K(this.A0C, c38663Gz4.A0C) || !C14360o3.A0K(this.A0L, c38663Gz4.A0L) || !C14360o3.A0K(this.A06, c38663Gz4.A06) || !C14360o3.A0K(this.A0B, c38663Gz4.A0B) || !C14360o3.A0K(this.A0O, c38663Gz4.A0O) || !C14360o3.A0K(this.A0G, c38663Gz4.A0G) || !C14360o3.A0K(this.A0F, c38663Gz4.A0F) || !C14360o3.A0K(this.A0E, c38663Gz4.A0E) || this.A0K != c38663Gz4.A0K) {
                }
            }
            return false;
        }
        return true;
    }

    public C38663Gz4(C26123Bh8 c26123Bh8, ClipsACRMidCardSubType clipsACRMidCardSubType, ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C26136BhN c26136BhN, C26143BhU c26143BhU, C38786H6b c38786H6b, InterfaceC88553xD interfaceC88553xD, AudioOverlayTrack audioOverlayTrack, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, List list5, List list6, int i, boolean z) {
        AbstractC167017dG.A1P(str, list);
        C14360o3.A0B(instagramMidcardType, 20);
        C14360o3.A0B(clipsMidCardSubtype, 21);
        this.A0D = str;
        this.A0H = list;
        this.A01 = i;
        this.A09 = interfaceC88553xD;
        this.A0I = list2;
        this.A0A = audioOverlayTrack;
        this.A0J = list3;
        this.A0N = str2;
        this.A0M = str3;
        this.A08 = c38786H6b;
        this.A02 = c26123Bh8;
        this.A07 = c26143BhU;
        this.A03 = clipsACRMidCardSubType;
        this.A05 = instagramMidcardType;
        this.A04 = clipsMidCardSubtype;
        this.A0C = str4;
        this.A0L = str5;
        this.A06 = c26136BhN;
        this.A0B = num;
        this.A0O = str6;
        this.A0G = list4;
        this.A0F = list5;
        this.A0E = list6;
        this.A0K = z;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A0K, (((((((((((((((AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A05, (((((((((((((((((((((((AbstractC166997dE.A0J(this.A0H, AbstractC166987dD.A0J(this.A0D)) + this.A01) * 31) + AbstractC53644Nnp.A00()) * 31 * 31) + AbstractC167017dG.A0M(this.A09)) * 31 * 31 * 31 * 31) + AbstractC167017dG.A0M(this.A0I)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A0J)) * 31) + AbstractC167017dG.A0O(this.A0N)) * 31) + AbstractC167017dG.A0O(this.A0M)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31 * 31) + AbstractC167017dG.A0M(this.A03)) * 31)) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0O)) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31);
    }
}
