package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101854hw {
    public static C101864hx parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            C101864hx c101864hx = new C101864hx();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("action".equals(A0q)) {
                    String A1P = c16l.A1P();
                    Integer[] A00 = C05F.A00(5);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (AbstractC101874hy.A00(num).equals(A1P)) {
                                break;
                            }
                            i++;
                        } else {
                            num = C05F.A0Y;
                            break;
                        }
                    }
                    c101864hx.A02 = num;
                } else {
                    ArrayList arrayList = null;
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    if ("vc_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c101864hx.A04 = str;
                    } else if ("encoded_server_data_info".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c101864hx.A05 = str2;
                    } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        c101864hx.A03 = str3;
                    } else if ("text_attributes".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C909943r parseFromJson = AbstractC909843q.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c101864hx.A06 = arrayList;
                    } else if ("did_join".equals(A0q)) {
                        c101864hx.A01 = Boolean.valueOf(c16l.A0d());
                    } else if ("thread_has_audio_only_call".equals(A0q)) {
                        c101864hx.A07 = c16l.A0d();
                    } else if ("call_end_time".equals(A0q)) {
                        c101864hx.A00 = c16l.A0y();
                    }
                }
                c16l.A0z();
            }
            return c101864hx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C101864hx c101864hx) {
        anonymousClass182.A0d();
        Integer num = c101864hx.A02;
        if (num != null) {
            anonymousClass182.A0S("action", AbstractC101874hy.A00(num));
        }
        String str = c101864hx.A04;
        if (str != null) {
            anonymousClass182.A0S("vc_id", str);
        }
        String str2 = c101864hx.A05;
        if (str2 != null) {
            anonymousClass182.A0S("encoded_server_data_info", str2);
        }
        String str3 = c101864hx.A03;
        if (str3 != null) {
            anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str3);
        }
        if (c101864hx.A06 != null) {
            C16V.A03(anonymousClass182, "text_attributes");
            for (C909943r c909943r : c101864hx.A06) {
                if (c909943r != null) {
                    AbstractC909843q.A00(anonymousClass182, c909943r);
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool = c101864hx.A01;
        if (bool != null) {
            anonymousClass182.A0T("did_join", bool.booleanValue());
        }
        anonymousClass182.A0T("thread_has_audio_only_call", c101864hx.A07);
        anonymousClass182.A0R("call_end_time", c101864hx.A00);
        anonymousClass182.A0a();
    }
}
