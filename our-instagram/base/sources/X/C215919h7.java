package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.user.model.User;
import java.io.File;
import java.util.List;

/* renamed from: X.9h7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215919h7 extends C2AH {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C215919h7(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A03 = obj3;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = obj;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 1:
                AbstractC12120kG.A01("CanvasBirthdayHighlightsController", "Unable to create medium for reel item");
                C218079kf.A03((C218079kf) this.A02, (List) this.A04, this.A01 + 1);
                return;
            case 2:
                C14360o3.A0B(exc, 0);
                AbstractC12120kG.A07("CanvasEndOfYearController", "Unable to create medium for reel item", exc);
                C218099kh.A03((C218099kh) this.A04, (List) this.A03, this.A01 + 1);
                return;
            default:
                super.onFail(exc);
                return;
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        C216239hg c216239hg;
        C23677AeC c23677AeC;
        File file = (File) obj;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(file, 0);
                C38321qM c38321qM = (C38321qM) this.A03;
                Medium A03 = C8IU.A03(file, AbstractC167017dG.A0J(c38321qM), 0);
                C218049kc c218049kc = (C218049kc) this.A04;
                int A0z = c38321qM.A0z();
                int A0y = c38321qM.A0y();
                A03.A0B = A0z;
                A03.A04 = A0y;
                A03.A0H = AbstractC22750A1u.A00(c218049kc.A07, file, A03.Cff());
                int i = this.A01;
                C5GJ c5gj = (C5GJ) this.A02;
                c218049kc.A02.put(i, A03);
                C218049kc.A00(c5gj, c218049kc, i);
                return;
            case 1:
                C38321qM c38321qM2 = (C38321qM) this.A03;
                int A0J = AbstractC167017dG.A0J(c38321qM2);
                C14360o3.A0B(file, 0);
                Medium A032 = C8IU.A03(file, A0J, 0);
                C218079kf c218079kf = (C218079kf) this.A02;
                List list = (List) this.A04;
                int i2 = this.A01;
                if (c38321qM2.Cff()) {
                    try {
                        Context context = c218079kf.A03;
                        float A0A = AbstractC167017dG.A0A(context);
                        UserSession userSession = c218079kf.A05;
                        EnumC222999se enumC222999se = EnumC222999se.A0B;
                        TargetViewSizeProvider targetViewSizeProvider = c218079kf.A07;
                        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
                        int width = interfaceC1812882f.getWidth();
                        int height = interfaceC1812882f.getHeight();
                        C206169Az c206169Az = new C206169Az(A0A);
                        AbstractC167007dF.A1D(userSession, 1, A032);
                        C210399Se c210399Se = new C210399Se(c206169Az, A032, userSession, enumC222999se, EnumC222939sY.A06, "gallery_story_video_sticker", 0.0f, width, height, -1, Integer.MIN_VALUE, false);
                        C88Y c88y = c218079kf.A08;
                        c88y.A0C(c210399Se, AMV.A03(c218079kf.A06), true);
                        C218079kf.A01(c218079kf);
                        C218079kf.A02(c218079kf, c38321qM2);
                        AA0 A00 = C88Y.A00(c88y, c38321qM2);
                        A00.A03 = C218079kf.A00(context, c210399Se.A00(0L), targetViewSizeProvider);
                        A00.A02 = c210399Se.A00(0L);
                        c218079kf.A01.add(A00);
                        C218079kf.A03(c218079kf, list, i2 + 1);
                        return;
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str = "CanvasBirthdayHighlightsController";
                        str2 = "Error creating video sticker for birthday highlight story.";
                        break;
                    }
                } else {
                    Context context2 = c218079kf.A03;
                    User A2E = c38321qM2.A2E(c218079kf.A05);
                    A2E.getClass();
                    String A2u = c38321qM2.A2u();
                    InterfaceC1812882f interfaceC1812882f2 = ((NineSixteenLayoutConfigImpl) c218079kf.A07).A0K;
                    c216239hg = new C216239hg(context2, A032, A2E, A2u, interfaceC1812882f2.getWidth(), interfaceC1812882f2.getHeight(), false);
                    c23677AeC = new C23677AeC(c38321qM2, c216239hg, c218079kf, list, i2, 0);
                    c216239hg.A9I(c23677AeC);
                    return;
                }
            default:
                C14360o3.A0B(file, 0);
                C38321qM c38321qM3 = (C38321qM) this.A02;
                Medium A033 = C8IU.A03(file, AbstractC167017dG.A0J(c38321qM3), 0);
                C218099kh c218099kh = (C218099kh) this.A04;
                List list2 = (List) this.A03;
                int i3 = this.A01;
                if (c38321qM3.Cff()) {
                    try {
                        float A0A2 = AbstractC167017dG.A0A(c218099kh.A07);
                        UserSession userSession2 = c218099kh.A08;
                        EnumC222999se enumC222999se2 = EnumC222999se.A0B;
                        InterfaceC1812882f interfaceC1812882f3 = ((NineSixteenLayoutConfigImpl) c218099kh.A0A).A0K;
                        C210399Se c210399Se2 = new C210399Se(new C206169Az(A0A2), A033, userSession2, enumC222999se2, EnumC222939sY.A06, "gallery_story_video_sticker", 0.0f, interfaceC1812882f3.getWidth(), interfaceC1812882f3.getHeight(), -1, Integer.MIN_VALUE, false);
                        C88Y c88y2 = c218099kh.A0B;
                        c88y2.A0C(c210399Se2, AMV.A03(c218099kh.A09), true);
                        C218099kh.A00(c218099kh);
                        String id = c38321qM3.getId();
                        if (id != null) {
                            C199008r1 A034 = c88y2.A03(null, id);
                            C14360o3.A07(A034);
                            String id2 = c38321qM3.getId();
                            if (id2 != null) {
                                AA0 aa0 = new AA0(A034, id2);
                                aa0.A00 = c218099kh.A00;
                                aa0.A02 = c210399Se2.A00(0L);
                                if (c218099kh.A04) {
                                    c218099kh.A03.add(aa0);
                                    i3++;
                                } else {
                                    c218099kh.A04 = true;
                                }
                                C218099kh.A03(c218099kh, list2, i3);
                                return;
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        str = "CanvasEndOfYearController";
                        str2 = "Error creating video sticker for EOY story.";
                        break;
                    }
                } else {
                    Context context3 = c218099kh.A07;
                    User A2E2 = c38321qM3.A2E(c218099kh.A08);
                    if (A2E2 != null) {
                        String A2u2 = c38321qM3.A2u();
                        if (A2u2 != null) {
                            InterfaceC1812882f interfaceC1812882f4 = ((NineSixteenLayoutConfigImpl) c218099kh.A0A).A0K;
                            c216239hg = new C216239hg(context3, A033, A2E2, A2u2, interfaceC1812882f4.getWidth(), interfaceC1812882f4.getHeight(), false);
                            c23677AeC = new C23677AeC(list2, c218099kh, c38321qM3, c216239hg, i3, 1);
                            c216239hg.A9I(c23677AeC);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
        }
        AbstractC12120kG.A0E(str, str2, e);
    }
}
