package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AbH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23501AbH implements MediaEffect {
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
    public final JSONObject EqN() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", "FbaAudioEffect");
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("path", this.A00);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final void FA2(MediaEffect mediaEffect) {
        this.A00 = ((C23501AbH) mediaEffect).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((C23501AbH) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return EqN().toString();
    }
}
