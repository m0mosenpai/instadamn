package X;

import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.Bnh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26522Bnh extends AbstractC51572Yf {
    public final BX7 A00;
    public final int A01;
    public final TextView.OnEditorActionListener A02;
    public final C51722Yv A03;
    public final EnumC25697BXh A04;
    public final C88 A05;
    public final AbstractC27839CPc A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC16820sZ A0A;
    public final boolean A0B;

    public C26522Bnh(TextView.OnEditorActionListener onEditorActionListener, C51722Yv c51722Yv, BX7 bx7, EnumC25697BXh enumC25697BXh, C88 c88, AbstractC27839CPc abstractC27839CPc, CharSequence charSequence, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, boolean z) {
        AbstractC167017dG.A1P(charSequence, bx7);
        this.A08 = charSequence;
        this.A00 = bx7;
        this.A07 = "";
        this.A01 = i;
        this.A0B = z;
        this.A0A = interfaceC16820sZ;
        this.A09 = interfaceC16820sZ2;
        this.A04 = enumC25697BXh;
        this.A02 = onEditorActionListener;
        this.A06 = abstractC27839CPc;
        this.A03 = c51722Yv;
        this.A05 = c88;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C29905DGt A01;
        C29477Cyr c29477Cyr;
        Integer num;
        Integer num2;
        InterfaceC30923Dia A00 = AbstractC28337CeP.A00(c76223bS);
        boolean CSM = A00.CSM();
        InterfaceC31128DmB A002 = C28351CfB.A00(A00);
        boolean z = this.A0B;
        if (!z) {
            A01 = null;
        } else {
            A01 = C29905DGt.A01(this, 34);
        }
        AbstractC27839CPc abstractC27839CPc = this.A06;
        if (abstractC27839CPc != null) {
            if (A002.EKG(abstractC27839CPc.A00)) {
                C27338C4t c27338C4t = (C27338C4t) abstractC27839CPc;
                C87 c87 = c27338C4t.A00;
                int EKE = A002.EKE(c27338C4t.A02, CSM);
                int EKE2 = A002.EKE(c27338C4t.A01, CSM);
                int EKF = A002.EKF(c27338C4t.A03);
                InterfaceC16820sZ interfaceC16820sZ = c27338C4t.A07;
                c29477Cyr = new C29477Cyr(C27338C4t.A00(A002, c27338C4t), c87, Integer.valueOf(EKE2), Integer.valueOf(EKE), c27338C4t.A05, c27338C4t.A06, interfaceC16820sZ, EKF, c27338C4t.A08);
            } else {
                c29477Cyr = null;
            }
        } else {
            c29477Cyr = null;
        }
        int max = Math.max(this.A01, 1);
        CharSequence charSequence = this.A07;
        CharSequence charSequence2 = this.A08;
        C7F c7f = C7F.A04;
        C88 c88 = this.A05;
        Integer num3 = C29468Cyi.A08;
        if (abstractC27839CPc != null) {
            num = C05F.A06;
        } else {
            num = num3;
        }
        if (abstractC27839CPc != null) {
            num2 = ((C27338C4t) abstractC27839CPc).A04;
        } else {
            num2 = C29468Cyi.A09;
        }
        C29468Cyi c29468Cyi = new C29468Cyi(c29477Cyr, c88, num3, num, num2, max);
        BX7 bx7 = this.A00;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A0A;
        InterfaceC16820sZ interfaceC16820sZ3 = this.A09;
        EnumC25697BXh enumC25697BXh = this.A04;
        TextView.OnEditorActionListener onEditorActionListener = this.A02;
        C51722Yv c51722Yv = this.A03;
        if (c51722Yv == null) {
            c51722Yv = C51722Yv.A02;
        }
        C26521Bng c26521Bng = new C26521Bng(onEditorActionListener, c51722Yv, bx7, enumC25697BXh, c7f, c29468Cyi, charSequence2, charSequence, interfaceC16820sZ2, interfaceC16820sZ3, A01, z);
        if (abstractC27839CPc != null && !A002.EKG(abstractC27839CPc.A00)) {
            EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
            C2XE c2xe = c76223bS.A05;
            ArrayList A1E = AbstractC166987dD.A1E();
            C14360o3.A0B(c2xe, 1);
            A1E.add(c26521Bng);
            C27338C4t c27338C4t2 = (C27338C4t) abstractC27839CPc;
            C87 c872 = c27338C4t2.A00;
            String str = c27338C4t2.A06;
            A1E.add(new C26511BnW(C27338C4t.A00(A002, c27338C4t2), c872, null, Integer.valueOf(A002.EKE(c27338C4t2.A01, CSM)), Integer.valueOf(A002.EKE(c27338C4t2.A02, CSM)), str, c27338C4t2.A07, A002.EKF(c27338C4t2.A03), true));
            return new C2WH(null, enumC77683ds, null, null, null, A1E, false);
        }
        return c26521Bng;
    }
}
