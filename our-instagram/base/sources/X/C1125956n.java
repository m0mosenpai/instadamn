package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.56n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1125956n {
    public final long A00;
    public final EnumC1125356h A01;
    public final String A02;
    public final HashMap A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1125956n c1125956n = (C1125956n) obj;
            if (!this.A02.equals(c1125956n.A02) || this.A00 != c1125956n.A00 || !this.A04.equals(c1125956n.A04) || this.A01 != c1125956n.A01 || !this.A07.equals(c1125956n.A07) || !this.A05.equals(c1125956n.A05)) {
                return false;
            }
        }
        return true;
    }

    public final C1125856m A00() {
        C1125856m c1125856m = new C1125856m(this.A01, this.A02, this.A00);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            c1125856m.A02((C1125756l) it.next());
        }
        for (C5JJ c5jj : this.A07) {
            c1125856m.A01(c5jj.A01, c5jj.A00);
        }
        Iterator it2 = this.A06.iterator();
        while (it2.hasNext()) {
            it2.next();
            c1125856m.A06.add(null);
        }
        Iterator it3 = this.A05.iterator();
        while (it3.hasNext()) {
            c1125856m.A03((C69688VtY) it3.next(), null);
        }
        return c1125856m;
    }

    public final JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mName", this.A02);
        jSONObject.put("mStartAtTimeUs", this.A00);
        jSONObject.put("mTrackType", this.A01.A00);
        List list = this.A04;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C1125756l) it.next()).A00());
        }
        jSONObject.put("mSegments", jSONArray);
        List<C5JJ> list2 = this.A07;
        JSONArray jSONArray2 = new JSONArray();
        for (C5JJ c5jj : list2) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mTargetTimeRange", c5jj.A01.A04());
            jSONObject2.put("mSpeed", c5jj.A00);
            jSONArray2.put(jSONObject2);
        }
        jSONObject.put("mTimelineSpeedList", jSONArray2);
        List list3 = this.A06;
        Object jSONArray3 = new JSONArray();
        Iterator it2 = list3.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw new NullPointerException("toJSON");
        }
        jSONObject.put("mTimelinePtsMutatorList", jSONArray3);
        List<C69688VtY> list4 = this.A05;
        JSONArray jSONArray4 = new JSONArray();
        for (C69688VtY c69688VtY : list4) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("mTargetTimeRange", c69688VtY.A00.A04());
            jSONObject3.put("mMediaEffect", c69688VtY.A01.EqN());
            jSONArray4.put(jSONObject3);
        }
        jSONObject.put("mTimelineEffects", jSONArray4);
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A04, this.A01, this.A07, this.A05, Long.valueOf(this.A00)});
    }

    public C1125956n(C1125856m c1125856m) {
        this.A02 = c1125856m.A02;
        this.A01 = c1125856m.A01;
        this.A04 = c1125856m.A04;
        this.A00 = c1125856m.A00;
        this.A05 = c1125856m.A05;
        this.A03 = c1125856m.A03;
        List list = c1125856m.A06;
        Collections.sort(list, C1126056o.A00);
        this.A06 = list;
        List list2 = c1125856m.A07;
        Collections.sort(list2, C1126156p.A00);
        this.A07 = list2;
    }

    public final String toString() {
        try {
            return A01().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
