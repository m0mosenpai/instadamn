package X;

import android.content.Context;
import com.facebook.R;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class SSE {
    public static final C60613RDi A00(Context context, ImmutableList immutableList, String str) {
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1P(immutableList, context);
        return A01(context, immutableList, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C60613RDi A01(Context context, ImmutableList immutableList, String str, boolean z) {
        int i;
        int i2;
        int size = immutableList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((LinkParams) immutableList.get(i3)).A01 != 0) {
                String str2 = ((LinkParams) immutableList.get(i3)).A03;
                C14360o3.A07(str2);
                str = AbstractC002300n.A0d(str, str2, AbstractC166997dE.A0p(context, ((LinkParams) immutableList.get(i3)).A01), false);
            }
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        int size2 = immutableList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            int i5 = ((LinkParams) immutableList.get(i4)).A01;
            LinkParams linkParams = (LinkParams) immutableList.get(i4);
            if (i5 != 0) {
                String A0p = AbstractC166997dE.A0p(context, linkParams.A01);
                i = AbstractC001900j.A08(str, A0p, 0, false);
                i2 = A0p.length();
            } else {
                i = linkParams.A02;
                i2 = ((LinkParams) immutableList.get(i4)).A00;
            }
            if (z) {
                C2FP.A0A();
                A1E2.add(new SGC(AbstractC31174DnI.A0q(context, R.color.igds_quick_send_divider_background), i2, i));
            } else {
                A1E.add(new C62901SWh(i2, i, ((LinkParams) immutableList.get(i4)).A04, ((LinkParams) immutableList.get(i4)).A05));
            }
        }
        return new C60613RDi(str, AbstractC31172DnG.A19(A1E), AbstractC31172DnG.A19(A1E2));
    }
}
