package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.8a8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC189318a8 {
    /* JADX WARN: Type inference failed for: r0v34, types: [X.8a9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, X.8aB] */
    public static final C189328a9 A00(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("scanner_versions");
        int columnIndex3 = cursor.getColumnIndex("feature_name");
        int columnIndex4 = cursor.getColumnIndex("locality");
        int columnIndex5 = cursor.getColumnIndex("sub_admin_area");
        int columnIndex6 = cursor.getColumnIndex("admin_area");
        int columnIndex7 = cursor.getColumnIndex("country_name");
        int columnIndex8 = cursor.getColumnIndex("ocn_score");
        int columnIndex9 = cursor.getColumnIndex("ocv_score");
        int columnIndex10 = cursor.getColumnIndex("person_score");
        int columnIndex11 = cursor.getColumnIndex("food_score");
        int columnIndex12 = cursor.getColumnIndex("pet_score");
        int columnIndex13 = cursor.getColumnIndex("nature_score");
        int columnIndex14 = cursor.getColumnIndex("landmark_score");
        int columnIndex15 = cursor.getColumnIndex("aesthetic_score");
        int columnIndex16 = cursor.getColumnIndex("blur_score");
        int columnIndex17 = cursor.getColumnIndex("plant_score");
        int columnIndex18 = cursor.getColumnIndex("sports_score");
        int columnIndex19 = cursor.getColumnIndex("vehicle_score");
        int columnIndex20 = cursor.getColumnIndex("water_score");
        int columnIndex21 = cursor.getColumnIndex("outdoors_score");
        int columnIndex22 = cursor.getColumnIndex("event_score");
        int columnIndex23 = cursor.getColumnIndex("document_score");
        cursor.getColumnIndex("visual_embeddings");
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        String string3 = cursor.getString(columnIndex3);
        String string4 = cursor.getString(columnIndex4);
        String string5 = cursor.getString(columnIndex5);
        String string6 = cursor.getString(columnIndex6);
        String string7 = cursor.getString(columnIndex7);
        float f = cursor.getFloat(columnIndex8);
        float f2 = cursor.getFloat(columnIndex9);
        float f3 = cursor.getFloat(columnIndex10);
        float f4 = cursor.getFloat(columnIndex11);
        float f5 = cursor.getFloat(columnIndex12);
        float f6 = cursor.getFloat(columnIndex13);
        float f7 = cursor.getFloat(columnIndex14);
        float f8 = cursor.getFloat(columnIndex15);
        float f9 = cursor.getFloat(columnIndex16);
        float f10 = cursor.getFloat(columnIndex17);
        float f11 = cursor.getFloat(columnIndex18);
        float f12 = cursor.getFloat(columnIndex19);
        float f13 = cursor.getFloat(columnIndex20);
        float f14 = cursor.getFloat(columnIndex21);
        float f15 = cursor.getFloat(columnIndex22);
        float f16 = cursor.getFloat(columnIndex23);
        Float valueOf = Float.valueOf(f);
        Float valueOf2 = Float.valueOf(f2);
        Float valueOf3 = Float.valueOf(f3);
        Float valueOf4 = Float.valueOf(f4);
        Float valueOf5 = Float.valueOf(f5);
        Float valueOf6 = Float.valueOf(f6);
        Float valueOf7 = Float.valueOf(f7);
        Float valueOf8 = Float.valueOf(f8);
        Float valueOf9 = Float.valueOf(f9);
        Float valueOf10 = Float.valueOf(f10);
        Float valueOf11 = Float.valueOf(f11);
        Float valueOf12 = Float.valueOf(f12);
        Float valueOf13 = Float.valueOf(f13);
        Float valueOf14 = Float.valueOf(f14);
        Float valueOf15 = Float.valueOf(f15);
        Float valueOf16 = Float.valueOf(f16);
        ?? obj = new Object();
        obj.A0L = string;
        if (string2 != null) {
            try {
                obj.A00 = AbstractC189338aA.parseFromJson(C16V.A00(string2));
            } catch (IOException unused) {
            }
        }
        if (obj.A00 == null) {
            obj.A00 = new Object();
        }
        obj.A0K = string3;
        obj.A0M = string4;
        obj.A0N = string5;
        obj.A0I = string6;
        obj.A0J = string7;
        obj.A08 = valueOf;
        obj.A0F = valueOf2;
        obj.A0A = valueOf3;
        obj.A05 = valueOf4;
        obj.A0B = valueOf5;
        obj.A07 = valueOf6;
        obj.A06 = valueOf7;
        obj.A01 = valueOf8;
        obj.A02 = valueOf9;
        obj.A0C = valueOf10;
        obj.A0D = valueOf11;
        obj.A0E = valueOf12;
        obj.A0G = valueOf13;
        obj.A09 = valueOf14;
        obj.A04 = valueOf15;
        obj.A03 = valueOf16;
        return obj;
    }
}
