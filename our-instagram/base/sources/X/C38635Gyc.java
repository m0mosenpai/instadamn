package X;

import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.api.schemas.AudioBrowserPlaylistType;

/* renamed from: X.Gyc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38635Gyc extends C0T6 {
    public final int A00;
    public final AudioBrowserCategoryType A01;
    public final AudioBrowserPlaylistType A02;
    public final JIN A03;
    public final C38061Goo A04;
    public final Integer A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38635Gyc) {
                C38635Gyc c38635Gyc = (C38635Gyc) obj;
                if (!C14360o3.A0K(this.A06, c38635Gyc.A06) || !C14360o3.A0K(this.A07, c38635Gyc.A07) || this.A02 != c38635Gyc.A02 || this.A00 != c38635Gyc.A00 || !C14360o3.A0K(this.A04, c38635Gyc.A04) || !C14360o3.A0K(this.A03, c38635Gyc.A03) || this.A05 != c38635Gyc.A05 || this.A01 != c38635Gyc.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C;
        int A0J = (AbstractC166997dE.A0J(this.A04, (((AbstractC166997dE.A0K(this.A07, AbstractC166987dD.A0J(this.A06)) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        Integer num = this.A05;
        if (num == null) {
            A0C = 0;
        } else {
            A0C = AbstractC25230BEn.A0C(num, A1O.A00(num));
        }
        return ((A0J + A0C) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38635Gyc(AudioBrowserCategoryType audioBrowserCategoryType, AudioBrowserPlaylistType audioBrowserPlaylistType, JIN jin, C38061Goo c38061Goo, Integer num, String str, String str2, int i) {
        this.A06 = str;
        this.A07 = str2;
        this.A02 = audioBrowserPlaylistType;
        this.A00 = i;
        this.A04 = c38061Goo;
        this.A03 = jin;
        this.A05 = num;
        this.A01 = audioBrowserCategoryType;
    }
}
