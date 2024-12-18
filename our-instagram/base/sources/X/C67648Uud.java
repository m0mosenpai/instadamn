package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.accordion.AccordionView;
import java.util.Map;

/* renamed from: X.Uud, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67648Uud extends UGL {
    public final C68701Vad A00;
    public final Map A01;
    public final InterfaceC16620sF A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Vad] */
    public C67648Uud(VG3 vg3, LoggingContext loggingContext, Map map, InterfaceC16620sF interfaceC16620sF, boolean z) {
        super(vg3, loggingContext, false);
        C14360o3.A0B(map, 3);
        this.A01 = map;
        this.A03 = z;
        this.A02 = interfaceC16620sF;
        ?? obj = new Object();
        obj.A00 = null;
        this.A00 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
    
        if (r0 == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C67650Uuf r14, X.C63406Sjd r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67648Uud.A04(X.Uuf, X.Sjd):void");
    }

    public final C67650Uuf A08(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        SPR A01 = C2FP.A01();
        Context A0L = AbstractC166997dE.A0L(viewGroup);
        VG3 vg3 = super.A02;
        View A00 = A01.A00(A0L, viewGroup, vg3);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.facebookpay.widget.accordion.AccordionView");
        AccordionView accordionView = (AccordionView) A00;
        Map map = this.A01;
        boolean z = this.A03;
        InterfaceC16620sF interfaceC16620sF = this.A02;
        C68701Vad c68701Vad = this.A00;
        C14360o3.A0B(vg3, 0);
        AbstractC25233BEq.A0w(1, map, interfaceC16620sF, c68701Vad);
        accordionView.A04 = vg3;
        accordionView.A07 = map;
        accordionView.A09 = z;
        accordionView.A08 = interfaceC16620sF;
        accordionView.A06 = c68701Vad;
        return new C67650Uuf(this, accordionView);
    }
}
