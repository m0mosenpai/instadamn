package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.HashMap;

/* renamed from: X.2vB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63902vB implements InterfaceC63912vC {
    public InterfaceC690438q A00;
    public final AbstractC60672pq A01;
    public final UserSession A02;
    public final InterfaceC11380iw A03;

    @Override // X.InterfaceC63912vC
    public final void DmK() {
    }

    @Override // X.InterfaceC63912vC
    public final void DmM() {
    }

    @Override // X.InterfaceC63912vC
    public final void DmL(C42665IuM c42665IuM, C105854pw c105854pw) {
        String string;
        HashMap hashMap;
        int i;
        Fragment A02;
        UserSession userSession = this.A02;
        C18920wW A01 = AbstractC12220kQ.A01(this.A03, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, AbstractC111324zv.A00(5378));
        A00.AAP("tracking_token", c105854pw.CAR());
        A00.A8p("m_ix", Integer.valueOf(c42665IuM.getPosition()));
        A00.AAP("sa_action", c105854pw.A00());
        A00.AAP("sa_id", c105854pw.getId());
        A00.Cht();
        c42665IuM.A00 = C05F.A00;
        C42592ItB c42592ItB = new C42592ItB(c105854pw, c42665IuM);
        boolean z = false;
        if (this.A00 != null) {
            z = true;
        }
        C18C.A0F(z);
        AbstractC60672pq abstractC60672pq = this.A01;
        c42592ItB.A00(this.A00, abstractC60672pq.getScrollingViewProxy());
        this.A00.DGa(c105854pw);
        String A002 = c105854pw.A00();
        String A012 = c105854pw.A01();
        if (!A002.equals("rating_and_review_composer") && !A002.equals("browse_topics")) {
            boolean equals = A002.equals("bake_off");
            IgFragmentFactoryImpl A003 = IgFragmentFactoryImpl.A00();
            if (equals) {
                A02 = new AdBakeOffFragment();
                Bundle bundle = new Bundle();
                bundle.putString(AbstractC111324zv.A00(288), A012);
                A02.setArguments(bundle);
            } else {
                A02 = A003.A02(A002, A012);
            }
            C140966Yy c140966Yy = new C140966Yy(abstractC60672pq.requireActivity(), userSession);
            c140966Yy.A0E(A02);
            c140966Yy.A04();
            return;
        }
        Context applicationContext = abstractC60672pq.requireActivity().getApplicationContext();
        String A004 = c105854pw.A00();
        if (!A004.equals("browse_topics")) {
            if (A004.equals("rating_and_review_composer")) {
                hashMap = new HashMap();
                InterfaceC38621qt interfaceC38621qt = c105854pw.A00;
                if (interfaceC38621qt.getProductId() != null) {
                    hashMap.put("product_id", interfaceC38621qt.getProductId());
                }
                if (interfaceC38621qt.BSZ() != null) {
                    hashMap.put("merchant_id", interfaceC38621qt.BSZ());
                }
                hashMap.put(AbstractC111324zv.A00(5153), interfaceC38621qt.BkN());
                if (interfaceC38621qt.BkL() != null) {
                    hashMap.put(AbstractC111324zv.A00(511), interfaceC38621qt.BkL());
                }
                if (interfaceC38621qt.B3t() != null) {
                    hashMap.put(AbstractC111324zv.A00(4416), interfaceC38621qt.B3t());
                }
                string = applicationContext.getResources().getString(2131952355);
                i = 2092;
            } else {
                throw new IllegalStateException(AnonymousClass001.A0R("Simple action type not supported as bloks screen: ", c105854pw.A00()));
            }
        } else {
            string = applicationContext.getResources().getString(2131952427);
            hashMap = new HashMap();
            hashMap.put("event_source", "simple_action");
            i = 2147;
        }
        C66277U6x A013 = C66277U6x.A01(AbstractC111324zv.A00(i), hashMap);
        FragmentActivity requireActivity = abstractC60672pq.requireActivity();
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = string;
        igBloksScreenConfig.A0l = false;
        A013.A04(requireActivity, igBloksScreenConfig);
    }

    public C63902vB(AbstractC60672pq abstractC60672pq, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = interfaceC11380iw;
        this.A01 = abstractC60672pq;
        this.A02 = userSession;
    }
}
