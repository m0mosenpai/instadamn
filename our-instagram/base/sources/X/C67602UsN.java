package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.locationsharing.core.models.Location;
import com.instagram.bwpclientauthmanager.AuthenticationActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;

/* renamed from: X.UsN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67602UsN extends AbstractC53642Nnn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C67602UsN(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.AbstractC53642Nnn
    public final void A00() {
        switch (this.A00) {
            case 0:
                W91 w91 = (W91) this.A02;
                C23031Ai c23031Ai = w91.A04.A01;
                AbstractC167007dF.A1L(c23031Ai, c23031Ai.A3n, C23031Ai.A8c, 206, true);
                C68746VbP c68746VbP = w91.A03;
                if (c68746VbP != null) {
                    c68746VbP.A00.A03();
                }
                C66542ULx c66542ULx = (C66542ULx) this.A01;
                Location A00 = c66542ULx.A02.A00();
                if (A00 == null) {
                    return;
                }
                AbstractC66543ULy.A04(c66542ULx, A00, "CURRENT_LOCATION_UPDATED");
                return;
            case 1:
                Context context = (Context) this.A02;
                Intent intent = new Intent(context, (Class<?>) AuthenticationActivity.class);
                Bundle bundle = new Bundle(0);
                bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC58317Pt9.A00(139));
                intent.putExtra(AbstractC58317Pt9.A00(810), bundle);
                C12260kU.A0C(context, intent);
                return;
            default:
                super.A00();
                return;
        }
    }

    @Override // X.AbstractC53642Nnn
    public final void A01() {
        Context context;
        switch (this.A00) {
            case 0:
                C68746VbP c68746VbP = ((W91) this.A02).A03;
                if (c68746VbP == null || (context = c68746VbP.A00.getContext()) == null) {
                    return;
                }
                AbstractC31176DnK.A12(context, C3DN.A00);
                return;
            case 1:
            default:
                super.A01();
                return;
            case 2:
                C70115W4n c70115W4n = (C70115W4n) this.A01;
                UserSession userSession = c70115W4n.A03;
                C189448aO c189448aO = new C189448aO(userSession);
                AbstractC25225BEi.A1Q(c189448aO, c70115W4n.A0I);
                c189448aO.A03 = c70115W4n.A00;
                C189478aR A00 = c189448aO.A00();
                Bundle A05 = AbstractC31178DnM.A05(userSession);
                User user = c70115W4n.A05;
                A05.putString("ReportingConstants.ARG_CONTENT_ID", c70115W4n.A0C);
                C67844UzI c67844UzI = (C67844UzI) this.A02;
                A05.putBoolean("ReportingConstants.ARG_IS_INTEROP_THREAD", c70115W4n.A0J);
                A05.putString("ReportingConstants.ARG_DIRECT_THREAD_ID", c70115W4n.A0D);
                C70155WDf c70155WDf = c70115W4n.A06;
                A05.putBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD", c70115W4n.A0H);
                A00.A02(c70115W4n.A01, VXQ.A00(A05, A00, user, c70155WDf, null, c67844UzI));
                return;
        }
    }

    @Override // X.AbstractC53642Nnn
    public final void A02() {
        Context context;
        switch (this.A00) {
            case 0:
                C68746VbP c68746VbP = ((W91) this.A02).A03;
                if (c68746VbP == null || (context = c68746VbP.A00.getContext()) == null) {
                    return;
                }
                AbstractC31176DnK.A12(context, C3DN.A00);
                return;
            case 1:
                C63295Sgw.A01((Activity) this.A01, C05F.A00);
                return;
            default:
                super.A02();
                return;
        }
    }

    @Override // X.AbstractC53642Nnn
    public final void A03() {
        Context context;
        if (this.A00 != 0) {
            super.A03();
            return;
        }
        C68746VbP c68746VbP = ((W91) this.A02).A03;
        if (c68746VbP == null || (context = c68746VbP.A00.getContext()) == null) {
            return;
        }
        AbstractC31176DnK.A12(context, C3DN.A00);
    }

    @Override // X.AbstractC53642Nnn
    public final void A04(Throwable th) {
        if (1 - this.A00 != 0) {
            super.A04(th);
        } else {
            C63295Sgw.A01((Activity) this.A01, C05F.A01);
        }
    }
}
