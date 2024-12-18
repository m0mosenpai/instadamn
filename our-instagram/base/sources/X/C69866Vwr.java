package X;

import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vwr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69866Vwr {
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1um, X.UyZ, X.1ul] */
    public static C67800UyZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(792).equals(A0s)) {
                    c40791um.A00 = VO8.parseFromJson(c16l);
                } else if ("collection_creation_time_ms".equals(A0s)) {
                    c40791um.A06 = Double.valueOf(c16l.A0U());
                } else if ("collection_creator".equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    c40791um.A02 = AbstractC38851rI.A00(c16l, false);
                } else if ("collection_deadline_ms".equals(A0s)) {
                    c40791um.A07 = Double.valueOf(c16l.A0U());
                } else if ("collection_expiration_ms".equals(A0s)) {
                    c40791um.A08 = Double.valueOf(c16l.A0U());
                } else {
                    ArrayList arrayList = null;
                    if ("collection_subtitle".equals(A0s)) {
                        c40791um.A0C = AbstractC167017dG.A0m(c16l);
                    } else if ("collection_title".equals(A0s)) {
                        c40791um.A0D = AbstractC167017dG.A0m(c16l);
                    } else if ("collection_type".equals(A0s)) {
                        c40791um.A0E = AbstractC167017dG.A0m(c16l);
                    } else if ("is_collection_complete".equals(A0s)) {
                        c40791um.A03 = AbstractC166997dE.A0d(c16l);
                    } else if ("is_recurring".equals(A0s)) {
                        c40791um.A04 = AbstractC166997dE.A0d(c16l);
                    } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C32048E6a parseFromJson = AbstractC33674EuO.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A0G = arrayList;
                    } else if (AbstractC43591JPw.A00(177).equals(A0s)) {
                        c40791um.A0F = AbstractC167017dG.A0m(c16l);
                    } else if ("recurrence_day".equals(A0s)) {
                        c40791um.A09 = AbstractC166997dE.A0h(c16l);
                    } else if (AbstractC111324zv.A00(271).equals(A0s)) {
                        c40791um.A0A = AbstractC166997dE.A0h(c16l);
                    } else if ("user_contribution_count".equals(A0s)) {
                        c40791um.A0B = AbstractC166997dE.A0h(c16l);
                    } else if ("user_has_contributed".equals(A0s)) {
                        c40791um.A05 = AbstractC166997dE.A0d(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            C51756Mtf c51756Mtf = c40791um.A00;
            Double d = c40791um.A06;
            User user = c40791um.A02;
            Double d2 = c40791um.A07;
            Double d3 = c40791um.A08;
            String str = c40791um.A0C;
            String str2 = c40791um.A0D;
            String str3 = c40791um.A0E;
            Boolean bool = c40791um.A03;
            Boolean bool2 = c40791um.A04;
            List list = c40791um.A0G;
            String str4 = c40791um.A0F;
            c40791um.A01 = new C32054E6g(c51756Mtf, user, bool, bool2, c40791um.A05, d, d2, d3, c40791um.A09, c40791um.A0A, c40791um.A0B, str, str2, str3, str4, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
