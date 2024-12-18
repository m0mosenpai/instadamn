package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.Dyk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31826Dyk extends AbstractC52922bZ {
    public int A00;
    public FIX A01;
    public List A02;
    public final C2GT A03;
    public final EnumC33420Epr A04;
    public final List A05;
    public final InterfaceC09390do A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;
    public final boolean A0A;

    public C31826Dyk(Context context, UserSession userSession, EnumC33420Epr enumC33420Epr, boolean z) {
        String A04;
        C14360o3.A0B(userSession, 2);
        this.A04 = enumC33420Epr;
        this.A0A = z;
        this.A05 = AbstractC166987dD.A1E();
        this.A06 = AbstractC09440dt.A01(new C50153MDg(userSession, 4));
        C008002u A1H = AbstractC25225BEi.A1H("");
        this.A08 = A1H;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A03 = AbstractC58232lf.A00(anonymousClass191, A1H);
        List list = C16930sl.A00;
        C008002u A00 = C10E.A00(list);
        this.A07 = A00;
        this.A09 = AbstractC208910l.A02(A00);
        int ordinal = this.A04.ordinal();
        try {
        } catch (JSONException e) {
            C0w9.A01.EmN("prompt_suggestions_view_model", AnonymousClass001.A0R("Error when parsing the suggestions JSON ", e.getLocalizedMessage()));
        }
        if (ordinal != 2) {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        throw B4Z.A00();
                    }
                    A04 = C18U.A04(C06090Tz.A06, userSession, 36879445358477581L);
                } else {
                    A04 = C18U.A04(C06090Tz.A06, userSession, 36879445358477581L);
                }
            } else {
                String[] stringArray = context.getResources().getStringArray(R.array.fallback_prompts_suggestions_for_add_yours);
                C14360o3.A07(stringArray);
                list = AbstractC009903n.A0J(stringArray);
                this.A02 = list;
            }
        } else {
            AbstractC23641Du.A05(anonymousClass191, new MCI(this, userSession, null, 3), AbstractC141776au.A00(this));
            A04 = C18U.A04(C06090Tz.A06, userSession, 36887197772743428L);
        }
        JSONArray jSONArray = new JSONArray(A04);
        ArrayList A1E = AbstractC166987dD.A1E();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            C14360o3.A07(string);
            A1E.add(string);
        }
        list = AbstractC001800i.A0a(A1E);
        this.A02 = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r24 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.AbstractC166987dD.A1b(r14.A05) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r16, 36316495405126083L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.content.Context r15, com.instagram.common.session.UserSession r16, com.instagram.common.ui.base.IgSimpleImageView r17, X.FFE r18, X.EnumC33420Epr r19, java.lang.String r20, java.lang.String r21, int r22, int r23, boolean r24) {
        /*
            r14 = this;
            r4 = r17
            r9 = r19
            r6 = r16
            X.AbstractC167027dH.A13(r6, r9, r4)
            r8 = r14
            java.util.List r0 = r14.A02
            boolean r0 = r0.isEmpty()
            r5 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L1e
            java.util.List r0 = r14.A05
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            r3 = 0
            if (r0 == 0) goto L1f
        L1e:
            r3 = 1
        L1f:
            X.Epr r0 = X.EnumC33420Epr.A08
            if (r9 != r0) goto L31
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316495405126083(0x8105a9001c11c3, double:3.030036156766555E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            r2 = 1
            if (r0 != 0) goto L32
        L31:
            r2 = 0
        L32:
            X.Epr r0 = X.EnumC33420Epr.A05
            if (r9 != r0) goto L39
            r1 = 1
            if (r24 != 0) goto L3a
        L39:
            r1 = 0
        L3a:
            X.Epr r0 = X.EnumC33420Epr.A06
            if (r9 == r0) goto L3f
            r5 = 0
        L3f:
            if (r3 == 0) goto L91
            if (r2 != 0) goto L47
            if (r1 != 0) goto L47
            if (r5 == 0) goto L91
        L47:
            int r0 = X.AbstractC53242c7.A08(r15)
            int r1 = r15.getColor(r0)
            r0 = 2131886088(0x7f120008, float:1.9406745E38)
            X.693 r6 = X.C68U.A00(r15, r0)
            if (r6 == 0) goto L91
            int r5 = android.graphics.Color.red(r1)
            int r3 = android.graphics.Color.green(r1)
            int r2 = android.graphics.Color.blue(r1)
            int r0 = android.graphics.Color.alpha(r1)
            X.2ij r1 = new X.2ij
            r1.<init>(r5, r3, r2, r0)
            X.2ir r0 = r6.A01
            X.C6PK.A00(r1, r0)
            r0 = 0
            r6.EMk(r0)
            r4.setImageDrawable(r6)
            r0 = 2131971069(0x7f134bfd, float:1.9579107E38)
            X.AbstractC166997dE.A18(r15, r4, r0)
            X.FoZ r5 = new X.FoZ
            r7 = r18
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.C0fQ.A00(r5, r4)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31826Dyk.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.common.ui.base.IgSimpleImageView, X.FFE, X.Epr, java.lang.String, java.lang.String, int, int, boolean):void");
    }
}
