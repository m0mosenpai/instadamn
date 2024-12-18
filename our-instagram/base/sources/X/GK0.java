package X;

import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class GK0 implements InterfaceC42241xE {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ DirectAggregatedMediaViewerController A01;
    public final /* synthetic */ C158797Aq A02;
    public final /* synthetic */ AnonymousClass442 A03;
    public final /* synthetic */ DirectCameraViewModel A04;
    public final /* synthetic */ ArrayList A05;
    public final /* synthetic */ boolean A06;

    public GK0(RectF rectF, DirectAggregatedMediaViewerController directAggregatedMediaViewerController, C158797Aq c158797Aq, AnonymousClass442 anonymousClass442, DirectCameraViewModel directCameraViewModel, ArrayList arrayList, boolean z) {
        this.A04 = directCameraViewModel;
        this.A01 = directAggregatedMediaViewerController;
        this.A02 = c158797Aq;
        this.A00 = rectF;
        this.A05 = arrayList;
        this.A03 = anonymousClass442;
        this.A06 = z;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ImageUrl imageUrl = (ImageUrl) obj;
        C28511Zm c28511Zm = C28531Zo.A04.A01;
        DirectCameraViewModel directCameraViewModel = this.A04;
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A01;
        C3o9 c3o9 = directAggregatedMediaViewerController.A0T;
        if (c3o9 != null) {
            C158797Aq c158797Aq = this.A02;
            String str = c158797Aq.A0T;
            String str2 = c158797Aq.A0N;
            boolean z = c158797Aq.A0m;
            String CGv = C7P5.A00().A01(C2EY.A1C).CGv();
            C22P c22p = C22P.A2N;
            RectF rectF = this.A00;
            ArrayList arrayList = this.A05;
            boolean z2 = c158797Aq.A0q;
            Bundle A00 = c28511Zm.A00(rectF, rectF, c22p, imageUrl, this.A03, directCameraViewModel, c3o9, str, str2, AbstractC111324zv.A00(2869), CGv, arrayList, z, z2, this.A06);
            UserSession userSession = directAggregatedMediaViewerController.A0y;
            FragmentActivity fragmentActivity = directAggregatedMediaViewerController.A0v;
            AbstractC31173DnH.A0v(fragmentActivity, A00, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(110));
            fragmentActivity.overridePendingTransition(0, 0);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
