package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.NoteChatResponseInfo;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FeS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35125FeS {
    public final FragmentActivity A00;
    public final C6C9 A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new MHM(this, 5));

    public static final void A00(C35125FeS c35125FeS, GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success) {
        ArrayList arrayList;
        NoteChatResponseInfo noteChatResponseInfo;
        List ByV;
        AbstractC25235BEs.A1Q(c35125FeS.A04);
        C6C9 c6c9 = c35125FeS.A01;
        C67s c67s = c6c9.A0A;
        if (c67s != null && (noteChatResponseInfo = c67s.A08) != null && (ByV = noteChatResponseInfo.ByV()) != null) {
            arrayList = AbstractC167017dG.A0q(ByV);
            Iterator it = ByV.iterator();
            while (it.hasNext()) {
                AbstractC31181DnP.A10(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("GroupPreviewFragment.NOTE_ID", c6c9.A0H);
        if (arrayList != null && !arrayList.isEmpty()) {
            A0b.putSerializable("GroupPreviewFragment.CUSTOM_PROFILE_IMAGES", arrayList);
        }
        User user = c6c9.A0D;
        FragmentActivity fragmentActivity = c35125FeS.A00;
        A0b.putString("GroupPreviewFragment.GROUP_AUTHOR_NAME", AbstractC44198Jg1.A05(AbstractC166987dD.A0O(fragmentActivity), user));
        A0b.putSerializable("GroupPreviewFragment.INVITE_LINK_SOURCE_KEY", "note_chat");
        EN8 A00 = AbstractC35059FcW.A00(A0b, new G3V(0), groupLinkPreviewResponse$Success);
        C189448aO A0y = AbstractC25225BEi.A0y(c35125FeS.A03);
        A0y.A0U = A00;
        AbstractC31173DnH.A0w(fragmentActivity, A00, A0y);
    }

    public static final void A01(C35125FeS c35125FeS, boolean z) {
        C1ON A09 = AbstractC47995LLh.A09(c35125FeS.A03, c35125FeS.A01.A0H);
        A09.A00 = new EUO(3, c35125FeS, z);
        C1GJ.A04(A09, 1695661322);
    }

    public C35125FeS(FragmentActivity fragmentActivity, C6C9 c6c9, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = interfaceC11380iw;
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A01 = c6c9;
    }
}
