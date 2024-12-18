package X;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.facebook.R;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class WFP {
    public static WFP A05;
    public static Method A06;
    public static Method A07;
    public Method A00;
    public Method A01;
    public final C69584Vrn A03 = new Object();
    public final C68899Vdw A02 = new C68899Vdw();
    public final C68667Va3 A04 = new C68667Va3(this);

    public static boolean A03(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static WebView A00(View view) {
        if (view instanceof WebView) {
            return (WebView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                WebView A00 = A00(viewGroup.getChildAt(i));
                if (A00 != null) {
                    return A00;
                }
            }
            return null;
        }
        return null;
    }

    public static String A01(CharSequence charSequence, int i) {
        if (charSequence == null || charSequence.length() < 1) {
            return "";
        }
        String replace = charSequence.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        if (charSequence.length() > i) {
            return AnonymousClass001.A0R(replace.substring(0, i), "...");
        }
        return replace;
    }

    public static void A02(View view, PrintWriter printWriter) {
        Object tag = view.getTag(R.id.testing_id_view_tag_key);
        if (tag == null) {
            tag = view.getTag();
        }
        if (tag instanceof String) {
            String str = (String) tag;
            if (str.length() > 0) {
                printWriter.print(" app:tag/");
                printWriter.print(str.replace(' ', '_'));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(46:6|(3:8|(2:10|(1:12)(1:266))(1:268)|267)(1:269)|13|(1:15)|16|(1:18)(1:265)|19|(1:23)|264|25|(1:31)|32|(1:34)(1:263)|35|(1:37)(1:262)|38|(1:40)|41|(1:43)(1:261)|44|(1:46)|47|(1:49)(1:260)|50|(1:52)|53|(2:54|55)|(2:57|(20:60|(2:62|(2:64|65)(1:256))(1:257)|66|67|68|69|(1:71)(2:229|(5:231|(1:233)|234|(1:236)|237)(2:238|(5:240|(1:242)|243|(1:245)|237)(4:246|(1:249)|250|(1:254))))|72|(1:74)|76|(4:78|79|80|(21:82|83|84|(1:86)|87|88|(1:90)|91|(6:95|96|97|(7:100|(2:113|114)(3:102|(1:104)(1:112)|105)|106|107|109|110|98)|118|119)|122|(4:125|(3:127|128|129)(1:131)|130|123)|132|133|(1:135)|136|(1:140)|141|142|(1:144)|145|146))|157|(2:158|(12:206|207|(1:209)|228|211|212|(1:214)|(5:222|223|217|(1:219)|220)|216|217|(0)|220)(2:160|(1:205)(1:162)))|163|(2:165|(1:(1:185)(2:167|(7:170|171|172|173|(1:175)|176|(2:178|(2:180|181)(0))(1:183))(1:169))))(0)|186|(1:188)(1:204)|(1:191)|192|(1:202)(3:196|(1:197)|200)))|258|67|68|69|(0)(0)|72|(0)|76|(0)|157|(3:158|(0)(0)|205)|163|(0)(0)|186|(0)(0)|(1:191)|192|(2:194|202)(1:203)) */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0531, code lost:
    
        if (r4 != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r44.canScrollHorizontally(1) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01c0 A[Catch: Exception -> 0x0232, TryCatch #10 {Exception -> 0x0232, blocks: (B:69:0x0195, B:71:0x019b, B:72:0x01a6, B:74:0x01ac, B:229:0x01c0, B:231:0x01cc, B:233:0x01d0, B:234:0x01dc, B:236:0x01e4, B:238:0x01e9, B:240:0x01f1, B:242:0x01f5, B:243:0x0201, B:245:0x0209, B:246:0x0210, B:249:0x0218, B:250:0x021c, B:252:0x0222, B:254:0x0228), top: B:68:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b A[Catch: Exception -> 0x0232, TryCatch #10 {Exception -> 0x0232, blocks: (B:69:0x0195, B:71:0x019b, B:72:0x01a6, B:74:0x01ac, B:229:0x01c0, B:231:0x01cc, B:233:0x01d0, B:234:0x01dc, B:236:0x01e4, B:238:0x01e9, B:240:0x01f1, B:242:0x01f5, B:243:0x0201, B:245:0x0209, B:246:0x0210, B:249:0x0218, B:250:0x021c, B:252:0x0222, B:254:0x0228), top: B:68:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ac A[Catch: Exception -> 0x0232, TryCatch #10 {Exception -> 0x0232, blocks: (B:69:0x0195, B:71:0x019b, B:72:0x01a6, B:74:0x01ac, B:229:0x01c0, B:231:0x01cc, B:233:0x01d0, B:234:0x01dc, B:236:0x01e4, B:238:0x01e9, B:240:0x01f1, B:242:0x01f5, B:243:0x0201, B:245:0x0209, B:246:0x0210, B:249:0x0218, B:250:0x021c, B:252:0x0222, B:254:0x0228), top: B:68:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.view.View r44, java.io.PrintWriter r45, java.lang.String r46, int r47, int r48, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 1703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFP.A04(android.view.View, java.io.PrintWriter, java.lang.String, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
