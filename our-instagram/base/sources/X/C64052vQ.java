package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.Map;

/* renamed from: X.2vQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64052vQ {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Runnable A03;
    public String A04;
    public Map A05;
    public InterfaceC16820sZ A06;
    public boolean A07;
    public final Handler A08;
    public final UserSession A09;
    public final long A0A;
    public final Activity A0B;

    public C64052vQ(Activity activity, UserSession userSession, long j) {
        C14360o3.A0B(userSession, 2);
        this.A0B = activity;
        this.A09 = userSession;
        this.A0A = j;
        this.A01 = C05F.A00;
        this.A08 = new Handler(Looper.getMainLooper());
    }

    public final void A01(String str) {
        C1VN c1vn;
        C14360o3.A0B(str, 0);
        if (this.A01 == C05F.A0C) {
            Map map = this.A05;
            if (map != null) {
                map.put(AbstractC31187DnW.A00(), str);
            }
            String str2 = this.A04;
            if (str2 != null && (c1vn = C1VN.A00) != null) {
                c1vn.A00(this.A0B, this.A09, str2, this.A05);
            }
            this.A00 = null;
            this.A05 = null;
            this.A02 = null;
            this.A01 = C05F.A0N;
            InterfaceC16820sZ interfaceC16820sZ = this.A06;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
            }
        }
    }

    public final void A02(String str, String str2) {
        C14360o3.A0B(str, 0);
        if (this.A01 == C05F.A00 && !this.A07) {
            this.A07 = true;
            J5J j5j = new J5J(this, str, str2);
            this.A08.postDelayed(j5j, this.A0A);
            this.A03 = j5j;
        }
    }

    public final void A03(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        Integer num = C05F.A01;
        this.A02 = num;
        this.A05 = AbstractC06930Yk.A07(new C09530e4("ad_id", str), new C09530e4("multi_ads_unit_id", str2), new C09530e4(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, this.A09.userId), new C09530e4("trigger_type", "click"));
        this.A01 = num;
        this.A04 = str3;
    }

    public final void A00(int i) {
        Integer num = this.A00;
        if (num == null || i != num.intValue()) {
            this.A02 = null;
            this.A05 = null;
            this.A01 = C05F.A00;
            Runnable runnable = this.A03;
            if (runnable != null) {
                this.A08.removeCallbacks(runnable);
                this.A07 = false;
            }
        }
        this.A00 = Integer.valueOf(i);
    }
}
