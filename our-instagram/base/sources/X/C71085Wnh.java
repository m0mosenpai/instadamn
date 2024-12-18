package X;

import android.view.View;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.Wnh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71085Wnh implements XBO {
    public final int A00;
    public final Object A01;

    public C71085Wnh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.XBO
    public final void D2u(IgRadioGroup igRadioGroup, int i) {
        Object obj;
        Integer num;
        C32360ENh c32360ENh;
        EnumC33321EoG enumC33321EoG;
        switch (this.A00) {
            case 0:
                if (i != -1) {
                    View findViewById = igRadioGroup.findViewById(i);
                    if (findViewById != null) {
                        obj = findViewById.getTag();
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                        ((UFQ) ((C67884V0q) this.A01).A0G.getValue()).A03(num);
                        return;
                    }
                }
                ((UFQ) ((C67884V0q) this.A01).A0G.getValue()).A03(null);
                return;
            case 1:
                if (i == -1) {
                    C69655Vsw c69655Vsw = (C69655Vsw) this.A01;
                    c69655Vsw.A06.A09(c69655Vsw.A05, null);
                    return;
                } else {
                    Object tag = AbstractC166997dE.A0S(igRadioGroup, i).getTag();
                    C14360o3.A0C(tag, "null cannot be cast to non-null type kotlin.String");
                    C69655Vsw c69655Vsw2 = (C69655Vsw) this.A01;
                    c69655Vsw2.A06.A09(c69655Vsw2.A05, (String) tag);
                    return;
                }
            case 2:
                C44504JmA c44504JmA = (C44504JmA) ((KCG) this.A01).A04.getValue();
                Object tag2 = igRadioGroup.requireViewById(i).getTag();
                C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.api.schemas.XIGIGBoostCallToAction");
                XIGIGBoostCallToAction xIGIGBoostCallToAction = (XIGIGBoostCallToAction) tag2;
                C14360o3.A0B(xIGIGBoostCallToAction, 0);
                c44504JmA.A07.Egh(xIGIGBoostCallToAction);
                c44504JmA.A02.A0d = xIGIGBoostCallToAction;
                return;
            default:
                if (i == -1) {
                    c32360ENh = (C32360ENh) this.A01;
                    enumC33321EoG = null;
                } else {
                    View requireViewById = igRadioGroup.requireViewById(i);
                    c32360ENh = (C32360ENh) this.A01;
                    enumC33321EoG = (EnumC33321EoG) requireViewById.getTag();
                }
                c32360ENh.A01 = enumC33321EoG;
                return;
        }
    }
}
