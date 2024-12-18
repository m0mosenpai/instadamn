package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GpZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38106GpZ implements JPT {
    public final /* synthetic */ C38105GpY A00;

    @Override // X.InterfaceC43449JHn
    public final void DKV(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A00.A02.DKV(c38321qM);
    }

    @Override // X.JPT
    public final void DLL(View view, C5qT c5qT, AbstractC127945qN abstractC127945qN, C38321qM c38321qM) {
        C132835z6 c132835z6;
        ArrayList arrayList;
        AbstractC25233BEq.A0v(0, abstractC127945qN, c5qT, view);
        AbstractC42425IqS abstractC42425IqS = this.A00.A02;
        C128045qY c128045qY = (C128045qY) abstractC127945qN;
        if (abstractC42425IqS instanceof C38089GpI) {
            C38089GpI c38089GpI = (C38089GpI) abstractC42425IqS;
            C14360o3.A0B(c128045qY, 0);
            C132825z5 c132825z5 = c128045qY.A01;
            C18920wW c18920wW = c38089GpI.A0A;
            C38321qM A00 = I0C.A00(c132825z5.A00);
            C127915qK c127915qK = c128045qY.A02;
            EnumC130515uw enumC130515uw = EnumC130515uw.A09;
            ExploreTopicCluster exploreTopicCluster = c38089GpI.A0J().A02;
            String str = c38089GpI.A0P;
            C130505uv c130505uv = c128045qY.A03;
            if (c130505uv != null) {
                c132835z6 = c130505uv.A06;
            } else {
                c132835z6 = null;
            }
            Long valueOf = Long.valueOf(c128045qY.A00);
            AbstractC25229BEm.A1I(c18920wW, 0, str);
            C38206GrB A06 = AbstractC42425IqS.A06(c5qT, c127915qK, exploreTopicCluster, A00);
            String str2 = A06.A09;
            String str3 = A06.A0B;
            String str4 = A06.A0A;
            if (c132835z6 != null) {
                str2 = c132835z6.A03;
                str3 = AbstractC127885qH.A00(c132835z6.A01());
                str4 = c132835z6.A00().A04;
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "explore_home_click");
            AbstractC37301Gc2.A16(A0f, str);
            String str5 = A06.A05;
            if (str5 == null) {
                str5 = "";
            }
            AbstractC42425IqS.A08(enumC130515uw, A0f, A06, str5, str2);
            AbstractC42425IqS.A09(A0f, A06, str3, str4, null);
            List list = A06.A0C;
            String str6 = null;
            if (list != null) {
                arrayList = AbstractC167007dF.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC37302Gc3.A1Y(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            AbstractC42425IqS.A0A(A0f, valueOf, null, arrayList);
            if (A00 != null) {
                str6 = AbstractC42425IqS.A07(A00);
            }
            A0f.AAP("social_proof_interaction_type", str6);
            A0f.AAP("content_source_type", null);
            A0f.Cht();
            C14360o3.A0F("instance");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.JPT
    public final /* synthetic */ void DLV(C38321qM c38321qM) {
    }

    @Override // X.JPT
    public final /* synthetic */ void DLY(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC43449JHn
    public final /* synthetic */ void DRu(C38321qM c38321qM, Integer num, int i, int i2) {
    }

    @Override // X.InterfaceC43449JHn
    public final /* synthetic */ void DRw(C38321qM c38321qM, Integer num, int i, int i2) {
    }

    @Override // X.InterfaceC43449JHn
    public final boolean DSM(MotionEvent motionEvent, View view, C5qT c5qT, C38321qM c38321qM) {
        return false;
    }

    public C38106GpZ(C38105GpY c38105GpY) {
        this.A00 = c38105GpY;
    }

    @Override // X.JPT
    public final /* synthetic */ boolean BWN() {
        return false;
    }
}
