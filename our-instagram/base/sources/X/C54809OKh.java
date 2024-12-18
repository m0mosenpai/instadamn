package X;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.OKh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54809OKh {
    public final DialogInterface.OnDismissListener A00;
    public final AbstractC10360h2 A01;
    public final C52770NXa A02;

    public C54809OKh(DialogInterface.OnDismissListener onDismissListener, AbstractC10360h2 abstractC10360h2, Integer num) {
        String str;
        this.A01 = abstractC10360h2;
        this.A00 = onDismissListener;
        C52770NXa c52770NXa = new C52770NXa();
        this.A02 = c52770NXa;
        Bundle A0b = AbstractC166987dD.A0b();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    str = "isArchiving";
                } else {
                    str = "isUpdating";
                }
            } else {
                str = "isRemoving";
            }
        } else {
            str = "isDeleting";
        }
        A0b.putBoolean(str, true);
        c52770NXa.setArguments(A0b);
    }

    public final void A00() {
        C52770NXa c52770NXa = this.A02;
        if (c52770NXa.isResumed()) {
            c52770NXa.A08();
            DialogInterface.OnDismissListener onDismissListener = this.A00;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(new DialogInterfaceC55330Ogs());
            }
        }
    }

    public final void A01() {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        if (abstractC10360h2.A0Q("ProgressDialog") == null && C06P.A01(abstractC10360h2) && !abstractC10360h2.A0G) {
            C52770NXa c52770NXa = this.A02;
            if (!c52770NXa.isAdded()) {
                c52770NXa.A0B(abstractC10360h2, "ProgressDialog");
            }
        }
    }
}
