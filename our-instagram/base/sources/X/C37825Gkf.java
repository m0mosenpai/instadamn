package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONArray;

@DebugMetadata(c = "instagram.features.clips.midcard.ClipsMidcardFetcher$fetchMidcardFromNetwork$2", f = "ClipsMidcardFetcher.kt", i = {}, l = {108, 110}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.Gkf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37825Gkf extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C62832tM A05;
    public final /* synthetic */ C37546Gg2 A06;
    public final /* synthetic */ AbstractC39459Hbl A07;
    public final /* synthetic */ C37556GgC A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ JSONArray A0A;
    public final /* synthetic */ JSONArray A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37825Gkf(Context context, UserSession userSession, C62832tM c62832tM, C37546Gg2 c37546Gg2, AbstractC39459Hbl abstractC39459Hbl, C37556GgC c37556GgC, String str, InterfaceC23621Ds interfaceC23621Ds, JSONArray jSONArray, JSONArray jSONArray2, int i, int i2) {
        super(1, interfaceC23621Ds);
        this.A04 = userSession;
        this.A02 = i;
        this.A01 = i2;
        this.A0A = jSONArray;
        this.A0B = jSONArray2;
        this.A03 = context;
        this.A06 = c37546Gg2;
        this.A07 = abstractC39459Hbl;
        this.A08 = c37556GgC;
        this.A05 = c62832tM;
        this.A09 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        UserSession userSession = this.A04;
        int i = this.A02;
        int i2 = this.A01;
        JSONArray jSONArray = this.A0A;
        JSONArray jSONArray2 = this.A0B;
        return new C37825Gkf(this.A03, userSession, this.A05, this.A06, this.A07, this.A08, this.A09, interfaceC23621Ds, jSONArray, jSONArray2, i, i2);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C37825Gkf) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1JX r2 = X.C1JX.A02
            int r0 = r13.A00
            r3 = 2
            r6 = 1
            if (r0 == 0) goto L36
            if (r0 == r6) goto L84
            X.AbstractC09560e7.A00(r14)
        Ld:
            X.3NX r14 = X.AbstractC25227BEk.A0i()
        L11:
            boolean r0 = r14 instanceof X.C3NX
            if (r0 != 0) goto L35
            boolean r0 = r14 instanceof X.C194848jk
            if (r0 == 0) goto Lb5
            X.0wb r2 = X.C18950wb.A01
            r1 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "ClipsMidcardFetcher"
            X.0f5 r2 = r2.AEp(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Mid card request failed"
            r2.ABW(r1, r0)
            r2.report()
            X.0eB r0 = X.C0eB.A00
            X.8jk r14 = new X.8jk
            r14.<init>(r0)
        L35:
            return r14
        L36:
            X.AbstractC09560e7.A00(r14)
            com.instagram.common.session.UserSession r0 = r13.A04
            int r11 = r13.A02
            int r10 = r13.A01
            org.json.JSONArray r1 = r13.A0A
            org.json.JSONArray r9 = r13.A0B
            r5 = 0
            X.AbstractC167007dF.A1E(r0, r5, r1)
            r8 = 0
            r7 = r8
            X.1Ms r4 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "clips/mid_cards/"
            r4.A0B(r0)
            java.lang.String r0 = "start_position"
            r4.A0D(r0, r11)
            java.lang.String r0 = "end_position"
            r4.A0D(r0, r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ads_position"
            r4.A9s(r0, r1)
            if (r9 == 0) goto L6b
            java.lang.String r8 = r9.toString()
        L6b:
            java.lang.String r0 = "moment_ids"
            r4.A0H(r0, r8)
            java.lang.Class<X.Gkz> r1 = X.C37845Gkz.class
            java.lang.Class<X.Gky> r0 = X.C37844Gky.class
            X.1ON r1 = X.AbstractC31172DnG.A0R(r7, r4, r1, r0, r5)
            r13.A00 = r6
            r0 = 1394228119(0x531a3b97, float:6.624247E11)
            java.lang.Object r14 = r1.A02(r13, r0, r3, r5)
            if (r14 != r2) goto L87
            return r2
        L84:
            X.AbstractC09560e7.A00(r14)
        L87:
            X.3NY r14 = (X.C3NY) r14
            android.content.Context r5 = r13.A03
            X.Gg2 r9 = r13.A06
            X.Hbl r10 = r13.A07
            X.GgC r11 = r13.A08
            com.instagram.common.session.UserSession r6 = r13.A04
            X.2tM r7 = r13.A05
            java.lang.String r12 = r13.A09
            boolean r0 = r14 instanceof X.C3NX
            if (r0 == 0) goto Lac
            X.3NX r14 = (X.C3NX) r14
            java.lang.Object r8 = r14.A00
            X.Gkz r8 = (X.C37845Gkz) r8
            X.MVf r4 = X.C50594MVf.A00
            r13.A00 = r3
            java.lang.Object r0 = r4.A04(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 != r2) goto Ld
            return r2
        Lac:
            boolean r0 = r14 instanceof X.C194848jk
            if (r0 != 0) goto L11
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb5:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37825Gkf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
