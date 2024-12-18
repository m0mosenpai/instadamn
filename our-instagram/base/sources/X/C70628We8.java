package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.We8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70628We8 implements XA6 {
    public final /* synthetic */ C67892V0z A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C70628We8(C67892V0z c67892V0z, String str, String str2, String str3) {
        this.A00 = c67892V0z;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // X.XA6
    public final void onComplete() {
        String str;
        C67892V0z c67892V0z = this.A00;
        FragmentActivity requireActivity = c67892V0z.requireActivity();
        UserSession userSession = c67892V0z.A0H;
        String str2 = null;
        if (userSession == null) {
            str = "userSession";
        } else {
            W6E w6e = c67892V0z.A0C;
            if (w6e == null) {
                str = "dataFetcher";
            } else {
                String A01 = w6e.A01(VG4.A1Q.toString(), this.A01);
                C14360o3.A07(A01);
                String str3 = this.A02;
                String str4 = this.A03;
                C70399WUb c70399WUb = c67892V0z.A0B;
                if (c70399WUb != null) {
                    str2 = c70399WUb.A03;
                }
                AbstractC70398WUa.A02(requireActivity, userSession, A01, str3, str4, str2, "ig_boost", null, false);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
