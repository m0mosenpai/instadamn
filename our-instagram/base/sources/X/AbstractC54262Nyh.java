package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* renamed from: X.Nyh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54262Nyh {
    public static OE6 parseFromJson(C16L c16l) {
        int i;
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            OE6 oe6 = new OE6();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC58317Pt9.A00(20).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if (!"live_seconds_per_comment".equals(A0s)) {
                        if (!"comment_likes_enabled".equals(A0s)) {
                            if (!"comment_count".equals(A0s)) {
                                if ("caption".equals(A0s)) {
                                    if (c16l.A11() == C16R.A0G) {
                                    }
                                    c16l.A1P();
                                } else if (!"caption_is_edited".equals(A0s) && !"has_more_comments".equals(A0s) && !"has_more_headload_comments".equals(A0s)) {
                                    if (AbstractC111324zv.A00(4884).equals(A0s)) {
                                        String A0m = AbstractC167017dG.A0m(c16l);
                                        C14360o3.A0B(A0m, 0);
                                        Integer[] A00 = C05F.A00(2);
                                        int length = A00.length;
                                        for (int i2 = 0; i2 < length; i2++) {
                                            if (1 - MSW.A07(A00, i2) != 0) {
                                                str = "full";
                                            } else {
                                                str = NetInfoModule.CONNECTION_TYPE_NONE;
                                            }
                                            if (!A0m.equals(str)) {
                                            }
                                        }
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                    if ("comment_muted".equals(A0s)) {
                                        int A1D = c16l.A1D();
                                        for (Integer num : C05F.A00(2)) {
                                            if (1 - num.intValue() == 0) {
                                                i = 1;
                                            } else {
                                                i = 0;
                                            }
                                            if (A1D == i) {
                                                oe6.A03 = num;
                                            }
                                        }
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                    if ("comments".equals(A0s)) {
                                        if (c16l.A11() == C16R.A0C) {
                                            arrayList = AbstractC166987dD.A1E();
                                            while (c16l.A1J() != C16R.A08) {
                                                C56803PIu parseFromJson = AbstractC54256Nyb.parseFromJson(c16l);
                                                if (parseFromJson != null) {
                                                    arrayList.add(parseFromJson);
                                                }
                                            }
                                        }
                                        oe6.A04 = arrayList;
                                    } else if ("pinned_comment".equals(A0s)) {
                                        oe6.A01 = AbstractC54256Nyb.parseFromJson(c16l);
                                    } else if ("unpinned_comment".equals(A0s)) {
                                        oe6.A02 = AbstractC54256Nyb.parseFromJson(c16l);
                                    } else if ("system_comments".equals(A0s)) {
                                        if (c16l.A11() == C16R.A0C) {
                                            arrayList = AbstractC166987dD.A1E();
                                            while (c16l.A1J() != C16R.A08) {
                                                C56802PIt parseFromJson2 = AbstractC54259Nye.parseFromJson(c16l);
                                                if (parseFromJson2 != null) {
                                                    arrayList.add(parseFromJson2);
                                                }
                                            }
                                        }
                                        oe6.A05 = arrayList;
                                    } else if ("user_pay_supporters_info".equals(A0s)) {
                                        oe6.A00 = AbstractC54260Nyf.parseFromJson(C16V.A00(c16l.A1Q()));
                                    }
                                }
                                c16l.A0z();
                            }
                        }
                        c16l.A0d();
                        c16l.A0z();
                    }
                    c16l.A1D();
                    c16l.A0z();
                }
            }
            return oe6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
