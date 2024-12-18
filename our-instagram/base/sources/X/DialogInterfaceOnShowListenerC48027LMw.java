package X;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Window;

/* renamed from: X.LMw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnShowListenerC48027LMw implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnShowListenerC48027LMw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C23031Ai A00;
        boolean z;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        Window window;
        switch (this.A00) {
            case 0:
                AbstractC44331JiW abstractC44331JiW = (AbstractC44331JiW) this.A01;
                if (dialogInterface == null || (window = ((Dialog) dialogInterface).getWindow()) == null) {
                    return;
                }
                window.setBackgroundDrawable(abstractC44331JiW);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.addUpdateListener(abstractC44331JiW.getAnimatorListener());
                valueAnimator.setRepeatCount(0);
                valueAnimator.setDuration(200L);
                float[] A1b = AbstractC43592JPx.A1b();
                // fill-array-data instruction
                A1b[0] = 0.0f;
                A1b[1] = 1.0f;
                valueAnimator.setFloatValues(A1b);
                AbstractC43593JPy.A18(valueAnimator);
                valueAnimator.start();
                return;
            case 1:
                A00 = AbstractC23021Ah.A00(((C25814BbV) this.A01).A0E);
                z = true;
                interfaceC16530ry = A00.A7N;
                c0yrArr = C23031Ai.A8c;
                i = 281;
                break;
            case 2:
                A00 = ((C47614L0z) this.A01).A02;
                z = true;
                interfaceC16530ry = A00.A2x;
                c0yrArr = C23031Ai.A8c;
                i = 323;
                break;
            case 3:
                KB1 kb1 = (KB1) this.A01;
                InterfaceC09390do interfaceC09390do = kb1.A00;
                AbstractC43592JPx.A0b(interfaceC09390do).A07("ENTRY_POINT", AbstractC46735Kls.A00(LLQ.A02(kb1)));
                AbstractC43592JPx.A0b(interfaceC09390do).A08("IS_OTC_V2", true);
                return;
            case 4:
                KB2 kb2 = (KB2) this.A01;
                C44525JmV c44525JmV = (C44525JmV) kb2.A02.getValue();
                Integer A02 = LLQ.A02(kb2);
                C14360o3.A0B(A02, 0);
                KPC kpc = c44525JmV.A03;
                kpc.A05("OTC_DISPLAY_CODE_IMPRESSION");
                kpc.A07("ENTRY_POINT", AbstractC46735Kls.A00(A02));
                return;
            case 5:
                AbstractC43592JPx.A0b(((C45808KPn) this.A01).A02).A05("OTC_RESTORE_EXIT_DIALOG_IMPRESSION");
                return;
            case 6:
            case 7:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 8:
                C45510KCz.A03((C45510KCz) this.A01).A05(false);
                return;
        }
        AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i, z);
    }
}
