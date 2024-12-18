package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

/* renamed from: X.8Mi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185888Mi implements InterfaceC13000lm {
    public final InterfaceC19630xq A00;
    public final HashMap A01;

    public C185888Mi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A2x);
        this.A00 = A03;
        this.A01 = new HashMap();
        long j = A03.getLong("last_clear_cache_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j > 604800000) {
            InterfaceC19610xo ARD = this.A00.ARD();
            ARD.AHW();
            ARD.apply();
            InterfaceC19610xo ARD2 = A03.ARD();
            ARD2.E7G("last_clear_cache_time", currentTimeMillis);
            ARD2.apply();
        }
    }

    public final AAL A00(String str) {
        C14360o3.A0B(str, 0);
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(str)) {
            return (AAL) hashMap.get(str);
        }
        AAL aal = null;
        try {
            String string = this.A00.getString(str, "not_found");
            if ("not_found".equals(string)) {
                return null;
            }
            aal = A1H.parseFromJson(C16V.A00(string));
            return aal;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing json parameters ");
            sb.append(e);
            C0w9.A03("SmartTrackingDataStore", sb.toString());
            return aal;
        }
    }

    public final void A01(AAL aal) {
        this.A01.put(aal.A02, aal);
        try {
            InterfaceC19610xo ARD = this.A00.ARD();
            String str = aal.A02;
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            String str2 = aal.A02;
            if (str2 != null) {
                A0A.A0S("file_path", str2);
            }
            A0A.A0Q(IgReactMediaPickerNativeModule.WIDTH, aal.A01);
            A0A.A0Q(IgReactMediaPickerNativeModule.HEIGHT, aal.A00);
            if (aal.A06 != null) {
                C16V.A03(A0A, "time_stamps");
                for (Number number : aal.A06) {
                    if (number != null) {
                        A0A.A0h(number.intValue());
                    }
                }
                A0A.A0Z();
            }
            if (aal.A05 != null) {
                C16V.A03(A0A, "saliency_list");
                for (A7X a7x : aal.A05) {
                    if (a7x != null) {
                        AE5.A00(A0A, a7x);
                    }
                }
                A0A.A0Z();
            }
            if (aal.A03 != null) {
                C16V.A03(A0A, "body_tracking_list");
                for (A7X a7x2 : aal.A03) {
                    if (a7x2 != null) {
                        AE5.A00(A0A, a7x2);
                    }
                }
                A0A.A0Z();
            }
            if (aal.A04 != null) {
                C16V.A03(A0A, "final_tracking_list");
                for (A7X a7x3 : aal.A04) {
                    if (a7x3 != null) {
                        AE5.A00(A0A, a7x3);
                    }
                }
                A0A.A0Z();
            }
            if (aal.A07 != null) {
                C16V.A03(A0A, "transform_matrices");
                for (C22856A5z c22856A5z : aal.A07) {
                    if (c22856A5z != null) {
                        A0A.A0d();
                        C16V.A03(A0A, "transform_matrices");
                        for (Number number2 : c22856A5z.A00) {
                            if (number2 != null) {
                                A0A.A0g(number2.floatValue());
                            }
                        }
                        A0A.A0Z();
                        A0A.A0a();
                    }
                }
                A0A.A0Z();
            }
            A0A.A0a();
            A0A.close();
            ARD.E7K(str, stringWriter.toString());
            ARD.apply();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error setting json parameters ");
            sb.append(e);
            C0w9.A03("SmartTrackingDataStore", sb.toString());
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.AHW();
        ARD.apply();
    }
}
