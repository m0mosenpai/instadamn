package X;

import com.instagram.api.schemas.AudioBrowserCollectionType;
import java.util.List;

/* loaded from: classes7.dex */
public final class H2J extends C0T6 implements JIP {
    public final AudioBrowserCollectionType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2J) {
                H2J h2j = (H2J) obj;
                if (this.A00 != h2j.A00 || !C14360o3.A0K(this.A01, h2j.A01) || !C14360o3.A0K(this.A04, h2j.A04) || !C14360o3.A0K(this.A02, h2j.A02) || !C14360o3.A0K(this.A03, h2j.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public H2J(AudioBrowserCollectionType audioBrowserCollectionType, String str, String str2, String str3, List list) {
        this.A00 = audioBrowserCollectionType;
        this.A01 = str;
        this.A04 = list;
        this.A02 = str2;
        this.A03 = str3;
    }
}
