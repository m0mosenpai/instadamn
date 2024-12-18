package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.io.IOException;

/* renamed from: X.Avu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24660Avu implements Runnable {
    public final /* synthetic */ C8JT A00;
    public final /* synthetic */ AbstractC115485Ki A01;

    public RunnableC24660Avu(C8JT c8jt, AbstractC115485Ki abstractC115485Ki) {
        this.A00 = c8jt;
        this.A01 = abstractC115485Ki;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AGJ agj;
        C8JT c8jt = this.A00;
        if (C8JT.A1U(c8jt)) {
            C57012jc c57012jc = c8jt.A1E;
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            A01.setOutlineProvider(null);
            A01.setClipToOutline(false);
            int width = c57012jc.A01().getWidth();
            int height = c57012jc.A01().getHeight();
            AbstractC172157lk abstractC172157lk = (AbstractC172157lk) c8jt.A1x.A03.A02();
            ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = c8jt.A1w;
            if (viewOnTouchListenerC1829389o != null && abstractC172157lk != null) {
                AbstractC219819nT abstractC219819nT = viewOnTouchListenerC1829389o.A0K;
                if (abstractC172157lk instanceof C171737l3) {
                    agj = new AGJ(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 207, true, true);
                } else if (abstractC172157lk instanceof C172147lj) {
                    int ordinal = ((C172147lj) abstractC172157lk).A00.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            agj = A0C.A00(abstractC219819nT.A01, height);
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        agj = new AGJ(width / 4.0f, 0.0f, 0.5f, 0.5f, 0.0f, 242, false, false);
                    }
                } else if (abstractC172157lk instanceof C171757l5) {
                    if (((C171757l5) abstractC172157lk).A00.ordinal() == 0) {
                        agj = new AGJ(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 207, true, true);
                    } else {
                        throw B4Z.A00();
                    }
                }
                View A012 = c57012jc.A01();
                C14360o3.A07(A012);
                float height2 = ((NineSixteenLayoutConfigImpl) c8jt.A1H).A0K.getHeight();
                float f = agj.A00;
                AbstractC13880nE.A0W(A012, (int) (height2 * f));
                c57012jc.A01().setTranslationX(agj.A01);
                c57012jc.A01().setTranslationY(agj.A02);
                if (f < 1.0f) {
                    c57012jc.A01().setTranslationY(r7.getHeight() * f);
                }
                c57012jc.A01().setScaleY(agj.A03);
                c57012jc.A01().setScaleX(agj.A04);
                boolean z = agj.A05;
                if (z && agj.A06) {
                    View A013 = c57012jc.A01();
                    C14360o3.A07(A013);
                    AbstractC185998Mt.A00(A013);
                } else if (z) {
                    View A014 = c57012jc.A01();
                    C14360o3.A07(A014);
                    float A0B = AbstractC167017dG.A0B(A014.getContext());
                    AbstractC185998Mt.A01(A014, A0B, (int) (1.0f - A0B));
                }
            }
        } else {
            C8JT.A0l(c8jt);
        }
        try {
            C183378Bk c183378Bk = c8jt.A1c;
            C115475Kh c115475Kh = (C115475Kh) this.A01;
            String A0E = c115475Kh.A0E();
            int abs = (int) (c115475Kh.A08 * Math.abs(c115475Kh.A00));
            C57012jc c57012jc2 = c8jt.A1E;
            c57012jc2.A01().getWidth();
            int height3 = c57012jc2.A01().getHeight();
            C14360o3.A0B(A0E, 0);
            boolean exists = C183378Bk.A00(new C209059Mn(height3), c183378Bk, AbstractC54870OOf.A00(A0E), abs).exists();
            String A0E2 = c115475Kh.A0E();
            if (exists) {
                int width2 = c57012jc2.A01().getWidth();
                int height4 = c57012jc2.A01().getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                C56279Oyo c56279Oyo = new C56279Oyo(c8jt, 0);
                C14360o3.A0B(A0E2, 0);
                C115475Kh A00 = AbstractC54870OOf.A00(A0E2);
                C14360o3.A0B(A00, 0);
                C183378Bk.A01(config, c56279Oyo, c183378Bk, A00, (int) (A00.A08 * Math.abs(A00.A00)), width2, height4, false);
                return;
            }
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c8jt.A1H).A0K;
            c183378Bk.A03(Bitmap.Config.ARGB_8888, new C56279Oyo(c8jt, 0), A0E2, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight());
        } catch (IOException e) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "Fail to get frame file for last segment", e);
        }
    }
}
