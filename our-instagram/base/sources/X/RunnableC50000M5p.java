package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.M5p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50000M5p implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C22P A01;
    public final /* synthetic */ KBV A02;

    public RunnableC50000M5p(View view, C22P c22p, KBV kbv) {
        this.A02 = kbv;
        this.A00 = view;
        this.A01 = c22p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KBV kbv = this.A02;
        InterfaceC09390do interfaceC09390do = kbv.A07;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity = kbv.requireActivity();
        C2EC c2ec = kbv.A03;
        if (c2ec == null) {
            C14360o3.A0F("thread");
            throw C00O.createAndThrow();
        }
        DirectCameraViewModel A02 = LKW.A02(requireActivity, A0r, c2ec, c2ec.C7I());
        RectF A0X = AbstractC166987dD.A0X();
        int[] iArr = new int[2];
        this.A00.getLocationOnScreen(iArr);
        A0X.set(iArr[0], iArr[1], r1 + r11.getWidth(), iArr[1] + r11.getHeight());
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("DirectReplyCameraFragments.ARG_REPLY_VIEW_MODEL", A02);
        C22P c22p = this.A01;
        C14360o3.A0B(c22p, 0);
        AbstractC189688an.A00(c22p);
        A0b.putSerializable("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", c22p);
        A0b.putBoolean("DirectVisualReplyFragment.REPLY_CAM_ARG_SKIP_ENTRY_ANIMATION", true);
        A0b.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS", A0X);
        A0b.putBoolean("DirectVisualTimelineEnabled.REPLY_CAM_ARG_IS_VISUAL_TIMELINE_ENABLED", true);
        C9K5 c9k5 = new C9K5();
        AbstractC03240Dh.A00(A0b, AbstractC166987dD.A0o(interfaceC09390do));
        c9k5.setArguments(A0b);
        C14240no A0F = AbstractC43593JPy.A0F(kbv);
        A0F.A0C(c9k5, kbv.A05, R.id.child_camera_fragment_holder);
        A0F.A00();
    }
}
