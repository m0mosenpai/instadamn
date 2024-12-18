package X;

import android.content.Context;
import android.view.View;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218239kv extends C8J9 implements C8FJ {
    public final C23630AdP A00;
    public final C218189kq A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.8JE, X.9kq] */
    public C218239kv(Context context, TargetViewSizeProvider targetViewSizeProvider, C8C0 c8c0, C23630AdP c23630AdP) {
        super(c8c0);
        C14360o3.A0B(c8c0, 3);
        this.A00 = c23630AdP;
        ?? c8je = new C8JE(context, this, this, false, true, false, false);
        this.A01 = c8je;
        super.A00 = c8je;
        View view = c8c0.A0J;
        C14360o3.A07(view);
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
        AbstractC13880nE.A0U(view, nineSixteenLayoutConfigImpl.A04 - nineSixteenLayoutConfigImpl.A0K.getHeight());
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DDC(InterfaceC120325cX interfaceC120325cX, String str, int i, boolean z) {
        C22993ABs BKP;
        C14360o3.A0B(interfaceC120325cX, 0);
        C23630AdP c23630AdP = this.A00;
        if (c23630AdP.A00 != null) {
            InterfaceC25221BDv interfaceC25221BDv = c23630AdP.A06;
            if (interfaceC25221BDv != null && (BKP = interfaceC25221BDv.BKP()) != null) {
                BKP.A02 = i;
            }
            C194808jg c194808jg = c23630AdP.A04;
            if (c194808jg != null) {
                c194808jg.A0B(i);
            }
        }
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DNh(InterfaceC120325cX interfaceC120325cX, int i) {
        throw C00O.createAndThrow();
    }
}
