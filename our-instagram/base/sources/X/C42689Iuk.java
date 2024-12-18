package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Iuk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42689Iuk implements InterfaceC58151PqG {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C42689Iuk(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj5;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj;
        this.A01 = obj4;
    }

    @Override // X.InterfaceC58151PqG
    public final void Dar() {
        String Anq;
        String str;
        AFI_TYPE afi_type;
        if (this.A00 != 0) {
            C37675GiC.A08((MediaControlEventSourceEnum) this.A01, (C38321qM) this.A02, (C75113Zb) this.A03, (C37675GiC) this.A05);
            return;
        }
        IJQ ijq = ((C41017IEm) this.A05).A00;
        C64452w4 c64452w4 = ijq.A04;
        Context context = ijq.A00;
        C38321qM c38321qM = ijq.A01;
        HBC hbc = ijq.A03;
        EnumC71153Hb enumC71153Hb = ijq.A02;
        IntentAwareAdPivotState intentAwareAdPivotState = new IntentAwareAdPivotState();
        intentAwareAdPivotState.A02 = -2;
        List A00 = C64452w4.A00(hbc, c64452w4);
        ArrayList A0q = AbstractC167017dG.A0q(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            String A0g = AbstractC37302Gc3.A0g(it);
            if (A0g != null) {
                A0q.add(A0g);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C37330GcY c37330GcY = new C37330GcY();
        UserSession userSession = c64452w4.A00;
        c37330GcY.A02(AbstractC40673I1f.A00(userSession, intentAwareAdPivotState, hbc));
        C31569Dtv A002 = AbstractC34365FDh.A00("feed_contextual_ads_chain");
        A002.A06 = AbstractC111324zv.A00(1667);
        A002.A07 = context.getString(2131974096);
        A002.A0A = c64452w4.A01.A01;
        A002.A0A(AbstractC166987dD.A1F(A0q));
        A002.A08 = c38321qM.getId();
        A002.A09(c37330GcY);
        A002.A01 = AbstractC40672I1e.A00(userSession, c38321qM, intentAwareAdPivotState, enumC71153Hb, hbc);
        AbstractC25229BEm.A18(A002.A08(), AbstractC25225BEi.A0r((FragmentActivity) context, userSession));
        JI9 ji9 = (JI9) this.A02;
        InterfaceC106354qp interfaceC106354qp = (InterfaceC106354qp) this.A03;
        if (!"view_similar".equals("view_similar")) {
            return;
        }
        if (interfaceC106354qp != null && (Anq = interfaceC106354qp.Anq()) != null) {
            C42122IlW c42122IlW = (C42122IlW) ji9;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c42122IlW.A00, "instagram_ads_feedback_interface_view_similar");
            if (!A0f.isSampled()) {
                return;
            }
            C42710Iv5 c42710Iv5 = c42122IlW.A02;
            C38608GyB c38608GyB = c42710Iv5.A06;
            LinkedHashMap A003 = C42122IlW.A00(c42710Iv5, false);
            C42122IlW.A01(A0f, c38608GyB, c42122IlW);
            A0f.AAP("afi_id", c42122IlW.A04);
            C38621GyO c38621GyO = c38608GyB.A01;
            if (c38621GyO == null || (afi_type = c38621GyO.A00) == null || (str = afi_type.A00) == null) {
                str = "";
            }
            AbstractC37302Gc3.A11(A0f, INY.A00(A0f, c38621GyO, c42710Iv5, str, A003), Anq);
            C42122IlW.A02(A0f, c42122IlW, c42710Iv5.A00);
            A0f.Cht();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58151PqG
    public final void Dja() {
        if (this.A00 != 0) {
            ((C37675GiC) this.A05).A0b.Dm3((C38321qM) this.A02, (C75113Zb) this.A03, AbstractC40627Hzl.A00((Integer) this.A04), true, false);
            return;
        }
        C41759Iea.A03((JI9) this.A02, (InterfaceC106354qp) this.A03, (C38621GyO) this.A01);
    }

    @Override // X.InterfaceC58151PqG
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58151PqG
    public final void onShow() {
        String Anq;
        String str;
        AFI_TYPE afi_type;
        if (this.A00 == 0) {
            JI9 ji9 = (JI9) this.A02;
            InterfaceC106354qp interfaceC106354qp = (InterfaceC106354qp) this.A03;
            if ("view_similar".equals("view_similar")) {
                if (interfaceC106354qp != null && (Anq = interfaceC106354qp.Anq()) != null) {
                    C42122IlW c42122IlW = (C42122IlW) ji9;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c42122IlW.A00, "instagram_ads_feedback_interface_view_similar_impression");
                    if (A0f.isSampled()) {
                        C42710Iv5 c42710Iv5 = c42122IlW.A02;
                        C38608GyB c38608GyB = c42710Iv5.A06;
                        LinkedHashMap A00 = C42122IlW.A00(c42710Iv5, false);
                        C42122IlW.A01(A0f, c38608GyB, c42122IlW);
                        A0f.AAP("afi_id", c42122IlW.A04);
                        C38621GyO c38621GyO = c38608GyB.A01;
                        if (c38621GyO == null || (afi_type = c38621GyO.A00) == null || (str = afi_type.A00) == null) {
                            str = "";
                        }
                        AbstractC37302Gc3.A11(A0f, INY.A00(A0f, c38621GyO, c42710Iv5, str, A00), Anq);
                        C42122IlW.A02(A0f, c42122IlW, c42710Iv5.A00);
                        A0f.Cht();
                        return;
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
