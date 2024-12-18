package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.FzJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36266FzJ implements InterfaceC13000lm {
    public InterfaceC37176GZn A00;

    public String A00() {
        int i;
        if (this instanceof EgZ) {
            i = 2827;
        } else {
            i = 2272;
        }
        return AbstractC111324zv.A00(i);
    }

    public void A01() {
        C23031Ai A00;
        boolean z;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        if (this instanceof EgZ) {
            EgZ egZ = (EgZ) this;
            if (!egZ.A00) {
                boolean z2 = egZ.A01;
                A00 = AbstractC23021Ah.A00(egZ.A03);
                z = true;
                if (z2) {
                    interfaceC16530ry = A00.A4N;
                    c0yrArr = C23031Ai.A8c;
                    i = 87;
                } else {
                    interfaceC16530ry = A00.A4O;
                    c0yrArr = C23031Ai.A8c;
                    i = 88;
                }
            } else {
                A00 = AbstractC23021Ah.A00(egZ.A03);
                z = true;
                interfaceC16530ry = A00.A4M;
                c0yrArr = C23031Ai.A8c;
                i = 89;
            }
            AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i, z);
        }
    }

    public boolean A03() {
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        C23031Ai A00;
        InterfaceC16530ry interfaceC16530ry2;
        C0YR[] c0yrArr2;
        int i2;
        if (this instanceof EgZ) {
            EgZ egZ = (EgZ) this;
            if (!egZ.A02) {
                if (!egZ.A00) {
                    boolean z = egZ.A01;
                    A00 = AbstractC23021Ah.A00(egZ.A03);
                    if (z) {
                        interfaceC16530ry2 = A00.A4N;
                        c0yrArr2 = C23031Ai.A8c;
                        i2 = 87;
                    } else {
                        interfaceC16530ry2 = A00.A4O;
                        c0yrArr2 = C23031Ai.A8c;
                        i2 = 88;
                    }
                } else {
                    A00 = AbstractC23021Ah.A00(egZ.A03);
                    interfaceC16530ry2 = A00.A4M;
                    c0yrArr2 = C23031Ai.A8c;
                    i2 = 89;
                }
                if (AbstractC167017dG.A1b(A00, interfaceC16530ry2, c0yrArr2, i2)) {
                    return false;
                }
            }
            return true;
        }
        EgY egY = (EgY) this;
        boolean z2 = egY.A00;
        C23031Ai A002 = AbstractC23021Ah.A00(egY.A01);
        if (z2) {
            interfaceC16530ry = A002.A2t;
            c0yrArr = C23031Ai.A8c;
            i = 424;
        } else {
            interfaceC16530ry = A002.A2r;
            c0yrArr = C23031Ai.A8c;
            i = 423;
        }
        if (!AbstractC167017dG.A1b(A002, interfaceC16530ry, c0yrArr, i)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (this instanceof EgZ) {
            ((EgZ) this).A03.A03(EgZ.class);
        }
    }

    public final void A02(Context context, Bundle bundle) {
        if (!A03()) {
            InterfaceC37176GZn interfaceC37176GZn = this.A00;
            if (interfaceC37176GZn != null) {
                interfaceC37176GZn.DxT();
                return;
            }
            return;
        }
        if (bundle == null) {
            bundle = AbstractC166987dD.A0b();
        }
        bundle.putString("bottom_sheet_content_fragment", A00());
        C6XJ.A06(context, bundle, TransparentModalActivity.class, "bottom_sheet");
        A01();
    }
}
