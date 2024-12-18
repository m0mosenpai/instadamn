package X;

import android.content.SharedPreferences;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.text.formatter.TextFormatter;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class UvY extends UvM {
    public final int A00;
    public final C2GS A01;
    public final UvZ A02;
    public final boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r4 != r1.A00) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.UvY r6) {
        /*
            X.2li r1 = r6.A07
            java.lang.Object r0 = r1.A02()
            r3 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r0 == 0) goto L22
            com.fbpay.theme.FBPayIcon r4 = r6.A0K
            if (r4 == 0) goto L22
            java.lang.Object r1 = r1.A02()
            boolean r0 = r1 instanceof X.C70071W1o
            if (r0 == 0) goto L22
            X.W1o r1 = (X.C70071W1o) r1
            if (r1 == 0) goto L22
            com.fbpay.theme.FBPayIcon r0 = r1.A00
            r2 = 1
            if (r4 == r0) goto L23
        L22:
            r2 = 0
        L23:
            X.2GS r1 = r6.A01
            java.lang.Object r0 = r1.A02()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5a
            if (r2 == 0) goto L5a
            r1.A0B(r5)
            X.2FP r2 = X.C2FP.A05()
            X.C2FP.A0K(r2)
            X.2GK r0 = r2.A00
            X.0cm r1 = r0.A0H
            java.lang.String r0 = "SharedPreferences Factory is not provided!"
            X.C02R.A03(r1, r0)
            X.2GK r0 = r2.A00
            X.0cm r0 = r0.A0H
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "saw_card_scanner_tooltip"
            r1.putBoolean(r0, r3)
            r1.apply()
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UvY.A01(X.UvY):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2GT, X.2GS] */
    public UvY(FormCellLoggingEvents formCellLoggingEvents, TextFormatter textFormatter, FBPayIcon fBPayIcon, ImmutableList immutableList, Integer num, String str, String str2, String str3, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        super(formCellLoggingEvents, textFormatter, null, fBPayIcon, immutableList, num, str, str2, str3, i, i2, i3, 0, 0, 0, z, z2, false, false, z3, false);
        UvZ uvZ;
        FBPayIcon fBPayIcon2;
        C14360o3.A0B(num, 10);
        this.A00 = i4;
        this.A01 = new C2GT(false);
        if (((AbstractC129435t5) this).A08) {
            C58252li c58252li = ((UvM) this).A07;
            if (c58252li.A02() == null && (fBPayIcon2 = this.A0K) != null) {
                c58252li.A0B(new C70071W1o(fBPayIcon2));
            }
        }
        int i5 = this.A00;
        if (i5 != 0) {
            C2FP A05 = C2FP.A05();
            C2FP.A0K(A05);
            C02R.A03(A05.A00.A0H, "SharedPreferences Factory is not provided!");
            if (!((SharedPreferences) A05.A00.A0H.get()).getBoolean("saw_card_scanner_tooltip", false)) {
                if (i5 == 1) {
                    AbstractC167007dF.A0J().postDelayed(new RunnableC71282WrC(this), 2000L);
                } else if (i5 == 2) {
                    AbstractC63246Sg0.A03(this.A0E, new C70302WQh(this, 36));
                }
            }
        }
        this.A03 = z4;
        C1LC A0I = AbstractC43592JPx.A0I(((UvM) this).A00);
        while (true) {
            if (A0I.hasNext()) {
                VKA vka = (VKA) A0I.next();
                if (vka instanceof UvZ) {
                    uvZ = (UvZ) vka;
                    break;
                }
            } else {
                uvZ = null;
                break;
            }
        }
        this.A02 = uvZ;
    }
}
