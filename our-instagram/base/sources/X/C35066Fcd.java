package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Fcd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35066Fcd {
    /* JADX WARN: Type inference failed for: r6v1, types: [X.FPL, java.lang.Object] */
    public static final void A00(Context context, Fragment fragment, UserSession userSession, C35066Fcd c35066Fcd, Integer num, String str, String str2, int i, int i2, int i3) {
        int i4;
        boolean z;
        Integer[] numArr = new Integer[2];
        if (i == 3) {
            numArr[0] = 2131956237;
            i4 = 2131974313;
        } else {
            numArr[0] = 2131963518;
            i4 = 2131963519;
        }
        numArr[1] = Integer.valueOf(i4);
        List A1Q = AbstractC16960so.A1Q(numArr);
        int A01 = AbstractC31176DnK.A01(A1Q, 0);
        int A012 = AbstractC31176DnK.A01(A1Q, 1);
        ?? obj = new Object();
        String A0p = AbstractC166997dE.A0p(context, i2);
        String A0b = AbstractC31177DnL.A0b(context, str, i3);
        String A0p2 = AbstractC166997dE.A0p(context, A01);
        String A0p3 = AbstractC166997dE.A0p(context, A012);
        if (i == 3) {
            z = !C18U.A06(C06090Tz.A06, userSession, 36315383007022256L);
        } else {
            z = true;
        }
        obj.A00(context, new C36475G6z(context, fragment, userSession, obj, c35066Fcd, num, str2, i), A0p, A0b, str, A0p2, A0p3, R.drawable.ig_illustrations_qp_messages_refresh, z);
        FVE.A01(userSession, C05F.A0Y, num, null);
        C006802i.A0p.markerEnd(190451210, (short) 2);
    }

    public static final void A01(UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        while (true) {
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            if (interfaceC19630xq.getInt("hidden_word_spam_scam_consent", 0) < 2) {
                AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, "hidden_word_spam_scam_consent", 0);
            } else {
                AbstractC23043ADz.A00(userSession);
                return;
            }
        }
    }
}
