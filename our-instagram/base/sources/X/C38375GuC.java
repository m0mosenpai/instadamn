package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import java.util.List;

/* renamed from: X.GuC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38375GuC extends C2UU implements JPm {
    public InterfaceC99144cb A00;
    public IJ0 A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final JPn A05;
    public final Integer A06;
    public final String A07;
    public final List A08;

    public C38375GuC(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC99144cb interfaceC99144cb, JPn jPn, Integer num, String str) {
        C14360o3.A0B(jPn, 4);
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A08 = AbstractC166987dD.A1E();
        this.A05 = jPn;
        this.A07 = str;
        this.A06 = num;
        this.A00 = interfaceC99144cb;
        setHasStableIds(true);
    }

    @Override // X.InterfaceC43418JGi
    public final void D2v(String str, String str2, String str3, int i, int i2) {
        AbstractC167027dH.A12(str, str2, str3);
        this.A05.Bgz().D2v(str, str2, str3, i, i2);
    }

    @Override // X.JII
    public final void Db4(C38675GzG c38675GzG, Product product) {
        C14360o3.A0B(product, 0);
        this.A05.Bgz().Db4(null, product);
    }

    @Override // X.JII
    public final /* synthetic */ void Db5(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
    }

    @Override // X.JII
    public final void Db6(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        C14360o3.A0B(productFeedItem, 0);
        if (c38675GzG != null) {
            IJ0 ij0 = this.A01;
            if (ij0 != null) {
                JPn jPn = this.A05;
                C19260xA c19260xA = (C19260xA) c38675GzG.A01;
                String str = c38675GzG.A00;
                jPn.Db7(c19260xA, productFeedItem, this.A00, str, ij0.A02.Byo(), i, i2, ij0.A01);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JII
    public final /* synthetic */ void Db9(Product product, String str, String str2, int i, int i2) {
    }

    @Override // X.JII
    public final boolean DbA(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final /* synthetic */ void DbB(String str, int i) {
    }

    @Override // X.JII
    public final void DbC(Product product, int i, int i2) {
        C14360o3.A0B(product, 0);
        InterfaceC99144cb interfaceC99144cb = this.A00;
        if (interfaceC99144cb.B60() == EnumC39622HeW.A0O) {
            this.A05.DbD(interfaceC99144cb, new C42901IyF(this, 1), product, i, i2);
        }
    }

    @Override // X.JII
    public final void DbE(C38675GzG c38675GzG, ProductTile productTile, int i, int i2) {
        C14360o3.A0B(productTile, 0);
        IJ0 ij0 = this.A01;
        if (ij0 != null) {
            C42906IyK c42906IyK = new C42906IyK(productTile, this);
            Product product = productTile.A07;
            if (product != null) {
                this.A05.DbF(this.A00, c42906IyK, product, Integer.valueOf(ij0.A01), ij0.A02.Byo(), i, i2);
            }
        }
    }

    @Override // X.JII
    public final boolean DbG(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final void DbH(Product product) {
        C14360o3.A0B(product, 0);
        this.A05.Bgz().DbH(product);
    }

    @Override // X.JII
    public final void DbI(Product product) {
        C14360o3.A0B(product, 0);
        this.A05.Bgz().DbI(product);
    }

    @Override // X.JII
    public final /* synthetic */ void DbJ(String str) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbK(Product product) {
    }

    @Override // X.JHT
    public final void Dw2(UnavailableProduct unavailableProduct, int i, int i2) {
        C14360o3.A0B(unavailableProduct, 0);
        this.A05.Bgz().Dw2(unavailableProduct, i, i2);
    }

    @Override // X.JHT
    public final void Dw3(ProductFeedItem productFeedItem) {
        C14360o3.A0B(productFeedItem, 0);
        A00(this.A08.indexOf(productFeedItem));
        this.A05.Bgz().Dw3(productFeedItem);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        View A07 = AbstractC31175DnJ.A07(LayoutInflater.from(this.A02), viewGroup, R.layout.product_feed_list_item_layout, false);
        Object A0Q = AbstractC37303Gc4.A0Q(A07, new C38498GwJ(A07));
        if (A0Q != null) {
            return (C3OO) A0Q;
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A00(int i) {
        IJ0 ij0;
        List list = this.A08;
        list.remove(i);
        if (list.isEmpty() && (ij0 = this.A01) != null) {
            this.A05.APh(this.A00, ij0.A01);
        }
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, getItemCount());
    }

    public static final void A01(C38375GuC c38375GuC, String str) {
        Product A02;
        List list = c38375GuC.A08;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ProductFeedItem productFeedItem = (ProductFeedItem) list.get(i);
            if (productFeedItem != null && (A02 = productFeedItem.A02()) != null && C14360o3.A0K(A02.A0H, str)) {
                c38375GuC.A00(i);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r10 != X.EnumC39622HeW.A0O) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r24, int r25) {
        /*
            r23 = this;
            r1 = r24
            X.GwJ r1 = (X.C38498GwJ) r1
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r2 = r23
            X.IJ0 r7 = r2.A01
            if (r7 == 0) goto Lc1
            java.util.List r3 = r2.A08
            r5 = r25
            java.lang.Object r9 = r3.get(r5)
            com.instagram.model.shopping.productfeed.ProductFeedItem r9 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r9
            com.instagram.model.shopping.productfeed.ProductTile r3 = r9.A02
            if (r3 == 0) goto L21
            com.instagram.user.model.Product r4 = r3.A07
            r3 = 1
            if (r4 != 0) goto L22
        L21:
            r3 = 0
        L22:
            r11 = 0
            if (r3 == 0) goto Lc2
            com.instagram.user.model.Product r3 = r9.A02()
            if (r3 == 0) goto Lc4
            java.lang.String r6 = r3.A0H
            java.util.Map r3 = r7.A03
            java.lang.Object r4 = r3.get(r6)
            X.IMi r4 = (X.C41219IMi) r4
            if (r4 != 0) goto L44
            X.IMi r4 = new X.IMi
            r4.<init>()
            r3.put(r6, r4)
            java.util.Map r3 = r7.A04
            X.AbstractC37301Gc2.A1T(r6, r3, r5)
        L44:
            X.0xA r8 = new X.0xA
            r8.<init>()
            java.lang.String r6 = "chaining_position"
            int r3 = r7.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            X.C19260xA.A00(r8, r3, r6)
            X.4cb r3 = r7.A02
            java.lang.String r7 = r3.Byk()
            if (r7 == 0) goto L61
            java.lang.String r6 = "m_pk"
            X.C19260xA.A00(r8, r7, r6)
        L61:
            java.lang.String r7 = r3.Byo()
            if (r7 == 0) goto L6c
            java.lang.String r6 = "source_media_type"
            X.C19260xA.A00(r8, r7, r6)
        L6c:
            X.4cb r6 = r2.A00
            X.HeW r10 = r6.B60()
            java.lang.Integer r12 = r2.A06
            com.instagram.api.schemas.ProductCardSubtitleType r7 = r6.Bgq()
            r18 = 1
            java.lang.String r15 = r2.A07
            if (r10 == 0) goto L84
            X.HeW r6 = X.EnumC39622HeW.A0O
            r19 = 1
            if (r10 == r6) goto L86
        L84:
            r19 = 0
        L86:
            X.Gz1 r6 = new X.Gz1
            r13 = r11
            r14 = r11
            r20 = r18
            r21 = r0
            r22 = r0
            r16 = r0
            r17 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.IHJ r0 = new X.IHJ
            r0.<init>(r4, r11, r11)
            X.H79 r4 = new X.H79
            r4.<init>(r6, r0)
            android.content.Context r10 = r2.A02
            X.0iw r11 = r2.A03
            com.instagram.common.session.UserSession r0 = r2.A04
            r12 = r0
            r13 = r2
            r14 = r4
            r15 = r1
            X.I9D.A00(r10, r11, r12, r13, r14, r15)
            com.instagram.model.shopping.productfeed.ProductTile r0 = r9.A02
            if (r0 == 0) goto Lc1
            com.instagram.user.model.Product r0 = r0.A07
            if (r0 == 0) goto Lc1
            X.JPn r2 = r2.A05
            android.view.View r1 = r1.A03
            java.lang.String r0 = r3.Byk()
            r2.EDd(r1, r9, r0)
        Lc1:
            return
        Lc2:
            r4 = r11
            goto L44
        Lc4:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38375GuC.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(505822537);
        int size = this.A08.size();
        C0f9.A0A(-156695709, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(1641598240);
        long hashCode = ((ProductFeedItem) this.A08.get(i)).getId().hashCode();
        C0f9.A0A(2137977173, A03);
        return hashCode;
    }
}
