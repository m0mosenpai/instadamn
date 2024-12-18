package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public abstract class RrF {
    public static final C23008ACh A00(InterfaceC37481ol interfaceC37481ol, String str) {
        Map A0N;
        SP3 sp3;
        C14360o3.A0B(interfaceC37481ol, 0);
        Cursor E7O = interfaceC37481ol.E7O(AnonymousClass001.A0g("PRAGMA table_info(`", str, "`)"));
        try {
            if (E7O.getColumnCount() <= 0) {
                A0N = AbstractC06930Yk.A0E();
            } else {
                int columnIndex = E7O.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                int columnIndex2 = E7O.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                int columnIndex3 = E7O.getColumnIndex("notnull");
                int columnIndex4 = E7O.getColumnIndex("pk");
                int columnIndex5 = E7O.getColumnIndex("dflt_value");
                C06860Yd c06860Yd = new C06860Yd();
                while (E7O.moveToNext()) {
                    String string = E7O.getString(columnIndex);
                    String string2 = E7O.getString(columnIndex2);
                    boolean A1M = AbstractC167007dF.A1M(E7O.getInt(columnIndex3));
                    int i = E7O.getInt(columnIndex4);
                    String string3 = E7O.getString(columnIndex5);
                    C14360o3.A07(string);
                    C14360o3.A07(string2);
                    c06860Yd.put(string, new C63003SaR(string, string2, string3, i, 2, A1M));
                }
                A0N = AbstractC16850sd.A0N(c06860Yd);
            }
            E7O.close();
            E7O = interfaceC37481ol.E7O(AnonymousClass001.A0g("PRAGMA foreign_key_list(`", str, "`)"));
            try {
                int columnIndex6 = E7O.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                int columnIndex7 = E7O.getColumnIndex("seq");
                int columnIndex8 = E7O.getColumnIndex("table");
                int columnIndex9 = E7O.getColumnIndex("on_delete");
                int columnIndex10 = E7O.getColumnIndex("on_update");
                int columnIndex11 = E7O.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                int columnIndex12 = E7O.getColumnIndex("seq");
                int columnIndex13 = E7O.getColumnIndex("from");
                int columnIndex14 = E7O.getColumnIndex("to");
                C01L A1I = C0eM.A1I();
                while (E7O.moveToNext()) {
                    int i2 = E7O.getInt(columnIndex11);
                    int i3 = E7O.getInt(columnIndex12);
                    String string4 = E7O.getString(columnIndex13);
                    C14360o3.A07(string4);
                    String string5 = E7O.getString(columnIndex14);
                    C14360o3.A07(string5);
                    A1I.add(new C64526TIc(i2, i3, string4, string5));
                }
                List A0Z = AbstractC001800i.A0Z(C0eM.A1J(A1I));
                E7O.moveToPosition(-1);
                C01G c01g = new C01G();
                while (E7O.moveToNext()) {
                    if (E7O.getInt(columnIndex7) == 0) {
                        int i4 = E7O.getInt(columnIndex6);
                        ArrayList A1E = AbstractC166987dD.A1E();
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        ArrayList<C64526TIc> A1E3 = AbstractC166987dD.A1E();
                        for (Object obj : A0Z) {
                            if (((C64526TIc) obj).A00 == i4) {
                                A1E3.add(obj);
                            }
                        }
                        for (C64526TIc c64526TIc : A1E3) {
                            A1E.add(c64526TIc.A02);
                            A1E2.add(c64526TIc.A03);
                        }
                        String string6 = E7O.getString(columnIndex8);
                        C14360o3.A07(string6);
                        String string7 = E7O.getString(columnIndex9);
                        C14360o3.A07(string7);
                        String string8 = E7O.getString(columnIndex10);
                        C14360o3.A07(string8);
                        c01g.add(new C23010ACk(string6, string7, string8, A1E, A1E2));
                    }
                }
                C01G A04 = AbstractC10090gM.A04(c01g);
                E7O.close();
                E7O = interfaceC37481ol.E7O(AnonymousClass001.A0g("PRAGMA index_list(`", str, "`)"));
                C01G c01g2 = null;
                try {
                    int columnIndex15 = E7O.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    int columnIndex16 = E7O.getColumnIndex("origin");
                    int columnIndex17 = E7O.getColumnIndex("unique");
                    if (columnIndex15 != -1 && columnIndex16 != -1 && columnIndex17 != -1) {
                        C01G c01g3 = new C01G();
                        while (true) {
                            if (E7O.moveToNext()) {
                                if ("c".equals(E7O.getString(columnIndex16))) {
                                    String string9 = E7O.getString(columnIndex15);
                                    boolean A1P = AbstractC167007dF.A1P(E7O.getInt(columnIndex17), 1);
                                    C14360o3.A07(string9);
                                    E7O = interfaceC37481ol.E7O(AnonymousClass001.A0g("PRAGMA index_xinfo(`", string9, "`)"));
                                    try {
                                        int columnIndex18 = E7O.getColumnIndex("seqno");
                                        int columnIndex19 = E7O.getColumnIndex("cid");
                                        int columnIndex20 = E7O.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                        int columnIndex21 = E7O.getColumnIndex("desc");
                                        if (columnIndex18 != -1 && columnIndex19 != -1 && columnIndex20 != -1 && columnIndex21 != -1) {
                                            TreeMap treeMap = new TreeMap();
                                            TreeMap treeMap2 = new TreeMap();
                                            while (E7O.moveToNext()) {
                                                if (E7O.getInt(columnIndex19) >= 0) {
                                                    int i5 = E7O.getInt(columnIndex18);
                                                    String string10 = E7O.getString(columnIndex20);
                                                    Object obj2 = "ASC";
                                                    if (E7O.getInt(columnIndex21) > 0) {
                                                        obj2 = "DESC";
                                                    }
                                                    Integer valueOf = Integer.valueOf(i5);
                                                    C14360o3.A07(string10);
                                                    treeMap.put(valueOf, string10);
                                                    treeMap2.put(valueOf, obj2);
                                                }
                                            }
                                            Collection values = treeMap.values();
                                            C14360o3.A07(values);
                                            List A0a = AbstractC001800i.A0a(values);
                                            Collection values2 = treeMap2.values();
                                            C14360o3.A07(values2);
                                            sp3 = new SP3(string9, A0a, AbstractC001800i.A0a(values2), A1P);
                                        } else {
                                            sp3 = null;
                                        }
                                        E7O.close();
                                        if (sp3 == null) {
                                            break;
                                        }
                                        c01g3.add(sp3);
                                    } finally {
                                    }
                                }
                            } else {
                                c01g2 = AbstractC10090gM.A04(c01g3);
                                break;
                            }
                        }
                    }
                    E7O.close();
                    return new C23008ACh(str, A0N, A04, c01g2);
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
