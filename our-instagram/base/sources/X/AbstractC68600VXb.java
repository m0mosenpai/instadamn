package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.VXb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68600VXb {
    public static C69665Vt6 parseFromJson(C16L c16l) {
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            String str2 = null;
            ILV ilv = null;
            ILV ilv2 = null;
            ILV ilv3 = null;
            C69173Vj2 c69173Vj2 = null;
            C69173Vj2 c69173Vj22 = null;
            HashMap hashMap = null;
            ILV ilv4 = null;
            ArrayList arrayList = null;
            ILV ilv5 = null;
            C69173Vj2 c69173Vj23 = null;
            String str3 = null;
            ArrayList arrayList2 = null;
            SimpleImageUrl simpleImageUrl = null;
            C69251VkK c69251VkK = null;
            VDZ vdz = null;
            ArrayList arrayList3 = null;
            Boolean bool = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body".equals(A0s)) {
                    ilv2 = IAW.parseFromJson(c16l);
                } else if ("primary_button".equals(A0s)) {
                    c69173Vj2 = VXU.parseFromJson(c16l);
                } else if ("secondary_button".equals(A0s)) {
                    c69173Vj22 = VXU.parseFromJson(c16l);
                } else if ("report_info".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = new HashMap();
                        while (c16l.A1J() != c16r2) {
                            String A1P = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                str = null;
                            } else {
                                str = c16l.A1P();
                                if (str != null) {
                                }
                            }
                            hashMap.put(A1P, str);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("done_button_label".equals(A0s)) {
                    ilv4 = IAW.parseFromJson(c16l);
                } else if ("follow_up_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69365VmB parseFromJson = VXT.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("follow_up_actions_title".equals(A0s)) {
                    ilv5 = IAW.parseFromJson(c16l);
                } else if ("prompt_button".equals(A0s)) {
                    c69173Vj23 = VXU.parseFromJson(c16l);
                } else if ("tip_number".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("paragraphs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ILV parseFromJson2 = IAW.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("image_url".equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("policy_education".equals(A0s)) {
                    c69251VkK = VXX.parseFromJson(c16l);
                } else if ("style".equals(A0s)) {
                    int A1D = c16l.A1D();
                    VDZ[] values = VDZ.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            vdz = values[i];
                            if (vdz.A00 != A1D) {
                                i++;
                            }
                        } else {
                            vdz = null;
                            break;
                        }
                    }
                } else if ("report_tags".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69313VlL parseFromJson3 = VXZ.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("show_confirmation_screen".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("context".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    ilv = IAW.parseFromJson(c16l);
                } else if ("subtitle".equals(A0s)) {
                    ilv3 = IAW.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("context", c16l, "SubmitFRXReportModel.Response");
            } else if (ilv == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "SubmitFRXReportModel.Response");
            } else {
                C69665Vt6 c69665Vt6 = new C69665Vt6(ilv, ilv3, str2);
                if (ilv2 != null) {
                    c69665Vt6.A04 = ilv2;
                }
                if (c69173Vj2 != null) {
                    c69665Vt6.A02 = c69173Vj2;
                }
                if (c69173Vj22 != null) {
                    c69665Vt6.A03 = c69173Vj22;
                }
                if (hashMap != null) {
                    c69665Vt6.A0B = hashMap;
                }
                if (ilv4 != null) {
                    c69665Vt6.A05 = ilv4;
                }
                if (arrayList != null) {
                    c69665Vt6.A0C = arrayList;
                }
                if (ilv5 != null) {
                    c69665Vt6.A06 = ilv5;
                }
                if (c69173Vj23 != null) {
                    c69665Vt6.A01 = c69173Vj23;
                }
                if (str3 != null) {
                    c69665Vt6.A0A = str3;
                }
                if (arrayList2 != null) {
                    c69665Vt6.A0E = arrayList2;
                }
                if (simpleImageUrl != null) {
                    c69665Vt6.A00 = simpleImageUrl;
                }
                if (c69251VkK != null) {
                    c69665Vt6.A07 = c69251VkK;
                }
                if (vdz != null) {
                    c69665Vt6.A08 = vdz;
                }
                if (arrayList3 != null) {
                    c69665Vt6.A0D = arrayList3;
                }
                if (bool != null) {
                    c69665Vt6.A09 = bool;
                }
                if (c69665Vt6.A09 == null) {
                    C0w9.A03("SubmitFRXReport Response", "'show_confirmation_screen' flag was null");
                }
                return c69665Vt6;
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
