package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class G9A implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public G9A(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = interfaceC103384lE;
                this.A02 = c6fq;
                break;
            default:
                this.A02 = interfaceC103384lE;
                this.A01 = c6fq;
                break;
        }
    }

    public static void A00(C146106i8 c146106i8, Object obj, Object obj2, int i) {
        c146106i8.A0A = new G9A(i, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC58152PqH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onButtonClick(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G9A.onButtonClick(android.view.View):void");
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        switch (this.A00) {
            case 5:
                ((ELS) this.A02).A04 = null;
                return;
            case 10:
                ((C006802i) this.A02).markerEnd(834865936, (short) 2);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        if (10 - this.A00 == 0) {
            ((C006802i) this.A02).markerStart(834865936);
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public G9A(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
