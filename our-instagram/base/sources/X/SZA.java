package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes10.dex */
public final class SZA {
    public Q7i A00;
    public C61602RqR A01;
    public final WeakReference A06;
    public Long A03 = null;
    public Integer A02 = null;
    public boolean A05 = false;
    public List A04 = AbstractC166987dD.A1E();
    public final Handler A07 = AbstractC167007dF.A0J();

    public static int A00(Q7i q7i, String str) {
        String str2;
        Integer num;
        if (q7i != null) {
            if (!(q7i instanceof QE5) && !(q7i instanceof QE7)) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
        } else {
            int hashCode = str.hashCode();
            if (hashCode != -1459274090) {
                if (hashCode == 161743991) {
                    str2 = "BLOKS_HYBRID_PAYMENT_USAGE";
                }
                num = C05F.A0C;
            } else {
                str2 = "BLOKS_PAYMENT_USAGE";
            }
            if (str.equals(str2)) {
                num = C05F.A0N;
            }
            num = C05F.A0C;
        }
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void A01(Context context, C63021Sam c63021Sam, C5G6 c5g6, Q7i q7i, C61602RqR c61602RqR, Integer num, Integer num2, String str, List list) {
        int A00;
        Integer num3;
        C58883QEt A0K;
        String str2;
        Dialog dialog;
        Long l = this.A03;
        if (l == null) {
            this.A03 = Long.valueOf(SystemClock.elapsedRealtime());
            A00 = A00(q7i, str);
        } else {
            A00 = A00(q7i, str);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long longValue = elapsedRealtime - l.longValue();
            if (longValue < 1000 && (num3 = this.A02) != null && (A0K = AbstractC58318PtA.A0K(this.A06)) != null) {
                int i = (int) longValue;
                int intValue = num3.intValue();
                QIh qIh = A0K.A0Y.A00.A09;
                String str3 = qIh.A05;
                String str4 = qIh.A01;
                Bundle A03 = A0K.A03();
                C14360o3.A0B(str3, 0);
                if (intValue != 0 && intValue != 2) {
                    if (intValue == 1 || intValue == 3) {
                        if (intValue == A00) {
                            str2 = "MERGE_AUTOFILL_DIALOG_INTERVAL_PAYMENT";
                        } else {
                            str2 = "MERGE_AUTOFILL_DIALOG_INTERVAL_PAYMENT_CONTACT";
                        }
                    } else {
                        str2 = "MERGE_AUTOFILL_DIALOG_INTERVAL";
                    }
                } else if (intValue == A00) {
                    str2 = "MERGE_AUTOFILL_DIALOG_INTERVAL_CONTACT";
                } else {
                    str2 = "MERGE_AUTOFILL_DIALOG_INTERVAL_CONTACT_PAYMENT";
                }
                long j = 0;
                C63305ShB.A00().A07(A03, new SZO(null, str2, str3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, i, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0).A01());
            }
            this.A03 = Long.valueOf(elapsedRealtime);
        }
        this.A02 = Integer.valueOf(A00);
        Q7i q7i2 = this.A00;
        if (q7i2 != null && (dialog = ((C0SG) q7i2).A01) != null && dialog.isShowing() && !this.A00.mRemoving) {
            c63021Sam.A03(num, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
            c63021Sam.A01(num, null, 772805755);
        } else if (!this.A05) {
            this.A05 = true;
            List list2 = this.A04;
            list2.clear();
            list2.add(new SIA(q7i, c61602RqR, num2, str));
            this.A07.postDelayed(new TRS(context, this, c63021Sam, c5g6, q7i, c61602RqR, num, str, list), 200L);
        } else {
            this.A04.add(new SIA(q7i, c61602RqR, num2, str));
        }
    }

    public SZA(WeakReference weakReference) {
        this.A06 = weakReference;
    }
}
