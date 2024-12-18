package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Llb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48987Llb implements InterfaceC162527Pp {
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = A0Y.A0e;
        String A0v = AbstractC43594JPz.A0v(c83403nh, A00 ? 1 : 0);
        C14360o3.A0A(A0v);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        InterfaceC09390do interfaceC09390do = this.A00;
        C14360o3.A0B(interfaceC09390do, 3);
        Object obj = c83403nh.A1T;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.User");
        User user = (User) obj;
        String fullName = user.getFullName();
        ImageUrl Bhu = user.Bhu();
        MessagingUser A002 = MessagingUser.A00(user);
        List A0t = c83403nh.A0t();
        String str = (String) AbstractC43691JUa.A00(user.getUsername(), "", "User#getUsername");
        return new K0M(C7QZ.A03(context, userSession, anonymousClass988, A0Y, c7im, c18a), new KTF(Bhu, AbstractC43592JPx.A0d(context, userSession, anonymousClass988, A0Y, c83403nh), C7QK.A04(userSession, anonymousClass988, A0Y, c7im, c83403nh.A10, interfaceC09390do), A002, fullName, str, A0t), A0v);
    }

    public C48987Llb(InterfaceC09390do interfaceC09390do) {
        this.A00 = interfaceC09390do;
    }
}
