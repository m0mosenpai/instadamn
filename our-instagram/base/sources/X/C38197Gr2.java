package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.Gr2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38197Gr2 extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38197Gr2(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166987dD.A0c(view, R.id.interest_background);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.interest_text_view);
        this.A01 = (ImageView) AbstractC166987dD.A0c(view, R.id.interest_icon);
    }

    public final void A00(AbstractC42425IqS abstractC42425IqS, C31691Dvw c31691Dvw, int i, boolean z) {
        String str;
        String str2;
        String str3;
        Integer num = c31691Dvw.A01;
        Integer num2 = C05F.A0C;
        if (num == num2) {
            str = AbstractC166997dE.A0q(this.A02.getResources(), 2131968547);
        } else {
            str = c31691Dvw.A03;
        }
        ExploreTopicCluster exploreTopicCluster = c31691Dvw.A00;
        if (exploreTopicCluster != null) {
            str2 = exploreTopicCluster.A06;
        } else {
            str2 = "";
        }
        int intValue = num.intValue();
        if (intValue != 4 && intValue != 0) {
            if (intValue != 3 && intValue != 1) {
                if (intValue != 2) {
                    throw B4Z.A00();
                }
            } else {
                num2 = C05F.A01;
            }
        } else {
            num2 = C05F.A00;
        }
        if (abstractC42425IqS instanceof C38089GpI) {
            C38089GpI c38089GpI = (C38089GpI) abstractC42425IqS;
            AbstractC167017dG.A1O(str, num2);
            UserSession userSession = c38089GpI.A0B;
            C14360o3.A0B(userSession, 0);
            C38128Gpv c38128Gpv = (C38128Gpv) userSession.A01(C38128Gpv.class, C38178Gqj.A00);
            String str4 = c38089GpI.A0P;
            ExploreTopicCluster exploreTopicCluster2 = c38089GpI.A0I.A00;
            if (exploreTopicCluster2 != null) {
                str3 = exploreTopicCluster2.A06;
            } else {
                str3 = "";
            }
            if (c38128Gpv.A00(str4, str3).add(str2)) {
                C18920wW c18920wW = c38089GpI.A0A;
                String str5 = userSession.userId;
                C14360o3.A0B(c18920wW, 0);
                AbstractC167017dG.A1U(str4, str5);
                if (z) {
                    C41678Id7.A00(userSession, str5, "impression", str, str2);
                    return;
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "explore_topic_tray_impression");
                AbstractC31175DnJ.A0z(A0f, i);
                AbstractC37301Gc2.A16(A0f, str4);
                A0f.AAP("topic_cluster_id", str2);
                A0f.AAP("topic_cluster_title", str);
                A0f.AAP("topic_cluster_type", AbstractC31693Dvy.A00(num2));
                A0f.Cht();
            }
        }
    }
}
