package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.M6x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50034M6x implements Runnable {
    public final /* synthetic */ C49083Ln9 A00;
    public final /* synthetic */ DirectThreadKey A01;
    public final /* synthetic */ MessageIdentifier A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    public RunnableC50034M6x(C49083Ln9 c49083Ln9, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, String str, List list, boolean z) {
        this.A00 = c49083Ln9;
        this.A03 = str;
        this.A01 = directThreadKey;
        this.A04 = list;
        this.A02 = messageIdentifier;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC65855TvH enumC65855TvH;
        C49083Ln9 c49083Ln9 = this.A00;
        UserSession userSession = c49083Ln9.A02;
        Activity activity = c49083Ln9.A00;
        InterfaceC11380iw interfaceC11380iw = c49083Ln9.A01;
        String str = this.A03;
        if (str != null) {
            String str2 = this.A01.A00;
            if (str2 != null) {
                List list = this.A04;
                String str3 = this.A02.A01;
                boolean z = this.A05;
                C47373KwO c47373KwO = (C47373KwO) c49083Ln9.A06.getValue();
                if (LL1.A05(userSession, str2)) {
                    enumC65855TvH = EnumC65855TvH.A0f;
                } else {
                    enumC65855TvH = EnumC65855TvH.A0g;
                }
                LL1.A01(activity, interfaceC11380iw, userSession, c47373KwO, enumC65855TvH, VG2.A0J, new C46100Kb0(2, activity, c47373KwO), str, str3, "DUMMY", str2, null, list, false, true, z);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
