package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebookpay.common.models.ErrorDialogContent;

/* loaded from: classes11.dex */
public abstract class WF6 {
    public static final void A01(Context context, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        C14360o3.A0B(interfaceC16820sZ, 3);
        SNQ A0H = C2FP.A0H();
        Drawable A03 = C2FP.A0A().A03(context);
        String A0p = AbstractC166997dE.A0p(context, i);
        AbstractC65702TsY.A0v(context, new C63198Sf0(null, null, new WHP(interfaceC16820sZ, 7), A03, AbstractC166997dE.A0p(context, i2), null, AbstractC166997dE.A0p(context, 2131961437), A0p, 0, 0, 0, 0, 2, 0, 0, true), A0H);
    }

    public static final void A00(Context context, VEJ vej, Throwable th, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        C63167SeR c63167SeR;
        String str;
        String str2;
        AbstractC167007dF.A1E(context, 0, interfaceC16660sJ);
        if (th instanceof REZ) {
            c63167SeR = AbstractC63238Sfs.A00((REZ) th);
        } else {
            c63167SeR = new C63167SeR(new ErrorDialogContent(vej, null, null, null, 2131961424, 2131961423, null, null, null, null));
        }
        ErrorDialogContent errorDialogContent = (ErrorDialogContent) c63167SeR.A02();
        if (errorDialogContent != null) {
            SNQ A0H = C2FP.A0H();
            Drawable A03 = C2FP.A0A().A03(context);
            String A05 = errorDialogContent.A05(context);
            String A02 = errorDialogContent.A02(context);
            String A032 = errorDialogContent.A03(context);
            EnumC68186VFe A00 = errorDialogContent.A00();
            boolean A06 = errorDialogContent.A06();
            C69075VhQ c69075VhQ = errorDialogContent.A00;
            if (c69075VhQ != null) {
                str = c69075VhQ.A02;
            } else {
                str = null;
            }
            String A04 = errorDialogContent.A04(context);
            EnumC68186VFe A01 = errorDialogContent.A01();
            C69075VhQ c69075VhQ2 = errorDialogContent.A01;
            if (c69075VhQ2 != null) {
                str2 = c69075VhQ2.A02;
            } else {
                str2 = null;
            }
            AbstractC65702TsY.A0v(context, AbstractC69850Vwb.A01(A03, A00, A01, new C71690Wyp(interfaceC16660sJ), new C71692Wyr(interfaceC16820sZ), A05, A02, A032, str, A04, str2, A06), A0H);
        }
    }

    public static final void A02(Context context, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        WHP whp;
        int i6;
        boolean A1U = AbstractC167007dF.A1U(interfaceC16820sZ2);
        C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36314489656052376L);
        SNQ A0H = C2FP.A0H();
        if (C18U.A06(C06090Tz.A06, C2FP.A0D().A00, 36314489656052376L)) {
            i = 2131961494;
            i2 = 2131961491;
            i3 = 2131961492;
            i4 = 2131961493;
            i5 = 2131961304;
            whp = new WHP(interfaceC16820sZ, 8);
            i6 = 9;
        } else {
            i = 2131961457;
            i2 = 2131961440;
            i3 = 2131961444;
            i4 = 2131961439;
            i5 = 2131961304;
            whp = new WHP(interfaceC16820sZ, 10);
            i6 = 11;
        }
        AbstractC65702TsY.A0v(context, AbstractC69850Vwb.A00(whp, new WHP(interfaceC16820sZ2, i6), i, i2, i3, i4, i5, A1U ? 1 : 0), A0H);
    }

    public static final void A03(Context context, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        boolean A1U = AbstractC167007dF.A1U(interfaceC16820sZ2);
        AbstractC65702TsY.A0v(context, AbstractC69850Vwb.A00(new WHP(interfaceC16820sZ, 12), new WHP(interfaceC16820sZ2, 13), 2131961494, 2131961520, 2131961492, 2131961493, 2131961304, A1U ? 1 : 0), C2FP.A0H());
    }

    public static final void A04(Context context, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        SNQ A0H = C2FP.A0H();
        int i = 0;
        if (z) {
            i = 2;
        }
        AbstractC65702TsY.A0v(context, AbstractC69850Vwb.A00(new WHP(interfaceC16820sZ, 6), DialogInterfaceOnClickListenerC70213WHu.A00, 2131961443, 2131961442, 2131961441, 2131961445, 2131961306, i), A0H);
    }
}
