package X;

import com.instagram.common.session.UserSession;
import com.instagram.settings2.extension.customstorage.manuallyapprovetags.ManuallyApproveTagsCustomStorageHandler;
import com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler;

/* renamed from: X.1oZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37361oZ {
    public static C37361oZ A00;

    public final InterfaceC58071Pow A00(UserSession userSession, Integer num) {
        InterfaceC58071Pow saveStoryToGalleryCustomStorageHandler;
        C14360o3.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                saveStoryToGalleryCustomStorageHandler = new ManuallyApproveTagsCustomStorageHandler(userSession);
            } else {
                throw new IllegalStateException(AnonymousClass001.A0R("No custom storage handler of type long found for ID ", XjY.A00(num)));
            }
        } else {
            saveStoryToGalleryCustomStorageHandler = new SaveStoryToGalleryCustomStorageHandler(userSession);
        }
        return saveStoryToGalleryCustomStorageHandler;
    }

    public final void A01(Integer num) {
        C14360o3.A0B(num, 1);
        throw new IllegalStateException(AnonymousClass001.A0R("No custom storage handler of type long found for ID ", XjY.A00(num)));
    }
}
