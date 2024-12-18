package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class S1W {
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, X.S1V] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Rl8, java.lang.Object] */
    public static final ArrayList A00(String str) {
        ArrayList A1E = AbstractC166987dD.A1E();
        JSONArray jSONArray = AbstractC58318PtA.A17(str).getJSONObject("trackCompositions").getJSONArray("4");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i).getJSONObject("dataTrack");
            String string = jSONObject.getString("trackName");
            JSONObject A17 = AbstractC58318PtA.A17(jSONObject.getString("trackDataJson"));
            String string2 = A17.getString("stickerType");
            String string3 = A17.getString("stickerAssetId");
            C14360o3.A0A(string2);
            C14360o3.A0A(string3);
            AbstractC167017dG.A1P(string2, string3);
            ?? obj = new Object();
            JSONArray jSONArray2 = jSONObject.getJSONArray("dataSegments");
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                jSONObject2.getJSONObject("timeRange").getJSONObject("startTime").getLong("timeValue");
                jSONObject2.getJSONObject("timeRange").getJSONObject("endTime").getLong("timeValue");
                JSONObject A172 = AbstractC58318PtA.A17(jSONObject2.getString("segmentDataJson"));
                C14360o3.A0A(string);
                A172.getDouble("relativeX");
                A172.getDouble("relativeY");
                A172.getDouble("relativeWidth");
                A172.getDouble("relativeHeight");
                A172.getDouble("rotationDegrees");
                A1E.add(new C62493SDu(new Object(), obj, string));
            }
        }
        return A1E;
    }
}
