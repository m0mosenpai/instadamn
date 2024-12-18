package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Dpu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31329Dpu implements InterfaceC42241xE {
    public final /* synthetic */ AbstractC31330Dpv A00;

    public C31329Dpu(AbstractC31330Dpv abstractC31330Dpv) {
        this.A00 = abstractC31330Dpv;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int i;
        EnumC40111tc enumC40111tc;
        C38321qM A02;
        ExtendedImageUrl A1o;
        String str;
        C38321qM A022;
        String id;
        C2Io c2Io = (C2Io) obj;
        C14360o3.A0B(c2Io, 0);
        AbstractC31330Dpv abstractC31330Dpv = this.A00;
        InterfaceC83733oI A01 = AbstractC31330Dpv.A01(c2Io, abstractC31330Dpv);
        if (A01 != null) {
            List list = c2Io.A02;
            if (list != null && AbstractC166987dD.A1b(list)) {
                LinkedList<C35169FfL> A023 = AbstractC31330Dpv.A02(abstractC31330Dpv, A01, list);
                if (AbstractC166987dD.A1b(A023)) {
                    AbstractC31330Dpv.A06(abstractC31330Dpv, A01, A023);
                    Integer num = abstractC31330Dpv.A00;
                    if (num != null) {
                        int intValue = num.intValue();
                        C81663kb B3U = abstractC31330Dpv.A06.B3U(AbstractC31174DnI.A0b(A01));
                        C7M5 c7m5 = new C7M5(abstractC31330Dpv.A04);
                        for (C35169FfL c35169FfL : A023) {
                            if (B3U != null) {
                                i = B3U.C7g();
                            } else {
                                i = 0;
                            }
                            C14360o3.A0B(c35169FfL, 0);
                            if ((A01 instanceof InterfaceC83703oF) && C4GR.A06(i)) {
                                C38321qM A024 = c35169FfL.A02();
                                if (A024 != null) {
                                    enumC40111tc = A024.BRp();
                                } else {
                                    enumC40111tc = null;
                                }
                                if (enumC40111tc == EnumC40111tc.A0Q && C7M5.A01(c7m5, c35169FfL.A01(), C14360o3.A0K(c35169FfL.A03(), true)) && (A02 = c35169FfL.A02()) != null && (A1o = A02.A1o(intValue)) != null && (str = A1o.A0A) != null && (A022 = c35169FfL.A02()) != null && (id = A022.getId()) != null) {
                                    C7M5.A00(c7m5, new C45061Jwq(A01, null, c35169FfL.A05(), id, null, !C14360o3.A0K(c35169FfL.A07(), c7m5.A01.userId) ? 1 : 0, C14360o3.A0K(c35169FfL.A03(), true), false), null, str);
                                }
                            }
                        }
                    }
                }
            }
            List list2 = c2Io.A04;
            if (list2 != null && AbstractC166987dD.A1b(list2)) {
                LinkedList A025 = AbstractC31330Dpv.A02(abstractC31330Dpv, A01, list2);
                if (AbstractC166987dD.A1b(A025)) {
                    AbstractC31330Dpv.A06(abstractC31330Dpv, A01, A025);
                }
            }
            ArrayList A00 = c2Io.A00();
            if (A00 != null && AbstractC25226BEj.A1b(A00)) {
                AbstractC31330Dpv.A05(abstractC31330Dpv, A01, A00);
            }
        }
    }
}
