package X;

import com.facebook.litho.annotations.Prop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2WH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2WH extends AbstractC50792Va {

    @Prop(optional = true)
    public EnumC77683ds A00;

    @Prop(optional = true)
    public EnumC77683ds A01;

    @Prop(optional = true)
    public C3e8 A02;

    @Prop(optional = true)
    public EnumC115945Mk A03;

    @Prop(optional = true)
    public Integer A04;

    @Prop(optional = true)
    public List A05;

    @Prop(optional = true)
    public boolean A06;

    @Override // X.AbstractC50792Va, X.AbstractC50812Vc
    public final C78063eY A0F(BB3 bb3, C76133bI c76133bI, C2Y5 c2y5, int i, int i2) {
        EnumC77003cm enumC77003cm;
        C14360o3.A0B(c76133bI, 0);
        C14360o3.A0B(c2y5, 1);
        C2XE c2xe = c2y5.A04;
        C2W1 c2w1 = new C2W1();
        if (this.A06) {
            enumC77003cm = EnumC77003cm.ROW_REVERSE;
        } else {
            enumC77003cm = EnumC77003cm.ROW;
        }
        c2w1.A0U = enumC77003cm;
        EnumC77683ds enumC77683ds = this.A01;
        if (enumC77683ds != null) {
            c2w1.A0T = enumC77683ds;
        }
        EnumC77683ds enumC77683ds2 = this.A00;
        if (enumC77683ds2 != null) {
            c2w1.A0S = enumC77683ds2;
        }
        C3e8 c3e8 = this.A02;
        if (c3e8 != null) {
            c2w1.A0W = c3e8;
        }
        EnumC115945Mk enumC115945Mk = this.A03;
        if (enumC115945Mk != null) {
            c2w1.A0Y = enumC115945Mk;
        }
        Integer num = this.A04;
        if (num != null) {
            EnumC222829sN enumC222829sN = EnumC222829sN.ROW;
            c2w1.A0Z = num;
            c2w1.A0V = enumC222829sN;
        }
        List list = this.A05;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC50812Vc abstractC50812Vc = (AbstractC50812Vc) it.next();
                if (c76133bI.CVJ()) {
                    c2w1 = null;
                    break;
                }
                if (c76133bI.A00()) {
                    C14360o3.A0B(abstractC50812Vc, 0);
                    List list2 = c2w1.A0f;
                    if (list2 == null) {
                        list2 = new ArrayList();
                        c2w1.A0f = list2;
                    }
                    list2.add(abstractC50812Vc);
                } else {
                    c2w1.A0E(abstractC50812Vc, c2xe, c76133bI);
                }
            }
        }
        return new C78063eY(((AbstractC50792Va) this).A00, c2w1);
    }

    @Override // X.AbstractC50792Va
    public final boolean A19(AbstractC50812Vc abstractC50812Vc, boolean z) {
        if (this != abstractC50812Vc) {
            if (abstractC50812Vc instanceof C2WH) {
                C2WH c2wh = (C2WH) abstractC50812Vc;
                if (((AbstractC50812Vc) this).A00 != ((AbstractC50812Vc) c2wh).A00) {
                    List list = this.A05;
                    List list2 = c2wh.A05;
                    if (list != null) {
                        if (list2 != null && list.size() == list2.size()) {
                            int i = 0;
                            for (Object obj : list) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    AbstractC16960so.A1U();
                                    throw C00O.createAndThrow();
                                }
                                if (!C51372Xk.A04((AbstractC50812Vc) obj, (AbstractC50812Vc) list2.get(i), z)) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                    } else if (list2 != null) {
                        return false;
                    }
                    if (this.A01 != c2wh.A01 || this.A00 != c2wh.A00 || this.A02 != c2wh.A02 || this.A06 != c2wh.A06) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C2WH(EnumC77683ds enumC77683ds, EnumC77683ds enumC77683ds2, C3e8 c3e8, EnumC115945Mk enumC115945Mk, Integer num, List list, boolean z) {
        super("Row");
        this.A00 = enumC77683ds;
        this.A01 = enumC77683ds2;
        this.A02 = c3e8;
        this.A03 = enumC115945Mk;
        this.A06 = z;
        this.A04 = num;
        this.A05 = list;
    }
}
