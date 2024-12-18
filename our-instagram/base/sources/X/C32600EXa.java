package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;

/* renamed from: X.EXa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32600EXa extends AbstractC66412zI {
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final LocationDetailFragment A03;

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0208, code lost:
    
        r9 = r4.A04;
        X.C73L.A06(r9, r4);
        r1 = r4.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0213, code lost:
    
        if (r1.A04() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0215, code lost:
    
        X.C73L.A06((android.widget.LinearLayout) r1.A01(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021e, code lost:
    
        X.C73L.A04(r7, r9, (X.C51745MtU) r12.get(0), r0, r8, r25, r5, r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0235, code lost:
    
        if (r13 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023c, code lost:
    
        r1.A03(0);
        X.C73L.A04(r7, (android.widget.LinearLayout) r1.A01(), (X.C51745MtU) r12.get(1), r0, r8, r25, r5, r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0252, code lost:
    
        r4.A03.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0259, code lost:
    
        r19.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x025c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0238, code lost:
    
        r1.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0186, code lost:
    
        r1 = java.util.Arrays.asList(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018f, code lost:
    
        r1 = java.util.Collections.singletonList(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x015e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00e9, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00ea, code lost:
    
        if (r16 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00cb, code lost:
    
        if (r16 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        if (r13 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e4, code lost:
    
        if (X.C14360o3.A0K(X.C18U.A04(X.C06090Tz.A05, X.AbstractC1567572b.A00(r8).A00, 36875592771240009L), "3-up") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e7, code lost:
    
        if (r13 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
    
        X.C18U.A06(X.C06090Tz.A05, X.AbstractC1567572b.A00(r8).A00, 2342155652031382731L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
    
        r1 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
    
        if (r1.hasNext() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010c, code lost:
    
        if ((r1.next() instanceof X.C1569673a) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0112, code lost:
    
        if (X.AbstractC1566271k.A0S(r8, r6) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0114, code lost:
    
        if (r15 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0116, code lost:
    
        if (r12 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0118, code lost:
    
        r10 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (r10.hasNext() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
    
        r1 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
    
        if ((r1 instanceof X.C1569673a) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012a, code lost:
    
        if (r1 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012c, code lost:
    
        r9.remove(r1);
        r9.add(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0133, code lost:
    
        r10 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013b, code lost:
    
        if (r10.hasNext() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013d, code lost:
    
        r1 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        if ((r1 instanceof X.C1569673a) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0145, code lost:
    
        if (r1 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
    
        r9.remove(r1);
        r9.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
    
        if (X.C2TN.A04(r8, r6) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0153, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015c, code lost:
    
        if (X.AbstractC166987dD.A10(r8).A2I() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015f, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0161, code lost:
    
        if (r0 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0163, code lost:
    
        if (r16 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0165, code lost:
    
        if (r12 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016b, code lost:
    
        if (r9.size() <= 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0174, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0172, code lost:
    
        if (r9.size() <= 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0175, code lost:
    
        r1 = new X.C50526MSf(r13, false, 14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017c, code lost:
    
        if (r13 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017e, code lost:
    
        r0 = new X.C50526MSf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0183, code lost:
    
        if (r15 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0194, code lost:
    
        r1 = java.util.Arrays.asList(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019c, code lost:
    
        X.C14360o3.A0B(r1, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a3, code lost:
    
        r11 = 0;
        r18 = X.AbstractC25230BEn.A1S(r1.size(), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a8, code lost:
    
        r12 = X.AbstractC167017dG.A0q(r1);
        r17 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b4, code lost:
    
        if (r17.hasNext() == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b6, code lost:
    
        r10 = (X.C50526MSf) r17.next();
        r0 = X.AbstractC31172DnG.A03(r9, r11);
        r1 = java.lang.Math.max(X.AbstractC31172DnG.A03(r9, 3), 1);
        r15 = java.lang.Math.min(X.AbstractC31172DnG.A03(r9, r1), java.lang.Math.min(r0, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d4, code lost:
    
        if (r18 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d6, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dd, code lost:
    
        r16 = java.lang.Math.min(r1 + r11, r9.size());
        r15 = X.AbstractC001800i.A0i(r9, X.C17s.A0C(r11, r16));
        r0 = r15.size();
        r11 = r10.A00;
        r12.add(new X.C51745MtU(r15, X.C73N.A00(null, r0, r11, false), 5, r11));
        r11 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01da, code lost:
    
        if (r10.A01 != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01dc, code lost:
    
        r1 = r15;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.GBF, X.70O] */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r30, X.C3OO r31) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32600EXa.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        UserSession userSession = this.A02;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E1T(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_business_profile_redesign_row), userSession);
    }

    public C32600EXa(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, LocationDetailFragment locationDetailFragment) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = fragment;
        this.A03 = locationDetailFragment;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36217FyW.class;
    }
}
