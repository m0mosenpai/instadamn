package X;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.FnZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35582FnZ implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ C35166FfG A02;

    public ViewOnClickListenerC35582FnZ(DialogInterface.OnClickListener onClickListener, C35166FfG c35166FfG, int i) {
        this.A02 = c35166FfG;
        this.A01 = onClickListener;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-652198130);
        DialogInterface.OnClickListener onClickListener = this.A01;
        DialogC31731Dwc dialogC31731Dwc = this.A02.A0D;
        onClickListener.onClick(dialogC31731Dwc, this.A00);
        dialogC31731Dwc.dismiss();
        C0f9.A0C(-1123481642, A05);
    }
}
