package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu;

/* renamed from: X.8Go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184498Go implements InterfaceC58362lv {
    public C55U A00;
    public boolean A01;
    public final AnonymousClass822 A02;
    public final UserSession A03;
    public final CameraPreCaptureUtilityMenu A04;

    public C184498Go(UserSession userSession, CameraPreCaptureUtilityMenu cameraPreCaptureUtilityMenu) {
        C14360o3.A0B(userSession, 2);
        this.A04 = cameraPreCaptureUtilityMenu;
        this.A03 = userSession;
        this.A02 = new AnonymousClass822() { // from class: X.8Gq
            @Override // X.AnonymousClass822
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                C55U c55u = (C55U) obj;
                C14360o3.A0B(c55u, 0);
                C184498Go c184498Go = C184498Go.this;
                c184498Go.A00 = c55u;
                C184498Go.A00(c184498Go);
            }
        };
    }

    public static final void A00(C184498Go c184498Go) {
        CameraPreCaptureUtilityMenu cameraPreCaptureUtilityMenu;
        if (c184498Go.A01 && (c184498Go.A00 instanceof C81V)) {
            UserSession userSession = c184498Go.A03;
            if (AnonymousClass836.A00(userSession) && (cameraPreCaptureUtilityMenu = c184498Go.A04) != null) {
                cameraPreCaptureUtilityMenu.A06.setVisibility(0);
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            C18U.A06(c06090Tz, userSession, 36317972872042214L);
            C18U.A06(c06090Tz, userSession, 36317972872107751L);
            C18U.A06(c06090Tz, userSession, 36317972872173288L);
            return;
        }
        CameraPreCaptureUtilityMenu cameraPreCaptureUtilityMenu2 = c184498Go.A04;
        if (cameraPreCaptureUtilityMenu2 == null) {
            return;
        }
        cameraPreCaptureUtilityMenu2.A06.setVisibility(4);
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        this.A01 = ((Boolean) obj).booleanValue();
        A00(this);
    }
}
