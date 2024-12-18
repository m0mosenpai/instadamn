package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KWs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45980KWs extends AbstractC159137Bz {
    public final Integer textRangeId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC45980KWs(Context context, UserSession userSession, C7FY c7fy, String str, C7FZ c7fz, Integer num, int i, C7C2 c7c2, Integer num2, Integer num3) {
        super(context, userSession, c7fy, str, c7fz, num, i, c7c2, num3);
        JQ0.A1O(context, userSession, c7fy, str, c7fz);
        C14360o3.A0B(c7c2, 8);
        this.textRangeId = num2;
    }

    @Override // X.AbstractC159137Bz
    public AbstractC160207Gg createCommandData() {
        return new C45978KWo(this.loggingId, this.commandType, this.textRangeId, this.title, this.description, this.iconDrawableRes);
    }

    public final Integer getTextRangeId() {
        return this.textRangeId;
    }
}
