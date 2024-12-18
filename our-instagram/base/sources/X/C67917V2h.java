package X;

import android.content.Context;
import android.widget.Filter;
import android.widget.Filterable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V2h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67917V2h extends C7E1 implements Filterable {
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final V36 A08;
    public final C31335Dq0 A09;
    public final C34531FJr A0A;
    public final C168737g7 A0B;
    public final EQR A0C;
    public final Context A0D;
    public final Filter A0E;
    public final V3J A0F;
    public final C66692zm A0G;
    public final String A0H;
    public List A03 = new ArrayList();
    public List A04 = new ArrayList();
    public List A01 = new ArrayList();
    public List A02 = new ArrayList();
    public CharSequence A00 = "";

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.A0E;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.FJr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.EQR, X.2y0] */
    public C67917V2h(Context context, C70930WkZ c70930WkZ, InterfaceC11380iw interfaceC11380iw, UserSession userSession, GYX gyx, String str, boolean z) {
        this.A0D = context;
        this.A0H = str;
        V36 v36 = new V36(context, c70930WkZ, interfaceC11380iw, userSession);
        this.A08 = v36;
        C66692zm c66692zm = new C66692zm(context);
        this.A0G = c66692zm;
        V3J v3j = new V3J(context);
        this.A0F = v3j;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A0B = c168737g7;
        this.A0A = new Object();
        this.A09 = new C31335Dq0(2131974887);
        this.A0E = new UBL(this);
        this.A05 = z;
        ?? obj = new Object();
        obj.A00 = gyx;
        this.A0C = obj;
        A0B(v36, c66692zm, v3j, c168737g7, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[LOOP:0: B:16:0x0042->B:18:0x0048, LOOP_END] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.FNu, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C67917V2h r6) {
        /*
            r6.A06()
            boolean r0 = r6.A07
            if (r0 != 0) goto L17
            java.util.List r0 = r6.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            java.util.List r0 = r6.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
        L17:
            r1 = 0
            X.EQR r0 = r6.A0C
            r6.A08(r0, r1)
        L1d:
            boolean r0 = r6.A06
            if (r0 != 0) goto L52
            r3 = 0
            X.V3J r0 = r6.A0F
        L24:
            r6.A08(r0, r3)
        L27:
            boolean r0 = r6.A05
            if (r0 == 0) goto Lb7
            java.util.List r0 = r6.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb7
            X.Dq0 r2 = r6.A09
            X.FJr r1 = r6.A0A
            X.7g7 r0 = r6.A0B
            r6.A09(r0, r2, r1)
            java.util.List r0 = r6.A04
            java.util.Iterator r2 = r0.iterator()
        L42:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r1 = r2.next()
            X.V36 r0 = r6.A08
            r6.A08(r0, r1)
            goto L42
        L52:
            java.util.List r0 = r6.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La1
            java.lang.CharSequence r0 = r6.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L27
            android.content.Context r1 = r6.A0D
            boolean r5 = r6.A05
            java.lang.String r4 = r6.A0H
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.FNu r3 = new X.FNu
            r3.<init>()
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131237371(0x7f0819fb, float:1.809099E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            r0 = 2131962705(0x7f132b51, float:1.9562143E38)
            if (r5 == 0) goto L86
            r0 = 2131962706(0x7f132b52, float:1.9562145E38)
        L86:
            java.lang.String r0 = r2.getString(r0)     // Catch: android.content.res.Resources.NotFoundException -> L9e
            r3.A04 = r0     // Catch: android.content.res.Resources.NotFoundException -> L9e
            r1 = 2131962703(0x7f132b4f, float:1.9562139E38)
            if (r5 == 0) goto L94
            r1 = 2131962704(0x7f132b50, float:1.956214E38)
        L94:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch: android.content.res.Resources.NotFoundException -> L9e
            java.lang.String r0 = r2.getString(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L9e
            r3.A03 = r0     // Catch: android.content.res.Resources.NotFoundException -> L9e
        L9e:
            X.2zm r0 = r6.A0G
            goto L24
        La1:
            java.util.List r0 = r6.A03
            java.util.Iterator r2 = r0.iterator()
        La7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r1 = r2.next()
            X.V36 r0 = r6.A08
            r6.A08(r0, r1)
            goto La7
        Lb7:
            r6.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67917V2h.A00(X.V2h):void");
    }
}
