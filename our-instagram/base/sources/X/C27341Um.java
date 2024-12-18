package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27341Um {
    public final Map A00 = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0063: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:39:? (LINE:99), block:B:32:0x0063 */
    public C27341Um(File file) {
        BufferedReader bufferedReader;
        if (file.exists()) {
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                } finally {
                }
            } catch (IOException e) {
                e = e;
                bufferedReader = null;
            } catch (Throwable th) {
                throw th;
            }
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        C60472pW c60472pW = new C60472pW(readLine);
                        int i = c60472pW.A00;
                        Map map = this.A00;
                        if (i == 0) {
                            String str = c60472pW.A04;
                            map.containsKey(str);
                            map.put(str, Long.valueOf(c60472pW.A03));
                        } else {
                            map.remove(c60472pW.A04);
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    C0w9.A03("IgCacheLoggerImpl", StringFormatUtil.formatStrLocaleSafe("IOException found for file %s. Exception: %s", file.getName(), e.getLocalizedMessage()));
                    if (bufferedReader == null) {
                        return;
                    }
                    bufferedReader.close();
                    return;
                }
                try {
                    bufferedReader.close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
        }
    }
}
