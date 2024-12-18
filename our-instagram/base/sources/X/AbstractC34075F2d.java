package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.F2d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34075F2d {
    public static final Bundle A00(ImageUrl imageUrl, InterfaceC83733oI interfaceC83733oI, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC2054897w.A02(A0b, interfaceC83733oI, "DirectThreadInviteLinkSettingsFragment.THREAD_ID");
        A0b.putString("DirectThreadInviteLinkSettingsFragment.THREAD_V2_ID", str);
        A0b.putString("DirectThreadInviteLinkSettingsFragment.THREAD_TITLE", str2);
        A0b.putParcelable("DirectThreadInviteLinkSettingsFragment.IMAGE_URL", imageUrl);
        A0b.putInt("DirectThreadInviteLinkSettingsFragment.MEMBER_COUNT", i);
        A0b.putBoolean("DirectThreadInviteLinkSettingsFragment.IS_ADMIN", z);
        A0b.putBoolean("DirectThreadInviteLinkSettingsFragment.IS_MODERATOR", z2);
        A0b.putBoolean("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_LINK_MODE", z3);
        A0b.putBoolean("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_ADMIN_APPROVAL_MODE", z4);
        A0b.putString("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_LINK", str3);
        A0b.putString(AbstractC43591JPw.A00(253), str4);
        A0b.putBoolean("DirectThreadInviteLinkSettingsFragment.IS_SUBSCRIBER_ONLY", z5);
        A0b.putBoolean(AbstractC43591JPw.A00(607), z6);
        A0b.putInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_AUDIENCE_TYPE", i2);
        A0b.putInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE", i3);
        A0b.putString("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_USERTYPE", str5);
        return A0b;
    }
}
