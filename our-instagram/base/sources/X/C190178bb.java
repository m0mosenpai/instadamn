package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190178bb implements MediaEffect {
    public float A00;

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final boolean CSs() {
        return true;
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final boolean Ej4() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && Float.compare(((C190178bb) obj).A00, this.A00) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new float[]{this.A00});
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final JSONObject EqN() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", "CTAudioEffect");
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("processingAmount", Float.valueOf(this.A00));
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final void FA2(MediaEffect mediaEffect) {
        this.A00 = ((C190178bb) mediaEffect).A00;
    }

    public final String toString() {
        return EqN().toString();
    }
}
