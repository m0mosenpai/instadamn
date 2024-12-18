package X;

import android.view.View;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.OkL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55466OkL implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC55466OkL(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, int i) {
        this.A00 = i;
        switch (i) {
            case 60:
            case 61:
                this.A01 = directPrivateStoryRecipientController;
                return;
            default:
                this.A01 = directPrivateStoryRecipientController;
                return;
        }
    }

    public static ViewOnClickListenerC55466OkL A01(Object obj, int i) {
        return new ViewOnClickListenerC55466OkL(obj, i);
    }

    public static void A02(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC55466OkL(obj, i), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0414, code lost:
    
        if (r1.ordinal() != 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0f1d, code lost:
    
        if (r0.CLv(r2) != false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0f42, code lost:
    
        if (((X.C47Z) r2.get(0)).A11() == false) goto L423;
     */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0daf  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r16) {
        /*
            Method dump skipped, instructions count: 4162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC55466OkL.onClick(android.view.View):void");
    }

    public static int A00(ViewOnClickListenerC55466OkL viewOnClickListenerC55466OkL, int i) {
        int A05 = C0f9.A05(i);
        N6M n6m = (N6M) viewOnClickListenerC55466OkL.A01;
        if (N6M.A06(n6m)) {
            n6m.DN6();
            return A05;
        }
        N6M.A03(n6m, false);
        return A05;
    }

    public ViewOnClickListenerC55466OkL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
