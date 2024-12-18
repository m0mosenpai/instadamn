package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.model.reels.Reel;

/* renamed from: X.6bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142126bV implements InterfaceC62702t9 {
    @Override // X.InterfaceC62702t9
    public final String BKe(C59062n7 c59062n7) {
        String id;
        C14360o3.A0B(c59062n7, 0);
        Reel reel = ((C41551w4) c59062n7.A03).A0H;
        IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
        if (intentAwareAdsInfo == null || (id = intentAwareAdsInfo.A06) == null) {
            id = reel.getId();
            C14360o3.A07(id);
        }
        return AnonymousClass001.A0R("intentAwareAdStories_", id);
    }
}
