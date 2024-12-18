package X;

import android.content.Intent;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.iabadscontext.IABDummyContext;
import com.google.common.collect.ImmutableList;
import com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity;
import java.util.Collection;

/* renamed from: X.SKq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62656SKq {
    public final /* synthetic */ BrowserLiteInMainProcessIGActivity A00;

    public C62656SKq(BrowserLiteInMainProcessIGActivity browserLiteInMainProcessIGActivity) {
        this.A00 = browserLiteInMainProcessIGActivity;
    }

    public final C172707mf A00() {
        IabCommonTrait iABDummyContext;
        BrowserLiteInMainProcessIGActivity browserLiteInMainProcessIGActivity = this.A00;
        android.net.Uri data = browserLiteInMainProcessIGActivity.getIntent().getData();
        if (data == null) {
            data = android.net.Uri.EMPTY;
        }
        C14360o3.A0A(data);
        IABViewModeLaunchConfig.FullScreen fullScreen = IABViewModeLaunchConfig.FullScreen.A00;
        Intent intent = browserLiteInMainProcessIGActivity.getIntent();
        if (intent == null || (iABDummyContext = (IabCommonTrait) intent.getParcelableExtra("EXTRA_IAB_CONTEXT")) == null) {
            C16930sl c16930sl = C16930sl.A00;
            iABDummyContext = new IABDummyContext(ImmutableList.copyOf((Collection) c16930sl), c16930sl);
        }
        Intent intent2 = browserLiteInMainProcessIGActivity.getIntent();
        long j = -1;
        if (intent2 != null) {
            j = intent2.getLongExtra("BrowserLiteIntent.IABLoggingExtras.IAB_USER_CLICK_TS", -1L);
        }
        return A1B.A00(data, iABDummyContext, fullScreen, j);
    }
}
