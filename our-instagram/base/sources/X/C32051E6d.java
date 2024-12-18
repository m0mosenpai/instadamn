package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.E6d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32051E6d extends C0T6 {
    public final Activity A00;
    public final RectF A01;
    public final Fragment A02;
    public final UserSession A03;
    public final ImageUrl A04;
    public final C47777L8c A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32051E6d) {
                C32051E6d c32051E6d = (C32051E6d) obj;
                if (!C14360o3.A0K(this.A09, c32051E6d.A09) || !C14360o3.A0K(this.A08, c32051E6d.A08) || !C14360o3.A0K(this.A07, c32051E6d.A07) || !C14360o3.A0K(this.A01, c32051E6d.A01) || !C14360o3.A0K(this.A05, c32051E6d.A05) || !C14360o3.A0K(this.A0C, c32051E6d.A0C) || !C14360o3.A0K(this.A06, c32051E6d.A06) || !C14360o3.A0K(this.A0A, c32051E6d.A0A) || !C14360o3.A0K(this.A04, c32051E6d.A04) || !C14360o3.A0K(this.A0B, c32051E6d.A0B) || !C14360o3.A0K(this.A00, c32051E6d.A00) || !C14360o3.A0K(this.A02, c32051E6d.A02) || !C14360o3.A0K(this.A03, c32051E6d.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((AbstractC166997dE.A0K(this.A08, AbstractC166987dD.A0J(this.A09)) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public C32051E6d(Activity activity, RectF rectF, Fragment fragment, UserSession userSession, ImageUrl imageUrl, C47777L8c c47777L8c, Long l, String str, String str2, String str3, String str4, List list, List list2) {
        this.A09 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A01 = rectF;
        this.A05 = c47777L8c;
        this.A0C = list;
        this.A06 = l;
        this.A0A = str4;
        this.A04 = imageUrl;
        this.A0B = list2;
        this.A00 = activity;
        this.A02 = fragment;
        this.A03 = userSession;
    }
}
