package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N9I extends AbstractC168697g3 {
    public static final int A03 = EnumC53205Ng3.A01.size();
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC58093PpI A02;

    public N9I(Context context, UserSession userSession, InterfaceC58093PpI interfaceC58093PpI) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = interfaceC58093PpI;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C51759Mti c51759Mti = (C51759Mti) obj;
        C14360o3.A0B(c51759Mti, 1);
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(((EnumC53205Ng3) c51759Mti.A01).A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b7, code lost:
    
        if (r9.CQf() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b9, code lost:
    
        r8 = r10.getResources();
        r11 = X.AbstractC53242c7.A03(r10);
        r16 = r10.getColor(r11);
        r4 = new X.ViewOnClickListenerC55468OkN(62, r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        if (r7 == 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ce, code lost:
    
        if (r7 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d0, code lost:
    
        if (r7 == 5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d3, code lost:
    
        if (r7 == 6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        if (r7 != 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d7, code lost:
    
        r12 = r10.getDrawable(com.facebook.R.drawable.instagram_circle_block_pano_outline_24);
        r18 = X.AbstractC166997dE.A0r(r8, r9.getUsername(), 2131973264);
        X.C14360o3.A07(r18);
        r15 = java.lang.Integer.valueOf(r16);
        r16 = java.lang.Integer.valueOf(r11);
        X.OZJ.A00(r12, r4, r1, r15, r16, r16, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fb, code lost:
    
        r0.DkS(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0107, code lost:
    
        r7 = 2131976189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
    
        r12 = X.AbstractC166997dE.A0r(r8, r9.getUsername(), r7);
        X.C14360o3.A07(r12);
        X.OZJ.A00(r10.getDrawable(com.facebook.R.drawable.instagram_restrict_pano_outline_24), r4, r1, null, null, null, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
    
        r7 = 2131972500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        r10 = r10.getDrawable(com.facebook.R.drawable.instagram_user_unfollow_pano_outline_24);
        r16 = X.AbstractC166997dE.A0r(r8, r9.getUsername(), 2131973269);
        X.C14360o3.A07(r16);
        X.OZJ.A00(r10, r4, r1, null, null, null, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0143, code lost:
    
        r12 = X.AbstractC166997dE.A0r(r8, r9.getUsername(), 2131973265);
        X.C14360o3.A07(r12);
        X.OZJ.A00(null, r4, r1, null, null, null, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016d, code lost:
    
        if (r4 == false) goto L56;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r20, android.view.View r21, android.view.ViewGroup r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N9I.getView(int, android.view.View, android.view.ViewGroup, java.lang.Object, java.lang.Object):android.view.View");
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return A03;
    }
}
