package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7Bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC159137Bz implements InterfaceC159097Bv {
    public final String commandString;
    public final C7FY commandType;
    public final String description;
    public final int iconDrawableRes;
    public final C7C2 inputChecker;
    public final C7FZ loggingId;
    public final String title;
    public final String trigger;
    public final UserSession userSession;

    public AbstractC159137Bz(Context context, UserSession userSession, C7FY c7fy, String str, C7FZ c7fz, Integer num, int i, C7C2 c7c2, Integer num2) {
        String str2;
        String string;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c7fy, 3);
        C14360o3.A0B(str, 4);
        C14360o3.A0B(c7fz, 5);
        C14360o3.A0B(c7c2, 8);
        this.userSession = userSession;
        this.commandType = c7fy;
        this.trigger = str;
        this.loggingId = c7fz;
        this.iconDrawableRes = i;
        this.inputChecker = c7c2;
        this.title = (num2 == null || (string = context.getString(num2.intValue())) == null) ? AnonymousClass001.A0D(str, c7fy.A00) : string;
        if (num != null) {
            str2 = context.getString(num.intValue());
        } else {
            str2 = null;
        }
        this.description = str2;
        this.commandString = AnonymousClass001.A0D(str, c7fy.A00);
    }

    public abstract AbstractC160207Gg createCommandData();

    @Override // X.InterfaceC159097Bv
    public ArrayList filter(String str) {
        C14360o3.A0B(str, 0);
        if (this.inputChecker.CWe(this.userSession, this, str)) {
            return AbstractC16960so.A1M(createCommandData());
        }
        return null;
    }

    public final String getCommandString() {
        return this.commandString;
    }

    public final C7FY getCommandType() {
        return this.commandType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getIconDrawableRes() {
        return this.iconDrawableRes;
    }

    public final C7C2 getInputChecker() {
        return this.inputChecker;
    }

    public final C7FZ getLoggingId() {
        return this.loggingId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public final UserSession getUserSession() {
        return this.userSession;
    }
}
