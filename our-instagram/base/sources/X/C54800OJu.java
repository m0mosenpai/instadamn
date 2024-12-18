package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OJu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54800OJu {
    public BrandedContentGatingInfoIntf A00;
    public BrandedContentProjectMetadataIntf A01;
    public MediaGenAIDetectionMethod A02;
    public List A03;
    public boolean A04;
    public final Context A05;
    public final Handler A06;
    public final AbstractC10360h2 A07;
    public final UserSession A08;
    public final C38321qM A09;
    public final AbstractC018607g A0A;
    public final List A0B;

    public final void A00(DialogInterface.OnDismissListener onDismissListener, C145186gd c145186gd) {
        boolean A1R = AbstractC167007dF.A1R(0, onDismissListener, c145186gd);
        UserSession userSession = this.A08;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        C38321qM c38321qM = this.A09;
        AbstractC31173DnH.A1Q(A0c, "media/%s/edit_media/?media_type=%s", new Object[]{c38321qM.getId(), c38321qM.BRp()});
        MSY.A1C(A0c, c38321qM);
        Context context = this.A05;
        A0c.A9s(AbstractC31198Dnh.A02(0, 9, 21), C16030qx.A00(context));
        A0c.A0R(N3N.class, C41349IRu.class);
        A0c.A0R = A1R;
        AbstractC55150OdD.A04(A0c, userSession, this.A0B, this.A03, this.A04);
        AbstractC55150OdD.A03(A0c, this.A01);
        AbstractC55150OdD.A02(A0c, this.A00);
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = this.A02;
        if (mediaGenAIDetectionMethod != null) {
            A0c.A9s("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
        }
        C1ON A0N = A0c.A0N();
        A0N.A00 = new NA3(onDismissListener, this, c145186gd);
        if (this.A01 != null) {
            C1GJ.A03(A0N);
        } else {
            C1GJ.A00(context, this.A0A, A0N);
        }
    }

    public C54800OJu(Context context, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, UserSession userSession, C38321qM c38321qM) {
        AbstractC167027dH.A13(context, userSession, abstractC10360h2);
        this.A05 = context;
        this.A08 = userSession;
        this.A07 = abstractC10360h2;
        this.A0A = abstractC018607g;
        this.A09 = c38321qM;
        this.A06 = AbstractC167007dF.A0J();
        this.A03 = AbstractC166987dD.A1E();
        this.A0B = AbstractC166987dD.A1E();
        List<InterfaceC102194ip> A3r = c38321qM.A3r();
        ArrayList<C51u> A0q = AbstractC167017dG.A0q(A3r);
        for (InterfaceC102194ip interfaceC102194ip : A3r) {
            A0q.add(new C51u(interfaceC102194ip.Ca9(), interfaceC102194ip.BcT(), interfaceC102194ip.BzF()));
        }
        for (C51u c51u : A0q) {
            Boolean bool = (Boolean) c51u.A00;
            Boolean bool2 = (Boolean) c51u.A01;
            User user = (User) c51u.A02;
            boolean z = false;
            this.A0B.add(new BrandedContentTag(user, AbstractC167007dF.A1T(bool2), AbstractC167007dF.A1T(bool)));
            List list = this.A03;
            boolean A1T = AbstractC167007dF.A1T(bool2);
            if (bool != null) {
                z = bool.booleanValue();
            }
            list.add(new BrandedContentTag(user, A1T, z));
        }
        this.A00 = this.A09.A0C.BQl();
        this.A04 = this.A09.A5t();
        this.A02 = this.A09.A1J();
    }
}
