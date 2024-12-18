package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2x1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65032x1 {
    public final C18920wW A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final C5GU A06;
    public final String A07;
    public final String A08;
    public final String A09;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.3mT] */
    public static final C82653mT A00(C65032x1 c65032x1, Integer num) {
        C5GU c5gu;
        String str = c65032x1.A09;
        String str2 = null;
        if (str == null || (c5gu = c65032x1.A06) == null) {
            return null;
        }
        ?? c0Zx = new C0Zx();
        c0Zx.A06("product_collection_id", str);
        c0Zx.A06("product_collection_type", c5gu.toString());
        if (num != null) {
            str2 = num.toString();
        }
        c0Zx.A06("position", str2);
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.38B] */
    public static final C38B A01(C65032x1 c65032x1) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("prior_module", c65032x1.A07);
        c0Zx.A06("prior_submodule", c65032x1.A08);
        c0Zx.A06("shopping_session_id", c65032x1.A03);
        c0Zx.A06("nav_chain", C1QM.A00.A02.A00);
        return c0Zx;
    }

    public C65032x1(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C5GU c5gu, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = userSession;
        this.A05 = interfaceC60442pS;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = str3;
        this.A01 = str4;
        this.A02 = str5;
        this.A09 = str6;
        this.A06 = c5gu;
        this.A00 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }
}
