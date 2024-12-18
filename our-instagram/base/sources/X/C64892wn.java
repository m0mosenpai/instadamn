package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.2wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64892wn {
    public final C57112jm A00;
    public final C63622uj A01;
    public final C64922wq A02;
    public final C64942ws A03;

    public final void A01(View view, InterfaceC99144cb interfaceC99144cb, String str) {
        C14360o3.A0B(interfaceC99144cb, 1);
        C14360o3.A0B(str, 2);
        C63622uj c63622uj = this.A01;
        String A0R = AnonymousClass001.A0R(interfaceC99144cb.getId(), str);
        C14360o3.A07(A0R);
        this.A00.A05(view, c63622uj.A00(A0R));
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.HjO, java.lang.Object] */
    public final void A02(ProductFeedItem productFeedItem, IJ0 ij0, String str) {
        C14360o3.A0B(str, 1);
        ?? obj = new Object();
        obj.A00 = productFeedItem;
        obj.A01 = str;
        C63622uj c63622uj = this.A01;
        String Byk = ij0.A02.Byk();
        String A0R = AnonymousClass001.A0R("product_pivot_impression_", productFeedItem.getId());
        if (Byk != null) {
            A0R = AnonymousClass001.A0T(A0R, Byk, '_');
        }
        String A0R2 = AnonymousClass001.A0R("product_pivot_impression_", productFeedItem.getId());
        if (Byk != null) {
            A0R2 = AnonymousClass001.A0T(A0R2, Byk, '_');
        }
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(obj, ij0, A0R2);
        c59072n8.A00(this.A03);
        c63622uj.A01(c59072n8.A01(), A0R);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.HjP, java.lang.Object] */
    public final void A03(InterfaceC99144cb interfaceC99144cb, String str, int i) {
        C14360o3.A0B(str, 1);
        ?? obj = new Object();
        obj.A00 = interfaceC99144cb;
        obj.A01 = str;
        C63622uj c63622uj = this.A01;
        String A0R = AnonymousClass001.A0R(interfaceC99144cb.getId(), str);
        C14360o3.A07(A0R);
        Integer valueOf = Integer.valueOf(i);
        String A0R2 = AnonymousClass001.A0R(obj.A00.getId(), obj.A01);
        C14360o3.A07(A0R2);
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(obj, valueOf, A0R2);
        c59072n8.A00(this.A02);
        c63622uj.A01(c59072n8.A01(), A0R);
    }

    public C64892wn(UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8 = str4;
        String str9 = str;
        C14360o3.A0B(c57112jm, 1);
        C14360o3.A0B(userSession, 3);
        this.A00 = c57112jm;
        this.A01 = new C63622uj();
        C64902wo c64902wo = new C64902wo(userSession, interfaceC60442pS, str9, str3, str8, str5, str6, str7, i);
        C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A00;
        C14360o3.A07(c1bx);
        this.A02 = new C64922wq(c1bx, new InterfaceC62702t9() { // from class: X.2wp
            @Override // X.InterfaceC62702t9
            public final String BKe(C59062n7 c59062n7) {
                C14360o3.A0B(c59062n7, 0);
                C39693HjP c39693HjP = (C39693HjP) c59062n7.A03;
                String A0R = AnonymousClass001.A0R(c39693HjP.A00.getId(), c39693HjP.A01);
                C14360o3.A07(A0R);
                return A0R;
            }
        }, c64902wo);
        str9 = str == null ? "" : str9;
        C1BX c1bx2 = AbstractC62712tA.A00(userSession).A00.A00;
        C14360o3.A07(c1bx2);
        this.A03 = new C64942ws(c1bx2, userSession, new InterfaceC62702t9() { // from class: X.2wr
            @Override // X.InterfaceC62702t9
            public final String BKe(C59062n7 c59062n7) {
                C14360o3.A0B(c59062n7, 0);
                C39692HjO c39692HjO = (C39692HjO) c59062n7.A03;
                return AnonymousClass001.A0T(c39692HjO.A00.getId(), c39692HjO.A01, '_');
            }
        }, interfaceC60442pS, str9 == null ? "" : str9, str2, str4 == null ? "" : str8, str5, str6, str7, i);
    }

    public final void A00(View view, ProductFeedItem productFeedItem, String str) {
        C63622uj c63622uj = this.A01;
        String A0R = AnonymousClass001.A0R("product_pivot_impression_", productFeedItem.getId());
        if (str != null) {
            A0R = AnonymousClass001.A0T(A0R, str, '_');
        }
        this.A00.A05(view, c63622uj.A00(A0R));
    }
}
