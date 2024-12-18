package X;

import com.facebook.graphql.enums.EnumHelper;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VV2 {
    public static C69423Vn8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69423Vn8 c69423Vn8 = new C69423Vn8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("allow_write_in_response".equals(A0s)) {
                    c69423Vn8.A07 = c16l.A0d();
                } else if ("is_required".equals(A0s)) {
                    c69423Vn8.A08 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("question_id".equals(A0s)) {
                        c69423Vn8.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("question_class".equals(A0s)) {
                        c69423Vn8.A02 = (VFT) EnumHelper.A00(c16l.A1Q(), VFT.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("body".equals(A0s)) {
                        c69423Vn8.A00 = AbstractC69950VyQ.parseFromJson(c16l);
                    } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                        c69423Vn8.A01 = AbstractC69950VyQ.parseFromJson(c16l);
                    } else if ("subquestion_labels".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69006Vfi parseFromJson = AbstractC69950VyQ.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c69423Vn8.A05 = arrayList;
                    } else if ("survey_token_params".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69010Vfm parseFromJson2 = VV6.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c69423Vn8.A06 = arrayList;
                    } else if ("response_options".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69128ViJ parseFromJson3 = VV7.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        c69423Vn8.A04 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c69423Vn8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
