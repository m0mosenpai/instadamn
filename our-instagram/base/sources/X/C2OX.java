package X;

import android.database.CursorWindow;
import com.instagram.common.session.UserSession;
import java.lang.reflect.Field;

/* renamed from: X.2OX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2OX implements InterfaceC13000lm {
    public Integer A00;
    public final UserSession A01;
    public final C49642Px A02;
    public final C49222Od A03;
    public final C19L A04;

    public C2OX(UserSession userSession, C49642Px c49642Px, C49222Od c49222Od, C19L c19l) {
        C14360o3.A0B(c49222Od, 3);
        C14360o3.A0B(c49642Px, 4);
        this.A01 = userSession;
        this.A04 = c19l;
        this.A03 = c49222Od;
        this.A02 = c49642Px;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            try {
                Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
                declaredField.setAccessible(true);
                declaredField.setInt(null, intValue);
                this.A00 = null;
            } catch (Exception unused) {
            }
        }
    }
}
