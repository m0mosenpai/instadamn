package X;

import android.content.Context;
import android.view.autofill.AutofillManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.ArrayList;

/* renamed from: X.RqN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61598RqN {
    public final TIK A01() {
        WebBackForwardList copyBackForwardList = ((SystemWebView) this).A04.copyBackForwardList();
        int size = copyBackForwardList.getSize();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; i < size; i++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            A1E.add(new TIT(itemAtIndex.getFavicon(), itemAtIndex.getUrl(), itemAtIndex.getOriginalUrl(), itemAtIndex.getTitle()));
        }
        return new TIK(A1E, copyBackForwardList.getCurrentIndex());
    }

    public final void A02() {
        AutofillManager.AutofillCallback autofillCallback;
        SystemWebView systemWebView = (SystemWebView) this;
        R7V r7v = systemWebView.A04;
        Context context = r7v.getContext();
        if (context.getSystemService(AutofillManager.class) != null && (autofillCallback = systemWebView.A00) != null) {
            ((AutofillManager) context.getSystemService(AutofillManager.class)).unregisterCallback(autofillCallback);
        }
        r7v.destroy();
    }
}
