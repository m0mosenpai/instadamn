package X;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ibi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41650Ibi {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object obj;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C6FG c6fg = (C6FG) A032;
        Object A033 = c6fw.A03(2);
        C14360o3.A0C(A033, AbstractC111324zv.A00(8));
        List list = (List) A033;
        int A0D = AbstractC25230BEn.A0D(c6fw.A03(3), AbstractC111324zv.A00(488));
        Object A034 = c6fw.A03(4);
        AbstractC25225BEi.A1S(A034);
        String str = (String) A034;
        List list2 = c6fw.A00;
        if (list2.size() >= 6 && (obj = list2.get(5)) != null) {
            C6WF.A00 = new IEF(c6fq, ((C1344465q) obj).A00);
            C6BQ.A0K(c6fq, new C37341Gcj(0));
        }
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        View A05 = c102884kP.A05(c6fq.A03);
        int[] iArr = new int[2];
        if (A05 != null) {
            A05.getLocationOnScreen(iArr);
        }
        float f = iArr[0];
        float f2 = iArr[1];
        RectF rectF = new RectF(f, f2, f, f2);
        if (A0D == Integer.parseInt("49")) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object A01 = A01(userSession, C05F.A00, AbstractC166987dD.A1B(it));
                if (A01 != null) {
                    A1E.add(A01);
                }
            }
            Reel reel = (Reel) A01(userSession, C05F.A00, str);
            C38E c38e = new C38E(C6BQ.A07(c6fg), userSession, AbstractC37301Gc2.A0L(C6BQ.A00(c6fg)));
            C31559Dtj c31559Dtj = new C31559Dtj(C6BQ.A03(c6fg), rectF, new C42788IwQ(0));
            C56553P8z c56553P8z = new C56553P8z(rectF, 0);
            C14360o3.A0B(c6fg, 0);
            c38e.A0C = (String) c6fg.A00(R.id.bloks_reel_tray_session_id);
            c38e.A05 = c31559Dtj;
            if (reel != null) {
                c38e.A07(reel, C3G2.A06, c56553P8z, A1E, A1E, 0);
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            if (A0D == Integer.parseInt("65")) {
                C6BQ.A07(c6fg);
                ArrayList A1E2 = AbstractC166987dD.A1E();
                ArrayList A1E3 = AbstractC166987dD.A1E();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C40971v4 c40971v4 = (C40971v4) A01(userSession, C05F.A01, AbstractC166987dD.A1B(it2));
                    if (c40971v4 != null) {
                        A1E2.add(c40971v4);
                        A1E3.add(C128085qc.A03(c40971v4));
                    }
                }
                C40971v4 c40971v42 = (C40971v4) A01(userSession, C05F.A01, str);
                if (c40971v42 != null) {
                    A02(C6BQ.A03(c6fg), userSession, c40971v42, C1M3.A00(), A1E3, true);
                    return null;
                }
                throw AbstractC166997dE.A0g();
            }
            if (A0D == Integer.parseInt("94")) {
                FragmentActivity A035 = C6BQ.A03(c6fg);
                ArrayList A1E4 = AbstractC166987dD.A1E();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C40971v4 c40971v43 = (C40971v4) A01(userSession, C05F.A0C, AbstractC166987dD.A1B(it3));
                    if (c40971v43 != null) {
                        A1E4.add(C128085qc.A03(c40971v43));
                    }
                }
                C40971v4 c40971v44 = (C40971v4) A01(userSession, C05F.A0C, str);
                C1M0 A00 = C1M3.A00();
                C14360o3.A0A(c40971v44);
                A02(A035, userSession, c40971v44, A00, A1E4, false);
                return null;
            }
        }
        return null;
    }

    public static final Object A01(UserSession userSession, Integer num, String str) {
        C38321qM A0x;
        try {
            C16L A03 = AbstractC221915u.A00.A03(str);
            C07880b8 c07880b8 = C07950bF.A04;
            C14360o3.A0A(A03);
            C07950bF A00 = C07880b8.A00(A03, userSession);
            if (A00.A11() == null) {
                A00.A1J();
            }
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    C38252Grv parseFromJson = AbstractC38251Gru.parseFromJson(A00);
                    C14360o3.A07(parseFromJson);
                    return parseFromJson.A01();
                }
                C41162IKb parseFromJson2 = I1Q.parseFromJson(A00);
                C14360o3.A07(parseFromJson2);
                if (!parseFromJson2.A0A.isEmpty() && (A0x = AbstractC25225BEi.A0x(parseFromJson2.A0A, 0)) != null) {
                    AbstractC40901ux abstractC40901ux = new AbstractC40901ux();
                    abstractC40901ux.A0L = A0x;
                    abstractC40901ux.A0g = parseFromJson2.A05;
                    abstractC40901ux.A0q = Collections.unmodifiableList(parseFromJson2.A0B);
                    abstractC40901ux.A0l = parseFromJson2.A07;
                    abstractC40901ux.A0b = parseFromJson2.A03;
                    abstractC40901ux.A00 = ImmutableList.copyOf((Collection) parseFromJson2.A09);
                    abstractC40901ux.A0Z = parseFromJson2.A02;
                    abstractC40901ux.A0m = Collections.unmodifiableList(parseFromJson2.A08);
                    abstractC40901ux.A0h = parseFromJson2.A06;
                    abstractC40901ux.A00();
                    return new C40971v4(abstractC40901ux);
                }
                throw AbstractC166997dE.A0g();
            }
            C37771pE parseFromJson3 = AbstractC38741r6.parseFromJson(A00);
            if (parseFromJson3 == null) {
                return null;
            }
            return ReelStore.A03(userSession).A0I(parseFromJson3, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, C40971v4 c40971v4, C1M0 c1m0, List list, boolean z) {
        String str;
        C38321qM c38321qM;
        String str2 = c1m0.A00;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A06, userSession);
        if (c40971v4 != null && (c38321qM = c40971v4.A0K) != null) {
            str = c38321qM.getId();
        } else {
            str = null;
        }
        c116875Qr.A1D = str;
        c116875Qr.A1G = str2;
        c116875Qr.A1S = z;
        c116875Qr.A1N = false;
        c116875Qr.A1d = false;
        ClipsViewerConfig A00 = c116875Qr.A00();
        C62832tM A002 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A002);
        A002.A02(str2);
        A002.A08(str2, list, false, false);
        C77453dV.A06(fragmentActivity, A00, userSession, 1005);
    }
}
