package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.model.reels.ReelType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* renamed from: X.Jx6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45077Jx6 extends C0T6 {
    public boolean A00;
    public final MediaComposition A01;
    public final ACRType A02;
    public final SmartReelType A03;
    public final InterfaceC43521JKh A04;
    public final ReelType A05;
    public final AudioOverlayTrack A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45077Jx6) {
                C45077Jx6 c45077Jx6 = (C45077Jx6) obj;
                if (!C14360o3.A0K(this.A08, c45077Jx6.A08) || this.A02 != c45077Jx6.A02 || !C14360o3.A0K(this.A07, c45077Jx6.A07) || !C14360o3.A0K(this.A0A, c45077Jx6.A0A) || !C14360o3.A0K(this.A0B, c45077Jx6.A0B) || this.A03 != c45077Jx6.A03 || this.A05 != c45077Jx6.A05 || !C14360o3.A0K(this.A04, c45077Jx6.A04) || !C14360o3.A0K(this.A09, c45077Jx6.A09) || !C14360o3.A0K(this.A0C, c45077Jx6.A0C) || !C14360o3.A0K(this.A01, c45077Jx6.A01) || !C14360o3.A0K(this.A06, c45077Jx6.A06) || !C14360o3.A0K(this.A0D, c45077Jx6.A0D)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A08)) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC166997dE.A0I(this.A0D);
    }

    public C45077Jx6(MediaComposition mediaComposition, ACRType aCRType, SmartReelType smartReelType, InterfaceC43521JKh interfaceC43521JKh, ReelType reelType, AudioOverlayTrack audioOverlayTrack, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        AbstractC167017dG.A1P(str, aCRType);
        this.A08 = str;
        this.A02 = aCRType;
        this.A07 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A03 = smartReelType;
        this.A05 = reelType;
        this.A04 = interfaceC43521JKh;
        this.A09 = str5;
        this.A0C = list;
        this.A01 = mediaComposition;
        this.A06 = audioOverlayTrack;
        this.A0D = list2;
    }
}
