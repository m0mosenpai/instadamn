package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.android.webview.chromium.membrane.HeliumWebViewExtensions;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebookpay.offsite.base.CheckoutHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.SfY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63223SfY {
    public Context A00 = null;
    public Intent A01 = null;
    public View A02 = null;
    public InterfaceC172717mh A03 = null;
    public InterfaceC172727mi A04 = null;
    public InterfaceC65594Tnc A05 = null;

    public final boolean Eir(QF6 qf6, String str) {
        return false;
    }

    public boolean Eit(QF6 qf6, Boolean bool, Boolean bool2, String str) {
        return false;
    }

    public void destroy() {
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
    }

    public final String getUrl() {
        return null;
    }

    public static CheckoutHandler A03(C58887QEx c58887QEx) {
        InterfaceC09390do interfaceC09390do = c58887QEx.A08;
        if (interfaceC09390do != null) {
            return (CheckoutHandler) interfaceC09390do.getValue();
        }
        C14360o3.A0F("checkoutHandler");
        throw C00O.createAndThrow();
    }

    public final void AQC(QF6 qf6, String str, boolean z) {
        QIj qIj;
        C62620SJd c62620SJd;
        QIl qIl;
        Map map;
        String str2 = str;
        if (this instanceof C58883QEt) {
            C58883QEt c58883QEt = (C58883QEt) this;
            C63380Siu c63380Siu = c58883QEt.A05;
            if (c58883QEt.A0N && c63380Siu != null) {
                if (c58883QEt.A0V && (map = (qIl = (c62620SJd = c58883QEt.A0Y.A00).A00).A02) != null && !map.isEmpty()) {
                    String str3 = c58883QEt.A0b;
                    C14360o3.A0B(str3, 0);
                    String str4 = null;
                    String A0o = AbstractC166997dE.A0o();
                    if (((AbstractC63223SfY) c58883QEt).A04 != null) {
                        str4 = c62620SJd.A09.A01;
                    }
                    String A02 = AbstractC63387Sj3.A02(qf6.A04().A06);
                    String A01 = AbstractC63232Sfk.A01(c62620SJd);
                    String str5 = c62620SJd.A09.A04;
                    if (!map.isEmpty()) {
                        ArrayList A0n = AbstractC31180DnO.A0n(map);
                        if (!A0n.isEmpty()) {
                            Bundle A03 = c58883QEt.A03();
                            if (A03 == null) {
                                A03 = SJ9.A00(str5, A01, str4, A0o, str3, A02, A0n);
                            } else {
                                A03.putAll(SJ9.A00(str5, A01, str4, A0o, str3, A02, A0n));
                            }
                            C63305ShB A00 = C63305ShB.A00();
                            HashMap A1G = AbstractC166987dD.A1G();
                            A1G.put("action", "BrowserLiteIntent.IAB_AUTOFILL_CROWDSOURCING_PREDICTIONS");
                            C63305ShB.A02(new QDr(A03, A00, A1G, 2), A00, false);
                        }
                    }
                    qIl.A02 = null;
                }
                C5G6 c5g6 = c58883QEt.A0Y;
                if (AbstractC31177DnL.A1U(C06090Tz.A05, c5g6.A04.A00, 36322800422431382L)) {
                    c63380Siu.A0C = C05F.A0C;
                    c63380Siu.A0N(null, str2, false);
                }
                C62620SJd c62620SJd2 = c63380Siu.A0Q.A00;
                QIy qIy = c62620SJd2.A05;
                if (qIy != null && (qIj = (QIj) qIy.A01) != null && c63380Siu.A0L) {
                    c63380Siu.A0J((QIj) c62620SJd2.A05.A01, AbstractC63348Si5.A00(qIj), "ALL_NAVIGATION");
                    c63380Siu.A0L = false;
                    c62620SJd2.A05 = null;
                }
                ((Map) c5g6.A00.A0L.A02).clear();
                return;
            }
            return;
        }
        if (this instanceof C58885QEv) {
            C58885QEv c58885QEv = (C58885QEv) this;
            AbstractC167017dG.A1N(qf6, str2);
            C63217SfN c63217SfN = C63217SfN.A06;
            if (c63217SfN != null && c63217SfN.A02() && (str2 = c63217SfN.A01.A02) == null) {
                str2 = "";
            }
            C62526SFc c62526SFc = c58885QEv.A00;
            if (c62526SFc != null && !C14360o3.A0K(c62526SFc.A01, str2)) {
                C58885QEv.A00(c58885QEv);
            }
            C62526SFc c62526SFc2 = c58885QEv.A00;
            if (c62526SFc2 == null) {
                c62526SFc2 = new C62526SFc(System.currentTimeMillis());
                c58885QEv.A00 = c62526SFc2;
            }
            c62526SFc2.A01 = str2;
            return;
        }
        if (!(this instanceof C58884QEu)) {
            return;
        }
        C58884QEu c58884QEu = (C58884QEu) this;
        boolean A1a = AbstractC167017dG.A1a(qf6, str2);
        C62914SWv c62914SWv = c58884QEu.A00;
        if (c62914SWv == null) {
            c62914SWv = new C62914SWv(AbstractC31173DnH.A0g(), AbstractC31171DnF.A0l(), A1a);
            c58884QEu.A00 = c62914SWv;
        }
        if (c62914SWv.A03 != A1a) {
            return;
        }
        c62914SWv.A04.add(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d6, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) != false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v36, types: [X.0iw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Cso(X.QF6 r22) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63223SfY.Cso(X.QF6):void");
    }

    public final void Cxb(Fragment fragment) {
        R8Y r8y;
        if (this instanceof C58887QEx) {
            C58887QEx c58887QEx = (C58887QEx) this;
            C14360o3.A0B(fragment, 0);
            if ((fragment instanceof C67729Uwv) && (r8y = c58887QEx.A03) != null) {
                ((C67729Uwv) fragment).A0K(r8y.getEcpHandler());
            }
        }
    }

    public final void D0T() {
        if (this instanceof C58881QEr) {
            C58881QEr.A00((C58881QEr) this);
            return;
        }
        if (!(this instanceof C58883QEt)) {
            return;
        }
        C58883QEt c58883QEt = (C58883QEt) this;
        C63380Siu c63380Siu = c58883QEt.A05;
        if (!c58883QEt.A0N || c63380Siu == null) {
            return;
        }
        c58883QEt.A0R = false;
        c58883QEt.A0S = false;
        c63380Siu.A0D();
        QIj qIj = (QIj) c63380Siu.A0Q.A00.A06.A01;
        if (c63380Siu.A0D != null && qIj != null) {
            c63380Siu.A0J(qIj, AbstractC63348Si5.A00(qIj), "IAB_CLOSE");
        }
        C63021Sam c63021Sam = c58883QEt.A0Y.A02;
        if (!c63021Sam.A00.A09(true)) {
            return;
        }
        c63021Sam.A01.endAllInstancesOfMarker(772805755, (short) 615);
    }

    public final void DBE(QF6 qf6) {
        if (this instanceof C58887QEx) {
            C58887QEx.A00((C58887QEx) this);
            return;
        }
        if (this instanceof C58884QEu) {
            long currentTimeMillis = System.currentTimeMillis();
            C62914SWv c62914SWv = ((C58884QEu) this).A00;
            if (c62914SWv == null || c62914SWv.A01 != null) {
                return;
            }
            c62914SWv.A01 = Long.valueOf(currentTimeMillis);
            return;
        }
        if (!(this instanceof C58883QEt)) {
            return;
        }
        C58883QEt c58883QEt = (C58883QEt) this;
        C58883QEt.A02(c58883QEt, qf6);
        c58883QEt.A0Y.A00.A09.A01 = qf6.A05();
    }

    public void DFB(Context context, Intent intent, View view, InterfaceC172717mh interfaceC172717mh, InterfaceC65594Tnc interfaceC65594Tnc, InterfaceC172727mi interfaceC172727mi) {
        this.A00 = context;
        this.A01 = intent;
        this.A02 = view;
        this.A03 = interfaceC172717mh;
        this.A04 = interfaceC172727mi;
        this.A05 = interfaceC65594Tnc;
    }

    public final boolean DJw() {
        R8Y r8y;
        if ((this instanceof C58887QEx) && (r8y = ((C58887QEx) this).A03) != null) {
            ((T2U) r8y).A00.Aa4().A01();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r7.A00 == r9) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DK1(android.content.Intent r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63223SfY.DK1(android.content.Intent, java.lang.String):boolean");
    }

    public final void DPh(QF6 qf6, String str) {
        Object obj;
        if (this instanceof C58883QEt) {
            obj = ((C58883QEt) this).A0g.get(qf6);
        } else {
            if (!(this instanceof C58882QEs)) {
                return;
            }
            AbstractC167017dG.A1N(qf6, str);
            obj = ((C58882QEs) this).A06.get(qf6);
        }
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = (BrowserLiteJSBridgeProxy) obj;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A09(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013c, code lost:
    
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.0iw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.0iw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void DXT(X.QF6 r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63223SfY.DXT(X.QF6, java.lang.String):void");
    }

    public void DXW(QF6 qf6, long j) {
        InterfaceC172717mh interfaceC172717mh;
        View view;
        View findViewById;
        HeliumWebViewExtensions heliumWebViewExtensions;
        if (this instanceof C58881QEr) {
            C58881QEr c58881QEr = (C58881QEr) this;
            c58881QEr.A00 = qf6;
            if (!c58881QEr.A02) {
                if (c58881QEr.A0F) {
                    if (c58881QEr.A0G && (heliumWebViewExtensions = ((SystemWebView) qf6).A01) != null) {
                        heliumWebViewExtensions.evaluateJavaScriptOnAllFrames("(function() {\n  return simHash();\n\n  // Generates a Simhash for the page to detect cloaking.\n  // https://arxiv.org/pdf/1710.01387.pdf\n  function simHash() {\n    const countsText = [];\n    const countsDOM = [];\n      // Initialize a counts array with 64 zeros.\n    for (let i = 0; i < 64; i++) {\n      countsText.push(0);\n      countsDOM.push(0);\n    }\n\n    hashText(countsText);\n    // Copy counts from text only to text and dom\n    const countsTextAndDOM = countsText.slice();\n    hashDomNode(document.documentElement, countsDOM, countsTextAndDOM);\n    return {\n      \"text_and_dom\": generateFinalHash(countsTextAndDOM),\n      \"text_only\": generateFinalHash(countsText),\n      \"dom_only\": generateFinalHash(countsDOM),\n    };\n  }\n\n  // Hash unigrams, bigrams and trigrams in text.\n  function hashText(counts) {\n    // https://github.com/fergiemcdowall/stopword/blob/master/lib/stopwords_en.js\n    // TODO: Internationalization.\n    const stopWords = new Set([\n      'about', 'after', 'all', 'also', 'am', 'an', 'and', 'another', 'any',\n      'are', 'as', 'at', 'be', 'because', 'been', 'before', 'being', 'between',\n      'both', 'but', 'by', 'came', 'can', 'come', 'could', 'did', 'do', 'each',\n      'for', 'from', 'get', 'got', 'has', 'had', 'he', 'have', 'her', 'here',\n      'him', 'himself', 'his', 'how', 'if', 'in', 'into', 'is', 'it', 'like',\n      'make', 'many', 'me', 'might', 'more', 'most', 'much', 'must', 'my',\n      'never', 'now', 'of', 'on', 'only', 'or', 'other', 'our', 'out', 'over',\n      'said', 'same', 'see', 'should', 'since', 'some', 'still', 'such', 'take',\n      'than', 'that', 'the', 'their', 'them', 'then', 'there', 'these', 'they',\n      'this', 'those', 'through', 'to', 'too', 'under', 'up', 'very', 'was',\n      'way', 'we', 'well', 'were', 'what', 'where', 'which', 'while', 'who',\n      'with', 'would', 'you', 'your', 'a', 'i']);\n\n    const words = (document.body.textContent.match(/\\b\\S+\\b/g) || [])\n      .map(word => word.toLowerCase())\n      .filter(word => word.length > 2 && !stopWords.has(word));\n\n    for (let i = 0; i < words.length; i++) {\n      hashAndUpdateCounts(words[i], counts);\n      if (i < words.length - 1)\n        hashAndUpdateCounts(`${words[i]},${words[i + 1]}`, counts);\n      if (i < words.length - 2)\n        hashAndUpdateCounts(\n          `${words[i]},${words[i + 1]},${words[i + 2]}`,\n          counts);\n    }\n  }\n\n  // Traverses the DOM tree depth-first, hashing each node + node-parent pair\n  // and updating counts.\n  function hashDomNode(domNode, counts, countsTextAndDOM, parentString) {\n    let domNodeString = stringifyDomNode(domNode);\n    for (let i = 0; i < domNode.children.length; i++) {\n      hashDomNode(domNode.children[i], counts, countsTextAndDOM, domNodeString);\n    }\n\n    if (parentString) {\n      domNodeString = `${parentString},${domNodeString}`;\n    }\n\n    hashAndUpdateCounts(domNodeString, counts);\n    hashAndUpdateCounts(domNodeString, countsTextAndDOM);\n  }\n\n  // We include the tag name, and the attribute list.\n  function stringifyDomNode(domNode) {\n    let str = `${domNode.tagName}[`;\n    for (let i = 0; i < domNode.attributes.length; i++) {\n      str += `${domNode.attributes[i].nodeName},`;\n    }\n\n    str += \"]\";\n    return str;\n  }\n\n  // Generates the final hash from counts.\n  function generateFinalHash(counts) {\n    let simHash = \"\";\n    for (let i = 0; i < counts.length; i += 4) {\n      let int16 = 0;\n      for (let j = 0; j < 4; j++) {\n        if (counts[i + j] >= 0) {\n          int16 += Math.pow(2, j);\n        }\n      }\n\n      simHash = int16.toString(16) + simHash;\n    }\n\n    return simHash;\n  }\n\n  // Implementation of FNV-1a (64 bit) hash function.\n  // https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function\n  // Cryptographic hash functions (e.g. md5, sha) are designed to be secure, not\n  // fast. For our purposes, FNV-1a is a great candidate in terms of speed and\n  // uniqueness.\n  // https://softwareengineering.stackexchange.com/questions/49550/which-hashing-algorithm-is-best-for-uniqueness-and-speed/145633#145633\n  function hashAndUpdateCounts(str, counts) {\n    // Use 4 parts of 16 bits to manipulate and generate the 64 bit hash. The\n    // maximum value of a 64 bit unsigned int falls above\n    // Number.MAX_SAFE_INTEGER (25^3 - 1) in JavaScript. Since multiplication\n    // of two 32 bit numbers can still go above that value, we resort to using\n    // 16 bit parts to make multiplication convenient.\n\n    // 64 bit FNV offset basis: 0xcbf29ce484222325\n    let hash00 = 0x2325;\n    let hash16 = 0x8422;\n    let hash32 = 0x9ce4;\n    let hash48 = 0xcbf2;\n\n    // 64 bit FNV prime: 2**40 + 2**8 + 0xb3 = 1099511628211\n    const fnvp00 = 0xb3 + Math.pow(2, 8);\n    const fnvp16 = 0;\n    const fnvp32 = Math.pow(2, 8);\n    const fnvp48 = 0;\n\n    for (let i = 0; i < str.length; i++) {\n      // XOR with each byte of data\n      hash00 ^= str.charCodeAt(i);\n\n      // Multiply by FNV prime, part by part.\n      const temp00 = hash00 * fnvp00;\n\n      const temp16 = (temp00 >>> 16) +\n                     hash16 * fnvp00 +\n                     hash00 * fnvp16;\n\n      const temp32 = (temp16 >>> 16) +\n                     hash32 * fnvp00 +\n                     hash16 * fnvp16 +\n                     hash00 * fnvp32;\n\n      const temp48 = (temp32 >>> 16) +\n                     hash48 * fnvp00 +\n                     hash32 * fnvp16 +\n                     hash16 * fnvp32 +\n                     hash00 * fnvp48;\n\n      hash00 = temp00 & 0xffff;\n      hash16 = temp16 & 0xffff;\n      hash32 = temp32 & 0xffff;\n      hash48 = temp48 & 0xffff;\n    }\n\n    // Update counts using each hash part.\n    updateCounts(hash00, 0, counts);\n    updateCounts(hash16, 16, counts);\n    updateCounts(hash32, 32, counts);\n    updateCounts(hash48, 48, counts);\n  }\n\n  function updateCounts(uint16, offset, counts) {\n    for (let i = 0; i < 16; i++) {\n      counts[offset + i] = uint16 & (0x1 << i)\n        ? counts[offset + i] + 1\n        : counts[offset + i] - 1;\n    }\n  }\n})();\n", new C63524Sor(c58881QEr, 1));
                        return;
                    }
                    qf6.A0F(new C63959Swj(c58881QEr, 3), "(function() {\n  return simHash();\n\n  // Generates a Simhash for the page to detect cloaking.\n  // https://arxiv.org/pdf/1710.01387.pdf\n  function simHash() {\n    const countsText = [];\n    const countsDOM = [];\n      // Initialize a counts array with 64 zeros.\n    for (let i = 0; i < 64; i++) {\n      countsText.push(0);\n      countsDOM.push(0);\n    }\n\n    hashText(countsText);\n    // Copy counts from text only to text and dom\n    const countsTextAndDOM = countsText.slice();\n    hashDomNode(document.documentElement, countsDOM, countsTextAndDOM);\n    return {\n      \"text_and_dom\": generateFinalHash(countsTextAndDOM),\n      \"text_only\": generateFinalHash(countsText),\n      \"dom_only\": generateFinalHash(countsDOM),\n    };\n  }\n\n  // Hash unigrams, bigrams and trigrams in text.\n  function hashText(counts) {\n    // https://github.com/fergiemcdowall/stopword/blob/master/lib/stopwords_en.js\n    // TODO: Internationalization.\n    const stopWords = new Set([\n      'about', 'after', 'all', 'also', 'am', 'an', 'and', 'another', 'any',\n      'are', 'as', 'at', 'be', 'because', 'been', 'before', 'being', 'between',\n      'both', 'but', 'by', 'came', 'can', 'come', 'could', 'did', 'do', 'each',\n      'for', 'from', 'get', 'got', 'has', 'had', 'he', 'have', 'her', 'here',\n      'him', 'himself', 'his', 'how', 'if', 'in', 'into', 'is', 'it', 'like',\n      'make', 'many', 'me', 'might', 'more', 'most', 'much', 'must', 'my',\n      'never', 'now', 'of', 'on', 'only', 'or', 'other', 'our', 'out', 'over',\n      'said', 'same', 'see', 'should', 'since', 'some', 'still', 'such', 'take',\n      'than', 'that', 'the', 'their', 'them', 'then', 'there', 'these', 'they',\n      'this', 'those', 'through', 'to', 'too', 'under', 'up', 'very', 'was',\n      'way', 'we', 'well', 'were', 'what', 'where', 'which', 'while', 'who',\n      'with', 'would', 'you', 'your', 'a', 'i']);\n\n    const words = (document.body.textContent.match(/\\b\\S+\\b/g) || [])\n      .map(word => word.toLowerCase())\n      .filter(word => word.length > 2 && !stopWords.has(word));\n\n    for (let i = 0; i < words.length; i++) {\n      hashAndUpdateCounts(words[i], counts);\n      if (i < words.length - 1)\n        hashAndUpdateCounts(`${words[i]},${words[i + 1]}`, counts);\n      if (i < words.length - 2)\n        hashAndUpdateCounts(\n          `${words[i]},${words[i + 1]},${words[i + 2]}`,\n          counts);\n    }\n  }\n\n  // Traverses the DOM tree depth-first, hashing each node + node-parent pair\n  // and updating counts.\n  function hashDomNode(domNode, counts, countsTextAndDOM, parentString) {\n    let domNodeString = stringifyDomNode(domNode);\n    for (let i = 0; i < domNode.children.length; i++) {\n      hashDomNode(domNode.children[i], counts, countsTextAndDOM, domNodeString);\n    }\n\n    if (parentString) {\n      domNodeString = `${parentString},${domNodeString}`;\n    }\n\n    hashAndUpdateCounts(domNodeString, counts);\n    hashAndUpdateCounts(domNodeString, countsTextAndDOM);\n  }\n\n  // We include the tag name, and the attribute list.\n  function stringifyDomNode(domNode) {\n    let str = `${domNode.tagName}[`;\n    for (let i = 0; i < domNode.attributes.length; i++) {\n      str += `${domNode.attributes[i].nodeName},`;\n    }\n\n    str += \"]\";\n    return str;\n  }\n\n  // Generates the final hash from counts.\n  function generateFinalHash(counts) {\n    let simHash = \"\";\n    for (let i = 0; i < counts.length; i += 4) {\n      let int16 = 0;\n      for (let j = 0; j < 4; j++) {\n        if (counts[i + j] >= 0) {\n          int16 += Math.pow(2, j);\n        }\n      }\n\n      simHash = int16.toString(16) + simHash;\n    }\n\n    return simHash;\n  }\n\n  // Implementation of FNV-1a (64 bit) hash function.\n  // https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function\n  // Cryptographic hash functions (e.g. md5, sha) are designed to be secure, not\n  // fast. For our purposes, FNV-1a is a great candidate in terms of speed and\n  // uniqueness.\n  // https://softwareengineering.stackexchange.com/questions/49550/which-hashing-algorithm-is-best-for-uniqueness-and-speed/145633#145633\n  function hashAndUpdateCounts(str, counts) {\n    // Use 4 parts of 16 bits to manipulate and generate the 64 bit hash. The\n    // maximum value of a 64 bit unsigned int falls above\n    // Number.MAX_SAFE_INTEGER (25^3 - 1) in JavaScript. Since multiplication\n    // of two 32 bit numbers can still go above that value, we resort to using\n    // 16 bit parts to make multiplication convenient.\n\n    // 64 bit FNV offset basis: 0xcbf29ce484222325\n    let hash00 = 0x2325;\n    let hash16 = 0x8422;\n    let hash32 = 0x9ce4;\n    let hash48 = 0xcbf2;\n\n    // 64 bit FNV prime: 2**40 + 2**8 + 0xb3 = 1099511628211\n    const fnvp00 = 0xb3 + Math.pow(2, 8);\n    const fnvp16 = 0;\n    const fnvp32 = Math.pow(2, 8);\n    const fnvp48 = 0;\n\n    for (let i = 0; i < str.length; i++) {\n      // XOR with each byte of data\n      hash00 ^= str.charCodeAt(i);\n\n      // Multiply by FNV prime, part by part.\n      const temp00 = hash00 * fnvp00;\n\n      const temp16 = (temp00 >>> 16) +\n                     hash16 * fnvp00 +\n                     hash00 * fnvp16;\n\n      const temp32 = (temp16 >>> 16) +\n                     hash32 * fnvp00 +\n                     hash16 * fnvp16 +\n                     hash00 * fnvp32;\n\n      const temp48 = (temp32 >>> 16) +\n                     hash48 * fnvp00 +\n                     hash32 * fnvp16 +\n                     hash16 * fnvp32 +\n                     hash00 * fnvp48;\n\n      hash00 = temp00 & 0xffff;\n      hash16 = temp16 & 0xffff;\n      hash32 = temp32 & 0xffff;\n      hash48 = temp48 & 0xffff;\n    }\n\n    // Update counts using each hash part.\n    updateCounts(hash00, 0, counts);\n    updateCounts(hash16, 16, counts);\n    updateCounts(hash32, 32, counts);\n    updateCounts(hash48, 48, counts);\n  }\n\n  function updateCounts(uint16, offset, counts) {\n    for (let i = 0; i < 16; i++) {\n      counts[offset + i] = uint16 & (0x1 << i)\n        ? counts[offset + i] + 1\n        : counts[offset + i] - 1;\n    }\n  }\n})();\n", false);
                }
                qf6.A0F(new C63959Swj(c58881QEr, 4), "(function () { \n  return getDOMTagCounts();\n  function getDOMTagCounts() { \n    const allElements = document.documentElement.getElementsByTagName(\"*\");\n    const tagToCount = {};\n    for (let i = 0; i < allElements.length; i++) {\n      const nodeName = allElements.item(i).nodeName.toUpperCase();\n      if (!(nodeName in tagToCount)) {\n        tagToCount[nodeName] = 0;\n      }\n      tagToCount[nodeName]++;\n    }\n    return tagToCount;\n  }\n})();", false);
                return;
            }
            return;
        }
        if (this instanceof C58884QEu) {
            C62914SWv c62914SWv = ((C58884QEu) this).A00;
            if (c62914SWv == null || c62914SWv.A01 != null) {
                return;
            }
            c62914SWv.A01 = Long.valueOf(j);
            return;
        }
        if (this instanceof C58883QEt) {
            C58883QEt c58883QEt = (C58883QEt) this;
            C58883QEt.A02(c58883QEt, qf6);
            c58883QEt.A00 = SystemClock.elapsedRealtime();
        } else {
            if (!(this instanceof AbstractC58879QEp)) {
                return;
            }
            AbstractC58879QEp abstractC58879QEp = (AbstractC58879QEp) this;
            C14360o3.A0B(qf6, 0);
            QJj qJj = abstractC58879QEp.A01;
            if (qJj == null || !qJj.A05 || (interfaceC172717mh = ((AbstractC63223SfY) abstractC58879QEp).A03) == null || (view = ((BrowserLiteFragment) interfaceC172717mh).A0C) == null || (findViewById = view.findViewById(R.id.shops_lite_disclaimer_layout)) == null) {
                return;
            }
            STG.A00(new RunnableC64551TJn(findViewById));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0175, code lost:
    
        if (r13 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DXd(java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63223SfY.DXd(java.lang.String):void");
    }

    public final void DXq(boolean z) {
        QIj qIj;
        if (this instanceof C58885QEv) {
            C58885QEv.A00((C58885QEv) this);
            return;
        }
        if (this instanceof C58884QEu) {
            C58884QEu.A00((C58884QEu) this);
            return;
        }
        if (!(this instanceof C58883QEt)) {
            return;
        }
        C58883QEt c58883QEt = (C58883QEt) this;
        C63380Siu c63380Siu = c58883QEt.A05;
        if (!c58883QEt.A0N || c63380Siu == null || (qIj = (QIj) c63380Siu.A0Q.A00.A06.A01) == null || c63380Siu.A0D == null) {
            return;
        }
        c63380Siu.A0J(qIj, AbstractC63348Si5.A00(qIj), "IAB_PAUSE");
    }

    public final void Dkz(String str) {
        C62526SFc c62526SFc;
        if ((this instanceof C58885QEv) && (c62526SFc = ((C58885QEv) this).A00) != null) {
            c62526SFc.A00 = str;
        }
    }

    public final void DnJ(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        SOE soe;
        if ((this instanceof C58883QEt) && (soe = ((C58883QEt) this).A06) != null && z != z2) {
            soe.A04 = z2;
            if (soe.A08.A00.A0M.A02 == C05F.A01 && z2) {
                soe.A01();
            } else {
                soe.A00();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (r11.A0A(false) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DuA(android.view.MotionEvent r15, android.view.View r16) {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.C58883QEt
            if (r0 == 0) goto L2e
            r1 = r14
            X.QEt r1 = (X.C58883QEt) r1
            boolean r0 = r1.A0N
            if (r0 == 0) goto L2e
            X.Siu r8 = r1.A05
            if (r8 == 0) goto L2e
            boolean r0 = r8.A0K
            if (r0 == 0) goto L2e
            r2 = 1
            int r0 = r15.getAction()
            if (r2 != r0) goto L2e
            X.5G6 r9 = r8.A0Q
            X.Sam r5 = r9.A02
            r7 = 0
            r4 = 772808057(0x2e101d79, float:3.2767986E-11)
            r12 = 0
            java.lang.Integer r3 = r5.A00(r12, r4, r7)
            X.QF6 r0 = r8.A06
            if (r0 != 0) goto L2f
            r5.A01(r3, r12, r4)
        L2e:
            return
        L2f:
            X.QEt r1 = r8.A03
            java.lang.String r0 = r0.A05()
            java.lang.String r6 = X.AbstractC63387Sj3.A02(r0)
            if (r6 == 0) goto Ld5
            java.util.Map r0 = r1.A0f
            java.lang.Object r0 = r0.get(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto Ld5
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Ld5
            X.SJd r6 = r9.A00
            X.QIh r0 = r6.A09
            java.lang.String r0 = r0.A01
            boolean r0 = r1.A0K(r0)
            if (r0 != 0) goto Ld5
            java.lang.String r0 = "updateSavedDataStart"
            r5.A02(r3, r12, r0, r4)
            X.QF6 r0 = r8.A06
            X.Q4Z r1 = r0.A04()
            r8.A0H(r1)
            java.lang.String r0 = "updateSavedDataEnd"
            r5.A02(r3, r12, r0, r4)
            java.lang.String r0 = "updateDetectedFieldsDataStart"
            r5.A02(r3, r12, r0, r4)
            r8.A0G(r1)
            java.lang.String r0 = "updateDetectedFieldsDataEnd"
            r5.A02(r3, r12, r0, r4)
            X.1yW r11 = r9.A04
            X.C14360o3.A0B(r11, r7)
            X.QIl r0 = r6.A00
            java.lang.String r6 = r0.A01
            boolean r0 = X.AbstractC63231Sfj.A03(r11, r7)
            if (r0 != 0) goto La0
            com.instagram.common.session.UserSession r1 = r11.A00
            X.0Tz r0 = X.C06090Tz.A05
            java.lang.String r1 = X.AbstractC58320PtC.A0y(r0, r1)
            java.lang.String r0 = "PERSISTENT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La0
            boolean r0 = r11.A0A(r7)
            if (r0 == 0) goto Ld1
        La0:
            if (r6 == 0) goto Ld1
            X.QF6 r9 = r8.A06
            X.TW0 r6 = new X.TW0
            r6.<init>(r8, r2)
            android.os.Handler r2 = X.AbstractC167007dF.A0J()
            java.util.concurrent.CompletableFuture r10 = new java.util.concurrent.CompletableFuture
            r10.<init>()
            r0 = 19
            X.Td9 r1 = new X.Td9
            r1.<init>(r0, r2, r6)
            X.TVN r0 = new X.TVN
            r0.<init>(r1, r7)
            r10.thenApplyAsync(r0)
            X.19K r1 = X.SVZ.A00()
            r13 = 38
            X.PZq r8 = new X.PZq
            r8.<init>(r9, r10, r11, r12, r13)
            X.191 r0 = X.AnonymousClass191.A00
            X.AbstractC23641Du.A05(r0, r8, r1)
        Ld1:
            r5.A01(r3, r12, r4)
            return
        Ld5:
            r5.A01(r3, r12, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63223SfY.DuA(android.view.MotionEvent, android.view.View):void");
    }

    public final void Ej3(QF6 qf6, Boolean bool, Boolean bool2, String str) {
        Object obj;
        C62914SWv c62914SWv;
        if (this instanceof C58884QEu) {
            C58884QEu c58884QEu = (C58884QEu) this;
            if (!AbstractC166997dE.A1Z(bool, false)) {
                C62914SWv c62914SWv2 = c58884QEu.A00;
                if (c62914SWv2 != null && c62914SWv2.A01 != null) {
                    C58884QEu.A00(c58884QEu);
                }
                if (c58884QEu.A00 == null) {
                    c58884QEu.A00 = new C62914SWv(AbstractC31173DnH.A0g(), AbstractC31171DnF.A0l(), false);
                }
                if (AbstractC166997dE.A1Z(bool2, true) && (c62914SWv = c58884QEu.A00) != null) {
                    c62914SWv.A04.add(str);
                    return;
                }
                return;
            }
            return;
        }
        if (this instanceof C58881QEr) {
            C58881QEr c58881QEr = (C58881QEr) this;
            if (bool == null || bool2 == null || !bool.booleanValue()) {
                return;
            }
            c58881QEr.A0C.put(str, bool2);
            return;
        }
        if (this instanceof C58883QEt) {
            obj = ((C58883QEt) this).A0g.get(qf6);
        } else {
            if (!(this instanceof C58882QEs)) {
                return;
            }
            AbstractC167017dG.A1N(qf6, str);
            obj = ((C58882QEs) this).A06.get(qf6);
        }
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = (BrowserLiteJSBridgeProxy) obj;
        if (browserLiteJSBridgeProxy == null) {
            return;
        }
        browserLiteJSBridgeProxy.A09(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r1.A0K.booleanValue() == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FE3(X.QF6 r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C58882QEs
            if (r0 == 0) goto L11
            r1 = r4
            X.QEs r1 = (X.C58882QEs) r1
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.util.HashMap r0 = r1.A06
            r0.remove(r5)
        L10:
            return
        L11:
            boolean r0 = r4 instanceof X.C58887QEx
            if (r0 == 0) goto L7b
            r0 = r4
            X.QEx r0 = (X.C58887QEx) r0
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            X.SPI r2 = r0.A01
            if (r2 == 0) goto L10
            boolean r0 = r2 instanceof X.QES
            if (r0 == 0) goto L10
            X.QES r2 = (X.QES) r2
            boolean r0 = r2.A04
            if (r0 == 0) goto L73
            java.lang.ref.WeakReference r0 = r2.A00
            if (r0 == 0) goto L88
            java.lang.Object r1 = r0.get()
            X.QF6 r1 = (X.QF6) r1
            if (r1 == 0) goto L73
            r0 = r1
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.R7V r0 = r0.A04
            android.webkit.WebSettings r0 = r0.getSettings()
            boolean r0 = r0.supportMultipleWindows()
            if (r0 == 0) goto L4e
            java.lang.Boolean r0 = r1.A0K
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L4f
        L4e:
            r0 = 0
        L4f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r3)
            if (r0 == 0) goto L73
            java.lang.ref.WeakReference r0 = r2.A00
            if (r0 == 0) goto L88
            java.lang.Object r0 = r0.get()
            X.RqN r0 = (X.AbstractC61598RqN) r0
            r1 = 0
            if (r0 == 0) goto L6a
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.R7V r1 = r0.A04
        L6a:
            boolean r0 = r1 instanceof android.webkit.WebView
            if (r0 == 0) goto L73
            if (r1 == 0) goto L73
            X.AbstractC022408w.A03(r1)
        L73:
            java.lang.ref.WeakReference r0 = r2.A00
            if (r0 == 0) goto L10
            r0.clear()
            return
        L7b:
            boolean r0 = r4 instanceof X.C58883QEt
            if (r0 == 0) goto L10
            r0 = r4
            X.QEt r0 = (X.C58883QEt) r0
            java.util.Map r0 = r0.A0g
            r0.remove(r5)
            return
        L88:
            java.lang.String r0 = "browserLiteWebView"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63223SfY.FE3(X.QF6):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C63380Siu c63380Siu;
        if (this instanceof C58883QEt) {
            C58883QEt c58883QEt = (C58883QEt) this;
            if (i2 == -1 && i == 1000) {
                String stringExtra = intent.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE");
                if ("save_autofill_request_fragment".equals(stringExtra)) {
                    try {
                        QF6 C9a = ((AbstractC63223SfY) c58883QEt).A04.C9a();
                        c58883QEt.A08(Bundle.EMPTY, (AutofillSharedJSBridgeProxy) c58883QEt.A0g.get(C9a), new AutofillData(AbstractC58318PtA.A17(intent.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING"))), null);
                    } catch (JSONException unused) {
                        throw AbstractC166987dD.A14("Illegal JSON for autofill save");
                    }
                } else if ("autofill_request_fragment".equals(stringExtra)) {
                    QF6 C9a2 = ((AbstractC63223SfY) c58883QEt).A04.C9a();
                    ArrayList A05 = AbstractC63402SjX.A05(intent.getStringArrayListExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"));
                    if (!A05.isEmpty()) {
                        c58883QEt.A0A((AutofillSharedJSBridgeProxy) c58883QEt.A0g.get(C9a2), null, A05);
                    }
                }
            }
            if (c58883QEt.A0N && (c63380Siu = c58883QEt.A05) != null) {
                if (i == 1001) {
                    c63380Siu.A0E(i2, intent);
                }
                c58883QEt.A05.A0C();
            }
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this instanceof AbstractC58880QEq) {
            AbstractC58880QEq abstractC58880QEq = (AbstractC58880QEq) this;
            float f = i2 - i4;
            if (Math.abs(i - i3) <= Math.abs(f)) {
                if (f < 0.0f) {
                    LinearLayout linearLayout = abstractC58880QEq.A00;
                    if (linearLayout != null) {
                        if (abstractC58880QEq.A02) {
                            linearLayout.setVisibility(8);
                            abstractC58880QEq.A01 = false;
                            return;
                        }
                        if (!abstractC58880QEq.A01) {
                            linearLayout.setVisibility(0);
                            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, linearLayout.getHeight(), 0.0f);
                            translateAnimation.setDuration(500L);
                            AbstractC58320PtC.A1H(translateAnimation);
                            linearLayout.startAnimation(translateAnimation);
                        }
                        abstractC58880QEq.A01 = true;
                        return;
                    }
                    return;
                }
                abstractC58880QEq.A02();
            }
        }
    }

    public static void A04(C58883QEt c58883QEt, C61602RqR c61602RqR) {
        c61602RqR.A0P = !c58883QEt.A0H();
    }
}
