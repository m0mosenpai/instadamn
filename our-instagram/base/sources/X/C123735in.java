package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123735in {
    public C7DK A00;
    public BTX A01;
    public String A02;
    public final C25671My A04;
    public final UserSession A06;
    public WeakReference A03 = new WeakReference(null);
    public final List A07 = new ArrayList();
    public final InterfaceC41501vz A05 = new InterfaceC41501vz() { // from class: X.5io
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            List list;
            C123735in c123735in;
            String str;
            String str2;
            C47664L2x c47664L2x;
            DirectMessageIdentifier directMessageIdentifier;
            C47664L2x c47664L2x2;
            DirectMessageIdentifier directMessageIdentifier2;
            int A03 = C0f9.A03(805258008);
            C2Io c2Io = (C2Io) obj;
            int A032 = C0f9.A03(1711168676);
            C14360o3.A0B(c2Io, 0);
            Integer num = c2Io.A01;
            if (num == C05F.A0F) {
                c123735in = C123735in.this;
            } else {
                if (num == C05F.A0Y && (list = c2Io.A03) != null) {
                    c123735in = C123735in.this;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str3 = ((C9Q7) it.next()).A03;
                            C7DK c7dk = c123735in.A00;
                            if (c7dk != null && (c47664L2x2 = c7dk.A02) != null && (directMessageIdentifier2 = c47664L2x2.A01) != null) {
                                str = directMessageIdentifier2.A00;
                            } else {
                                str = null;
                            }
                            if (!C14360o3.A0K(str3, str)) {
                                C7DK c7dk2 = c123735in.A00;
                                if (c7dk2 != null && (c47664L2x = c7dk2.A02) != null && (directMessageIdentifier = c47664L2x.A01) != null) {
                                    str2 = directMessageIdentifier.A02;
                                } else {
                                    str2 = null;
                                }
                                if (C14360o3.A0K(str3, str2)) {
                                }
                            }
                        }
                    }
                }
                C0f9.A0A(393122371, A032);
                C0f9.A0A(344588025, A03);
            }
            c123735in.A02(true);
            C0f9.A0A(393122371, A032);
            C0f9.A0A(344588025, A03);
        }
    };
    public final InterfaceC09390do A08 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E1(this, 30));

    public final void A02(boolean z) {
        if (z) {
            A00(this, "context_switch");
            this.A03.clear();
        } else {
            BTX btx = this.A01;
            if (btx != null) {
                btx.A02(false);
            }
        }
        List list = this.A07;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BTX) it.next()).A02(false);
        }
        list.clear();
    }

    public static final void A00(C123735in c123735in, String str) {
        C7DK c7dk;
        c123735in.A04.A02(c123735in.A05, C2Io.class);
        C7DK c7dk2 = c123735in.A00;
        if (c7dk2 != null && c7dk2.A0C() && (c7dk = c123735in.A00) != null) {
            c7dk.A09(str);
        }
        c123735in.A00 = null;
        BTX btx = c123735in.A01;
        if (btx != null) {
            btx.A02(false);
        }
    }

    public static final boolean A01(C123735in c123735in) {
        C47664L2x c47664L2x;
        DirectMessageIdentifier directMessageIdentifier;
        BTX btx;
        C7DK c7dk = c123735in.A00;
        if (c7dk == null || (c47664L2x = c7dk.A02) == null || (directMessageIdentifier = c47664L2x.A01) == null || (btx = c123735in.A01) == null) {
            return false;
        }
        c7dk.A08(new C29273CvU(c123735in, btx), directMessageIdentifier, null);
        View findViewById = BTX.A00(btx).findViewById(R.id.voice_message_bar_title);
        C14360o3.A07(findViewById);
        TextView textView = (TextView) findViewById;
        String str = c123735in.A02;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        btx.A01(c7dk.A02() - c7dk.A01());
        btx.A03(!c7dk.A0C());
        Object value = btx.A04.getValue();
        C14360o3.A07(value);
        C0fQ.A00(new LOM(c7dk), (View) value);
        Object value2 = btx.A05.getValue();
        C14360o3.A07(value2);
        C0fQ.A00(new ViewOnClickListenerC23211AQv(c123735in), (View) value2);
        c123735in.A04.A01(c123735in.A05, C2Io.class);
        return true;
    }

    public C123735in(UserSession userSession) {
        this.A06 = userSession;
        this.A04 = AbstractC25651Mw.A00(userSession);
        AbstractC110034xX.A00 = new C123755ip(this);
    }
}
