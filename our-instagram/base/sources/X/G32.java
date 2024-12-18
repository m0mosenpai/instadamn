package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class G32 implements InterfaceC37156GYt {
    public final C35010Fbh A00;
    public final Context A01;
    public final UserSession A02;
    public final E70 A03;
    public final boolean A04;

    public G32(Context context, UserSession userSession, C35010Fbh c35010Fbh, E70 e70, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = e70;
        this.A00 = c35010Fbh;
        this.A04 = z;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        C35003Fba c35003Fba = this.A00.A01;
        E70 e70 = this.A03;
        if (e70.A0v) {
            String str = this.A02.userId;
            C14360o3.A0B(str, 1);
            if (e70.A0S.contains(str) && c35003Fba != null && AbstractC166987dD.A1b(AbstractC31172DnG.A19(c35003Fba.A04)) && !this.A04) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        int min;
        String str;
        String fullName;
        ArrayList A1E = AbstractC166987dD.A1E();
        C35010Fbh c35010Fbh = this.A00;
        C35003Fba c35003Fba = c35010Fbh.A01;
        E70 e70 = this.A03;
        UserSession userSession = this.A02;
        String str2 = userSession.userId;
        C14360o3.A0B(str2, 1);
        if (e70.A0S.contains(str2) && c35003Fba != null && AbstractC166987dD.A1b(AbstractC31172DnG.A19(c35003Fba.A04)) && !this.A04) {
            C31335Dq0 A00 = C31335Dq0.A00(2131960359);
            Context context = this.A01;
            A00.A0G = context.getString(2131960360);
            Drawable drawable = context.getDrawable(R.drawable.instagram_lock_icon_16);
            if (drawable != null) {
                A00.A08 = drawable;
                A00.A00 = AbstractC31174DnI.A03(context);
                A1E.add(A00);
                C35003Fba c35003Fba2 = c35010Fbh.A01;
                if (c35003Fba2 == null) {
                    min = 0;
                } else {
                    min = Math.min(AbstractC31172DnG.A19(c35003Fba2.A04).size(), 5);
                }
                C57582kX A002 = C57582kX.A00(userSession);
                for (int i = 0; i < min; i++) {
                    User user = (User) Collections.unmodifiableList(c35003Fba.A04).get(i);
                    Object A0r = AbstractC31174DnI.A0r(user, c35003Fba.A03);
                    if (A002.A0N(user) == FollowStatus.A05) {
                        str = context.getString(2131962780);
                    } else {
                        str = null;
                    }
                    C14360o3.A0A(user);
                    String username = user.getUsername();
                    if (A0r != null) {
                        fullName = AbstractC167007dF.A0f(context, A0r, 2131972446);
                    } else {
                        fullName = user.getFullName();
                    }
                    A1E.add(new FNI(user, username, fullName, str, c35010Fbh.A07.contains(user)));
                }
                int i2 = c35003Fba.A00;
                if (i2 > min) {
                    C34969Fat c34969Fat = new C34969Fat(AbstractC31177DnL.A0a(context, i2, 2131972447), new ViewOnClickListenerC35680FpF(this, 29));
                    int A01 = AbstractC31173DnH.A01(context);
                    boolean A02 = AbstractC13620mo.A02(context);
                    int i3 = R.drawable.chevron_right;
                    if (A02) {
                        i3 = R.drawable.chevron_left;
                    }
                    Drawable drawable2 = context.getDrawable(i3);
                    if (drawable2 != null) {
                        c34969Fat.A04 = drawable2;
                        c34969Fat.A03 = A01;
                        c34969Fat.A01 = A01;
                        A1E.add(c34969Fat);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                int i4 = 2131972444;
                if (e70.A0D()) {
                    i4 = 2131972442;
                }
                String A0p = AbstractC166997dE.A0p(context, i4);
                int i5 = 2131972445;
                if (e70.A0D()) {
                    i5 = 2131972443;
                }
                C35018Fbr c35018Fbr = (C35018Fbr) C31651DvH.A00(userSession, C35018Fbr.class, 7);
                InterfaceC83733oI interfaceC83733oI = e70.A0L;
                C14360o3.A0B(interfaceC83733oI, 0);
                A1E.add(new FMT(new ViewOnClickListenerC35680FpF(this, 28), A0p, AbstractC31177DnL.A0a(context, c35018Fbr.A01(EnumC31337Dq2.A05, 0, interfaceC83733oI instanceof MsysThreadId), i5), context.getColor(AbstractC53242c7.A03(context))));
                c35010Fbh.A01();
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        return A1E;
    }
}
