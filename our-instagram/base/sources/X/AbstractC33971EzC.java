package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;

/* renamed from: X.EzC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33971EzC {
    public static final Object A00(C6FQ c6fq) {
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
        if (C18U.A06(AbstractC166997dE.A0U(A0J), A0J, 2342161673576061323L)) {
            AbstractC31181DnP.A0Z(FBR.A00(EnumC72365Xc1.A09, null), A04, A0J);
            return null;
        }
        DirectMessagesOptionsFragment directMessagesOptionsFragment = new DirectMessagesOptionsFragment();
        Bundle A0B = AbstractC31177DnL.A0B(directMessagesOptionsFragment);
        A0B.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
        A0B.putSerializable(AbstractC43591JPw.A00(195), EnumC33470Er5.PRIVACY_SETTINGS);
        directMessagesOptionsFragment.setArguments(A0B);
        AbstractC31178DnM.A0t(null, directMessagesOptionsFragment, A04, A0J);
        return null;
    }
}
