package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.Mfb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50968Mfb extends AbstractC52922bZ {
    public Integer A00;
    public String A01;
    public final InterfaceC24731Iq A02;
    public final InterfaceC19390xP A03;

    public final String A00(Context context) {
        Resources resources;
        int i;
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case -1:
                    break;
                case 0:
                    resources = context.getResources();
                    i = 2131962431;
                    break;
                case 1:
                case 2:
                case 5:
                    String str = this.A01;
                    if (str.length() == 0) {
                        return AbstractC166997dE.A0q(context.getResources(), 2131962433);
                    }
                    return str;
                case 3:
                    resources = context.getResources();
                    i = 2131962434;
                    break;
                case 4:
                    resources = context.getResources();
                    i = 2131962432;
                    break;
                default:
                    throw B4Z.A00();
            }
            return AbstractC166997dE.A0q(resources, i);
        }
        return "";
    }

    public C50968Mfb() {
        C24721Ip A0s = MSY.A0s();
        this.A02 = A0s;
        this.A03 = AbstractC07080Za.A03(A0s);
        this.A01 = "";
    }
}
