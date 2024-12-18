package X;

import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.2ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64982ww {
    public final RankingInfo A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Gws, X.0Zx] */
    public static final C38531Gws A00(C38678GzJ c38678GzJ) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("checkout_session_id", c38678GzJ.A02);
        c0Zx.A06(AbstractC111324zv.A00(4513), c38678GzJ.A03);
        c0Zx.A06(AbstractC111324zv.A00(4515), c38678GzJ.A05);
        c0Zx.A06(AbstractC111324zv.A00(4907), c38678GzJ.A06);
        c0Zx.A06(AbstractC111324zv.A00(4909), c38678GzJ.A08);
        String str = c38678GzJ.A04;
        if (str != null) {
            c0Zx.A05(AbstractC111324zv.A00(4514), AbstractC003100w.A0k(10, str));
        }
        String str2 = c38678GzJ.A07;
        if (str2 != null) {
            c0Zx.A05(AbstractC111324zv.A00(4908), AbstractC003100w.A0k(10, str2));
        }
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.3mT] */
    public static final C82653mT A01(C51757Mtg c51757Mtg) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("product_collection_id", c51757Mtg.A02);
        c0Zx.A06("product_collection_type", String.valueOf(c51757Mtg.A01));
        Long l = (Long) c51757Mtg.A00;
        if (l != null) {
            c0Zx.A05("collection_page_id", l);
        }
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.38B] */
    public static final C38B A02(C64982ww c64982ww, String str) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("prior_module", c64982ww.A03);
        c0Zx.A06("prior_submodule", c64982ww.A04);
        c0Zx.A06("shopping_session_id", c64982ww.A05);
        c0Zx.A06("nav_chain", C1QM.A00.A02.A00);
        c0Zx.A06("submodule", str);
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.Gwx] */
    public static final C38536Gwx A03(C9CO c9co) {
        Long l;
        ?? c0Zx = new C0Zx();
        c0Zx.A06("parent_m_pk", c9co.A04);
        Long l2 = null;
        if (((Number) c9co.A02) != null) {
            l = Long.valueOf(r0.intValue());
        } else {
            l = null;
        }
        c0Zx.A05("m_t", l);
        c0Zx.A06("m_pk", c9co.A05);
        c0Zx.A06("source_media_type", c9co.A06);
        if (((Number) c9co.A01) != null) {
            l2 = Long.valueOf(r0.intValue());
        }
        c0Zx.A05("chaining_position", l2);
        c0Zx.A06("chaining_session_id", c9co.A03);
        return c0Zx;
    }

    public C64982ww(RankingInfo rankingInfo, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = rankingInfo;
        this.A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }
}
