package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.EwQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33800EwQ {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EDH parseFromJson = C34800FVc.parseFromJson(C16V.A00(AbstractC31177DnL.A0e(c6fw, 1)));
        C14360o3.A0A(parseFromJson);
        Context requireContext = C6BQ.A01(c6fq).requireContext();
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Fragment A01 = C6BQ.A01(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, AbstractC58317Pt9.A00(3));
        F8Z.A00(requireContext, A01, A04, C6BQ.A06(c6fq), (C07270a1) A0B, parseFromJson, true);
        return null;
    }
}
