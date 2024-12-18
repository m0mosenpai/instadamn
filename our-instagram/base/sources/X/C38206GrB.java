package X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GrB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38206GrB {
    public final EnumC123285i3 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;

    public C38206GrB(C5qT c5qT, C127915qK c127915qK, ExploreTopicCluster exploreTopicCluster, C38321qM c38321qM) {
        String str;
        String str2;
        EnumC123285i3 enumC123285i3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        List list;
        List BSa;
        ArrayList arrayList = null;
        if (c38321qM != null) {
            str = c38321qM.getId();
        } else {
            str = null;
        }
        this.A04 = str;
        if (exploreTopicCluster != null) {
            str2 = exploreTopicCluster.A06;
        } else {
            str2 = null;
        }
        this.A09 = str2;
        if (c38321qM != null) {
            enumC123285i3 = c38321qM.BRp().A00();
        } else {
            enumC123285i3 = EnumC123285i3.UNKNOWN;
        }
        this.A00 = enumC123285i3;
        if (exploreTopicCluster != null) {
            str3 = AbstractC127885qH.A00(exploreTopicCluster.A00());
        } else {
            str3 = null;
        }
        this.A0B = str3;
        if (exploreTopicCluster != null) {
            str4 = exploreTopicCluster.A0A;
        } else {
            str4 = null;
        }
        this.A0A = str4;
        if (exploreTopicCluster != null) {
            str5 = exploreTopicCluster.A05;
        } else {
            str5 = null;
        }
        this.A08 = str5;
        if (c38321qM != null) {
            str6 = c38321qM.A0C.getMezqlToken();
        } else {
            str6 = null;
        }
        this.A03 = str6;
        if (c38321qM != null) {
            str7 = c38321qM.A0C.getAlgorithm();
        } else {
            str7 = null;
        }
        this.A01 = str7;
        if (c38321qM != null) {
            str8 = c38321qM.A0C.getConnectionId();
        } else {
            str8 = null;
        }
        this.A02 = str8;
        if (c5qT != null) {
            str9 = AbstractC154266wb.A01(c5qT.A01, c5qT.A00);
        } else {
            str9 = null;
        }
        this.A05 = str9;
        if (c38321qM != null) {
            str10 = c38321qM.A0C.getLoggingInfoToken();
        } else {
            str10 = null;
        }
        this.A06 = str10;
        if (c127915qK != null) {
            str11 = AbstractC154266wb.A01(c127915qK.A01, c127915qK.A03);
        } else {
            str11 = null;
        }
        this.A07 = str11;
        if (c38321qM != null) {
            list = c38321qM.A3o();
        } else {
            list = null;
        }
        this.A0D = list;
        if (c38321qM != null && (BSa = c38321qM.BSa()) != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(BSa, 10));
            Iterator it = BSa.iterator();
            while (it.hasNext()) {
                arrayList.add(C4SX.A00((String) it.next()));
            }
        }
        this.A0C = arrayList;
    }
}
