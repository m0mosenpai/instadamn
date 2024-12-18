package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.business.fragment.AccountTypeSelectionV2Fragment;

/* renamed from: X.FpJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35684FpJ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ViewOnClickListenerC35684FpJ(ViewGroup viewGroup, ViewGroup viewGroup2, AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment, int i) {
        this.A00 = i;
        this.A01 = accountTypeSelectionV2Fragment;
        if (4 - i != 0) {
            this.A03 = viewGroup;
            this.A02 = viewGroup2;
        } else {
            this.A02 = viewGroup;
            this.A03 = viewGroup2;
        }
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        C0fQ.A00(new ViewOnClickListenerC35684FpJ(i, obj, obj2, obj3), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0582, code lost:
    
        if (r2 == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x08dc, code lost:
    
        if (r2 == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x1380, code lost:
    
        if (r2 == 0) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x1512, code lost:
    
        if (r1 == 0) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x1523, code lost:
    
        if (r1 != true) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x1555, code lost:
    
        if (r0.getTranslationY() == 0.0f) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x196d, code lost:
    
        if (r1.EiP(r3) == false) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x1a69, code lost:
    
        if (r7.length() == 0) goto L616;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0ed1 A[LOOP:4: B:372:0x0e9c->B:381:0x0ed1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0ecd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v137, types: [androidx.fragment.app.Fragment, X.END, X.2oe] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r28) {
        /*
            Method dump skipped, instructions count: 7900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC35684FpJ.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC35684FpJ(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A03 = obj2;
    }
}
