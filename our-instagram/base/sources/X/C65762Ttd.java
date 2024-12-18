package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.Ttd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65762Ttd extends AbstractC46524KiP {
    public View A00;
    public View A01;
    public View A02;
    public C1ON A03;
    public C1ON A04;
    public IgTextView A05;
    public IgImageView A06;
    public C65763Tte A07;
    public UPX A08;
    public InterfaceC37159GYw A09;
    public String A0B;
    public String A0C;
    public String A0D;
    public final FragmentActivity A0E;
    public final InterfaceC11380iw A0F;
    public final UserSession A0G;
    public Integer A0A = C05F.A0N;
    public final C65764Ttf A0H = new C65764Ttf(this);
    public final C65765Ttg A0I = new C65765Ttg(this);

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        View view = this.A01;
        if (view == null) {
            View inflate = View.inflate(context, R.layout.direct_thread_promote_ad_banner, null);
            AbstractC50522MSa.A0y(inflate);
            this.A01 = inflate;
            return inflate;
        }
        return view;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        String str2;
        String str3;
        Integer num;
        C31200Dnj BhT;
        C14360o3.A0B(interfaceC37159GYw, 1);
        this.A09 = interfaceC37159GYw;
        String str4 = "";
        if (c2ec == null || (BhT = c2ec.BhT()) == null || (str2 = BhT.A00) == null) {
            str2 = "";
        }
        this.A0B = str2;
        if (c2ec == null || (str3 = c2ec.C7q()) == null) {
            str3 = "";
        }
        this.A0D = str3;
        if (c2ec != null && (!c2ec.BSH().isEmpty())) {
            str4 = ((User) c2ec.BSH().get(0)).getId();
        }
        this.A0C = str4;
        String str5 = this.A0B;
        if (str5 == null) {
            C14360o3.A0F("adMediaId");
            throw C00O.createAndThrow();
        }
        if (str5.length() != 0 && str4.length() != 0 && (num = this.A0A) != C05F.A00 && num != C05F.A01) {
            UserSession userSession = this.A0G;
            C14360o3.A0B(userSession, 0);
            if (!C18U.A06(C06090Tz.A06, userSession, 36316770281460361L)) {
                W6f.A00(this.A0E, new C70618Wdw(this, 5), userSession);
                return;
            }
        }
        interfaceC37159GYw.onFailure();
    }

    public static final Integer A00(C65762Ttd c65762Ttd) {
        UPX upx = c65762Ttd.A08;
        if (upx == null) {
            C14360o3.A0F("activeAdModel");
            throw C00O.createAndThrow();
        }
        BoostedActionStatus boostedActionStatus = upx.A09;
        if (boostedActionStatus == BoostedActionStatus.A0H) {
            return C05F.A0N;
        }
        if (boostedActionStatus == BoostedActionStatus.A0B) {
            return C05F.A0C;
        }
        if (!upx.A0F) {
            long j = upx.A07 * 24;
            long j2 = j - upx.A04;
            UserSession userSession = c65762Ttd.A0G;
            C14360o3.A0B(userSession, 0);
            C06090Tz c06090Tz = C06090Tz.A06;
            double A00 = C18U.A00(c06090Tz, userSession, 37161195211391147L);
            double A002 = C18U.A00(c06090Tz, userSession, 37161195211456684L);
            double d = j2;
            double d2 = j;
            if (d >= A002 * d2 && d <= d2 * A00) {
                return C05F.A01;
            }
        }
        return C05F.A00;
    }

    public static final void A01(C65762Ttd c65762Ttd) {
        View view = c65762Ttd.A01;
        if (view != null) {
            view.setVisibility(8);
        } else {
            C14360o3.A0F("bannerView");
            throw C00O.createAndThrow();
        }
    }

    public C65762Ttd(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A0G = userSession;
        this.A0F = interfaceC11380iw;
        this.A0E = fragmentActivity;
        this.A07 = new C65763Tte(interfaceC11380iw, userSession);
    }
}
