package X;

import com.instagram.feed.audio.AudioIntf;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4G2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4G2 {
    public int A00 = 0;
    public C101674hc A01;
    public C38321qM A02;

    @Deprecated
    public C47Z A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public String A07;
    public String A08;
    public List A09;

    public final Integer A00() {
        C38321qM c38321qM = this.A02;
        if (c38321qM != null && c38321qM.A0C.Add() != null && this.A02.A0C.Add().Azh() != null) {
            return Integer.valueOf(this.A02.A0C.Add().Azh().intValue());
        }
        return this.A04;
    }

    public final Integer A01() {
        int i;
        C38321qM c38321qM = this.A02;
        if (c38321qM != null) {
            AudioIntf Add = c38321qM.A0C.Add();
            Add.getClass();
            Integer CHK = Add.CHK();
            if (CHK != null) {
                i = 1000 / CHK.intValue();
            } else {
                i = 100;
            }
            return Integer.valueOf(i);
        }
        return this.A05;
    }

    public final String A02() {
        C52W c52w;
        C47Z c47z = this.A03;
        if (c47z == null || (c52w = c47z.A1L) == null) {
            return null;
        }
        return c52w.A01;
    }

    public final List A03() {
        C38321qM c38321qM = this.A02;
        if (c38321qM != null) {
            AudioIntf Add = c38321qM.A0C.Add();
            Add.getClass();
            if (Add.CHJ() != null) {
                List unmodifiableList = Collections.unmodifiableList(Add.CHJ());
                C14360o3.A07(unmodifiableList);
                return unmodifiableList;
            }
            Long Azh = Add.Azh();
            if (Azh != null) {
                if (Azh.longValue() < 4500) {
                    return AbstractC27769CMk.A00.subList(0, (int) Math.ceil(r4.size() * (r5 / 4500)));
                }
            }
            return AbstractC27769CMk.A00;
        }
        List list = this.A09;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    public C4G2(C47Z c47z, List list, int i, int i2) {
        C02R.A05(c47z.A1G == EnumC40111tc.A07);
        this.A03 = c47z;
        this.A07 = c47z.A35;
        this.A04 = Integer.valueOf(i);
        this.A09 = list;
        this.A05 = Integer.valueOf(i2);
    }

    public C4G2() {
    }
}
