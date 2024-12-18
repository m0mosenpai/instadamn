package X;

import android.content.Intent;
import android.util.Pair;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabbwpextension.IABBwPContext;
import com.facebook.iabbwpextension.IABBwPExtension;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.SfN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63217SfN {
    public static int A05;
    public static C63217SfN A06;
    public static String A07;
    public static final C62624SJh A08 = new Object();
    public C51758Mth A00;
    public QJ0 A01;
    public boolean A02;
    public final C62524SFa A03 = new C62524SFa();
    public final SN1 A04;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 0
            java.lang.String r3 = A00(r6)
            if (r3 != 0) goto L8
            return r4
        L8:
            java.util.HashSet r0 = X.AbstractC166987dD.A1H()
            X.QJ0 r1 = r5.A01
            java.lang.Object r1 = r1.A00
            int r2 = X.AbstractC166987dD.A0H(r1)
            r1 = 1
            if (r2 == r1) goto L39
            r1 = 2
            if (r2 != r1) goto L22
            X.SN1 r0 = r5.A04
            java.util.HashSet r0 = r0.A08
        L1e:
            java.util.HashSet r0 = X.AbstractC31171DnF.A0k(r0)
        L22:
            java.util.Iterator r2 = r0.iterator()
        L26:
            boolean r1 = r2.hasNext()
            r0 = 0
            if (r1 == 0) goto L38
            java.lang.String r0 = X.AbstractC166987dD.A1B(r2)
            boolean r0 = X.AbstractC001900j.A0a(r3, r0, r4)
            if (r0 == 0) goto L26
            r0 = 1
        L38:
            return r0
        L39:
            X.SN1 r0 = r5.A04
            java.util.HashSet r0 = r0.A07
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63217SfN.A04(java.lang.String):boolean");
    }

    public final boolean A01() {
        return AbstractC167007dF.A1X(this.A01.A00, C05F.A01);
    }

    public final boolean A02() {
        return AbstractC167007dF.A1X(this.A01.A00, C05F.A0C);
    }

    public final boolean A03() {
        if (this.A04.A0B) {
            if (A01() || A02()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [X.SFB, java.lang.Object] */
    public C63217SfN(Intent intent) {
        IABAdsContext iABAdsContext;
        IABBwPExtension iABBwPExtension;
        Integer num;
        String authority;
        String queryParameter;
        this.A04 = new SN1(intent);
        this.A01 = new QJ0(C05F.A00, (String) null, (String) null, (String) null, (String) null);
        this.A00 = new C51758Mth();
        IabCommonTrait iabCommonTrait = (IabCommonTrait) intent.getParcelableExtra("EXTRA_IAB_CONTEXT");
        if (iabCommonTrait != null && (iabCommonTrait instanceof IABAdsContext)) {
            iABAdsContext = (IABAdsContext) iabCommonTrait;
        } else {
            iABAdsContext = null;
        }
        IABBwPContext iABBwPContext = (IABBwPContext) intent.getParcelableExtra("EXTRA_POST_CLICK_CONTEXT");
        if (iABAdsContext == null && iABBwPContext == null) {
            return;
        }
        if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_STICKY_UTM_ENABLED", false) && iABAdsContext != null) {
            HashSet A0k = AbstractC31171DnF.A0k(iABAdsContext.A06);
            android.net.Uri data = intent.getData();
            ?? obj = new Object();
            android.net.Uri uri = null;
            obj.A01 = AbstractC166987dD.A1E();
            if (data != null && (authority = data.getAuthority()) != null) {
                boolean contains = SFB.A03.contains(authority);
                String queryParameter2 = data.getQueryParameter("u");
                if (queryParameter2 != null) {
                    try {
                        uri = AbstractC08820cl.A03(queryParameter2);
                    } catch (SecurityException e) {
                        AbstractC63254SgB.A01("InitialStickyUTM", "URL parsing throw security exception: %s", e);
                    }
                }
                String str = null;
                if (!contains) {
                    str = data.getAuthority();
                } else if (uri != null) {
                    str = uri.getAuthority();
                }
                obj.A00 = str;
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = SFB.A02.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    String queryParameter3 = data.getQueryParameter(A1B);
                    if (queryParameter3 != null) {
                        A1E.add(new Pair(A1B, queryParameter3));
                    }
                    if (contains && uri != null && (queryParameter = uri.getQueryParameter(A1B)) != null) {
                        A1E.add(new Pair(A1B, queryParameter));
                    }
                }
                obj.A01 = A1E;
            }
            this.A00 = new C51758Mth(0, (Object) obj, A0k.contains(EnumC39621HeV.A0C));
        }
        SN1 sn1 = this.A04;
        if (sn1.A0C || !sn1.A0B) {
            return;
        }
        if (iABAdsContext != null) {
            iABBwPExtension = iABAdsContext.A05;
        } else {
            if (iABBwPContext != null) {
                this.A02 = true;
                iABBwPExtension = iABBwPContext.A00;
            }
            AbstractC63254SgB.A02("BwPContext", "Null BwP Extension!", new Object[0]);
        }
        if (iABBwPExtension != null) {
            C62524SFa c62524SFa = this.A03;
            long j = iABBwPExtension.A00;
            long longExtra = intent.getLongExtra("BWP_CACHED_ACCESS_TOKEN_TTL", 0L);
            if (longExtra > j) {
                String stringExtra = intent.getStringExtra("BWP_CACHED_ACCESS_TOKEN_VALUE");
                c62524SFa.A02 = stringExtra == null ? "" : stringExtra;
                c62524SFa.A00 = longExtra;
                num = C05F.A0C;
            } else {
                c62524SFa.A02 = iABBwPExtension.A02;
                c62524SFa.A00 = j;
                num = C05F.A0N;
            }
            c62524SFa.A01 = num;
            this.A01 = new QJ0(iABBwPExtension);
            return;
        }
        AbstractC63254SgB.A02("BwPContext", "Null BwP Extension!", new Object[0]);
    }

    public static final String A00(String str) {
        String str2;
        String A00 = AbstractC61708RsP.A00(str);
        if (!AbstractC167007dF.A1N(A00.length())) {
            android.net.Uri A01 = AbstractC63387Sj3.A01(A00);
            if (A01 == null || (str2 = A01.getAuthority()) == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                AbstractC63254SgB.A02("BwPContext", "Invalid authority", new Object[0]);
            } else {
                return str2;
            }
        }
        return null;
    }
}
