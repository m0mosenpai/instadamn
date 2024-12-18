package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.browser.lite.webview.SystemWebView;
import com.instagram.common.session.UserSession;
import com.meta.foa.session.FoaUserSession;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class QE7 extends QEF {
    public C5G6 A00;
    public C63380Siu A01;
    public C62694SMi A02;

    @Override // X.C0SG, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C61602RqR A08;
        C51756Mtf c51756Mtf;
        FoaUserSession foaUserSession;
        UserSession A00;
        R7V r7v;
        List A12;
        Object obj;
        C51760Mtj c51760Mtj;
        C14360o3.A0B(dialogInterface, 0);
        C63380Siu c63380Siu = this.A01;
        if (c63380Siu != null) {
            C63380Siu.A02(c63380Siu, null);
            C5G6 c5g6 = c63380Siu.A0Q;
            C62620SJd c62620SJd = c5g6.A00;
            Integer num = C05F.A00;
            C14360o3.A0B(c62620SJd, 0);
            QIh qIh = c62620SJd.A09;
            String str = qIh.A01;
            Integer num2 = null;
            if (str != null && (A12 = AbstractC43592JPx.A12(str, (Map) c62620SJd.A0L.A02)) != null) {
                ListIterator A14 = AbstractC43592JPx.A14(A12);
                while (true) {
                    if (A14.hasPrevious()) {
                        obj = A14.previous();
                        C50627MWo c50627MWo = (C50627MWo) obj;
                        C51760Mtj c51760Mtj2 = (C51760Mtj) c50627MWo.A01;
                        if (c51760Mtj2.A00 == num && c51760Mtj2.A02 == num && c50627MWo.A00 == C05F.A01) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C50627MWo c50627MWo2 = (C50627MWo) obj;
                if (c50627MWo2 != null && (c51760Mtj = (C51760Mtj) c50627MWo2.A01) != null) {
                    num2 = (Integer) c51760Mtj.A01;
                }
            }
            String str2 = "DECLINED_AUTOFILL";
            if (num2 != null && num2 == num) {
                C61602RqR A082 = c63380Siu.A08("DECLINED_AUTOFILL");
                A082.A0H = "CONTACT_AUTOFILL";
                C58883QEt c58883QEt = c63380Siu.A03;
                AbstractC63223SfY.A04(c58883QEt, A082);
                AbstractC63402SjX.A0B(c5g6, c58883QEt, A082);
                return;
            }
            c62620SJd.A0M.A00 = C05F.A0N;
            C63380Siu.A01(c63380Siu);
            qIh.A00++;
            if (c62620SJd.A0K.A00 == EnumC61149RgA.A03) {
                AbstractC63402SjX.A0C(c5g6, c63380Siu, c63380Siu.A08("NOT_NOW_CLICK"));
                str2 = "DECLINED_PREFETCH";
            }
            if (num2 != null) {
                String A002 = SQk.A00(num2);
                A08 = c63380Siu.A08(str2);
                A08.A0H = A002;
            } else {
                A08 = c63380Siu.A08(str2);
            }
            C58883QEt c58883QEt2 = c63380Siu.A03;
            AbstractC63223SfY.A04(c58883QEt2, A08);
            AbstractC63402SjX.A0B(c5g6, c58883QEt2, A08);
            QF6 qf6 = c63380Siu.A06;
            Context context = ((AbstractC63223SfY) c58883QEt2).A00;
            UserSession userSession = c5g6.A04.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C14360o3.A0K(AbstractC58320PtC.A0y(c06090Tz, userSession), "PERSISTENT") && AbstractC63232Sfk.A03(c62620SJd) && qf6 != null && (r7v = ((SystemWebView) qf6).A04) != null) {
                r7v.postDelayed(new TNE(r7v, context), 200L);
            }
            if (context == null) {
                return;
            }
            String A04 = C18U.A04(c06090Tz, userSession, 36885750375383735L);
            C14360o3.A0A(A04);
            if (A04.length() == 0 || C1VN.A00 == null || (c51756Mtf = c62620SJd.A02) == null || (foaUserSession = (FoaUserSession) c51756Mtf.A00) == null || (A00 = AbstractC28057CYl.A00(foaUserSession)) == null) {
                return;
            }
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            A1I.put("autofill_type", "payment_info");
            A1I.put(AbstractC58347Ptn.A00(9, 10, 87), AnonymousClass001.A0T(qIh.A05, c62620SJd.A06.A05, ','));
            C1VN c1vn = C1VN.A00;
            if (c1vn == null) {
                return;
            }
            c1vn.A01((Activity) context, A00, A04, A1I);
        }
    }

    @Override // X.QEF, X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1401173168);
        if (bundle != null) {
            A07();
        }
        super.onCreate(bundle);
        C0f9.A09(-839175257, A02);
    }
}
