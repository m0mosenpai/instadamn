package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.JVu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43735JVu {
    public C44920JuY A00;
    public String A01;
    public final C83403nh A02;
    public final C2ED A03;
    public final DirectThreadKey A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public C43735JVu(C44920JuY c44920JuY, C83403nh c83403nh, C2ED c2ed, Integer num, String str) {
        String A0h;
        String str2;
        C14360o3.A0B(str, 3);
        if (c83403nh.A1S()) {
            A0h = c83403nh.A0g();
        } else {
            A0h = c83403nh.A0h();
        }
        this.A08 = A0h;
        this.A02 = c83403nh;
        this.A03 = c2ed;
        this.A04 = c2ed.BKb();
        this.A0A = str;
        this.A07 = num;
        this.A06 = Boolean.valueOf(c83403nh.A2P);
        this.A05 = Boolean.valueOf(c83403nh.A1T());
        this.A0B = c83403nh.A1u;
        this.A00 = c44920JuY;
        this.A09 = c83403nh.A1h;
        if (c83403nh.A1S()) {
            str2 = c83403nh.A0g();
        } else {
            str2 = c83403nh.A1j;
        }
        this.A01 = str2;
    }

    public C43735JVu(C83403nh c83403nh, DirectThreadKey directThreadKey, Integer num, String str) {
        String A0h;
        String str2;
        C14360o3.A0B(str, 3);
        if (c83403nh.A1S()) {
            A0h = c83403nh.A0g();
        } else {
            A0h = c83403nh.A0h();
        }
        this.A08 = A0h;
        this.A02 = c83403nh;
        this.A03 = null;
        this.A04 = directThreadKey;
        this.A0A = str;
        this.A07 = num;
        this.A06 = Boolean.valueOf(c83403nh.A2P);
        this.A05 = Boolean.valueOf(c83403nh.A1T());
        this.A0B = c83403nh.A1u;
        this.A00 = null;
        this.A09 = c83403nh.A1h;
        if (c83403nh.A1S()) {
            str2 = c83403nh.A0g();
        } else {
            str2 = c83403nh.A1j;
        }
        this.A01 = str2;
    }

    public C43735JVu(DirectThreadKey directThreadKey, Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str2, 3);
        this.A08 = str;
        this.A02 = null;
        this.A03 = null;
        this.A04 = directThreadKey;
        this.A0A = str2;
        this.A07 = num;
        this.A06 = bool;
        this.A05 = bool2;
        this.A0B = str3;
        this.A09 = str4;
        this.A01 = str;
    }
}
