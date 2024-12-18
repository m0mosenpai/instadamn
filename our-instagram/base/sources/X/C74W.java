package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.74W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C74W implements C5NL {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;

    public C74W() {
        Integer num = C05F.A00;
        this.A08 = "";
        this.A09 = "";
        this.A07 = null;
        this.A00 = 0.0f;
        this.A02 = 0;
        this.A05 = 0;
        this.A01 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A0A = false;
        this.A06 = num;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A06;
        List singletonList = Collections.singletonList(AnonymousClass001.A0R("gif_sticker_", this.A08));
        C14360o3.A07(singletonList);
        c5ng.A06 = singletonList;
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A01;
    }
}
