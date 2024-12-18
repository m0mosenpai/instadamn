package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68526VUf {
    public static C69434VnJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69434VnJ c69434VnJ = new C69434VnJ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("disqualified_thank_you_card_transparency_info_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else if ("form_extension_landing_page".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else if ("gated_content_locked_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else if ("gated_content_locked_headline".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else if ("gated_content_unlocked_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else if ("gated_content_unlocked_headline".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("qualified_thank_you_card_transparency_info_text".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if (AbstractC111324zv.A00(2879).equals(A0s)) {
                        c69434VnJ.A05 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(2187).equals(A0s)) {
                        c69434VnJ.A00 = AbstractC40664I0w.parseFromJson(c16l);
                    } else if ("creative".equals(A0s)) {
                        c69434VnJ.A01 = AbstractC68522VUb.parseFromJson(c16l);
                    } else if (AbstractC111324zv.A00(2660).equals(A0s)) {
                        c69434VnJ.A02 = AbstractC54019NuV.parseFromJson(c16l);
                    } else if ("conditions".equals(A0s)) {
                        c69434VnJ.A03 = AbstractC68533VUm.parseFromJson(c16l);
                    } else if (AbstractC111324zv.A00(3231).equals(A0s)) {
                        c69434VnJ.A04 = AbstractC54020NuW.parseFromJson(c16l);
                    } else if ("draft_responses".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C68996VfY parseFromJson = AbstractC68523VUc.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c69434VnJ.A06 = arrayList;
                    } else if ("end_screens".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69444VnT parseFromJson2 = AbstractC68524VUd.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c69434VnJ.A07 = arrayList;
                    } else if ("phone_number_validation_exemptions".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C68997VfZ parseFromJson3 = AbstractC68525VUe.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        c69434VnJ.A09 = arrayList;
                    } else if (AbstractC111324zv.A00(1009).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69483Vo6 parseFromJson4 = AbstractC68540VUt.parseFromJson(c16l);
                                if (parseFromJson4 != null) {
                                    arrayList.add(parseFromJson4);
                                }
                            }
                        }
                        c69434VnJ.A08 = arrayList;
                    }
                    c16l.A0z();
                }
            }
            return c69434VnJ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
