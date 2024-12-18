package X;

import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager;

/* renamed from: X.9NT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9NT extends AbstractC224309vG {
    public static final C9NT A01 = new Object();
    public static final WearablesAppAttributionType A00 = WearablesAppAttributionType.A0A;

    public static final boolean A00(String str) {
        if (str != null) {
            return AbstractC001900j.A0a(str, "Facebook View", false) || AbstractC001900j.A0a(str, "com.facebook.stella", false) || AbstractC001900j.A0a(str, WearableMediaDownloadManager.MODEL_FIELD_STELLA_PHOTO, false) || AbstractC001900j.A0a(str, "Stella", false) || AbstractC001900j.A0a(str, "Starfish", true);
        }
        return false;
    }
}
