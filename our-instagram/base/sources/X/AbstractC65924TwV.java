package X;

import com.instagram.model.keyword.Keyword;

/* renamed from: X.TwV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65924TwV implements Comparable {
    public int A00;
    public int A01;
    public long A02;
    public String A03;

    public Object A00() {
        if (this instanceof U0v) {
            Object obj = ((U0v) this).A09;
            if (obj == null) {
                C14360o3.A0F("data");
                throw C00O.createAndThrow();
            }
            return obj;
        }
        if (this instanceof C65741TtG) {
            return ((C65741TtG) this).A06();
        }
        if (this instanceof C66130U0o) {
            return ((C66130U0o) this).A01;
        }
        if (this instanceof C68089V9y) {
            return ((C68089V9y) this).A00;
        }
        if (this instanceof HYX) {
            return ((HYX) this).A00;
        }
        if (this instanceof NUN) {
            return ((NUN) this).A00;
        }
        return ((C68090V9z) this).A00;
    }

    public String A01() {
        if (this instanceof C65741TtG) {
            return ((C65741TtG) this).A06().getId();
        }
        if (this instanceof C66130U0o) {
            Keyword keyword = ((C66130U0o) this).A01;
            String str = keyword.A03;
            if (str != null) {
                return str;
            }
            return keyword.A04;
        }
        if (this instanceof HYX) {
            String A05 = ((HYX) this).A00.A00().A05();
            C14360o3.A07(A05);
            return A05;
        }
        if (this instanceof C68090V9z) {
            String str2 = ((C68090V9z) this).A00.A0C;
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            throw AbstractC31172DnG.A0u();
        }
        if (this instanceof C68089V9y) {
            return ((C68089V9y) this).A00;
        }
        if (this instanceof NUN) {
            return ((NUN) this).A00.A00;
        }
        return ((U0v) this).A0A;
    }

    public String A02() {
        if (this instanceof C65741TtG) {
            return ((C65741TtG) this).A06().getUsername();
        }
        if (this instanceof C66130U0o) {
            return ((C66130U0o) this).A01.A04;
        }
        if (this instanceof HYX) {
            return ((HYX) this).A00.A01();
        }
        if (this instanceof C68090V9z) {
            String str = ((C68090V9z) this).A00.A0D;
            if (str != null) {
                return str;
            }
            return "";
        }
        if (this instanceof C68089V9y) {
            return ((C68089V9y) this).A00;
        }
        if (this instanceof NUN) {
            return ((NUN) this).A00.A01;
        }
        return ((U0v) this).A0B;
    }

    public String A03() {
        if (this instanceof C66130U0o) {
            return A01();
        }
        if (this instanceof C65741TtG) {
            return ((C65741TtG) this).A06().getId();
        }
        if (this instanceof C68089V9y) {
            return ((C68089V9y) this).A00;
        }
        if (this instanceof HYX) {
            String A02 = ((HYX) this).A00.A00().A02();
            C14360o3.A07(A02);
            return A02;
        }
        if (this instanceof NUN) {
            return ((NUN) this).A00.A00;
        }
        if (this instanceof C68090V9z) {
            String str = ((C68090V9z) this).A00.A0C;
            if (str != null) {
                return str;
            }
            return "";
        }
        U0v u0v = (U0v) this;
        if (((AbstractC65924TwV) u0v).A01 == 2) {
            C69794Vvd c69794Vvd = u0v.A06;
            if (c69794Vvd == null) {
                return "";
            }
            String A022 = c69794Vvd.A00().A02();
            C14360o3.A07(A022);
            return A022;
        }
        return u0v.A0A;
    }

    public String A04() {
        Integer num;
        if (this instanceof C65741TtG) {
            return "USER";
        }
        if (this instanceof C66130U0o) {
            C66130U0o c66130U0o = (C66130U0o) this;
            if (C14360o3.A0K(c66130U0o.A01.A07, "meta_ai_suggestion")) {
                num = C05F.A0K;
            } else if (c66130U0o.A01.A09) {
                num = C05F.A1F;
            } else {
                num = C05F.A15;
            }
        } else {
            if (this instanceof HYX) {
                return "PLACE";
            }
            if (this instanceof C68089V9y) {
                return "UPSELL";
            }
            if (this instanceof NUN) {
                return "MAP_QUERY";
            }
            if (this instanceof C68090V9z) {
                return "HASHTAG";
            }
            num = ((U0v) this).A08;
            if (num == null) {
                return "null";
            }
        }
        return AbstractC66135U1c.A00(num);
    }

    public boolean A05(String str) {
        String str2;
        if (this instanceof C65741TtG) {
            C65741TtG c65741TtG = (C65741TtG) this;
            C14360o3.A0B(str, 0);
            if (!U12.A03(c65741TtG.A06().getUsername(), str) && !U12.A03(c65741TtG.A06().getFullName(), str)) {
                return false;
            }
            return true;
        }
        if (this instanceof C68089V9y) {
            return false;
        }
        if (this instanceof HYX) {
            C14360o3.A0B(str, 0);
            str2 = ((HYX) this).A00.A01();
        } else if (this instanceof NUN) {
            C14360o3.A0B(str, 0);
            str2 = ((NUN) this).A00.A01;
        } else if (this instanceof C66130U0o) {
            C14360o3.A0B(str, 0);
            str2 = ((C66130U0o) this).A01.A04;
        } else if (this instanceof C68090V9z) {
            C14360o3.A0B(str, 0);
            str2 = ((C68090V9z) this).A00.A0D;
        } else {
            throw new IllegalArgumentException("BlendedSearchEntry doesn't support text matching");
        }
        return U12.A03(str2, str);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC65924TwV abstractC65924TwV = (AbstractC65924TwV) obj;
        C14360o3.A0B(abstractC65924TwV, 0);
        return C14360o3.A01(abstractC65924TwV.A02, this.A02);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC65924TwV)) {
            return false;
        }
        AbstractC65924TwV abstractC65924TwV = (AbstractC65924TwV) obj;
        if (this.A01 != abstractC65924TwV.A01) {
            return false;
        }
        return AbstractC25231BEo.A1Z(A01(), abstractC65924TwV.A01(), false);
    }

    public AbstractC65924TwV(int i) {
        this();
        this.A01 = i;
    }

    public int hashCode() {
        return (A01().hashCode() * 31) + this.A01;
    }

    public AbstractC65924TwV() {
        this.A01 = -1;
        this.A00 = -1;
    }
}
