package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7bT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166017bT {
    public static final List A0H = AbstractC16960so.A1Q("❤️", "🙌", "🔥", "👏", "😢", "😍", "😮", "😂");
    public final C167977es A00;
    public final UserSession A01;
    public final C05A A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final C0UO A0C;
    public final C0UO A0D;
    public final C0UO A0E;
    public final C0UO A0F;
    public final Map A0G;

    public C166017bT(C167977es c167977es, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c167977es, 2);
        this.A01 = userSession;
        this.A00 = c167977es;
        this.A03 = new C008002u("");
        C008002u c008002u = new C008002u("");
        this.A02 = c008002u;
        this.A0A = AbstractC208910l.A02(c008002u);
        C008002u c008002u2 = new C008002u(false);
        this.A07 = c008002u2;
        this.A0E = AbstractC208910l.A02(c008002u2);
        this.A09 = new C008002u(new C167987et(null, null, null, null, 7));
        C008002u A00 = C10E.A00(C16930sl.A00);
        this.A04 = A00;
        this.A0B = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(null);
        this.A06 = A002;
        this.A0D = AbstractC208910l.A02(A002);
        C008002u A003 = C10E.A00(null);
        this.A05 = A003;
        this.A0C = AbstractC208910l.A02(A003);
        C008002u A004 = C10E.A00(null);
        this.A08 = A004;
        this.A0F = AbstractC208910l.A02(A004);
        this.A0G = new LinkedHashMap();
    }

    public final C167607eG A00(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A0G;
        if (map.containsKey(str)) {
            return (C167607eG) map.get(str);
        }
        C167607eG c167607eG = (C167607eG) this.A0D.getValue();
        if (c167607eG == null) {
            return c167607eG;
        }
        map.put(str, c167607eG);
        return c167607eG;
    }

    public final void A04(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        C167607eG c167607eG = (C167607eG) this.A0D.getValue();
        C167987et c167987et = (C167987et) this.A09.getValue();
        C167977es c167977es = this.A00;
        String str3 = null;
        if (c167607eG != null) {
            str3 = c167607eG.A02;
            str2 = c167607eG.A04;
        } else {
            str2 = null;
        }
        CharSequence charSequence = (CharSequence) this.A03.getValue();
        C14360o3.A0B(charSequence, 3);
        c167977es.A00.put(str, new C9CG(c167987et, charSequence, str3, str2));
    }

    public final void A01() {
        this.A06.Egh(null);
        this.A05.Egh(null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0014. Please report as an issue. */
    public final void A02(User user, EnumC168447fe enumC168447fe) {
        int i;
        C05A c05a;
        C167627eI c167627eI;
        C167607eG c167607eG = (C167607eG) this.A0D.getValue();
        boolean z = true;
        if (c167607eG != null) {
            z = false;
            user = c167607eG.A00;
        }
        if (user != null) {
            switch (enumC168447fe.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case Process.SIGTERM /* 15 */:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Type ");
                    sb.append(enumC168447fe);
                    sb.append(" cannot be handled here");
                    throw new UnsupportedOperationException(sb.toString());
                case 3:
                    i = 2131965095;
                    c05a = this.A05;
                    c167627eI = new C167627eI(user, i, z, true);
                    c05a.Egh(c167627eI);
                    return;
                case 4:
                case 11:
                    c05a = this.A05;
                    i = 2131965096;
                    c167627eI = new C167627eI(user, i, z, true);
                    c05a.Egh(c167627eI);
                    return;
                case 10:
                    i = 2131965098;
                    c05a = this.A05;
                    c167627eI = new C167627eI(user, i, z, true);
                    c05a.Egh(c167627eI);
                    return;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    c05a = this.A05;
                    i = 2131965097;
                    c167627eI = new C167627eI(user, i, z, true);
                    c05a.Egh(c167627eI);
                    return;
                case 14:
                    c05a = this.A05;
                    c167627eI = new C167627eI(user, 2131965094, false, false);
                    c05a.Egh(c167627eI);
                    return;
                default:
                    throw new RuntimeException();
            }
        }
    }

    public final void A03(User user, Long l, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A06.Egh(new C167607eG(user, l, str, str2, str3, z, z2, z3));
    }
}
