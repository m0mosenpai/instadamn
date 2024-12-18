package X;

import com.facebook.endtoend.EndToEnd;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.1oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37411oe {
    public static final String A00(AbstractC12990ll abstractC12990ll) {
        StringBuilder sb;
        String group;
        UserSession A01;
        String str = AbstractC11270ij.A00;
        if ((abstractC12990ll == null || (A01 = AbstractC03270Dk.A01(abstractC12990ll)) == null || !C18U.A06(C06090Tz.A05, A01, 36316061611593651L) || C1C0.A00(A01)) && C1RQ.A00().A05(EnumC27091Ti.A0M)) {
            String str2 = "";
            String string = AbstractC11400iy.A00().A00.getString("logging_host", "");
            if (string != null) {
                str2 = string;
            }
            if (str2.length() != 0) {
                str = AbstractC11270ij.A00(str2);
            }
        }
        if (EndToEnd.isRunningEndToEndTest() && C14360o3.A0K(str, str) && EndToEnd.isRunningEndToEndTest()) {
            String str3 = "prod";
            if (EndToEnd.isRunningEndToEndTest()) {
                Map A012 = EndToEnd.A01();
                if (A012.containsKey("/settings/sandbox/web/sandbox")) {
                    String optString = ((JSONObject) A012.get("/settings/sandbox/web/sandbox")).optString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "prod");
                    if (optString.contains(".facebook")) {
                        str3 = optString.split(".facebook")[0];
                    }
                }
            }
            if (!C14360o3.A0K(str3, "prod")) {
                C14360o3.A0A(str3);
                if (str3.length() != 0) {
                    Matcher matcher = Pattern.compile("([0-9]+[.]od)").matcher(str3);
                    boolean find = matcher.find();
                    Matcher matcher2 = Pattern.compile("(sandcastle[0-9]+[.]\\w+[0-9]+)").matcher(str3);
                    boolean find2 = matcher2.find();
                    Matcher matcher3 = Pattern.compile("(twshared[0-9]+[.]\\w+[0-9]+[.]\\w+[0-9])").matcher(str3);
                    boolean find3 = matcher3.find();
                    if (find) {
                        sb = new StringBuilder();
                        sb.append("graph.");
                        group = matcher.group(1);
                    } else if (find2) {
                        sb = new StringBuilder();
                        sb.append("graph.instance-hg.");
                        group = matcher2.group(1);
                    } else if (find3) {
                        sb = new StringBuilder();
                        sb.append("graph.instance-hg.");
                        group = matcher3.group(1);
                    }
                    sb.append(group);
                    sb.append(".facebook.com");
                    String obj = sb.toString();
                    if (obj != null) {
                        str = AbstractC11270ij.A00(obj);
                    }
                }
            }
        }
        C14360o3.A0A(str);
        return str;
    }
}
