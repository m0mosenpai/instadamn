package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3kO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81533kO {
    public static C81543kP parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        C14360o3.A0B(c16l, 0);
        try {
            C81543kP c81543kP = new C81543kP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("audience_type".equals(A0q)) {
                    c81543kP.A00 = c16l.A1D();
                } else if ("channel_end_source".equals(A0q)) {
                    c81543kP.A05 = Integer.valueOf(c16l.A1D());
                } else if ("channel_end_timestamp".equals(A0q)) {
                    c81543kP.A01 = c16l.A1D();
                } else if ("is_public".equals(A0q)) {
                    c81543kP.A0Q = c16l.A0d();
                } else if ("is_pinnable_to_viewer_profile".equals(A0q)) {
                    c81543kP.A0O = c16l.A0d();
                } else if ("is_pinned_to_viewer_profile".equals(A0q)) {
                    c81543kP.A0P = c16l.A0d();
                } else if ("is_added_to_inbox".equals(A0q)) {
                    c81543kP.A0I = c16l.A0d();
                } else if ("is_periodic_polling_enabled".equals(A0q)) {
                    c81543kP.A0N = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    String str = null;
                    String str2 = null;
                    ArrayList arrayList2 = null;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    if ("creator_igid".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c81543kP.A07 = str;
                    } else if ("creator_profile_picture_url".equals(A0q)) {
                        c81543kP.A04 = AbstractC222616c.A00(c16l);
                    } else if ("creator_username".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c81543kP.A08 = str2;
                    } else if ("joined_collaborator_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                    arrayList2.add(A1P5);
                                }
                            }
                        }
                        c81543kP.A0D = arrayList2;
                    } else if ("invited_collaborator_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList3 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                    arrayList3.add(A1P4);
                                }
                            }
                        }
                        c81543kP.A0B = arrayList3;
                    } else if ("added_to_inbox_count".equals(A0q)) {
                        c81543kP.A02 = c16l.A1D();
                    } else if ("is_subscribed_collaborator".equals(A0q)) {
                        c81543kP.A0R = c16l.A0d();
                    } else if ("joined_moderator_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList4 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                    arrayList4.add(A1P3);
                                }
                            }
                        }
                        c81543kP.A0E = arrayList4;
                    } else if ("invited_moderator_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList5 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                    arrayList5.add(A1P2);
                                }
                            }
                        }
                        c81543kP.A0C = arrayList5;
                    } else if ("is_creator_minor".equals(A0q)) {
                        c81543kP.A0K = c16l.A0d();
                    } else if ("has_creator_sent_msg".equals(A0q)) {
                        c81543kP.A0H = c16l.A0d();
                    } else if ("is_comments_enabled".equals(A0q)) {
                        c81543kP.A0J = c16l.A0d();
                    } else if ("is_hidden_in_messages_primary_tab".equals(A0q)) {
                        c81543kP.A0L = c16l.A0d();
                    } else if ("social_context_facepile_users".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList6 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C45127Jxw parseFromJson = F4U.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList6.add(parseFromJson);
                                }
                            }
                        }
                        c81543kP.A0F = arrayList6;
                    } else if ("is_xposting_eligible".equals(A0q)) {
                        c81543kP.A0S = c16l.A0d();
                    } else if ("xposting_enabled_channels".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList7 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C9CK parseFromJson2 = FUX.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList7.add(parseFromJson2);
                                }
                            }
                        }
                        c81543kP.A0G = arrayList7;
                    } else if ("xposting_available_channel_count".equals(A0q)) {
                        c81543kP.A06 = Integer.valueOf(c16l.A1D());
                    } else if ("first_available_xpost_channel".equals(A0q)) {
                        c81543kP.A03 = FUX.parseFromJson(c16l);
                    } else if ("hidden_emojis".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList8 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList8.add(A1P);
                                }
                            }
                        }
                        c81543kP.A09 = arrayList8;
                    } else if ("channel_milestones".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                FKZ parseFromJson3 = AbstractC34122F3y.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        c81543kP.A0A = arrayList;
                    } else if ("is_linked_account_eligible_for_xposting".equals(A0q)) {
                        c81543kP.A0M = c16l.A0d();
                    }
                }
                c16l.A0z();
            }
            return c81543kP;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
