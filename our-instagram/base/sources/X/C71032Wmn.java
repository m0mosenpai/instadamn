package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Wmn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71032Wmn implements GYK {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1oF] */
    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        int A06 = AbstractC167007dF.A06(1, userSession, fragmentActivity);
        if (C37171oF.A00 == null) {
            C37171oF.A00 = new Object();
        }
        C37171oF A00 = VXN.A00();
        C19270xB c19270xB = new C19270xB(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
        EnumC72410Xcy enumC72410Xcy = EnumC72410Xcy.A0y;
        AbstractC167007dF.A1E(c19270xB, A06, enumC72410Xcy);
        C37171oF.A00(fragmentActivity, c19270xB, userSession, enumC72410Xcy, A00, null, null).A05();
    }
}
