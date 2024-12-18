package com.instagram.react.impl;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC27401Ut;
import X.AbstractC60962Rck;
import X.AbstractC62448SCb;
import X.C14360o3;
import X.C19280xC;
import X.C27431Uw;
import X.C64489TFz;
import X.C64500TGm;
import X.C64501TGn;
import X.InterfaceC16820sZ;
import X.InterfaceC65532Tm2;
import X.InterfaceC65674Tr4;
import X.Q21;
import X.S5C;
import X.TWA;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public class IgReactPluginImpl extends AbstractC27401Ut {
    public Application A00;
    public S5C A01;

    @Override // X.AbstractC27401Ut
    public void addMemoryInfoToEvent(C19280xC c19280xC) {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.S5C, java.lang.Object] */
    @Override // X.AbstractC27401Ut
    public synchronized S5C getFragmentFactory() {
        S5C s5c;
        S5C s5c2 = this.A01;
        s5c = s5c2;
        if (s5c2 == null) {
            ?? obj = new Object();
            this.A01 = obj;
            s5c = obj;
        }
        return s5c;
    }

    @Override // X.AbstractC27401Ut
    public boolean maybeRequestOverlayPermissions(Context context, Integer num) {
        return false;
    }

    @Override // X.AbstractC27401Ut
    public void navigateToReactNativeApp(AbstractC18680vv abstractC18680vv, String str, Bundle bundle) {
        FragmentActivity fragmentActivity;
        C14360o3.A0B(abstractC18680vv, 0);
        C14360o3.A0B(str, 1);
        C64489TFz A00 = C27431Uw.A02.A00().A00(abstractC18680vv);
        Q21 A04 = C64489TFz.A00(A00.A01, A00).A04();
        if (A04 != null) {
            Activity A01 = A04.A01();
            if ((A01 instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) A01) != null) {
                AbstractC27401Ut.getInstance();
                new C64501TGn(abstractC18680vv, str).A00(bundle).EqV(fragmentActivity).A04();
            }
        }
    }

    @Override // X.AbstractC27401Ut
    public InterfaceC65674Tr4 getPerformanceLogger(final AbstractC12990ll abstractC12990ll) {
        return (InterfaceC65674Tr4) abstractC12990ll.A01(C64500TGm.class, new InterfaceC16820sZ() { // from class: X.TW7
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C64500TGm(AbstractC12990ll.this);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SCb, X.Rck, com.instagram.react.delegate.IgReactDelegate] */
    @Override // X.AbstractC27401Ut
    public AbstractC60962Rck newIgReactDelegate(Fragment fragment) {
        ?? abstractC62448SCb = new AbstractC62448SCb(fragment);
        abstractC62448SCb.A0B = true;
        abstractC62448SCb.A09 = false;
        abstractC62448SCb.A0A = false;
        return abstractC62448SCb;
    }

    @Override // X.AbstractC27401Ut
    public InterfaceC65532Tm2 newReactNativeLauncher(AbstractC12990ll abstractC12990ll) {
        return new C64501TGn(abstractC12990ll);
    }

    @Override // X.AbstractC27401Ut
    public void preloadReactNativeBridge(AbstractC18680vv abstractC18680vv) {
        C64489TFz c64489TFz = (C64489TFz) abstractC18680vv.A01(C64489TFz.class, new TWA(this.A00, abstractC18680vv));
        C64489TFz.A00(c64489TFz.A01, c64489TFz);
    }

    public IgReactPluginImpl(Application application) {
        this.A00 = application;
        C27431Uw.A01 = new C27431Uw(application);
    }

    @Override // X.AbstractC27401Ut
    public InterfaceC65532Tm2 newReactNativeLauncher(AbstractC12990ll abstractC12990ll, String str) {
        return new C64501TGn(abstractC12990ll, str);
    }
}
