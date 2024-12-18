package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gu5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38369Gu5 extends C2UU {
    public final ILB A02;
    public final InterfaceC11380iw A04;
    public final InterfaceC43387JFc A06 = new C42842IxI(this, 0);
    public final InterfaceC43386JFb A05 = new C42836IxC(this, 0);
    public final List A03 = AbstractC166987dD.A1E();
    public Integer A00 = C05F.A00;
    public String A01 = "";

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        int i2 = c3oo.mItemViewType;
        C41643IbZ c41643IbZ = null;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            c41643IbZ = (C41643IbZ) this.A03.get(i);
            IIS A01 = c41643IbZ.A01();
            if (i2 == 0) {
                Gv5 gv5 = (Gv5) c3oo;
                C14360o3.A0A(A01);
                IDJ idj = A01.A03;
                C14360o3.A0A(idj);
                String str = idj.A00;
                if (str != null) {
                    C14360o3.A0B(gv5, 0);
                    gv5.A00.setText(str);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ISC.A01((C38445GvS) c3oo, this.A01);
                    return;
                }
                return;
            } else {
                C14360o3.A0A(c41643IbZ);
                I6H.A00(null, null, this.A04, this.A06, (C38506GwR) c3oo, null, c41643IbZ, this.A01, true, true);
                return;
            }
        }
        C14360o3.A0A(c41643IbZ);
        ISB.A01(null, null, this.A04, this.A05, (C38404Guf) c3oo, c41643IbZ, this.A01, true);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        switch (i) {
            case 0:
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new Gv5(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.publishing_title_row, false));
            case 1:
                return ISB.A00(viewGroup);
            case 2:
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C38506GwR(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.publishing_product_row, false));
            case 3:
                return ISC.A00(viewGroup);
            case 4:
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.product_row_no_results, viewGroup, false);
                AbstractC31172DnG.A1J(inflate, R.id.row_no_results_title, 0);
                AbstractC31172DnG.A1J(inflate, R.id.row_no_results_message, 0);
                inflate.requireViewById(R.id.row_invalid_catalog_message).setVisibility(8);
                return new C3OO(inflate);
            case 5:
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                Gv4 gv4 = new Gv4(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.product_picker_spinner_and_message_row, false));
                gv4.A00.setText(2131969997);
                return gv4;
            case 6:
                return I6F.A00(viewGroup);
            default:
                throw AbstractC166987dD.A14("ViewType was not Recognized while creating a row.");
        }
    }

    public final int A00() {
        Integer num = this.A00;
        if (num != C05F.A01 && num != C05F.A0Y) {
            return 0;
        }
        List list = this.A03;
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(I7Q.A00(((C41643IbZ) it.next()).A03()));
        }
        int i = 0;
        if ((A0q instanceof Collection) && A0q.isEmpty()) {
            return 0;
        }
        for (Object obj : A0q) {
            if (obj == EnumC39566Hdc.A06 || obj == EnumC39566Hdc.A04) {
                i++;
                if (i < 0) {
                    AbstractC16960so.A1T();
                    throw C00O.createAndThrow();
                }
            }
        }
        return i;
    }

    public final List A01() {
        Integer num = this.A00;
        if (num != C05F.A01 && num != C05F.A0Y) {
            return null;
        }
        List list = this.A03;
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C41643IbZ) it.next()).A01;
            if (str != null) {
                A0q.add(str);
            } else {
                C14360o3.A0F("sectionGroup");
                throw C00O.createAndThrow();
            }
        }
        return AbstractC001800i.A0W(A0q);
    }

    public C38369Gu5(InterfaceC11380iw interfaceC11380iw, ILB ilb) {
        this.A04 = interfaceC11380iw;
        this.A02 = ilb;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1477272400);
        int intValue = this.A00.intValue();
        int i = 1;
        if (intValue != 1) {
            if (intValue != 4) {
                if (intValue != 0 && intValue != 3 && intValue != 2) {
                    IllegalStateException A14 = AbstractC166987dD.A14("Unknown State while determining item count.");
                    C0f9.A0A(-1570332015, A03);
                    throw A14;
                }
            } else {
                i = 1 + this.A03.size();
            }
        } else {
            i = this.A03.size();
        }
        C0f9.A0A(60519372, A03);
        return i;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        IllegalStateException A14;
        int i2;
        int i3;
        int A03 = C0f9.A03(803620213);
        Integer num = this.A00;
        int intValue = num.intValue();
        int i4 = 5;
        if (intValue != 1 && intValue != 4) {
            if (intValue != 0) {
                if (intValue != 3) {
                    if (intValue == 2) {
                        i4 = 4;
                    } else {
                        A14 = AbstractC166987dD.A14("Could not determine item view type for current state.");
                        i2 = 115083760;
                        C0f9.A0A(i2, A03);
                        throw A14;
                    }
                }
            } else {
                i4 = 3;
            }
            i3 = -1472374193;
        } else if (num == C05F.A0Y && i == getItemCount() - 1) {
            i4 = 6;
            i3 = 1344160019;
        } else {
            String A032 = ((C41643IbZ) this.A03.get(i)).A03();
            if (C14360o3.A0K(A032, "product_list_header")) {
                i4 = 0;
            } else if (C14360o3.A0K(A032, "product_group_list_item")) {
                i4 = 1;
            } else if (C14360o3.A0K(A032, "product_item_list_item")) {
                i4 = 2;
            } else {
                A14 = AbstractC166987dD.A14("LayoutContent has no recognized content available for the adapter to display.");
                i2 = -287657130;
                C0f9.A0A(i2, A03);
                throw A14;
            }
            i3 = -1472374193;
        }
        C0f9.A0A(i3, A03);
        return i4;
    }
}
