package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1XQ, reason: invalid class name */
/* loaded from: classes.dex */
public interface C1XQ {
    public static final C73270XzG A00 = C73270XzG.A00;

    Bundle AME(UserSession userSession, FollowListData followListData, boolean z);

    Bundle ANO(UserSession userSession, User user, FollowListData followListData, ArrayList arrayList, HashMap hashMap, boolean z);

    EJX CsH(UserSession userSession);

    C31535DtK CsL(UserSession userSession, FollowListData followListData);

    V1W CsM(UserSession userSession, String str, String str2, boolean z);

    C31535DtK CsO(UserSession userSession, String str, String str2, boolean z);

    Fragment CsT(Bundle bundle, UserSession userSession);

    ENH CsY(UserSession userSession, String str, String str2, ArrayList arrayList, HashMap hashMap, boolean z);

    ENY CsZ(Bundle bundle, UserSession userSession, SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig);

    UnifiedFollowFragment Csi(Bundle bundle);

    UnifiedFollowFragment Csj(UserSession userSession, User user, FollowListData followListData, ArrayList arrayList, HashMap hashMap, boolean z);
}
