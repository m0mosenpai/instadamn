package X;

import android.content.DialogInterface;
import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;

/* renamed from: X.Ofy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55283Ofy implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ OXR A01;
    public final /* synthetic */ NonSupportedContentSchedulingFeatures A02;

    public DialogInterfaceOnClickListenerC55283Ofy(DialogInterface.OnClickListener onClickListener, OXR oxr, NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures) {
        this.A01 = oxr;
        this.A02 = nonSupportedContentSchedulingFeatures;
        this.A00 = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures;
        OXR oxr = this.A01;
        if (oxr != null && (nonSupportedContentSchedulingFeatures = this.A02) != null) {
            C151866sW.A05(oxr, nonSupportedContentSchedulingFeatures);
        }
        this.A00.onClick(dialogInterface, i);
    }
}
