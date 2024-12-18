package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.ContentNotesRepository$deleteNote$1;

/* renamed from: X.CGb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27605CGb {
    public static final void A00(UserSession userSession, InterfaceC904941j interfaceC904941j, String str, String str2, String str3, String str4, String str5, long j) {
        AbstractC167017dG.A1R(str, str2);
        C4F0 A00 = C4Ez.A00(userSession);
        String valueOf = String.valueOf(j);
        String Am2 = interfaceC904941j.Am2();
        Integer Am9 = interfaceC904941j.Am9();
        C14360o3.A0B(valueOf, 1);
        AbstractC166987dD.A1Z(new ContentNotesRepository$deleteNote$1(A00, Am9, str, valueOf, str2, str3, str4, Am2, str5, null), ((C4A7) A00).A01);
    }
}
