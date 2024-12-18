package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.IgTextureLoader;
import com.instagram.common.session.UserSession;

/* renamed from: X.8px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC198488px {
    public static final C198658qF A01(Context context, UserSession userSession, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C198508pz c198508pz;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36316233410285758L);
        if (z2) {
            c198508pz = new C198508pz(userSession, str);
        } else {
            c198508pz = null;
        }
        AssetManager assets = context.getAssets();
        C14360o3.A07(assets);
        return new C198658qF(A00(userSession), new C198548q3(assets, A06), null, c198508pz, -1, z4, C17280tP.A4E.A00().A0b(), false, z3, z);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.8q5] */
    public static final C198568q5 A00(UserSession userSession) {
        ?? obj = new Object();
        if (C18U.A06(C06090Tz.A05, userSession, 36322186234964016L)) {
            obj.A01 = true;
            InterfaceC198588q7 interfaceC198588q7 = obj.A00;
            if (interfaceC198588q7 != null && (interfaceC198588q7 instanceof IgTextureLoader)) {
                ((IgTextureLoader) interfaceC198588q7).tryGPULoading();
            }
        }
        return obj;
    }

    public static final C212469bF A02(Context context, UserSession userSession, Integer num) {
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36316233410285758L);
        AssetManager assets = context.getAssets();
        C14360o3.A07(assets);
        return new C212469bF(A00(userSession), new C198548q3(assets, A06), num, C17280tP.A4E.A00().A0b());
    }
}
