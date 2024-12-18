package X;

import com.facebook.odin.model.FeatureData;
import com.instagram.igsignals.signals.odin.IgSignalsOdinServerFeaturesProvider$ServerFeaturesData$Companion;
import java.util.HashMap;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class W8w {
    public final long A00;
    public final HashMap A01;
    public static final IgSignalsOdinServerFeaturesProvider$ServerFeaturesData$Companion Companion = new Object();
    public static final C3R9[] A02 = {new C73863Sv(C3RD.A01, new ContextualSerializer(new C0YZ(FeatureData.class), new C3R9[0])), null};

    public /* synthetic */ W8w(HashMap hashMap, int i, long j) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C71743X0i.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A01 = hashMap;
        this.A00 = j;
    }

    public W8w(long j, HashMap hashMap) {
        C14360o3.A0B(hashMap, 1);
        this.A01 = hashMap;
        this.A00 = j;
    }
}
