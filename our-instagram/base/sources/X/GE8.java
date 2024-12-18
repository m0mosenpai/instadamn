package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class GE8 implements GYB {
    public final FragmentActivity A00;
    public final AbstractC12990ll A01;

    public GE8(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        this.A00 = fragmentActivity;
        this.A01 = abstractC12990ll;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AbstractC31177DnL.A0m();
        AbstractC31173DnH.A0u();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "megaphone");
        A0b.putString("edit_profile_entry", "megaphone");
        AbstractC60672pq abstractC60672pq = new AbstractC60672pq();
        abstractC60672pq.setArguments(A0b);
        AbstractC31177DnL.A16(abstractC60672pq, this.A00, this.A01);
    }
}
