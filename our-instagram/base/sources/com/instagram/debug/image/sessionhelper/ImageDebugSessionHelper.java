package com.instagram.debug.image.sessionhelper;

import X.C14360o3;
import X.C1C0;
import X.C1V7;
import X.C1VY;
import X.C1WM;
import X.C1WN;
import X.C1WP;
import X.C25821No;
import X.C27581Vl;
import X.C2DA;
import X.C2DB;
import X.C5G0;
import X.C5G1;
import X.InterfaceC13000lm;
import X.InterfaceC27591Vm;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.image.ImageDebugHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ImageDebugSessionHelper implements InterfaceC13000lm {
    public static final Companion Companion = new Object();
    public final UserSession userSession;

    public /* synthetic */ ImageDebugSessionHelper(UserSession userSession, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession);
    }

    public static final ImageDebugSessionHelper getInstance(UserSession userSession) {
        return Companion.getInstance(userSession);
    }

    private final boolean shouldEnableImageDebug(UserSession userSession) {
        if (userSession != null && C1C0.A00(userSession)) {
            return true;
        }
        return false;
    }

    public ImageDebugSessionHelper(UserSession userSession) {
        this.userSession = userSession;
    }

    @Override // X.InterfaceC13000lm
    public void onSessionWillEnd() {
        updateModules();
    }

    public final void updateModules() {
        boolean z;
        boolean z2;
        ImageDebugHelper imageDebugHelper = ImageDebugHelper.getInstance();
        if (shouldEnableImageDebug(this.userSession)) {
            imageDebugHelper.setEnabled(true);
            C25821No.A0n = true;
            C25821No.A0l = imageDebugHelper.getIsMemoryLayerEnabled();
            C25821No.A0k = imageDebugHelper.getIsDiskLayerEnabled();
            C2DA.A0O = imageDebugHelper.getDebugNetworkCallbackWrapper();
            IgImageView.A0h = true;
            IgImageView.A0b = imageDebugHelper.getDebugImageViewsTracker();
            C5G0 debugOverlayDrawer = imageDebugHelper.getDebugOverlayDrawer();
            if (IgImageView.A0h) {
                IgImageView.A0c = debugOverlayDrawer;
            }
            C2DB.A0A = true;
            C5G0 debugOverlayDrawer2 = imageDebugHelper.getDebugOverlayDrawer();
            if (C2DB.A0A) {
                C2DB.A09 = debugOverlayDrawer2;
            }
            z = imageDebugHelper.getIsVitoDebugOverlayEnabled();
        } else {
            z = false;
            imageDebugHelper.setEnabled(false);
            C25821No.A0l = true;
            C25821No.A0k = true;
            C25821No.A0n = false;
            C2DA.A0O = null;
            IgImageView.A0h = false;
            IgImageView.A0b = null;
            IgImageView.A0c = null;
            C2DB.A0A = false;
            C2DB.A09 = null;
        }
        synchronized (C1WP.class) {
            z2 = false;
            if (C1WP.A00 != null) {
                z2 = true;
            }
        }
        if (z2) {
            InterfaceC27591Vm A00 = C1WP.A00();
            if (A00 instanceof C27581Vl) {
                C1WN c1wn = ((C27581Vl) A00).A00;
                if (c1wn instanceof C1WM) {
                    C1WM c1wm = (C1WM) c1wn;
                    C5G1 c5g1 = null;
                    if (z) {
                        C1V7 c1v7 = C1VY.A01;
                        C14360o3.A08(c1v7);
                        c5g1 = new C5G1(c1v7);
                    }
                    c1wm.A00 = c5g1;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final ImageDebugSessionHelper getInstance(UserSession userSession) {
            C14360o3.A0B(userSession, 0);
            return (ImageDebugSessionHelper) userSession.A01(ImageDebugSessionHelper.class, new ImageDebugSessionHelper$Companion$getInstance$1(userSession));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
