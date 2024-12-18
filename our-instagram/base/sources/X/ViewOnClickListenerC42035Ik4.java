package X;

import android.view.View;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.Ik4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42035Ik4 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC42035Ik4(EffectsPageFragment effectsPageFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 52:
            case 53:
            case 54:
            case 55:
                this.A01 = effectsPageFragment;
                return;
            default:
                this.A01 = effectsPageFragment;
                return;
        }
    }

    public static ViewOnClickListenerC42035Ik4 A00(Object obj, int i) {
        return new ViewOnClickListenerC42035Ik4(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC42035Ik4(obj, i), view);
    }

    public static void A02(C50674MYs c50674MYs, Object obj, int i, int i2) {
        c50674MYs.A03(new ViewOnClickListenerC42035Ik4(obj, i), i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:111|112|113|114|(1:116)(1:149)|117|(2:145|146)|119|(3:139|140|(12:142|122|(1:124)|125|126|127|128|(1:130)(1:136)|131|(1:133)|134|135))|121|122|(0)|125|126|127|128|(0)(0)|131|(0)|134|135) */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:124:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0ps, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r27) {
        /*
            Method dump skipped, instructions count: 3358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC42035Ik4.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC42035Ik4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
