package X;

import android.content.Context;
import android.content.Intent;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.views.BrowserLiteErrorScreen;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes10.dex */
public final class QF4 extends AbstractC62758SPp {
    public static final C0NO A0S = new Object();
    public InterfaceC65614To5 A05;
    public SDT A06;
    public boolean A0B;
    public boolean A0C;
    public final Intent A0D;
    public final BrowserLiteFragment A0E;
    public final C63305ShB A0F;
    public final InterfaceC65594Tnc A0H;
    public final InterfaceC172727mi A0I;
    public final C0f6 A0J;
    public final boolean A0K;
    public final Context A0L;
    public final C211439Wr A0M;
    public final SH1 A0N;
    public final ABS A0O;
    public final InterfaceViewOnTouchListenerC65624Tpk A0P;
    public final boolean A0R;
    public long A03 = -1;
    public int A00 = 0;
    public int A02 = 0;
    public int A01 = 0;
    public boolean A09 = true;
    public SslError A04 = null;
    public boolean A0A = false;
    public String A07 = null;
    public final Map A0Q = AbstractC166987dD.A1G();
    public final ACQ A0G = new ACQ();
    public List A08 = AKP.A01().A02(InterfaceC65638Tq1.class);

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
    
        if (r8.startsWith("image/") != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[LOOP:0: B:22:0x0089->B:24:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebResourceResponse A01(X.QF4 r16, X.QF6 r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QF4.A01(X.QF4, X.QF6, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0303, code lost:
    
        if (r13.equals(r15.getScheme()) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0364, code lost:
    
        if (r14.getPath().equals(r15.getPath()) == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x036c, code lost:
    
        if (r10.equals(r1) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x036e, code lost:
    
        r2 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x037a, code lost:
    
        if ((r2 - r21.A03) <= 1000) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x037c, code lost:
    
        r7.A05++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r10 = r22.A05();
        r13 = r21.A0F;
        r0 = r13.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0390, code lost:
    
        if (android.text.TextUtils.equals(r7.A08.getHost(), r10.getHost()) == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0392, code lost:
    
        r7.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0398, code lost:
    
        r21.A03 = r2;
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a2, code lost:
    
        if (r3.hasNext() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03a4, code lost:
    
        ((X.InterfaceC65638Tq1) r3.next()).Ej3(r22, r23, r24, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03c3, code lost:
    
        if (com.facebook.browser.lite.BrowserLiteFragment.A0O(r22, r8) != false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ce, code lost:
    
        r7 = r21.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0147, code lost:
    
        r16 = X.AbstractC08820cl.A03(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0151, code lost:
    
        if (r16.getHost() == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0161, code lost:
    
        if (r16.getHost().toLowerCase().endsWith(".facebook.com") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d2, code lost:
    
        if (r7.A0t != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0163, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0171, code lost:
    
        if ("m.me".equals(r16.getQueryParameter("handler")) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0175, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x017b, code lost:
    
        if (r1.getHost() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x017d, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x018d, code lost:
    
        if (X.AbstractC63387Sj3.A07(r1.getHost().toLowerCase(java.util.Locale.ENGLISH), "m.me") != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0197, code lost:
    
        if (r1.getHost() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0199, code lost:
    
        r0 = r1.getHost();
        r14 = java.util.Locale.ENGLISH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d4, code lost:
    
        X.AbstractC08820cl.A03(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01a9, code lost:
    
        if (X.AbstractC63387Sj3.A07(r0.toLowerCase(r14), "messenger.com") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x01af, code lost:
    
        if (r1.getEncodedPath() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x01b1, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x01c0, code lost:
    
        if (r1.getEncodedPath().toLowerCase(r14).startsWith("/t/") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01c3, code lost:
    
        if (r17 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x01c5, code lost:
    
        if (r16 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x01c7, code lost:
    
        if (r0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x01c9, code lost:
    
        r15 = r7.A09;
        r14 = r7.A0f;
        r0 = r13.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x01cf, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d7, code lost:
    
        r14 = X.C58889QEz.A01(r8, r11.getStringExtra("BrowserLiteIntent.EXTRA_ALLEYOOP_CAMPAIGN_GROUP_IDS"), r11.getStringExtra("BrowserLiteIntent.EXTRA_ALLEYOOP_AD_ACCOUNT_IDS"), r11.getStringExtra("BrowserLiteIntent.EXTRA_ALLEYOOP_PACKAGE_NAME"), r11.getBooleanExtra("BrowserLiteIntent.EXTRA_IAB_PLAY_STORE_ALLEYOOP_ENABLED", false));
        r16 = X.AbstractC63262SgL.A00.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0067, code lost:
    
        if (r0.CJz(r15, r14, r8) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x006d, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x006e, code lost:
    
        X.C0K8.A0J("BrowserLiteCallbacker", "Error in handleMDotMeUriRedirectSync", r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01c2, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x018f, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0191, code lost:
    
        if (r1 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0173, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0053, code lost:
    
        r18 = r0.CoI(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0057, code lost:
    
        if (r18 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0059, code lost:
    
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x005c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x005d, code lost:
    
        X.C0K8.A0J("BrowserLiteCallbacker", "Error in maybeOverrideUrl", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fe, code lost:
    
        if (r16.hasNext() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0100, code lost:
    
        r15 = (X.InterfaceC65539TmB) r16.next();
        r1 = r15.ALk(r8, null, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0110, code lost:
    
        if (r15.F8p(r21.A0L, r1) != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011a, code lost:
    
        if (r1.getStringArrayList("package_names") == X.C58889QEz.A00) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        r0 = r7.getActivity();
        r10 = r7.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0122, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0124, code lost:
    
        r0.getLifecycle().A09(new X.C63609SqH(r7, r10, r8, r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0130, code lost:
    
        r7.A0W.Aw7().A0B(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013d, code lost:
    
        if (com.facebook.browser.lite.BrowserLiteFragment.A0O(r22, r8) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0141, code lost:
    
        r1 = X.AbstractC63387Sj3.A01(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0145, code lost:
    
        if (r10 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
    
        if (com.facebook.browser.lite.BrowserLiteFragment.A0O(r22, r8) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a5, code lost:
    
        r14 = r7.A1O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ab, code lost:
    
        if (r14.size() <= 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ad, code lost:
    
        r10 = ((X.QF6) r14.get(r14.size() - 2)).A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bd, code lost:
    
        if (r10 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bf, code lost:
    
        r14 = r1.toString();
        r0 = r13.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c5, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r0.CKK(r14, r10) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d7, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d8, code lost:
    
        X.C0K8.A0J("BrowserLiteCallbacker", "Error in handleShareUriRedirectSync", r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026a A[Catch: all -> 0x0407, TryCatch #3 {all -> 0x0407, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x001d, B:8:0x002c, B:10:0x0038, B:16:0x0049, B:241:0x0053, B:19:0x00ce, B:21:0x00d4, B:22:0x00d7, B:23:0x00fa, B:25:0x0100, B:28:0x0112, B:30:0x011c, B:32:0x0124, B:33:0x0130, B:34:0x0139, B:37:0x03c5, B:40:0x0141, B:42:0x0075, B:44:0x0079, B:46:0x0085, B:48:0x008b, B:49:0x008f, B:51:0x0095, B:54:0x009f, B:56:0x00a5, B:58:0x00ad, B:60:0x00bf, B:63:0x00c7, B:68:0x01d8, B:71:0x01df, B:73:0x01e5, B:75:0x01eb, B:77:0x01f3, B:79:0x01fb, B:81:0x0201, B:83:0x020d, B:87:0x0211, B:85:0x021d, B:90:0x0216, B:91:0x0222, B:200:0x0226, B:93:0x0236, B:95:0x023e, B:97:0x0246, B:99:0x0252, B:101:0x025a, B:103:0x0264, B:105:0x026a, B:106:0x026c, B:109:0x0274, B:111:0x0284, B:113:0x0290, B:115:0x0296, B:117:0x029e, B:119:0x02a8, B:121:0x02ae, B:122:0x02b0, B:124:0x02b6, B:126:0x02c5, B:128:0x02cb, B:129:0x02cd, B:131:0x02d1, B:133:0x02db, B:136:0x02e5, B:138:0x02ed, B:140:0x02f3, B:142:0x02fb, B:144:0x0305, B:145:0x0313, B:147:0x031b, B:149:0x032b, B:151:0x0335, B:153:0x033f, B:155:0x0343, B:157:0x034b, B:159:0x0351, B:162:0x0358, B:165:0x0368, B:167:0x036e, B:169:0x037c, B:171:0x0392, B:172:0x0398, B:173:0x039e, B:175:0x03a4, B:181:0x03b4, B:183:0x03bc, B:185:0x03d7, B:187:0x03e3, B:189:0x03eb, B:192:0x03f9, B:193:0x03ca, B:195:0x03d0, B:198:0x03fe, B:205:0x022f, B:206:0x0147, B:208:0x0153, B:210:0x0163, B:213:0x0177, B:215:0x017d, B:217:0x0193, B:219:0x0199, B:221:0x01ab, B:223:0x01b1, B:228:0x01c9, B:231:0x01d1, B:235:0x006e, B:246:0x005d), top: B:2:0x0005, inners: #0, #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ae A[Catch: all -> 0x0407, TryCatch #3 {all -> 0x0407, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x001d, B:8:0x002c, B:10:0x0038, B:16:0x0049, B:241:0x0053, B:19:0x00ce, B:21:0x00d4, B:22:0x00d7, B:23:0x00fa, B:25:0x0100, B:28:0x0112, B:30:0x011c, B:32:0x0124, B:33:0x0130, B:34:0x0139, B:37:0x03c5, B:40:0x0141, B:42:0x0075, B:44:0x0079, B:46:0x0085, B:48:0x008b, B:49:0x008f, B:51:0x0095, B:54:0x009f, B:56:0x00a5, B:58:0x00ad, B:60:0x00bf, B:63:0x00c7, B:68:0x01d8, B:71:0x01df, B:73:0x01e5, B:75:0x01eb, B:77:0x01f3, B:79:0x01fb, B:81:0x0201, B:83:0x020d, B:87:0x0211, B:85:0x021d, B:90:0x0216, B:91:0x0222, B:200:0x0226, B:93:0x0236, B:95:0x023e, B:97:0x0246, B:99:0x0252, B:101:0x025a, B:103:0x0264, B:105:0x026a, B:106:0x026c, B:109:0x0274, B:111:0x0284, B:113:0x0290, B:115:0x0296, B:117:0x029e, B:119:0x02a8, B:121:0x02ae, B:122:0x02b0, B:124:0x02b6, B:126:0x02c5, B:128:0x02cb, B:129:0x02cd, B:131:0x02d1, B:133:0x02db, B:136:0x02e5, B:138:0x02ed, B:140:0x02f3, B:142:0x02fb, B:144:0x0305, B:145:0x0313, B:147:0x031b, B:149:0x032b, B:151:0x0335, B:153:0x033f, B:155:0x0343, B:157:0x034b, B:159:0x0351, B:162:0x0358, B:165:0x0368, B:167:0x036e, B:169:0x037c, B:171:0x0392, B:172:0x0398, B:173:0x039e, B:175:0x03a4, B:181:0x03b4, B:183:0x03bc, B:185:0x03d7, B:187:0x03e3, B:189:0x03eb, B:192:0x03f9, B:193:0x03ca, B:195:0x03d0, B:198:0x03fe, B:205:0x022f, B:206:0x0147, B:208:0x0153, B:210:0x0163, B:213:0x0177, B:215:0x017d, B:217:0x0193, B:219:0x0199, B:221:0x01ab, B:223:0x01b1, B:228:0x01c9, B:231:0x01d1, B:235:0x006e, B:246:0x005d), top: B:2:0x0005, inners: #0, #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cb A[Catch: all -> 0x0407, TryCatch #3 {all -> 0x0407, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x001d, B:8:0x002c, B:10:0x0038, B:16:0x0049, B:241:0x0053, B:19:0x00ce, B:21:0x00d4, B:22:0x00d7, B:23:0x00fa, B:25:0x0100, B:28:0x0112, B:30:0x011c, B:32:0x0124, B:33:0x0130, B:34:0x0139, B:37:0x03c5, B:40:0x0141, B:42:0x0075, B:44:0x0079, B:46:0x0085, B:48:0x008b, B:49:0x008f, B:51:0x0095, B:54:0x009f, B:56:0x00a5, B:58:0x00ad, B:60:0x00bf, B:63:0x00c7, B:68:0x01d8, B:71:0x01df, B:73:0x01e5, B:75:0x01eb, B:77:0x01f3, B:79:0x01fb, B:81:0x0201, B:83:0x020d, B:87:0x0211, B:85:0x021d, B:90:0x0216, B:91:0x0222, B:200:0x0226, B:93:0x0236, B:95:0x023e, B:97:0x0246, B:99:0x0252, B:101:0x025a, B:103:0x0264, B:105:0x026a, B:106:0x026c, B:109:0x0274, B:111:0x0284, B:113:0x0290, B:115:0x0296, B:117:0x029e, B:119:0x02a8, B:121:0x02ae, B:122:0x02b0, B:124:0x02b6, B:126:0x02c5, B:128:0x02cb, B:129:0x02cd, B:131:0x02d1, B:133:0x02db, B:136:0x02e5, B:138:0x02ed, B:140:0x02f3, B:142:0x02fb, B:144:0x0305, B:145:0x0313, B:147:0x031b, B:149:0x032b, B:151:0x0335, B:153:0x033f, B:155:0x0343, B:157:0x034b, B:159:0x0351, B:162:0x0358, B:165:0x0368, B:167:0x036e, B:169:0x037c, B:171:0x0392, B:172:0x0398, B:173:0x039e, B:175:0x03a4, B:181:0x03b4, B:183:0x03bc, B:185:0x03d7, B:187:0x03e3, B:189:0x03eb, B:192:0x03f9, B:193:0x03ca, B:195:0x03d0, B:198:0x03fe, B:205:0x022f, B:206:0x0147, B:208:0x0153, B:210:0x0163, B:213:0x0177, B:215:0x017d, B:217:0x0193, B:219:0x0199, B:221:0x01ab, B:223:0x01b1, B:228:0x01c9, B:231:0x01d1, B:235:0x006e, B:246:0x005d), top: B:2:0x0005, inners: #0, #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d1 A[Catch: all -> 0x0407, TryCatch #3 {all -> 0x0407, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x001d, B:8:0x002c, B:10:0x0038, B:16:0x0049, B:241:0x0053, B:19:0x00ce, B:21:0x00d4, B:22:0x00d7, B:23:0x00fa, B:25:0x0100, B:28:0x0112, B:30:0x011c, B:32:0x0124, B:33:0x0130, B:34:0x0139, B:37:0x03c5, B:40:0x0141, B:42:0x0075, B:44:0x0079, B:46:0x0085, B:48:0x008b, B:49:0x008f, B:51:0x0095, B:54:0x009f, B:56:0x00a5, B:58:0x00ad, B:60:0x00bf, B:63:0x00c7, B:68:0x01d8, B:71:0x01df, B:73:0x01e5, B:75:0x01eb, B:77:0x01f3, B:79:0x01fb, B:81:0x0201, B:83:0x020d, B:87:0x0211, B:85:0x021d, B:90:0x0216, B:91:0x0222, B:200:0x0226, B:93:0x0236, B:95:0x023e, B:97:0x0246, B:99:0x0252, B:101:0x025a, B:103:0x0264, B:105:0x026a, B:106:0x026c, B:109:0x0274, B:111:0x0284, B:113:0x0290, B:115:0x0296, B:117:0x029e, B:119:0x02a8, B:121:0x02ae, B:122:0x02b0, B:124:0x02b6, B:126:0x02c5, B:128:0x02cb, B:129:0x02cd, B:131:0x02d1, B:133:0x02db, B:136:0x02e5, B:138:0x02ed, B:140:0x02f3, B:142:0x02fb, B:144:0x0305, B:145:0x0313, B:147:0x031b, B:149:0x032b, B:151:0x0335, B:153:0x033f, B:155:0x0343, B:157:0x034b, B:159:0x0351, B:162:0x0358, B:165:0x0368, B:167:0x036e, B:169:0x037c, B:171:0x0392, B:172:0x0398, B:173:0x039e, B:175:0x03a4, B:181:0x03b4, B:183:0x03bc, B:185:0x03d7, B:187:0x03e3, B:189:0x03eb, B:192:0x03f9, B:193:0x03ca, B:195:0x03d0, B:198:0x03fe, B:205:0x022f, B:206:0x0147, B:208:0x0153, B:210:0x0163, B:213:0x0177, B:215:0x017d, B:217:0x0193, B:219:0x0199, B:221:0x01ab, B:223:0x01b1, B:228:0x01c9, B:231:0x01d1, B:235:0x006e, B:246:0x005d), top: B:2:0x0005, inners: #0, #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0351 A[Catch: all -> 0x0407, TryCatch #3 {all -> 0x0407, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x001d, B:8:0x002c, B:10:0x0038, B:16:0x0049, B:241:0x0053, B:19:0x00ce, B:21:0x00d4, B:22:0x00d7, B:23:0x00fa, B:25:0x0100, B:28:0x0112, B:30:0x011c, B:32:0x0124, B:33:0x0130, B:34:0x0139, B:37:0x03c5, B:40:0x0141, B:42:0x0075, B:44:0x0079, B:46:0x0085, B:48:0x008b, B:49:0x008f, B:51:0x0095, B:54:0x009f, B:56:0x00a5, B:58:0x00ad, B:60:0x00bf, B:63:0x00c7, B:68:0x01d8, B:71:0x01df, B:73:0x01e5, B:75:0x01eb, B:77:0x01f3, B:79:0x01fb, B:81:0x0201, B:83:0x020d, B:87:0x0211, B:85:0x021d, B:90:0x0216, B:91:0x0222, B:200:0x0226, B:93:0x0236, B:95:0x023e, B:97:0x0246, B:99:0x0252, B:101:0x025a, B:103:0x0264, B:105:0x026a, B:106:0x026c, B:109:0x0274, B:111:0x0284, B:113:0x0290, B:115:0x0296, B:117:0x029e, B:119:0x02a8, B:121:0x02ae, B:122:0x02b0, B:124:0x02b6, B:126:0x02c5, B:128:0x02cb, B:129:0x02cd, B:131:0x02d1, B:133:0x02db, B:136:0x02e5, B:138:0x02ed, B:140:0x02f3, B:142:0x02fb, B:144:0x0305, B:145:0x0313, B:147:0x031b, B:149:0x032b, B:151:0x0335, B:153:0x033f, B:155:0x0343, B:157:0x034b, B:159:0x0351, B:162:0x0358, B:165:0x0368, B:167:0x036e, B:169:0x037c, B:171:0x0392, B:172:0x0398, B:173:0x039e, B:175:0x03a4, B:181:0x03b4, B:183:0x03bc, B:185:0x03d7, B:187:0x03e3, B:189:0x03eb, B:192:0x03f9, B:193:0x03ca, B:195:0x03d0, B:198:0x03fe, B:205:0x022f, B:206:0x0147, B:208:0x0153, B:210:0x0163, B:213:0x0177, B:215:0x017d, B:217:0x0193, B:219:0x0199, B:221:0x01ab, B:223:0x01b1, B:228:0x01c9, B:231:0x01d1, B:235:0x006e, B:246:0x005d), top: B:2:0x0005, inners: #0, #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0358 A[Catch: all -> 0x0407, TryCatch #3 {all -> 0x0407, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x001d, B:8:0x002c, B:10:0x0038, B:16:0x0049, B:241:0x0053, B:19:0x00ce, B:21:0x00d4, B:22:0x00d7, B:23:0x00fa, B:25:0x0100, B:28:0x0112, B:30:0x011c, B:32:0x0124, B:33:0x0130, B:34:0x0139, B:37:0x03c5, B:40:0x0141, B:42:0x0075, B:44:0x0079, B:46:0x0085, B:48:0x008b, B:49:0x008f, B:51:0x0095, B:54:0x009f, B:56:0x00a5, B:58:0x00ad, B:60:0x00bf, B:63:0x00c7, B:68:0x01d8, B:71:0x01df, B:73:0x01e5, B:75:0x01eb, B:77:0x01f3, B:79:0x01fb, B:81:0x0201, B:83:0x020d, B:87:0x0211, B:85:0x021d, B:90:0x0216, B:91:0x0222, B:200:0x0226, B:93:0x0236, B:95:0x023e, B:97:0x0246, B:99:0x0252, B:101:0x025a, B:103:0x0264, B:105:0x026a, B:106:0x026c, B:109:0x0274, B:111:0x0284, B:113:0x0290, B:115:0x0296, B:117:0x029e, B:119:0x02a8, B:121:0x02ae, B:122:0x02b0, B:124:0x02b6, B:126:0x02c5, B:128:0x02cb, B:129:0x02cd, B:131:0x02d1, B:133:0x02db, B:136:0x02e5, B:138:0x02ed, B:140:0x02f3, B:142:0x02fb, B:144:0x0305, B:145:0x0313, B:147:0x031b, B:149:0x032b, B:151:0x0335, B:153:0x033f, B:155:0x0343, B:157:0x034b, B:159:0x0351, B:162:0x0358, B:165:0x0368, B:167:0x036e, B:169:0x037c, B:171:0x0392, B:172:0x0398, B:173:0x039e, B:175:0x03a4, B:181:0x03b4, B:183:0x03bc, B:185:0x03d7, B:187:0x03e3, B:189:0x03eb, B:192:0x03f9, B:193:0x03ca, B:195:0x03d0, B:198:0x03fe, B:205:0x022f, B:206:0x0147, B:208:0x0153, B:210:0x0163, B:213:0x0177, B:215:0x017d, B:217:0x0193, B:219:0x0199, B:221:0x01ab, B:223:0x01b1, B:228:0x01c9, B:231:0x01d1, B:235:0x006e, B:246:0x005d), top: B:2:0x0005, inners: #0, #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b4 A[Catch: all -> 0x0407, TryCatch #3 {all -> 0x0407, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x001d, B:8:0x002c, B:10:0x0038, B:16:0x0049, B:241:0x0053, B:19:0x00ce, B:21:0x00d4, B:22:0x00d7, B:23:0x00fa, B:25:0x0100, B:28:0x0112, B:30:0x011c, B:32:0x0124, B:33:0x0130, B:34:0x0139, B:37:0x03c5, B:40:0x0141, B:42:0x0075, B:44:0x0079, B:46:0x0085, B:48:0x008b, B:49:0x008f, B:51:0x0095, B:54:0x009f, B:56:0x00a5, B:58:0x00ad, B:60:0x00bf, B:63:0x00c7, B:68:0x01d8, B:71:0x01df, B:73:0x01e5, B:75:0x01eb, B:77:0x01f3, B:79:0x01fb, B:81:0x0201, B:83:0x020d, B:87:0x0211, B:85:0x021d, B:90:0x0216, B:91:0x0222, B:200:0x0226, B:93:0x0236, B:95:0x023e, B:97:0x0246, B:99:0x0252, B:101:0x025a, B:103:0x0264, B:105:0x026a, B:106:0x026c, B:109:0x0274, B:111:0x0284, B:113:0x0290, B:115:0x0296, B:117:0x029e, B:119:0x02a8, B:121:0x02ae, B:122:0x02b0, B:124:0x02b6, B:126:0x02c5, B:128:0x02cb, B:129:0x02cd, B:131:0x02d1, B:133:0x02db, B:136:0x02e5, B:138:0x02ed, B:140:0x02f3, B:142:0x02fb, B:144:0x0305, B:145:0x0313, B:147:0x031b, B:149:0x032b, B:151:0x0335, B:153:0x033f, B:155:0x0343, B:157:0x034b, B:159:0x0351, B:162:0x0358, B:165:0x0368, B:167:0x036e, B:169:0x037c, B:171:0x0392, B:172:0x0398, B:173:0x039e, B:175:0x03a4, B:181:0x03b4, B:183:0x03bc, B:185:0x03d7, B:187:0x03e3, B:189:0x03eb, B:192:0x03f9, B:193:0x03ca, B:195:0x03d0, B:198:0x03fe, B:205:0x022f, B:206:0x0147, B:208:0x0153, B:210:0x0163, B:213:0x0177, B:215:0x017d, B:217:0x0193, B:219:0x0199, B:221:0x01ab, B:223:0x01b1, B:228:0x01c9, B:231:0x01d1, B:235:0x006e, B:246:0x005d), top: B:2:0x0005, inners: #0, #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03fe A[Catch: all -> 0x0407, TRY_LEAVE, TryCatch #3 {all -> 0x0407, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x001d, B:8:0x002c, B:10:0x0038, B:16:0x0049, B:241:0x0053, B:19:0x00ce, B:21:0x00d4, B:22:0x00d7, B:23:0x00fa, B:25:0x0100, B:28:0x0112, B:30:0x011c, B:32:0x0124, B:33:0x0130, B:34:0x0139, B:37:0x03c5, B:40:0x0141, B:42:0x0075, B:44:0x0079, B:46:0x0085, B:48:0x008b, B:49:0x008f, B:51:0x0095, B:54:0x009f, B:56:0x00a5, B:58:0x00ad, B:60:0x00bf, B:63:0x00c7, B:68:0x01d8, B:71:0x01df, B:73:0x01e5, B:75:0x01eb, B:77:0x01f3, B:79:0x01fb, B:81:0x0201, B:83:0x020d, B:87:0x0211, B:85:0x021d, B:90:0x0216, B:91:0x0222, B:200:0x0226, B:93:0x0236, B:95:0x023e, B:97:0x0246, B:99:0x0252, B:101:0x025a, B:103:0x0264, B:105:0x026a, B:106:0x026c, B:109:0x0274, B:111:0x0284, B:113:0x0290, B:115:0x0296, B:117:0x029e, B:119:0x02a8, B:121:0x02ae, B:122:0x02b0, B:124:0x02b6, B:126:0x02c5, B:128:0x02cb, B:129:0x02cd, B:131:0x02d1, B:133:0x02db, B:136:0x02e5, B:138:0x02ed, B:140:0x02f3, B:142:0x02fb, B:144:0x0305, B:145:0x0313, B:147:0x031b, B:149:0x032b, B:151:0x0335, B:153:0x033f, B:155:0x0343, B:157:0x034b, B:159:0x0351, B:162:0x0358, B:165:0x0368, B:167:0x036e, B:169:0x037c, B:171:0x0392, B:172:0x0398, B:173:0x039e, B:175:0x03a4, B:181:0x03b4, B:183:0x03bc, B:185:0x03d7, B:187:0x03e3, B:189:0x03eb, B:192:0x03f9, B:193:0x03ca, B:195:0x03d0, B:198:0x03fe, B:205:0x022f, B:206:0x0147, B:208:0x0153, B:210:0x0163, B:213:0x0177, B:215:0x017d, B:217:0x0193, B:219:0x0199, B:221:0x01ab, B:223:0x01b1, B:228:0x01c9, B:231:0x01d1, B:235:0x006e, B:246:0x005d), top: B:2:0x0005, inners: #0, #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0226 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023e A[Catch: all -> 0x0407, TryCatch #3 {all -> 0x0407, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x001d, B:8:0x002c, B:10:0x0038, B:16:0x0049, B:241:0x0053, B:19:0x00ce, B:21:0x00d4, B:22:0x00d7, B:23:0x00fa, B:25:0x0100, B:28:0x0112, B:30:0x011c, B:32:0x0124, B:33:0x0130, B:34:0x0139, B:37:0x03c5, B:40:0x0141, B:42:0x0075, B:44:0x0079, B:46:0x0085, B:48:0x008b, B:49:0x008f, B:51:0x0095, B:54:0x009f, B:56:0x00a5, B:58:0x00ad, B:60:0x00bf, B:63:0x00c7, B:68:0x01d8, B:71:0x01df, B:73:0x01e5, B:75:0x01eb, B:77:0x01f3, B:79:0x01fb, B:81:0x0201, B:83:0x020d, B:87:0x0211, B:85:0x021d, B:90:0x0216, B:91:0x0222, B:200:0x0226, B:93:0x0236, B:95:0x023e, B:97:0x0246, B:99:0x0252, B:101:0x025a, B:103:0x0264, B:105:0x026a, B:106:0x026c, B:109:0x0274, B:111:0x0284, B:113:0x0290, B:115:0x0296, B:117:0x029e, B:119:0x02a8, B:121:0x02ae, B:122:0x02b0, B:124:0x02b6, B:126:0x02c5, B:128:0x02cb, B:129:0x02cd, B:131:0x02d1, B:133:0x02db, B:136:0x02e5, B:138:0x02ed, B:140:0x02f3, B:142:0x02fb, B:144:0x0305, B:145:0x0313, B:147:0x031b, B:149:0x032b, B:151:0x0335, B:153:0x033f, B:155:0x0343, B:157:0x034b, B:159:0x0351, B:162:0x0358, B:165:0x0368, B:167:0x036e, B:169:0x037c, B:171:0x0392, B:172:0x0398, B:173:0x039e, B:175:0x03a4, B:181:0x03b4, B:183:0x03bc, B:185:0x03d7, B:187:0x03e3, B:189:0x03eb, B:192:0x03f9, B:193:0x03ca, B:195:0x03d0, B:198:0x03fe, B:205:0x022f, B:206:0x0147, B:208:0x0153, B:210:0x0163, B:213:0x0177, B:215:0x017d, B:217:0x0193, B:219:0x0199, B:221:0x01ab, B:223:0x01b1, B:228:0x01c9, B:231:0x01d1, B:235:0x006e, B:246:0x005d), top: B:2:0x0005, inners: #0, #1, #2, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(X.QF4 r21, X.QF6 r22, java.lang.Boolean r23, java.lang.Boolean r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QF4.A02(X.QF4, X.QF6, java.lang.Boolean, java.lang.Boolean, java.lang.String):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.Rpf] */
    @Override // X.AbstractC62758SPp
    public final C62530SFh A04(String str) {
        String str2;
        String[] stringArrayExtra;
        int length;
        Object parcelableExtra;
        Intent intent = this.A0D;
        if (!intent.getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_BROWSER_PROPERTY_CLICK_ID", false)) {
            return new C62530SFh(null, null, "Handling is disabled");
        }
        if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_EPD_OPT_OUT", false)) {
            return new C62530SFh(null, null, "User is EPD opt-out");
        }
        Map map = this.A0Q;
        C61559Rpf c61559Rpf = (C61559Rpf) map.get(str);
        if (c61559Rpf != null) {
            String str3 = c61559Rpf.A01;
            if (!TextUtils.isEmpty(str3)) {
                return new C62530SFh(c61559Rpf.A00, str3, null);
            }
        }
        if (!this.A0C) {
            if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_GET_CLICKID_FROM_IAB_ADS_CONTEXT", false)) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("EXTRA_IAB_CONTEXT", IabCommonTrait.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("EXTRA_IAB_CONTEXT");
                }
                IabCommonTrait iabCommonTrait = (IabCommonTrait) parcelableExtra;
                if (iabCommonTrait != null) {
                    List Anm = iabCommonTrait.Anm();
                    if (!Anm.isEmpty()) {
                        str2 = AbstractC25226BEj.A1I(Anm, 0);
                    }
                }
                str2 = null;
            } else {
                str2 = intent.getStringExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID");
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = A09(intent.getData());
            }
            this.A0C = true;
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) && (stringArrayExtra = intent.getStringArrayExtra("BrowserLiteIntent.EXTRA_CLICK_IDS")) != null && (length = stringArrayExtra.length) > 0) {
            str2 = stringArrayExtra[new Random().nextInt(length)];
        }
        if (!TextUtils.isEmpty(str2)) {
            Long valueOf = Long.valueOf(AbstractC31177DnL.A06());
            ?? obj = new Object();
            obj.A01 = str2;
            obj.A00 = valueOf;
            map.put(str, obj);
            return new C62530SFh(valueOf, str2, null);
        }
        return new C62530SFh(null, null, AnonymousClass001.A0O("Cannot fetch from pool, state: ", intent.getIntExtra("BrowserLiteIntent.EXTRA_CLICK_ID_POOL_FETCH_STATE", -1)));
    }

    public final String A09(android.net.Uri uri) {
        String queryParameter;
        if (uri == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("fbclid");
        if (queryParameter2 == null && (queryParameter = uri.getQueryParameter("u")) != null) {
            return A09(AbstractC08820cl.A00(A0S, queryParameter));
        }
        return queryParameter2;
    }

    public final void A0A(String str) {
        AbstractC210669Tj abstractC210669Tj;
        BrowserLiteFragment browserLiteFragment = this.A0E;
        browserLiteFragment.A0m = str;
        TextUtils.isEmpty(str);
        ABS abs = this.A0O;
        if (abs != null) {
            QF6 C9a = abs.A03.C9a();
            if ((C9a == null || !C9a.A0b) && (abstractC210669Tj = abs.A00) != null) {
                abstractC210669Tj.A00(str);
            }
        } else {
            InterfaceC65594Tnc interfaceC65594Tnc = this.A0H;
            if (interfaceC65594Tnc != null && !this.A0A) {
                interfaceC65594Tnc.DxY(str);
            }
        }
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            it.next();
        }
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = browserLiteFragment.A0H;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A09(str);
        }
        InterfaceViewOnTouchListenerC65624Tpk interfaceViewOnTouchListenerC65624Tpk = this.A0P;
        if (interfaceViewOnTouchListenerC65624Tpk != null) {
            interfaceViewOnTouchListenerC65624Tpk.DxX(str);
        }
        C63305ShB c63305ShB = this.A0F;
        if (c63305ShB != null && str != null) {
            Bundle A0b = AbstractC166987dD.A0b();
            BrowserLiteCallback browserLiteCallback = c63305ShB.A06;
            if (browserLiteCallback != null) {
                try {
                    browserLiteCallback.DxW(str, A0b);
                } catch (RemoteException e) {
                    C0K8.A0J("BrowserLiteCallbacker", "Error in onUrlChange", e);
                }
            }
        }
    }

    public QF4(Context context, Intent intent, BrowserLiteFragment browserLiteFragment, C211439Wr c211439Wr, SH1 sh1, C63305ShB c63305ShB, ABS abs, InterfaceViewOnTouchListenerC65624Tpk interfaceViewOnTouchListenerC65624Tpk, InterfaceC65594Tnc interfaceC65594Tnc, C0f6 c0f6, boolean z) {
        C62529SFg c62529SFg;
        this.A0O = abs;
        this.A0F = c63305ShB;
        this.A0P = interfaceViewOnTouchListenerC65624Tpk;
        this.A0M = c211439Wr;
        this.A0E = browserLiteFragment;
        this.A0I = browserLiteFragment;
        this.A0N = sh1;
        this.A0L = context;
        this.A0D = intent;
        this.A0R = z;
        this.A0J = c0f6;
        this.A0H = interfaceC65594Tnc;
        this.A0K = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IAB_NEW_URL_CHECK_ENABLED_FOR_SSL_ERROR", false);
        Intent intent2 = this.A0D;
        Bundle bundleExtra = intent2.getBundleExtra("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER");
        if (bundleExtra != null) {
            c62529SFg = new C62529SFg(bundleExtra.getByteArray("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_BITS"), bundleExtra.getInt("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_NUM_HASHES"), bundleExtra.getInt("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_NUM_BITS"));
        } else {
            c62529SFg = null;
        }
        this.A06 = new SDT(c62529SFg, !intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_BROWSER_PROPERTY_CLICK_ID", false) || intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_EPD_OPT_OUT", false));
    }

    public static WebResourceResponse A00(android.net.Uri uri, QF4 qf4, String str) {
        int i;
        String str2;
        String str3;
        if (!"properties".equals(uri.getScheme())) {
            return null;
        }
        if ("browser".equals(uri.getHost()) && "/clickID".equals(uri.getPath())) {
            C62530SFh A04 = qf4.A04(str);
            str3 = A04.A01;
            if (str3 != null) {
                i = 200;
                str2 = "OK";
            } else {
                str3 = A04.A02;
                if (str3 == null) {
                    str3 = "";
                }
                i = 404;
                str2 = "Not Found";
            }
        } else {
            i = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
            str2 = "Bad Request";
            str3 = "";
        }
        return AbstractC61741Rsw.A00(str2, str3, i);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [X.SwP, java.lang.Object, X.Tfi] */
    @Override // X.AbstractC62758SPp
    public final void A05(WebResourceError webResourceError, WebResourceRequest webResourceRequest, QF6 qf6) {
        BrowserLiteErrorScreen A0Q;
        int i;
        BrowserLiteFragment browserLiteFragment;
        QF6 C9a;
        int errorCode = webResourceError.getErrorCode();
        String charSequence = webResourceError.getDescription().toString();
        String A0r = AbstractC58319PtB.A0r(webResourceRequest);
        boolean isForMainFrame = webResourceRequest.isForMainFrame();
        AbstractC63254SgB.A03("onReceivedError %d, %s, %s", new Object[]{Integer.valueOf(errorCode), charSequence, A0r});
        this.A0G.A00("BLWVC.onReceivedError");
        if (-10 == errorCode && !TextUtils.isEmpty(A0r) && A0r.equals(((BrowserLiteFragment) this.A0I).A0m) && !AbstractC63387Sj3.A04(AbstractC08820cl.A01(A0S, A0r)) && this.A0E.A0f(A0r)) {
            ((SystemWebView) qf6).A04.stopLoading();
            RunnableC64671TPc runnableC64671TPc = new RunnableC64671TPc(this, qf6, A0r);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC64671TPc.run();
            } else {
                STG.A00.postDelayed(runnableC64671TPc, 1000L);
            }
        }
        if (A0r.equals(((BrowserLiteFragment) this.A0I).A0m) && (((C9a = (browserLiteFragment = this.A0E).C9a()) == null || !C9a.A0H()) && browserLiteFragment.A01 == 0)) {
            browserLiteFragment.A01 = errorCode;
            C23016ACq c23016ACq = browserLiteFragment.A0e;
            if (c23016ACq.A0p) {
                c23016ACq.A02 = errorCode;
            }
        }
        if (isForMainFrame) {
            this.A0A = true;
            InterfaceC65594Tnc interfaceC65594Tnc = this.A0H;
            if (interfaceC65594Tnc != null) {
                interfaceC65594Tnc.ETv(errorCode);
            }
            BrowserLiteFragment browserLiteFragment2 = this.A0E;
            if (browserLiteFragment2.A07 != null && (A0Q = browserLiteFragment2.A0Q(null)) != null) {
                InterfaceC65200Tfi interfaceC65200Tfi = browserLiteFragment2.A0T;
                InterfaceC65200Tfi interfaceC65200Tfi2 = interfaceC65200Tfi;
                if (interfaceC65200Tfi == null) {
                    ?? obj = new Object();
                    obj.A01 = 0;
                    obj.A00 = 0;
                    obj.A02 = new Handler();
                    obj.A03 = new TNA(obj, qf6);
                    browserLiteFragment2.A0T = obj;
                    interfaceC65200Tfi2 = obj;
                }
                A0Q.A02 = interfaceC65200Tfi2;
                ViewOnClickListenerC63509Soc viewOnClickListenerC63509Soc = new ViewOnClickListenerC63509Soc(0, qf6, browserLiteFragment2);
                if (A0Q.A01 == null) {
                    TextView A0T = AbstractC166997dE.A0T(A0Q, R.id.error_screen_retry);
                    A0Q.A01 = A0T;
                    A0T.setText(2131972101);
                }
                TextView textView = A0Q.A00;
                if (textView == null) {
                    textView = AbstractC166997dE.A0T(A0Q, R.id.error_screen_description);
                    A0Q.A00 = textView;
                }
                if (errorCode != -9) {
                    if (errorCode != -8) {
                        i = 2131964526;
                        if (errorCode != -1) {
                            i = 2131964527;
                        }
                    } else {
                        i = 2131964528;
                    }
                } else {
                    i = 2131964529;
                }
                textView.setText(i);
                A0Q.A01.setOnClickListener(viewOnClickListenerC63509Soc);
                A0Q.setVisibility(0);
            }
        }
        super.A05(webResourceError, webResourceRequest, qf6);
    }
}
