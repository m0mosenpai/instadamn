package X;

import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7O4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7O4 {
    public C1I4 A00;
    public RecyclerView A01;
    public ImmutableList A02;
    public C7OT A03;
    public L3Q A04;
    public C3o9 A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final UserSession A09;
    public final C1GL A0A;
    public final C2DS A0B;
    public final Long A0C;
    public final List A0D = new ArrayList();
    public final boolean A0E;

    public final void A00() {
        List unmodifiableList;
        C3o9 c3o9 = this.A05;
        String str = this.A06;
        if (c3o9 != null && str != null && (c3o9 instanceof DirectThreadKey)) {
            DirectThreadKey directThreadKey = (DirectThreadKey) c3o9;
            C2DU c2du = (C2DU) this.A0B;
            C14360o3.A0B(directThreadKey, 0);
            C4GV A0P = c2du.A0P(directThreadKey);
            if (A0P == null) {
                C0w9.A03(AbstractC43591JPw.A00(114), "Entry should exist before function call");
                return;
            }
            synchronized (A0P) {
                ArrayList arrayList = new ArrayList();
                Iterator it = A0P.A0K.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C83403nh c83403nh = (C83403nh) it.next();
                    if (AbstractC13670mt.A0G(c83403nh.A0h(), str)) {
                        c83403nh.A0H = null;
                        arrayList.add(c83403nh);
                        break;
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            C2Io c2Io = new C2Io(A0P.A0I.BKb(), C05F.A0D, null, C4GV.A03(null, false), unmodifiableList, false);
            c2du.A09.accept(c2Io);
            c2du.A06.E4s(c2Io);
        }
    }

    public final void A02() {
        String str;
        C3o9 c3o9 = this.A05;
        if (c3o9 != null && (str = this.A06) != null) {
            if (this.A08 && str.equals(this.A07)) {
                return;
            }
            if (c3o9 instanceof DirectThreadKey) {
                C14360o3.A0C(c3o9, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                String str2 = ((DirectThreadKey) c3o9).A00;
                if (str2 == null) {
                    return;
                }
                String str3 = this.A06;
                if (str3 != null) {
                    C1GL c1gl = this.A0A;
                    C25621Ms c25621Ms = new C25621Ms(this.A09, -2);
                    c25621Ms.A06();
                    c25621Ms.A0L("direct_v2/threads_message_context/%s/", str2);
                    c25621Ms.A9s("cursor", str3);
                    c25621Ms.A0D("limit", 20);
                    c25621Ms.A0R(EBT.class, C34789FUr.class);
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = new C45546KEl(this, str2);
                    c1gl.schedule(A0N);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            C7OT c7ot = this.A03;
            if (c7ot == null) {
                return;
            }
            c7ot.A00.post(new RunnableC49861M0g(c7ot.A01));
        }
    }

    public final boolean A03() {
        if (this.A05 != null && this.A06 != null) {
            return true;
        }
        return false;
    }

    public C7O4(UserSession userSession, C3o9 c3o9, Long l, String str, List list, boolean z) {
        this.A09 = userSession;
        this.A05 = c3o9;
        this.A06 = str;
        this.A0C = l;
        this.A0E = z;
        this.A0B = AbstractC28761aE.A00(userSession);
        if (list != null) {
            this.A02 = ImmutableList.copyOf((Collection) list);
        }
        this.A0A = C1GJ.A01();
    }

    public final void A01() {
        if (A03()) {
            A00();
            if (A04()) {
                this.A05 = null;
            }
            this.A06 = null;
            this.A02 = null;
            Iterator it = this.A0D.iterator();
            while (it.hasNext()) {
                ((C7OV) it.next()).DOk();
            }
            C1I4 c1i4 = this.A00;
            if (c1i4 != null) {
                RecyclerView recyclerView = this.A01;
                if (recyclerView != null) {
                    recyclerView.A15(c1i4);
                }
                this.A00 = null;
            }
        }
    }

    public final boolean A04() {
        if (A03() && this.A0E) {
            return true;
        }
        return false;
    }
}
