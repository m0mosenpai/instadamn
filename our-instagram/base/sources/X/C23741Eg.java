package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Eg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23741Eg {
    public static C74283Vj parseFromJson(C16L c16l) {
        ArrayList arrayList;
        List list;
        C3XG c3xg;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C74283Vj c74283Vj = new C74283Vj();
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
                if ("multiple_question_survey".equals(A0q)) {
                    c74283Vj.A02 = I0R.parseFromJson(c16l);
                } else if ("megaphone".equals(A0q)) {
                    c74283Vj.A08 = AbstractC34247F8t.parseFromJson(c16l);
                } else if ("preload_distance".equals(A0q)) {
                    c74283Vj.A0E = Integer.valueOf(c16l.A1D());
                } else {
                    HashMap hashMap = null;
                    ArrayList arrayList2 = null;
                    ArrayList arrayList3 = null;
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    ArrayList arrayList4 = null;
                    String str4 = null;
                    if ("feed_items".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList2.add(C3XG.A0A.A05(c16l, c16l instanceof C07950bF));
                            }
                        }
                        c74283Vj.A0L = arrayList2;
                    } else if ("client_gap_enforcer_matrix".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList3 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C74343Vq parseFromJson = AbstractC74333Vp.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList3.add(parseFromJson);
                                }
                            }
                        }
                        c74283Vj.A0K = arrayList3;
                    } else if ("pagination_source".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c74283Vj.A0G = str;
                    } else if (AbstractC31182DnR.A05(374, 10, 34).equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c74283Vj.A0I = str2;
                    } else if (TraceFieldType.RequestID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        c74283Vj.A0H = str3;
                    } else if ("suggested_users".equals(A0q)) {
                        c74283Vj.A03 = I0Z.parseFromJson(c16l);
                    } else if ("startup_prefetch_configs".equals(A0q)) {
                        c74283Vj.A07 = C3XA.parseFromJson(c16l);
                    } else if ("pull_to_refresh_window_ms".equals(A0q)) {
                        c74283Vj.A00 = c16l.A0y();
                    } else if ("hide_like_and_view_counts".equals(A0q)) {
                        c74283Vj.A0A = Boolean.valueOf(c16l.A0d());
                    } else if ("max_num_possible_ad_insertions".equals(A0q)) {
                        c74283Vj.A0D = Integer.valueOf(c16l.A1D());
                    } else if ("disable_client_insertions".equals(A0q)) {
                        c74283Vj.A09 = Boolean.valueOf(c16l.A0d());
                    } else if ("btp_timestamps".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList4 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList4.add(A1P);
                                }
                            }
                        }
                        c74283Vj.A0J = arrayList4;
                    } else if ("is_shell_response".equals(A0q)) {
                        c74283Vj.A0O = c16l.A0d();
                    } else if ("server_stats".equals(A0q)) {
                        c74283Vj.A05 = I20.parseFromJson(c16l);
                    } else if ("ad_request_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        c74283Vj.A0F = str4;
                    } else if ("peak_hour_throttling_config".equals(A0q)) {
                        c74283Vj.A06 = C3XE.parseFromJson(c16l);
                    } else if ("is_eligible_for_hp1".equals(A0q)) {
                        c74283Vj.A0N = c16l.A0d();
                    } else if ("refresh_instructions".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P2 = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P2, null);
                                } else {
                                    Integer valueOf = Integer.valueOf(c16l.A1D());
                                    if (valueOf != null) {
                                        hashMap2.put(A1P2, valueOf);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        c74283Vj.A0M = hashMap;
                    } else if ("is_ifr_eligible".equals(A0q)) {
                        c74283Vj.A0B = Boolean.valueOf(c16l.A0d());
                    } else {
                        C74313Vm.A00(c16l, c74283Vj, A0q);
                    }
                }
                c16l.A0z();
            }
            List<C3XG> list2 = c74283Vj.A0L;
            if (list2 != null) {
                int size = list2.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        C3XG c3xg2 = (C3XG) list2.get(size);
                        if (c3xg2.A06 == C1XV.A0F) {
                            InterfaceC38381qS interfaceC38381qS = c3xg2.A05;
                            C14360o3.A0C(interfaceC38381qS, "null cannot be cast to non-null type com.instagram.feed.feeditem.EndOfFeedDemarcatorUnit");
                            C3CL c3cl = (C3CL) interfaceC38381qS;
                            C110424yE c110424yE = c3cl.A06;
                            if (c110424yE != null) {
                                String id = c110424yE.getId();
                                String str5 = c110424yE.A01;
                                if (id != null && str5 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(new C3XG(c110424yE, c110424yE.B5n(), id));
                                    C110434yF A00 = c110424yE.A00(str5);
                                    if (A00 != null) {
                                        List A0a = AbstractC001800i.A0a(A00.A06);
                                        boolean z = false;
                                        if (!A0a.isEmpty() && (c3xg = (C3XG) A0a.get(0)) != null && c3xg.A06 == c3cl.A00) {
                                            arrayList5.add(0, c3xg);
                                            A0a = A0a.subList(1, A0a.size());
                                        }
                                        if (A0a.isEmpty() || !(!C14360o3.A0K(c3cl.A04.A07, false))) {
                                            z = true;
                                        }
                                        A00.A02 = z;
                                        arrayList5.addAll(A0a);
                                        c74283Vj.A01 = A00;
                                    }
                                    list2.addAll(size + 1, arrayList5);
                                }
                            }
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
                arrayList = new ArrayList();
                long currentTimeMillis = System.currentTimeMillis();
                for (C3XG c3xg3 : list2) {
                    C38321qM A02 = C3XH.A02(c3xg3.A05);
                    if (A02 != null) {
                        A02.A0R = c74283Vj.A0H;
                        A02.A4M(Long.valueOf(currentTimeMillis));
                        A02.A4K(A02.A0C.BkJ());
                    }
                    arrayList.add(c3xg3);
                }
            } else {
                List list3 = ((C74293Vk) c74283Vj).A06;
                if (list3 != null) {
                    arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C3XH.A01((C38321qM) it.next()));
                    }
                }
                list = c74283Vj.A0K;
                if (list == null && (!list.isEmpty())) {
                    List list4 = ((C74343Vq) list.get(0)).A00;
                    if (list4 != null) {
                        int intValue = ((Number) list4.get(0)).intValue();
                        List list5 = ((C74343Vq) list.get(1)).A00;
                        if (list5 != null) {
                            int intValue2 = ((Number) list5.get(1)).intValue();
                            List list6 = ((C74343Vq) list.get(0)).A00;
                            if (list6 != null) {
                                c74283Vj.A04 = new C84543q2(intValue, intValue2, ((Number) list6.get(1)).intValue());
                                return c74283Vj;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
            c74283Vj.A0L = arrayList;
            list = c74283Vj.A0K;
            return list == null ? c74283Vj : c74283Vj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
