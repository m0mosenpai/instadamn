package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.LinkedHashMap;

/* renamed from: X.AhB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23859AhB implements InterfaceC25185BCi {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1GL A02;
    public final /* synthetic */ AbstractC24481Hr A03;
    public final /* synthetic */ AbstractC24481Hr A04;
    public final /* synthetic */ ACA A05;
    public final /* synthetic */ DirectShareTarget A06;
    public final /* synthetic */ C211689Zc A07;
    public final /* synthetic */ A8X A08;
    public final /* synthetic */ C47Z A09;
    public final /* synthetic */ C195868lW A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ LinkedHashMap A0D;
    public final /* synthetic */ boolean A0E;

    public C23859AhB(Context context, UserSession userSession, C1GL c1gl, AbstractC24481Hr abstractC24481Hr, AbstractC24481Hr abstractC24481Hr2, ACA aca, DirectShareTarget directShareTarget, C211689Zc c211689Zc, A8X a8x, C47Z c47z, C195868lW c195868lW, String str, String str2, LinkedHashMap linkedHashMap, boolean z) {
        this.A01 = userSession;
        this.A09 = c47z;
        this.A00 = context;
        this.A0A = c195868lW;
        this.A04 = abstractC24481Hr;
        this.A03 = abstractC24481Hr2;
        this.A0D = linkedHashMap;
        this.A02 = c1gl;
        this.A0C = str;
        this.A05 = aca;
        this.A06 = directShareTarget;
        this.A07 = c211689Zc;
        this.A0E = z;
        this.A0B = str2;
        this.A08 = a8x;
    }

    @Override // X.InterfaceC25185BCi
    public final void DXL() {
        C9O1.A07(this.A00, this.A01, this.A09, "template_overlay_failed_to_save");
    }

    @Override // X.InterfaceC25185BCi
    public final void DXM(String str) {
        ShareType shareType = ShareType.A0Y;
        UserSession userSession = this.A01;
        C47Z A03 = C9O1.A03(userSession, shareType);
        A03.A33 = str;
        C47Z c47z = this.A09;
        c47z.A0V(A03);
        Context context = this.A00;
        C195868lW c195868lW = this.A0A;
        AbstractC24481Hr abstractC24481Hr = this.A04;
        AbstractC24481Hr abstractC24481Hr2 = this.A03;
        LinkedHashMap linkedHashMap = this.A0D;
        C1GL c1gl = this.A02;
        String str2 = this.A0C;
        ACA aca = this.A05;
        DirectShareTarget directShareTarget = this.A06;
        C211689Zc c211689Zc = this.A07;
        boolean z = this.A0E;
        C216029hI c216029hI = new C216029hI(context, userSession, abstractC24481Hr, abstractC24481Hr2, new C23838Agn(context, null, userSession, aca, directShareTarget, c211689Zc, this.A08, c47z, c195868lW, null, str2, this.A0B, null, z), c47z, linkedHashMap);
        if (c1gl == null) {
            C1GJ.A03(c216029hI);
        } else {
            c1gl.schedule(c216029hI);
        }
    }
}
