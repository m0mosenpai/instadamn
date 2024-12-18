package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U1E extends AbstractC66412zI {
    public final int A00;
    public final XLR A01;
    public final InterfaceC72020XFi A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        Context A0L = AbstractC166997dE.A0L(viewGroup);
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(A0L), viewGroup, R.layout.row_search_keyword_icons, false);
        U3H u3h = new U3H(A0C);
        U3G.A00(A0L, u3h.A07, C05F.A00);
        A0C.setTag(u3h);
        C3OO c3oo = new C3OO(A0C);
        if (A0C.getTag() instanceof U3H) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r4 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
    
        if (r6 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        r4 = r11.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        if (X.C14360o3.A0K(r4, "null_state_recent") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e6, code lost:
    
        if (X.C14360o3.A0K(r4, "meta_ai_recent") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ec, code lost:
    
        if (X.C14360o3.A0K(r4, "null_state_popular") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        if (X.C14360o3.A0K(r4, "null_state_suggestions") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        if (r1 != r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        r7.A07.setVisibility(8);
        r1.setVisibility(8);
        r1 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        r1 = r7.A04.inflate();
        X.C14360o3.A0C(r1, "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView");
        r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1;
        r7.A01 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        if (r5 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        if (r3.A0A != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011f, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0121, code lost:
    
        r0 = com.facebook.R.drawable.instagram_search_gen_ai_pano_filled_20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
    
        r1.setImageResource(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012d, code lost:
    
        if (X.C14360o3.A0K(r3.A07, "meta_ai_suggestion") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012f, code lost:
    
        if (r5 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0132, code lost:
    
        r1.setColorFilter(r0);
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0141, code lost:
    
        r0 = X.C3DY.A00(X.AbstractC167007dF.A09(r10, com.facebook.R.attr.glyphColorSecondary));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0138, code lost:
    
        X.AbstractC66174U2p.A02(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0153, code lost:
    
        if (X.C14360o3.A0K(r3.A07, "meta_ai_suggestion") == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0155, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0157, code lost:
    
        r0 = com.facebook.R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        if (r3.A0A == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015f, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        r0 = com.facebook.R.drawable.instagram_arrow_up_right_pano_filled_24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0165, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0167, code lost:
    
        r0 = com.facebook.R.drawable.instagram_search_outline_12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00be, code lost:
    
        if (X.C14360o3.A0K(r11.A09, "null_state_popular") == false) goto L31;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r28, X.C3OO r29) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1E.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return MZR.class;
    }

    public U1E(XLR xlr, InterfaceC72020XFi interfaceC72020XFi, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A01 = xlr;
        this.A02 = interfaceC72020XFi;
        this.A08 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A09 = z4;
        this.A00 = i;
        this.A05 = z5;
        this.A04 = z6;
        this.A03 = z7;
    }
}
