package X;

import android.content.Context;
import android.util.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public abstract class ST9 {
    public static final ConcurrentHashMap A00 = AbstractC58318PtA.A14();

    public static final C1338462s A00(Context context, Integer num) {
        int i;
        String str;
        C102824kJ c102824kJ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        ConcurrentHashMap concurrentHashMap = A00;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            if (i != 0) {
                if (i != 16969) {
                    throw AbstractC166987dD.A14(AnonymousClass001.A0c("Expected a valid screen template for implementation key: ", ". Please ensure that your app provides one", i));
                }
                str = "json/bloks_screen_template_bottomsheet.json";
            } else {
                str = "json/bloks_screen_template.json";
            }
            try {
                InputStream open = context.getAssets().open(str);
                C14360o3.A07(open);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, StandardCharsets.UTF_8));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuffer.append(readLine);
                    }
                    String obj2 = stringBuffer.toString();
                    bufferedReader.close();
                    if (obj2 != null) {
                        C192928gY c192928gY = new C192928gY(new JsonReader(new StringReader(obj2)));
                        c192928gY.Csy();
                        C192948ga A002 = C192948ga.A00(c192928gY);
                        C14360o3.A07(A002);
                        C102794kG c102794kG = A002.A00;
                        if (c102794kG != null && (c102824kJ = c102794kG.A00) != null) {
                            C1338462s A03 = C1338462s.A03(null, c102824kJ, null);
                            obj = concurrentHashMap.putIfAbsent(valueOf, A03);
                            if (obj == null) {
                                obj = A03;
                            }
                        } else {
                            throw AbstractC166987dD.A12("Screen template must contain a valid BloksResponse");
                        }
                    }
                } finally {
                }
            } catch (IOException e) {
                AbstractC25241Le.A03("IgBloksScreenTemplateProvider", e);
            }
            throw AbstractC166987dD.A14(AnonymousClass001.A0c("Got null screen template for implementation key: ", ". Please make sure to provide a valid screen template!", i));
        }
        return (C1338462s) obj;
    }
}
