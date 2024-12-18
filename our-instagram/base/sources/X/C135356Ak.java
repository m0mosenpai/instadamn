package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.ViewOutlineProvider;

/* renamed from: X.6Ak, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135356Ak extends AbstractC135366Al {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C126555nq c126555nq = (C126555nq) obj;
        C135296Ae c135296Ae = (C135296Ae) obj2;
        if (c135296Ae.A06 != null) {
            C131635wz c131635wz = (C131635wz) c126555nq;
            C131645x0 c131645x0 = c131635wz.A00;
            c131645x0.A04 = false;
            c131645x0.A0B.setLayerType(0, null);
            c131635wz.setElevation(0.0f);
            c131635wz.setClipToOutline(false);
            c131635wz.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            C135346Aj c135346Aj = c135296Ae.A07;
            C14360o3.A06(c135346Aj);
            c131635wz.setOutlineAmbientShadowColor(c135346Aj.A00);
            c131635wz.setOutlineSpotShadowColor(c135346Aj.A01);
            Object obj5 = c135296Ae.A04;
            Object obj6 = c135296Ae.A03;
            if (obj5 instanceof Animatable) {
                ((Animatable) obj5).stop();
            }
            if (obj6 instanceof Animatable) {
                ((Animatable) obj6).stop();
            }
        }
    }
}
