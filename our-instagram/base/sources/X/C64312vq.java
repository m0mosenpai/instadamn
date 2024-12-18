package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* renamed from: X.2vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64312vq implements InterfaceC64322vr {
    public final InterfaceC61772re A00;
    public final Activity A01;
    public final UserSession A02;
    public final InterfaceC64322vr A03;
    public final C64352vu A04;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC64322vr
    public final void Dwd(C11520jB c11520jB, C38321qM c38321qM, int i, int i2, int i3) {
        ExtendedImageUrl extendedImageUrl;
        int height;
        int width;
        C1VN c1vn;
        if (c38321qM.A1t() != null) {
            extendedImageUrl = c38321qM.A1q(this.A01);
        } else {
            extendedImageUrl = null;
        }
        InterfaceC64322vr interfaceC64322vr = this.A03;
        if (extendedImageUrl == null) {
            height = 0;
            width = 0;
        } else {
            height = extendedImageUrl.getHeight();
            width = extendedImageUrl.getWidth();
        }
        interfaceC64322vr.Dwd(null, c38321qM, i, height, width);
        InterfaceC61772re interfaceC61772re = this.A00;
        C75113Zb BRZ = interfaceC61772re.BRZ(c38321qM);
        if (c38321qM.A5M() && BRZ.A03 == 0 && AbstractC101154gV.A00()) {
            InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
            int i4 = interfaceC19630xq.getInt("carousel_nux_impressions", 0);
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7D("carousel_nux_impressions", i4 + 1);
            ARD.apply();
        }
        C75113Zb BRZ2 = interfaceC61772re.BRZ(c38321qM);
        UserSession userSession = this.A02;
        AbstractC81223jr.A00(userSession).A01.containsKey(c38321qM.A38());
        if (c38321qM.A5M()) {
            BRZ2.A0F(this.A01);
        }
        if (c38321qM.A0C.B5z() != null && (c1vn = C1VN.A00) != null) {
            c1vn.A02(userSession, this.A01, c38321qM.A0C.B5z());
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC64322vr
    public final void Cij(C38321qM c38321qM, C38321qM c38321qM2, C38321qM c38321qM3, int i, int i2, int i3) {
        this.A03.Cij(c38321qM, c38321qM2, c38321qM3, i, i2, i3);
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        this.A03.D8S(view);
    }

    @Override // X.InterfaceC64322vr
    public final void DNd(C38321qM c38321qM) {
        this.A03.DNd(c38321qM);
    }

    @Override // X.InterfaceC64322vr
    public final void DNv(C38321qM c38321qM, int i) {
        this.A03.DNv(c38321qM, i);
    }

    @Override // X.InterfaceC64322vr
    public final void DNy(View view, C38321qM c38321qM, double d) {
        this.A03.DNy(view, c38321qM, d);
    }

    @Override // X.InterfaceC64322vr
    public final void Dwc(C38321qM c38321qM) {
        this.A03.Dwc(c38321qM);
        C81233js A00 = AbstractC81223jr.A00(this.A02);
        C14360o3.A0B(c38321qM, 0);
        String A38 = c38321qM.A38();
        List list = (List) C15500q5.A04(A00.A01).remove(A38);
        if (list != null && !list.isEmpty()) {
            C15500q5.A04(A00.A02).remove(A38);
            RealtimeClientManager.getInstance(A00.A00).graphqlUnsubscribeCommand(list);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A03.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        this.A03.onCreate();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        this.A03.onDestroy();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A03.onDestroyView();
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        this.A03.onPause();
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        this.A03.onResume();
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
        this.A03.onSaveInstanceState(bundle);
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
        this.A03.onStart();
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
        this.A03.onStop();
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        this.A03.onViewCreated(view, bundle);
    }

    public C64312vq(Activity activity, final UserSession userSession, final InterfaceC60442pS interfaceC60442pS, InterfaceC61772re interfaceC61772re) {
        this.A02 = userSession;
        this.A00 = interfaceC61772re;
        C64352vu c64352vu = new C64352vu(new InterfaceC64342vt(userSession, interfaceC60442pS) { // from class: X.2vs
            public final C30Y A00;

            @Override // X.InterfaceC64342vt
            public final C30Y AXL() {
                return this.A00;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [X.30a, java.lang.Object] */
            {
                C06090Tz c06090Tz = C06090Tz.A05;
                boolean A06 = C18U.A06(c06090Tz, userSession, 36311985687692115L);
                boolean A062 = C18U.A06(c06090Tz, userSession, 36311985688019800L);
                boolean A063 = C18U.A06(c06090Tz, userSession, 36311985687823189L);
                boolean A064 = C18U.A06(c06090Tz, userSession, 36311985688085337L);
                if (A06 || A062 || A063 || A064) {
                    this.A00 = new C30Y(userSession, new Object(), new C37451GeV(userSession, A06, A062, A063, A064), interfaceC60442pS);
                }
            }
        });
        this.A04 = c64352vu;
        this.A03 = new C64362vv(userSession, c64352vu, interfaceC60442pS, interfaceC61772re);
        this.A01 = activity;
    }
}
