package X;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GtU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38334GtU extends AbstractC52922bZ implements InterfaceC43497JJj {
    public C189478aR A00;
    public C40997IDs A01;
    public final InterfaceC58027PoD A02;
    public final UserSession A03;
    public final InterfaceC09390do A04;
    public final InterfaceC58109PpY A05;

    public C38334GtU(final UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = AbstractC09440dt.A01(new D8L(8, new C8CU(userSession) { // from class: X.9pl
            public final UserSession A00;

            {
                super(new MHO(userSession, 31));
                this.A00 = userSession;
            }
        }, new C8CY(userSession)));
        this.A05 = new C42154Im2(this);
        this.A02 = new LXC(this, 0);
    }

    @Override // X.InterfaceC43497JJj
    public final void ELq(Activity activity, C41027IEw c41027IEw, C40997IDs c40997IDs) {
        InterfaceC09390do interfaceC09390do = this.A04;
        ((KZ8) interfaceC09390do.getValue()).A00 = c41027IEw;
        C4A7 c4a7 = (C4A7) interfaceC09390do.getValue();
        String str = c41027IEw.A01;
        InterfaceC58109PpY interfaceC58109PpY = this.A05;
        C14360o3.A0B(interfaceC58109PpY, 2);
        AbstractC166987dD.A1Z(new J6o(activity, interfaceC58109PpY, c4a7, str, null, 0), c4a7.A01);
        this.A01 = c40997IDs;
    }

    @Override // X.InterfaceC43497JJj
    public final boolean Eji(Context context) {
        UserSession userSession = this.A03;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36326227799193340L)) {
            if (C18U.A06(c06090Tz, userSession, 36326227799258877L)) {
                try {
                    context.getPackageManager().getPackageInfo(AbstractC58317Pt9.A00(735), 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static final void A00(Activity activity, C38334GtU c38334GtU, Integer num) {
        String str;
        String str2;
        C50679MYx c50679MYx;
        String str3;
        Context applicationContext = activity.getApplicationContext();
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        Resources resources = applicationContext.getResources();
        Integer num2 = C05F.A00;
        int i = 2131972782;
        if (num == num2) {
            i = 2131972783;
        }
        A0K.A0D = resources.getString(i);
        A0K.A03();
        A0K.A0K = false;
        A0K.A04 = applicationContext.getDrawable(R.drawable.spotify_ig_connection_refresh_illo_spotify_toast);
        AbstractC31178DnM.A1N(c41451vu, A0K);
        C40997IDs c40997IDs = c38334GtU.A01;
        if (c40997IDs != null) {
            if (num == num2) {
                str = "success";
            } else {
                str = "error";
            }
            C41027IEw c41027IEw = ((KZ8) c38334GtU.A04.getValue()).A00;
            C42276Io0 c42276Io0 = c40997IDs.A00;
            UserSession userSession = c42276Io0.A0R;
            C38929HCc c38929HCc = c42276Io0.A0V;
            EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0X;
            C153756vk c153756vk = c42276Io0.A0Q;
            String str4 = c42276Io0.A0b;
            String str5 = c42276Io0.A0a;
            long j = c42276Io0.A0M;
            String str6 = null;
            if (c41027IEw != null) {
                str2 = c41027IEw.A01;
                c50679MYx = c41027IEw.A00;
            } else {
                str2 = null;
                c50679MYx = null;
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c38929HCc, userSession), "instagram_organic_audio_page_spotify_add_result_impression");
            if (A0f.isSampled()) {
                AbstractC25225BEi.A1M(enumC39652Hih, A0f);
                AbstractC37303Gc4.A0n(A0f, "audio_page", j);
                A0f.A8R(EnumC39636HiR.SONG, "audio_type");
                A0f.A9K("audio_owner_id", AbstractC37302Gc3.A0W(str5));
                A0f.A9K("audio_cluster_id", AbstractC37302Gc3.A0W(str2));
                AbstractC37303Gc4.A0e(A0f, c153756vk);
                AbstractC37300Gc1.A0k(A0f, AbstractC37302Gc3.A0W(str5));
                AbstractC37300Gc1.A0h(A0f, AbstractC37302Gc3.A0W(str4));
                if (c50679MYx != null) {
                    str3 = c50679MYx.A01;
                } else {
                    str3 = null;
                }
                A0f.AAP("spotify_track_id", str3);
                if (c50679MYx != null) {
                    str6 = c50679MYx.A00;
                }
                A0f.AAP("spotify_listen_url", str6);
                A0f.AAP("spotify_add_result", str);
                A0f.Cht();
            }
        }
        ((KZ8) c38334GtU.A04.getValue()).A00 = null;
        c38334GtU.A01 = null;
    }
}
