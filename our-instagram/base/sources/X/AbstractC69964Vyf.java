package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: X.Vyf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69964Vyf {
    public static C69018Vfu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69018Vfu c69018Vfu = new C69018Vfu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("operations".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69713Vu8 parseFromJson = VVO.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69018Vfu.A01 = arrayList;
                } else if ("view_state_version".equals(A0s)) {
                    c69018Vfu.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c69018Vfu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C69018Vfu c69018Vfu) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        if (c69018Vfu.A01 != null) {
            C16V.A03(A0S, "operations");
            for (C69713Vu8 c69713Vu8 : c69018Vfu.A01) {
                if (c69713Vu8 != null) {
                    A0S.A0d();
                    String str = c69713Vu8.A04;
                    if (str != null) {
                        A0S.A0S("media_id", str);
                    }
                    String str2 = c69713Vu8.A05;
                    if (str2 != null) {
                        A0S.A0S("operation_type", str2);
                    }
                    A0S.A0R("timestamp_ms", c69713Vu8.A00);
                    String str3 = c69713Vu8.A03;
                    if (str3 != null) {
                        A0S.A0S("item_type", str3);
                    }
                    if (c69713Vu8.A02 != null) {
                        A0S.A0r("operation_metadata");
                        C68826Vch c68826Vch = c69713Vu8.A02;
                        A0S.A0d();
                        String str4 = c68826Vch.A00;
                        if (str4 != null) {
                            A0S.A0S("after_media_id", str4);
                        }
                        A0S.A0a();
                    }
                    if (c69713Vu8.A01 != null) {
                        A0S.A0r("item_metadata");
                        C68825Vcg c68825Vcg = c69713Vu8.A01;
                        A0S.A0d();
                        String str5 = c68825Vcg.A00;
                        if (str5 != null) {
                            A0S.A0S(CacheBehaviorLogger.SOURCE, str5);
                        }
                        A0S.A0a();
                    }
                    String str6 = c69713Vu8.A06;
                    if (str6 != null) {
                        A0S.A0S(AbstractC111324zv.A00(493), str6);
                    }
                    A0S.A0a();
                }
            }
            A0S.A0Z();
        }
        String str7 = c69018Vfu.A00;
        if (str7 != null) {
            A0S.A0S("view_state_version", str7);
        }
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
