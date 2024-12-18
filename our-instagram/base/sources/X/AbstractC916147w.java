package X;

import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.enums.EnumEntries;

/* renamed from: X.47w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC916147w {
    public static C915547l parseFromJson(C16L c16l) {
        Integer num;
        ShareType shareType;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C915547l c915547l = new C915547l();
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
                    HashMap hashMap = null;
                    HashSet hashSet = null;
                    String str = null;
                    String str2 = null;
                    HashSet hashSet2 = null;
                    HashSet hashSet3 = null;
                    HashSet hashSet4 = null;
                    HashMap hashMap2 = null;
                    String str3 = null;
                    String str4 = null;
                    if ("source_format".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    hashSet.add(A1P);
                                }
                            }
                        }
                        C14360o3.A0B(hashSet, 0);
                        c915547l.A0F = hashSet;
                    } else if ("external_app_sign".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        c915547l.A09 = str;
                    } else if ("external_app_metadata".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        C14360o3.A0B(str2, 0);
                        c915547l.A08 = str2;
                    } else if ("next_publish_id".equals(A0q)) {
                        c915547l.A02 = c16l.A1D();
                    } else if ("current_publish_id".equals(A0q)) {
                        c915547l.A00 = c16l.A1D();
                    } else if ("media_publish_sent_id_set".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet2 = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                Integer valueOf = Integer.valueOf(c16l.A1D());
                                if (valueOf != null) {
                                    hashSet2.add(valueOf);
                                }
                            }
                        }
                        C14360o3.A0B(hashSet2, 0);
                        c915547l.A0D = new CopyOnWriteArraySet(hashSet2);
                    } else if ("media_success_sent_id_set".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet3 = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                Integer valueOf2 = Integer.valueOf(c16l.A1D());
                                if (valueOf2 != null) {
                                    hashSet3.add(valueOf2);
                                }
                            }
                        }
                        C14360o3.A0B(hashSet3, 0);
                        c915547l.A0E = new CopyOnWriteArraySet(hashSet3);
                    } else if ("media_abandon_sent_id_set".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet4 = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                Integer valueOf3 = Integer.valueOf(c16l.A1D());
                                if (valueOf3 != null) {
                                    hashSet4.add(valueOf3);
                                }
                            }
                        }
                        C14360o3.A0B(hashSet4, 0);
                        c915547l.A0C = new CopyOnWriteArraySet(hashSet4);
                    } else if ("is_publish_ready_sent".equals(A0q)) {
                        c915547l.A0G = c16l.A0d();
                    } else if ("event_counter".equals(A0q)) {
                        c915547l.A01 = c16l.A1D();
                    } else if ("last_upload_time".equals(A0q)) {
                        c915547l.A04 = c16l.A0y();
                    } else if ("publish_id_to_target_share_type_media_map".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap3 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P2 = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap3.put(A1P2, null);
                                } else {
                                    String A1P3 = c16l.A1P();
                                    EnumEntries enumEntries = ShareType.A05;
                                    C14360o3.A0B(A1P3, 0);
                                    if ("MULTI_CONFIG".equals(A1P3)) {
                                        shareType = ShareType.A0W;
                                    } else if (!ShareType.A04.contains(A1P3)) {
                                        shareType = ShareType.A0K;
                                    } else {
                                        shareType = ShareType.valueOf(A1P3);
                                        if (shareType != null) {
                                        }
                                    }
                                    hashMap3.put(A1P2, shareType);
                                }
                            }
                            hashMap2 = hashMap3;
                        }
                        C14360o3.A0B(hashMap2, 0);
                        c915547l.A0B = new ConcurrentHashMap(hashMap2);
                    } else if ("photo_to_video_type".equals(A0q)) {
                        c915547l.A03 = c16l.A1D();
                    } else if ("server_ptv_duration_ms".equals(A0q)) {
                        c915547l.A05 = c16l.A0y();
                    } else if ("download_bandwidth".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        C14360o3.A0B(str3, 0);
                        c915547l.A07 = str3;
                    } else if ("transcode_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        C14360o3.A0B(str4, 0);
                        Integer[] A00 = C05F.A00(7);
                        int length = A00.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                num = A00[i];
                                if (C14360o3.A0K(C56U.A00(num), str4)) {
                                    break;
                                }
                                i++;
                            } else {
                                num = C05F.A0u;
                                break;
                            }
                        }
                        c915547l.A06 = num;
                    } else if ("ingest_session_id_to_publish_ids_map".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap4 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P4 = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap4.put(A1P4, null);
                                } else {
                                    C9BH parseFromJson = AbstractC93534Ht.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        hashMap4.put(A1P4, parseFromJson);
                                    }
                                }
                            }
                            hashMap = hashMap4;
                        }
                        C14360o3.A0B(hashMap, 0);
                        c915547l.A0A = hashMap;
                    }
                    c16l.A0z();
                } else {
                    return c915547l;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
