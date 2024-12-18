package com.instagram.barcelona.permalink.data;

import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.KZX;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2", f = "BarcelonaPermalinkRepository.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ KZX A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2(KZX kzx, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(1, interfaceC23621Ds);
        this.A04 = z;
        this.A01 = kzx;
        this.A03 = z2;
        this.A02 = list;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        boolean z = this.A04;
        return new BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2(this.A01, this.A02, interfaceC23621Ds, z, this.A03);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        if (r8 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        r1 = r6.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r6.AIi(r1, X.C45118Jxn.A00(null, (X.C45118Jxn) r1, null, X.C05F.A01, null, 1023, false, false, false, false)) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        r2 = r9.A02;
        r13 = r9.A05;
        r12 = r25.A02;
        r14 = X.C18U.A06(X.C06090Tz.A05, r2, 36323938581622479L);
        r11 = X.AbstractC167007dF.A1W(X.C226218q.A01(X.AbstractC12960li.A00).A05);
        r10 = ((X.C45118Jxn) r6.getValue()).A07;
        r25.A00 = 1;
        r9 = null;
        r6 = X.AbstractC31177DnL.A0M(r2);
        r6.A0B("text_feed/{post_id}/replies/");
        r6.A0G("X-IG-App-ID", "871865944585275");
        r0 = X.C38321qM.A0i;
        r6.A9s("post_id", X.C38801rC.A06(r13));
        r6.A0I("is_app_start", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r12 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
    
        if (X.AbstractC166987dD.A1b(r12) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
    
        r11 = X.AbstractC167017dG.A0q(r12);
        r1 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r1.hasNext() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
    
        r11.add(X.C38801rC.A06(X.AbstractC166987dD.A1B(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        r1 = X.AbstractC31175DnJ.A0b(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        r6.A0H("prioritized_reply_ids", r1);
        r6.A0H("paging_token", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        if (r14 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
    
        r6.A0F("check_for_unavailable_replies", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fa, code lost:
    
        if (r10 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fc, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0100, code lost:
    
        r6.A0F("media_archived", r9);
        r6.A0P(null, X.K86.class, X.C47831LAr.class, false);
        r6.A01 = X.C25621Ms.A00(null, r6, X.C40781ul.class, X.C55702hA.class, false);
        r6.A0A = "text_feed/{post_id}/replies/";
        r6.A04();
        r2 = r6.A0N().A02(r25, 104842234, 3, X.C20150ym.A07(X.AbstractC20100yh.A00(36327838411996061L)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0134, code lost:
    
        if (r2 != r5) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0136, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0047, code lost:
    
        if (r2 != false) goto L54;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
