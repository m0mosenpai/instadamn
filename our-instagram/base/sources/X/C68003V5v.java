package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.V5v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68003V5v extends C3PD {
    public final int A00;
    public final Object A01;

    public C68003V5v(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        Object value;
        Spannable spannable;
        int length;
        String A00;
        Object value2;
        UQN uqn;
        String A002;
        User user;
        int i;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                if (view.isEnabled()) {
                    view.performHapticFeedback(3);
                    UFV A003 = C70827Whk.A00((C70827Whk) this.A01);
                    C22C A01 = AnonymousClass229.A01(A003.A02.A01);
                    A01.A1R(((C22F) A01).A04.A0C, "CLEAR_QUICK_CAPTION");
                    C05A c05a = A003.A07;
                    do {
                        value = c05a.getValue();
                    } while (!c05a.AIi(value, UQN.A02(new SpannableStringBuilder(""), (UQN) value, C16910sj.A00, 8127)));
                    UFV.A05(A003, c05a);
                    return true;
                }
                return false;
            case 1:
                C14360o3.A0B(view, 0);
                if (view.isEnabled()) {
                    view.performHapticFeedback(3);
                    UFV A004 = C70827Whk.A00((C70827Whk) this.A01);
                    C05A c05a2 = A004.A07;
                    boolean z = ((UQN) c05a2.getValue()).A09;
                    UQN uqn2 = (UQN) c05a2.getValue();
                    if (z) {
                        Spannable spannable2 = uqn2.A01;
                        int length2 = ((UQN) c05a2.getValue()).A01.length();
                        if (UFV.A06(A004) && (A002 = UFV.A00(spannable2, '@', length2)) != null && (user = (User) A004.A04.get(A002)) != null) {
                            UFV.A01(spannable2, A004, user, length2);
                        }
                    } else if (uqn2.A08 && (A00 = UFV.A00((spannable = ((UQN) c05a2.getValue()).A01), '#', (length = ((UQN) c05a2.getValue()).A01.length()))) != null && A00.length() != 0) {
                        A004.A0A(spannable, AbstractC1120253r.A00(A00), length);
                    }
                    do {
                        value2 = c05a2.getValue();
                        uqn = (UQN) value2;
                    } while (!c05a2.AIi(value2, UQN.A00(new SpannableStringBuilder(AbstractC001900j.A0B(uqn.A01)), uqn)));
                    UFV.A05(A004, c05a2);
                    UFV.A02(C68029V6x.A00, A004);
                    return true;
                }
                return false;
            case 2:
                C70861WiR.A01((C70861WiR) this.A01, null);
                return true;
            case 3:
                ViewOnFocusChangeListenerC70880Wil viewOnFocusChangeListenerC70880Wil = (ViewOnFocusChangeListenerC70880Wil) this.A01;
                int i2 = viewOnFocusChangeListenerC70880Wil.A00 + 1;
                ArrayList arrayList = viewOnFocusChangeListenerC70880Wil.A0Q;
                int size = i2 % arrayList.size();
                viewOnFocusChangeListenerC70880Wil.A00 = size;
                ViewOnFocusChangeListenerC70880Wil.A01(viewOnFocusChangeListenerC70880Wil, (EnumC209229Ne) AbstractC31173DnH.A0i(arrayList, size));
                return true;
            case 4:
                C70860WiQ c70860WiQ = (C70860WiQ) this.A01;
                int i3 = c70860WiQ.A00 + 1;
                ArrayList arrayList2 = c70860WiQ.A0H;
                int size2 = i3 % arrayList2.size();
                c70860WiQ.A00 = size2;
                C70860WiQ.A03(c70860WiQ, (EnumC209229Ne) AbstractC31173DnH.A0i(arrayList2, size2));
                return true;
            case 5:
                ViewOnFocusChangeListenerC70237WNa viewOnFocusChangeListenerC70237WNa = (ViewOnFocusChangeListenerC70237WNa) this.A01;
                ArrayList arrayList3 = viewOnFocusChangeListenerC70237WNa.A0A;
                int size3 = arrayList3.size() - 1;
                int i4 = viewOnFocusChangeListenerC70237WNa.A01;
                int i5 = i4 + 1;
                if (size3 == i4) {
                    i5 = 0;
                }
                viewOnFocusChangeListenerC70237WNa.A01 = i5;
                ViewOnFocusChangeListenerC70237WNa.A03(viewOnFocusChangeListenerC70237WNa, (EnumC209229Ne) arrayList3.get(i5));
                return true;
            case 6:
                WP8 wp8 = (WP8) this.A01;
                int i6 = wp8.A01;
                ArrayList arrayList4 = wp8.A0D;
                if (i6 == arrayList4.size() - 1) {
                    i = 0;
                } else {
                    i = wp8.A01 + 1;
                }
                wp8.A01 = i;
                WP8.A01(wp8, ((Number) arrayList4.get(i)).intValue());
                return true;
            case 7:
                C70877Wii c70877Wii = (C70877Wii) this.A01;
                if (c70877Wii.A05 == null) {
                    return true;
                }
                C3PF c3pf = c70877Wii.A04;
                if (c3pf != null) {
                    c3pf.A02();
                    InterfaceC25191BCo interfaceC25191BCo = c70877Wii.A05;
                    if (interfaceC25191BCo == null) {
                        return true;
                    }
                    interfaceC25191BCo.Dvd();
                    return true;
                }
                throw AbstractC166997dE.A0g();
            default:
                return true;
        }
    }
}
