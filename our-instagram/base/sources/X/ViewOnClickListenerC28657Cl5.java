package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cl5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28657Cl5 implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ZonePolicy A02;
    public final /* synthetic */ AbstractC59962oe A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C28531Zo A05;
    public final /* synthetic */ C3o9 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public ViewOnClickListenerC28657Cl5(Activity activity, Context context, ZonePolicy zonePolicy, AbstractC59962oe abstractC59962oe, UserSession userSession, C28531Zo c28531Zo, C3o9 c3o9, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = userSession;
        this.A01 = context;
        this.A05 = c28531Zo;
        this.A00 = activity;
        this.A03 = abstractC59962oe;
        this.A0C = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A09 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A06 = c3o9;
        this.A02 = zonePolicy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1813951436);
        UserSession userSession = this.A04;
        LE0.A00(AbstractC46703KlM.A00(userSession), "CLICK_INTERSTITIAL_CONTINUE");
        AbstractC23021Ah.A00(userSession).A0z(AbstractC111324zv.A00(2335), 2);
        C3DN A01 = C3DN.A00.A01(this.A01);
        if (A01 != null) {
            C28531Zo c28531Zo = this.A05;
            Activity activity = this.A00;
            AbstractC59962oe abstractC59962oe = this.A03;
            String str = this.A0C;
            String str2 = this.A0A;
            String str3 = this.A0B;
            String str4 = this.A09;
            String str5 = this.A07;
            String str6 = this.A08;
            ((C3DP) A01).A0H = new GHJ(activity, this.A02, abstractC59962oe, userSession, c28531Zo, this.A06, str, str2, str3, str4, str5, str6);
            A01.A0B();
        }
        C0f9.A0C(-1433011046, A05);
    }
}
