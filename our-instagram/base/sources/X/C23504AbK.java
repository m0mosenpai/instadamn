package X;

import android.graphics.RectF;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AbK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23504AbK implements MediaEffect {
    public final EnumC222969sb A00;
    public final InterfaceC179077xJ A01;

    public C23504AbK(EnumC222969sb enumC222969sb, InterfaceC179077xJ interfaceC179077xJ) {
        C14360o3.A0B(interfaceC179077xJ, 1);
        this.A01 = interfaceC179077xJ;
        this.A00 = enumC222969sb;
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final void FA2(MediaEffect mediaEffect) {
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final boolean CSs() {
        InterfaceC179077xJ interfaceC179077xJ = this.A01;
        if (interfaceC179077xJ instanceof C199748sQ) {
            C199748sQ c199748sQ = (C199748sQ) interfaceC179077xJ;
            Iterator it = c199748sQ.A05.iterator();
            while (it.hasNext()) {
                C22909A8f c22909A8f = (C22909A8f) c199748sQ.A02.get(AbstractC167007dF.A0B(it));
                if (c22909A8f != null) {
                    boolean z = false;
                    if (c22909A8f.A00 != null) {
                        z = true;
                    }
                    if (!z) {
                        RectF rectF = c22909A8f.A01;
                        RectF rectF2 = C199748sQ.A06;
                        if (rectF.equals(rectF2) && c22909A8f.A02.equals(rectF2)) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final boolean Ej4() {
        return !(this.A01 instanceof C199748sQ);
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final JSONObject EqN() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", "MediaGraphMediaEffect");
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("mediaEffectType", this.A00);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
