package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gu8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38371Gu8 extends C2UU {
    public ProductTileMedia A00;
    public ProductCollection A01;
    public List A02;
    public final Context A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C154796xU A06;
    public final C38321qM A07;
    public final JII A08;
    public final C38642Gyj A09;
    public final C41633IbO A0A;
    public final C41633IbO A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final Map A0G;
    public final Map A0H;
    public final boolean A0I;
    public final C41223IMo A0J;
    public final InterfaceC43444JHi A0K;
    public final Integer A0L;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
    
        if (r11.A0I != false) goto L17;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, X.Gxg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38371Gu8(android.content.Context r12, X.InterfaceC11380iw r13, com.instagram.common.session.UserSession r14, X.C154796xU r15, X.C38321qM r16, X.C41223IMo r17, X.JII r18, X.C38642Gyj r19, X.C41633IbO r20, X.C41633IbO r21, X.InterfaceC43444JHi r22, java.lang.Integer r23, java.lang.String r24, java.lang.String r25, java.util.List r26, boolean r27) {
        /*
            r11 = this;
            r5 = 1
            r3 = r20
            r2 = r21
            X.AbstractC25233BEq.A0y(r5, r12, r3, r2)
            r0 = 15
            r1 = r26
            X.C14360o3.A0B(r1, r0)
            r11.<init>()
            r11.A03 = r12
            r11.A05 = r14
            r11.A04 = r13
            r0 = r16
            r11.A07 = r0
            r0 = r19
            r11.A09 = r0
            r0 = r18
            r11.A08 = r0
            r0 = r22
            r11.A0K = r0
            r11.A0B = r3
            r11.A0A = r2
            r11.A06 = r15
            r0 = r24
            r11.A0C = r0
            r0 = r25
            r11.A0D = r0
            r0 = r23
            r11.A0L = r0
            r0 = r17
            r11.A0J = r0
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()
            r11.A0H = r0
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r11.A0E = r0
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()
            r11.A0G = r0
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r11.A0F = r0
            java.util.Iterator r10 = r1.iterator()
        L5a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r9 = r10.next()
            X.Hdh r9 = (X.EnumC39571Hdh) r9
            int r2 = r9.ordinal()
            r1 = 3
            r0 = 2
            if (r2 == r5) goto Lab
            if (r2 == r0) goto La5
            if (r2 != r1) goto Lb9
            java.lang.Integer r8 = X.C05F.A1I
            r0 = 1
            r7 = 10
        L77:
            r6 = 0
        L78:
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.lang.String r1 = r11.A0D
            boolean r3 = X.I6P.A00(r1)
            r2 = 0
            X.Gxg r1 = new X.Gxg
            r1.<init>()
            r1.A04 = r9
            r1.A06 = r4
            r1.A07 = r3
            r1.A08 = r2
            r1.A02 = r0
            r1.A01 = r2
            r1.A03 = r7
            r1.A00 = r6
            r1.A05 = r8
            java.util.List r0 = r11.A0E
            r0.add(r1)
            java.util.Map r0 = r11.A0G
            r0.put(r9, r1)
            goto L5a
        La5:
            java.lang.Integer r8 = X.C05F.A0Y
            r0 = 1
            r7 = 3
            r6 = 2
            goto L78
        Lab:
            com.instagram.user.model.ProductCollection r0 = r11.A01
            if (r0 != 0) goto Lb4
            boolean r1 = r11.A0I
            r0 = 0
            if (r1 == 0) goto Lb5
        Lb4:
            r0 = 1
        Lb5:
            java.lang.Integer r8 = X.C05F.A1F
            r7 = 1
            goto L77
        Lb9:
            java.lang.String r0 = "Invalid module type"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        Lc0:
            r11.A01()
            r0 = r27
            r11.A0I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38371Gu8.<init>(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.6xU, X.1qM, X.IMo, X.JII, X.Gyj, X.IbO, X.IbO, X.JHi, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, boolean):void");
    }

    private final void A01() {
        int i = 0;
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC166987dD.A1J(0));
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            i += ((C38577Gxg) it.next()).A01;
            A1F.add(Integer.valueOf(i));
        }
        this.A02 = A1F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r5.A0I != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.EnumC39571Hdh r6, java.util.List r7) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r7, r4)
            r2 = 1
            java.util.Map r0 = r5.A0G
            java.lang.Object r3 = r0.get(r6)
            X.Gxg r3 = (X.C38577Gxg) r3
            if (r3 == 0) goto L48
            X.Hdh r0 = X.EnumC39571Hdh.A06
            if (r6 != r0) goto L1f
            com.instagram.user.model.ProductCollection r0 = r5.A01
            if (r0 != 0) goto L1c
            boolean r1 = r5.A0I
            r0 = 0
            if (r1 == 0) goto L1d
        L1c:
            r0 = 1
        L1d:
            r3.A02 = r0
        L1f:
            r1 = 0
            r5.A04(r6, r4)
            r3.A08 = r2
            java.util.List r0 = r3.A06
            java.util.ArrayList r2 = X.AbstractC001800i.A0U(r0)
            r2.clear()
            r2.addAll(r7)
            r3.A06 = r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L40
            int r1 = r3.A02
            int r0 = r2.size()
            int r1 = r1 + r0
        L40:
            r3.A01 = r1
            r5.A01()
            r5.notifyDataSetChanged()
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38371Gu8.A03(X.Hdh, java.util.List):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object tag;
        String str;
        TextView textView;
        String A0q;
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i == 10) {
                                    View A0R = AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.visual_search_headline, false);
                                    C38488Gw9 c38488Gw9 = new C38488Gw9(A0R);
                                    A0R.setTag(c38488Gw9);
                                    return c38488Gw9;
                                }
                                throw AbstractC31175DnJ.A0U("Invalid viewType: ", i);
                            }
                            View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.account_section, viewGroup, false);
                            inflate.setBackgroundResource(AbstractC53242c7.A0H(inflate.getContext(), R.attr.elevatedBackgroundDrawable));
                            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                            C14360o3.A0A(inflate);
                            inflate.setTag(new C38476Gvx(inflate));
                            AbstractC13880nE.A0f(inflate, AbstractC167017dG.A03(this.A03));
                            tag = inflate.getTag();
                            str = "null cannot be cast to non-null type com.instagram.shopping.widget.continueshopping.ContinueShoppingViewBinder.Holder";
                        } else {
                            Context context = this.A03;
                            tag = IS9.A00(context, viewGroup, AbstractC13880nE.A09(context) / (AbstractC13880nE.A0A(context) / 2)).getTag();
                            str = "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.shimmer.ProductFeedShimmerViewBinder.Holder";
                        }
                        return AbstractC37300Gc1.A03(tag, str);
                    }
                    int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.more_products_section_title);
                    C14360o3.A0C(A0A, AbstractC111324zv.A00(3));
                    textView = (TextView) A0A;
                    Context context2 = this.A03;
                    AbstractC13880nE.A0f(textView, AbstractC167017dG.A03(context2));
                    A0q = AbstractC166997dE.A0q(context2.getResources(), 2131973976);
                }
            } else {
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View A0A2 = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.more_products_section_title);
                C14360o3.A0C(A0A2, AbstractC111324zv.A00(3));
                textView = (TextView) A0A2;
                Context context3 = this.A03;
                AbstractC13880nE.A0f(textView, AbstractC167017dG.A03(context3));
                ProductCollection productCollection = this.A01;
                if (productCollection == null || (A0q = productCollection.getTitle()) == null) {
                    if (this.A0I) {
                        A0q = AbstractC166997dE.A0q(context3.getResources(), 2131974038);
                    } else {
                        throw AbstractC166987dD.A14("Invalid tagged product section title");
                    }
                }
            }
            return new C38421Guw(textView, this, A0q);
        }
        boolean A02 = A02(this, i);
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        if (A02) {
            C14360o3.A07(A0P);
            int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C38495GwG(AbstractC25226BEj.A0R(A0P, viewGroup, R.layout.full_width_product_tile, false));
        }
        View A0D = AbstractC25227BEk.A0D(A0P, viewGroup, R.layout.product_tile_grid_item, false);
        A0D.setTag(new C66479UJd(A0D, false));
        AbstractC13880nE.A0g(A0D, AbstractC13880nE.A0A(this.A03) / 2);
        tag = A0D.getTag();
        str = "null cannot be cast to non-null type com.instagram.shopping.widget.producttile.ProductTileViewBinder.ViewHolder";
        return AbstractC37300Gc1.A03(tag, str);
    }

    public static final User A00(C38371Gu8 c38371Gu8) {
        User A14;
        boolean A00 = I6P.A00(c38371Gu8.A0D);
        C38321qM c38321qM = c38371Gu8.A07;
        if (A00) {
            if (c38321qM != null && (A14 = AbstractC25226BEj.A14(c38321qM)) != null) {
                return A14;
            }
            throw AbstractC166987dD.A14("Merchant is null");
        }
        Object obj = c38371Gu8.A0G.get(EnumC39571Hdh.A06);
        if (obj != null) {
            List list = ((C38577Gxg) obj).A06;
            ArrayList A1E = AbstractC166987dD.A1E();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Product A02 = ((ProductFeedItem) it.next()).A02();
                    if (A02 != null) {
                        A1E.add(A02);
                    }
                }
            }
            User A002 = I95.A00(c38371Gu8.A05, c38321qM, A1E);
            C14360o3.A0A(A002);
            return A002;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A02(C38371Gu8 c38371Gu8, int i) {
        C38577Gxg c38577Gxg;
        List list;
        C38321qM c38321qM = c38371Gu8.A07;
        if (c38321qM != null && !AbstractC37301Gc2.A1Z(c38371Gu8.A05, c38321qM) && i == 0 && (c38577Gxg = (C38577Gxg) c38371Gu8.A0G.get(EnumC39571Hdh.A06)) != null && (list = c38577Gxg.A06) != null && list.size() == 1) {
            return true;
        }
        return false;
    }

    public final void A04(EnumC39571Hdh enumC39571Hdh, boolean z) {
        Map map = this.A0G;
        if (map.get(enumC39571Hdh) != null) {
            C38577Gxg c38577Gxg = (C38577Gxg) map.get(enumC39571Hdh);
            if (c38577Gxg != null) {
                c38577Gxg.A07 = z;
            }
            notifyDataSetChanged();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x049a, code lost:
    
        if (X.I6P.A00(r42.A0D) != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x05c4, code lost:
    
        if (r4.A1g(r42.A05).A6B() == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015a, code lost:
    
        if (r12 == X.EnumC39572Hdi.A07) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [X.HjR, java.lang.Object] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r43, int r44) {
        /*
            Method dump skipped, instructions count: 1659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38371Gu8.onBindViewHolder(X.3OO, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r3.A1g(r6.A05).A5r() != true) goto L12;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemCount() {
        /*
            r6 = this;
            r0 = -1680864216(0xffffffff9bd00c28, float:-3.441857E-22)
            int r4 = X.C0f9.A03(r0)
            java.util.List r0 = r6.A0E
            java.util.Iterator r2 = r0.iterator()
            r5 = 0
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            X.Gxg r0 = (X.C38577Gxg) r0
            boolean r1 = r0.A07
            int r0 = r0.A01
            if (r1 == 0) goto L5f
            int r5 = r5 + 1
        L22:
            X.1qM r3 = r6.A07
            r2 = 1
            if (r3 == 0) goto L34
            com.instagram.common.session.UserSession r0 = r6.A05
            X.1qM r0 = r3.A1g(r0)
            boolean r0 = r0.A5r()
            r1 = 1
            if (r0 == r2) goto L35
        L34:
            r1 = 0
        L35:
            java.lang.String r0 = r6.A0D
            boolean r0 = X.I6P.A00(r0)
            if (r0 != 0) goto L56
            if (r1 != 0) goto L56
            r2 = 0
            if (r3 == 0) goto L5d
            X.Hdi r1 = r3.A29()
        L46:
            X.Hdi r0 = X.EnumC39572Hdi.A04
            if (r1 == r0) goto L56
            if (r3 == 0) goto L50
            X.Hdi r2 = r3.A29()
        L50:
            X.Hdi r0 = X.EnumC39572Hdi.A07
            if (r2 == r0) goto L56
            int r5 = r5 + 1
        L56:
            r0 = -606195482(0xffffffffdbde30e6, float:-1.2508242E17)
            X.C0f9.A0A(r0, r4)
            return r5
        L5d:
            r1 = r2
            goto L46
        L5f:
            int r5 = r5 + r0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38371Gu8.getItemCount():int");
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = C0f9.A03(-1585778236);
        List list = this.A02;
        if (list != null) {
            int size = list.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    List list2 = this.A02;
                    if (list2 == null) {
                        break;
                    }
                    int A01 = AbstractC31176DnK.A01(list2, i4);
                    if (i <= A01) {
                        if (i == A01) {
                            List list3 = this.A02;
                            if (list3 == null) {
                                break;
                            }
                            if (i4 == AbstractC25226BEj.A05(list3)) {
                                continue;
                            }
                        }
                        if (i < A01) {
                            i2 = ((C38577Gxg) this.A0E.get(i4 - 1)).A00;
                            i3 = 101405055;
                            break;
                        }
                        if (i == A01) {
                            C38577Gxg c38577Gxg = (C38577Gxg) this.A0E.get(i4);
                            boolean z = c38577Gxg.A07;
                            int i5 = c38577Gxg.A02;
                            int i6 = c38577Gxg.A01;
                            i2 = c38577Gxg.A03;
                            int i7 = c38577Gxg.A00;
                            if (z) {
                                i2 = 4;
                                i3 = 847079414;
                                break;
                            }
                            if (i5 == 0) {
                                C0f9.A0A(1884661589, A03);
                                return i7;
                            }
                            if (i6 > 0) {
                                i3 = -1753520951;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i4++;
                } else {
                    i2 = 5;
                    i3 = -108388082;
                    break;
                }
            }
            C0f9.A0A(i3, A03);
            return i2;
        }
        C14360o3.A0F("moduleTypeBoundaries");
        throw C00O.createAndThrow();
    }
}
