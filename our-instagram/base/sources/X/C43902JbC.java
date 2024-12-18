package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.gallery.suggestions.database.SuggestionsDBHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.JbC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43902JbC {
    public final Context A00;
    public final UserSession A01;
    public final SuggestionsDBHelper A02;
    public final C43900JbA A03;
    public final C43898Jb8 A04;
    public final Map A05;

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, com.instagram.gallery.suggestions.database.SuggestionsDBHelper] */
    public /* synthetic */ C43902JbC(Context context, UserSession userSession, C43898Jb8 c43898Jb8) {
        C43900JbA c43900JbA = new C43900JbA(userSession);
        C47034Kqr c47034Kqr = SuggestionsDBHelper.A00;
        SuggestionsDBHelper suggestionsDBHelper = SuggestionsDBHelper.A01;
        if (suggestionsDBHelper == null) {
            synchronized (c47034Kqr) {
                SuggestionsDBHelper suggestionsDBHelper2 = SuggestionsDBHelper.A01;
                suggestionsDBHelper = suggestionsDBHelper2;
                if (suggestionsDBHelper2 == null) {
                    ?? obj = new Object();
                    SuggestionsDBHelper.A01 = obj;
                    suggestionsDBHelper = obj;
                }
            }
        }
        AbstractC167017dG.A1R(userSession, c43898Jb8);
        C14360o3.A0B(suggestionsDBHelper, 6);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = c43898Jb8;
        this.A03 = c43900JbA;
        this.A02 = suggestionsDBHelper;
        this.A05 = new ConcurrentHashMap();
    }

    public static final List A00(C43902JbC c43902JbC, List list) {
        java.util.Set stringSet = JQ0.A0Y(c43902JbC.A04).getStringSet("suggestions_hide_prefs_key", null);
        if (stringSet == null) {
            stringSet = C16910sj.A00;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (!stringSet.contains(((C45089JxJ) obj).A00())) {
                A1E.add(obj);
            }
        }
        return A1E;
    }
}
