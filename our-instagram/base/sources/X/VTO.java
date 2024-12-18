package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VTO {
    public static C69480Vo3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69480Vo3 c69480Vo3 = new C69480Vo3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("__typename".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("grid_width_percent".equals(A0s)) {
                    c69480Vo3.A00 = c16l.A1D();
                } else if ("color".equals(A0s)) {
                    c69480Vo3.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("logging_token".equals(A0s)) {
                    c69480Vo3.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("autoplay_style".equals(A0s)) {
                    c69480Vo3.A06 = (EnumC33426Epx) EnumHelper.A00(c16l.A1Q(), EnumC33426Epx.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("document_element_type".equals(A0s)) {
                    c69480Vo3.A08 = (EnumC72406Xct) EnumHelper.A00(c16l.A1Q(), EnumC72406Xct.A06);
                } else if ("looping_style".equals(A0s)) {
                    c69480Vo3.A07 = (EnumC46224Kd0) EnumHelper.A00(c16l.A1Q(), EnumC46224Kd0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("image_versions2".equals(A0s)) {
                    c69480Vo3.A01 = VTV.parseFromJson(c16l);
                } else if ("element_video".equals(A0s)) {
                    c69480Vo3.A02 = VTW.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(5099).equals(A0s)) {
                    c69480Vo3.A03 = VTZ.parseFromJson(c16l);
                } else if ("element_descriptor".equals(A0s)) {
                    c69480Vo3.A04 = AbstractC68495VTa.parseFromJson(c16l);
                } else if ("element_text".equals(A0s)) {
                    c69480Vo3.A05 = AbstractC68498VTd.parseFromJson(c16l);
                } else if ("style_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            EnumC72381XcH enumC72381XcH = (EnumC72381XcH) EnumHelper.A00(c16l.A1Q(), EnumC72381XcH.A02);
                            if (enumC72381XcH != null) {
                                arrayList.add(enumC72381XcH);
                            }
                        }
                    }
                    c69480Vo3.A0G = arrayList;
                } else if ("android_links".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69230Vjy parseFromJson = VTM.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69480Vo3.A0B = arrayList;
                } else if ("footer_elements".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69353Vlz parseFromJson2 = VTN.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c69480Vo3.A0D = arrayList;
                } else if ("child_elements".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69354Vm0 parseFromJson3 = VTS.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    c69480Vo3.A0C = arrayList;
                } else if ("header_elements".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69354Vm0 parseFromJson4 = VTS.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList.add(parseFromJson4);
                            }
                        }
                    }
                    c69480Vo3.A0E = arrayList;
                } else if ("product_child_elements".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69389VmZ parseFromJson5 = VTT.parseFromJson(c16l);
                            if (parseFromJson5 != null) {
                                arrayList.add(parseFromJson5);
                            }
                        }
                    }
                    c69480Vo3.A0F = arrayList;
                }
                c16l.A0z();
            }
            return c69480Vo3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
