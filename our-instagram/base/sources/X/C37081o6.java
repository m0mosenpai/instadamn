package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.1o6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37081o6 {
    public final N7K A00(EnumC53178Nfa enumC53178Nfa, ImageUrl imageUrl, String str, String str2, String str3, int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("key_target_user_id", str);
        bundle.putString("key_target_user_name", str2);
        bundle.putParcelable("key_target_user_profile_pic_url", imageUrl);
        bundle.putSerializable("key_upsell_type", enumC53178Nfa);
        bundle.putString("key_upsell_variant", str3);
        bundle.putInt("key_offset_from_bottom", i);
        bundle.putBoolean("key_is_launched_from_bottom_sheet", z);
        N7K n7k = new N7K();
        n7k.setArguments(bundle);
        return n7k;
    }
}
