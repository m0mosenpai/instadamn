package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.2fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54772fa {
    public C1QO A00;
    public C1QO A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C54762fZ A04;
    public final List A05;
    public final Stack A06;

    private int A00(C1QO c1qo) {
        if (C18U.A06(C06090Tz.A05, this.A03, 36315537627024766L)) {
            int i = 0;
            while (true) {
                Stack stack = this.A06;
                if (i < stack.size()) {
                    if (stack.get(i) != c1qo) {
                        i++;
                    } else {
                        return i;
                    }
                } else {
                    return -1;
                }
            }
        } else {
            return this.A06.search(c1qo);
        }
    }

    private void A01(int i) {
        Stack stack = this.A06;
        stack.remove(i);
        if (C18U.A06(C06090Tz.A05, this.A03, 36322980805552957L)) {
            int i2 = 0;
            while (i2 < stack.size() - 1) {
                C1QO c1qo = (C1QO) stack.get(i2);
                C1QO c1qo2 = (C1QO) stack.get(i2 + 1);
                if (c1qo2 != null && c1qo != null && c1qo.A03 == c1qo2.A03) {
                    stack.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    public final C1QO A02() {
        Stack stack = this.A06;
        if (stack.isEmpty()) {
            return null;
        }
        return (C1QO) stack.peek();
    }

    public final void A04(C1QO c1qo) {
        Fragment A0O = this.A02.getSupportFragmentManager().A0O(R.id.layout_container_main);
        if (A0O != null) {
            AbstractC10360h2 childFragmentManager = A0O.getChildFragmentManager();
            if (C06P.A01(childFragmentManager)) {
                if (childFragmentManager.A0L() > 0) {
                    childFragmentManager.A0c(((C14240no) childFragmentManager.A0S(0)).A00);
                    return;
                }
                return;
            }
            this.A00 = c1qo;
        }
    }

    public final void A05(C1QO c1qo, boolean z, boolean z2, boolean z3) {
        C1QO c1qo2 = C1QO.A0B;
        if (c1qo == c1qo2 && AbstractC54792fc.A07(this.A03)) {
            return;
        }
        FragmentActivity fragmentActivity = this.A02;
        AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (C06P.A01(supportFragmentManager)) {
            C1QO A02 = A02();
            String str = c1qo.A04;
            Fragment A0Q = fragmentActivity.getSupportFragmentManager().A0Q(str);
            Fragment A0O = supportFragmentManager.A0O(R.id.layout_container_main);
            UserSession userSession = this.A03;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 2342156807378176254L)) {
                C55782hJ A00 = C55772hI.A00(userSession);
                String obj = c1qo.toString();
                String str2 = c1qo.A06;
                A00.A0E = A00.A05;
                A00.A05 = obj;
                A00.A06 = str2;
            }
            C14240no c14240no = new C14240no(supportFragmentManager);
            if (C2U7.A00 && A0O != null && A0O.getChildFragmentManager() != null) {
                AbstractC10360h2 childFragmentManager = A0O.getChildFragmentManager();
                C14360o3.A0B(childFragmentManager, 0);
                Iterator it = childFragmentManager.A0U.A04().iterator();
                while (it.hasNext()) {
                    ((Fragment) it.next()).setAnimations(0, 0, 0, 0);
                }
            }
            if (A0Q == null) {
                A0Q = new C60412pP();
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                bundle.putString("TAB_FRAGMENT_TAG", str);
                bundle.putBoolean("DELAY_FRAGMENT_LOADING", z);
                A0Q.setArguments(bundle);
                c14240no.A0C(A0Q, str, R.id.layout_container_main);
            } else {
                c14240no.A08(A0Q);
            }
            if (A0O != null && A0O != A0Q) {
                c14240no.A02(A0O);
            }
            c14240no.A00();
            supportFragmentManager.A0Z();
            if (!C18U.A06(c06090Tz, userSession, 2342156807378176254L)) {
                C55782hJ A002 = C55772hI.A00(userSession);
                String obj2 = c1qo.toString();
                String str3 = c1qo.A06;
                A002.A0E = A002.A05;
                A002.A05 = obj2;
                A002.A06 = str3;
            }
            if (z2) {
                return;
            }
            if (!z3) {
                int A003 = A00(c1qo);
                Stack stack = this.A06;
                if (A003 != stack.size() && A003 > 0) {
                    A01(A003);
                }
                if (stack.peek() != c1qo) {
                    stack.push(c1qo);
                }
                this.A04.A0A(A02, c1qo);
                return;
            }
            Stack stack2 = this.A06;
            stack2.clear();
            stack2.push(C1QO.A0C);
            stack2.push(c1qo2);
            return;
        }
        this.A01 = c1qo;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x006b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C54772fa(android.content.Intent r7, android.os.Bundle r8, androidx.fragment.app.FragmentActivity r9, com.instagram.common.session.UserSession r10, X.C54762fZ r11) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54772fa.<init>(android.content.Intent, android.os.Bundle, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.2fZ):void");
    }

    public final void A03() {
        C1QO A02 = A02();
        C1QO c1qo = C1QO.A0B;
        int A00 = A00(c1qo);
        Stack stack = this.A06;
        if (A00 != stack.size() && A00 > 0) {
            A01(A00);
        }
        if (stack.peek() != c1qo) {
            stack.push(c1qo);
        }
        this.A04.A0A(A02, c1qo);
    }
}
