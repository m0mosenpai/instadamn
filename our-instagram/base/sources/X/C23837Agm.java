package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Agm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23837Agm implements InterfaceC25180BCd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C26086BgF A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ ACA A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ C211689Zc A05;
    public final /* synthetic */ A8X A06;
    public final /* synthetic */ C47Z A07;
    public final /* synthetic */ C40121td A08;
    public final /* synthetic */ C183978Ee A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;

    public C23837Agm(Context context, C26086BgF c26086BgF, UserSession userSession, ACA aca, DirectShareTarget directShareTarget, C211689Zc c211689Zc, A8X a8x, C47Z c47z, C40121td c40121td, C183978Ee c183978Ee, String str, String str2, boolean z) {
        this.A02 = userSession;
        this.A07 = c47z;
        this.A0C = z;
        this.A0B = str;
        this.A03 = aca;
        this.A05 = c211689Zc;
        this.A06 = a8x;
        this.A01 = c26086BgF;
        this.A04 = directShareTarget;
        this.A00 = context;
        this.A09 = c183978Ee;
        this.A08 = c40121td;
        this.A0A = str2;
    }

    @Override // X.InterfaceC25180BCd
    public final void DxP() {
        C9O1.A07(this.A00, this.A02, this.A07, "photo_prepare_failed_for_send");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        if (r1.A07 == false) goto L14;
     */
    @Override // X.InterfaceC25180BCd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DxQ(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23837Agm.DxQ(java.lang.Object):void");
    }
}
