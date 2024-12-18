package X;

import android.os.Bundle;
import com.instagram.music.common.model.AudioOverlayTrack;

/* loaded from: classes7.dex */
public abstract class IB5 {
    public static final HDH A00(AudioOverlayTrack audioOverlayTrack, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 0);
        HDH hdh = new HDH();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(MSV.A00(87), str);
        A0b.putString("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_CTA_TEXT", str2);
        A0b.putBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_SPONSORED_LABEL", true);
        A0b.putBoolean("com.instgram.android.fragment.ARGUMENTS_KEY_EXTRA_REMOVE_LOCATION", true);
        A0b.putBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_RESET_FEEDBACK", true);
        A0b.putBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_DISPLAY_PROFILE_FEED_TEXT", false);
        A0b.putString("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_POLITICAL_CONTEXT", str3);
        A0b.putString(AbstractC111324zv.A00(368), str4);
        A0b.putParcelable(AbstractC111324zv.A00(3059), audioOverlayTrack);
        hdh.setArguments(A0b);
        return hdh;
    }
}
