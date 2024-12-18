package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.R;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class Q7i extends C0SG {
    public InterfaceC65340TiL A00;
    public WO6 A01;

    public final boolean A0G() {
        ArrayList parcelableArrayList;
        if (this instanceof QEJ) {
            Bundle bundle = this.mArguments;
            if (bundle == null) {
                return false;
            }
            if (C0B1.A01(AutofillData.CREATOR, bundle.getParcelable("contact_info"), AutofillData.class) == null) {
                return false;
            }
        } else if (this instanceof QE6) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 == null || (parcelableArrayList = bundle2.getParcelableArrayList("contact_entries")) == null || parcelableArrayList.isEmpty()) {
                return false;
            }
        } else if (!(this instanceof QE9) && !(this instanceof QEB)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1774957017);
        Window window = super.A01.getWindow();
        window.setBackgroundDrawableResource(R.drawable.bottom_sheet_background);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.windowAnimations = R.style.bottom_sheet_animation;
        window.setAttributes(attributes);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C0f9.A09(385776366, A02);
        return onCreateView;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public void onStart() {
        int A02 = C0f9.A02(-292906859);
        super.onStart();
        InterfaceC65340TiL interfaceC65340TiL = this.A00;
        if (interfaceC65340TiL != null) {
            interfaceC65340TiL.DAA();
            this.A00 = null;
        }
        Dialog dialog = super.A01;
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -2);
        }
        C0f9.A09(514735181, A02);
    }
}
