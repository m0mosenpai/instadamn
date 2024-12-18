package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class A1H {
    public static AAL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("file_path".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("time_stamps".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Integer A0h = AbstractC166997dE.A0h(c16l);
                            if (A0h != null) {
                                arrayList.add(A0h);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("saliency_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            A7X parseFromJson = AE5.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("body_tracking_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            A7X parseFromJson2 = AE5.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("final_tracking_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            A7X parseFromJson3 = AE5.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList4.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("transform_matrices".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C22856A5z parseFromJson4 = A1I.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList5.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                }
                c16l.A0z();
            }
            AAL aal = new AAL();
            if (str != null) {
                aal.A02 = str;
            }
            if (num != null) {
                aal.A01 = num.intValue();
            }
            if (num2 != null) {
                aal.A00 = num2.intValue();
            }
            if (arrayList != null) {
                aal.A06 = arrayList;
            }
            if (arrayList2 != null) {
                aal.A05 = arrayList2;
            }
            if (arrayList3 != null) {
                aal.A03 = arrayList3;
            }
            if (arrayList4 != null) {
                aal.A04 = arrayList4;
            }
            if (arrayList5 != null) {
                aal.A07 = arrayList5;
            }
            return aal;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
