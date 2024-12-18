package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ZP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZP {
    public static C1ZP A01;
    public Xjf A00;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(FragmentActivity fragmentActivity, C3x9 c3x9, UserSession userSession, EnumC39549HdL enumC39549HdL, List list) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A06, userSession, 36328302268530113L)) {
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                list = C16930sl.A00;
            }
            for (Object obj : list) {
                if (C14360o3.A0K(obj, "trending") || ((C14360o3.A0K(obj, "popular_with_your_followers") && C18U.A06(C06090Tz.A05, userSession, 36328302268399039L)) || ((C14360o3.A0K(obj, "trending_with_similar_accounts") && C18U.A06(C06090Tz.A05, userSession, 36328302268464576L)) || (C14360o3.A0K(obj, "original_audio") && C18U.A06(C06090Tz.A05, userSession, 36328302268857797L))))) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() >= 2) {
                Bundle bundle = new Bundle();
                bundle.putString("list_type_id", "trending");
                bundle.putString("page_title", fragmentActivity.getString(2131975732));
                bundle.putStringArrayList("audio_sections", arrayList);
                new C6XJ(fragmentActivity, bundle, userSession, ModalActivity.class, "creator_inspiration_hub_top_audio").A0C(fragmentActivity);
                return;
            }
        }
        A00(fragmentActivity, c3x9, userSession, enumC39549HdL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (r20 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(androidx.fragment.app.FragmentActivity r19, X.C3x9 r20, com.instagram.common.session.UserSession r21, X.EnumC39549HdL r22) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ZP.A00(androidx.fragment.app.FragmentActivity, X.3x9, com.instagram.common.session.UserSession, X.HdL):void");
    }
}
