package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.VXa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68599VXa {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Vmi, java.lang.Object] */
    public static C69398Vmi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                HashMap hashMap = null;
                ArrayList arrayList = null;
                if ("context".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("enabled".equals(A0s)) {
                    obj.A03 = AbstractC166997dE.A0d(c16l);
                } else if ("report_tags".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69313VlL parseFromJson = VXZ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A06 = arrayList;
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A02 = IAW.parseFromJson(c16l);
                } else if ("subtitle".equals(A0s)) {
                    obj.A01 = IAW.parseFromJson(c16l);
                } else if ("footer".equals(A0s)) {
                    obj.A00 = IAW.parseFromJson(c16l);
                } else if ("report_info".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = new HashMap();
                        while (c16l.A1J() != c16r2) {
                            AbstractC31179DnN.A1F(c16l, hashMap);
                        }
                    }
                    obj.A05 = hashMap;
                }
                c16l.A0z();
            }
            if (obj.A03 == null) {
                obj.A03 = false;
                C0w9.A03("StartFRXReport Response", "'enabled' flag was null");
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
