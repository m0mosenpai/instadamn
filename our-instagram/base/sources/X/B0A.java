package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class B0A implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C9B8 A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ AbstractC24481Hr A03;
    public final /* synthetic */ C8MV A04;
    public final /* synthetic */ C8r2 A05;
    public final /* synthetic */ ACA A06;
    public final /* synthetic */ C187028Qv A07;
    public final /* synthetic */ C9ZH A08;
    public final /* synthetic */ FilterGroupModel A09;
    public final /* synthetic */ DirectCameraViewModel A0A;
    public final /* synthetic */ C211689Zc A0B;
    public final /* synthetic */ A96 A0C;
    public final /* synthetic */ C188538Ws A0D;
    public final /* synthetic */ C195868lW A0E;
    public final /* synthetic */ Boolean A0F;
    public final /* synthetic */ Integer A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;
    public final /* synthetic */ String A0L;
    public final /* synthetic */ String A0M;
    public final /* synthetic */ List A0N;
    public final /* synthetic */ List A0O;
    public final /* synthetic */ boolean A0P;
    public final /* synthetic */ boolean A0Q;

    public B0A(Bitmap bitmap, C9B8 c9b8, InterfaceC11380iw interfaceC11380iw, AbstractC24481Hr abstractC24481Hr, C8MV c8mv, C8r2 c8r2, ACA aca, C187028Qv c187028Qv, C9ZH c9zh, FilterGroupModel filterGroupModel, DirectCameraViewModel directCameraViewModel, C211689Zc c211689Zc, A96 a96, C188538Ws c188538Ws, C195868lW c195868lW, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z, boolean z2) {
        this.A04 = c8mv;
        this.A06 = aca;
        this.A07 = c187028Qv;
        this.A0E = c195868lW;
        this.A05 = c8r2;
        this.A01 = c9b8;
        this.A0L = str;
        this.A00 = bitmap;
        this.A03 = abstractC24481Hr;
        this.A0B = c211689Zc;
        this.A0C = a96;
        this.A0D = c188538Ws;
        this.A0M = str2;
        this.A0K = str3;
        this.A09 = filterGroupModel;
        this.A0N = list;
        this.A0O = list2;
        this.A0H = str4;
        this.A0F = bool;
        this.A0J = str5;
        this.A08 = c9zh;
        this.A0Q = z;
        this.A0I = str6;
        this.A0A = directCameraViewModel;
        this.A0P = z2;
        this.A02 = interfaceC11380iw;
        this.A0G = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC24481Hr abstractC24481Hr;
        C8MV c8mv = this.A04;
        C8LT c8lt = c8mv.A08;
        B9H b9h = B9H.A00;
        ACA aca = this.A06;
        C187028Qv c187028Qv = this.A07;
        int A02 = AbstractC50677MYv.A02(aca);
        EnumC40111tc enumC40111tc = EnumC40111tc.A0a;
        C195868lW c195868lW = this.A0E;
        int i = c195868lW.A0F;
        String str = c195868lW.A0f;
        String A05 = c195868lW.A05();
        C8r2 c8r2 = this.A05;
        CameraAREffect cameraAREffect = c8r2.A00;
        UserSession userSession = c8mv.A02;
        HashMap A0D = AbstractC50677MYv.A0D(userSession, c187028Qv.A0E);
        AbstractC50677MYv.A09(c187028Qv.A0D);
        String A0B = AbstractC50677MYv.A0B(c8mv.A05);
        String str2 = c195868lW.A0g;
        boolean z = true;
        if (!c187028Qv.A00()) {
            z = false;
        }
        int A00 = AbstractC50677MYv.A00(c187028Qv.A06);
        Pair A04 = AbstractC50677MYv.A04(c187028Qv.A0E, c187028Qv.A0F);
        MediaTransformation A002 = AHS.A00(c8r2.A04);
        AHS.A02(c8r2);
        Integer A042 = c195868lW.A04();
        String str3 = this.A0L;
        MediaUploadMetadata A022 = c195868lW.A02();
        C14360o3.A0B(b9h, 2);
        C8MW c8mw = c8mv.A07;
        Context context = c8mv.A01;
        Bitmap bitmap = this.A00;
        AbstractC167017dG.A1N(userSession, context);
        if (bitmap != null) {
            abstractC24481Hr = AHW.A01(context, bitmap, userSession, false);
        } else {
            abstractC24481Hr = null;
        }
        AbstractC24481Hr abstractC24481Hr2 = this.A03;
        C211689Zc c211689Zc = this.A0B;
        A96 a96 = this.A0C;
        C188538Ws c188538Ws = this.A0D;
        String str4 = this.A0M;
        String str5 = this.A0K;
        String str6 = c8mv.A0B;
        FilterGroupModel filterGroupModel = this.A09;
        List list = this.A0N;
        List list2 = this.A0O;
        String str7 = this.A0H;
        Boolean bool = this.A0F;
        String str8 = this.A0J;
        C9ZH c9zh = this.A08;
        boolean z2 = this.A0Q;
        C23844Agt c23844Agt = new C23844Agt(userSession, abstractC24481Hr, abstractC24481Hr2, c8r2, c8mw, aca, c9zh, filterGroupModel, this.A0A, c211689Zc, null, a96, c188538Ws, c195868lW, bool, str4, str3, str5, str6, str7, str8, this.A0I, list, list2, false, z2);
        if (this.A0P) {
            AbstractC226339yq.A00(userSession).A01(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, "activity_result", AbstractC16960so.A1N(new C22874A6u(new C198308pf(c195868lW.A0N, c195868lW, c195868lW.A07()), c23844Agt)), true);
        } else {
            A5Y ENf = c23844Agt.ENf(null, null, false);
            c8lt.A02(A04, cameraAREffect, A022, A002, null, enumC40111tc, A042, str, A05, A0B, str2, ENf.A00, str3, null, null, null, null, A0D, A02, i, A00, z);
            AbstractC79383gk.A01(new RunnableC24881Azg(bitmap, this.A02, c8mv, ENf, aca, this.A0G));
        }
    }
}
