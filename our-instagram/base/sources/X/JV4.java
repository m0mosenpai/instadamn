package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class JV4 {
    public static C43707JUs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C43707JUs c43707JUs = new C43707JUs();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                ArrayList arrayList2 = null;
                if ("oldest_cursor".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c43707JUs.A05 = str;
                } else if ("newest_cursor".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c43707JUs.A04 = str2;
                } else if ("has_older".equals(A0q)) {
                    c43707JUs.A03 = Boolean.valueOf(c16l.A0d());
                } else if ("has_newer".equals(A0q)) {
                    c43707JUs.A02 = Boolean.valueOf(c16l.A0d());
                } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C83403nh A00 = C83403nh.A00(c16l, null, false);
                            if (A00 != null) {
                                arrayList2.add(A00);
                            }
                        }
                    }
                    c43707JUs.A06 = arrayList2;
                } else if ("shh_items".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C83403nh A002 = C83403nh.A00(c16l, null, false);
                            if (A002 != null) {
                                arrayList.add(A002);
                            }
                        }
                    }
                    c43707JUs.A07 = arrayList;
                } else if ("direct_story".equals(A0q)) {
                    c43707JUs.A01 = LCQ.parseFromJson(c16l);
                } else if ("last_permanent_item".equals(A0q)) {
                    c43707JUs.A00 = C83403nh.A00(c16l, null, false);
                } else {
                    AbstractC126445nf.A00(c16l, c43707JUs, A0q);
                }
                c16l.A0z();
            }
            c43707JUs.A02();
            return c43707JUs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
