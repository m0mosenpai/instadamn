package X;

import android.content.Context;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.LpF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49198LpF implements InterfaceC50438MOs {
    public final AnonymousClass988 A00;
    public final C7IM A01;

    @Override // X.InterfaceC50438MOs
    public final ArrayList AWt(Context context, C51760Mtj c51760Mtj, C99E c99e, MessagingUser messagingUser, L8R l8r, InterfaceC50520MRx interfaceC50520MRx, InterfaceC50520MRx interfaceC50520MRx2, Map map, java.util.Set set, java.util.Set set2) {
        C45273K2b A00;
        String str;
        IGAIAgentType iGAIAgentType;
        ArrayList A1E = AbstractC166987dD.A1E();
        C14360o3.A0B(l8r, 0);
        if (l8r.A00.mResultSet.getInteger(0, 17) != 15) {
            int count = interfaceC50520MRx.getCount();
            for (int i = 0; i < count; i++) {
                if (interfaceC50520MRx.BTA(i) == 0) {
                    boolean A1O = AbstractC167007dF.A1O(interfaceC50520MRx.B0J(i));
                    C45273K2b A002 = Ko7.A00(c99e, interfaceC50520MRx, i);
                    if (i == 0) {
                        A00 = null;
                    } else {
                        A00 = Ko7.A00(c99e, interfaceC50520MRx, i - 1);
                    }
                    if (AbstractC162577Pu.A00(messagingUser, A002, A00, C7P5.A00().A01(LIQ.A00(c99e, interfaceC50520MRx, i)), true, AbstractC167007dF.A1W(interfaceC50520MRx.BnJ(i)), interfaceC50520MRx.CV7(i), false, false, A1O, false, false)) {
                        long A003 = InterfaceC50520MRx.A00(interfaceC50520MRx, i);
                        User user = (User) map.get(interfaceC50520MRx.BtG(i));
                        if (user != null) {
                            str = AbstractC101904i3.A08(user);
                        } else {
                            str = "";
                        }
                        C14360o3.A0A(str);
                        C7IM c7im = this.A01;
                        int i2 = c7im.A00;
                        C162297Or c162297Or = new C162297Or(A003, 0L);
                        if (user != null) {
                            iGAIAgentType = user.A03.Aah();
                        } else {
                            iGAIAgentType = null;
                        }
                        C161807Mp c161807Mp = new C161807Mp(null, c162297Or, null, str, null, null, i2, i2, 8388611, A003, A1O, false, AbstractC167007dF.A1X(iGAIAgentType, IGAIAgentType.A04), c7im.A00(), false);
                        String BSx = interfaceC50520MRx.BSx(i);
                        C47908LEc.A00(C05F.A0C, MessageFormat.format("username_{0}", BSx), c161807Mp, BSx, A1E);
                    }
                }
            }
        }
        return A1E;
    }

    public C49198LpF(AnonymousClass988 anonymousClass988, C7IM c7im) {
        this.A00 = anonymousClass988;
        this.A01 = c7im;
    }
}
