package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;

/* renamed from: X.KJz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45688KJz extends C2AH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AbstractC10360h2 A02;
    public final /* synthetic */ C07X A03;
    public final /* synthetic */ InterfaceC11380iw A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C38321qM A06;
    public final /* synthetic */ C6WQ A07;
    public final /* synthetic */ Integer A08;

    public C45688KJz(Context context, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, C07X c07x, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C6WQ c6wq, Integer num) {
        this.A07 = c6wq;
        this.A00 = context;
        this.A06 = c38321qM;
        this.A01 = fragmentActivity;
        this.A05 = userSession;
        this.A02 = abstractC10360h2;
        this.A03 = c07x;
        this.A04 = interfaceC11380iw;
        this.A08 = num;
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        this.A07.dismiss();
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        C6WQ c6wq = this.A07;
        AbstractC31176DnK.A13(this.A00, c6wq);
        C0fJ.A00(c6wq);
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C140966Yy A0r;
        String str;
        File file = (File) obj;
        C14360o3.A0B(file, 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            C38321qM c38321qM = this.A06;
            if (c38321qM.A5x()) {
                FragmentActivity fragmentActivity = this.A01;
                Context context = this.A00;
                UserSession userSession = this.A05;
                AbstractC10360h2 abstractC10360h2 = this.A02;
                C07X c07x = this.A03;
                InterfaceC11380iw interfaceC11380iw = this.A04;
                Integer num = this.A08;
                abstractC10360h2.A0u(new LRW(context, fragmentActivity, abstractC10360h2, interfaceC11380iw, userSession), c07x, "cutout_sticker_creation_fragment_request_key");
                KC8 A00 = LD7.A00(num, canonicalPath, c38321qM.A38());
                A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
                A0r.A09();
                A0r.A0D(A00);
                str = "cutout_photo_post_creation_flow";
            } else if (c38321qM.Cff()) {
                FragmentActivity fragmentActivity2 = this.A01;
                Context context2 = this.A00;
                UserSession userSession2 = this.A05;
                AbstractC10360h2 abstractC10360h22 = this.A02;
                C07X c07x2 = this.A03;
                InterfaceC11380iw interfaceC11380iw2 = this.A04;
                Integer num2 = this.A08;
                abstractC10360h22.A0u(new LRW(context2, fragmentActivity2, abstractC10360h22, interfaceC11380iw2, userSession2), c07x2, "cutout_sticker_creation_fragment_request_key");
                C14360o3.A0B(num2, 1);
                KCA A002 = AbstractC46680Kkx.A00(num2, canonicalPath, false);
                A0r = AbstractC25225BEi.A0r(fragmentActivity2, userSession2);
                A0r.A09();
                A0r.A0D(A002);
                str = "cutout_video_post_creation_flow";
            } else {
                return;
            }
            A0r.A0A = str;
            A0r.A04();
        } catch (IOException e) {
            AbstractC12120kG.A07("sticker_anything_fragment_navigation", MSV.A00(761), e);
        }
    }
}
