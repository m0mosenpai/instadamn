package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.9hJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216039hJ extends C2AG {
    public final Context A00;
    public final UserSession A01;
    public final AbstractC24481Hr A02;
    public final AAZ A03;
    public final InterfaceC25180BCd A04;
    public final C22925A8v A05;
    public final FilterGroupModel A06;
    public final C183978Ee A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final EnumC53116NeT[] A0B;

    @Override // X.C11R
    public final int getRunnableId() {
        return 263;
    }

    public C216039hJ(Context context, UserSession userSession, AbstractC24481Hr abstractC24481Hr, BC0 bc0, InterfaceC25180BCd interfaceC25180BCd, C22925A8v c22925A8v, FilterGroupModel filterGroupModel, C183978Ee c183978Ee, EnumC53116NeT[] enumC53116NeTArr, boolean z, boolean z2, boolean z3) {
        FilterGroupModelImpl filterGroupModelImpl;
        this.A00 = context;
        this.A01 = userSession;
        this.A07 = c183978Ee;
        this.A05 = c22925A8v;
        this.A02 = abstractC24481Hr;
        this.A04 = interfaceC25180BCd;
        this.A0B = enumC53116NeTArr;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = z3;
        if (!z && !z2) {
            filterGroupModelImpl = filterGroupModel.E3K();
        } else {
            FilterChain deepCopy = ((FilterGroupModelImpl) filterGroupModel).A02.deepCopy();
            deepCopy.A01(null, 6);
            if (z) {
                deepCopy.A01(null, 8);
                float[] A09 = AbstractC23131AMn.A09();
                Integer num = C05F.A00;
                AbstractC199768sS.A01(deepCopy, new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), A09);
                AbstractC23131AMn.A04(deepCopy);
            }
            filterGroupModelImpl = new FilterGroupModelImpl(deepCopy, null, C05F.A01, -1, true);
        }
        this.A06 = filterGroupModelImpl;
        this.A03 = bc0.AMw(new A5Z(this), filterGroupModelImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a4, code lost:
    
        if (X.C8Li.A02(r3) == false) goto L18;
     */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object, X.7wv, X.AVn] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216039hJ.call():java.lang.Object");
    }
}
