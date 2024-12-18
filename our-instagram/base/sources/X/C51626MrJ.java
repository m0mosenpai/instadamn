package X;

import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

/* renamed from: X.MrJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51626MrJ extends C0T6 {
    public final EnumC53233NgW A00;
    public final UpcomingEvent A01;
    public final String A02;
    public final Date A03;
    public final Date A04;
    public final boolean A05;
    public final boolean A06;

    public C51626MrJ(EnumC53233NgW enumC53233NgW, UpcomingEvent upcomingEvent, String str, Date date, Date date2, boolean z, boolean z2) {
        C14360o3.A0B(enumC53233NgW, 2);
        this.A01 = upcomingEvent;
        this.A00 = enumC53233NgW;
        this.A02 = str;
        this.A04 = date;
        this.A03 = date2;
        this.A05 = z;
        this.A06 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51626MrJ) {
                C51626MrJ c51626MrJ = (C51626MrJ) obj;
                if (!C14360o3.A0K(this.A01, c51626MrJ.A01) || this.A00 != c51626MrJ.A00 || !C14360o3.A0K(this.A02, c51626MrJ.A02) || !C14360o3.A0K(this.A04, c51626MrJ.A04) || !C14360o3.A0K(this.A03, c51626MrJ.A03) || this.A05 != c51626MrJ.A05 || this.A06 != c51626MrJ.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A05, (((AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0M(this.A01) * 31)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31));
    }
}
