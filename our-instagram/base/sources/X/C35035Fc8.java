package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Fc8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35035Fc8 {
    public int A00;
    public Handler A01;
    public C65911TwI A02;
    public C5e4 A03;
    public DirectSearchResult A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;
    public C122025fu A0A;
    public List A0B;
    public List A0C;
    public List A0D;
    public final Context A0E;
    public final UserSession A0F;
    public final C36280FzX A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public C35035Fc8(Context context, UserSession userSession, C36280FzX c36280FzX, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C5e4 c5e4;
        AbstractC167007dF.A1F(str, 3, str2);
        C14360o3.A0B(c36280FzX, 10);
        this.A0E = context;
        this.A0F = userSession;
        this.A0H = str;
        this.A0I = str2;
        this.A0K = z2;
        this.A0J = z3;
        this.A0L = z4;
        this.A0G = c36280FzX;
        this.A01 = AbstractC167007dF.A0J();
        this.A00 = str.equals("direct_user_search_nullstate") ? 0 : Integer.MIN_VALUE;
        if (!z) {
            c5e4 = AbstractC121115e3.A00(userSession);
        } else {
            c5e4 = null;
        }
        this.A03 = c5e4;
        this.A02 = (C65911TwI) userSession.A01(C65911TwI.class, new C50154MDh(userSession, 0));
        this.A0A = AbstractC122015ft.A00(userSession);
    }

    public final void A03(HashMap hashMap) {
        C14360o3.A0B(hashMap, 0);
        if (C14360o3.A0K(this.A0H, "reshare_share_sheet")) {
            AbstractC35062FcZ.A00(this.A0F).markerPoint(145755797, "INTEROP_PROVIDER_UPDATE_EXTRA_DATA");
        }
        List list = this.A0C;
        if (list != null) {
            hashMap.put("ibc_chats", list);
        }
        List list2 = this.A0B;
        if (list2 != null) {
            hashMap.put("agents", list2);
        }
        DirectSearchResult directSearchResult = this.A04;
        if (directSearchResult != null) {
            hashMap.put("meta_ai_agent", directSearchResult);
        }
        List list3 = this.A0D;
        if (list3 != null) {
            hashMap.put("ai_prompts", list3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5e4 r10, X.C35035Fc8 r11) {
        /*
            java.lang.String r4 = r11.A0H
            java.lang.String r3 = "reshare_share_sheet"
            boolean r0 = X.C14360o3.A0K(r4, r3)
            if (r0 == 0) goto L18
            com.instagram.common.session.UserSession r0 = r11.A0F
            X.02i r2 = X.AbstractC35062FcZ.A00(r0)
            r1 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r0 = "BANYAN_FETCH_START"
            r2.markerPoint(r1, r0)
        L18:
            X.5fu r8 = r11.A0A
            r9 = 77014026(0x497240a, float:3.5533026E-36)
            r0 = 0
            if (r8 == 0) goto L25
            X.02i r1 = r8.A00
            r1.markerStart(r9)
        L25:
            X.5eT r7 = r10.A01(r4)
            boolean r1 = X.C14360o3.A0K(r4, r3)
            if (r1 == 0) goto L3d
            com.instagram.common.session.UserSession r1 = r11.A0F
            X.02i r5 = X.AbstractC35062FcZ.A00(r1)
            r2 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r1 = "BANYAN_FETCH_FINISH"
            r5.markerPoint(r2, r1)
        L3d:
            java.lang.String r6 = r7.A01
            if (r6 == 0) goto La6
            if (r8 == 0) goto L54
            java.util.List r1 = r7.A02
            int r1 = r1.size()
            r8.A00(r9, r6, r4, r1)
        L4c:
            r2 = 77017147(0x497303b, float:3.5544222E-36)
            X.02i r1 = r8.A00
            r1.markerStart(r2)
        L54:
            java.util.List r1 = r7.A02
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.collections.List<T of com.instagram.direct.search.provider.InteropProviderDelegateImpl>"
            X.C14360o3.A0C(r1, r5)
            r11.A08 = r1
            r11.A06 = r6
            java.lang.String r1 = "direct_ibc_nullstate"
            X.5eT r2 = r10.A01(r1)
            boolean r1 = r11.A0K
            if (r1 == 0) goto La4
            java.util.List r1 = r2.A02
            X.C14360o3.A0C(r1, r5)
        L6e:
            r11.A0C = r1
            java.lang.String r1 = r2.A01
            r11.A05 = r1
            boolean r2 = r11.A0J
            if (r2 == 0) goto La2
            X.TwI r1 = r11.A02
            java.util.ArrayList r1 = r1.A01()
            X.C14360o3.A0C(r1, r5)
        L81:
            r11.A0B = r1
            if (r2 == 0) goto La0
            X.TwI r2 = r11.A02
            com.instagram.model.direct.DirectShareTarget r1 = r2.A00()
            if (r1 == 0) goto La0
            com.instagram.model.direct.DirectShareTarget r2 = r2.A00()
            java.lang.String r1 = "null cannot be cast to non-null type T of com.instagram.direct.search.provider.InteropProviderDelegateImpl"
            X.C14360o3.A0C(r2, r1)
        L96:
            r11.A04 = r2
            boolean r1 = r11.A0L
            if (r1 == 0) goto Lb2
            X.TwI r1 = r11.A02
            monitor-enter(r1)
            goto La9
        La0:
            r2 = r0
            goto L96
        La2:
            r1 = r0
            goto L81
        La4:
            r1 = r0
            goto L6e
        La6:
            if (r8 == 0) goto L54
            goto L4c
        La9:
            X.Tyq r0 = r1.A00     // Catch: java.lang.Throwable -> Lae
            com.google.common.collect.ImmutableList r0 = r0.A01     // Catch: java.lang.Throwable -> Lae
            goto Lb1
        Lae:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        Lb1:
            monitor-exit(r1)
        Lb2:
            r11.A0D = r0
            r0 = 1
            r11.A09 = r0
            r11.A03 = r10
            boolean r0 = X.C14360o3.A0K(r4, r3)
            if (r0 == 0) goto Lcd
            com.instagram.common.session.UserSession r0 = r11.A0F
            X.02i r2 = X.AbstractC35062FcZ.A00(r0)
            r1 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r0 = "BANYAN_PROCESSING_FINISH"
            r2.markerPoint(r1, r0)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35035Fc8.A00(X.5e4, X.Fc8):void");
    }

    public final /* bridge */ /* synthetic */ List A01(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str) {
        List A01;
        List list = (List) obj2;
        List list2 = (List) obj3;
        List list3 = (List) obj4;
        List list4 = (List) obj5;
        Context context = this.A0E;
        UserSession userSession = this.A0F;
        if (list == null) {
            list = C16930sl.A00;
        }
        ArrayList A012 = AbstractC31677Dvi.A01(context, userSession, list);
        if (list2 != null && !list2.isEmpty()) {
            A012.addAll(AbstractC34197F6v.A00(userSession, list2));
        }
        if (list3 != null && !list3.isEmpty()) {
            A012.addAll(list3);
        }
        if (list4 != null && !list4.isEmpty()) {
            A012.addAll(list4);
        }
        C35040FcD c35040FcD = (C35040FcD) obj;
        if (c35040FcD != null && (A01 = c35040FcD.A01(A012, str)) != null) {
            return A01;
        }
        return A012;
    }

    public final void A02(int i, int i2, long j) {
        this.A0G.A00(this.A00, i, i2, j);
    }
}
