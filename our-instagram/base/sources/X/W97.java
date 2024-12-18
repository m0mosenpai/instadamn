package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* loaded from: classes11.dex */
public final class W97 {
    public int A00;
    public final BaseFragmentActivity A01;
    public final UserSession A02;
    public final String A03;
    public final InterfaceC09390do A04;
    public final C51756Mtf A05;
    public final XA7 A06;

    public W97(C51756Mtf c51756Mtf, BaseFragmentActivity baseFragmentActivity, XA7 xa7, UserSession userSession, String str) {
        C14360o3.A0B(baseFragmentActivity, 1);
        this.A01 = baseFragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
        this.A05 = c51756Mtf;
        this.A06 = xa7;
        this.A04 = AbstractC09440dt.A01(new X31(this, 6));
    }

    public static final void A00(W97 w97) {
        C50627MWo c50627MWo = (C50627MWo) AbstractC001800i.A0O((List) w97.A05.A00, w97.A00);
        if (c50627MWo == null) {
            A01(w97, V20.A00);
            return;
        }
        Integer num = (Integer) c50627MWo.A01;
        C14360o3.A0B(num, 0);
        C69094Vhk c69094Vhk = new C69094Vhk((C18920wW) w97.A04.getValue(), num, w97.A03);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                w97.A00++;
                A00(w97);
                return;
            }
            throw new RuntimeException();
        }
        C69285Vkt c69285Vkt = new C69285Vkt(w97.A01, c69094Vhk, w97.A02);
        C70634WeE c70634WeE = new C70634WeE(w97);
        if (((C50525MSe) c50627MWo.A00).A02) {
            C70187WFq.A03(c69285Vkt.A00, (AbstractC018607g) AbstractC166987dD.A17(c69285Vkt.A04), new C70661Weh(new C70632WeC(c50627MWo, c69285Vkt, c70634WeE)), c69285Vkt.A02);
            return;
        }
        WFC.A01(c50627MWo, c69285Vkt, c70634WeE);
    }

    public static final void A01(W97 w97, AbstractC68953Ver abstractC68953Ver) {
        String str;
        C18920wW A02 = AbstractC12220kQ.A02(w97.A02);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "promote_client_token_returned");
        A00.AAP("event", "promote_client_token_returned");
        A00.AAP("flow", "ig_professional_access_token_library");
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, w97.A03);
        int intValue = abstractC68953Ver.A00.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                str = null;
            } else {
                throw new RuntimeException();
            }
        } else {
            str = "business_user_access_token";
        }
        A00.AAP("token_type", str);
        A00.Cht();
        w97.A06.Dh1(abstractC68953Ver);
    }
}
