package com.instagram.fbpay.webview;

import X.C14360o3;
import X.SVV;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.secure.securewebview.SecureWebView;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class FBPayIgWebView extends SecureWebView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayIgWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBPayIgWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        SVV.A00(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBPayIgWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        SVV.A00(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "")
    public FBPayIgWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        C14360o3.A0B(context, 1);
        SVV.A00(this);
    }

    public /* synthetic */ FBPayIgWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBPayIgWebView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        SVV.A00(this);
    }
}
