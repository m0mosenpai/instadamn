package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;

/* loaded from: classes4.dex */
public final class AP9 implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public AP9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener;
        InterfaceC19610xo A0w;
        String A00;
        switch (this.A00) {
            case 0:
                A0w = AbstractC166987dD.A0w((C23031Ai) this.A01);
                A00 = AbstractC111324zv.A00(2441);
                AbstractC167007dF.A17(A0w, A00);
                return;
            case 1:
                APn aPn = (APn) this.A01;
                A0w = C1AT.A01(aPn.A0K).A04(C1AV.A36, aPn.getClass()).ARD();
                A00 = "has_seen_mention_sharing_privacy_nux";
                AbstractC167007dF.A17(A0w, A00);
                return;
            case 2:
                ((C148086le) this.A01).A01(null);
                return;
            case 3:
                ((CompoundButton) this.A01).setChecked(false);
                return;
            case 4:
                onShowListener = (DialogInterface.OnShowListener) this.A01;
                onShowListener.onShow(dialogInterface);
                return;
            case 5:
                C34645FOc c34645FOc = (C34645FOc) this.A01;
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = c34645FOc.A05.getWindow();
                if (window != null) {
                    layoutParams.copyFrom(window.getAttributes());
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    int A08 = (int) (AbstractC166987dD.A08(window.getDecorView()) / Resources.getSystem().getDisplayMetrics().density);
                    Context context = c34645FOc.A06;
                    C14360o3.A0C(context, AbstractC43591JPw.A00(4));
                    ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    int i = ((int) (displayMetrics.heightPixels / Resources.getSystem().getDisplayMetrics().density)) - 120;
                    if (A08 > i) {
                        ((ViewGroup.LayoutParams) layoutParams).height = (int) (i * Resources.getSystem().getDisplayMetrics().density);
                    }
                    window.setAttributes(layoutParams);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 6:
                onShowListener = ((DialogC31731Dwc) this.A01).A00;
                if (onShowListener == null) {
                    return;
                }
                onShowListener.onShow(dialogInterface);
                return;
            default:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                    return;
                }
                return;
        }
    }
}
