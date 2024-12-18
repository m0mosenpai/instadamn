package X;

import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicDataSource;
import java.util.List;

/* loaded from: classes7.dex */
public final class HYM extends AbstractC39658Hin {
    public AudioPageMetadata A00;
    public final ImageUrl A01;
    public final MusicDataSource A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HYM) {
                HYM hym = (HYM) obj;
                if (!C14360o3.A0K(this.A07, hym.A07) || !C14360o3.A0K(this.A09, hym.A09) || !C14360o3.A0K(this.A0A, hym.A0A) || !C14360o3.A0K(this.A0B, hym.A0B) || !C14360o3.A0K(this.A01, hym.A01) || this.A0E != hym.A0E || this.A0G != hym.A0G || !C14360o3.A0K(this.A02, hym.A02) || !C14360o3.A0K(this.A0C, hym.A0C) || !C14360o3.A0K(this.A00, hym.A00) || !C14360o3.A0K(this.A04, hym.A04) || !C14360o3.A0K(this.A05, hym.A05) || !C14360o3.A0K(this.A03, hym.A03) || this.A0D != hym.A0D || !C14360o3.A0K(this.A08, hym.A08) || !C14360o3.A0K(this.A06, hym.A06) || this.A0F != hym.A0F) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0F, (((AbstractC167007dF.A0D(this.A0D, (((((AbstractC166997dE.A0J(this.A00, (AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0E, AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A09, AbstractC166987dD.A0J(this.A07))) + AbstractC167017dG.A0O(this.A0B)) * 31)))) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC25227BEk.A07(this.A06)) * 31);
    }

    public HYM(AudioPageMetadata audioPageMetadata, ImageUrl imageUrl, MusicDataSource musicDataSource, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167027dH.A13(str, str2, str3);
        C14360o3.A0B(imageUrl, 5);
        this.A07 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A01 = imageUrl;
        this.A0E = z;
        this.A0G = z2;
        this.A02 = musicDataSource;
        this.A0C = list;
        this.A00 = audioPageMetadata;
        this.A04 = num;
        this.A05 = num2;
        this.A03 = num3;
        this.A0D = z3;
        this.A08 = str5;
        this.A06 = str6;
        this.A0F = z4;
    }
}
