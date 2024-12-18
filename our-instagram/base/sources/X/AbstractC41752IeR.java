package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.IeR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41752IeR {
    public static boolean A00;

    public static void A02(Context context, InterfaceC63932vE interfaceC63932vE, C38497GwI c38497GwI, C42666IuN c42666IuN, C41232IMx c41232IMx, Object obj, boolean z) {
        A00 = false;
        H6V h6v = c41232IMx.A03;
        boolean A1X = AbstractC167007dF.A1X(h6v.A00, INLINE_SURVEY_QUESTION_TYPES.A05);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        LinearLayout linearLayout = c38497GwI.A02;
        A04(linearLayout, c41232IMx, c38497GwI.A01, z, false, true);
        String str = h6v.A03;
        str.getClass();
        interfaceC63932vE.Dce(str, c42666IuN.A00);
        C57012jc c57012jc = c38497GwI.A03;
        if (!A1X) {
            c57012jc.A03(8);
            IgdsButton igdsButton = c38497GwI.A06;
            if (igdsButton != null) {
                igdsButton.setVisibility(8);
            }
        } else {
            View A01 = c57012jc.A01();
            String str2 = c38497GwI.A01;
            if (!str2.equals("v2") && !str2.equals("v3")) {
                c57012jc.A03(0);
                AbstractC31173DnH.A19(context.getResources(), (TextView) c57012jc.A01(), 2131975038);
                c57012jc.A01().setActivated(c41232IMx.A01());
            } else {
                A01 = c38497GwI.A06;
                A01.setVisibility(0);
                A01.setEnabled(c41232IMx.A01());
            }
            C0fQ.A00(new ViewOnClickListenerC41994IjP(2, interfaceC63932vE, c38497GwI, obj, c41232IMx, c42666IuN), A01);
        }
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            C0fQ.A00(new ViewOnClickListenerC42013Iji(context, interfaceC63932vE, c38497GwI, c42666IuN, c41232IMx, obj, i2, A1X, z), linearLayout.getChildAt(i2));
        }
    }

    public static int A00(C41222IMn c41222IMn, C41009IEe c41009IEe, int i) {
        String BWt = c41009IEe.A01.BWt();
        if (BWt != null) {
            for (int i2 = 0; i2 < c41222IMn.A00(); i2++) {
                String str = c41222IMn.A01(i2).A03.A03;
                str.getClass();
                if (str.equals(BWt)) {
                    return i2;
                }
            }
        }
        return i;
    }

    public static View A01(ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.question_view);
        C38497GwI c38497GwI = new C38497GwI(A0A);
        c38497GwI.A01 = "v1";
        A0A.setTag(c38497GwI);
        return A0A;
    }

    public static void A03(Context context, InterfaceC63932vE interfaceC63932vE, C38497GwI c38497GwI, C41222IMn c41222IMn, C41232IMx c41232IMx, IMQ imq) {
        float f;
        Integer num;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        c38497GwI.A04.A02();
        LinearLayout linearLayout = c38497GwI.A02;
        linearLayout.setVisibility(0);
        H6W h6w = c41222IMn.A00;
        A04(linearLayout, c41232IMx, c38497GwI.A01, false, AbstractC167007dF.A1T(h6w.A03), false);
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            Object A0Y = AbstractC37302Gc3.A0Y(c41232IMx.A04, i2);
            View childAt = linearLayout.getChildAt(i2);
            C0fQ.A00(new ViewOnClickListenerC42009Ije(1, A0Y, context, c41232IMx, imq, c38497GwI, interfaceC63932vE, c41222IMn), childAt);
            if (imq.A03 == C05F.A0C && (num = h6w.A05) != null && num.intValue() != 0) {
                f = 0.5f;
                if (!imq.A06) {
                    childAt.setAlpha(f);
                }
            }
            f = 1.0f;
            childAt.setAlpha(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if (r10.A00 == com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES.A05) goto L35;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x00f2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(android.widget.LinearLayout r18, X.C41232IMx r19, java.lang.String r20, boolean r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41752IeR.A04(android.widget.LinearLayout, X.IMx, java.lang.String, boolean, boolean, boolean):void");
    }

    public static void A05(TextView textView, int i) {
        int i2;
        if (textView != null) {
            Context context = textView.getContext();
            if (context != null) {
                i2 = Math.round(i * context.getResources().getDisplayMetrics().density);
            } else {
                i2 = 0;
            }
            textView.setMinHeight(i2);
        }
    }
}
