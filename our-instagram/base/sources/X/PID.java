package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.nux.cal.model.FXCalAgeInfo;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PID implements XBO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PID(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.XBO
    public final void D2u(IgRadioGroup igRadioGroup, int i) {
        String str;
        Object next;
        String str2;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        FXCalAgeInfo fXCalAgeInfo;
        switch (this.A00) {
            case 0:
                List list = ((C51659Mrq) this.A02).A01;
                Iterator it = list.iterator();
                do {
                    str = null;
                    if (!it.hasNext()) {
                        return;
                    }
                    next = it.next();
                    str2 = ((C51739MtM) next).A06;
                    C51739MtM c51739MtM = (C51739MtM) AbstractC001800i.A0O(list, i);
                    if (c51739MtM != null) {
                        str = c51739MtM.A06;
                    }
                } while (!C14360o3.A0K(str2, str));
                if (next == null) {
                    return;
                }
                AbstractC25225BEi.A1U(this.A01, next);
                return;
            case 1:
                Object tag = igRadioGroup.requireViewById(i).getTag();
                if (!(tag instanceof EnumC53267Nh5) || tag == null) {
                    return;
                }
                N6A n6a = (N6A) this.A02;
                n6a.A03().A03.Egh(tag);
                viewTreeObserver = ((View) this.A01).getViewTreeObserver();
                if (viewTreeObserver == null) {
                    return;
                }
                onPreDrawListener = n6a.A06;
                break;
            case 2:
                Object tag2 = igRadioGroup.requireViewById(i).getTag();
                if (!(tag2 instanceof EnumC53267Nh5) || tag2 == null) {
                    return;
                }
                N64 n64 = (N64) this.A02;
                MSW.A0k(n64.A08).A07.Egh(tag2);
                viewTreeObserver = ((View) this.A01).getViewTreeObserver();
                if (viewTreeObserver == null) {
                    return;
                }
                onPreDrawListener = n64.A06;
                break;
                break;
            default:
                View view = (View) this.A02;
                if (!view.isEnabled()) {
                    view.setEnabled(true);
                }
                EI3 ei3 = (EI3) this.A01;
                if (i == 1) {
                    String str3 = ei3.A04.A02;
                    str3.getClass();
                    ei3.A07 = str3;
                    fXCalAgeInfo = ei3.A04;
                } else {
                    String str4 = ei3.A03.A02;
                    str4.getClass();
                    ei3.A07 = str4;
                    fXCalAgeInfo = ei3.A03;
                }
                String str5 = fXCalAgeInfo.A03;
                str5.getClass();
                ei3.A08 = str5;
                return;
        }
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }
}
