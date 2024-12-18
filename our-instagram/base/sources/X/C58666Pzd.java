package X;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.lang.reflect.Type;

/* renamed from: X.Pzd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58666Pzd implements InterfaceC65440TkC, InterfaceC65441TkD {
    @Override // X.InterfaceC65440TkC
    public final /* bridge */ /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, InterfaceC65286ThJ interfaceC65286ThJ) {
        String str;
        AutoplayWhichVideos.Companion companion = AutoplayWhichVideos.Companion;
        if (jsonElement == null || (str = jsonElement.getAsString()) == null) {
            str = "";
        }
        return companion.valueOf(str);
    }

    @Override // X.InterfaceC65441TkD
    public final /* bridge */ /* synthetic */ JsonElement serialize(Object obj, Type type, InterfaceC65287ThK interfaceC65287ThK) {
        return new JsonPrimitive(AbstractC31180DnO.A0k(obj));
    }
}
