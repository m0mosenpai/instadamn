package X;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: X.IfJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41803IfJ implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C42812Iwo A01;
    public final /* synthetic */ String A02;

    public DialogInterfaceOnClickListenerC41803IfJ(C42812Iwo c42812Iwo, String str, int i) {
        this.A01 = c42812Iwo;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C42812Iwo c42812Iwo = this.A01;
        HHH hhh = (HHH) c42812Iwo.A01;
        AbstractC35260Fgu.A02(hhh.A03.requireContext(), hhh.A04, hhh.A05, hhh.A0E, null, this.A02, (List) c42812Iwo.A02, this.A00);
        hhh.A02();
    }
}
