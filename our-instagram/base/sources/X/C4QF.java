package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4QF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4QF {
    public final SharedPreferences A00;
    public final String A01;

    public final long A00(String str, long j) {
        C14360o3.A0B(str, 0);
        return this.A00.getLong(AnonymousClass001.A0T(this.A01, str, '_'), j);
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        this.A00.edit().remove(AnonymousClass001.A0T(this.A01, str, '_')).apply();
    }

    public final void A04(String str, float f) {
        C14360o3.A0B(str, 0);
        this.A00.edit().putFloat(AnonymousClass001.A0T(this.A01, str, '_'), f).apply();
    }

    public final void A05(String str, long j) {
        C14360o3.A0B(str, 0);
        this.A00.edit().putLong(AnonymousClass001.A0T(this.A01, str, '_'), j).apply();
    }

    public final void A06(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        this.A00.edit().putString(AnonymousClass001.A0T(this.A01, str, '_'), str2).apply();
    }

    public final String A01(String str) {
        C14360o3.A0B(str, 0);
        String string = this.A00.getString(AnonymousClass001.A0T(this.A01, str, '_'), "");
        return string != null ? string : "";
    }

    public final List A02() {
        java.util.Set<String> keySet = this.A00.getAll().keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (String str : keySet) {
            String str2 = str;
            C14360o3.A0A(str2);
            if (AbstractC002300n.A0h(str2, AnonymousClass001.A0C(this.A01, '_'), false)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        for (String str3 : arrayList) {
            C14360o3.A0C(str3, "null cannot be cast to non-null type kotlin.String");
            arrayList2.add(AbstractC001900j.A0F(AnonymousClass001.A0C(this.A01, '_'), str3));
        }
        return arrayList2;
    }

    public C4QF(SharedPreferences sharedPreferences, String str) {
        this.A00 = sharedPreferences;
        this.A01 = str;
    }
}
