package X;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Oc4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55136Oc4 {
    public int A00;
    public ImageView A01;
    public ListView A02;
    public TextView A03;
    public C32403EPe A04;
    public EnumC53319Nhv A05;
    public Boolean A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public View A0C;
    public final View A0D;
    public final ViewStub A0E;
    public final ViewStub A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final FragmentActivity A0I;
    public final InterfaceC11380iw A0J;
    public final UserSession A0K;
    public final InterfaceC58305Psx A0L;
    public final String A0M;
    public final boolean A0N;
    public final ViewStub A0O;
    public final TextView A0P;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (com.instagram.tagging.activity.TaggingActivity.A0T(r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.EnumC40111tc r6, X.C55136Oc4 r7, X.EnumC53319Nhv r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55136Oc4.A00(X.1tc, X.Oc4, X.Nhv, int, boolean):void");
    }

    public static void A01(C55136Oc4 c55136Oc4) {
        FragmentActivity fragmentActivity;
        String string;
        String A0f;
        String str;
        int A02 = MSY.A02(c55136Oc4.A0C);
        Integer num = c55136Oc4.A07;
        if (num != null && c55136Oc4.A05 == EnumC53319Nhv.A08 && c55136Oc4.A00 == 0) {
            int intValue = num.intValue();
            if (intValue != 3 && intValue != 4 && intValue != 2) {
                return;
            }
            if (intValue != 3 && intValue != 4) {
                if (intValue != 2) {
                    return;
                }
                if (c55136Oc4.A0C == null) {
                    View inflate = c55136Oc4.A0O.inflate();
                    c55136Oc4.A0C = inflate;
                    c55136Oc4.A03 = AbstractC166987dD.A0e(inflate, R.id.tags_in_integrity_review_secondary_text);
                }
                fragmentActivity = c55136Oc4.A0I;
                string = fragmentActivity.getString(2131956526);
                A0f = AbstractC167007dF.A0f(fragmentActivity, string, 2131956527);
                str = "manage_rejection";
            } else {
                if (c55136Oc4.A0C == null) {
                    View inflate2 = c55136Oc4.A0O.inflate();
                    c55136Oc4.A0C = inflate2;
                    c55136Oc4.A03 = AbstractC166987dD.A0e(inflate2, R.id.tags_in_integrity_review_secondary_text);
                }
                fragmentActivity = c55136Oc4.A0I;
                string = fragmentActivity.getString(2131956523);
                A0f = AbstractC167007dF.A0f(fragmentActivity, string, 2131956524);
                str = "see_review";
            }
            TextView textView = c55136Oc4.A03;
            if (textView != null) {
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0f);
                AnonymousClass773.A05(A0H, new C52789NXy(c55136Oc4, Integer.valueOf(fragmentActivity.getResources().getColor(AbstractC53242c7.A06(fragmentActivity))), str), string);
                AbstractC31176DnK.A1G(textView, A0H);
            }
            c55136Oc4.A0C.setVisibility(0);
            c55136Oc4.A0D.setVisibility(A02);
        }
    }

    public static void A02(C55136Oc4 c55136Oc4) {
        TextView textView;
        int i;
        if (c55136Oc4.A05 == EnumC53319Nhv.A08) {
            TaggingActivity taggingActivity = (TaggingActivity) c55136Oc4.A0L;
            ArrayList arrayList = taggingActivity.A0N;
            if (arrayList == null) {
                AbstractC50522MSa.A0t();
                throw C00O.createAndThrow();
            }
            ArrayList arrayList2 = AbstractC50523MSb.A0J(taggingActivity, arrayList).A0D;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((MediaSuggestedProductTag) it.next()).A01 != EnumC53230NgS.A06) {
                        textView = c55136Oc4.A0H;
                        i = 0;
                        break;
                    }
                }
            }
        }
        textView = c55136Oc4.A0H;
        i = 8;
        textView.setVisibility(i);
    }

    public final void A03(boolean z, boolean z2) {
        View view;
        Integer num;
        int intValue;
        int i = 8;
        if (z) {
            FragmentActivity fragmentActivity = this.A0I;
            RectF rectF = AbstractC13880nE.A01;
            if ((fragmentActivity.getResources().getConfiguration().orientation != 1 || (fragmentActivity.getResources().getConfiguration().screenLayout & 15) != 1) && ((num = this.A07) == null || this.A05 != EnumC53319Nhv.A08 || this.A00 != 0 || ((intValue = num.intValue()) != 3 && intValue != 4 && intValue != 2))) {
                this.A0D.setVisibility(0);
                view = this.A0P;
                if (this.A05 == EnumC53319Nhv.A08 && z2) {
                    i = 0;
                }
                view.setVisibility(i);
                A02(this);
            }
        }
        view = this.A0D;
        view.setVisibility(i);
        A02(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0078, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r35, 0), r35, 36312999300826720L) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C55136Oc4(android.view.View r25, android.view.ViewStub r26, android.view.ViewStub r27, android.view.ViewStub r28, android.widget.TextView r29, android.widget.TextView r30, android.widget.TextView r31, android.widget.TextView r32, androidx.fragment.app.FragmentActivity r33, X.InterfaceC11380iw r34, com.instagram.common.session.UserSession r35, X.InterfaceC58305Psx r36, X.PHA r37, X.EnumC53319Nhv r38, java.lang.Boolean r39, java.lang.Integer r40, java.lang.String r41, java.lang.String r42, int r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51) {
        /*
            r24 = this;
            r4 = r24
            r4.<init>()
            r3 = 0
            r4.A09 = r3
            r2 = 1
            r4.A0B = r2
            r4.A0A = r2
            r9 = r33
            r4.A0I = r9
            r10 = r34
            r4.A0J = r10
            r11 = r35
            r4.A0K = r11
            r15 = r41
            r4.A0M = r15
            r0 = r36
            r4.A0L = r0
            r7 = r25
            r4.A0D = r7
            r0 = r29
            r4.A0G = r0
            r0 = r30
            r4.A0P = r0
            r5 = r32
            r4.A0H = r5
            r0 = r26
            r4.A0E = r0
            r6 = r27
            r4.A0F = r6
            r0 = r28
            r4.A0O = r0
            r0 = r38
            r4.A05 = r0
            r0 = r43
            r4.A00 = r0
            r0 = r46
            r4.A08 = r0
            r0 = r40
            r4.A07 = r0
            r0 = r39
            r4.A06 = r0
            X.OWJ r0 = X.OWJ.A00
            r1 = r42
            boolean r0 = r0.A01(r11, r1, r3)
            r4.A09 = r0
            r0 = r48
            r4.A0B = r0
            r0 = r49
            r4.A0A = r0
            java.lang.Integer r13 = X.C05F.A01
            if (r51 != 0) goto L7a
            if (r50 == 0) goto L7a
            X.0Tz r8 = X.AbstractC25225BEi.A0j(r11, r3)
            r0 = 36312999300826720(0x81027b000e0660, double:3.027825206329956E-306)
            boolean r0 = X.C18U.A06(r8, r11, r0)
            r23 = 1
            if (r0 != 0) goto L7c
        L7a:
            r23 = 0
        L7c:
            r14 = 0
            X.EPe r8 = new X.EPe
            r12 = r37
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r21 = r3
            r22 = r2
            r20 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.A04 = r8
            r0 = 56
            X.Ok3.A00(r7, r0, r4)
            if (r44 != 0) goto L9d
            r3 = 8
        L9d:
            r0 = r31
            r0.setVisibility(r3)
            r0 = 57
            X.Ok3.A00(r5, r0, r4)
            r0 = r47
            r4.A03(r2, r0)
            X.LQo r0 = new X.LQo
            r0.<init>(r2, r10, r4)
            r6.setOnInflateListener(r0)
            r0 = r45
            r4.A0N = r0
            if (r45 == 0) goto Lc8
            android.view.ViewStub r3 = r4.A0F
            X.Nhv r2 = r4.A05
            X.Nhv r1 = X.EnumC53319Nhv.A08
            r0 = 8
            if (r2 != r1) goto Lc5
            r0 = 0
        Lc5:
            r3.setVisibility(r0)
        Lc8:
            A01(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55136Oc4.<init>(android.view.View, android.view.ViewStub, android.view.ViewStub, android.view.ViewStub, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.Psx, X.PHA, X.Nhv, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
