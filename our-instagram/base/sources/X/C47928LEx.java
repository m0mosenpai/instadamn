package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState;

/* renamed from: X.LEx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47928LEx {
    public boolean A00;
    public final Activity A01;
    public final C00M A02;
    public final UserSession A03;
    public final C3I9 A04;
    public final ContentNotesImmersiveCreationUiState A05;
    public final C47527Kyu A06;
    public final C19L A07;

    public C47928LEx(Activity activity, C00M c00m, UserSession userSession, C3I9 c3i9, ContentNotesImmersiveCreationUiState contentNotesImmersiveCreationUiState, C47527Kyu c47527Kyu, C19L c19l) {
        AbstractC25233BEq.A0w(2, c47527Kyu, c00m, c3i9);
        C14360o3.A0B(userSession, 6);
        this.A01 = activity;
        this.A06 = c47527Kyu;
        this.A02 = c00m;
        this.A04 = c3i9;
        this.A05 = contentNotesImmersiveCreationUiState;
        this.A03 = userSession;
        this.A07 = c19l;
    }

    public static final boolean A00(C47928LEx c47928LEx, L5D l5d) {
        if (!C28425CgX.A00.A03(c47928LEx.A03)) {
            c47928LEx.A02.A04();
            return false;
        }
        AbstractC166987dD.A1Z(new MCK(l5d, c47928LEx, (InterfaceC23621Ds) null, 38), c47928LEx.A07);
        return true;
    }
}
