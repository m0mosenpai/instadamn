package X;

import com.android.billingclient.api.Purchase;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.TFv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64485TFv implements C6D2 {
    public final /* synthetic */ C62949SYr A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public C64485TFv(C62949SYr c62949SYr, String str, String str2, List list, List list2) {
        this.A00 = c62949SYr;
        this.A01 = str;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = str2;
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        QIy qIy;
        EnumC61182Rgi enumC61182Rgi;
        QIg qIg;
        C46h c46h = (C46h) obj;
        C62949SYr c62949SYr = this.A00;
        String str = this.A01;
        List<Purchase> list = this.A03;
        List list2 = this.A04;
        C14360o3.A0A(c46h);
        String str2 = this.A02;
        if ((c46h instanceof C4JL) && ((C40791um) c46h.A03()).isOk() && ((AnonymousClass435) c46h.A03()).A01 != null) {
            Object obj2 = ((AnonymousClass435) c46h.A03()).A01;
            if (obj2 != null) {
                AbstractC907342m A00 = ((AbstractC907342m) obj2).A00(QHD.class, "create_digital_content_purchased_order");
                if (A00 != null) {
                    AbstractC907342m abstractC907342m = new AbstractC907342m(A00.A00);
                    ImmutableList A02 = abstractC907342m.A02("purchases", C58900QHk.class);
                    C14360o3.A07(A02);
                    ArrayList A0i = AbstractC167007dF.A0i(A02);
                    Iterator<E> it = A02.iterator();
                    while (it.hasNext()) {
                        AbstractC907342m abstractC907342m2 = new AbstractC907342m(((AbstractC907342m) it.next()).A00);
                        A0i.add(new C45126Jxv(abstractC907342m2.A05("digital_content_order_id"), abstractC907342m2.A05("external_transaction_id"), AbstractC31180DnO.A0k(abstractC907342m2.A04("external_product_category", EnumC61207Rh7.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)), null, null, 8, 2));
                    }
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) A0i);
                    C14360o3.A07(copyOf);
                    ImmutableList A022 = abstractC907342m.A02("purchase_errors", C58899QHj.class);
                    C14360o3.A07(A022);
                    ArrayList A0i2 = AbstractC167007dF.A0i(A022);
                    Iterator<E> it2 = A022.iterator();
                    while (it2.hasNext()) {
                        AbstractC907342m abstractC907342m3 = new AbstractC907342m(((AbstractC907342m) it2.next()).A00);
                        A0i2.add(new QIg(abstractC907342m3.A05("external_transaction_id"), abstractC907342m3.A05(DialogModule.KEY_MESSAGE), abstractC907342m3.A00.optInt(TraceFieldType.ErrorCode)));
                    }
                    ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A0i2);
                    C14360o3.A07(copyOf2);
                    C1LC A0I = AbstractC43592JPx.A0I(copyOf2);
                    while (true) {
                        int i = 0;
                        if (A0I.hasNext()) {
                            qIg = (QIg) A0I.next();
                            for (Purchase purchase : list) {
                                if (AbstractC002300n.A0g(purchase.A01(), qIg.A02, false)) {
                                    break;
                                }
                            }
                            throw new NoSuchElementException(MSV.A00(1));
                        }
                        if (!copyOf.isEmpty() && copyOf2.isEmpty()) {
                            qIy = new QIy(EnumC61182Rgi.A04, str, str2, list2, copyOf, copyOf2, 64);
                        } else {
                            if (!(copyOf2 instanceof Collection) || !copyOf2.isEmpty()) {
                                Iterator<E> it3 = copyOf2.iterator();
                                while (it3.hasNext()) {
                                    QIg qIg2 = (QIg) it3.next();
                                    if (qIg2 == null || qIg2.A01 != 2603009) {
                                        i++;
                                        if (i < 0) {
                                            AbstractC16960so.A1T();
                                            throw C00O.createAndThrow();
                                        }
                                    }
                                }
                            }
                            String A002 = AbstractC43591JPw.A00(104);
                            if (C14360o3.A0K(str, A002) && i == 0) {
                                qIy = new QIy(EnumC61182Rgi.A04, str, str2, list2, copyOf, C16930sl.A00, 64);
                            } else {
                                if (C14360o3.A0K(str, A002) && i != copyOf2.size()) {
                                    enumC61182Rgi = EnumC61182Rgi.A06;
                                } else {
                                    enumC61182Rgi = EnumC61182Rgi.A05;
                                }
                                qIy = new QIy(EnumC61185Rgl.A0K, enumC61182Rgi, str, str2, list2, copyOf, copyOf2);
                            }
                        }
                        qIg.A00 = AbstractC61812Ru6.A00(purchase);
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            qIy = new QIy(EnumC61185Rgl.A0G, EnumC61182Rgi.A07, str, str2, list2, (List) null, (List) null);
        }
        C62949SYr.A00(c62949SYr, str).accept(qIy);
        return qIy;
    }
}
