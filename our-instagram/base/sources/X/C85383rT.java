package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3rT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85383rT {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Context A07;
    public C47350Kvz A08;
    public InterfaceC85423rX A09;
    public InterfaceC30946Dj3 A0A;
    public InterfaceC37124GXj A0B;
    public InterfaceC85403rV A0C;
    public InterfaceC85403rV A0D;
    public CountryCodeData A0E;
    public String A0F;
    public HashMap A0G;
    public HashSet A0H;
    public HashSet A0I;
    public Map A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public final SpannableStringBuilder A0i;
    public final UserSession A0j;
    public final C115955Ml A0k;

    public C85383rT(SpannableStringBuilder spannableStringBuilder, UserSession userSession) {
        this(spannableStringBuilder, userSession, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder A00() {
        /*
            Method dump skipped, instructions count: 1695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85383rT.A00():android.text.SpannableStringBuilder");
    }

    public final void A02(InterfaceC85423rX interfaceC85423rX) {
        this.A09 = interfaceC85423rX;
        this.A0g = true;
    }

    public final void A03(InterfaceC85403rV interfaceC85403rV) {
        this.A0D = interfaceC85403rV;
        this.A0X = true;
    }

    public final void A01(Context context, InterfaceC30946Dj3 interfaceC30946Dj3, List list) {
        this.A07 = context.getApplicationContext();
        this.A0A = interfaceC30946Dj3;
        this.A0h = true;
        if (list != null) {
            this.A0G = new HashMap(list.size());
            this.A0H = new HashSet(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC43528JKo interfaceC43528JKo = (InterfaceC43528JKo) it.next();
                this.A0G.put(interfaceC43528JKo.BSQ(), Integer.valueOf(interfaceC43528JKo.Am3()));
                if (interfaceC43528JKo.CRI()) {
                    this.A0H.add(interfaceC43528JKo.BSQ());
                }
            }
        }
    }

    public C85383rT(SpannableStringBuilder spannableStringBuilder, UserSession userSession, C115955Ml c115955Ml) {
        this.A0L = false;
        this.A0M = false;
        this.A0f = false;
        this.A0d = false;
        this.A0e = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0K = false;
        this.A0Q = false;
        this.A0g = false;
        this.A0X = false;
        this.A0R = false;
        this.A0W = false;
        this.A0h = false;
        this.A0V = false;
        this.A0Y = false;
        this.A0a = false;
        this.A0U = false;
        this.A0Z = false;
        this.A0T = false;
        this.A0S = false;
        this.A0b = false;
        this.A0c = false;
        this.A01 = 0;
        this.A06 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A02 = 0;
        this.A0F = "";
        this.A0G = null;
        this.A0H = null;
        this.A0i = spannableStringBuilder;
        this.A0j = userSession;
        this.A0k = c115955Ml;
    }
}
