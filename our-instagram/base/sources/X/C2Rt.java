package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2Rt, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2Rt {
    public static C46952Dj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C46952Dj c46952Dj = new C46952Dj();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("version".equals(A0q)) {
                    c46952Dj.A03 = c16l.A1D();
                } else if ("seq_id".equals(A0q)) {
                    c46952Dj.A04 = c16l.A0y();
                } else if ("memris_seq_id".equals(A0q)) {
                    c46952Dj.A05 = c16l.A0y();
                } else if ("snapshot_at_ms".equals(A0q)) {
                    c46952Dj.A06 = c16l.A0y();
                } else {
                    HashMap hashMap = null;
                    String str = null;
                    String str2 = null;
                    ArrayList arrayList = null;
                    if ("snapshot_app_version".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c46952Dj.A09 = str;
                    } else if ("pending_request_count".equals(A0q)) {
                        c46952Dj.A00 = c16l.A1D();
                    } else if ("unread_pending_request_count".equals(A0q)) {
                        c46952Dj.A02 = c16l.A1D();
                    } else if ("spam_requests_total".equals(A0q)) {
                        c46952Dj.A01 = c16l.A1D();
                    } else if ("inbox_oldest_cursor".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c46952Dj.A08 = str2;
                    } else if ("inbox_has_older".equals(A0q)) {
                        c46952Dj.A0C = c16l.A0d();
                    } else if ("inbox_prev_key".equals(A0q)) {
                        C2E4 parseFromJson = AbstractC50072Ru.parseFromJson(c16l);
                        C14360o3.A0B(parseFromJson, 0);
                        c46952Dj.A07 = parseFromJson;
                    } else if ("experiment_parameter_values".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C46942Di parseFromJson2 = C2Rv.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c46952Dj.A0B = arrayList;
                    } else if ("inbox_folder_session_map".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    C9C6 parseFromJson3 = AbstractC50082Rw.parseFromJson(c16l);
                                    if (parseFromJson3 != null) {
                                        hashMap2.put(A1P, parseFromJson3);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        C14360o3.A0B(hashMap, 0);
                        c46952Dj.A0A = hashMap;
                    }
                }
                c16l.A0z();
            }
            Iterator it = C46952Dj.A0D.iterator();
            while (it.hasNext()) {
                C46952Dj.A00((AbstractC46972Dl) it.next(), c46952Dj);
            }
            Collection<C9C6> values = c46952Dj.A0A.values();
            C14360o3.A07(values);
            for (C9C6 c9c6 : values) {
                C50092Rx c50092Rx = (C50092Rx) c9c6.A00;
                if (c50092Rx != null && !AbstractC43796JYj.A02(c50092Rx)) {
                    String str3 = c46952Dj.A09;
                    C0f5 AEp = C18950wb.A00.AEp("FolderError", 20134884);
                    AEp.ABW(DialogModule.KEY_MESSAGE, "CRITICAL: Folder(s) dropped during validation");
                    AEp.ABW("trigger", "INBOX_LOAD_FROM_DISK");
                    AEp.ABW(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, str3);
                    AEp.ABW("dropped_folder", c50092Rx.A06);
                    AEp.report();
                    c9c6.A00 = null;
                }
            }
            return c46952Dj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C46952Dj c46952Dj) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("version", c46952Dj.A03);
        anonymousClass182.A0R("seq_id", c46952Dj.A04);
        anonymousClass182.A0R("memris_seq_id", c46952Dj.A05);
        anonymousClass182.A0R("snapshot_at_ms", c46952Dj.A06);
        String str = c46952Dj.A09;
        if (str != null) {
            anonymousClass182.A0S("snapshot_app_version", str);
        }
        anonymousClass182.A0Q("pending_request_count", c46952Dj.A00);
        anonymousClass182.A0Q("unread_pending_request_count", c46952Dj.A02);
        anonymousClass182.A0Q("spam_requests_total", c46952Dj.A01);
        String str2 = c46952Dj.A08;
        if (str2 != null) {
            anonymousClass182.A0S("inbox_oldest_cursor", str2);
        }
        anonymousClass182.A0T("inbox_has_older", c46952Dj.A0C);
        if (c46952Dj.A07 != null) {
            anonymousClass182.A0r("inbox_prev_key");
            AbstractC50072Ru.A00(anonymousClass182, c46952Dj.A07);
        }
        if (c46952Dj.A0B != null) {
            C16V.A03(anonymousClass182, "experiment_parameter_values");
            for (C46942Di c46942Di : c46952Dj.A0B) {
                if (c46942Di != null) {
                    anonymousClass182.A0d();
                    String str3 = c46942Di.A01;
                    if (str3 != null) {
                        anonymousClass182.A0S("universe", str3);
                    }
                    String str4 = c46942Di.A00;
                    if (str4 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str4);
                    }
                    String str5 = c46942Di.A02;
                    if (str5 != null) {
                        anonymousClass182.A0S(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str5);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (c46952Dj.A0A != null) {
            anonymousClass182.A0r("inbox_folder_session_map");
            anonymousClass182.A0d();
            for (Map.Entry entry : c46952Dj.A0A.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry)) {
                    AbstractC50082Rw.A00((C9C6) entry.getValue(), anonymousClass182);
                }
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
