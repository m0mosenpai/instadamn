package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IOg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41265IOg {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1um, X.H9W, X.1ul] */
    public static H9W parseFromJson(C16L c16l) {
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
                if ("alacorn_session_id".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("dark_banner_message".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            TrackOrOriginalSoundSchema parseFromJson = AbstractC40426HwH.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("music_reels".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C37771pE parseFromJson2 = AbstractC38741r6.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c40791um.A05 = arrayList;
                } else if ("page_info".equals(A0s)) {
                    c40791um.A00 = AbstractC40099HqR.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A02;
            String str2 = c40791um.A03;
            List list = c40791um.A04;
            C14360o3.A0A(list);
            List list2 = c40791um.A05;
            C38602Gy5 c38602Gy5 = c40791um.A00;
            C14360o3.A0A(c38602Gy5);
            c40791um.A01 = new C51609Mr2(c38602Gy5, str, str2, list, list2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
