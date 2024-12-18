package X;

import android.widget.Filter;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.AbstractMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.JkH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44421JkH extends Filter {
    public boolean A00;
    public final UserSession A01;
    public final L9Q A02 = new L9Q();
    public final L9Q A03 = new L9Q();
    public final List A04 = AbstractC166987dD.A1E();
    public final MOP A05;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00da A[Catch: IOException | JSONException -> 0x014a, IOException | JSONException -> 0x014a, TryCatch #0 {IOException | JSONException -> 0x014a, blocks: (B:21:0x0073, B:23:0x007e, B:31:0x009b, B:31:0x009b, B:33:0x00a8, B:33:0x00a8, B:35:0x00b4, B:35:0x00b4, B:38:0x00cd, B:38:0x00cd, B:40:0x00da, B:40:0x00da, B:42:0x00eb, B:42:0x00eb, B:44:0x00f3, B:44:0x00f3, B:45:0x00f7, B:45:0x00f7, B:47:0x00fd, B:47:0x00fd, B:49:0x0107, B:49:0x0107, B:51:0x010d, B:51:0x010d, B:53:0x0119, B:53:0x0119, B:55:0x012c, B:55:0x012c, B:57:0x0131, B:57:0x0131, B:62:0x00c4, B:62:0x00c4, B:81:0x0146, B:81:0x0146, B:82:0x0149, B:82:0x0149), top: B:20:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: IOException | JSONException -> 0x014a, IOException | JSONException -> 0x014a, TryCatch #0 {IOException | JSONException -> 0x014a, blocks: (B:21:0x0073, B:23:0x007e, B:31:0x009b, B:31:0x009b, B:33:0x00a8, B:33:0x00a8, B:35:0x00b4, B:35:0x00b4, B:38:0x00cd, B:38:0x00cd, B:40:0x00da, B:40:0x00da, B:42:0x00eb, B:42:0x00eb, B:44:0x00f3, B:44:0x00f3, B:45:0x00f7, B:45:0x00f7, B:47:0x00fd, B:47:0x00fd, B:49:0x0107, B:49:0x0107, B:51:0x010d, B:51:0x010d, B:53:0x0119, B:53:0x0119, B:55:0x012c, B:55:0x012c, B:57:0x0131, B:57:0x0131, B:62:0x00c4, B:62:0x00c4, B:81:0x0146, B:81:0x0146, B:82:0x0149, B:82:0x0149), top: B:20:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r19) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44421JkH.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        C14360o3.A0B(charSequence, 0);
        MOP mop = this.A05;
        String obj2 = charSequence.toString();
        List list = null;
        if (filterResults != null) {
            obj = filterResults.values;
        } else {
            obj = null;
        }
        if (obj instanceof List) {
            list = (List) obj;
        }
        mop.Dh9(obj2, list);
    }

    public C44421JkH(UserSession userSession, MOP mop) {
        this.A05 = mop;
        this.A01 = userSession;
        if (C18U.A06(C06090Tz.A05, userSession, 36324471157567671L)) {
            Object A01 = userSession.A01(C47287Kuy.class, C50134MCi.A00);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            Locale A02 = C1Q2.A02();
            C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC43594JPz.A1X(A0b, "locale", AnonymousClass001.A0T(A02.getLanguage(), A02.getCountry(), '_'))), "EmojiKeywordsQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59214Qam.class, false, null, 0, null, "text_app_emoji_keywords", AbstractC166987dD.A1E()).setFreshCacheAgeMs(86400000L).setMaxToleratedCacheAgeMs(604800000L);
            AbstractC40691uc.A01(userSession).ATV(C48142LSr.A00, new C58510Pwe(A01, 8), maxToleratedCacheAgeMs);
        }
    }

    public static int A00(Object obj, AbstractMap abstractMap) {
        Number number = (Number) abstractMap.get(obj);
        if (number == null) {
            return 1;
        }
        return number.intValue() + 1;
    }
}
