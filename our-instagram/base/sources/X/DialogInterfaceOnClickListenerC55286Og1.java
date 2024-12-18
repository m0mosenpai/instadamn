package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Og1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55286Og1 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public DialogInterfaceOnClickListenerC55286Og1(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = z2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        boolean z2;
        P4X p4x;
        Long l;
        String A0V;
        String str;
        switch (this.A00) {
            case 0:
                P15 p15 = (P15) this.A01;
                boolean z3 = this.A03;
                boolean z4 = this.A02;
                C200108tF c200108tF = C200108tF.A01;
                UserSession userSession = p15.A02;
                if (z4) {
                    c200108tF.A0C(userSession, "REELS_ROW_SHARE", z3, true);
                    return;
                } else {
                    C200108tF.A02(userSession, z3);
                    return;
                }
            case 1:
                N6D.A01((N6D) this.A01, this.A03, this.A02);
                return;
            case 2:
                NP7 A02 = ((N6D) this.A01).A02();
                z = this.A03;
                z2 = this.A02;
                p4x = A02.A04;
                l = A02.A06;
                A0V = AbstractC50523MSb.A0V(A02.A03);
                str = A02.A07;
                p4x.A05(l, A0V, str, z, z2);
                return;
            case 3:
                N67.A00((N67) this.A01, this.A03, this.A02);
                return;
            default:
                C51011MgI A01 = ((N67) this.A01).A01();
                z = this.A03;
                z2 = this.A02;
                p4x = A01.A09;
                l = A01.A0B;
                A0V = AbstractC50523MSb.A0V(A01.A08);
                str = A01.A0C;
                p4x.A05(l, A0V, str, z, z2);
                return;
        }
    }
}
