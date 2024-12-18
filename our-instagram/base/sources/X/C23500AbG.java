package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AbG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23500AbG implements MediaEffect {
    public String A00;

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final boolean CSs() {
        return true;
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final boolean Ej4() {
        return false;
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final void FA2(MediaEffect mediaEffect) {
        C14360o3.A0B(mediaEffect, 0);
        this.A00 = ((C23500AbG) mediaEffect).A00;
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final JSONObject EqN() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", "CTVoiceEffect");
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("userParameterValue", Float.valueOf(0.9f));
        } catch (JSONException unused2) {
        }
        try {
            jSONObject.put("effectFromJsonPath", this.A00);
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final String toString() {
        return AbstractC166987dD.A19(EqN());
    }
}
