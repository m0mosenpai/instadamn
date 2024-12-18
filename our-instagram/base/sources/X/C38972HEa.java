package X;

import android.content.Context;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.HEa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38972HEa extends C2US implements InterfaceC65252xN {
    public final HFK A00;
    public final C38993HEv A01;
    public final C38994HEw A02;
    public final HH8 A03;
    public final InterfaceC43455JHt A04;
    public final WishListFeedFragment A05;
    public final C39142HKv A06;
    public final C39142HKv A07;
    public final C152996uT A08;
    public final InterfaceC62602sz A09;
    public final C65842yM A0A;
    public final Map A0B;
    public final Map A0C;
    public final C66732zq A0D;
    public final ES2 A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.HKv, X.2xV] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.HKv, X.2xV] */
    public C38972HEa(Context context, C62862tP c62862tP, InterfaceC11380iw interfaceC11380iw, UserSession userSession, HH8 hh8, InterfaceC43455JHt interfaceC43455JHt, WishListFeedFragment wishListFeedFragment, InterfaceC62602sz interfaceC62602sz) {
        super(false);
        AbstractC25233BEq.A0x(1, context, interfaceC62602sz, userSession);
        AbstractC167007dF.A1J(interfaceC43455JHt, 7, hh8);
        this.A05 = wishListFeedFragment;
        this.A09 = interfaceC62602sz;
        this.A04 = interfaceC43455JHt;
        this.A03 = hh8;
        JPm Bgz = wishListFeedFragment.Bh2().Bgz();
        Integer num = C05F.A15;
        HFK hfk = new HFK(context, interfaceC11380iw, userSession, Bgz, null, num, null, true);
        this.A00 = hfk;
        C65842yM c65842yM = new C65842yM(context);
        this.A0A = c65842yM;
        C152996uT c152996uT = new C152996uT(context);
        this.A08 = c152996uT;
        ES2 es2 = new ES2(context);
        this.A0E = es2;
        C38993HEv c38993HEv = new C38993HEv(context);
        this.A01 = c38993HEv;
        C38994HEw c38994HEw = new C38994HEw(c62862tP);
        this.A02 = c38994HEw;
        C66732zq c66732zq = new C66732zq(context, interfaceC11380iw, userSession, wishListFeedFragment, num, false);
        this.A0D = c66732zq;
        this.A06 = new AbstractC65332xV();
        this.A07 = new AbstractC65332xV();
        this.A0B = AbstractC166987dD.A1G();
        this.A0C = AbstractC166987dD.A1G();
        interfaceC43455JHt.EgQ();
        init(c152996uT, es2, c65842yM, hfk, c66732zq, c38993HEv, c38994HEw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(C38972HEa c38972HEa) {
        c38972HEa.clear();
        C39142HKv c39142HKv = c38972HEa.A06;
        c39142HKv.A06();
        C39142HKv c39142HKv2 = c38972HEa.A07;
        c39142HKv2.A06();
        Object obj = c38972HEa.A03.A00;
        if (obj != null) {
            c38972HEa.addModel(obj, c38972HEa.A02);
        }
        if (c38972HEa.isEmpty()) {
            if (c38972HEa.A09.isLoading()) {
                c38972HEa.addModel(null, new C39097HIv(null, null, 1), c38972HEa.A01);
            } else {
                InterfaceC43455JHt interfaceC43455JHt = c38972HEa.A04;
                C1571273r Afz = interfaceC43455JHt.Afz();
                if (c39142HKv2.A02() != 0) {
                    Afz.A0P = true;
                    Afz.A0L = true;
                    Afz.A0N = true;
                }
                c38972HEa.addModel(Afz, interfaceC43455JHt.B1M(), c38972HEa.A08);
                c38972HEa.A00();
            }
        } else {
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            C38670GzB c38670GzB = new C38670GzB(null, null, "saved_products_collection", null, null);
            int A02 = c39142HKv.A02();
            for (int i = 0; i < A02; i++) {
                List list = c39142HKv.A01;
                C14360o3.A0B(list, 0);
                C153126ug c153126ug = new C153126ug(list, i * 2, 2);
                if (c153126ug.A01() == 2 || !c38972HEa.A09.CLJ()) {
                    Map map = c38972HEa.A0B;
                    C41690IdJ c41690IdJ = (C41690IdJ) map.get(AbstractC166997dE.A0u(c153126ug));
                    if (c41690IdJ == null) {
                        c41690IdJ = new C41690IdJ(c153126ug);
                        map.put(AbstractC166997dE.A0u(c153126ug), c41690IdJ);
                    }
                    C153336v2 c153336v2 = c41690IdJ.A00;
                    boolean z = true;
                    if (c38972HEa.A09.CLJ() || i != c39142HKv.A02() - 1) {
                        z = false;
                    }
                    c153336v2.A00(i, z);
                    c38972HEa.addModel(new C42335Iox(ProductCardSubtitleType.A0D, EnumC39622HeW.A0P, c41690IdJ, c38670GzB, c153126ug, str, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i, 130816), null, c38972HEa.A00);
                }
            }
            c38972HEa.A00();
            InterfaceC62602sz interfaceC62602sz = c38972HEa.A09;
            if (interfaceC62602sz.CLJ() || interfaceC62602sz.CUG() || c38972HEa.A05.A06) {
                c38972HEa.addModel(interfaceC62602sz, c38972HEa.A0A);
            }
        }
        c38972HEa.notifyDataSetChanged();
    }

    private final void A00() {
        C39142HKv c39142HKv = this.A07;
        int size = c39142HKv.A01.size();
        for (int i = 0; i < size; i++) {
            MultiProductComponent multiProductComponent = ((ProductFeedItem) c39142HKv.A01.get(i)).A01;
            if (multiProductComponent != null && multiProductComponent.A02 == EnumC39620HeU.A06) {
                addModel(MZV.FULL_WIDTH, this.A0E);
                Map map = this.A0C;
                Object obj = map.get(multiProductComponent.A06);
                if (obj == null) {
                    obj = new IJ0(multiProductComponent, i);
                    map.put(multiProductComponent.A06, obj);
                }
                addModel(multiProductComponent, obj, this.A0D);
            }
        }
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        if (this.A06.A02() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        A01(this);
    }
}
