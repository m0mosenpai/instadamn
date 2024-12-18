package X;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.template.browser.repository.ClipsTemplateBrowserSavedOptimisticRepository$getOptimisticSavedSectionData$1", f = "ClipsTemplateBrowserSavedOptimisticRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.PZt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57174PZt extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;

    public C57174PZt(InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C57174PZt c57174PZt = new C57174PZt((InterfaceC23621Ds) obj3);
        c57174PZt.A00 = obj;
        c57174PZt.A01 = obj2;
        return c57174PZt.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        C54991OTz c54991OTz = (C54991OTz) this.A00;
        Iterator A1J = AbstractC25226BEj.A1J(this.A01);
        while (A1J.hasNext()) {
            C51759Mti c51759Mti = (C51759Mti) A1J.next();
            Object obj2 = c51759Mti.A00;
            Integer num = C05F.A00;
            if (obj2 == num) {
                c54991OTz = AbstractC54848OMz.A00(c54991OTz, num, c51759Mti.A01);
            } else {
                C57153PYx c57153PYx = new C57153PYx(c51759Mti, (InterfaceC23621Ds) null, 13, 42);
                C14360o3.A0B(c54991OTz, 0);
                C43818JZg c43818JZg = new C43818JZg(c57153PYx, c54991OTz.A03, 0);
                c54991OTz = new C54991OTz(c54991OTz.A00, c54991OTz.A01, C57277Pbz.A00, c43818JZg);
            }
        }
        return c54991OTz;
    }
}
