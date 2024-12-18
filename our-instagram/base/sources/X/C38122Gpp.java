package X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.Gpp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38122Gpp implements InterfaceC71927XAl {
    public final /* synthetic */ C18920wW A00;
    public final /* synthetic */ C38P A01;

    @Override // X.InterfaceC71927XAl
    public final void DKI(C69296Vl4 c69296Vl4) {
        String str;
        String str2;
        C14360o3.A0B(c69296Vl4, 0);
        C132835z6 c132835z6 = c69296Vl4.A01;
        if (c132835z6 != null) {
            C18920wW c18920wW = this.A00;
            Long l = null;
            String str3 = c132835z6.A03;
            String A00 = AbstractC127885qH.A00(c132835z6.A01());
            C38P c38p = this.A01;
            C37934GmW c37934GmW = c38p.A0E;
            if (c37934GmW == null) {
                str2 = "dataStore";
            } else {
                ExploreTopicCluster exploreTopicCluster = c37934GmW.A02;
                if (exploreTopicCluster != null) {
                    str = exploreTopicCluster.A05;
                } else {
                    str = null;
                }
                String str4 = c69296Vl4.A02;
                String moduleName = c38p.getModuleName();
                Integer num = c69296Vl4.A00;
                if (num != null) {
                    l = AbstractC25229BEm.A0n(num);
                }
                C14360o3.A0B(c18920wW, 0);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "explore_container_header_click");
                AbstractC31171DnF.A1I(A0f, moduleName);
                A0f.AAP("topic_cluster_id", str3);
                A0f.AAP("topic_cluster_debug_info", str);
                A0f.AAP("topic_cluster_type", A00);
                A0f.AAP("topic_cluster_title", str4);
                A0f.A9K("page_num", l);
                A0f.Cht();
                C38089GpI c38089GpI = c38p.A0C;
                if (c38089GpI == null) {
                    str2 = "exploreGridDelegate";
                } else {
                    c38089GpI.A0K(str4);
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    public C38122Gpp(C18920wW c18920wW, C38P c38p) {
        this.A00 = c18920wW;
        this.A01 = c38p;
    }
}
