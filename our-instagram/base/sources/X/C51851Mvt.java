package X;

import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Mvt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51851Mvt extends C0T6 implements InterfaceC58258Ps2 {
    public final MediaKitVisibility A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    public C51851Mvt(MediaKitVisibility mediaKitVisibility, User user, String str, String str2, String str3, String str4, List list, boolean z) {
        AbstractC167007dF.A1G(list, 1, user);
        AbstractC167007dF.A1I(str4, 7, mediaKitVisibility);
        this.A06 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A07 = z;
        this.A01 = user;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = mediaKitVisibility;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51851Mvt) {
                C51851Mvt c51851Mvt = (C51851Mvt) obj;
                if (!C14360o3.A0K(this.A06, c51851Mvt.A06) || !C14360o3.A0K(this.A02, c51851Mvt.A02) || !C14360o3.A0K(this.A03, c51851Mvt.A03) || this.A07 != c51851Mvt.A07 || !C14360o3.A0K(this.A01, c51851Mvt.A01) || !C14360o3.A0K(this.A04, c51851Mvt.A04) || !C14360o3.A0K(this.A05, c51851Mvt.A05) || this.A00 != c51851Mvt.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A05, (AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A07, (((AbstractC166987dD.A0G(this.A06) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31)) + AbstractC25227BEk.A07(this.A04)) * 31));
    }
}
