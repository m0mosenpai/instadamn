package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AbJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23503AbJ implements MediaEffect {
    public float A00;

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final boolean Ej4() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && Float.compare(((C23503AbJ) obj).A00, this.A00) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new float[]{this.A00});
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final boolean CSs() {
        return AbstractC167007dF.A1M((this.A00 > 1.0f ? 1 : (this.A00 == 1.0f ? 0 : -1)));
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final JSONObject EqN() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", "VolumeEffect");
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("volumedB", Float.valueOf(this.A00));
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final void FA2(MediaEffect mediaEffect) {
        this.A00 = ((C23503AbJ) mediaEffect).A00;
    }

    public final String toString() {
        return EqN().toString();
    }
}
