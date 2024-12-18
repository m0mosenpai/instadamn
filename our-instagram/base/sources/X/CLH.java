package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public abstract class CLH {
    public static final Bundle A00(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("header_title", str);
        A0b.putString("header_profile_user_name", str2);
        A0b.putBoolean("header_profile_is_verified", z);
        A0b.putString("header_description", str3);
        A0b.putString("image_url", str4);
        A0b.putParcelable("profile_picture_url", imageUrl);
        A0b.putString("profile_id", str5);
        A0b.putString("source_media_id", str6);
        A0b.putString("source_media_surface", str7);
        A0b.putBoolean(MSV.A00(196), z2);
        A0b.putString(AbstractC43591JPw.A00(894), str8);
        return A0b;
    }
}
