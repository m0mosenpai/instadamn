package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.LFk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47936LFk {
    public final L5I A00;

    public final void A01() {
        L5I l5i = this.A00;
        Activity activity = l5i.A00;
        if (activity != null) {
            boolean equals = l5i.A06.equals(EnumC40111tc.A0a);
            BackgroundGradientColors A00 = AbstractC22750A1u.A00(l5i.A03, AbstractC166987dD.A11(l5i.A08), equals);
            AbstractC70197WGf.A06(activity, new G0F(this, 3), C50472Tr.A02(activity, false), 0.2f, A00.A01, A00.A00, false);
        }
    }

    public C47936LFk(L5I l5i) {
        this.A00 = l5i;
    }

    public static final void A00(C47936LFk c47936LFk) {
        boolean equals;
        Bundle A0b = AbstractC166987dD.A0b();
        L5I l5i = c47936LFk.A00;
        A0b.putSerializable("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_ENTRY_POINT", l5i.A02);
        A0b.putString("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_MESSAGE_ID", l5i.A09);
        A0b.putString("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_SENDER_ID", l5i.A0B);
        A0b.putString("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_MEDIA_FILE_PATH", l5i.A08);
        A0b.putInt("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_MEDIA_FILE_TYPE", l5i.A06.A00);
        String str = l5i.A07;
        if (str == null) {
            str = l5i.A08;
        }
        A0b.putString("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_PRESET_MEDIUM_FILE_PATH", str);
        if (l5i.A07 != null) {
            equals = false;
        } else {
            equals = l5i.A06.equals(EnumC40111tc.A0a);
        }
        A0b.putBoolean("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_PRESET_MEDIUM_IS_VIDEO", equals);
        C47777L8c c47777L8c = l5i.A04;
        if (c47777L8c != null) {
            c47777L8c.A00();
        }
        C6XJ A02 = C6XJ.A02(l5i.A00, A0b, l5i.A03, TransparentModalActivity.class, AbstractC111324zv.A00(5165));
        A02.A0E(l5i.A05);
        A02.A0C(l5i.A00);
    }
}
