package X;

import com.facebook.breakpad.BreakpadManager;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6q8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150556q8 implements InterfaceC150566q9 {
    public static final C150576qA A0B = new Object();
    public C83U A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final XAnalyticsHolder A07;
    public final InterfaceC11360iu A08;
    public final C12250kT A09;
    public final AbstractC12990ll A0A;

    public C150556q8(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A0A = abstractC12990ll;
        this.A08 = AbstractC11060iN.A00(abstractC12990ll);
        C12250kT c12250kT = new C12250kT(null, abstractC12990ll, "IgXAnalyticsAdapter");
        this.A09 = c12250kT;
        this.A07 = new XAnalyticsAdapterHolder(c12250kT);
    }

    @Override // X.InterfaceC150566q9
    public final void DQM(String str, String str2) {
        C14360o3.A0B(str, 0);
        if (this.A01 == null) {
            C0w9.A03("AREngineServices::CameraARAnalyticsLogger::onLoggedRawEvent", "Log before product information is set.");
            return;
        }
        C19280xC A01 = C19280xC.A01(str, null);
        A01.A0C("camera_product_name", this.A01);
        A01.A0C("product_session_id", this.A06);
        A01.A0C("effect_id", this.A03);
        A01.A0C("effect_instance_id", this.A04);
        A01.A0C("delivery_operation_id", this.A02);
        A01.A0C("effect_session_id", this.A05);
        AbstractC12990ll abstractC12990ll = this.A0A;
        if (abstractC12990ll instanceof UserSession) {
            String str3 = ((UserSession) abstractC12990ll).token;
            int A04 = AbstractC001900j.A04(str3, ':', 0);
            if (A04 != -1) {
                str3 = str3.substring(A04 + 1);
                C14360o3.A07(str3);
            }
            A01.A0C("ig_userid", str3);
        }
        if (str2 != null) {
            try {
                A01.A04(C150576qA.A00(A0B, new JSONObject(str2)));
            } catch (JSONException e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                C0w9.A03("AREngineServices::CameraARAnalyticsLogger::onLoggedRawEvent", message);
            }
        }
        this.A08.EHW(A01);
    }

    @Override // X.InterfaceC150566q9
    public final void EW7(EnumC150616qF enumC150616qF, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        this.A01 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A05 = str5;
        this.A06 = str6;
        C83U c83u = this.A00;
        if (c83u != null) {
            c83u.CuF(str5);
        }
    }

    @Override // X.InterfaceC150566q9
    public final String BhE() {
        String str = this.A01;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC150566q9
    public final XAnalyticsHolder CI2() {
        return this.A07;
    }

    @Override // X.InterfaceC150566q9
    public final void DQN(boolean z) {
        boolean isActive = BreakpadManager.isActive();
        if (z) {
            if (isActive) {
                BreakpadManager.setCustomData("CAMERA_CORE_PRODUCT_NAME", this.A01, new Object[0]);
                BreakpadManager.setCustomData("CAMERA_CORE_EFFECT_ID", this.A03, new Object[0]);
                BreakpadManager.setCustomData("CAMERA_CORE_EFFECT_INSTANCE_ID", this.A04, new Object[0]);
            }
            DQM("camera_ar_session", null);
            return;
        }
        if (!isActive) {
            return;
        }
        BreakpadManager.removeCustomData("CAMERA_CORE_PRODUCT_NAME");
        BreakpadManager.removeCustomData("CAMERA_CORE_EFFECT_ID");
        BreakpadManager.removeCustomData("CAMERA_CORE_EFFECT_INSTANCE_ID");
    }

    @Override // X.InterfaceC150566q9
    public final void Edm(C83U c83u) {
        this.A00 = c83u;
    }
}
