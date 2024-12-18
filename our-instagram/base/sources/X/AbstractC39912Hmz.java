package X;

import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hmz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39912Hmz {
    public static Map A00(EventPageNavigationMetadata eventPageNavigationMetadata) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (eventPageNavigationMetadata.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, eventPageNavigationMetadata.getDescription());
        }
        if (eventPageNavigationMetadata.BmM() != null) {
            A1I.put("reminder_count", eventPageNavigationMetadata.BmM());
        }
        if (eventPageNavigationMetadata.getSubtitle() != null) {
            A1I.put("subtitle", eventPageNavigationMetadata.getSubtitle());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
