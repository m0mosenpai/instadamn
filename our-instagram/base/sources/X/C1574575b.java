package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.75b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1574575b implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c18a, 2);
        C14360o3.A0B(c7im, 3);
        C14360o3.A0B(c160787Im, 4);
        C14360o3.A0B(anonymousClass988, 5);
        C83403nh c83403nh = c160787Im.A0e;
        C83553nw c83553nw = c83403nh.A0N;
        if (c83553nw != null) {
            return LBz.A01(context, userSession, c160787Im, c7im, c83553nw, c83403nh.A2P, c160787Im.A0G.A0x, C14360o3.A0K(userSession.userId, c83403nh.BtE()), z);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
