package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.LinkedHashMap;

/* renamed from: X.B4z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25022B4z extends LinkedHashMap<C6RQ, String> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof C6RQ)) {
            return false;
        }
        return super.containsKey(obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof C6RQ)) {
            return null;
        }
        return super.get(obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof C6RQ)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof C6RQ)) {
            return null;
        }
        return super.remove(obj);
    }

    public C25022B4z(UserSession userSession) {
        put(C6RQ.A06, "mention_sticker_redesign_default");
        put(C6RQ.A0B, "mention_sticker_redesign_subtle");
        put(C6RQ.A0A, "mention_sticker_redesign_rainbow");
        put(C6RQ.A07, "mention_sticker_redesign_hero");
        put(C6RQ.A0C, "mention_sticker_redesign_vibrant");
        put(C6RQ.A09, "mention_sticker_redesign_monotone");
        if (C18U.A06(C06090Tz.A05, userSession, 36327688088075040L)) {
            put(C6RQ.A08, AbstractC111324zv.A00(432));
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof C6RQ) || !(obj2 instanceof String)) {
            return false;
        }
        return super.remove(obj, obj2);
    }
}
