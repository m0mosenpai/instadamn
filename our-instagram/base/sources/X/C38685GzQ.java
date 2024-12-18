package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import com.instagram.shopping.model.taggingfeed.SourceType;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.GzQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38685GzQ extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38685GzQ(int i) {
        this(4, null, null, null);
        this.A03 = i;
        if (4 - i != 0) {
            this.A03 = 5;
            ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = new ShoppingTaggingFeedHeader("", null, null, false, false, false, false);
            C16930sl c16930sl = C16930sl.A00;
            C38686GzR c38686GzR = new C38686GzR(SourceType.A0E, (String) null, "", "", c16930sl);
            this.A03 = 5;
            C14360o3.A0B(c16930sl, 3);
            this.A00 = shoppingTaggingFeedHeader;
            this.A01 = c38686GzR;
            this.A02 = c16930sl;
            return;
        }
        this.A03 = 4;
    }

    public static String A00(InterfaceC02590Ai interfaceC02590Ai, C38685GzQ c38685GzQ, String str) {
        interfaceC02590Ai.AAP("position", str);
        interfaceC02590Ai.AAP(TraceFieldType.ContentType, String.valueOf(c38685GzQ.A00));
        return String.valueOf(c38685GzQ.A02);
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C38685GzQ) && ((C38685GzQ) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L24;
                case 1: goto L42;
                case 2: goto L3e;
                case 3: goto L5e;
                case 4: goto L7e;
                case 5: goto La3;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto Lce
            r0 = 6
            boolean r0 = A01(r3, r0)
            if (r0 == 0) goto L22
            X.GzQ r3 = (X.C38685GzQ) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 != r0) goto L22
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L22
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L20:
            if (r1 == r0) goto Lce
        L22:
            r0 = 0
            return r0
        L24:
            if (r2 == r3) goto Lce
            r0 = 0
            boolean r0 = A01(r3, r0)
            if (r0 == 0) goto L22
            X.GzQ r3 = (X.C38685GzQ) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L73
        L3e:
            if (r2 == r3) goto Lce
            r0 = 2
            goto La6
        L42:
            if (r2 == r3) goto Lce
            r0 = 1
            boolean r0 = A01(r3, r0)
            if (r0 == 0) goto L22
            X.GzQ r3 = (X.C38685GzQ) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L9e
            goto L22
        L5e:
            if (r2 == r3) goto Lce
            r0 = 3
            boolean r0 = A01(r3, r0)
            if (r0 == 0) goto L22
            X.GzQ r3 = (X.C38685GzQ) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L22
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L73:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L20
        L7e:
            if (r2 == r3) goto Lce
            r0 = 4
            boolean r0 = A01(r3, r0)
            if (r0 == 0) goto L22
            X.GzQ r3 = (X.C38685GzQ) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L9e
            goto L22
        L9e:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto Lc6
        La3:
            if (r2 == r3) goto Lce
            r0 = 5
        La6:
            boolean r0 = A01(r3, r0)
            if (r0 == 0) goto L22
            X.GzQ r3 = (X.C38685GzQ) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        Lc6:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lce
            goto L22
        Lce:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38685GzQ.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0M;
        int hashCode;
        String str;
        Object obj;
        switch (this.A03) {
            case 0:
                A0M = ((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00)) * 31;
                hashCode = this.A02.hashCode();
                break;
            case 1:
                int A0G = AbstractC166987dD.A0G(this.A02);
                int A0H = AbstractC166987dD.A0H(this.A00);
                switch (A0H) {
                    case 1:
                        str = "Loading";
                        break;
                    case 2:
                        str = "Error";
                        break;
                    default:
                        str = "Idle";
                        break;
                }
                A0M = AbstractC25231BEo.A0H(str, A0H, A0G);
                obj = this.A01;
                hashCode = obj.hashCode();
                break;
            case 2:
                hashCode = ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
                A0M = AbstractC166997dE.A0I(this.A02);
                break;
            case 3:
                hashCode = ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
                A0M = AbstractC166997dE.A0I(this.A02);
                break;
            case 4:
                hashCode = ((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
                A0M = AbstractC166997dE.A0I(this.A01);
                break;
            case 5:
                A0M = AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00));
                obj = this.A02;
                hashCode = obj.hashCode();
                break;
            default:
                A0M = AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02));
                hashCode = this.A00.hashCode();
                break;
        }
        return hashCode + A0M;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38685GzQ(X.AbstractC39668Hix r4, java.lang.Integer r5, int r6) {
        /*
            r3 = this;
            r2 = 0
            r0 = 1
            r3.A03 = r0
            r1 = r2
            r0 = r6 & 1
            if (r0 == 0) goto Lb
            X.0sl r1 = X.C16930sl.A00
        Lb:
            r0 = r6 & 2
            if (r0 == 0) goto L11
            java.lang.Integer r5 = X.C05F.A00
        L11:
            r0 = r6 & 4
            if (r0 == 0) goto L1a
            X.HZb r4 = new X.HZb
            r4.<init>(r2)
        L1a:
            r3.<init>(r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38685GzQ.<init>(X.Hix, java.lang.Integer, int):void");
    }

    public C38685GzQ(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = obj2;
        this.A01 = obj3;
    }

    public C38685GzQ(ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType) {
        this.A03 = 6;
        this.A03 = 6;
        C14360o3.A0B(clipsMidCardSubtype, 2);
        BQL bql = BQL.A0r;
        this.A03 = 6;
        this.A02 = instagramMidcardType;
        this.A01 = clipsMidCardSubtype;
        this.A00 = bql;
    }

    public C38685GzQ(AbstractC39668Hix abstractC39668Hix, Integer num, List list) {
        this.A03 = 1;
        AbstractC25233BEq.A0v(1, list, num, abstractC39668Hix);
        this.A02 = list;
        this.A00 = num;
        this.A01 = abstractC39668Hix;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38685GzQ(C38321qM c38321qM, ProductTile productTile, User user, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(4, null, null, null);
        this.A03 = 4;
    }

    public C38685GzQ() {
        this.A03 = 0;
        EnumC39541HdD enumC39541HdD = EnumC39541HdD.A02;
        this.A03 = 0;
        this.A01 = null;
        this.A00 = null;
        this.A02 = enumC39541HdD;
    }
}
