package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class NED extends AbstractC66412zI {
    public final InterfaceC58184Pqp A00;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r7 != false) goto L11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0037. Please report as an issue. */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r11, X.C3OO r12) {
        /*
            r10 = this;
            X.OvV r11 = (X.C56110OvV) r11
            X.MlE r12 = (X.C51291MlE) r12
            r3 = 0
            boolean r1 = X.AbstractC167007dF.A1R(r3, r11, r12)
            X.Ngz r9 = r11.A01
            java.lang.String r5 = r11.A02
            boolean r6 = r11.A04
            boolean r7 = r11.A03
            android.view.View$OnClickListener r8 = r11.A00
            X.C14360o3.A0B(r9, r3)
            com.instagram.igds.components.textcell.IgdsListCell r2 = r12.A02
            android.content.Context r4 = r12.A00
            int r0 = r9.A00
            java.lang.String r0 = X.AbstractC166997dE.A0p(r4, r0)
            r2.A0I(r0)
            java.lang.Integer r0 = r9.A01
            if (r0 == 0) goto L32
            int r0 = r0.intValue()
            java.lang.String r0 = X.AbstractC166997dE.A0p(r4, r0)
            r2.A0H(r0)
        L32:
            int r0 = r9.ordinal()
            r4 = 0
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L6d;
                case 2: goto L3a;
                case 3: goto L3a;
                case 4: goto L3a;
                case 5: goto L56;
                case 6: goto L75;
                case 7: goto L9a;
                case 8: goto L7d;
                case 9: goto L88;
                case 10: goto L88;
                case 11: goto Lb1;
                case 12: goto La2;
                case 13: goto Lbc;
                default: goto L3a;
            }
        L3a:
            X.Nga r0 = X.EnumC53237Nga.A08
            r2.setTextCellType(r0)
            if (r6 == 0) goto L44
            r0 = 1
            if (r7 == 0) goto L45
        L44:
            r0 = 0
        L45:
            r2.setChecked(r0)
            if (r7 != 0) goto L69
            r2.setEnabled(r1)
            X.P3T r0 = new X.P3T
            r0.<init>(r12, r3)
        L52:
            r2.A0E(r0)
            return
        L56:
            X.Nga r0 = X.EnumC53237Nga.A08
            r2.setTextCellType(r0)
            r2.setChecked(r6)
            java.lang.String r0 = ""
            r2.A0H(r0)
            X.P3T r0 = new X.P3T
            r0.<init>(r12, r1)
            goto L52
        L69:
            r2.setEnabled(r3)
            return
        L6d:
            X.Nga r0 = X.EnumC53237Nga.A04
            r2.setTextCellType(r0)
            r0 = 47
            goto L84
        L75:
            X.Nga r0 = X.EnumC53237Nga.A04
            r2.setTextCellType(r0)
            r0 = 48
            goto L84
        L7d:
            X.Nga r0 = X.EnumC53237Nga.A04
            r2.setTextCellType(r0)
            r0 = 49
        L84:
            X.ViewOnClickListenerC55467OkM.A00(r2, r0, r12)
            goto Laa
        L88:
            X.Nga r0 = X.EnumC53237Nga.A08
            r2.setTextCellType(r0)
            r2.setChecked(r6)
            r1 = 2
            X.P3T r0 = new X.P3T
            r0.<init>(r12, r1)
            r2.A0E(r0)
            goto Laa
        L9a:
            X.Nga r0 = X.EnumC53237Nga.A04
            r2.setTextCellType(r0)
            r0 = 50
            goto Lb8
        La2:
            X.Nga r0 = X.EnumC53237Nga.A04
            r2.setTextCellType(r0)
            X.C0fQ.A00(r8, r2)
        Laa:
            X.C14360o3.A0B(r5, r3)
            r2.A0J(r5, r4, r3)
            return
        Lb1:
            X.Nga r0 = X.EnumC53237Nga.A04
            r2.setTextCellType(r0)
            r0 = 51
        Lb8:
            X.ViewOnClickListenerC55467OkM.A00(r2, r0, r12)
            return
        Lbc:
            X.Nga r0 = X.EnumC53237Nga.A04
            r2.setTextCellType(r0)
            X.C14360o3.A0B(r5, r3)
            r2.A0J(r5, r4, r3)
            X.C0fQ.A00(r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NED.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56110OvV.class;
    }

    public NED(InterfaceC58184Pqp interfaceC58184Pqp) {
        this.A00 = interfaceC58184Pqp;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context A04 = AbstractC31176DnK.A04(viewGroup);
        return new C51291MlE(A04, this.A00, AbstractC31174DnI.A0Z(A04));
    }
}
