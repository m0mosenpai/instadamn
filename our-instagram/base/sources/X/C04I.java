package X;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.04I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04I implements C0LR {
    public static final C10850hu A02 = C0LK.A8u;
    public static final C10850hu A03 = C0LK.A8v;
    public final C0X6 A00;
    public final File[] A01;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0V;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        int length;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        File[] fileArr = this.A01;
        if (fileArr != null && (length = fileArr.length) != 0) {
            JSONObject jSONObject = new JSONObject();
            Object jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                jSONObject.put("schema_version", "v2");
                jSONObject.put("inprogress_qpls", jSONArray);
                jSONObject.put("snapshot_attributes", jSONObject2);
            } catch (JSONException unused) {
            }
            JSONArray jSONArray2 = new JSONArray();
            if (length == 1) {
                File file = fileArr[0];
                try {
                    C07190Zs c07190Zs = new C07190Zs();
                    c07190Zs.A0C = true;
                    for (C07260a0 c07260a0 : C0X6.A01(c07190Zs, file)) {
                        int i = c07260a0.A05;
                        jSONArray2.put(i);
                        JSONObject jSONObject3 = null;
                        JSONObject jSONObject4 = new JSONObject();
                        try {
                            jSONArray.put(jSONObject4);
                            jSONObject4.put("marker_id", i);
                        } catch (JSONException unused2) {
                        }
                        List list9 = c07260a0.A02;
                        if (list9 != null) {
                            list5 = Collections.unmodifiableList(list9);
                        } else {
                            list5 = null;
                        }
                        List list10 = c07260a0.A03;
                        if (list10 != null) {
                            list6 = Collections.unmodifiableList(list10);
                        } else {
                            list6 = null;
                        }
                        if (list5 != null && list6 != null) {
                            Iterator it = list5.iterator();
                            Iterator it2 = list6.iterator();
                            while (it.hasNext() && it2.hasNext()) {
                                String str = (String) it.next();
                                String str2 = (String) it2.next();
                                C14360o3.A0B(str, 0);
                                C14360o3.A0B(str2, 1);
                                if (jSONObject3 == null) {
                                    try {
                                        JSONObject jSONObject5 = new JSONObject();
                                        jSONObject3 = jSONObject5;
                                        jSONObject4.put("annotations", jSONObject5);
                                    } catch (JSONException unused3) {
                                    }
                                }
                                jSONObject3.put(str, str2);
                            }
                        }
                        List list11 = c07260a0.A00;
                        if (list11 != null) {
                            list7 = Collections.unmodifiableList(list11);
                        } else {
                            list7 = null;
                        }
                        List list12 = c07260a0.A01;
                        if (list12 != null) {
                            list8 = Collections.unmodifiableList(list12);
                        } else {
                            list8 = null;
                        }
                        if (list7 != null && list8 != null) {
                            Iterator it3 = list7.iterator();
                            Iterator it4 = list8.iterator();
                            while (it3.hasNext() && it4.hasNext()) {
                                String str3 = (String) it3.next();
                                Integer num = (Integer) it4.next();
                                C14360o3.A0B(str3, 0);
                                if (jSONObject3 == null) {
                                    try {
                                        JSONObject jSONObject6 = new JSONObject();
                                        jSONObject3 = jSONObject6;
                                        jSONObject4.put("annotations", jSONObject6);
                                    } catch (JSONException unused4) {
                                    }
                                }
                                jSONObject3.put(str3, num);
                            }
                        }
                    }
                } catch (Throwable th) {
                    C0PC.A00().DEh("QPLCurrentCollect", th, null);
                }
            } else {
                int i2 = 0;
                do {
                    File file2 = fileArr[i2];
                    try {
                        C07190Zs c07190Zs2 = new C07190Zs();
                        c07190Zs2.A0C = true;
                        for (C07260a0 c07260a02 : C0X6.A01(c07190Zs2, file2)) {
                            int i3 = c07260a02.A05;
                            jSONArray2.put(i3);
                            JSONObject jSONObject7 = null;
                            JSONObject jSONObject8 = new JSONObject();
                            try {
                                jSONArray.put(jSONObject8);
                                jSONObject8.put("marker_id", i3);
                            } catch (JSONException unused5) {
                            }
                            List list13 = c07260a02.A02;
                            if (list13 != null) {
                                list = Collections.unmodifiableList(list13);
                            } else {
                                list = null;
                            }
                            List list14 = c07260a02.A03;
                            if (list14 != null) {
                                list2 = Collections.unmodifiableList(list14);
                            } else {
                                list2 = null;
                            }
                            if (list != null && list2 != null) {
                                Iterator it5 = list.iterator();
                                Iterator it6 = list2.iterator();
                                while (it5.hasNext() && it6.hasNext()) {
                                    String str4 = (String) it5.next();
                                    String str5 = (String) it6.next();
                                    C14360o3.A0B(str4, 0);
                                    C14360o3.A0B(str5, 1);
                                    if (jSONObject7 == null) {
                                        try {
                                            JSONObject jSONObject9 = new JSONObject();
                                            jSONObject7 = jSONObject9;
                                            jSONObject8.put("annotations", jSONObject9);
                                        } catch (JSONException unused6) {
                                        }
                                    }
                                    jSONObject7.put(str4, str5);
                                }
                            }
                            List list15 = c07260a02.A00;
                            if (list15 != null) {
                                list3 = Collections.unmodifiableList(list15);
                            } else {
                                list3 = null;
                            }
                            List list16 = c07260a02.A01;
                            if (list16 != null) {
                                list4 = Collections.unmodifiableList(list16);
                            } else {
                                list4 = null;
                            }
                            if (list3 != null && list4 != null) {
                                Iterator it7 = list3.iterator();
                                Iterator it8 = list4.iterator();
                                while (it7.hasNext() && it8.hasNext()) {
                                    String str6 = (String) it7.next();
                                    Integer num2 = (Integer) it8.next();
                                    C14360o3.A0B(str6, 0);
                                    if (jSONObject7 == null) {
                                        try {
                                            JSONObject jSONObject10 = new JSONObject();
                                            jSONObject7 = jSONObject10;
                                            jSONObject8.put("annotations", jSONObject10);
                                        } catch (JSONException unused7) {
                                        }
                                    }
                                    jSONObject7.put(str6, num2);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        C0PC.A00().DEh("QPLCurrentCollect", th2, null);
                    }
                    i2++;
                } while (i2 < length);
            }
            String obj = jSONArray2.toString();
            if (obj == null) {
                obj = "[]";
            }
            c024209q.A03(A02, obj);
            String obj2 = jSONObject.toString();
            C14360o3.A07(obj2);
            c024209q.A03(A03, obj2);
            HashMap hashMap = new HashMap();
            hashMap.put("marker_len", String.valueOf(obj.length()));
            hashMap.put("full_len", String.valueOf(obj2.length()));
            C0PC.A00().D2z("QPLCurrentCollect", hashMap);
        }
    }

    public C04I(C0X6 c0x6, File... fileArr) {
        this.A00 = c0x6;
        this.A01 = fileArr;
    }
}
