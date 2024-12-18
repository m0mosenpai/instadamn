package X;

import android.app.Activity;
import android.os.Parcelable;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3mZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82713mZ implements InterfaceC82723ma {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public long A0b;
    public long A0c;
    public EnumC130265uW A0d;
    public EnumC39643HiY A0e;
    public EnumC46291KeN A0f;
    public C9BB A0g;
    public InterfaceC104784ni A0h;
    public ProductReviewStatus A0i;
    public C11520jB A0j;
    public C11520jB A0k;
    public C11520jB A0l;
    public C11520jB A0m;
    public C11520jB A0n;
    public C11520jB A0o;
    public C11520jB A0p;
    public C11520jB A0q;
    public C11520jB A0r;
    public C11520jB A0s;
    public C11520jB A0t;
    public C11520jB A0u;
    public C82413m5 A0v;
    public C125225lT A0w;
    public ProductCollectionLinkIntf A0x;
    public ProfileShopLinkIntf A0y;
    public ReelMultiProductLinkIntf A0z;
    public ReelProductLink A10;
    public SearchContext A11;
    public C130935vh A12;
    public Boolean A13;
    public Boolean A14;
    public Boolean A15;
    public Boolean A16;
    public Boolean A17;
    public Boolean A18;
    public Boolean A19;
    public Boolean A1A;
    public Boolean A1B;
    public Boolean A1C;
    public Boolean A1D;
    public Boolean A1E;
    public Boolean A1F;
    public Boolean A1G;
    public Boolean A1H;
    public Boolean A1I;
    public Boolean A1J;
    public Boolean A1K;
    public Boolean A1L;
    public Boolean A1M;
    public Boolean A1N;
    public Boolean A1O;
    public Boolean A1P;
    public Boolean A1Q;
    public Boolean A1R;
    public Boolean A1S;
    public Boolean A1T;
    public Boolean A1U;
    public Boolean A1V;
    public Boolean A1W;
    public Boolean A1X;
    public Boolean A1Y;
    public Boolean A1Z;
    public Boolean A1a;
    public Boolean A1b;
    public Boolean A1c;
    public Boolean A1d;
    public Boolean A1e;
    public Boolean A1f;
    public Boolean A1g;
    public Boolean A1h;
    public Boolean A1i;
    public Boolean A1j;
    public Boolean A1k;
    public Boolean A1l;
    public Boolean A1m;
    public Boolean A1n;
    public Boolean A1o;
    public Boolean A1p;
    public Boolean A1q;
    public Boolean A1r;
    public Boolean A1s;
    public Boolean A1t;
    public Boolean A1u;
    public Boolean A1v;
    public Boolean A1w;
    public Boolean A1x;
    public Boolean A1y;
    public Boolean A1z;
    public Boolean A20;
    public Boolean A21;
    public Boolean A22;
    public Boolean A23;
    public Boolean A24;
    public Boolean A25;
    public Boolean A26;
    public Boolean A27;
    public Boolean A28;
    public Boolean A29;
    public Boolean A2A;
    public Boolean A2B;
    public Boolean A2C;
    public Boolean A2D;
    public Boolean A2E;
    public Boolean A2F;
    public Boolean A2G;
    public Boolean A2H;
    public Boolean A2I;
    public Double A2J;
    public Double A2K;
    public Double A2L;
    public Double A2M;
    public Double A2N;
    public Double A2O;
    public Double A2P;
    public Double A2Q;
    public Double A2R;
    public Double A2S;
    public Double A2T;
    public Double A2U;
    public Double A2V;
    public Double A2W;
    public Double A2X;
    public Double A2Y;
    public Double A2Z;
    public Double A2a;
    public Double A2b;
    public Double A2c;
    public Double A2d;
    public Double A2e;
    public Double A2f;
    public Float A2g;
    public Float A2h;
    public Float A2i;
    public Float A2j;
    public Float A2k;
    public Float A2l;
    public Float A2m;
    public Float A2n;
    public Float A2o;
    public Float A2p;
    public Integer A2q;
    public Integer A2r;
    public Integer A2s;
    public Integer A2t;
    public Integer A2u;
    public Integer A2v;
    public Integer A2w;
    public Integer A2x;
    public Integer A2y;
    public Integer A2z;
    public Integer A30;
    public Integer A31;
    public Integer A32;
    public Integer A33;
    public Integer A34;
    public Integer A35;
    public Integer A36;
    public Integer A37;
    public Integer A38;
    public Integer A39;
    public Integer A3A;
    public Integer A3B;
    public Integer A3C;
    public Integer A3D;
    public Integer A3E;
    public Integer A3F;
    public Integer A3G;
    public Integer A3H;
    public Integer A3I;
    public Integer A3J;
    public Integer A3K;
    public Integer A3L;
    public Long A3M;
    public Long A3N;
    public Long A3O;
    public Long A3P;
    public Long A3Q;
    public Long A3R;
    public Long A3S;
    public Long A3T;
    public Long A3U;
    public Long A3V;
    public Long A3W;
    public Long A3X;
    public Long A3Y;
    public Long A3Z;
    public Long A3a;
    public Long A3b;
    public Long A3c;
    public Long A3d;
    public Long A3e;
    public Long A3f;
    public Long A3g;
    public Long A3h;
    public Long A3i;
    public Long A3j;
    public Long A3k;
    public Long A3l;
    public Long A3m;
    public Long A3n;
    public Long A3o;
    public Long A3p;
    public Long A3q;
    public Long A3r;
    public Long A3s;
    public Long A3t;
    public Long A3u;
    public Long A3v;
    public Long A3w;
    public Long A3x;
    public Long A3y;
    public Long A3z;
    public Long A40;
    public Long A41;
    public Long A42;
    public Long A43;
    public Long A44;
    public Long A45;
    public Long A46;
    public Long A47;
    public Long A48;
    public Long A49;
    public Long A4A;
    public Long A4B;
    public Long A4C;
    public Long A4D;
    public Long A4E;
    public Long A4F;
    public Long A4G;
    public Long A4H;
    public Long A4I;
    public Long A4J;
    public Long A4K;
    public Long A4L;
    public Long A4M;
    public String A4N;
    public String A4O;
    public String A4P;
    public String A4Q;
    public String A4R;
    public String A4S;
    public String A4T;
    public String A4U;
    public String A4V;
    public String A4W;
    public String A4X;
    public String A4Y;
    public String A4Z;
    public String A4a;
    public String A4b;
    public String A4c;
    public String A4d;
    public String A4e;
    public String A4f;
    public String A4g;
    public String A4h;
    public String A4i;
    public String A4j;
    public String A4k;
    public String A4l;
    public String A4m;
    public String A4n;
    public String A4o;
    public String A4p;
    public String A4q;
    public String A4r;
    public String A4s;
    public String A4t;
    public String A4u;
    public String A4v;
    public String A4w;
    public String A4x;
    public String A4y;
    public String A4z;
    public String A50;
    public String A51;
    public String A52;
    public String A53;
    public String A54;
    public String A55;
    public String A56;
    public String A57;
    public String A58;
    public String A59;
    public String A5A;
    public String A5B;
    public String A5C;
    public String A5D;
    public String A5E;
    public String A5F;
    public String A5G;
    public String A5H;
    public String A5I;
    public String A5J;
    public String A5K;
    public String A5L;
    public String A5M;
    public String A5N;
    public String A5O;
    public String A5P;
    public String A5Q;
    public String A5R;
    public String A5S;
    public String A5T;
    public String A5U;
    public String A5V;
    public String A5W;
    public String A5X;
    public String A5Y;
    public String A5Z;
    public String A5a;
    public String A5b;
    public String A5c;
    public String A5d;
    public String A5e;
    public String A5f;
    public String A5g;
    public String A5h;
    public String A5i;
    public String A5j;
    public String A5k;
    public String A5l;
    public String A5m;
    public String A5n;
    public String A5o;
    public String A5p;
    public String A5q;
    public String A5r;
    public String A5s;
    public String A5t;
    public String A5u;
    public String A5v;
    public String A5w;
    public String A5x;
    public String A5y;
    public String A5z;
    public String A60;
    public String A61;
    public String A62;
    public String A63;
    public String A64;
    public String A65;
    public String A66;
    public String A67;
    public String A68;
    public String A69;
    public String A6A;
    public String A6B;
    public String A6C;
    public String A6D;
    public String A6E;
    public String A6F;
    public String A6G;
    public String A6H;
    public String A6I;
    public String A6J;
    public String A6K;
    public String A6L;
    public String A6M;
    public String A6N;
    public String A6O;
    public String A6P;
    public String A6Q;
    public String A6R;
    public String A6S;
    public String A6T;
    public String A6U;
    public String A6V;
    public String A6W;
    public String A6X;
    public String A6Y;
    public String A6Z;
    public String A6a;
    public String A6b;
    public String A6c;
    public String A6d;
    public String A6e;
    public String A6f;
    public String A6g;
    public String A6h;
    public String A6i;
    public String A6j;
    public String A6k;
    public String A6l;
    public String A6m;
    public String A6n;
    public String A6o;
    public String A6p;
    public String A6q;
    public String A6r;
    public String A6s;
    public String A6t;
    public String A6u;
    public String A6v;
    public String A6w;
    public String A6x;
    public String A6y;
    public String A6z;
    public String A70;
    public String A71;
    public String A72;
    public String A73;
    public String A74;
    public String A75;
    public String A76;
    public String A77;
    public String A78;
    public String A79;
    public String A7A;
    public String A7B;
    public String A7C;
    public String A7D;
    public String A7E;
    public String A7F;
    public String A7G;
    public String A7H;
    public String A7I;
    public String A7J;
    public String A7K;
    public String A7L;
    public String A7M;
    public String A7N;
    public String A7O;
    public String A7P;
    public String A7Q;
    public String A7R;
    public String A7S;
    public String A7T;
    public String A7U;
    public String A7V;
    public String A7W;
    public String A7X;
    public String A7Y;
    public String A7Z;
    public ArrayList A7a;
    public ArrayList A7b;
    public ArrayList A7c;
    public ArrayList A7d;
    public ArrayList A7e;
    public ArrayList A7f;
    public ArrayList A7g;
    public ArrayList A7h;
    public ArrayList A7i;
    public ArrayList A7j;
    public ArrayList A7k;
    public ArrayList A7l;
    public ArrayList A7m;
    public HashMap A7n;
    public List A7o;
    public List A7p;
    public List A7q;
    public List A7r;
    public List A7s;
    public List A7t;
    public List A7u;
    public List A7v;
    public List A7w;
    public List A7x;
    public List A7y;
    public List A7z;
    public List A80;
    public List A81;
    public List A82;
    public List A83;
    public List A84;
    public List A85;
    public List A86;
    public List A87;
    public List A88;
    public List A89;
    public List A8A;
    public List A8B;
    public List A8C;
    public Map A8D;
    public Map A8E;
    public Map A8F;
    public Map A8G;
    public Map A8H;
    public boolean A8I;
    public boolean A8J;
    public int A8K;
    public int A8L;
    public long A8M;
    public C11520jB A8N;
    public Hashtag A8O;
    public C5HA A8P;
    public Product A8Q;
    public Boolean A8R;
    public Boolean A8S;
    public Boolean A8T;
    public Boolean A8U;
    public Boolean A8V;
    public Boolean A8W;
    public Boolean A8X;
    public Double A8Y;
    public Double A8Z;
    public Double A8a;
    public Integer A8b;
    public Long A8c;
    public Long A8d;
    public Long A8e;
    public Long A8f;
    public Long A8g;
    public Long A8h;
    public Long A8i;
    public Long A8j;
    public Long A8k;
    public Long A8l;
    public Long A8m;
    public Long A8n;
    public Long A8o;
    public Long A8p;
    public Long A8q;
    public String A8r;
    public String A8s;
    public String A8t;
    public String A8u;
    public ArrayList A8v;
    public List A8w;
    public List A8x;
    public List A8y;
    public final InterfaceC60442pS A8z;
    public final String A90;
    public final C5H9 A91;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C82713mZ(InterfaceC60442pS interfaceC60442pS, String str) {
        this(null, interfaceC60442pS, str);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
    }

    public final void A02() {
        this.A8X = true;
    }

    public final void A05(float f, float f2, float f3, float f4, float f5) {
        this.A2W = Double.valueOf(f);
        this.A2V = Double.valueOf(f2);
        this.A8a = Double.valueOf(f5);
        this.A8Z = Double.valueOf(f3);
        this.A8Y = Double.valueOf(f4);
    }

    public final void A06(int i) {
        this.A8c = Long.valueOf(i);
    }

    public final void A07(int i) {
        this.A8d = Long.valueOf(i);
    }

    public final void A08(int i) {
        this.A8e = Long.valueOf(i);
    }

    public final void A09(int i) {
        this.A8k = Long.valueOf(i);
    }

    public final void A0A(int i) {
        this.A3t = Long.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(com.instagram.api.schemas.IntentAwareAdsInfoIntf r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L77
            java.lang.Integer r0 = r4.BVJ()
        L7:
            java.lang.Integer r0 = X.C71113Gx.A00(r0)
            if (r0 == 0) goto L14
            int r0 = r0.intValue()
            switch(r0) {
                case 2: goto L75;
                case 3: goto L75;
                case 4: goto L75;
                case 5: goto L75;
                case 6: goto L14;
                case 7: goto L75;
                case 8: goto L75;
                case 9: goto L75;
                case 10: goto L75;
                default: goto L14;
            }
        L14:
            r0 = 0
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A1h = r0
            if (r4 == 0) goto L73
            java.lang.String r0 = r4.BIG()
        L21:
            r3.A6A = r0
            if (r4 == 0) goto L71
            java.lang.Boolean r0 = r4.CcZ()
        L29:
            r3.A1x = r0
            if (r4 == 0) goto L6f
            java.lang.String r0 = r4.BVC()
        L31:
            r3.A68 = r0
            if (r4 == 0) goto L6d
            java.lang.Integer r0 = r4.BVJ()
            if (r0 == 0) goto L6d
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L44:
            r3.A3s = r0
            if (r4 == 0) goto L6b
            java.lang.String r0 = r4.BVL()
        L4c:
            r3.A6B = r0
            if (r4 == 0) goto L69
            java.lang.String r0 = r4.BVL()
        L54:
            r3.A69 = r0
            if (r4 == 0) goto L67
            java.lang.String r0 = r4.Brx()
        L5c:
            r3.A5g = r0
            if (r4 == 0) goto L64
            java.lang.String r2 = r4.CB4()
        L64:
            r3.A5q = r2
            return
        L67:
            r0 = r2
            goto L5c
        L69:
            r0 = r2
            goto L54
        L6b:
            r0 = r2
            goto L4c
        L6d:
            r0 = r2
            goto L44
        L6f:
            r0 = r2
            goto L31
        L71:
            r0 = r2
            goto L29
        L73:
            r0 = r2
            goto L21
        L75:
            r0 = 1
            goto L15
        L77:
            r0 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82713mZ.A0D(com.instagram.api.schemas.IntentAwareAdsInfoIntf):void");
    }

    public final void A0F(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (this.A8s == null && C18U.A06(C06090Tz.A05, userSession, 36314575552973530L)) {
            this.A8s = AbstractC12380kg.A00(C19360xL.A00().A03());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02f7, code lost:
    
        if (X.AbstractC75373a4.A07(r12) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0460, code lost:
    
        if (r0 != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e4, code lost:
    
        if (r7.isEmpty() != false) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029a  */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(com.instagram.common.session.UserSession r12, X.C38321qM r13) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82713mZ.A0G(com.instagram.common.session.UserSession, X.1qM):void");
    }

    public final void A0K(UserSession userSession, C40971v4 c40971v4) {
        C14360o3.A0B(c40971v4, 1);
        A0I(userSession, null, c40971v4);
    }

    public final void A0N(EnumC40111tc enumC40111tc) {
        C14360o3.A0B(enumC40111tc, 0);
        this.A8K = enumC40111tc.A00;
        this.A8t = enumC40111tc.name();
    }

    public final C19280xC A00() {
        C5H9 c5h9 = this.A91;
        if (c5h9 != null) {
            c5h9.A8X(this, this.A8z, this.A90);
        }
        C19280xC A00 = C19280xC.A00(this.A8z, this.A90);
        A00.A04(A01().A00());
        if (C14360o3.A0K(this.A8X, true)) {
            A00.A07.add(EnumC11440j2.A07);
        }
        return A00;
    }

    public final void A03() {
        this.A8i = 24L;
    }

    public final void A04(float f, float f2, float f3) {
        C11520jB c11520jB = this.A0m;
        if (c11520jB == null) {
            c11520jB = new C11520jB();
            this.A0m = c11520jB;
        }
        c11520jB.A04(C5I8.A7q, Double.valueOf(f));
        C11520jB c11520jB2 = this.A0m;
        if (c11520jB2 != null) {
            c11520jB2.A04(C5I8.A7p, Double.valueOf(f2));
        }
        C11520jB c11520jB3 = this.A0m;
        if (c11520jB3 != null) {
            c11520jB3.A04(C5I8.A7o, Double.valueOf(f3));
        }
    }

    public final void A0E(C11520jB c11520jB) {
        if (c11520jB != null) {
            C11520jB c11520jB2 = this.A8N;
            if (c11520jB2 != null) {
                c11520jB2.A06(c11520jB);
            } else {
                this.A8N = c11520jB;
            }
        }
    }

    public final void A0J(UserSession userSession, InterfaceC38371qR interfaceC38371qR) {
        if (interfaceC38371qR instanceof C40971v4) {
            A0K(userSession, (C40971v4) interfaceC38371qR);
        } else {
            A0G(userSession, interfaceC38371qR.BQN());
        }
    }

    public final void A0L(C38321qM c38321qM) {
        MoreInfoType BUy;
        InterfaceC87803vo BUx = c38321qM.A0C.BUx();
        if (BUx != null) {
            C11520jB c11520jB = this.A0s;
            if (c11520jB == null) {
                c11520jB = new C11520jB();
            }
            this.A0s = c11520jB;
            InterfaceC107114sH BDB = BUx.BDB();
            if ((BDB != null || (BDB = BUx.B7j()) != null || (BDB = BUx.B20()) != null) && (BUy = BDB.BUy()) != null) {
                C11520jB c11520jB2 = this.A0s;
                if (c11520jB2 != null) {
                    c11520jB2.A04(C5I8.A8B, Long.valueOf(BUy.ordinal()));
                }
                C11520jB c11520jB3 = this.A0s;
                if (c11520jB3 != null) {
                    c11520jB3.A04(C5I8.A8C, BUy.name());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r3.A0U == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(X.C105824pt r3) {
        /*
            r2 = this;
            com.instagram.user.model.User r0 = r3.A09
            r0.getClass()
            java.lang.String r0 = r0.getId()
            r2.A4Q = r0
            java.lang.String r0 = r3.A0e
            r0.getClass()
            r2.A61 = r0
            long r0 = r3.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A8p = r0
            X.4va r0 = r3.A06
            if (r0 != 0) goto L22
            X.4va r0 = X.EnumC109104va.A0E
        L22:
            boolean r1 = r0.A01()
            if (r1 == 0) goto L96
            X.1tc r0 = X.EnumC40111tc.A0M
        L2a:
            int r0 = r0.A00
            r2.A8K = r0
            if (r1 == 0) goto L93
            X.1tc r0 = X.EnumC40111tc.A0M
        L32:
            java.lang.String r0 = r0.name()
            r2.A8t = r0
            X.2pS r0 = r2.A8z
            java.lang.String r0 = r0.getModuleName()
            r2.A74 = r0
            com.instagram.user.model.User r0 = r3.A09
            r0.getClass()
            com.instagram.user.model.FollowStatus r0 = r0.B7L()
            java.lang.String r0 = X.AbstractC38851rI.A06(r0)
            r2.A5P = r0
            X.4va r0 = r3.A06
            if (r0 != 0) goto L55
            X.4va r0 = X.EnumC109104va.A0E
        L55:
            boolean r1 = r0.A01()
            r0 = r1 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A8W = r0
            if (r1 != 0) goto L68
            java.lang.Long r1 = r3.A0U
            r0 = 1
            if (r1 != 0) goto L69
        L68:
            r0 = 0
        L69:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A8V = r0
            java.util.Set r0 = r3.A06()
            X.C14360o3.A07(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L92
            java.util.Set r0 = r3.A06()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            r2.A4q = r0
        L92:
            return
        L93:
            X.1tc r0 = X.EnumC40111tc.A0L
            goto L32
        L96:
            X.1tc r0 = X.EnumC40111tc.A0L
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82713mZ.A0M(X.4pt):void");
    }

    public final void A0O(C40861ut c40861ut) {
        if (c40861ut != null) {
            this.A3o = Long.valueOf(c40861ut.A07());
            this.A3p = Long.valueOf(c40861ut.A08());
            this.A3m = Long.valueOf(c40861ut.A01());
            this.A3n = Long.valueOf(c40861ut.A02());
            this.A3g = Long.valueOf(c40861ut.A03());
            this.A8m = Long.valueOf(c40861ut.A04());
            this.A3q = Long.valueOf(c40861ut.A06());
            this.A2a = Double.valueOf(c40861ut.A00());
        }
    }

    public final void A0P(Float f, Float f2) {
        C11520jB c11520jB = this.A0m;
        if (c11520jB == null) {
            c11520jB = new C11520jB();
            this.A0m = c11520jB;
        }
        if (f2 != null && f != null) {
            c11520jB.A04(C5I8.A5J, Double.valueOf(f.floatValue()));
            C11520jB c11520jB2 = this.A0m;
            if (c11520jB2 != null) {
                c11520jB2.A04(C5I8.A5e, Double.valueOf(f2.floatValue()));
            }
        }
    }

    public final void A0Q(Integer num) {
        Long l;
        if (num != null) {
            l = Long.valueOf(num.intValue());
        } else {
            l = null;
        }
        this.A8f = l;
    }

    public final void A0R(Integer num) {
        Long l;
        if (num != null) {
            l = Long.valueOf(num.intValue());
        } else {
            l = null;
        }
        this.A8g = l;
    }

    public final void A0S(Integer num) {
        Long l;
        if (num != null) {
            l = Long.valueOf(num.intValue());
        } else {
            l = null;
        }
        this.A8h = l;
    }

    public final void A0T(Integer num) {
        if (num != null) {
            this.A8j = Long.valueOf(num.intValue());
        }
    }

    public final void A0U(Integer num) {
        Long l;
        if (num != null) {
            l = Long.valueOf(num.intValue());
        } else {
            l = null;
        }
        this.A8l = l;
    }

    public final void A0V(List list) {
        List list2;
        if (list != null) {
            list2 = AbstractC001800i.A0a(list);
        } else {
            list2 = null;
        }
        this.A7y = list2;
    }

    public final void A0W(List list) {
        C11520jB c11520jB = this.A0m;
        if (c11520jB == null) {
            c11520jB = new C11520jB();
            this.A0m = c11520jB;
        }
        if (list != null) {
            C11500j9 c11500j9 = C5I8.A0s;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                C11520jB c11520jB2 = new C11520jB();
                c11520jB2.A04(C5I8.A0t, (Serializable) map.get("token"));
                C11500j9 c11500j92 = C5I8.A0r;
                String str = (String) map.get("category");
                if (str == null) {
                    str = "";
                }
                c11520jB2.A04(c11500j92, str);
                arrayList.add(c11520jB2);
            }
            c11520jB.A05(c11500j9, new ArrayList(arrayList));
        }
    }

    public final void A0X(List list) {
        if (list != null && (!list.isEmpty())) {
            this.A8y = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                double doubleValue = ((Number) it.next()).doubleValue();
                List list2 = this.A8y;
                if (list2 != null) {
                    list2.add(String.valueOf(doubleValue));
                }
            }
        }
    }

    public final void A0Y(Map map) {
        C11520jB c11520jB = this.A0m;
        if (c11520jB == null) {
            c11520jB = new C11520jB();
            this.A0m = c11520jB;
        }
        c11520jB.A0D(map);
    }

    public final void A0B(long j) {
        this.A8o = Long.valueOf(j);
    }

    public final void A0C(Activity activity, AbstractC12990ll abstractC12990ll) {
        int i;
        ArrayList arrayList;
        C72603Nh c72603Nh = (C72603Nh) C55772hI.A00(abstractC12990ll).A0L.get(activity.toString());
        if (c72603Nh != null) {
            i = c72603Nh.A00;
        } else {
            i = -1;
        }
        this.A8L = i;
        C72603Nh c72603Nh2 = (C72603Nh) C55772hI.A00(abstractC12990ll).A0L.get(activity.toString());
        if (c72603Nh2 != null) {
            arrayList = new ArrayList();
            LinkedList linkedList = c72603Nh2.A01;
            int size = linkedList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Map map = (Map) linkedList.get(i2);
                C11520jB c11520jB = new C11520jB();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (!C14360o3.A0K(str, "instance_id")) {
                        c11520jB.A0A(str, str2);
                    }
                }
                arrayList.add(c11520jB);
            }
        } else {
            arrayList = null;
        }
        this.A8w = arrayList;
    }

    public final void A0H(UserSession userSession, C38321qM c38321qM, ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf, ProductLaunchInformation productLaunchInformation, Boolean bool, String str, String str2) {
        FollowStatus followStatus;
        long j;
        A0F(userSession);
        this.A6b = str;
        this.A4c = str2;
        this.A65 = str2;
        this.A8S = bool;
        if (bool != null && bool.booleanValue() && productCheckoutPropertiesIntf != null) {
            this.A8b = productCheckoutPropertiesIntf.BJM();
        }
        if (productLaunchInformation != null) {
            Long BMJ = productLaunchInformation.BMJ();
            if (BMJ != null) {
                j = BMJ.longValue();
            } else {
                j = 0;
            }
            this.A8M = j;
            this.A8R = productLaunchInformation.BBz();
        }
        if (c38321qM != null) {
            User A2E = c38321qM.A2E(userSession);
            this.A61 = c38321qM.getId();
            A0N(c38321qM.BRp());
            String str3 = null;
            if (A2E != null) {
                followStatus = A2E.B7L();
            } else {
                followStatus = null;
            }
            Parcelable.Creator creator = User.CREATOR;
            this.A5P = AbstractC38851rI.A06(followStatus);
            this.A7j = c38321qM.A3S(true);
            if (A2E != null) {
                str3 = A2E.getId();
            }
            this.A63 = str3;
            this.A1b = Boolean.valueOf(!C14360o3.A0K(str3, str2));
        }
    }

    public final void A0I(UserSession userSession, C38321qM c38321qM, C40971v4 c40971v4) {
        String organicTrackingToken;
        A0F(userSession);
        if (c38321qM == null) {
            c38321qM = c40971v4.A0K;
        }
        A0G(userSession, c38321qM);
        this.A4T = c40971v4.A0S;
        if (this.A8z.isSponsoredEligible()) {
            organicTrackingToken = c40971v4.A0j;
        } else {
            organicTrackingToken = c38321qM.A0C.getOrganicTrackingToken();
        }
        this.A7Q = organicTrackingToken;
        this.A8q = Long.valueOf(C77403dQ.A00.A06(userSession, c38321qM).size());
        if (this.A0m == null) {
            this.A0m = new C11520jB();
        }
        C11520jB c11520jB = this.A0s;
        if (c11520jB == null) {
            c11520jB = new C11520jB();
        }
        this.A0s = c11520jB;
        C11520jB c11520jB2 = this.A0l;
        if (c11520jB2 == null) {
            c11520jB2 = new C11520jB();
        }
        this.A0l = c11520jB2;
    }

    @Override // X.InterfaceC82723ma
    public final /* bridge */ /* synthetic */ Object Ed9(float f, float f2, float f3, float f4, float f5) {
        A05(f, f2, f3, f4, f5);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:265:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0bb0  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0c1f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0c33  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0c61  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0c71  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c81  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0ca6  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0cbb  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0ce9  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0d51  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0df0  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0ea1  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0eaa  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0eb3  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0ed1  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0f02  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0f0b  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0f1b  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0f43  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0f55  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0f89  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0fce  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0ff4  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x1021  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x1026  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x1036  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x10dd  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x10eb  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x1129  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x11c2  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x11f4  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x1212  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1228  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x126e  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x1356  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x135f  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x1368  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x1371  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x137c  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x1385  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x138e  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x1410  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x1432  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x1440  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x1481  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x148c  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x14b6  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x162a  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x163a  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x164a  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x1263  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x1114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11520jB A01() {
        /*
            Method dump skipped, instructions count: 5794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82713mZ.A01():X.0jB");
    }

    public C82713mZ(C5H9 c5h9, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A90 = str;
        this.A8z = interfaceC60442pS;
        this.A91 = c5h9;
        this.A0V = -1;
        this.A8K = -1;
        this.A07 = -1;
        this.A0F = -1;
        this.A0Z = -1;
        this.A01 = -1.0d;
        this.A8L = -1;
        this.A00 = -1.0d;
        this.A0N = -1;
        this.A0Q = -1;
        this.A0L = -1;
        this.A8M = -1L;
        this.A0U = -1;
        this.A0A = -1;
        this.A0B = -1;
        this.A0b = -1L;
        this.A0c = -1L;
        this.A0a = -1;
        this.A05 = -1.0f;
        this.A06 = -1.0f;
        this.A04 = -1.0f;
        this.A0M = -1;
        this.A02 = -1.0d;
        this.A08 = -1;
        this.A0G = -1;
        this.A0I = -1;
        this.A0H = -1;
        this.A0J = -1;
        this.A0W = -1;
        this.A03 = -1.0d;
        this.A0Y = -1;
        this.A0K = -1;
        this.A0X = -1;
        this.A0O = -1;
        this.A0P = -1;
        this.A0D = -1;
        this.A0C = -1;
        this.A0E = -1;
        this.A0S = -1;
        this.A0R = -1;
        this.A0T = -1;
        this.A09 = -1;
        this.A28 = false;
        this.A27 = false;
        this.A2z = C05F.A0C;
    }
}
