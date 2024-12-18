package X;

import android.app.Activity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.Af3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23730Af3 implements MOT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Medium A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16820sZ A07;

    public C23730Af3(Activity activity, Medium medium, UserSession userSession, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A02 = medium;
        this.A01 = activity;
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A00 = i;
        this.A07 = interfaceC16820sZ;
    }

    @Override // X.MOT
    public final void DsR(TargetViewSizeProvider targetViewSizeProvider) {
        String str = this.A02.A0X;
        Activity activity = this.A01;
        UserSession userSession = this.A03;
        C24183Ao6 c24183Ao6 = new C24183Ao6(activity, userSession, targetViewSizeProvider, this.A05, this.A04, this.A06, this.A07, this.A00);
        C14360o3.A0B(str, 0);
        AbstractC209669Pc.A05(activity, userSession, new C221699qY(str, 0, 0), c24183Ao6);
    }
}
