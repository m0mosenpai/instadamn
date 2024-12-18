package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Ogn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnShowListenerC55325Ogn implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnShowListenerC55325Ogn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                C191578eE.A06((C191578eE) this.A01);
                return;
            case 1:
                ((C25866BcL) ((C26778Brz) this.A01).A09.getValue()).A06.F8m(C29234Cud.A00);
                return;
            case 2:
                C14360o3.A0C(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                DialogC12630l8 dialogC12630l8 = (DialogC12630l8) dialogInterface;
                View findViewById = dialogC12630l8.findViewById(R.id.design_bottom_sheet);
                C14360o3.A0C(findViewById, AbstractC111324zv.A00(1));
                BottomSheetBehavior A01 = BottomSheetBehavior.A01(findViewById);
                C14360o3.A07(A01);
                A01.A0W(3);
                A01.A0N = true;
                C00M c00m = dialogC12630l8.A01;
                Fragment fragment = (Fragment) this.A01;
                C00N.A00(c00m, fragment, new C57743PjW(fragment, 4));
                return;
            case 3:
                ((InterfaceC58153PqI) this.A01).onShow();
                return;
            case 4:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 5:
                Window window = ((Dialog) ((PCT) this.A01).A0X.getValue()).getWindow();
                if (window == null) {
                    return;
                }
                window.setLayout(-1, -1);
                return;
            case 6:
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(((ENX) this.A01).A02()));
                A0w.E77("has_seen_public_collections_modal_nux", true);
                A0w.apply();
                return;
            default:
                C50685MZd.A00((C50685MZd) this.A01).A0B(false);
                return;
        }
    }
}
