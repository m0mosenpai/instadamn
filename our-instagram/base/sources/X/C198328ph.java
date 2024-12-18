package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198328ph implements InterfaceC1819785h {
    public InterfaceC199648sG A00;
    public final C2GS A01;
    public final AnonymousClass830 A02;
    public final InterfaceC149836oc A03;
    public final C1815283f A04;
    public final UserSession A05;

    public C198328ph(Context context, AnonymousClass830 anonymousClass830, C1815283f c1815283f, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1815283f, 3);
        C14360o3.A0B(anonymousClass830, 4);
        this.A05 = userSession;
        this.A04 = c1815283f;
        this.A02 = anonymousClass830;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A03 = C149816oa.A00(applicationContext, EnumC142606cM.A01, AbstractC149806oZ.A00(userSession), new C198338pi(this), userSession);
        this.A01 = new C2GS();
    }

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    @Override // X.InterfaceC1819785h
    public final void EFw(C83L c83l) {
        C14360o3.A0B(c83l, 0);
        InterfaceC199648sG interfaceC199648sG = this.A00;
        if (interfaceC199648sG != null) {
            interfaceC199648sG.EFw(c83l);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC1819785h
    public final void A9d(C83L c83l) {
        InterfaceC199648sG interfaceC199648sG = this.A00;
        if (interfaceC199648sG != null) {
            interfaceC199648sG.A9d(c83l);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }

    @Override // X.InterfaceC1819785h
    public final C200558ty AXl() {
        return (C200558ty) this.A01.A02();
    }

    @Override // X.InterfaceC1819785h
    public final EffectAttribution B0P() {
        InterfaceC199648sG interfaceC199648sG = this.A00;
        if (interfaceC199648sG != null) {
            return interfaceC199648sG.B0P();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC1819785h
    public final boolean CLr() {
        C142626cO B0c;
        InterfaceC149836oc interfaceC149836oc = this.A03;
        if (interfaceC149836oc != null && (B0c = interfaceC149836oc.B0c()) != null && B0c.A01(this.A05)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1819785h
    public final void EJf() {
        InterfaceC199648sG interfaceC199648sG = this.A00;
        if (interfaceC199648sG != null) {
            interfaceC199648sG.EJb();
            return;
        }
        throw new IllegalStateException("ARRenderer has not been set!");
    }

    @Override // X.InterfaceC1819785h
    public final void EP5(C200558ty c200558ty) {
        this.A01.A0A(c200558ty);
        c200558ty.A02 = this.A02;
    }

    @Override // X.InterfaceC1819785h
    public final void ETb(CameraAREffect cameraAREffect) {
        if (cameraAREffect != null && this.A00 == null) {
            throw new IllegalStateException("ARRenderer has not been set!");
        }
        InterfaceC199648sG interfaceC199648sG = this.A00;
        if (interfaceC199648sG != null) {
            interfaceC199648sG.EP4(cameraAREffect);
        }
    }

    @Override // X.InterfaceC1819785h
    public final void AVt(int i, int i2) {
        String str;
        C200558ty AXl = AXl();
        if (AXl != null) {
            C1814983c c1814983c = AXl.A0C;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put(AbstractC111324zv.A00(1169), i);
                jSONObject.put("total_media_duration", i2);
                jSONObject2.put("playback_info", jSONObject);
                C1814983c.A00(c1814983c, jSONObject2);
            } catch (JSONException e) {
                if (e.getMessage() != null) {
                    str = e.getMessage();
                } else {
                    str = "";
                }
                AbstractC12120kG.A01("PlatformEventsController::fireVideoPlaybackInfoEvent", str);
            }
        }
    }

    @Override // X.InterfaceC1819785h
    public final void EP6(InterfaceC199648sG interfaceC199648sG) {
        this.A00 = interfaceC199648sG;
    }
}
