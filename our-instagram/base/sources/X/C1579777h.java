package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.77h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1579777h implements InterfaceC162527Pp {

    @Deprecated
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC162527Pp
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1576676a AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a, boolean z) {
        String A0j;
        InterfaceC09390do interfaceC09390do = this.A00;
        C83403nh c83403nh = c160787Im.A0e;
        C7QY A01 = new C1582378i().A01(context, userSession, C7QK.A02(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, null, null, interfaceC09390do, false), anonymousClass988, c160787Im);
        if (!C7Q1.A00(userSession, z)) {
            A0j = c83403nh.A0i();
        } else {
            A0j = c83403nh.A0j();
        }
        return new C1576676a(C7QZ.A05(context, userSession, anonymousClass988, c160787Im, c7im, c18a, false), A01, A0j);
    }

    public C1579777h(InterfaceC09390do interfaceC09390do) {
        this.A00 = interfaceC09390do;
    }
}
