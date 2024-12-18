package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MXA {
    public Runnable A00;
    public boolean A01;
    public final Activity A02;
    public final UserSession A03;
    public final InterfaceC189628ah A04;
    public final MXB A05;
    public final InterfaceC189608af A06;
    public final InterfaceC58145PqA A07;
    public final InterfaceC58145PqA A08;
    public final Map A0A = AbstractC166987dD.A1G();
    public final Map A09 = AbstractC166987dD.A1G();

    public final void A02(OJQ ojq, String str) {
        C14360o3.A0B(str, 0);
        PhotoSession A03 = AbstractC43593JPy.A0R(this.A06.Ak4()).A03(str);
        if (A03 == null) {
            AbstractC12120kG.A07("MediaCaptureRenderController_createImageRenderController()", "Null photoSession.", null);
            return;
        }
        if (!this.A0A.containsKey(str)) {
            this.A08.AMu(ojq, A03, str);
        }
        if (A03.A07 != null) {
            return;
        }
        A03.A07 = AbstractC197358o6.A01(this.A03, A03.A0C);
    }

    public static final C197168nm A00(MXA mxa, String str, String str2) {
        android.net.Uri uri;
        if (str2 != null) {
            uri = AbstractC08820cl.A03(str2);
        } else {
            uri = null;
        }
        ContentResolver contentResolver = mxa.A02.getContentResolver();
        C14360o3.A07(contentResolver);
        return new C197168nm(contentResolver, AbstractC25227BEk.A0B(str), uri);
    }

    public static final void A01(CropInfo cropInfo, MXA mxa, String str, int i) {
        PhotoSession A03 = AbstractC43593JPy.A0R(mxa.A06.Ak4()).A03(str);
        if (A03 != null) {
            if (A03.A05 == null) {
                int i2 = cropInfo.A01;
                int i3 = cropInfo.A00;
                Rect rect = cropInfo.A02;
                C14360o3.A0B(rect, 2);
                A03.A05 = new CropInfo(rect, i2, i3);
                ((C56216OxP) A03.A0D).A00.A01 = i;
            }
            UserSession userSession = mxa.A03;
            C55105ObK A00 = C50713MaC.A00(userSession);
            Activity activity = mxa.A02;
            A00.A05(activity, str);
            C50713MaC.A00(userSession).A03(activity, cropInfo, str, i, A03.A0C);
        }
    }

    public MXA(Activity activity, InterfaceC189628ah interfaceC189628ah, MXB mxb, InterfaceC189608af interfaceC189608af) {
        InterfaceC58145PqA mys;
        this.A02 = activity;
        this.A04 = interfaceC189628ah;
        this.A05 = mxb;
        this.A06 = interfaceC189608af;
        UserSession CE4 = interfaceC189628ah.CE4();
        this.A03 = CE4;
        InterfaceC58145PqA mxc = new MXC(AbstractC166987dD.A0O(activity), CE4, this);
        this.A07 = mxc;
        if (!C2J9.A03(CE4)) {
            if (C2J9.A00) {
                mys = new MXT(this);
            } else {
                mys = new MYS(this);
            }
            mxc = mys;
        }
        this.A08 = mxc;
    }
}
