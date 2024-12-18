package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.47O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47O implements C47P, C47Q {
    public ImageUrl A00;
    public ExtendedImageUrl A01;
    public C115895Mf A02;
    public User A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public Reel A0E;
    public final C47M A0F;

    @Override // X.C47P
    public final Reel BlO(UserSession userSession) {
        C37771pE c37771pE;
        C115895Mf c115895Mf = this.A02;
        if (c115895Mf != null) {
            c37771pE = c115895Mf.A02;
        } else {
            c37771pE = null;
        }
        Reel reel = this.A0E;
        if (reel == null && c37771pE != null) {
            Reel A0I = C1OU.A04(userSession).A0I(c37771pE, false);
            this.A0E = A0I;
            return A0I;
        }
        return reel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
                C47O c47o = (C47O) obj;
                if (!C14360o3.A0K(this.A03, c47o.A03) || (this.A03 == null && c47o.A03 != null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A00() {
        boolean z = false;
        if (this.A03.getId().length() == 0) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("The user object is null. uuid: [%s], algorithm: [%s]", this.A08, this.A04);
            C14360o3.A07(formatStrLocaleSafe);
            C0w9.A03("RecommendedUser", formatStrLocaleSafe);
            return;
        }
        if (this.A03.B7L() == FollowStatus.A08 || this.A03.B7L() == FollowStatus.A04) {
            this.A03.A0k(FollowStatus.A06);
        }
        User user = this.A03;
        if (user.B7L() == FollowStatus.A05) {
            z = true;
        }
        user.A0z(z);
        this.A03.A10(this.A0C);
        this.A0B = true;
    }

    @Override // X.C47P
    public final String ByJ() {
        return this.A05;
    }

    @Override // X.C47Q
    public final C47R C3q() {
        return C47R.A0A;
    }

    @Override // X.C47P
    public final String C9e() {
        return this.A07;
    }

    @Override // X.C47P
    public final User CDj() {
        return this.A03;
    }

    @Override // X.C47P
    public final String CEI() {
        return this.A08;
    }

    @Override // X.C47P
    public final String getAlgorithm() {
        return this.A04;
    }

    @Override // X.C17D
    public final String getId() {
        return this.A03.getId();
    }

    @Override // X.C47P
    public final ImmutableList getSocialContextFacepileUsers() {
        List list = this.A0A;
        if (list == null) {
            return null;
        }
        return ImmutableList.copyOf((Collection) list);
    }

    public final int hashCode() {
        User user = this.A03;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.A03.getId();
    }

    public C47O(C47M c47m) {
        boolean z;
        String str;
        C115895Mf c115895Mf;
        List list;
        List list2;
        String str2;
        C47F c47f;
        User user;
        Boolean bool;
        String str3;
        String str4;
        Boolean bool2;
        this.A0F = c47m;
        boolean z2 = false;
        if (c47m != null && (bool2 = c47m.A07) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.A0D = z;
        ExtendedImageUrl extendedImageUrl = null;
        if (c47m != null) {
            str = c47m.A0B;
        } else {
            str = null;
        }
        String str5 = "";
        this.A04 = str == null ? "" : str;
        this.A08 = (c47m == null || (str4 = c47m.A0I) == null) ? "" : str4;
        if (c47m != null && (str3 = c47m.A0H) != null) {
            str5 = str3;
        }
        this.A05 = str5;
        if (c47m != null) {
            c115895Mf = c47m.A03;
        } else {
            c115895Mf = null;
        }
        this.A02 = c115895Mf;
        if (c47m != null && (bool = c47m.A05) != null) {
            z2 = bool.booleanValue();
        }
        this.A0C = z2;
        if (c47m != null) {
            list = c47m.A0L;
        } else {
            list = null;
        }
        this.A09 = list;
        this.A03 = (c47m == null || (user = c47m.A04) == null) ? new User() : user;
        if (c47m != null) {
            list2 = c47m.A0M;
        } else {
            list2 = null;
        }
        this.A0A = list2;
        if (c47m != null) {
            str2 = c47m.A0F;
        } else {
            str2 = null;
        }
        this.A07 = str2;
        if (c47m != null && (c47f = c47m.A02) != null) {
            extendedImageUrl = new ExtendedImageUrl(c47f.getUrl(), c47f.getWidth(), c47f.getHeight());
        }
        this.A01 = extendedImageUrl;
        if (c47m != null) {
            A00();
        }
    }

    public C47O() {
        this(null);
    }
}
