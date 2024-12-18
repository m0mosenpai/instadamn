package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.ONk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54859ONk {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1um, X.N2Z, X.1ul] */
    public static N2Z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51665Mrw parseFromJson = AbstractC53794Nqk.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A06 = arrayList;
                } else if ("max_id".equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("memories".equals(A0s)) {
                    c40791um.A00 = AbstractC53793Nqj.parseFromJson(c16l);
                } else if ("more_available".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("num_results".equals(A0s)) {
                    c40791um.A02 = AbstractC31173DnH.A0h(c16l);
                } else if ("oldest_media_ts".equals(A0s)) {
                    c40791um.A03 = AbstractC31173DnH.A0h(c16l);
                } else if ("total_num_archive_media".equals(A0s)) {
                    c40791um.A04 = AbstractC31173DnH.A0h(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
