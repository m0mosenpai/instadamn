package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.tigon.tigonhuc.HucClient;

/* renamed from: X.PTh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57068PTh implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C52253NAt A03;
    public final /* synthetic */ Integer A04;

    public RunnableC57068PTh(Activity activity, View view, View view2, C52253NAt c52253NAt, Integer num) {
        this.A03 = c52253NAt;
        this.A00 = activity;
        this.A02 = view;
        this.A04 = num;
        this.A01 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC58132lV enumC58132lV;
        int i;
        int i2;
        C52253NAt c52253NAt = this.A03;
        C5SW c5sw = c52253NAt.A00;
        if (c5sw == null) {
            Activity activity = this.A00;
            View view = this.A02;
            Integer num = this.A04;
            String str = c52253NAt.A01;
            if (str == null) {
                int intValue = num.intValue();
                Context context = view.getContext();
                switch (intValue) {
                    case 0:
                        i2 = 2131975151;
                        break;
                    case 1:
                    case 4:
                        i2 = 2131975141;
                        break;
                    case 2:
                        i2 = 2131975149;
                        break;
                    case 3:
                        i2 = 2131970033;
                        break;
                    case 5:
                        i2 = 2131975148;
                        break;
                    case 6:
                        i2 = 2131975146;
                        break;
                    default:
                        i2 = 2131975140;
                        break;
                }
                str = AbstractC166997dE.A0p(context, i2);
            }
            C5SU A0b = MSZ.A0b(activity, str);
            View view2 = this.A01;
            A0b.A03(view2);
            int intValue2 = num.intValue();
            if (intValue2 != 2 && (intValue2 == 7 || intValue2 != 8)) {
                enumC58132lV = EnumC58132lV.A02;
            } else {
                enumC58132lV = EnumC58132lV.A03;
            }
            A0b.A06(enumC58132lV);
            int width = view2.getWidth();
            if (intValue2 != 3 && intValue2 != 5 && intValue2 != 7 && intValue2 != 8) {
                i = HucClient.BODY_UPLOAD_TIMEOUT_SECONDS;
            } else {
                i = width / 2;
            }
            int height = view2.getHeight();
            int i3 = 16;
            if (intValue2 != 2) {
                if (intValue2 != 7 && intValue2 == 8) {
                    i3 = (int) (height * 0.85f);
                }
            } else {
                i3 = height - 16;
            }
            A0b.A04(view2, i, i3, false);
            A0b.A0F = true;
            A0b.A0A = true;
            A0b.A04 = new NMB(7, num, c52253NAt);
            c5sw = A0b.A00();
            c52253NAt.A00 = c5sw;
        }
        if (c5sw != null) {
            c5sw.A06();
        }
    }
}
