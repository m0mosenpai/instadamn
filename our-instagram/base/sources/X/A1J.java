package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class A1J {
    public static AA9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("file_path".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("highest_rating_time_stamp".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("keyframe_indexes".equals(A0s)) {
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
                } else if ("frame_indices".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Integer A0h2 = AbstractC166997dE.A0h(c16l);
                            if (A0h2 != null) {
                                arrayList2.add(A0h2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("timestampsUs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf = Long.valueOf(c16l.A0y());
                            if (valueOf != null) {
                                arrayList3.add(valueOf);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("ratings".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList4.add(AbstractC167007dF.A0a(c16l));
                        }
                    } else {
                        arrayList4 = null;
                    }
                }
                c16l.A0z();
            }
            AA9 aa9 = new AA9();
            if (str != null) {
                aa9.A01 = str;
            }
            if (num != null) {
                aa9.A00 = num.intValue();
            }
            if (arrayList != null) {
                aa9.A03 = arrayList;
            }
            if (arrayList2 != null) {
                aa9.A02 = arrayList2;
            }
            if (arrayList3 != null) {
                aa9.A05 = arrayList3;
            }
            if (arrayList4 != null) {
                aa9.A04 = arrayList4;
            }
            return aa9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
