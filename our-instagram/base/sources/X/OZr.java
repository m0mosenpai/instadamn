package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.util.creation.RenderBridge;
import java.io.IOException;
import java.util.List;

/* loaded from: classes9.dex */
public final class OZr {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Handler A07;
    public final C178577wV A08;
    public final UserSession A09;
    public final CropInfo A0A;
    public final AnonymousClass842 A0B;
    public final InterfaceC58147PqC A0C;
    public final C55006OVn A0D;
    public final C23328AVn A0E;
    public final FilterGroupModel A0F;
    public final Integer A0G;
    public final List A0H;
    public final InterfaceC08830cm A0I;
    public final InterfaceC08830cm A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public OZr(Context context, C178577wV c178577wV, UserSession userSession, CropInfo cropInfo, AnonymousClass842 anonymousClass842, InterfaceC58147PqC interfaceC58147PqC, C23328AVn c23328AVn, FilterGroupModel filterGroupModel, Integer num, List list, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AbstractC167007dF.A1H(c23328AVn, 4, num);
        this.A09 = userSession;
        this.A08 = c178577wV;
        this.A0E = c23328AVn;
        this.A0C = interfaceC58147PqC;
        this.A0F = filterGroupModel;
        this.A0G = num;
        this.A05 = i;
        this.A04 = i2;
        this.A0L = z;
        this.A0J = interfaceC08830cm;
        this.A0I = interfaceC08830cm2;
        this.A0H = list;
        this.A0N = z2;
        this.A0O = z3;
        this.A0K = z4;
        this.A0M = z5;
        this.A0A = cropInfo;
        this.A06 = i3;
        this.A0B = anonymousClass842;
        this.A07 = AbstractC167007dF.A0J();
        this.A0D = new C55006OVn(context, userSession, interfaceC58147PqC, num);
    }

    public static final void A00(Bitmap bitmap, C197368o7 c197368o7, OEN oen, OJJ ojj, OZr oZr) {
        C5L6 c5l6;
        boolean z;
        int i = -1;
        if (bitmap == null) {
            try {
                Exception A01 = c197368o7.A01();
                if (A01 != null) {
                    ojj.A00(A01);
                    return;
                }
                int readRenderResult = RenderBridge.readRenderResult(oZr.A03, oZr.A02, 6408, 12);
                if (readRenderResult != -1) {
                    i = readRenderResult;
                } else {
                    throw AbstractC166987dD.A18("RenderBridge.readRenderResult failure");
                }
            } catch (IOException | RuntimeException e) {
                ojj.A00(e);
                return;
            }
        }
        if (oZr.A0O && bitmap == null) {
            RenderBridge.mirrorImage(i);
            String str = oen.A04;
            UserSession userSession = oZr.A09;
            RenderBridge.saveAndClearCachedImageFull(i, str, true, false, 75, C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36313278472783729L), false);
            ojj.A04.set(new C54791OJj(new Point(oZr.A03, oZr.A02), new Point(oZr.A03, oZr.A02), oen, null, null, null, C05F.A00, 90));
            ojj.A03.countDown();
            return;
        }
        C55006OVn c55006OVn = oZr.A0D;
        int i2 = oZr.A01;
        int i3 = oZr.A00;
        int i4 = oZr.A03;
        int i5 = oZr.A02;
        UserSession userSession2 = oZr.A09;
        boolean z2 = oZr.A0K;
        OA8 oa8 = new OA8(userSession2, false, z2);
        O7U o7u = new O7U(userSession2, z2);
        AnonymousClass842 anonymousClass842 = oZr.A0B;
        if (anonymousClass842 != null) {
            c5l6 = anonymousClass842.ANZ();
        } else {
            c5l6 = null;
        }
        if (c5l6 == C5L6.A0B) {
            z = true;
            if (!C18U.A06(C06090Tz.A05, userSession2, 36325154057827115L)) {
            }
            OA9 A012 = c55006OVn.A01(bitmap, oa8, o7u, oen, i, i2, i3, i4, i5, z, false);
            int i6 = A012.A00;
            Point point = new Point(oZr.A03, oZr.A02);
            Point point2 = new Point(oZr.A03, oZr.A02);
            Double d = A012.A01;
            Double d2 = A012.A02;
            C14360o3.A0B(oen, 0);
            ojj.A04.set(new C54791OJj(point, point2, oen, d, d2, null, C05F.A00, i6));
            ojj.A03.countDown();
        }
        z = false;
        OA9 A0122 = c55006OVn.A01(bitmap, oa8, o7u, oen, i, i2, i3, i4, i5, z, false);
        int i62 = A0122.A00;
        Point point3 = new Point(oZr.A03, oZr.A02);
        Point point22 = new Point(oZr.A03, oZr.A02);
        Double d3 = A0122.A01;
        Double d22 = A0122.A02;
        C14360o3.A0B(oen, 0);
        ojj.A04.set(new C54791OJj(point3, point22, oen, d3, d22, null, C05F.A00, i62));
        ojj.A03.countDown();
    }

    public static final void A01(InterfaceC1809280u interfaceC1809280u, C197368o7 c197368o7, OZr oZr, InterfaceC197718oi interfaceC197718oi, int i, int i2) {
        int i3 = oZr.A05;
        int width = interfaceC197718oi.getWidth();
        oZr.A01 = width;
        int height = interfaceC197718oi.getHeight();
        oZr.A00 = height;
        boolean z = false;
        boolean A1M = AbstractC167007dF.A1M(i3 % 180);
        boolean z2 = false;
        C197768on c197768on = new C197768on(EnumC197748ol.ENABLE, new C197738ok(width, height, 0, 0, 0, oZr.A04), C197578oU.A01, null, C178117vk.A06, "OneCameraImageRenderer", false, false, true, true, false);
        c197368o7.A08(c197768on);
        if (A1M) {
            z = oZr.A0L;
        } else {
            z2 = oZr.A0L;
        }
        c197368o7.A06(oZr.A01, oZr.A00, -i3, z2, !z);
        c197368o7.A09(interfaceC1809280u, i, i2);
        c197368o7.A05(i, i2);
        try {
            c197768on.A02(interfaceC197718oi.getTexture());
        } catch (IllegalStateException | InterruptedException | RuntimeException e) {
            c197368o7.A0D("Render failure", "OneCameraImageRenderer", e);
        }
    }
}
