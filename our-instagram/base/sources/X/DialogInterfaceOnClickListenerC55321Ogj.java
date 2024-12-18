package X;

import android.content.DialogInterface;

/* renamed from: X.Ogj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55321Ogj implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DialogInterfaceOnClickListenerC55321Ogj(C51947MxU c51947MxU, C26777Bry c26777Bry, int i) {
        this.A00 = i;
        if (34 - i != 0) {
            this.A01 = c51947MxU;
            this.A02 = c26777Bry;
        } else {
            this.A02 = c26777Bry;
            this.A01 = c51947MxU;
        }
    }

    public static DialogInterfaceOnClickListenerC55321Ogj A00(Object obj, Object obj2, int i) {
        return new DialogInterfaceOnClickListenerC55321Ogj(i, obj, obj2);
    }

    public static void A01(C193328hC c193328hC, Object obj, Object obj2, int i, int i2) {
        c193328hC.A0J(new DialogInterfaceOnClickListenerC55321Ogj(i, obj, obj2), i2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.content.DialogInterface r22, int r23) {
        /*
            Method dump skipped, instructions count: 2524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnClickListenerC55321Ogj.onClick(android.content.DialogInterface, int):void");
    }

    public DialogInterfaceOnClickListenerC55321Ogj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
