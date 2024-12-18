package X;

/* loaded from: classes11.dex */
public abstract class VQL {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6FW r4) {
        /*
            java.lang.Object r2 = r4.A01()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.C14360o3.A0C(r2, r0)
            X.6FG r2 = (X.C6FG) r2
            java.lang.Object r3 = r4.A02()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C14360o3.A0C(r3, r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r4.A00()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C14360o3.A0C(r1, r0)
            X.4kP r1 = (X.C102884kP) r1
            java.lang.String r4 = r1.A0E()
            if (r4 == 0) goto Lef
            X.2tQ r0 = r2.A02
            X.2tP r0 = (X.C62862tP) r0
            X.6kW r2 = X.AbstractC147456kV.A00(r0)
            int r0 = r3.hashCode()
            java.lang.String r1 = "show_captions"
            switch(r0) {
                case -1714437718: goto L49;
                case -840405966: goto L50;
                case 3363353: goto L6b;
                case 3443508: goto L8d;
                case 3540994: goto L99;
                case 1690109519: goto Lb6;
                default: goto L38;
            }
        L38:
            java.lang.String r0 = "Received unknown action: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r3)
            r0 = 759(0x2f7, float:1.064E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.AbstractC25241Le.A02(r0, r1)
        L47:
            r0 = 0
            return r0
        L49:
            java.lang.String r0 = "hide_captions"
            boolean r0 = r3.equals(r0)
            goto Lba
        L50:
            java.lang.String r0 = "unmute"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L38
            X.6Oi r1 = r2.A00(r4)
            if (r1 == 0) goto L47
            java.util.HashMap r0 = r2.A03
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Le5
            X.VBk r0 = (X.C68106VBk) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L84
        L6b:
            java.lang.String r0 = "mute"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L38
            X.6Oi r1 = r2.A00(r4)
            if (r1 == 0) goto L47
            java.util.HashMap r0 = r2.A03
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lea
            X.VBk r0 = (X.C68106VBk) r0
            r2 = 0
        L84:
            r1 = 0
            X.4QW r0 = r0.A02
            if (r0 == 0) goto L47
            r0.EhI(r2, r1)
            goto L47
        L8d:
            java.lang.String r0 = "play"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L38
            r2.A03(r4)
            goto L47
        L99:
            java.lang.String r0 = "stop"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L38
            X.6Oi r1 = r2.A00(r4)
            if (r1 == 0) goto L47
            java.util.HashMap r0 = r2.A03
            java.lang.Object r1 = r0.get(r1)
            X.VBk r1 = (X.C68106VBk) r1
            if (r1 == 0) goto L47
            r0 = 1
            r1.A00(r0)
            goto L47
        Lb6:
            boolean r0 = r3.equals(r1)
        Lba:
            if (r0 == 0) goto L38
            boolean r3 = r3.equals(r1)
            X.6Oi r2 = r2.A00(r4)
            if (r2 == 0) goto L47
            X.3sY r0 = r2.A00
            if (r0 == 0) goto Le3
            X.2jc r0 = r0.A03
            android.view.View r1 = r0.A01()
        Ld0:
            X.4kP r0 = r2.A04
            java.lang.String r0 = r0.A0F()
            if (r0 == 0) goto L47
            if (r1 == 0) goto L47
            int r0 = X.AbstractC167007dF.A05(r3)
            r1.setVisibility(r0)
            goto L47
        Le3:
            r1 = 0
            goto Ld0
        Le5:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        Lea:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        Lef:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VQL.A00(X.6FW):java.lang.Object");
    }
}
