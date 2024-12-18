package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32403EPe extends C7E1 {
    public C22P A00;
    public FLM A01;
    public Boolean A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final UserSession A0C;
    public final ESC A0D;
    public final C31544DtU A0E;
    public final C31544DtU A0F;
    public final EQg A0L;
    public final HF9 A0M;
    public final ERP A0N;
    public final C34470FHi A0O;
    public final C34470FHi A0P;
    public final N90 A0Q;
    public final N90 A0R;
    public final C31335Dq0 A0S;
    public final C31335Dq0 A0T;
    public final C31335Dq0 A0U;
    public final C31335Dq0 A0V;
    public final C31335Dq0 A0W;
    public final C31335Dq0 A0X;
    public final C168737g7 A0Z;
    public final List A0K = AbstractC166987dD.A1E();
    public final List A0I = AbstractC166987dD.A1E();
    public final List A0H = AbstractC166987dD.A1E();
    public final List A0J = AbstractC166987dD.A1E();
    public final List A0G = AbstractC166987dD.A1E();
    public final List A0a = AbstractC166987dD.A1E();
    public ProductCollection A02 = null;
    public final C34531FJr A0Y = new Object();

    /* JADX WARN: Type inference failed for: r0v6, types: [X.FJr, java.lang.Object] */
    public C32403EPe(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37295Gbw interfaceC37295Gbw, Integer num, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        C34470FHi c34470FHi = new C34470FHi();
        this.A0P = c34470FHi;
        C34470FHi c34470FHi2 = new C34470FHi();
        this.A0O = c34470FHi2;
        this.A0A = true;
        this.A08 = true;
        this.A07 = false;
        this.A01 = null;
        this.A00 = C22P.A5N;
        this.A0B = context;
        this.A0C = userSession;
        this.A05 = z4;
        ESC esc = new ESC(context, interfaceC11380iw, userSession, interfaceC37295Gbw, interfaceC37295Gbw, interfaceC37295Gbw, num, str, str2, str3, str4, str5, str6, z, z2, z3, z4);
        this.A0D = esc;
        Integer num2 = C05F.A01;
        boolean z5 = false;
        if (num == num2) {
            z5 = true;
            c34470FHi.A00 = num2;
        }
        c34470FHi2.A00 = C05F.A00;
        N90 n90 = new N90(interfaceC11380iw, interfaceC37295Gbw);
        this.A0R = n90;
        N90 n902 = new N90(interfaceC11380iw, interfaceC37295Gbw);
        this.A0Q = n902;
        HF9 hf9 = new HF9(interfaceC11380iw, interfaceC37295Gbw, z5);
        this.A0M = hf9;
        ERP erp = new ERP(context, interfaceC37295Gbw);
        this.A0N = erp;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A0Z = c168737g7;
        C31544DtU c31544DtU = new C31544DtU(context);
        this.A0F = c31544DtU;
        C31544DtU c31544DtU2 = new C31544DtU(context);
        this.A0E = c31544DtU2;
        EQg eQg = new EQg(context);
        this.A0L = eQg;
        A0B(esc, n90, n902, hf9, erp, c168737g7, c31544DtU, c31544DtU2, eQg);
        this.A0T = C31335Dq0.A00(2131975158);
        this.A0W = C31335Dq0.A00(2131975161);
        C31335Dq0 A00 = C31335Dq0.A00(2131974928);
        A00.A04 = R.style.igds_emphasized_body_1;
        this.A0V = A00;
        this.A0U = C31335Dq0.A00(2131975160);
        this.A0S = C31335Dq0.A00(2131975156);
        this.A0X = C31335Dq0.A00(2131975164);
    }

    public final void A0D(List list) {
        List list2 = this.A0a;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product A07 = ((MediaSuggestedProductTag) it.next()).A07();
            if (A07 != null) {
                list2.add(A07);
            }
        }
    }

    public final void A0E(List list) {
        List list2 = this.A0K;
        list2.clear();
        this.A0J.clear();
        this.A02 = null;
        list2.addAll(AbstractC166987dD.A1F(AbstractC31171DnF.A0k(list)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x008d, code lost:
    
        if (r14.A0I.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x008f, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0073, code lost:
    
        if (r1 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r14.A08 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r5 = r14.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r5.isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r5.size() != r6.size()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        r2 = java.lang.Boolean.TRUE.equals(r14.A03);
        r1 = r4.A01(r7).A0M();
        r0 = r14.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r1 != r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r2 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        r1 = 2131969954;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r0 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        r1 = 2131969947;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        r3 = X.C35246Fgf.A00(r14.A0B, r1);
        r3.A01 = com.facebook.R.style.igds_body_1;
        A09(r14.A0Z, r14.A0S, r14.A0Y);
        r8 = r14.A0F;
        A08(r8, r3);
        r10 = X.AbstractC166987dD.A1E();
        r4 = X.AbstractC166987dD.A1E();
        r3 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        if (r9 >= r5.size()) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        r11 = (com.instagram.tagging.model.Tag) r5.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ea, code lost:
    
        if (r11.getId().equals(r14.A04) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        if (r6.isEmpty() != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        if (r6.contains(r11.getId()) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011e, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
    
        r1 = r14.A0G.contains(r11.getId());
        r0 = java.lang.Boolean.valueOf(r1);
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010b, code lost:
    
        if (r1 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010d, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
    
        X.AbstractC31174DnI.A1T(new X.E72(r11, true, r0.booleanValue()), java.lang.Integer.valueOf(r9), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0145, code lost:
    
        r9 = r14.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0147, code lost:
    
        if (r9 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
    
        if (r10.isEmpty() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
    
        r1 = new X.C35246Fgf(2131956350);
        r1.A01 = com.facebook.R.style.igds_emphasized_body_1;
        A08(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015f, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0164, code lost:
    
        if (r7 >= r10.size()) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0166, code lost:
    
        r0 = (android.util.Pair) r10.get(r7);
        A09(r14.A0D, r0.first, r0.second);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0178, code lost:
    
        if (r9 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
    
        if (r4.isEmpty() != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0180, code lost:
    
        r1 = new X.C35246Fgf(2131956349);
        r1.A01 = com.facebook.R.style.igds_emphasized_body_1;
        A08(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0194, code lost:
    
        if (r3 >= r4.size()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0196, code lost:
    
        r0 = (android.util.Pair) r4.get(r3);
        A09(r14.A0D, r0.first, r0.second);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0121, code lost:
    
        r1 = 2131969953;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0124, code lost:
    
        if (r0 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0126, code lost:
    
        r1 = 2131969952;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012a, code lost:
    
        if (r2 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012c, code lost:
    
        r1 = 2131971151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012f, code lost:
    
        if (r0 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0131, code lost:
    
        r1 = 2131965985;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0136, code lost:
    
        r1 = 2131971150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0139, code lost:
    
        if (r0 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013b, code lost:
    
        r1 = 2131965986;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ae, code lost:
    
        if (r13 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b2, code lost:
    
        if (r14.A0A == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b4, code lost:
    
        A09(r14.A0Z, r14.A0X, r14.A0Y);
        r4 = false;
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C() {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32403EPe.A0C():void");
    }
}
