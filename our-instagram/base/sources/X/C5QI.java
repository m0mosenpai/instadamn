package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.5QI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5QI implements C5NL {
    public int A00;
    public int A01;
    public C5NM A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A04;
        List singletonList = Collections.singletonList("timed_sticker_id");
        C14360o3.A07(singletonList);
        c5ng.A06 = singletonList;
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0X;
    }

    public C5QI(C5NL c5nl, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = str4;
        this.A05 = str5;
        this.A02 = new C5NM(c5nl);
    }

    public C5QI() {
    }
}
