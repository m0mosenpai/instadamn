package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66632zf extends AbstractC65632xz {
    public final UserSession A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final C64312vq A03;
    public final InterfaceC61782rf A04;
    public final C64062vR A05;
    public final C60662pp A06;

    public C66632zf(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C64312vq c64312vq, InterfaceC61782rf interfaceC61782rf, C64062vR c64062vR, C60662pp c60662pp) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c64062vR, 4);
        C14360o3.A0B(c60662pp, 5);
        C14360o3.A0B(interfaceC61782rf, 6);
        C14360o3.A0B(c64312vq, 7);
        this.A01 = context;
        this.A00 = userSession;
        this.A02 = interfaceC11380iw;
        this.A05 = c64062vR;
        this.A06 = c60662pp;
        this.A04 = interfaceC61782rf;
        this.A03 = c64312vq;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "IntentAwareAdPivotViewBinderGroup";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x045d, code lost:
    
        if (X.C18U.A06(r0, r2, 36312874760930840L) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0472, code lost:
    
        r9.A07.setVisibility(8);
        r12 = r9.A05;
        r12.setPadding(r12.getPaddingLeft(), r12.getPaddingTop(), r12.getPaddingRight(), (int) X.AbstractC13880nE.A00(r7, 12.0f));
        r12.setText(r7.getString(2131964578));
        r12.setTextAppearance(com.facebook.R.style.igds_emphasized_body_1);
        r12.setTextColor(r7.getColor(X.AbstractC53242c7.A0H(r7, com.facebook.R.attr.igds_color_primary_text)));
        r3 = r1.A03;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04b2, code lost:
    
        if (r3 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04b6, code lost:
    
        if (r3.A06 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04b8, code lost:
    
        r13 = java.lang.Integer.valueOf(r1.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04c2, code lost:
    
        if (r11.A01(r13) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04cd, code lost:
    
        if (X.C18U.A06(r0, r2, 36312874761127451L) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04e0, code lost:
    
        r0 = r1.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04e2, code lost:
    
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04e4, code lost:
    
        r5 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04e6, code lost:
    
        r12.setText(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04d3, code lost:
    
        if (r11.A02(r13) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04de, code lost:
    
        if (X.C18U.A06(r0, r2, 36312874761192988L) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04e9, code lost:
    
        r5 = r9.A06;
        r5.setPadding(r5.getPaddingLeft(), r5.getPaddingTop(), r5.getPaddingRight(), (int) X.AbstractC13880nE.A00(r7, 12.0f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x051e, code lost:
    
        if (r0 != 33) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x063a, code lost:
    
        if (r3 != 33) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0875, code lost:
    
        if (X.C18U.A06(r14, r2, 36312874753852858L) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x088a, code lost:
    
        r15 = r0.A06;
        r15.setVisibility(0);
        r27 = java.lang.Integer.valueOf(r1.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x089b, code lost:
    
        if (r11.A01(r27) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x08a8, code lost:
    
        if (X.C18U.A06(r14, r2, 36312874755360206L) != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x08bd, code lost:
    
        r15 = (com.instagram.igds.components.button.IgdsButton) r15.findViewById(com.facebook.R.id.intent_aware_ad_pivot_card_cta_large);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x08c6, code lost:
    
        if (r15 == 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x08c8, code lost:
    
        r15.setVisibility(0);
        r15.setText(r13);
        r15.setContentDescription(r13);
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x08d1, code lost:
    
        X.C0fQ.A00(r12, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x08b0, code lost:
    
        if (r11.A02(r27) == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x08bb, code lost:
    
        if (X.C18U.A06(r14, r2, 36312874757457386L) == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0b90, code lost:
    
        r4 = (android.widget.TextView) r15.findViewById(com.facebook.R.id.intent_aware_ad_grid_cta_text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0b99, code lost:
    
        if (r4 == null) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0b9b, code lost:
    
        r4.setVisibility(0);
        r4.setText(r13);
        r4.setContentDescription(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0ba4, code lost:
    
        r4 = r15.findViewById(com.facebook.R.id.intent_aware_ad_grid_cta_chevron);
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0bab, code lost:
    
        if (r4 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0bad, code lost:
    
        r4.setVisibility(0);
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0888, code lost:
    
        if (X.C18U.A06(r14, r2, 36312874754508227L) != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0c73, code lost:
    
        if (X.AbstractC28501Chu.A04(r2, r1.A00) == false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0832, code lost:
    
        if (r13 != null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0470, code lost:
    
        if (X.C18U.A06(r0, r2, 36312874760996377L) != false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0d75  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0d80  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0daf  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0ddc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0df3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0e13  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0e3f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0e42  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0e46  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0e4a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0fa3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0fc7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0fe5  */
    /* JADX WARN: Type inference failed for: r12v61, types: [X.3OO, X.GuV] */
    /* JADX WARN: Type inference failed for: r9v12, types: [X.3OO, X.GuV] */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r51, android.view.View r52, java.lang.Object r53, java.lang.Object r54) {
        /*
            Method dump skipped, instructions count: 4155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66632zf.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r8.A00, 36312874757064166L) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r8.A00, 36312874752542121L) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        r9.A7a(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        return;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.AnonymousClass306 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            X.HBC r10 = (X.HBC) r10
            r5 = 0
            X.C14360o3.A0B(r9, r5)
            r4 = 1
            X.C14360o3.A0B(r10, r4)
            int r0 = r10.A00
            X.3Gx r6 = X.C5MB.A00
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            boolean r0 = r6.A02(r7)
            if (r0 == 0) goto L27
            com.instagram.common.session.UserSession r3 = r8.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36312874752542121(0x81025e006605a9, double:3.0277464414932597E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L3c
        L27:
            boolean r0 = r6.A01(r7)
            if (r0 == 0) goto L41
            com.instagram.common.session.UserSession r3 = r8.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36312874757064166(0x81025e00ab05e6, double:3.027746444353019E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L41
        L3c:
            r0 = 2
            r9.A7a(r0)
            return
        L41:
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r6.A01(r1)
            if (r0 == 0) goto L67
            com.instagram.common.session.UserSession r3 = r8.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36312874753656249(0x81025e007705b9, double:3.027746442197839E-306)
        L56:
            boolean r1 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C14360o3.A0A(r0)
            if (r1 == 0) goto L77
            r9.A7a(r4)
            return
        L67:
            boolean r0 = r6.A02(r1)
            if (r0 == 0) goto L77
            com.instagram.common.session.UserSession r3 = r8.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36312874754049469(0x81025e007d05bd, double:3.0277464424465126E-306)
            goto L56
        L77:
            r9.A7a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66632zf.buildRowViewTypes(X.306, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        C29320CwF c29320CwF;
        RecyclerView recyclerView;
        C2UU c38374GuB;
        View view2;
        C29320CwF c29320CwF2;
        int A03 = C0f9.A03(379712277);
        C14360o3.A0B(viewGroup, 1);
        if (i != 1) {
            if (i != 2) {
                UserSession userSession = this.A00;
                InterfaceC11380iw interfaceC11380iw = this.A02;
                C64062vR c64062vR = this.A05;
                C60662pp c60662pp = this.A06;
                InterfaceC61782rf interfaceC61782rf = this.A04;
                C14360o3.A0B(userSession, 1);
                C14360o3.A0B(interfaceC11380iw, 2);
                C14360o3.A0B(c64062vR, 3);
                C14360o3.A0B(c60662pp, 4);
                C14360o3.A0B(interfaceC61782rf, 5);
                Context context = viewGroup.getContext();
                View inflate = LayoutInflater.from(context).inflate(R.layout.intent_aware_ad_pivot_view, viewGroup, false);
                C14360o3.A0A(inflate);
                C42713Iv8 c42713Iv8 = new C42713Iv8(inflate, userSession);
                if (C18U.A06(C06090Tz.A05, userSession, 36312874753131954L)) {
                    ViewPager2 viewPager2 = c42713Iv8.A03;
                    C14360o3.A0A(context);
                    viewPager2.setAdapter(new C38373GuA(context, viewPager2, interfaceC11380iw, userSession, interfaceC61782rf, c64062vR, c60662pp, true));
                    c29320CwF = c42713Iv8;
                    view = inflate;
                } else {
                    recyclerView = c42713Iv8.A02;
                    C14360o3.A0A(context);
                    c38374GuB = new C38373GuA(context, null, interfaceC11380iw, userSession, interfaceC61782rf, c64062vR, c60662pp, false);
                    c29320CwF2 = c42713Iv8;
                    view2 = inflate;
                }
            } else {
                UserSession userSession2 = this.A00;
                InterfaceC11380iw interfaceC11380iw2 = this.A02;
                C64062vR c64062vR2 = this.A05;
                C60662pp c60662pp2 = this.A06;
                InterfaceC61782rf interfaceC61782rf2 = this.A04;
                C14360o3.A0B(userSession2, 1);
                C14360o3.A0B(interfaceC11380iw2, 2);
                C14360o3.A0B(c64062vR2, 3);
                C14360o3.A0B(c60662pp2, 4);
                C14360o3.A0B(interfaceC61782rf2, 5);
                Context context2 = viewGroup.getContext();
                View inflate2 = LayoutInflater.from(context2).inflate(R.layout.intent_aware_ad_rifu_view, viewGroup, false);
                C14360o3.A0A(inflate2);
                C42712Iv7 c42712Iv7 = new C42712Iv7(inflate2);
                recyclerView = c42712Iv7.A00;
                C14360o3.A0A(context2);
                c38374GuB = new C38374GuB(context2, interfaceC11380iw2, userSession2, interfaceC61782rf2, c64062vR2, c60662pp2);
                c29320CwF2 = c42712Iv7;
                view2 = inflate2;
            }
            recyclerView.setAdapter(c38374GuB);
            c29320CwF = c29320CwF2;
            view = view2;
        } else {
            UserSession userSession3 = this.A00;
            C14360o3.A0B(userSession3, 1);
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.intent_aware_ad_grid_view, viewGroup, false);
            C14360o3.A0A(inflate3);
            c29320CwF = new C29320CwF(inflate3, userSession3);
            view = inflate3;
        }
        view.setTag(c29320CwF);
        C0f9.A0A(-1925498489, A03);
        return view;
    }
}
