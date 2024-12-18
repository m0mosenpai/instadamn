package X;

import com.facebook.graphql.enums.EnumHelper;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.42m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC907342m {
    public final JSONObject A00;

    public final AbstractC907342m A00(Class cls, String str) {
        JSONObject optJSONObject = this.A00.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (AbstractC907342m) cls.getConstructor(JSONObject.class).newInstance(optJSONObject);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public final ImmutableList A01(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i = 0; i < optJSONArray.length(); i++) {
            builder.add((Object) optJSONArray.optString(i));
        }
        return builder.build();
    }

    public final ImmutableList A02(String str, Class cls) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return ImmutableList.of();
        }
        try {
            Constructor constructor = cls.getConstructor(JSONObject.class);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    try {
                        builder.add(constructor.newInstance(optJSONObject));
                    } catch (InstantiationException | InvocationTargetException unused) {
                    }
                }
            }
            return builder.build();
        } catch (IllegalAccessException | NoSuchMethodException unused2) {
            return ImmutableList.of();
        }
    }

    public final ImmutableList A03(String str, Enum r6) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i = 0; i < optJSONArray.length(); i++) {
            builder.add((Object) EnumHelper.A00(optJSONArray.optString(i), r6));
        }
        return builder.build();
    }

    public final Enum A04(String str, Enum r3) {
        return EnumHelper.A00(this.A00.optString(str), r3);
    }

    public final String A05(String str) {
        JSONObject jSONObject = this.A00;
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public final boolean A06(String str) {
        JSONObject jSONObject = this.A00;
        boolean z = true;
        if (jSONObject.optInt(str) != 1) {
            z = false;
        }
        return jSONObject.optBoolean(str, z);
    }

    public AbstractC907342m(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }
}
