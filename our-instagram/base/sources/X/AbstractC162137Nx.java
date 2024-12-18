package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Nx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162137Nx extends AbstractC159137Bz {
    public final AbstractC159137Bz firstCommand;
    public final boolean preventDuplicates;
    public final boolean removePrefix;
    public final AbstractC159137Bz secondCommand;
    public final Integer textRangeId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC162137Nx(Context context, UserSession userSession, C7FY c7fy, String str, C7FZ c7fz, Integer num, int i, C7C2 c7c2, Integer num2, AbstractC159137Bz abstractC159137Bz, AbstractC159137Bz abstractC159137Bz2, boolean z, boolean z2, Integer num3) {
        super(context, userSession, c7fy, str, c7fz, num, i, c7c2, num3);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c7fy, 3);
        C14360o3.A0B(str, 4);
        C14360o3.A0B(c7fz, 5);
        C14360o3.A0B(c7c2, 8);
        C14360o3.A0B(abstractC159137Bz, 10);
        C14360o3.A0B(abstractC159137Bz2, 11);
        this.textRangeId = num2;
        this.firstCommand = abstractC159137Bz;
        this.secondCommand = abstractC159137Bz2;
        this.preventDuplicates = z;
        this.removePrefix = z2;
    }

    @Override // X.AbstractC159137Bz
    public AbstractC160207Gg createCommandData() {
        C7FY c7fy = this.commandType;
        String str = this.title;
        String str2 = this.description;
        int i = this.iconDrawableRes;
        return new C162157Nz(this.firstCommand.createCommandData(), this.secondCommand.createCommandData(), this.loggingId, c7fy, this.textRangeId, str, str2, i, this.preventDuplicates, this.removePrefix);
    }

    public final AbstractC159137Bz getFirstCommand() {
        return this.firstCommand;
    }

    public final boolean getPreventDuplicates() {
        return this.preventDuplicates;
    }

    public final boolean getRemovePrefix() {
        return this.removePrefix;
    }

    public final AbstractC159137Bz getSecondCommand() {
        return this.secondCommand;
    }

    public final Integer getTextRangeId() {
        return this.textRangeId;
    }
}
