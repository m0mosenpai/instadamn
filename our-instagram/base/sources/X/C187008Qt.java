package X;

import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187008Qt {
    public int A00;
    public long A01;
    public C187018Qu A02;
    public boolean A03;
    public final UserSession A04;

    public C187008Qt(UserSession userSession) {
        C187018Qu c187018Qu;
        List list;
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = AbstractC23021Ah.A00(userSession).A01.getInt("story_audience_lists_count", 0);
        this.A03 = AbstractC23021Ah.A00(userSession).A01.getBoolean("has_fetched_audience_lists_share_info", false);
        this.A01 = AbstractC23021Ah.A00(userSession).A01.getLong("last_fetched_audience_lists_share_info_timestamp_ms", 0L);
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(this.A04).A01;
        String string = interfaceC19630xq.getString("last_used_audience_list_id", null);
        String string2 = interfaceC19630xq.getString("last_used_audience_list_name", null);
        if (string != null && string2 != null) {
            int i = interfaceC19630xq.getInt("last_used_audience_list_member_count", 0);
            java.util.Set stringSet = interfaceC19630xq.getStringSet("last_used_audience_list_social_context_members", null);
            if (stringSet != null) {
                list = AbstractC001800i.A0a(stringSet);
            } else {
                list = C16930sl.A00;
            }
            c187018Qu = new C187018Qu(string, string2, list, i, interfaceC19630xq.getBoolean("last_used_audience_list_is_default", true), interfaceC19630xq.getBoolean("last_used_audience_list_is_named", false));
        } else {
            c187018Qu = null;
        }
        this.A02 = c187018Qu;
    }

    public final void A03(String str, String str2, List list, int i, boolean z, boolean z2) {
        C187018Qu c187018Qu;
        List list2 = list;
        if (list == null) {
            list2 = new ArrayList();
        }
        if (str != null && str2 != null) {
            c187018Qu = new C187018Qu(str, str2, list2, i, z, z2);
        } else {
            c187018Qu = null;
        }
        this.A02 = c187018Qu;
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(this.A04).A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7K("last_used_audience_list_id", str);
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7K("last_used_audience_list_name", str2);
        ARD2.apply();
        InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
        ARD3.E7D("last_used_audience_list_member_count", i);
        ARD3.apply();
        List A0X = AbstractC001800i.A0X(list2);
        InterfaceC19610xo ARD4 = interfaceC19630xq.ARD();
        ARD4.E7L("last_used_audience_list_social_context_members", AbstractC001800i.A0k(A0X));
        ARD4.apply();
        InterfaceC19610xo ARD5 = interfaceC19630xq.ARD();
        ARD5.E77("last_used_audience_list_is_default", z);
        ARD5.apply();
        InterfaceC19610xo ARD6 = interfaceC19630xq.ARD();
        ARD6.E77("last_used_audience_list_is_named", z2);
        ARD6.apply();
    }

    public final void A01(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            C23031Ai A00 = AbstractC23021Ah.A00(this.A04);
            int i2 = this.A00;
            InterfaceC19610xo ARD = A00.A01.ARD();
            ARD.E7D("story_audience_lists_count", i2);
            ARD.apply();
        }
    }

    public final void A02(AudienceListViewModel audienceListViewModel) {
        List list = audienceListViewModel.A03;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).Bhu().getUrl());
        }
        A03(audienceListViewModel.A01, audienceListViewModel.A02, arrayList, audienceListViewModel.A00, audienceListViewModel.A05, audienceListViewModel.A06);
    }

    public final void A00() {
        this.A01 = System.currentTimeMillis();
        C23031Ai A00 = AbstractC23021Ah.A00(this.A04);
        long j = this.A01;
        InterfaceC19610xo ARD = A00.A01.ARD();
        ARD.E7G("last_fetched_audience_lists_share_info_timestamp_ms", j);
        ARD.apply();
    }
}
