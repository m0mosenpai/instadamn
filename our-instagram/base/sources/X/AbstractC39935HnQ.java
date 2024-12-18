package X;

import com.instagram.api.schemas.GenAIMessagingData;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HnQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39935HnQ {
    public static Map A00(GenAIMessagingData genAIMessagingData) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (genAIMessagingData.AhP() != null) {
            A1I.put("bot_id", genAIMessagingData.AhP());
        }
        if (genAIMessagingData.C7I() != null) {
            A1I.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, genAIMessagingData.C7I());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
