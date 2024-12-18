package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class J6o extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J6o(Object obj, Object obj2, Object obj3, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A00 = obj2;
        this.A03 = obj3;
        this.A04 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        Object obj3;
        int i;
        Object obj4;
        String str2;
        Object obj5;
        Object obj6;
        int i2;
        switch (this.A01) {
            case 0:
                obj4 = this.A03;
                obj5 = this.A02;
                str2 = this.A04;
                obj6 = this.A00;
                i2 = 0;
                return new J6o(obj5, obj6, obj4, str2, interfaceC23621Ds, i2);
            case 1:
                obj3 = this.A02;
                obj2 = this.A03;
                str = this.A04;
                i = 1;
                break;
            case 2:
                obj5 = this.A02;
                obj6 = this.A00;
                obj4 = this.A03;
                str2 = this.A04;
                i2 = 2;
                return new J6o(obj5, obj6, obj4, str2, interfaceC23621Ds, i2);
            case 3:
                obj2 = this.A03;
                str = this.A04;
                obj3 = this.A02;
                i = 3;
                break;
            case 4:
                obj4 = this.A03;
                str2 = this.A04;
                obj5 = this.A02;
                obj6 = this.A00;
                i2 = 4;
                return new J6o(obj5, obj6, obj4, str2, interfaceC23621Ds, i2);
            default:
                obj4 = this.A03;
                str2 = this.A04;
                obj5 = this.A02;
                obj6 = this.A00;
                i2 = 5;
                return new J6o(obj5, obj6, obj4, str2, interfaceC23621Ds, i2);
        }
        J6o j6o = new J6o(obj2, obj3, str, interfaceC23621Ds, i);
        j6o.A00 = obj;
        return j6o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        A7Z a7z;
        List list;
        C27886CQx c27886CQx;
        String str;
        Object obj2;
        D8J d8j;
        boolean z;
        C222015v c222015v;
        C25621Ms A0c;
        Object[] objArr;
        String str2;
        ?? r5;
        switch (this.A01) {
            case 0:
                AbstractC09560e7.A00(obj);
                C55083Oaf c55083Oaf = ((KZ8) this.A03).A01;
                Activity activity = (Activity) this.A02;
                String str3 = this.A04;
                InterfaceC58109PpY interfaceC58109PpY = (InterfaceC58109PpY) this.A00;
                AbstractC167027dH.A12(activity, str3, interfaceC58109PpY);
                c55083Oaf.A02(activity, interfaceC58109PpY, str3, null);
                break;
            case 1:
                AbstractC09560e7.A00(obj);
                C19L c19l = (C19L) this.A00;
                List list2 = (List) this.A02;
                Object obj3 = this.A03;
                String str4 = this.A04;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    AbstractC166987dD.A1Z(new C57161PZf(it.next(), c19l, obj3, str4, (InterfaceC23621Ds) null, 10), c19l);
                }
                break;
            case 2:
                AbstractC09560e7.A00(obj);
                Bitmap bitmap = (Bitmap) this.A02;
                String A0Q = AnonymousClass001.A0Q("quick_snap_temp_", System.currentTimeMillis());
                boolean A1a = AbstractC167017dG.A1a(bitmap, A0Q);
                File file = new File(C50472Tr.A01(), A0Q);
                C1NC.A0M(bitmap, file);
                Medium A05 = Medium.A0i.A05(file);
                OTW otw = (OTW) this.A00;
                if (otw.A00 == EnumC76383bi.A04 || ((a7z = otw.A01) != null && (((list = a7z.A01) != null && AbstractC166987dD.A1b(list) == A1a) || a7z.A00 != null))) {
                    QuickSnapRepository quickSnapRepository = ((C8HC) this.A03).A0C;
                    OC6 oc6 = new OC6(A05, otw, this.A04);
                    quickSnapRepository.A06.put(oc6.A03, AbstractC23641Du.A04(AnonymousClass191.A00, new C57165PZj(quickSnapRepository, oc6, (InterfaceC23621Ds) null, 28), ((C4A7) quickSnapRepository).A01));
                    break;
                }
                break;
            case 3:
                AbstractC09560e7.A00(obj);
                MU9 mu9 = (MU9) this.A00;
                C41691IdK c41691IdK = (C41691IdK) this.A03;
                String str5 = this.A04;
                C41691IdK.A01(c41691IdK, str5, C43361JEc.A01(c41691IdK, 24));
                C43172J6r.A03(c41691IdK, (C19L) this.A02, 32);
                C41234IMz c41234IMz = c41691IdK.A03;
                String str6 = (String) mu9.A01;
                C14360o3.A0B(str5, 0);
                ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = c41234IMz.A02;
                InterfaceC02590Ai A00 = AbstractC37305Gc6.A00(AbstractC37300Gc1.A0C(c41234IMz.A03), shoppingTaggingFeedArguments, "instagram_shopping_product_tagging_feed_load_failure");
                A00.AAP("source_id", shoppingTaggingFeedArguments.A0C);
                A00.AAP("source_type", shoppingTaggingFeedArguments.A0D);
                A00.AAQ((C0Zx) c41234IMz.A04.getValue(), "suggested_tags_info");
                A00.A7v("is_organic_product_tagging", Boolean.valueOf(shoppingTaggingFeedArguments.A00));
                A00.AAP("search_text", str5);
                A00.AAP("error_message", str6);
                A00.Cht();
                C42346Ip8 A002 = I6K.A00(c41691IdK.A02);
                EnumC39554HdQ enumC39554HdQ = EnumC39554HdQ.A03;
                if (A002.A00.containsKey(enumC39554HdQ)) {
                    A002.A01.flowMarkError(C42346Ip8.A00(enumC39554HdQ, A002), "response_error", str6);
                    break;
                }
                break;
            case 4:
                AbstractC09560e7.A00(obj);
                C27267C1k c27267C1k = (C27267C1k) this.A03;
                c27886CQx = c27267C1k.A00;
                str = this.A04;
                obj2 = this.A02;
                d8j = new D8J(19, this.A00, c27267C1k);
                z = false;
                boolean A1R = AbstractC167007dF.A1R(0, str, obj2);
                c222015v = null;
                A0c = AbstractC167017dG.A0c(c27886CQx.A00);
                objArr = new Object[2];
                objArr[0] = str;
                str2 = "like";
                r5 = A1R;
                objArr[r5] = str2;
                A0c.A0L("media/%s/%s/", objArr);
                C1ON A0R = AbstractC31172DnG.A0R(c222015v, A0c, C40781ul.class, C55702hA.class, z);
                A0R.A00 = new C39028HGe(obj2, c27886CQx, d8j, str, 6);
                C1GJ.A03(A0R);
                break;
            default:
                AbstractC09560e7.A00(obj);
                C27267C1k c27267C1k2 = (C27267C1k) this.A03;
                c27886CQx = c27267C1k2.A00;
                str = this.A04;
                obj2 = this.A02;
                d8j = new D8J(20, this.A00, c27267C1k2);
                z = false;
                boolean A1R2 = AbstractC167007dF.A1R(0, str, obj2);
                c222015v = null;
                A0c = AbstractC167017dG.A0c(c27886CQx.A00);
                objArr = new Object[2];
                objArr[0] = str;
                str2 = "unlike";
                r5 = A1R2;
                objArr[r5] = str2;
                A0c.A0L("media/%s/%s/", objArr);
                C1ON A0R2 = AbstractC31172DnG.A0R(c222015v, A0c, C40781ul.class, C55702hA.class, z);
                A0R2.A00 = new C39028HGe(obj2, c27886CQx, d8j, str, 6);
                C1GJ.A03(A0R2);
                break;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((J6o) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J6o(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A04 = str;
        this.A02 = obj2;
    }
}
