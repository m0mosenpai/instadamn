package X;

import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.83c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1814983c implements InterfaceC1815083d {
    public C199618sD A00;
    public InterfaceC25165BBl A01;
    public C172017lW A02;
    public C172007lV A03;
    public C83I A04;
    public final UserSession A05;
    public final C1814883b A06;

    public static void A00(C1814983c c1814983c, JSONObject jSONObject) {
        C1814883b c1814883b = c1814983c.A06;
        if (c1814883b == null) {
            AbstractC12120kG.A01("PlatformEventsController", "firePlatformEvents() mPlatformEventsInput is null");
        } else {
            c1814883b.A00(jSONObject);
        }
    }

    @Override // X.InterfaceC1815083d
    public final void APG(JSONObject jSONObject) {
        String str;
        C172017lW c172017lW;
        C172007lV c172007lV;
        String str2;
        String str3;
        try {
            if (jSONObject.has("log")) {
                jSONObject.getString("log");
            }
            if (jSONObject.has("requestUserName")) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("user_name", C17060sy.A01.A01(this.A05).getUsername());
                    A00(this, jSONObject2);
                } catch (JSONException e) {
                    if (e.getMessage() != null) {
                        str3 = e.getMessage();
                    } else {
                        str3 = "";
                    }
                    AbstractC12120kG.A01("PlatformEventsController::onReceiveRequestUserNameEvent", str3);
                }
            }
            if (jSONObject.has("requestPlatform")) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("platform", "android");
                    A00(this, jSONObject3);
                } catch (JSONException e2) {
                    if (e2.getMessage() != null) {
                        str2 = e2.getMessage();
                    } else {
                        str2 = "";
                    }
                    AbstractC12120kG.A01("PlatformEventsController::onReceiveRequestPlatformEvent", str2);
                }
            }
            if (jSONObject.has("effect_ready") && !jSONObject.isNull("effect_ready")) {
                jSONObject.getString("effect_ready");
            }
            if (jSONObject.has("avatar-event") && (c172007lV = this.A03) != null) {
                try {
                    String string = jSONObject.getString("avatar-event");
                    if (string != null) {
                        if (string.equals("create-avatar") && C20Y.A00(c172007lV.A01).A01.A00 != C125535lz.A00) {
                            C11T.A02(new RunnableC24338Aqh(c172007lV));
                        }
                    }
                } catch (JSONException e3) {
                    C0K8.A0G("AvatarEventHandler", "Error in reading values from JSONObject", e3);
                }
            }
            if (jSONObject.has("show-ai-disclaimer") && (c172017lW = this.A02) != null) {
                try {
                    if (jSONObject.getBoolean("show-ai-disclaimer")) {
                        C11T.A02(new RunnableC24335Aqe(c172017lW));
                    }
                } catch (JSONException e4) {
                    C0K8.A0G("AiCharacterEventHandler", "Error in reading values from JSONObject", e4);
                }
            }
            if (this.A04 != null) {
                jSONObject.has("hasForeground");
            }
            InterfaceC25165BBl interfaceC25165BBl = this.A01;
            if (interfaceC25165BBl != null) {
                interfaceC25165BBl.DEa(jSONObject);
            }
        } catch (JSONException e5) {
            if (e5.getMessage() != null) {
                str = e5.getMessage();
            } else {
                str = "";
            }
            AbstractC12120kG.A01("PlatformEventsController::didReceiveEngineEvent", str);
        }
    }

    public C1814983c(C1814883b c1814883b, UserSession userSession) {
        this.A05 = userSession;
        this.A06 = c1814883b;
    }
}
