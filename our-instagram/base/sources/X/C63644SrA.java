package X;

import android.webkit.WebView;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SrA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63644SrA implements InterfaceC65304Thc {
    public final /* synthetic */ AutofillSharedJSBridgeProxy A00;

    public C63644SrA(AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy) {
        this.A00 = autofillSharedJSBridgeProxy;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // X.InterfaceC65304Thc
    public final void Da0(android.net.Uri uri, WebView webView, C62941SYj c62941SYj, SAF saf, boolean z) {
        SKK skk;
        StringBuilder A1C;
        String str;
        try {
            JSONObject A17 = AbstractC58318PtA.A17(c62941SYj.A00());
            String string = A17.getString("messageBody");
            String string2 = A17.getString("functionName");
            switch (string2.hashCode()) {
                case -1151584677:
                    if (string2.equals("jsPing")) {
                        this.A00.jsPing(string);
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                case -570199355:
                    if (string2.equals("notifyAutofillFocusoutEventV2")) {
                        this.A00.notifyAutofillFocusoutEventV2(string);
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                case -267636863:
                    if (string2.equals("requestAutoFill")) {
                        this.A00.requestAutoFill(string);
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                case -262696859:
                    if (string2.equals("selectedContactFieldTag")) {
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                case 101399588:
                    if (string2.equals("jsQPL")) {
                        this.A00.jsQPL(string);
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                case 921407551:
                    if (string2.equals("hideAutoFillBar")) {
                        this.A00.hideAutoFillBar(string);
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                case 999463063:
                    if (string2.equals("formSubmitted")) {
                        this.A00.formSubmitted(string);
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                case 1722704025:
                    if (string2.equals("saveAutofillData")) {
                        this.A00.saveAutofillData(string);
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                case 1766435243:
                    if (string2.equals("autofillAppliedStatuses")) {
                        this.A00.autofillAppliedStatusesV2(string);
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                case 1960828473:
                    if (string2.equals("getNonce")) {
                        AutofillSharedJSBridgeProxy.A01(this.A00, string);
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                case 2061058453:
                    if (string2.equals("initializeCallbackHandler")) {
                        this.A00.initializeCallbackHandler(string);
                        return;
                    }
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
                default:
                    c62941SYj.A00();
                    this.A00.A07.A00(AnonymousClass001.A0R("Unhandled Message Handler method: ", c62941SYj.A00()));
                    return;
            }
        } catch (JSONException unused) {
            c62941SYj.A00();
            skk = this.A00.A07;
            A1C = AbstractC166987dD.A1C();
            str = "JSMessageParsingError: ";
            A1C.append(str);
            skk.A00(AbstractC166997dE.A0x(c62941SYj.A00(), A1C));
        } catch (Exception unused2) {
            c62941SYj.A00();
            skk = this.A00.A07;
            A1C = AbstractC166987dD.A1C();
            str = "InvalidJSMessage: ";
            A1C.append(str);
            skk.A00(AbstractC166997dE.A0x(c62941SYj.A00(), A1C));
        }
    }
}
