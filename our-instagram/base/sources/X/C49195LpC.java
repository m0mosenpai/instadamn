package X;

import android.content.Context;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.LpC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49195LpC implements InterfaceC50438MOs {
    @Override // X.InterfaceC50438MOs
    public final ArrayList AWt(Context context, C51760Mtj c51760Mtj, C99E c99e, MessagingUser messagingUser, L8R l8r, InterfaceC50520MRx interfaceC50520MRx, InterfaceC50520MRx interfaceC50520MRx2, Map map, java.util.Set set, java.util.Set set2) {
        MessagingUser messagingUser2;
        ImageUrl imageUrl;
        int i;
        User user;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (interfaceC50520MRx.getCount() > 0) {
            int count = interfaceC50520MRx.getCount() - 1;
            if (interfaceC50520MRx.BTA(count) == 1) {
                long BtD = interfaceC50520MRx.BtD(count);
                User user2 = (User) map.get(interfaceC50520MRx.BtG(count));
                String valueOf = String.valueOf(l8r.A00.mResultSet.getLong(0, 0));
                if (user2 != null) {
                    messagingUser2 = MessagingUser.A00(user2);
                } else {
                    messagingUser2 = new MessagingUser(null, Long.valueOf(BtD), String.valueOf(BtD), 0, true);
                }
                C14360o3.A0A(messagingUser2);
                if (user2 != null) {
                    imageUrl = user2.Bhu();
                } else {
                    imageUrl = null;
                }
                Collection values = map.values();
                if (values.size() != 1 || (user = (User) AbstractC001800i.A0A(values)) == null || (user.A03.Aah() != IGAIAgentType.A05 && user.A03.Aah() != IGAIAgentType.A06 && !user.A1U())) {
                    i = 0;
                } else {
                    i = 8;
                }
                C47908LEc.A00(C05F.A00, "typing_indicator", new C7M8(imageUrl, messagingUser2, null, valueOf, 1, i, false), null, A1E);
            }
        }
        return A1E;
    }
}
