package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.FpT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnFocusChangeListenerC35693FpT implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnFocusChangeListenerC35693FpT(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        String str;
        switch (this.A00) {
            case 0:
                if (!z) {
                    return;
                }
                C36685GFf c36685GFf = ((ELO) this.A02).A02;
                if (c36685GFf == null) {
                    str = "searchController";
                    break;
                } else {
                    if (!c36685GFf.A03) {
                        return;
                    }
                    ((View) this.A01).setVisibility(0);
                    return;
                }
            case 1:
                if (z) {
                    GFg gFg = (GFg) this.A02;
                    if (!gFg.A01) {
                        gFg.A01 = true;
                        gFg.A02.setVisibility(0);
                        InterfaceC169517hR interfaceC169517hR = gFg.A00;
                        if (interfaceC169517hR != null) {
                            interfaceC169517hR.Eby("");
                        } else {
                            str = "searchProvider";
                            break;
                        }
                    }
                }
                AbstractC25227BEk.A1Q((InterfaceC16660sJ) this.A01, z);
                return;
            default:
                EditPhoneNumberView editPhoneNumberView = (EditPhoneNumberView) this.A01;
                InterfaceC37212GaN interfaceC37212GaN = (InterfaceC37212GaN) this.A02;
                if (!editPhoneNumberView.A06) {
                    ViewGroup viewGroup = editPhoneNumberView.A00;
                    if (z) {
                        viewGroup.setBackgroundResource(R.drawable.input_highlighted);
                    } else {
                        viewGroup.setBackgroundResource(R.drawable.input);
                        return;
                    }
                } else if (!z) {
                    return;
                }
                interfaceC37212GaN.DYO();
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
