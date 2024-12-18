package com.facebook.pando;

import X.C09170dP;
import X.C1LC;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphservice.interfaces.FromStringAble;
import com.facebook.jni.HybridClassBase;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TreeJNI extends HybridClassBase {
    public static final TreeJNI $redex_init_class = null;
    public final int typeTag;

    /* loaded from: classes12.dex */
    public class Edge {
        public String field;
        public boolean isPlural;
        public Class treeClass;
    }

    /* loaded from: classes12.dex */
    public class Spread {
        public Class treeClass;
    }

    public final native ImmutableList getBooleanList(String str);

    public final native ImmutableList getBooleanListByHashCode(int i);

    public final native boolean getBooleanValue(String str);

    public final native boolean getBooleanValueByHashCode(int i);

    public final native Boolean getBooleanVariable(String str);

    public final native ImmutableList getDoubleList(String str);

    public final native ImmutableList getDoubleListByHashCode(int i);

    public final native double getDoubleValue(String str);

    public final native double getDoubleValueByHashCode(int i);

    public Edge[] getEdgeFields() {
        return new Edge[0];
    }

    public final native Object getFieldByHashCode_UNTYPED(int i);

    public final native Object getField_UNTYPED(String str);

    public final native ImmutableList getIntList(String str);

    public final native ImmutableList getIntListByHashCode(int i);

    public final native int getIntValue(String str);

    public final native int getIntValueByHashCode(int i);

    public final native ImmutableList getOptionalBooleanList(String str);

    public final native ImmutableList getOptionalBooleanListByHashCode(int i);

    public final native Boolean getOptionalBooleanValue(String str);

    public final native Boolean getOptionalBooleanValueByHashCode(int i);

    public final native ImmutableList getOptionalDoubleList(String str);

    public final native ImmutableList getOptionalDoubleListByHashCode(int i);

    public final native Double getOptionalDoubleValue(String str);

    public final native Double getOptionalDoubleValueByHashCode(int i);

    public final native ImmutableList getOptionalIntList(String str);

    public final native ImmutableList getOptionalIntListByHashCode(int i);

    public final native Integer getOptionalIntValue(String str);

    public final native Integer getOptionalIntValueByHashCode(int i);

    public final native ImmutableList getOptionalStringList(String str);

    public final native ImmutableList getOptionalStringListByHashCode(int i);

    public final native ImmutableList getOptionalTimeList(String str);

    public final native ImmutableList getOptionalTimeListByHashCode(int i);

    public final native Long getOptionalTimeValue(String str);

    public final native Long getOptionalTimeValueByHashCode(int i);

    public final native ImmutableList getOptionalTreeList(String str, Class cls);

    public final native ImmutableList getOptionalTreeListByHashCode(int i, Class cls);

    public String[] getScalarFields() {
        return new String[0];
    }

    public final native int[] getSetFields();

    public Spread[] getSpreads() {
        return new Spread[0];
    }

    public final native ImmutableList getStringList(String str);

    public final native ImmutableList getStringListByHashCode(int i);

    public final native String getStringValue(String str);

    public final native String getStringValueByHashCode(int i);

    public final native ImmutableList getTimeList(String str);

    public final native ImmutableList getTimeListByHashCode(int i);

    public final native long getTimeValue(String str);

    public final native long getTimeValueByHashCode(int i);

    public final native ImmutableList getTreeList(String str, Class cls);

    public final native ImmutableList getTreeListByHashCode(int i, Class cls);

    public final native TreeJNI getTreeValue(String str, Class cls);

    public final native TreeJNI getTreeValueByHashCode(int i, Class cls);

    public final native boolean hasFieldValue(String str);

    public final native boolean hasFieldValueByHashCode(int i);

    public final native boolean isFieldSet(String str);

    public final native void logToFlipper(String str, String str2);

    public final native void maybeUpdateActiveFields();

    public final native TreeJNI reinterpret(Class cls);

    public final String toExpensiveHumanReadableDebugString() {
        try {
            return asJSON(false).toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public final String toFlipperFormattedResponseString() {
        try {
            return asJSON(true).toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public static Enum parseEnum(String str, Enum r3) {
        if (str != null) {
            try {
                r3 = Enum.valueOf(r3.getClass(), str.toUpperCase(Locale.US));
                return r3;
            } catch (IllegalArgumentException unused) {
                return r3;
            }
        }
        return r3;
    }

    public static String parseStringDef(String str, String str2, String str3, FromStringAble fromStringAble) {
        if (str == null) {
            return str3;
        }
        throw new NullPointerException("fromString");
    }

    public final JSONObject asJSON(boolean z) {
        String str;
        Object obj;
        JSONObject jSONObject = new JSONObject();
        for (String str2 : getScalarFields()) {
            if (isFieldSet(str2)) {
                Object field_UNTYPED = getField_UNTYPED(str2);
                if (field_UNTYPED == null) {
                    field_UNTYPED = JSONObject.NULL;
                } else if (field_UNTYPED instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((List) field_UNTYPED).iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    jSONObject.put(str2, jSONArray);
                }
                jSONObject.put(str2, field_UNTYPED);
            }
        }
        for (Edge edge : getEdgeFields()) {
            if (isFieldSet(edge.field)) {
                if (edge.isPlural) {
                    JSONArray jSONArray2 = new JSONArray();
                    C1LC it2 = getTreeList(edge.field, edge.treeClass).iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put(((TreeJNI) it2.next()).asJSON(z));
                    }
                    str = edge.field;
                    obj = jSONArray2;
                } else {
                    TreeJNI treeValue = getTreeValue(edge.field, edge.treeClass);
                    str = edge.field;
                    if (treeValue != null) {
                        obj = treeValue.asJSON(z);
                    } else {
                        obj = JSONObject.NULL;
                    }
                }
                jSONObject.put(str, obj);
            }
        }
        for (Spread spread : getSpreads()) {
            JSONObject asJSON = reinterpret(spread.treeClass).asJSON(z);
            if (z) {
                asJSON = asJSON.getJSONObject("fields");
            }
            Iterator<String> keys = asJSON.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, asJSON.get(next));
            }
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, getStringValue("__typename"));
            jSONObject2.put("fields", jSONObject);
            return jSONObject2;
        }
        return jSONObject;
    }

    public final String getTypeName() {
        return getStringValue("__typename");
    }

    public final boolean isFulfilled(String str) {
        if (!str.equals(getStringValue("__typename")) && !getBooleanValue(String.format("is_fulfilled__(name:\"%s\")", str))) {
            return false;
        }
        return true;
    }

    static {
        C09170dP.A0C("pando-jni");
    }

    public TreeJNI(int i) {
        this.typeTag = i;
    }

    public final ImmutableList getEnumList(String str, Enum r5) {
        ImmutableList stringList = getStringList(str);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        C1LC it = stringList.iterator();
        while (it.hasNext()) {
            builder.add((Object) parseEnum((String) it.next(), r5));
        }
        return builder.build();
    }

    public final Enum getEnumValue(String str, Enum r3) {
        return parseEnum(getStringValue(str), r3);
    }

    public final ImmutableList getStringDefList(String str, String str2, String str3, FromStringAble fromStringAble) {
        ImmutableList stringList = getStringList(str);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        C1LC it = stringList.iterator();
        while (it.hasNext()) {
            parseStringDef((String) it.next(), str2, str3, fromStringAble);
            builder.add((Object) str3);
        }
        return builder.build();
    }

    public final String getStringDefValue(String str, String str2, String str3, FromStringAble fromStringAble) {
        parseStringDef(getStringValue(str), str2, str3, fromStringAble);
        return str3;
    }

    public final void logToFlipper(String str) {
        logToFlipper(toFlipperFormattedResponseString(), str);
    }

    public TreeJNI() {
        this.typeTag = 0;
    }
}
