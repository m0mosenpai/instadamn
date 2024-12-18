package X;

import android.content.res.Resources;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;

/* renamed from: X.KmX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46776KmX {
    public static final String A00(Resources resources, NoteAudienceItem noteAudienceItem) {
        int i;
        int ordinal = noteAudienceItem.A00.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    i = 2131954081;
                    if (ordinal != 4) {
                        i = 2131954085;
                    }
                } else {
                    i = 2131954084;
                }
            } else {
                i = 2131954080;
            }
        } else {
            i = 2131954082;
        }
        return AbstractC166997dE.A0q(resources, i);
    }
}
