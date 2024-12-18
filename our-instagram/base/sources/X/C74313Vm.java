package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3Vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74313Vm {
    public static C74293Vk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C74293Vk c74293Vk = new C74293Vk();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                A00(c16l, c74293Vk, A0q);
                c16l.A0z();
            }
            return c74293Vk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C16L c16l, C74293Vk c74293Vk, String str) {
        if ("client_hints".equals(str)) {
            c74293Vk.A01 = AbstractC74353Vr.parseFromJson(c16l);
            return;
        }
        if ("is_shell_response".equals(str)) {
            c74293Vk.A03 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("megaphone".equals(str)) {
            c74293Vk.A02 = AbstractC34247F8t.parseFromJson(c16l);
            return;
        }
        HashMap hashMap = null;
        ArrayList arrayList = null;
        String str2 = null;
        if (DialogModule.KEY_ITEMS.equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C38321qM A0C = C38321qM.A0h.A0C(c16l, true, false);
                    if (A0C != null) {
                        arrayList.add(A0C);
                    }
                }
            }
            c74293Vk.A06 = arrayList;
            return;
        }
        if ("more_available".equals(str)) {
            c74293Vk.A08 = c16l.A0d();
            return;
        }
        if ("auto_load_more_enabled".equals(str)) {
            c74293Vk.A07 = c16l.A0d();
            return;
        }
        if ("next_max_id".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str2 = c16l.A1P();
            }
            c74293Vk.A04 = str2;
            return;
        }
        if ("brand_safety_info".equals(str)) {
            if (c16l.A11() == C16R.A0D) {
                HashMap hashMap2 = new HashMap();
                while (c16l.A1J() != C16R.A09) {
                    String A1P = c16l.A1P();
                    c16l.A1J();
                    if (c16l.A11() == C16R.A0G) {
                        hashMap2.put(A1P, null);
                    } else {
                        Boolean valueOf = Boolean.valueOf(c16l.A0d());
                        if (valueOf != null) {
                            hashMap2.put(A1P, valueOf);
                        }
                    }
                }
                hashMap = hashMap2;
            }
            c74293Vk.A05 = hashMap;
            return;
        }
        C55702hA.A01(c16l, c74293Vk, str);
    }
}
