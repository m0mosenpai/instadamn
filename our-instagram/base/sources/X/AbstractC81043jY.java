package X;

import com.instagram.api.schemas.BizUserInboxState;

/* renamed from: X.3jY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81043jY {
    public static final BizUserInboxState A00(String str) {
        BizUserInboxState bizUserInboxState = (BizUserInboxState) BizUserInboxState.A01.get(str);
        if (bizUserInboxState == null) {
            return BizUserInboxState.A07;
        }
        return bizUserInboxState;
    }
}
