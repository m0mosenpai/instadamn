package X;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.Map;

/* renamed from: X.Jf2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44137Jf2 {
    public C44178Jfh A00;
    public C7GN A01;
    public Integer A02 = C05F.A0C;
    public String A03 = "";
    public Map A04;
    public final FragmentActivity A05;
    public final UserSession A06;
    public final C46512KiB A07;
    public final C44136Jf1 A08;
    public final C7IK A09;
    public final C31667DvX A0A;
    public final C7TG A0B;
    public final C44139Jf4 A0C;
    public final Map A0D;
    public final InterfaceC11380iw A0E;

    public static final void A00(C44137Jf2 c44137Jf2) {
        String str;
        Integer num;
        C189478aR A00 = C49623LwG.A00(AbstractC25225BEi.A0y(c44137Jf2.A06), c44137Jf2, 16);
        KBX kbx = new KBX();
        C44178Jfh c44178Jfh = c44137Jf2.A00;
        if (c44178Jfh == null || (str = c44178Jfh.A02) == null) {
            str = c44137Jf2.A03;
        }
        if (c44178Jfh != null) {
            num = c44178Jfh.A00;
        } else {
            num = null;
        }
        C7IK c7ik = c44137Jf2.A09;
        C47623L1i c47623L1i = new C47623L1i(c44137Jf2, A00, num);
        Map map = c44137Jf2.A04;
        C14360o3.A0B(str, 1);
        kbx.A04 = c7ik;
        kbx.A07 = str;
        kbx.A05 = c47623L1i;
        kbx.A00 = map.size();
        kbx.A08 = map;
        c44137Jf2.A00 = null;
        c44137Jf2.A02 = C05F.A0C;
        A00.A02(c44137Jf2.A05, kbx);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.KiB, java.lang.Object] */
    public C44137Jf2(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C44136Jf1 c44136Jf1) {
        this.A06 = userSession;
        this.A05 = fragmentActivity;
        this.A08 = c44136Jf1;
        this.A0E = interfaceC11380iw;
        AnonymousClass989 anonymousClass989 = AnonymousClass988.A1Z;
        Parcelable.Creator creator = Capabilities.CREATOR;
        this.A09 = AbstractC86593tX.A06(fragmentActivity, anonymousClass989.A00(userSession, AbstractC2054797v.A00(AbstractC166987dD.A1E()))).A07;
        this.A04 = AbstractC166987dD.A1G();
        this.A0D = AbstractC166987dD.A1G();
        this.A0B = AbstractC165967bO.A00(userSession);
        this.A0C = AbstractC44138Jf3.A00(userSession);
        this.A0A = new C31667DvX(interfaceC11380iw, userSession);
        String A0n = AbstractC166997dE.A0n();
        ?? obj = new Object();
        obj.A01 = "bulk_reply";
        obj.A02 = A0n;
        obj.A00 = null;
        this.A07 = obj;
    }
}
