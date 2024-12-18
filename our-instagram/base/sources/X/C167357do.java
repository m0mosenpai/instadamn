package X;

import com.instagram.api.schemas.NudgeType;
import com.instagram.api.schemas.NudgeVisualType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.7do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167357do {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.7dn, X.1um, X.1ul] */
    public static C167347dn parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                String str2 = null;
                if ("m21_media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList.add(A1P);
                            }
                        }
                    }
                    c40791um.A03 = arrayList;
                } else if ("nudge_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    NudgeType nudgeType = (NudgeType) NudgeType.A01.get(str2);
                    if (nudgeType == null) {
                        nudgeType = NudgeType.A0D;
                    }
                    c40791um.A01 = nudgeType;
                } else if (AbstractC111324zv.A00(1370).equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    NudgeVisualType nudgeVisualType = (NudgeVisualType) NudgeVisualType.A01.get(str);
                    if (nudgeVisualType == null) {
                        nudgeVisualType = NudgeVisualType.A05;
                    }
                    c40791um.A02 = nudgeVisualType;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            c40791um.A00 = new C168307fP(c40791um.A01, c40791um.A02, c40791um.A03);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
