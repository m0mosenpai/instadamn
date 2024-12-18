package X;

import android.content.Context;
import android.view.View;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes9.dex */
public final class NAW extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new IgdsBottomButtonLayout(context, null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r7.A0S(36, false) != false) goto L16;
     */
    @Override // X.AbstractC65806TuP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r11, X.C6FG r12, X.C102884kP r13, java.lang.Object r14) {
        /*
            r10 = this;
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r11 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r11
            r6 = 0
            X.C14360o3.A0B(r11, r6)
            X.AbstractC167017dG.A1P(r12, r13)
            r5 = 36
            X.4kP r7 = r13.A08(r5)
            r8 = 38
            X.4kP r4 = r13.A08(r8)
            X.No3.A00(r12, r13, r11)
            r0 = 44
            r9 = 0
            if (r7 == 0) goto L88
            X.4lE r2 = r7.A0B(r0)
        L21:
            if (r4 == 0) goto L86
            X.4lE r3 = r4.A0B(r0)
        L27:
            if (r7 == 0) goto L84
            java.lang.String r1 = r7.A0J()
        L2d:
            X.ClD r0 = new X.ClD
            r0.<init>(r6, r12, r13, r2)
            r11.setPrimaryAction(r1, r0)
            if (r4 == 0) goto L82
            java.lang.String r2 = r4.A0J()
        L3b:
            r1 = 1
            X.ClD r0 = new X.ClD
            r0.<init>(r1, r12, r13, r3)
            r11.setSecondaryAction(r2, r0)
            r2 = 0
            if (r7 == 0) goto L55
            boolean r0 = r7.A0S(r8, r6)
            r11.setPrimaryActionIsLoading(r0)
            boolean r1 = r7.A0S(r5, r6)
            r0 = 1
            if (r1 == 0) goto L56
        L55:
            r0 = 0
        L56:
            r11.setPrimaryButtonEnabled(r0)
            if (r4 == 0) goto L62
            boolean r0 = r4.A0S(r5, r6)
            if (r0 != 0) goto L62
            r2 = 1
        L62:
            r11.setSecondaryButtonEnabled(r2)
            java.lang.String r2 = r13.A0F()
            if (r2 == 0) goto L8a
            int r1 = r2.hashCode()
            r0 = 1843117444(0x6ddbbd84, float:8.500791E27)
            if (r1 != r0) goto L8a
            java.lang.String r0 = "on_media"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8a
            X.64R r0 = X.C64R.A03
            r11.setButtonType(r0)
            return r9
        L82:
            r2 = r9
            goto L3b
        L84:
            r1 = r9
            goto L2d
        L86:
            r3 = r9
            goto L27
        L88:
            r2 = r9
            goto L21
        L8a:
            X.64R r0 = X.C64R.A02
            r11.setButtonType(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NAW.A0K(android.view.View, X.6FG, X.4kP, java.lang.Object):java.lang.Object");
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        C64P c64p = (C64P) view;
        C14360o3.A0B(c64p, 0);
        c64p.setPrimaryAction(null, null);
        c64p.setSecondaryAction(null, null);
        c64p.setOnClickListener(null);
        c64p.setButtonType(C64R.A02);
        c64p.setSecondaryButtonEnabled(true);
        c64p.setPrimaryButtonEnabled(true);
        c64p.setPrimaryActionIsLoading(false);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public NAW(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
