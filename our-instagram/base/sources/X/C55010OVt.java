package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.OVt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55010OVt {
    public static C55010OVt A06;
    public boolean A00;
    public final Context A01;
    public final QuickPerformanceLogger A02;
    public final C0f6 A03;
    public final Map A04;
    public final java.util.Set A05;

    public static final void A00(C55010OVt c55010OVt) {
        c55010OVt.A00 = true;
        java.util.Set set = c55010OVt.A05;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((SL4) it.next()).A00();
        }
        set.clear();
    }

    public C55010OVt(Context context) {
        C09530e4 A1L;
        String str;
        String str2;
        this.A01 = context;
        UserSession userSession = C54957OSh.A01;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36322800422365845L)) {
            str = "80a627fe78ffc546051fe99aeb5223c9874f0787.js";
            str2 = "autofill_contact_nonce_experiment";
        } else if (C18U.A06(c06090Tz, userSession, 36322800422169234L)) {
            str = "80a627fe78ffc546051fe99aeb5223c9874f0787.js";
            str2 = "autofill_contact_js_v2";
        } else {
            A1L = AbstractC166987dD.A1L(AbstractC58317Pt9.A00(230), "80a627fe78ffc546051fe99aeb5223c9874f0787.js");
            this.A04 = AbstractC16850sd.A0M(A1L);
            this.A02 = AbstractC43592JPx.A0N();
            C18950wb c18950wb = C18950wb.A01;
            C14360o3.A07(c18950wb);
            this.A03 = c18950wb;
            this.A05 = AbstractC31171DnF.A0l();
        }
        A1L = AbstractC166987dD.A1L(str2, str);
        this.A04 = AbstractC16850sd.A0M(A1L);
        this.A02 = AbstractC43592JPx.A0N();
        C18950wb c18950wb2 = C18950wb.A01;
        C14360o3.A07(c18950wb2);
        this.A03 = c18950wb2;
        this.A05 = AbstractC31171DnF.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fa, code lost:
    
        if (X.AbstractC14490oL.A0J(r0, "com.instagram.android.debug") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0130, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010b, code lost:
    
        if (X.AbstractC14490oL.A0I(r11, r15, r12.intValue()) == false) goto L43;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, X.OXd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55010OVt.A01():void");
    }
}
