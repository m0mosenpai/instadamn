package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class OOH {
    public static E72 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            E72 e72 = new E72();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_audio_translations_enabled".equals(A0s)) {
                    e72.A01 = c16l.A0d();
                } else if ("is_lip_sync_translations_enabled".equals(A0s)) {
                    e72.A02 = c16l.A0d();
                } else if ("selected_languages".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51587Mqf parseFromJson = AbstractC53872Ns0.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    e72.A00 = arrayList;
                }
                c16l.A0z();
            }
            return e72;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(E72 e72, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        anonymousClass182.A0T("is_audio_translations_enabled", e72.A01);
        anonymousClass182.A0T("is_lip_sync_translations_enabled", e72.A02);
        if (e72.A00 != null) {
            C16V.A03(anonymousClass182, "selected_languages");
            Iterator A1J = AbstractC25226BEj.A1J(e72.A00);
            while (A1J.hasNext()) {
                C51587Mqf c51587Mqf = (C51587Mqf) A1J.next();
                if (c51587Mqf != null) {
                    anonymousClass182.A0d();
                    String str = c51587Mqf.A01;
                    if (str != null) {
                        anonymousClass182.A0S("iso3_language_code", str);
                    }
                    String str2 = c51587Mqf.A00;
                    if (str2 != null) {
                        anonymousClass182.A0S("display_name", str2);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
