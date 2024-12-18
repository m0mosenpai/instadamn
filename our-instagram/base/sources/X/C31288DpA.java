package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractMap;

/* renamed from: X.DpA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31288DpA extends AbstractC46524KiP implements GZA {
    public Integer A00 = C05F.A00;
    public String A01 = "";
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C31289DpB A04;
    public final C7TT A05;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C2EC c2ec;
        C14360o3.A0B(context, 0);
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A03;
        Integer num = this.A00;
        C7TT c7tt = this.A05;
        if (c7tt != null) {
            c2ec = c7tt.A0J;
        } else {
            c2ec = null;
        }
        return new C34493FIf(context, fragmentActivity, userSession, c2ec, this, num).A01;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        String str2;
        Integer num;
        C14360o3.A0B(interfaceC37159GYw, 1);
        if (c2ec != null) {
            str2 = c2ec.C7I();
        } else {
            str2 = null;
        }
        this.A01 = String.valueOf(str2);
        UserSession userSession = this.A03;
        if (AbstractC31272Dou.A01(userSession, c2ec)) {
            num = C05F.A0C;
        } else if (AbstractC31272Dou.A00(userSession, c2ec)) {
            num = C05F.A01;
        } else {
            interfaceC37159GYw.onFailure();
            return;
        }
        this.A00 = num;
        interfaceC37159GYw.Dpu(this);
    }

    @Override // X.AbstractC46524KiP
    public final void A04(boolean z) {
        C2EC c2ec;
        User Ba5;
        String A00;
        AbstractMap A1G;
        AbstractMap A1G2;
        int intValue = this.A00.intValue();
        if (intValue != 2) {
            if (intValue == 1) {
                C143436di A002 = AbstractC149676oK.A00(this.A03);
                C7TT c7tt = this.A05;
                if (c7tt != null && (c2ec = c7tt.A0J) != null && (Ba5 = c2ec.Ba5()) != null && (A00 = AbstractC76433bn.A00(Ba5)) != null) {
                    Gson gson = new Gson();
                    InterfaceC19630xq interfaceC19630xq = A002.A01;
                    String string = interfaceC19630xq.getString("fan_dm_upsell_count_map", null);
                    if (string != null) {
                        Object A09 = gson.A09(string, new C60772RSh().A00);
                        C14360o3.A07(A09);
                        A1G = (AbstractMap) A09;
                    } else {
                        A1G = AbstractC166987dD.A1G();
                    }
                    AbstractC166997dE.A1U(A00, A1G, AbstractC167017dG.A0K(AbstractC31171DnF.A0W(A00, A1G)) + 1);
                    AbstractC31176DnK.A1X(interfaceC19630xq, "fan_dm_upsell_count_map", gson.A0B(A1G));
                    String string2 = interfaceC19630xq.getString("fan_dm_upsell_timestamp_map", null);
                    if (string2 != null) {
                        Object A092 = gson.A09(string2, new C60773RSi().A00);
                        C14360o3.A07(A092);
                        A1G2 = (AbstractMap) A092;
                    } else {
                        A1G2 = AbstractC166987dD.A1G();
                    }
                    A1G2.put(A00, AbstractC31173DnH.A0g());
                    AbstractC31176DnK.A1X(interfaceC19630xq, "fan_dm_upsell_timestamp_map", gson.A0B(A1G2));
                    this.A04.A00(EnumC33478ErD.IMPRESSION, this.A01);
                    return;
                }
                return;
            }
            return;
        }
        InterfaceC19630xq interfaceC19630xq2 = AbstractC149676oK.A00(this.A03).A01;
        InterfaceC19610xo ARD = interfaceC19630xq2.ARD();
        ARD.E7D("messaging_led_broadcast_channels_impression_count", AbstractC31172DnG.A01(interfaceC19630xq2, "messaging_led_broadcast_channels_impression_count") + 1);
        ARD.E7G("messaging_led_broadcast_channels_last_seen_timestamp", System.currentTimeMillis());
        ARD.apply();
        this.A04.A01(EnumC33478ErD.IMPRESSION, this.A01);
    }

    @Override // X.GZA
    public final void onActionClicked() {
        int intValue = this.A00.intValue();
        if (intValue != 2) {
            if (intValue == 1) {
                this.A04.A00(EnumC33478ErD.BUTTON_TAPPED, this.A01);
                return;
            }
            return;
        }
        this.A04.A01(EnumC33478ErD.BUTTON_TAPPED, this.A01);
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        int intValue = this.A00.intValue();
        if (intValue != 2) {
            if (intValue == 1) {
                this.A04.A00(EnumC33478ErD.DISMISS, this.A01);
                return;
            }
            return;
        }
        this.A04.A01(EnumC33478ErD.DISMISS, this.A01);
    }

    public C31288DpA(FragmentActivity fragmentActivity, UserSession userSession, C7TT c7tt) {
        this.A02 = fragmentActivity;
        this.A03 = userSession;
        this.A05 = c7tt;
        this.A04 = new C31289DpB(userSession);
    }
}
