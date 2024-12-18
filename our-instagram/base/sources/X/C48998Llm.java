package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Llm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48998Llm implements InterfaceC162527Pp {
    public static final C48998Llm A00 = new Object();

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        String A0j = JQ0.A0j(userSession, A0Y, z);
        C14360o3.A0A(A0j);
        return new K0I(C7QZ.A03(context, userSession, anonymousClass988, A0Y, c7im, c18a), AbstractC47854LBx.A01(context, userSession, anonymousClass988, A0Y, c7im), A0j);
    }
}
