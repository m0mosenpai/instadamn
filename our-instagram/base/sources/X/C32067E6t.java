package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.E6t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32067E6t extends C0T6 {
    public String A03 = null;
    public String A02 = null;
    public Long A00 = null;
    public String A01 = null;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public String A04 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32067E6t) {
                C32067E6t c32067E6t = (C32067E6t) obj;
                if (!C14360o3.A0K(this.A03, c32067E6t.A03) || !C14360o3.A0K(this.A02, c32067E6t.A02) || !C14360o3.A0K(this.A00, c32067E6t.A00) || !C14360o3.A0K(this.A01, c32067E6t.A01) || this.A05 != c32067E6t.A05 || this.A06 != c32067E6t.A06 || this.A07 != c32067E6t.A07 || !C14360o3.A0K(this.A04, c32067E6t.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(Bundle bundle, C32067E6t c32067E6t, String str, String str2) {
        bundle.putString("surface", "daily_prompt");
        bundle.putString("collection_id", c32067E6t.A03);
        bundle.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        bundle.putString("message_id", c32067E6t.A02);
        DirectThreadKey directThreadKey = new DirectThreadKey(str, null);
        directThreadKey.A01 = str2;
        AbstractC43826JZo.A01(bundle, directThreadKey, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
    }

    public final boolean A01() {
        Long l = this.A00;
        if (l != null && l.longValue() * 1000 > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, ((((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31))) + AbstractC25227BEk.A07(this.A04);
    }
}
