package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;

/* loaded from: classes9.dex */
public final class PYq extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08 = 1;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final String A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYq(Context context, UserSession userSession, IGQuickPromotionFetcherHelper iGQuickPromotionFetcherHelper, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A0C = str;
        this.A0A = iGQuickPromotionFetcherHelper;
        this.A09 = context;
        this.A0B = userSession;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A08 != 0) {
            return new PYq((Context) this.A0B, (UserSession) this.A01, (InterfaceC57996Png) this.A09, (SUPMediaStreamControllerDownloader) this.A0A, this.A0C, interfaceC23621Ds);
        }
        String str = this.A0C;
        return new PYq((Context) this.A09, (UserSession) this.A0B, (IGQuickPromotionFetcherHelper) this.A0A, str, interfaceC23621Ds);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0068, code lost:
    
        if (X.C1RQ.A00().A07(r1) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper.A00(r8, r9, r10, r11, r12, r13) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cf -> B:29:0x00a9). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYq) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYq(Context context, UserSession userSession, InterfaceC57996Png interfaceC57996Png, SUPMediaStreamControllerDownloader sUPMediaStreamControllerDownloader, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A0A = sUPMediaStreamControllerDownloader;
        this.A0B = context;
        this.A01 = userSession;
        this.A09 = interfaceC57996Png;
        this.A0C = str;
    }
}
