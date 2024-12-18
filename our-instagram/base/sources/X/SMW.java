package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class SMW {
    public long A00;
    public String A01;
    public Map A02;
    public final Context A03;
    public final C62913SWu A04;

    public SMW(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C62913SWu c62913SWu = new C62913SWu(context);
        this.A00 = 2L;
        this.A02 = AbstractC166987dD.A1G();
        this.A03 = context.getApplicationContext();
        this.A04 = c62913SWu;
        this.A00 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36592240893690232L);
    }

    public final String A00(File file) {
        String absolutePath;
        String absolutePath2;
        C62913SWu c62913SWu = this.A04;
        String name = file.getName();
        Pattern pattern = C62913SWu.A05;
        if (AbstractC31175DnJ.A1Z(name, pattern)) {
            name = "__id__";
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (c62913SWu.A01 == null) {
                File parentFile2 = c62913SWu.A02.getDatabasePath("ignore").getParentFile();
                if (parentFile2 == null) {
                    String str = c62913SWu.A00;
                    if (str == null) {
                        C62431SBg c62431SBg = c62913SWu.A03;
                        if (c62431SBg != null) {
                            File file2 = c62431SBg.A00;
                            try {
                                str = file2.getCanonicalPath();
                            } catch (IOException unused) {
                                str = file2.getAbsolutePath();
                            }
                            C14360o3.A07(str);
                            c62913SWu.A00 = str;
                        } else {
                            throw AbstractC166987dD.A14("Sanitizer initialised without a valid path");
                        }
                    }
                    parentFile2 = new File(str, "databases");
                }
                try {
                    absolutePath2 = parentFile2.getCanonicalPath();
                } catch (IOException unused2) {
                    absolutePath2 = parentFile2.getAbsolutePath();
                }
                c62913SWu.A01 = absolutePath2;
            }
            try {
                absolutePath = parentFile.getCanonicalPath();
            } catch (IOException unused3) {
                absolutePath = parentFile.getAbsolutePath();
            }
            if (absolutePath.equals(c62913SWu.A01)) {
                String[] strArr = C62913SWu.A06;
                for (int i = 0; i < 9; i++) {
                    String str2 = strArr[i];
                    if (name.endsWith(str2)) {
                        name = name.replace(str2, "");
                    }
                }
            }
        }
        Matcher matcher = C62913SWu.A04.matcher(name);
        if (matcher.find()) {
            name = matcher.replaceAll("__hash__");
        }
        String replace = pattern.matcher(name).replaceAll("X").replace(' ', '_');
        if (replace.length() >= 64) {
            return "__hash__";
        }
        return replace;
    }
}
