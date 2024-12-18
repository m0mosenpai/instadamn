package X;

import android.content.Intent;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider;
import com.facebook.smartcapture.logging.CommonLoggingFields;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.resources.stringoverride.bloks.BloksStringOverrideFactory;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.S3r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62246S3r {
    /* JADX WARN: Type inference failed for: r0v38, types: [com.facebook.smartcapture.ui.IdCaptureUi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0ps, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        long j;
        long j2;
        EnumC61111RfR enumC61111RfR;
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 3);
        Object obj = list.get(1);
        if (obj instanceof Number) {
            j = AbstractC166987dD.A0N(obj);
        } else {
            j = 0;
        }
        String valueOf = String.valueOf(j);
        SmartCaptureLogger smartCaptureLogger = new IgSmartCaptureLoggerProvider(A0B).get(A04);
        Parcelable.Creator creator = CommonLoggingFields.CREATOR;
        EnumC61146Rg7 enumC61146Rg7 = EnumC61146Rg7.A03;
        C14360o3.A0A(A0s);
        smartCaptureLogger.setCommonFields(new CommonLoggingFields(enumC61146Rg7, "v2_id", A0s, valueOf, null, valueOf));
        R7Y r7y = new R7Y(C6BQ.A04(c6fq), C6BQ.A0B(c6fq), null, AbstractC31173DnH.A0s(list, 3), null, null);
        smartCaptureLogger.logEvent("bloks_action_called");
        try {
            Object obj2 = list.get(1);
            if (obj2 instanceof Number) {
                j2 = AbstractC166987dD.A0N(obj2);
            } else {
                j2 = 0;
            }
            Object A00 = c6fw.A00();
            AbstractC25225BEi.A1S(A00);
            String str = (String) A00;
            if (str == null) {
                enumC61111RfR = EnumC61111RfR.A00;
            } else {
                try {
                    enumC61111RfR = EnumC61111RfR.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    enumC61111RfR = EnumC61111RfR.A00;
                }
            }
            String A0s2 = AbstractC31173DnH.A0s(list, 3);
            InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 4);
            InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 5);
            C102884kP c102884kP = (C102884kP) c6fw.A03(6);
            C14360o3.A0A(c102884kP);
            boolean A0S = c102884kP.A0S(35, true);
            boolean A0U = c102884kP.A0U(false);
            boolean A0S2 = c102884kP.A0S(36, false);
            String A0L = c102884kP.A0L(44);
            boolean A0S3 = c102884kP.A0S(45, false);
            ?? obj3 = new Object();
            int i = 0;
            while (true) {
                SparseArray sparseArray = c102884kP.A06;
                if (i < sparseArray.size()) {
                    Object valueAt = sparseArray.valueAt(i);
                    if (valueAt != null && sparseArray.keyAt(i) == 40) {
                        obj3.A00 = new BloksStringOverrideFactory((Map) valueAt);
                        break;
                    }
                    i++;
                } else {
                    C103054kg A002 = AbstractC103044kf.A00();
                    EnumC103014kc enumC103014kc = (EnumC103014kc) AbstractC103024kd.A02.get();
                    if (enumC103014kc == null) {
                        enumC103014kc = EnumC103014kc.A03;
                    }
                    if (A002 != null && enumC103014kc != EnumC103014kc.A04) {
                        SparseArray sparseArray2 = (SparseArray) c102884kP.A07.A00();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= sparseArray2.size()) {
                                break;
                            }
                            int keyAt = sparseArray2.keyAt(i2);
                            Object A01 = AbstractC103044kf.A01(enumC103014kc, A002, new Q0N(c102884kP, keyAt));
                            if (A01 == null || keyAt != 40) {
                                i2++;
                            } else {
                                obj3.A00 = new BloksStringOverrideFactory((Map) A01);
                                break;
                            }
                        }
                    }
                }
            }
            StringOverrideFactory stringOverrideFactory = (StringOverrideFactory) obj3.A00;
            C14360o3.A0A(A0s2);
            AbstractC167017dG.A1R(enumC61111RfR, A0s2);
            String valueOf2 = String.valueOf(j2);
            C14360o3.A0B(valueOf2, 0);
            r7y.A0D = valueOf2;
            r7y.A03 = enumC61111RfR;
            r7y.A01 = j2;
            r7y.A0E = A0s2;
            r7y.A0K = A0U;
            r7y.A0J = A0S2;
            r7y.A0I = A0S3;
            if (stringOverrideFactory != null) {
                r7y.A08 = stringOverrideFactory;
            }
            if (C14360o3.A0K(A0L, "XMDS")) {
                Integer num = C05F.A01;
                C14360o3.A0B(num, 0);
                r7y.A0A = num;
                r7y.A00 = R.style.IgSmartCaptureTheme_XMDS;
                r7y.A09 = new Object();
            }
            if (A0S) {
                r7y.A05 = null;
            }
            Intent A003 = r7y.A00();
            C6FG c6fg = c6fq.A03;
            C14360o3.A0A(c6fg);
            C62900SWg c62900SWg = new C62900SWg(c6fg, c6fq, A0I);
            C14360o3.A0A(c6fg);
            SG0 sg0 = new SG0(c6fg, c6fq, A0t);
            FragmentActivity A03 = C6BQ.A03(C6BQ.A09(c6fq));
            C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.base.activity.IgFragmentActivity");
            IgFragmentActivity igFragmentActivity = (IgFragmentActivity) A03;
            igFragmentActivity.registerOnActivityResultListener(new C64475TFl(1, sg0, c62900SWg, igFragmentActivity));
            C12260kU.A08(C6BQ.A03(C6BQ.A09(c6fq)), A003, 41261);
            return null;
        } catch (Throwable th) {
            smartCaptureLogger.logError("OpenIdCapture call failed", th);
            throw th;
        }
    }
}
