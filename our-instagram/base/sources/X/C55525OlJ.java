package X;

import android.widget.RadioGroup;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.user.model.User;

/* renamed from: X.OlJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55525OlJ implements RadioGroup.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C55525OlJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        Integer num;
        Integer num2;
        switch (this.A00) {
            case 0:
                C52173N7d c52173N7d = (C52173N7d) this.A01;
                Integer[] A00 = C05F.A00(4);
                int length = A00.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        num = A00[i2];
                        if (AbstractC54886OPh.A01(num) != i) {
                            i2++;
                        }
                    } else {
                        num = C05F.A0N;
                    }
                }
                c52173N7d.A03 = num;
                IgFormField igFormField = c52173N7d.A01;
                if (igFormField != null) {
                    if (num == C05F.A0C) {
                        igFormField.setVisibility(0);
                        igFormField.getMEditText().requestFocus();
                        AbstractC13880nE.A0S(igFormField.getMEditText());
                    } else {
                        igFormField.setVisibility(8);
                        AbstractC13880nE.A0O(igFormField);
                    }
                }
                c52173N7d.A05 = true;
                C52173N7d.A00(c52173N7d);
                return;
            case 1:
                Object obj = N4s.A02.get(Integer.valueOf(i));
                if (obj != null) {
                    EnumC154216wW enumC154216wW = (EnumC154216wW) obj;
                    N4s n4s = (N4s) this.A01;
                    InterfaceC09390do interfaceC09390do = n4s.A01;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    User user = n4s.A00;
                    if (user != null) {
                        OQF.A00(AbstractC166987dD.A0O(n4s.requireContext()), A0r, enumC154216wW, user);
                        User user2 = n4s.A00;
                        if (user2 != null) {
                            AbstractC147806l5.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0I(enumC154216wW, user2.getId(), false);
                            return;
                        }
                    }
                    C14360o3.A0F("displayedUser");
                    throw C00O.createAndThrow();
                }
                throw AbstractC166997dE.A0g();
            default:
                if (i != 0) {
                    if (i != 1) {
                        num2 = C05F.A00;
                    } else {
                        num2 = C05F.A0C;
                    }
                } else {
                    num2 = C05F.A01;
                }
                C56255Oy2 c56255Oy2 = (C56255Oy2) this.A01;
                UserSession userSession = c56255Oy2.A0C;
                String str = "anyone";
                String A0f = MSY.A0f(AbstractC23021Ah.A00(userSession), "reel_message_prefs", "anyone");
                Integer num3 = C05F.A01;
                if (!"anyone".equals(A0f)) {
                    num3 = C05F.A0C;
                    if (!"following".equals(A0f)) {
                        num3 = C05F.A00;
                    }
                }
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                switch (num2.intValue()) {
                    case 0:
                        str = "off";
                        break;
                    case 1:
                        break;
                    default:
                        str = "following";
                        break;
                }
                AbstractC31176DnK.A1X(A002.A01, "reel_message_prefs", str);
                AbstractC33235ElU abstractC33235ElU = c56255Oy2.A0E;
                C1ON A02 = C25401Lu.A02(userSession, num2);
                MWM.A00(A02, this, num3, 26);
                abstractC33235ElU.schedule(A02);
                C56255Oy2.A04(c56255Oy2);
                return;
        }
    }
}
