package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.secure.securewebview.SecureWebView;
import java.util.Collection;
import java.util.Locale;

/* renamed from: X.Rba, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60920Rba extends AbstractC65806TuP {
    public final /* synthetic */ Collection A00;

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        R7K r7k = (R7K) ((SecureWebView) view);
        r7k.A00 = c102884kP.A0S(49, false);
        r7k.onResume();
        SFQ sfq = (SFQ) AnonymousClass634.A06(c6fg, c102884kP);
        FragmentActivity A00 = AbstractC61655RrV.A00(c6fg.A00);
        if (A00 != null) {
            sfq.A00.A00 = r7k;
            if (!sfq.A02) {
                sfq.A02 = true;
                C00M onBackPressedDispatcher = A00.getOnBackPressedDispatcher();
                Q5T q5t = sfq.A00;
                C14360o3.A0B(q5t, 0);
                onBackPressedDispatcher.A03(q5t);
            }
        }
        if (sfq.A01 == null) {
            String str = "";
            String str2 = "";
            String A0I = c102884kP.A0I();
            if (A0I != null) {
                str2 = A0I;
            }
            String A0H = c102884kP.A0H();
            if (A0H != null) {
                str = A0H;
            }
            boolean equals = "POST".equals(str.toUpperCase(Locale.US));
            Collection collection = this.A00;
            if (equals) {
                r7k.setCookieStringsInsecure(str2, collection);
                r7k.loadData("<html> <head>  <script> function post(input) { var sourceURI = input['inlineUrl'];var params = input['bodyParams'];var method = \"POST\"; var form = document.createElement(\"form\"); form.setAttribute(\"method\", method);   form.setAttribute(\"action\", sourceURI); var jsonObj = JSON.parse(params);for(var key in jsonObj) { if(jsonObj.hasOwnProperty(key)) { var hiddenField = document.createElement(\"input\");   hiddenField.setAttribute(\"type\", \"hidden\");    hiddenField.setAttribute(\"name\", key);      hiddenField.setAttribute(\"value\", jsonObj[key]);          form.appendChild(hiddenField); } } document.body.appendChild(form);form.submit(); }   </script>  </head> <body></body> </html>", ReactWebViewManager.HTML_MIME_TYPE, ReactWebViewManager.HTML_ENCODING);
            } else {
                r7k.A03(AbstractC62316S6l.A00, str2, collection, null);
            }
        }
        r7k.A01.A00 = new SI8(this, r7k, sfq, c6fg, c102884kP);
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final boolean A0N(C102884kP c102884kP, C102884kP c102884kP2, Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60920Rba(C6FG c6fg, C102884kP c102884kP, Collection collection) {
        super(c6fg, c102884kP);
        this.A00 = collection;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        R7K r7k = (R7K) ((SecureWebView) view);
        SFQ sfq = (SFQ) AnonymousClass634.A06(c6fg, c102884kP);
        r7k.A01.A00 = null;
        r7k.onPause();
        Q5T q5t = sfq.A00;
        q5t.A00 = null;
        q5t.A04(false);
        r7k.stopLoading();
        r7k.clearHistory();
        r7k.loadData("", null, null);
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        R7K r7k = new R7K(context);
        r7k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return r7k;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }
}
