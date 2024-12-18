package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductCollectionFooter;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HEZ extends C2US implements InterfaceC65252xN {
    public ProductCollectionFooter A00;
    public ProductCollectionHeader A01;
    public C39696HjS A02;
    public IFO A03;
    public C41047IFq A04;
    public final C65662y2 A05;
    public final C38321qM A06;
    public final EnumC39622HeW A07;
    public final HFJ A08;
    public final C38992HEu A09;
    public final EQe A0A;
    public final HFZ A0B;
    public final C38984HEm A0C;
    public final HFK A0D;
    public final C38340Gta A0E;
    public final C38993HEv A0F;
    public final C41144IJj A0G;
    public final InterfaceC43455JHt A0H;
    public final C39142HKv A0I;
    public final HF8 A0J;
    public final HFM A0K;
    public final C152996uT A0L;
    public final InterfaceC62602sz A0M;
    public final C65842yM A0N;
    public final String A0O;
    public final String A0P;
    public final Map A0Q;
    public final UserSession A0R;
    public final ES2 A0S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.HEm, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.2y2, java.lang.Object, X.2y0] */
    public HEZ(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C5GU c5gu, ProductCollectionHeader productCollectionHeader, EnumC39622HeW enumC39622HeW, C41144IJj c41144IJj, InterfaceC43455JHt interfaceC43455JHt, ProductCollectionFragment productCollectionFragment, C39142HKv c39142HKv, HH9 hh9, InterfaceC62602sz interfaceC62602sz, String str, String str2, boolean z) {
        super(false);
        Integer num;
        AbstractC25229BEm.A1I(interfaceC62602sz, 3, userSession);
        AbstractC25232BEp.A1P(enumC39622HeW, interfaceC43455JHt);
        C14360o3.A0B(c41144IJj, 12);
        this.A0M = interfaceC62602sz;
        this.A0I = c39142HKv;
        this.A0R = userSession;
        this.A07 = enumC39622HeW;
        this.A0G = c41144IJj;
        this.A01 = productCollectionHeader;
        HFZ hfz = new HFZ(interfaceC60442pS, userSession, productCollectionFragment);
        this.A0B = hfz;
        HFJ hfj = new HFJ(context, userSession, c38321qM, interfaceC60442pS, productCollectionFragment, hh9, z);
        this.A08 = hfj;
        ?? obj = new Object();
        this.A0C = obj;
        ?? obj2 = new Object();
        this.A05 = obj2;
        this.A0Q = AbstractC166987dD.A1G();
        this.A0E = new C38340Gta(this);
        obj2.A03 = AbstractC167017dG.A06(context);
        if (enumC39622HeW == EnumC39622HeW.A0L) {
            num = C05F.A0Y;
        } else {
            num = null;
            if (c5gu != null) {
                switch (c5gu.ordinal()) {
                    case 0:
                        num = C05F.A01;
                        break;
                    case 1:
                    case 2:
                        num = C05F.A0N;
                        break;
                    case 3:
                        num = C05F.A0j;
                        break;
                    case 4:
                    case 5:
                        num = C05F.A0u;
                        break;
                }
            }
        }
        HFK hfk = new HFK(context, interfaceC60442pS, userSession, productCollectionFragment, hh9, num, str, false);
        this.A0D = hfk;
        HFM hfm = new HFM(context, interfaceC60442pS, productCollectionFragment);
        this.A0K = hfm;
        C65842yM c65842yM = new C65842yM(context);
        this.A0N = c65842yM;
        HF8 hf8 = new HF8(interfaceC60442pS, hh9, productCollectionFragment);
        this.A0J = hf8;
        C152996uT c152996uT = new C152996uT(context);
        this.A0L = c152996uT;
        ES2 es2 = new ES2(context);
        this.A0S = es2;
        this.A0H = interfaceC43455JHt;
        interfaceC43455JHt.EgQ();
        C38992HEu c38992HEu = new C38992HEu(context);
        this.A09 = c38992HEu;
        C38993HEv c38993HEv = new C38993HEv(context);
        this.A0F = c38993HEv;
        EQe eQe = new EQe(context);
        this.A0A = eQe;
        this.A06 = c38321qM;
        this.A0O = str2;
        this.A0P = AbstractC31180DnO.A0k(c5gu);
        init(hfz, obj, hfj, obj2, hfk, c65842yM, hf8, c152996uT, es2, c38992HEu, c38993HEv, eQe, hfm);
    }

    public final void A01(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductFeedItem productFeedItem = (ProductFeedItem) it.next();
            A12.add(productFeedItem);
            MultiProductComponent multiProductComponent = productFeedItem.A01;
            if (multiProductComponent != null && multiProductComponent.A02 == EnumC39620HeU.A07) {
                A12.addAll(AbstractC31172DnG.A19(multiProductComponent.A03.A03));
            }
        }
        this.A0I.A0B(A12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (X.AbstractC166987dD.A1b(r0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c9, code lost:
    
        if (X.AbstractC25226BEj.A1b(r4.A05) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.os.Parcelable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HEZ.A00():void");
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        C39696HjS c39696HjS = this.A02;
        if ((c39696HjS == null || (c39696HjS.A03 == null && c39696HjS.A02 == null && c39696HjS.A01 == null && c39696HjS.A00 == null)) && this.A0I.A02() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        A00();
    }
}
