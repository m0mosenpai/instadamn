package X;

import android.content.Context;

/* renamed from: X.FeI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35116FeI {
    public static final EnumC141996bI A01 = EnumC141996bI.A05;
    public static final int A00 = AbstractC167027dH.A01(C31349DqE.A0S);

    public static final void A00(Context context, String str, String str2, boolean z) {
        int i;
        Object[] objArr;
        String string;
        int i2;
        Object[] objArr2;
        AbstractC167017dG.A1O(context, str2);
        boolean A0B = AbstractC13670mt.A0B(str);
        if (z) {
            if (A0B) {
                i2 = 2131974275;
                objArr2 = new Object[]{str2};
            } else {
                i2 = 2131974273;
                objArr2 = new Object[]{str, str2};
            }
            string = context.getString(i2, objArr2);
            C14360o3.A0A(string);
        } else {
            if (A0B) {
                i = 2131974278;
                objArr = new Object[]{str2};
            } else {
                i = 2131974276;
                objArr = new Object[]{str, str2};
            }
            string = context.getString(i, objArr);
            C14360o3.A07(string);
        }
        A01(string);
    }

    public static final void A01(String str) {
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0C(A01);
        A0K.A0H = "post_block_failure";
        A0K.A0D = str;
        A0K.A01 = A00;
        AbstractC25233BEq.A1F(A0K);
    }
}
