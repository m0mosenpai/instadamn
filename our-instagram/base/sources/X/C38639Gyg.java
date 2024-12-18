package X;

import com.instagram.music.common.model.MusicDataSource;
import java.util.List;

/* renamed from: X.Gyg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38639Gyg extends C0T6 {
    public final float A00;
    public final InterfaceC88553xD A01;
    public final MusicDataSource A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final String A06;
    public final List A07;

    public C38639Gyg(InterfaceC88553xD interfaceC88553xD, MusicDataSource musicDataSource, Integer num, String str, List list, float f, boolean z, boolean z2) {
        C14360o3.A0B(list, 3);
        this.A01 = interfaceC88553xD;
        this.A06 = str;
        this.A07 = list;
        this.A03 = num;
        this.A02 = musicDataSource;
        this.A05 = z;
        this.A00 = f;
        this.A04 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38639Gyg) {
                C38639Gyg c38639Gyg = (C38639Gyg) obj;
                if (!C14360o3.A0K(this.A01, c38639Gyg.A01) || !C14360o3.A0K(this.A06, c38639Gyg.A06) || !C14360o3.A0K(this.A07, c38639Gyg.A07) || !C14360o3.A0K(this.A03, c38639Gyg.A03) || !C14360o3.A0K(this.A02, c38639Gyg.A02) || this.A05 != c38639Gyg.A05 || Float.compare(this.A00, c38639Gyg.A00) != 0 || this.A04 != c38639Gyg.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC166997dE.A00(AbstractC167007dF.A0D(this.A05, (((AbstractC166997dE.A0J(this.A07, ((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31), this.A00));
    }
}
