package X;

import android.os.Parcelable;
import com.instagram.realtimeclient.DirectApiError__JsonHelper;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.75g, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75g {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1um, X.75f, X.1ul] */
    public static C1574875f parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    if ("thread".equals(A0q)) {
                        c40791um.A02 = JV4.parseFromJson(c16l);
                    } else {
                        String str = null;
                        ArrayList arrayList = null;
                        ArrayList arrayList2 = null;
                        String str2 = null;
                        ArrayList arrayList3 = null;
                        HashMap hashMap = null;
                        if ("thread_context_items".equals(A0q)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = new ArrayList();
                                while (c16l.A1J() != C16R.A08) {
                                    C81583kT parseFromJson = AbstractC81573kS.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        arrayList.add(parseFromJson);
                                    }
                                }
                            }
                            c40791um.A0B = arrayList;
                        } else if ("users".equals(A0q)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList2 = new ArrayList();
                                while (c16l.A1J() != C16R.A08) {
                                    Parcelable.Creator creator = User.CREATOR;
                                    User A00 = AbstractC38851rI.A00(c16l, false);
                                    if (A00 != null) {
                                        arrayList2.add(A00);
                                    }
                                }
                            }
                            c40791um.A0C = arrayList2;
                        } else if ("responsiveness_category".equals(A0q)) {
                            if (c16l.A11() != C16R.A0G) {
                                str2 = c16l.A1P();
                            }
                            c40791um.A08 = str2;
                        } else if ("icebreakers".equals(A0q)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList3 = new ArrayList();
                                while (c16l.A1J() != C16R.A08) {
                                    C105954q9 parseFromJson2 = C4q8.parseFromJson(c16l);
                                    if (parseFromJson2 != null) {
                                        arrayList3.add(parseFromJson2);
                                    }
                                }
                            }
                            c40791um.A0A = arrayList3;
                        } else if ("persistent_menu_icebreakers".equals(A0q)) {
                            c40791um.A00 = AbstractC81523kN.parseFromJson(c16l);
                        } else if ("welcome_message".equals(A0q)) {
                            c40791um.A01 = AbstractC34100F3c.parseFromJson(c16l);
                        } else if ("reachability_statuses".equals(A0q)) {
                            if (c16l.A11() == c16r) {
                                HashMap hashMap2 = new HashMap();
                                while (c16l.A1J() != c16r2) {
                                    String A1P = c16l.A1P();
                                    c16l.A1J();
                                    if (c16l.A11() == C16R.A0G) {
                                        hashMap2.put(A1P, null);
                                    } else {
                                        Integer valueOf = Integer.valueOf(c16l.A1D());
                                        if (valueOf != null) {
                                            hashMap2.put(A1P, valueOf);
                                        }
                                    }
                                }
                                hashMap = hashMap2;
                            }
                            c40791um.A09 = hashMap;
                        } else if ("has_reached_message_request_limit".equals(A0q)) {
                            c40791um.A04 = Boolean.valueOf(c16l.A0d());
                        } else if ("lightweight_intervention_appealable_entity_id".equals(A0q)) {
                            if (c16l.A11() != C16R.A0G) {
                                str = c16l.A1P();
                            }
                            c40791um.A07 = str;
                        } else if ("is_viewer_unconnected".equals(A0q)) {
                            c40791um.A06 = Boolean.valueOf(c16l.A0d());
                        } else if ("is_appointment_booking_enabled".equals(A0q)) {
                            c40791um.A05 = Boolean.valueOf(c16l.A0d());
                        } else if ("error".equals(A0q)) {
                            c40791um.A03 = DirectApiError__JsonHelper.parseFromJson(c16l);
                        } else {
                            C55702hA.A01(c16l, c40791um, A0q);
                        }
                    }
                    c16l.A0z();
                } else {
                    return c40791um;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
