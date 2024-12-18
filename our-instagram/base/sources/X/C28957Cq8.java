package X;

import android.content.Context;
import android.view.ViewOutlineProvider;
import com.facebook.litho.ComponentHost;

/* renamed from: X.Cq8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28957Cq8 implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C2WS c2ws = (C2WS) obj;
        C14360o3.A0B(c2ws, 1);
        boolean z = c2ws instanceof ComponentHost;
        if (z) {
            ((ComponentHost) c2ws).A0J = true;
        }
        c2ws.setVisibility(0);
        C78253er c78253er = C2X5.A0f;
        c2ws.setOnClickListener(null);
        c2ws.setClickable(false);
        c78253er.A02(c2ws);
        c78253er.A01(c2ws);
        c78253er.A03(c2ws);
        if (z) {
            ((ComponentHost) c2ws).A0A = null;
        }
        c2ws.setId(-1);
        c2ws.setTag(null);
        if (z) {
            ((ComponentHost) c2ws).A02 = null;
        }
        if (c2ws.getStateListAnimator() != null) {
            c2ws.getStateListAnimator().jumpToCurrentState();
            c2ws.setStateListAnimator(null);
        }
        c2ws.setElevation(0.0f);
        c2ws.setOutlineAmbientShadowColor(-16777216);
        c2ws.setOutlineSpotShadowColor(-16777216);
        c2ws.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        c2ws.setClipToOutline(false);
        c2ws.setClipChildren(true);
        c2ws.setContentDescription(null);
        c2ws.setTooltipText(null);
        c2ws.setScaleX(1.0f);
        c2ws.setScaleY(1.0f);
        c2ws.setAlpha(1.0f);
        c2ws.setRotation(0.0f);
        c2ws.setRotationX(0.0f);
        c2ws.setRotationY(0.0f);
        c2ws.setClickable(true);
        c2ws.setLongClickable(true);
        c2ws.setFocusable(false);
        c2ws.setEnabled(true);
        c2ws.setSelected(false);
        c2ws.setKeyboardNavigationCluster(false);
        c2ws.setImportantForAccessibility(0);
        C78253er.A00(c2ws);
        c2ws.setBackground(null);
        c2ws.setForeground(null);
        c2ws.setLayoutDirection(2);
        c2ws.setLayerType(0, null);
        AbstractC010103p.A0H(c2ws, C16930sl.A00);
        if (z) {
            ComponentHost componentHost = (ComponentHost) c2ws;
            componentHost.A0J = false;
            componentHost.A0M.A05();
            componentHost.A0N.A05();
            componentHost.A0L.A05();
            componentHost.A05 = null;
            componentHost.A04 = null;
            componentHost.A03 = null;
            componentHost.A0C = null;
            componentHost.A02 = null;
            componentHost.A0K = new int[0];
            componentHost.A0H = false;
            componentHost.A0G = false;
            componentHost.A0E = false;
            componentHost.A06 = null;
            componentHost.A0I = false;
            componentHost.A08 = null;
            componentHost.A0A = null;
            componentHost.A00 = Float.MIN_VALUE;
            componentHost.A01 = Float.MIN_VALUE;
            componentHost.A0F = false;
            componentHost.A0J = false;
            componentHost.setComponentTouchListener(null);
            componentHost.A0B = null;
        }
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC25228BEl.A1B(this);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        return null;
    }
}
