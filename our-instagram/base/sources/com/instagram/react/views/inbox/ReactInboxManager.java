package com.instagram.react.views.inbox;

import X.AbstractC43591JPw;
import X.AbstractC63123SdR;
import X.C00O;
import X.C14240no;
import X.C14360o3;
import X.C28531Zo;
import X.ChoreographerFrameCallbackC28591CjW;
import X.JR3;
import X.MSV;
import X.MSW;
import X.MSY;
import X.R3N;
import X.S5E;
import android.app.Activity;
import android.view.Choreographer;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.SimpleViewManager;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class ReactInboxManager extends SimpleViewManager {

    @Deprecated
    public static final String ANALYTICS_MODULE_NAME = "vr-react";
    public static final S5E Companion = new Object();

    @Deprecated
    public static final String REACT_CLASS = "DirectInbox";
    public R3N context;

    public ReactInboxManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public FrameLayout createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        this.context = r3n;
        UserSession A0Q = MSW.A0Q(this);
        JR3 A09 = C28531Zo.A04.A02.A09(AbstractC43591JPw.A00(438), A0Q.token, true);
        R3N r3n2 = this.context;
        if (r3n2 == null) {
            C14360o3.A0F("context");
            throw C00O.createAndThrow();
        }
        Activity A01 = r3n2.A01();
        C14360o3.A0C(A01, MSV.A00(0));
        C14240no A0G = MSY.A0G((FragmentActivity) A01);
        A0G.A0B(A09, REACT_CLASS);
        A0G.A0K();
        FrameLayout frameLayout = new FrameLayout(r3n);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(A09.mView, -1, -1);
        setupLayout(frameLayout);
        return frameLayout;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void manuallyLayoutChildren(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private final void setupLayout(View view) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC28591CjW(1, this, view));
    }

    public static final /* synthetic */ void access$manuallyLayoutChildren(ReactInboxManager reactInboxManager, View view) {
        reactInboxManager.manuallyLayoutChildren(view);
    }
}
