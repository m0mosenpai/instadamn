package com.instagram.neko.playables.activity;

import X.C14360o3;
import X.C62990SaE;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.secure.securewebview.SecureWebView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class PlayableAdWebView extends SecureWebView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayableAdWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    private final void A00() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        C62990SaE c62990SaE = new C62990SaE();
        c62990SaE.A02();
        this.A01 = c62990SaE.A01();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayableAdWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayableAdWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        A00();
    }

    public /* synthetic */ PlayableAdWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayableAdWebView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00();
    }
}
