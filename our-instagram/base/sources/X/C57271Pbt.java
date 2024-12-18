package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.Pbt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57271Pbt extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57271Pbt(Context context, Bundle bundle, String str, String str2, String str3, String str4, String str5, String str6) {
        super(0);
        this.A04 = str;
        this.A00 = context;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = str4;
        this.A02 = str5;
        this.A05 = str6;
        this.A01 = bundle;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = this.A04;
        String A0h = AbstractC31171DnF.A0h(str, OVR.A01);
        if (A0h != null) {
            str = A0h;
        }
        Context context = this.A00;
        Intent A08 = MSW.A08(context, InstagramConsentFlowHostActivity.class);
        String str2 = this.A06;
        A08.putExtra("flow_name", str2);
        A08.putExtra("experience_id", str);
        String str3 = this.A07;
        if (str3 != null) {
            A08.putExtra(CacheBehaviorLogger.SOURCE, str3);
        }
        String str4 = this.A03;
        if (str4 != null) {
            A08.putExtra(AbstractC58361Pu1.A01(0, 9, 38), str4);
        }
        String str5 = this.A02;
        if (str5 == null) {
            str5 = "flow.action";
        }
        A08.putExtra("app_id", AnonymousClass001.A0R("com.bloks.www.consent.", str5));
        String str6 = this.A05;
        if (str6 != null) {
            A08.putExtra("extra_params_json", str6);
        }
        A08.putExtras(this.A01);
        OVR.A03.addLast(AnonymousClass001.A0T(str, str2, '$'));
        return Boolean.valueOf(C0b3.A00().A07().A0G(context, A08));
    }
}
