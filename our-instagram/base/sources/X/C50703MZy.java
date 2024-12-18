package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.MZy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50703MZy extends C50704MZz {
    public static final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final UserSession A00;
    public final ClipInfo A01;
    public final C47Z A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50703MZy(Context context, UserSession userSession, C47Z c47z) {
        super(context);
        C14360o3.A0B(c47z, 1);
        this.A02 = c47z;
        this.A00 = userSession;
        this.A01 = c47z.A1N;
    }

    public static final String A01(Boolean bool) {
        if (C14360o3.A0K(bool, true)) {
            return "true";
        }
        return null;
    }

    public static final Long A00(C47Z c47z) {
        if (c47z.A6C) {
            return c47z.A2I;
        }
        String str = c47z.A32;
        if (str != null && str.length() != 0) {
            return AbstractC166997dE.A0j(str);
        }
        return null;
    }

    public final Long A08() {
        long j;
        int i;
        C47Z c47z = this.A02;
        if (c47z.A11()) {
            ClipInfo clipInfo = c47z.A1N;
            i = clipInfo.A05 - clipInfo.A07;
        } else if (c47z.A1G == EnumC40111tc.A07) {
            C52W c52w = c47z.A1L;
            if (c52w == null) {
                return null;
            }
            i = c52w.A00;
        } else {
            if (!c47z.A0x()) {
                return null;
            }
            C915547l c915547l = c47z.A1T;
            if (c915547l.A03 != 2) {
                return null;
            }
            j = c915547l.A05;
            return Long.valueOf(j);
        }
        j = i;
        return Long.valueOf(j);
    }

    public final Long A09() {
        String str;
        C47Z c47z = this.A02;
        boolean z = true;
        if (c47z.A11()) {
            Long valueOf = Long.valueOf(c47z.A0d);
            if (valueOf.longValue() > 0) {
                return valueOf;
            }
        } else {
            if (c47z.A1G == EnumC40111tc.A07) {
                C52W c52w = c47z.A1L;
                if (c52w != null && (str = c52w.A01) != null) {
                    return Long.valueOf(AbstractC13530mf.A03(str));
                }
                if (c52w == null) {
                    z = false;
                }
                C0w9.A03("log_data_helper_get_file_size_bytes", AnonymousClass001.A1D("has audio clip info:", z));
                return null;
            }
            if (c47z.A0x()) {
                return A0A();
            }
        }
        return null;
    }

    public final Long A0A() {
        String str = this.A02.A33;
        if (str != null) {
            return Long.valueOf(AbstractC13530mf.A03(str));
        }
        C0w9.A03("log_data_helper_get_file_size_bytes", "has image file path:false");
        return null;
    }

    public final Long A0B() {
        C47Z c47z = this.A02;
        if (!c47z.A11() && !c47z.A0x()) {
            return null;
        }
        return AbstractC31171DnF.A0V(c47z.A0R);
    }

    public final Long A0C() {
        Object obj;
        C47Z c47z = this.A02;
        if (c47z.A5D) {
            return null;
        }
        Long A00 = A00(c47z);
        if (c47z.A5u && A00 == null) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36327121152391480L)) {
                Iterator A0o = MSX.A0o(c47z);
                while (true) {
                    if (A0o.hasNext()) {
                        obj = A0o.next();
                        if (A00((C47Z) obj) != null) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C47Z c47z2 = (C47Z) obj;
                if (c47z2 == null) {
                    return null;
                }
                return A00(c47z2);
            }
        }
        return A00;
    }

    public final Long A0D() {
        C47Z c47z = this.A02;
        if (!c47z.A11() && !c47z.A0x()) {
            return null;
        }
        return AbstractC31171DnF.A0V(c47z.A0S);
    }

    public final Long A0E() {
        String str;
        long A032;
        C47Z c47z = this.A02;
        if (c47z.A11()) {
            if (c47z.A61) {
                A032 = c47z.A0f;
            } else {
                A032 = c47z.A1N.A00();
            }
        } else {
            if (c47z.A1G == EnumC40111tc.A07) {
                C52W c52w = c47z.A1L;
                if (c52w == null || (str = c52w.A01) == null) {
                    return null;
                }
            } else {
                if (!c47z.A0x()) {
                    return null;
                }
                str = c47z.A3K;
            }
            A032 = AbstractC13530mf.A03(str);
        }
        return Long.valueOf(A032);
    }

    public final Long A0F() {
        int i;
        C47Z c47z = this.A02;
        if (c47z.A11()) {
            i = this.A01.A06;
        } else if (c47z.A0x()) {
            i = c47z.A0G;
        } else {
            return null;
        }
        return Long.valueOf(i);
    }

    public final Long A0G() {
        int i;
        C47Z c47z = this.A02;
        if (c47z.A11()) {
            i = this.A01.A09;
        } else if (c47z.A0x()) {
            i = c47z.A0H;
        } else {
            return null;
        }
        return Long.valueOf(i);
    }

    public final String A0H() {
        C47Z c47z = this.A02;
        if (c47z.A5p) {
            return AnonymousClass001.A0C(c47z.A3t, '1');
        }
        return c47z.A3t;
    }

    public final String A0I() {
        EnumC40111tc enumC40111tc;
        C47Z c47z = this.A02;
        if (!c47z.A11() && (enumC40111tc = c47z.A1G) != EnumC40111tc.A0W && enumC40111tc != EnumC40111tc.A07) {
            return null;
        }
        return C50702MZx.A04(c47z);
    }

    public final boolean A0J() {
        C47Z c47z = this.A02;
        if (c47z.A3O == null && !c47z.A5u) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a7  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C50704MZz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map A07() {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50703MZy.A07():java.util.Map");
    }
}
