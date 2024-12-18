package X;

import android.util.SparseArray;
import com.facebook.R;
import com.facebookpay.form.cell.CellParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.5t8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129455t8 extends AbstractC129435t5 {
    public SparseArray A00;
    public ArrayList A01;
    public final C58252li A02;
    public final C2GS A03;

    @Override // X.AbstractC129435t5
    public void A0G() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i < sparseArray.size()) {
                AbstractC129435t5 abstractC129435t5 = (AbstractC129435t5) sparseArray.valueAt(i);
                if (abstractC129435t5 != null) {
                    abstractC129435t5.A0G();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final AbstractC129435t5 A0I(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i2 < sparseArray.size()) {
                if (sparseArray.valueAt(i2) != null && ((AbstractC129435t5) sparseArray.valueAt(i2)).A02 == i) {
                    return (AbstractC129435t5) sparseArray.valueAt(i2);
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public ImmutableList A0J() {
        C129445t7 c129445t7 = (C129445t7) this;
        ImmutableList.Builder builder = ImmutableList.builder();
        C67663Uuv c67663Uuv = new C67663Uuv(26);
        c67663Uuv.A03 = c129445t7.A00;
        c67663Uuv.A07 = true;
        boolean z = c129445t7.A04;
        int i = R.attr.fbpay_hub_header_item_margin_top;
        if (z) {
            i = 0;
        }
        c67663Uuv.A04 = i;
        if (z) {
            c67663Uuv.A00 = R.attr.fbpay_redesign_nux_form_header_item_margin_bottom;
        }
        builder.add((Object) c67663Uuv.A00());
        C67524UnO c67524UnO = c129445t7.A02;
        if (c67524UnO != null) {
            builder.add((Object) W3T.A00(c67524UnO, null, null, "nux_new_full_name_form_field", c129445t7.A05, false));
        }
        C67524UnO c67524UnO2 = c129445t7.A01;
        if (c67524UnO2 != null) {
            builder.add((Object) W3S.A00(c67524UnO2, null, "nux_new_email_form_field", c129445t7.A05, false));
        }
        C67524UnO c67524UnO3 = c129445t7.A03;
        if (c67524UnO3 != null) {
            builder.add((Object) W3U.A00(c67524UnO3, null, "nux_new_phone_number_form_field", c129445t7.A05, false));
        }
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }

    @Override // X.AbstractC129435t5
    public final void A0C(boolean z) {
        Object A02 = this.A07.A02();
        A02.getClass();
        if (((Boolean) A02).booleanValue() != z) {
            super.A0C(z);
            A0K();
            C58252li c58252li = this.A05;
            c58252li.A0B(c58252li.A02());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2GT, X.2GS] */
    public AbstractC129455t8(int i, boolean z, boolean z2) {
        super(i, z, z2);
        this.A02 = new C58252li();
        this.A00 = new SparseArray();
        this.A03 = new C2GT();
        this.A01 = new ArrayList();
    }

    public void A0K() {
        SparseArray sparseArray;
        C2GT c2gt;
        C2GT c2gt2;
        ImmutableList A0J = A0J();
        int i = 0;
        while (true) {
            sparseArray = this.A00;
            if (i >= sparseArray.size()) {
                break;
            }
            AbstractC129435t5 abstractC129435t5 = (AbstractC129435t5) sparseArray.valueAt(i);
            this.A05.A0D(abstractC129435t5.A05);
            C58252li c58252li = this.A02;
            if (abstractC129435t5 instanceof AbstractC129455t8) {
                c2gt2 = ((AbstractC129455t8) abstractC129435t5).A02;
            } else {
                c2gt2 = abstractC129435t5.A06;
            }
            c58252li.A0D(c2gt2);
            abstractC129435t5.A0G();
            i++;
        }
        this.A00 = new SparseArray();
        this.A01 = new ArrayList();
        C1LC it = A0J.iterator();
        while (it.hasNext()) {
            CellParams cellParams = (CellParams) it.next();
            AbstractC129435t5 A01 = cellParams.A01();
            cellParams.A00 = A01;
            A01.A0B(super.A00);
            int i2 = cellParams.A02;
            if (sparseArray.get(i2) instanceof UvM) {
                ((UvM) A01).A0C.A0B(((UvM) sparseArray.get(i2)).A0C.A02());
            }
            cellParams.A00 = A01;
            this.A00.put(i2, A01);
            this.A01.add(Integer.valueOf(i2));
            C58252li c58252li2 = this.A02;
            if (A01 instanceof AbstractC129455t8) {
                c2gt = ((AbstractC129455t8) A01).A02;
            } else {
                c2gt = A01.A06;
            }
            c58252li2.A0E(c2gt, new C70301WQg(this));
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.A00;
            if (i3 < sparseArray2.size()) {
                AbstractC129435t5 abstractC129435t52 = (AbstractC129435t5) sparseArray2.valueAt(i3);
                this.A05.A0E(abstractC129435t52.A05, new C70304WQj(abstractC129435t52, this));
                i3++;
            } else {
                this.A03.A0B(A0J);
                return;
            }
        }
    }

    public void A0L(AbstractC129435t5 abstractC129435t5, Object obj, Object obj2) {
    }
}
