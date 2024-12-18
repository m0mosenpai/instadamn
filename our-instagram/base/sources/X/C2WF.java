package X;

import com.facebook.litho.annotations.Prop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2WF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2WF extends AbstractC50792Va {

    @Prop(optional = true)
    public EnumC77683ds A00;

    @Prop(optional = true)
    public EnumC77683ds A01;

    @Prop(optional = true)
    public C3e8 A02;

    @Prop(optional = true)
    public List A03;

    @Prop(optional = true)
    public boolean A04;

    @Override // X.AbstractC50792Va, X.AbstractC50812Vc
    public final C78063eY A0F(BB3 bb3, C76133bI c76133bI, C2Y5 c2y5, int i, int i2) {
        EnumC77003cm enumC77003cm;
        C14360o3.A0B(c76133bI, 0);
        C14360o3.A0B(c2y5, 1);
        C2XE c2xe = c2y5.A04;
        C2W1 c2w1 = new C2W1();
        if (this.A04) {
            enumC77003cm = EnumC77003cm.COLUMN_REVERSE;
        } else {
            enumC77003cm = EnumC77003cm.COLUMN;
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
        List list = this.A03;
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
            if (abstractC50812Vc instanceof C2WF) {
                C2WF c2wf = (C2WF) abstractC50812Vc;
                if (((AbstractC50812Vc) this).A00 != ((AbstractC50812Vc) c2wf).A00) {
                    List list = this.A03;
                    List list2 = c2wf.A03;
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
                    if (this.A01 != c2wf.A01 || this.A00 != c2wf.A00 || this.A02 != c2wf.A02 || this.A04 != c2wf.A04) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C2WF(EnumC77683ds enumC77683ds, EnumC77683ds enumC77683ds2, C3e8 c3e8, List list, boolean z) {
        super("Column");
        this.A00 = enumC77683ds;
        this.A01 = enumC77683ds2;
        this.A02 = c3e8;
        this.A04 = z;
        this.A03 = list;
    }
}
