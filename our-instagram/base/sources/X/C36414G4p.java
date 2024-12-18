package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.G4p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36414G4p implements InterfaceC164997Zo {
    public final int A00;
    public final Object A01;

    public C36414G4p(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC164997Zo
    public final void AAx(MessageIdentifier messageIdentifier, long j) {
        int i;
        int i2;
        if (this.A00 != 0) {
            LnQ lnQ = ((L5W) this.A01).A0F;
            if (lnQ != null) {
                lnQ.AAx(messageIdentifier, j);
                return;
            }
            return;
        }
        FOg fOg = (FOg) this.A01;
        String str = fOg.A0K;
        if (C14360o3.A0K(str, "shared_stack")) {
            String str2 = fOg.A03;
            EnumC40111tc enumC40111tc = fOg.A01;
            if (str2 == null || enumC40111tc == null) {
                return;
            }
            AbstractC35247Fgg.A06(fOg.A05, enumC40111tc, new ME3(str2, fOg, 35));
            return;
        }
        boolean A0K = C14360o3.A0K(str, "challenges");
        String str3 = fOg.A03;
        if (A0K) {
            i = 2131954978;
            i2 = 2131954977;
        } else {
            i = 2131960205;
            i2 = 2131960208;
        }
        if (str3 == null) {
            return;
        }
        C193328hC A0H = AbstractC31171DnF.A0H(fOg.A05);
        A0H.A0A(i);
        A0H.A09(i2);
        A0H.A0L(new DialogInterfaceOnClickListenerC35334FiB(fOg, str3, false), 2131960204);
        A0H.A0D(DialogInterfaceOnClickListenerC35397FjG.A00);
        AbstractC31178DnM.A1R(A0H, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    @Override // X.InterfaceC164997Zo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F9q(android.view.View r10, X.InterfaceC129525tH r11, com.instagram.model.direct.messageid.MessageIdentifier r12, X.InterfaceC16820sZ r13, long r14) {
        /*
            r9 = this;
            int r0 = r9.A00
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r9.A01
            X.L5W r1 = (X.L5W) r1
            X.LnQ r2 = r1.A0F
            if (r2 == 0) goto L19
            r4 = 0
            r0 = 1
            X.GSz r6 = new X.GSz
            r5 = r12
            r6.<init>(r0, r1, r12)
            r3 = r10
            r7 = r14
            r2.F9q(r3, r4, r5, r6, r7)
        L19:
            return
        L1a:
            java.lang.Object r6 = r9.A01
            X.FOg r6 = (X.FOg) r6
            java.lang.String r1 = r6.A0K
            r7 = 1
            if (r1 == 0) goto L2a
            int r0 = r1.hashCode()
            switch(r0) {
                case -1782234803: goto L7f;
                case -697290194: goto L62;
                case 348943746: goto L5f;
                case 531959920: goto L4e;
                case 535918816: goto L36;
                default: goto L2a;
            }
        L2a:
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L19
            X.Dz7 r1 = r6.A0D
            boolean r0 = r6.A04
            r1.A0B(r2, r7, r0)
            return
        L36:
            java.lang.String r0 = "roll_call"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2a
            X.FRk r3 = r6.A0A
            X.Erk r2 = X.EnumC33511Erk.UNSEND_RESPONSE
            X.Dz7 r0 = r6.A0D
            java.lang.String r1 = r0.A0B
            com.instagram.model.direct.DirectThreadKey r0 = r6.A0J
            java.lang.String r0 = r0.A00
            r3.A02(r2, r1, r0)
            goto L2a
        L4e:
            java.lang.String r0 = "challenges"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2a
            java.lang.String r5 = r6.A03
            r4 = 2131954990(0x7f130d2e, float:1.9546495E38)
            r3 = 2131954989(0x7f130d2d, float:1.9546493E38)
            goto L8f
        L5f:
            java.lang.String r0 = "add_yours"
            goto L81
        L62:
            java.lang.String r0 = "shared_stack"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2a
            java.lang.String r4 = r6.A03
            X.1tc r3 = r6.A01
            if (r4 == 0) goto L19
            if (r3 == 0) goto L19
            android.app.Activity r2 = r6.A05
            r1 = 35
            X.ME3 r0 = new X.ME3
            r0.<init>(r4, r6, r1)
            X.AbstractC35247Fgg.A06(r2, r3, r0)
            return
        L7f:
            java.lang.String r0 = "questions"
        L81:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2a
            java.lang.String r5 = r6.A03
            r4 = 2131960207(0x7f13218f, float:1.9557076E38)
            r3 = 2131960208(0x7f132190, float:1.9557078E38)
        L8f:
            r2 = 2131960774(0x7f1323c6, float:1.9558226E38)
            if (r5 == 0) goto L19
            android.app.Activity r0 = r6.A05
            X.8hC r1 = X.AbstractC31171DnF.A0H(r0)
            r1.A0A(r4)
            r1.A09(r3)
            X.FiB r0 = new X.FiB
            r0.<init>(r6, r5, r7)
            r1.A0L(r0, r2)
            X.FjG r0 = X.DialogInterfaceOnClickListenerC35397FjG.A00
            r1.A0D(r0)
            X.AbstractC31178DnM.A1R(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36414G4p.F9q(android.view.View, X.5tH, com.instagram.model.direct.messageid.MessageIdentifier, X.0sZ, long):void");
    }

    @Override // X.InterfaceC164997Zo
    public final void F9s(MessageIdentifier messageIdentifier) {
        LnQ lnQ;
        if (this.A00 != 0 && (lnQ = ((L5W) this.A01).A0F) != null) {
            lnQ.F9s(messageIdentifier);
        }
    }
}
