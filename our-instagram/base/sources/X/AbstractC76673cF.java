package X;

import com.instagram.api.schemas.OnFeedMessagesIntf;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3cF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76673cF {
    public static final int A00(OnFeedMessagesIntf onFeedMessagesIntf) {
        Integer Ax8;
        if (onFeedMessagesIntf != null && (Ax8 = onFeedMessagesIntf.Ax8()) != null) {
            return Ax8.intValue();
        }
        return -1;
    }

    public static final List A01(OnFeedMessagesIntf onFeedMessagesIntf) {
        List emptyList;
        if (onFeedMessagesIntf != null && onFeedMessagesIntf.BEf() != null) {
            emptyList = Collections.unmodifiableList(onFeedMessagesIntf.BEf());
        } else {
            emptyList = Collections.emptyList();
        }
        C14360o3.A0A(emptyList);
        return emptyList;
    }
}
