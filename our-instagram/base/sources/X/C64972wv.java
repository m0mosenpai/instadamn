package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.2wv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64972wv {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C64982ww A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final String A0F;
    public final String A0G;

    public final C41625IbF A01(C38321qM c38321qM, ProductTile productTile) {
        String str;
        C14360o3.A0B(productTile, 0);
        FBProductItemDetailsDict A01 = AbstractC41709Idf.A01(productTile);
        if (A01 != null) {
            return new C41625IbF(A01, c38321qM, this);
        }
        Product product = productTile.A07;
        if (product != null) {
            User user = product.A0B;
            if (user != null) {
                str = AbstractC76433bn.A00(user);
            } else {
                str = null;
            }
            return new C41625IbF(c38321qM, this, product, str);
        }
        throw new Error("productTile must have a nonnull product");
    }

    public final C41625IbF A02(Product product, String str) {
        return new C41625IbF(null, this, product, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x03d0, code lost:
    
        if (r9 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0297, code lost:
    
        if (r9 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0299, code lost:
    
        r1 = new X.C0Zx();
        r1.A06("search_session_id", r9);
        r13.AAQ(r1, X.AbstractC111324zv.A00(3087));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ac, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ae, code lost:
    
        r13.AAQ(null, "channel_logging_info");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [X.Gxa, X.0Zx] */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.Gxa, X.0Zx] */
    /* JADX WARN: Type inference failed for: r15v2, types: [X.Gxa, X.0Zx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.EnumC77213d7 r38, X.C41625IbF r39, X.C64972wv r40) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64972wv.A00(X.3d7, X.IbF, X.2wv):void");
    }

    public C64972wv(Context context, FragmentActivity fragmentActivity, RankingInfo rankingInfo, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A0C = str;
        this.A0F = str2;
        this.A0G = str3;
        this.A0D = z;
        this.A0A = str4;
        this.A07 = str5;
        this.A09 = str6;
        this.A05 = num;
        this.A0E = z2;
        this.A06 = str7;
        this.A08 = str8;
        this.A0B = str9;
        this.A04 = new C64982ww(rankingInfo, userSession, interfaceC60442pS, str2, str3, str);
    }
}
