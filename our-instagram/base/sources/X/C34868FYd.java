package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FYd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34868FYd {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.EDI, X.1um, X.1ul] */
    public static EDI parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ctrl_type".equals(A0s)) {
                    c40791um.A03 = FDV.A00(c16l.A1Q());
                } else {
                    ArrayList arrayList = null;
                    if ("report_status".equals(A0s)) {
                        c40791um.A09 = AbstractC167017dG.A0m(c16l);
                    } else if ("reported_content_id".equals(A0s)) {
                        c40791um.A05 = AbstractC31173DnH.A0h(c16l);
                    } else if (TraceFieldType.ContentType.equals(A0s)) {
                        c40791um.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("report_type".equals(A0s)) {
                        c40791um.A0A = AbstractC167017dG.A0m(c16l);
                    } else {
                        if (!"reporter_id".equals(A0s)) {
                            if ("report_status_type".equals(A0s)) {
                                if (c16l.A11() == C16R.A0G) {
                                }
                                c16l.A1P();
                            } else if ("responsible_id".equals(A0s)) {
                                c40791um.A06 = AbstractC31173DnH.A0h(c16l);
                            } else if (AbstractC43591JPw.A00(493).equals(A0s)) {
                                if (c16l.A11() == C16R.A0G) {
                                }
                                c16l.A1P();
                            } else if (!AbstractC111324zv.A00(4194).equals(A0s)) {
                                if ("ticket_id".equals(A0s)) {
                                    c40791um.A0C = AbstractC167017dG.A0m(c16l);
                                } else if ("show_self_remediation_options".equals(A0s)) {
                                    c40791um.A0H = c16l.A0d();
                                } else if ("show_community_guidelines".equals(A0s)) {
                                    c40791um.A0G = c16l.A0d();
                                } else if ("can_appeal".equals(A0s)) {
                                    c40791um.A0E = c16l.A0d();
                                } else if ("events".equals(A0s)) {
                                    if (c16l.A11() == C16R.A0C) {
                                        arrayList = AbstractC166987dD.A1E();
                                        while (c16l.A1J() != C16R.A08) {
                                            IHV parseFromJson = IAX.parseFromJson(c16l);
                                            if (parseFromJson != null) {
                                                arrayList.add(parseFromJson);
                                            }
                                        }
                                    }
                                    c40791um.A0D = arrayList;
                                } else if ("appeal_info".equals(A0s)) {
                                    c40791um.A02 = FDY.parseFromJson(c16l);
                                } else if ("ob_reference_id".equals(A0s)) {
                                    c40791um.A08 = AbstractC167017dG.A0m(c16l);
                                } else if ("ob_expiration_time".equals(A0s)) {
                                    c40791um.A04 = AbstractC31173DnH.A0h(c16l);
                                } else if ("ob_is_expired".equals(A0s)) {
                                    c40791um.A0F = c16l.A0d();
                                } else if ("url_button_info".equals(A0s)) {
                                    c40791um.A01 = FDX.parseFromJson(c16l);
                                } else if ("ob_bottom_sheet_info".equals(A0s)) {
                                    c40791um.A00 = FDW.parseFromJson(c16l);
                                } else if ("sd_reporter_tag".equals(A0s)) {
                                    c40791um.A0B = AbstractC167017dG.A0m(c16l);
                                } else {
                                    C55702hA.A01(c16l, c40791um, A0s);
                                }
                            }
                        }
                        c16l.A0y();
                    }
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
