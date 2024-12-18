package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.5HW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5HW {
    public int A00;
    public C35023Fbw A01;
    public C38321qM A02;
    public C5Hd A05;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public HashSet A0F;
    public C5HX A04 = new C5HX();
    public Integer A06 = C05F.A15;
    public C5HY A03 = new C5HY();
    public Integer A07 = C05F.A00;

    public final boolean equals(Object obj) {
        C5HW c5hw;
        String str;
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass() || ((str = (c5hw = (C5HW) obj).A09) != null && !str.equals(this.A09))) {
                return false;
            }
            String str2 = c5hw.A0D;
            if (str2 != null && !str2.equals(this.A0D)) {
                return false;
            }
            C5HY c5hy = c5hw.A03;
            if (c5hy != null && !c5hy.equals(this.A03)) {
                return false;
            }
        }
        return true;
    }

    public final long A00() {
        return ((Number) this.A04.A1G.getValue()).longValue();
    }

    public final ImageUrl A01() {
        return (ImageUrl) this.A04.A19.getValue();
    }

    public final HashtagImpl A02() {
        C5HX c5hx = this.A04;
        C5HX c5hx2 = c5hx;
        HashtagImpl hashtagImpl = c5hx.A02;
        if (hashtagImpl == null) {
            return null;
        }
        if (c5hx.A01 != null) {
            C69730VuP c69730VuP = new C69730VuP(hashtagImpl);
            c5hx2 = this.A04;
            c69730VuP.A00 = c5hx2.A01;
            c5hx.A02 = c69730VuP.A01();
        }
        return c5hx2.A02;
    }

    public final EnumC31336Dq1 A03() {
        return (EnumC31336Dq1) this.A04.A1D.getValue();
    }

    public final User A04() {
        C206289Bl c206289Bl = this.A04.A08;
        if (c206289Bl != null) {
            return (User) c206289Bl.A02;
        }
        return null;
    }

    public final Double A05() {
        return Double.valueOf(((Number) this.A04.A1H.getValue()).doubleValue());
    }

    public final String A06() {
        return (String) this.A04.A15.getValue();
    }

    public final String A07() {
        return (String) this.A04.A17.getValue();
    }

    public final String A08() {
        C121695fL c121695fL = this.A04.A0I;
        if (c121695fL != null) {
            return c121695fL.A0I;
        }
        return null;
    }

    public final String A09(String str) {
        return (String) ((Map) this.A04.A1E.getValue()).get(str);
    }

    public final String A0A(String str) {
        return (String) ((Map) this.A04.A13.getValue()).get(str);
    }

    public final String A0B(String str) {
        return (String) ((Map) this.A04.A16.getValue()).get(str);
    }

    public final HashSet A0C() {
        String A09;
        if (this.A05 == C5Hd.BUNDLE_WITH_ICON && A0F() && (A09 = A09("associated_story_pks")) != null) {
            try {
                JSONArray jSONArray = new JSONArray(A09);
                HashSet hashSet = new HashSet(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                this.A0F = hashSet;
            } catch (JSONException unused) {
            }
        }
        return this.A0F;
    }

    public final Map A0D() {
        C121695fL c121695fL = this.A04.A0I;
        if (c121695fL != null) {
            return (Map) c121695fL.A0L.getValue();
        }
        return Collections.emptyMap();
    }

    public final void A0E() {
        C5HX c5hx = this.A04;
        if (c5hx.A03 != null) {
            c5hx.A03 = true;
        }
    }

    public final boolean A0F() {
        if (this.A04.A1D.getValue() == null) {
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        Boolean bool = this.A04.A04;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A0H() {
        if (EnumC31336Dq1.A1H != this.A04.A1D.getValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0I() {
        C31200Dnj c31200Dnj = this.A04.A0B;
        if (c31200Dnj == null) {
            return false;
        }
        return "unseen".equals(c31200Dnj.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A09, this.A0D});
    }
}
