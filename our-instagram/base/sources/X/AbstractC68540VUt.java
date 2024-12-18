package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68540VUt {
    public static C69483Vo6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69483Vo6 c69483Vo6 = new C69483Vo6();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(1038).equals(A0s)) {
                    c69483Vo6.A0I = c16l.A0d();
                } else if ("is_editable".equals(A0s)) {
                    c16l.A0d();
                } else if ("is_required".equals(A0s)) {
                    c69483Vo6.A0J = c16l.A0d();
                } else if ("step_size".equals(A0s)) {
                    c69483Vo6.A00 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC111324zv.A00(4246).equals(A0s)) {
                        c69483Vo6.A05 = AbstractC167017dG.A0m(c16l);
                    } else if ("field_key".equals(A0s)) {
                        c69483Vo6.A06 = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                        c69483Vo6.A07 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(1011).equals(A0s)) {
                        c69483Vo6.A08 = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                        c69483Vo6.A09 = AbstractC167017dG.A0m(c16l);
                    } else if ("place_holder".equals(A0s)) {
                        AbstractC31178DnM.A1I(c16l);
                    } else if ("context_provider_type".equals(A0s)) {
                        EnumHelper.A00(c16l.A1Q(), EnumC68177VEv.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("field_type".equals(A0s)) {
                        c69483Vo6.A02 = (VG1) EnumHelper.A00(c16l.A1Q(), VG1.A0V);
                    } else if ("input_domain".equals(A0s)) {
                        c69483Vo6.A03 = (VFS) EnumHelper.A00(c16l.A1Q(), VFS.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("input_type".equals(A0s)) {
                        c69483Vo6.A04 = (EnumC68196VFo) EnumHelper.A00(c16l.A1Q(), EnumC68196VFo.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("validation_spec".equals(A0s)) {
                        c69483Vo6.A01 = AbstractC68539VUs.parseFromJson(c16l);
                    } else if ("context_provider_keys".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c69483Vo6.A0A = arrayList;
                    } else if ("customized_tokens".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c69483Vo6.A0B = arrayList;
                    } else if ("range".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c69483Vo6.A0F = arrayList;
                    } else if ("values".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c69483Vo6.A0H = arrayList;
                    } else if ("dependent_questions_dynamic_info".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69125ViG parseFromJson = AbstractC68530VUj.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c69483Vo6.A0C = arrayList;
                    } else if ("dependent_questions_static_info".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69000Vfc parseFromJson2 = AbstractC68534VUn.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c69483Vo6.A0D = arrayList;
                    } else if ("options".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                VUL parseFromJson3 = AbstractC68535VUo.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        c69483Vo6.A0E = arrayList;
                    } else if ("routing_info".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69001Vfd parseFromJson4 = AbstractC68538VUr.parseFromJson(c16l);
                                if (parseFromJson4 != null) {
                                    arrayList.add(parseFromJson4);
                                }
                            }
                        }
                        c69483Vo6.A0G = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c69483Vo6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
