package X;

import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.83o, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C83o implements C5NL {
    public float A00;
    public int A01;
    public int A02;
    public C38321qM A03;
    public boolean A04;
    public final float A05;
    public final int A06;
    public final C2GT A07;
    public final C2GS A08;
    public final C88513x8 A09;
    public final User A0A;
    public final User A0B;
    public final String A0C;
    public final boolean A0D;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2GT, X.2GS] */
    public C83o(C88513x8 c88513x8, User user, User user2, String str, float f, float f2, int i, int i2, int i3, boolean z, boolean z2) {
        C14360o3.A0B(user, 1);
        C14360o3.A0B(str, 3);
        this.A0B = user;
        this.A0A = user2;
        this.A0C = str;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = f;
        this.A06 = i3;
        this.A09 = c88513x8;
        this.A04 = z;
        this.A0D = z2;
        this.A00 = f2;
        ?? c2gt = new C2GT(Boolean.valueOf(z));
        this.A08 = c2gt;
        this.A07 = c2gt;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A04;
        List singletonList = Collections.singletonList("clips_reshare_sticker_id");
        C14360o3.A07(singletonList);
        c5ng.A06 = singletonList;
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0Y;
    }
}
