package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64372vw {
    public final C57112jm A00;
    public final C64392vy A01;
    public final C64392vy A02;
    public final C64432w2 A03;
    public final C64442w3 A04;
    public final C64402vz A05;
    public final C64402vz A06;

    public static final String A00(JPV jpv) {
        StringBuilder sb = new StringBuilder();
        sb.append("afi_");
        sb.append(jpv.B5n());
        sb.append('_');
        sb.append(jpv.getId());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.2vy, X.2vb] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.2w0, X.2vz] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2vy, X.2vb] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2w0, X.2vz] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.2vb, X.2w2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.2w3, X.2w0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.2t9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.2t9] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.2t9] */
    public C64372vw(UserSession userSession, C57112jm c57112jm) {
        this.A00 = c57112jm;
        C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A00;
        C14360o3.A07(c1bx);
        this.A01 = new AbstractC64162vb(c1bx, new Object());
        this.A06 = new AbstractC64412w0(0L, 0.5f);
        C1BX c1bx2 = AbstractC62712tA.A00(userSession).A00.A00;
        C14360o3.A07(c1bx2);
        this.A03 = new AbstractC64162vb(c1bx2, new Object());
        this.A04 = new AbstractC64412w0(0L, 0.5f);
        C1BX c1bx3 = AbstractC62712tA.A00(userSession).A00.A00;
        C14360o3.A07(c1bx3);
        this.A02 = new AbstractC64162vb(c1bx3, new Object());
        this.A05 = new AbstractC64412w0(0L, 0.5f);
    }
}
