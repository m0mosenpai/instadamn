package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.TextPostAppBottomSheetCTAType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IPO {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1um, X.H9X, X.1ul] */
    public static H9X parseFromJson(C16L c16l) {
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
                if ("cta_type".equals(A0s)) {
                    TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType = (TextPostAppBottomSheetCTAType) TextPostAppBottomSheetCTAType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (textPostAppBottomSheetCTAType == null) {
                        textPostAppBottomSheetCTAType = TextPostAppBottomSheetCTAType.A07;
                    }
                    c40791um.A00 = textPostAppBottomSheetCTAType;
                } else if ("facepile_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c40791um.A05 = arrayList;
                } else if (AbstractC58317Pt9.A00(800).equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(124).equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType2 = c40791um.A00;
            C14360o3.A0A(textPostAppBottomSheetCTAType2);
            List list = c40791um.A05;
            C14360o3.A0A(list);
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A02);
            String str = c40791um.A03;
            String str2 = c40791um.A04;
            C14360o3.A0A(str2);
            c40791um.A01 = new C45148Jyo(textPostAppBottomSheetCTAType2, str, str2, list, A1b);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
