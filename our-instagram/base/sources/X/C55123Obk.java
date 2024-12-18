package X;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Obk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55123Obk {
    public boolean A00;
    public final Handler A01;
    public final Fragment A02;
    public final MZA A03;
    public final O8C A04;
    public final List A05;
    public final Map A06;
    public static final Comparator A09 = PUB.A00;
    public static final Comparator A08 = PUA.A00;
    public static final Comparator A07 = C50039M7c.A00;

    public C55123Obk(Fragment fragment, MZA mza, O8C o8c) {
        C14360o3.A0B(o8c, 3);
        this.A02 = fragment;
        this.A03 = mza;
        this.A04 = o8c;
        this.A06 = AbstractC166987dD.A1G();
        this.A05 = AbstractC166987dD.A1E();
        this.A01 = new MXV(Looper.getMainLooper(), this, 2);
    }

    public static final void A00(C55123Obk c55123Obk) {
        String str;
        MZA mza = c55123Obk.A03;
        C38321qM A082 = mza.A08();
        if (A082 == null) {
            str = "unknown";
        } else {
            Map map = c55123Obk.A06;
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (C14360o3.A0K(((OKu) A1K.getKey()).A00.getId(), A082.getId())) {
                    AbstractC31177DnL.A1S(A1K, A1I);
                }
            }
            L31 l31 = (L31) AbstractC001800i.A0J(AbstractC001800i.A0g(A1I.values(), A08));
            str = "scroll";
            if (l31 != null && l31.A00 >= 0.2f) {
                A01(c55123Obk);
                L31 l312 = (L31) ((Map.Entry) AbstractC166987dD.A16(c55123Obk.A05)).getValue();
                if (l312.A00 <= 0.25f || A07.compare(l312, l31) >= 0) {
                    return;
                }
            }
        }
        mza.A0D(str, true);
    }

    public static final void A01(C55123Obk c55123Obk) {
        List list = c55123Obk.A05;
        list.clear();
        list.addAll(c55123Obk.A06.entrySet());
        C01T.A1D(list, A09);
    }
}
