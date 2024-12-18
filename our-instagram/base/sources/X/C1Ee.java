package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1Ee, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Ee {
    public static final Pattern A01 = Pattern.compile("\\{([\\w_\\d]+)\\}");
    public final Map A00 = new C005001p(0);

    public final InterfaceC26421Px A00(final boolean z) {
        Map map = this.A00;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((InterfaceC23811Eo) ((Map.Entry) it.next()).getValue()).isStreaming()) {
                C58613Pyh c58613Pyh = new C58613Pyh();
                for (Map.Entry entry : map.entrySet()) {
                    ((InterfaceC23811Eo) entry.getValue()).AAc(c58613Pyh, (String) entry.getKey());
                }
                return c58613Pyh;
            }
        }
        try {
            final LinkedList A03 = A03();
            return new InterfaceC26421Px(A03, z) { // from class: X.1Pv
                public final C23781El A00;
                public final byte[] A01;

                @Override // X.InterfaceC26421Px
                public final C23781El Aqy() {
                    return null;
                }

                @Override // X.InterfaceC26421Px
                public final C23781El Ar8() {
                    return this.A00;
                }

                @Override // X.InterfaceC26421Px
                public final InputStream E2i() {
                    return new ByteArrayInputStream(this.A01);
                }

                @Override // X.InterfaceC26421Px
                public final long getContentLength() {
                    return this.A01.length;
                }

                {
                    String str;
                    this.A01 = AbstractC26441Pz.A00(A03).getBytes(ReactWebViewManager.HTML_ENCODING);
                    if (z) {
                        str = "application/x-www-form-urlencoded; charset=UTF-8";
                    } else {
                        str = "application/x-www-form-urlencoded";
                    }
                    this.A00 = new C23781El("Content-Type", str);
                }
            };
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String A01(String str) {
        if (this.A00.size() != 0) {
            return AnonymousClass001.A0g(str, "?", AbstractC26441Pz.A00(A03()));
        }
        return str;
    }

    public final String A02(String str, boolean z) {
        Matcher matcher = A01.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            Map map = this.A00;
            InterfaceC23811Eo interfaceC23811Eo = (InterfaceC23811Eo) map.get(group);
            if (interfaceC23811Eo != null && (interfaceC23811Eo instanceof C23801En)) {
                matcher.appendReplacement(stringBuffer, ((C23801En) interfaceC23811Eo).A00);
                if (z) {
                    map.remove(group);
                }
            } else {
                throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("can't find string param %s to format the string", group));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final LinkedList A03() {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry entry : this.A00.entrySet()) {
            if (entry.getValue() instanceof C23801En) {
                linkedList.add(new C26391Pu((String) entry.getKey(), ((C23801En) entry.getValue()).A00));
            }
        }
        return linkedList;
    }

    public final void A04(C1Ee c1Ee, java.util.Set set) {
        for (Map.Entry entry : c1Ee.A00.entrySet()) {
            if (set == null || set.contains(entry.getKey())) {
                this.A00.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void A05(String str, String str2) {
        str.getClass();
        if (str2 != null) {
            this.A00.put(str, new C23801En(str2));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC26441Pz.A00(A03()));
        for (Map.Entry entry : this.A00.entrySet()) {
            if (((InterfaceC23811Eo) entry.getValue()).isStreaming()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append((String) entry.getKey());
                sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                sb.append("FILE");
            }
        }
        return sb.toString();
    }
}
