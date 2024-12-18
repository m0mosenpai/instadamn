package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class T8N implements C2JL {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ InterfaceC02550Ad A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ boolean A05;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        FragmentActivity fragmentActivity = this.A02;
        fragmentActivity.setResult(0, AbstractC58323PtF.A0I(AbstractC31171DnF.A04(), "result_type", "new_token", th));
        if (this.A05) {
            C63295Sgw.A01(fragmentActivity, C05F.A01);
        }
        fragmentActivity.finish();
        C63295Sgw c63295Sgw = C63295Sgw.A00;
        AbstractC58323PtF.A19(this.A01, this.A03, c63295Sgw, C05F.A0j, th);
    }

    public T8N(Intent intent, Bundle bundle, FragmentActivity fragmentActivity, InterfaceC02550Ad interfaceC02550Ad, UserSession userSession, boolean z) {
        this.A02 = fragmentActivity;
        this.A03 = interfaceC02550Ad;
        this.A01 = bundle;
        this.A05 = z;
        this.A04 = userSession;
        this.A00 = intent;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        Object obj2;
        Object obj3;
        AnonymousClass436 anonymousClass436 = (AnonymousClass436) obj;
        if (anonymousClass436 != null && (obj2 = (InterfaceC65645TqG) anonymousClass436.Bos()) != null && (obj3 = (InterfaceC65644TqF) ((C2JS) obj2).getOptionalTreeField(0, "xfb_amazon_bwp_login_url(extra_data:$extra_data)", QKS.class, -1418799253)) != null) {
            str = ((C2JS) obj3).getOptionalStringField(0, "login_url");
        } else {
            str = null;
        }
        if (str == null) {
            FragmentActivity fragmentActivity = this.A02;
            fragmentActivity.setResult(0, AbstractC31171DnF.A04().putExtra("result_type", "new_token").putExtra("error", "null login url"));
            C63295Sgw.A00.A02(this.A01, this.A03, C05F.A0j, "null login url");
            if (this.A05) {
                C63295Sgw.A01(fragmentActivity, C05F.A01);
            }
            fragmentActivity.finish();
            return;
        }
        LruCache lruCache = AbstractC08820cl.A00;
        android.net.Uri parse = android.net.Uri.parse(str);
        C14360o3.A07(parse);
        UserSession userSession = this.A04;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36324625776587046L)) {
            C12260kU.A0E(this.A02.getApplicationContext(), AbstractC58318PtA.A0D(parse));
        } else if (C18U.A06(c06090Tz, userSession, 36324625776455972L)) {
            Intent intent = this.A00;
            if (intent == null) {
                FragmentActivity fragmentActivity2 = this.A02;
                C12260kU.A0C(fragmentActivity2, C63012Sab.A00(fragmentActivity2, parse, userSession));
            } else {
                Intent flags = new Intent(intent).setData(parse).setFlags(268435456);
                C14360o3.A07(flags);
                C12260kU.A0C(this.A02, flags);
            }
        } else {
            new C63165SeP().A01().A00(this.A02, parse);
        }
        C63295Sgw.A00.A02(this.A01, this.A03, C05F.A01, null);
    }
}
