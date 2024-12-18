package X;

import com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata;
import com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.TvY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65871TvY {
    public final InterfaceC71975XDi A00;
    public final C65870TvX A01;
    public final Map A02;
    public final Map A03;
    public final C13920nI A04;

    public C65871TvY(InterfaceC71975XDi interfaceC71975XDi, C65870TvX c65870TvX, C13920nI c13920nI) {
        C14360o3.A0B(c13920nI, 2);
        this.A00 = interfaceC71975XDi;
        this.A04 = c13920nI;
        this.A01 = c65870TvX;
        this.A02 = new LinkedHashMap();
        this.A03 = new LinkedHashMap();
    }

    public final AutoplayScreenItemWithoutMetadata A00(C38321qM c38321qM) {
        AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata;
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A02;
        boolean containsKey = map.containsKey(c38321qM.getId());
        Object obj = map.get(c38321qM.getId());
        if (containsKey) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata");
            AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata2 = (AutoplayScreenItemWithoutMetadata) obj;
            AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata = (AutoplayOnScreenItemWithMetadata) this.A03.get(c38321qM.getId());
            AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata2 = autoplayOnScreenItemWithMetadata;
            if (autoplayOnScreenItemWithMetadata == null) {
                autoplayOnScreenItemWithMetadata2 = new AutoplayOnScreenItemWithMetadata(autoplayScreenItemWithoutMetadata2.media, autoplayScreenItemWithoutMetadata2.timeAddedToScreen, 0, 0, 0, 0, 0.0f);
            }
            this.A00.FBY(autoplayOnScreenItemWithMetadata2);
            autoplayOnScreenItemWithMetadata2.timeSinceAddedToScreen = System.currentTimeMillis() - autoplayOnScreenItemWithMetadata2.timeAddedToScreen;
            autoplayScreenItemWithoutMetadata = autoplayOnScreenItemWithMetadata2;
        } else {
            AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata3 = (AutoplayScreenItemWithoutMetadata) obj;
            autoplayScreenItemWithoutMetadata = autoplayScreenItemWithoutMetadata3;
            if (autoplayScreenItemWithoutMetadata3 == null) {
                return new AutoplayScreenItemWithoutMetadata(c38321qM, 0L);
            }
        }
        return autoplayScreenItemWithoutMetadata;
    }

    public final ArrayList A01() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A02.entrySet()) {
            entry.getKey();
            AutoplayScreenItemWithoutMetadata A00 = A00(((AutoplayScreenItemWithoutMetadata) entry.getValue()).media);
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata");
            arrayList.add(A00);
        }
        return arrayList;
    }
}
