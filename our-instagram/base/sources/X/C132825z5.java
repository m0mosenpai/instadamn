package X;

import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.5z5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132825z5 {
    public H7P A00;
    public C38321qM A01;
    public EnumC39565Hdb A02;
    public User A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C132825z5)) {
            return false;
        }
        C132825z5 c132825z5 = (C132825z5) obj;
        return C2I7.A00(this.A07, c132825z5.A07) && C2I7.A00(this.A02, c132825z5.A02) && C2I7.A00(this.A03, c132825z5.A03) && C2I7.A00(this.A08, c132825z5.A08) && C2I7.A00(this.A06, c132825z5.A06) && C2I7.A00(this.A01, c132825z5.A01) && C2I7.A00(this.A00, c132825z5.A00) && C2I7.A00(this.A04, c132825z5.A04) && C2I7.A00(Boolean.valueOf(this.A09), Boolean.valueOf(c132825z5.A09)) && C2I7.A00(this.A05, c132825z5.A05) && C2I7.A00(Boolean.valueOf(this.A0A), Boolean.valueOf(c132825z5.A0A)) && C2I7.A00(Boolean.valueOf(this.A0B), Boolean.valueOf(c132825z5.A0B));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A02, this.A03, this.A08, this.A06, this.A01, this.A00, this.A04, Boolean.valueOf(this.A09), this.A05, Boolean.valueOf(this.A0A), Boolean.valueOf(this.A0B)});
    }
}
