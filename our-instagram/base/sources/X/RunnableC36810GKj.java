package X;

import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GKj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36810GKj implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;

    public RunnableC36810GKj(CategorySearchFragment categorySearchFragment) {
        this.A00 = categorySearchFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImmutableList A02;
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        InterfaceC37222GaX interfaceC37222GaX = categorySearchFragment.A06;
        AbstractC18680vv abstractC18680vv = categorySearchFragment.A0A;
        if (abstractC18680vv != null && interfaceC37222GaX != null) {
            if (AbstractC167007dF.A1X(interfaceC37222GaX.B77(), EnumC151596s5.A04)) {
                BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) interfaceC37222GaX;
                A02 = AbstractC35046FcJ.A01(((C35788FrQ) businessConversionActivity.A09.getValue()).A01, abstractC18680vv, businessConversionActivity.A04, AbstractC49092Nc.A00((UserSession) abstractC18680vv).A00(CategorySearchFragment.A0U, "ig_professional_conversion_flow"), businessConversionActivity.A07);
            } else if (AbstractC35211Fg4.A03(interfaceC37222GaX)) {
                UserSession userSession = (UserSession) abstractC18680vv;
                BusinessConversionActivity businessConversionActivity2 = (BusinessConversionActivity) interfaceC37222GaX;
                A02 = AbstractC35046FcJ.A02(userSession, businessConversionActivity2.A04, AbstractC49092Nc.A00(userSession).A00(CategorySearchFragment.A0U, "ig_professional_conversion_flow"), businessConversionActivity2.A07);
            } else {
                ((BusinessConversionActivity) interfaceC37222GaX).CnD(null);
            }
            BusinessConversionActivity businessConversionActivity3 = (BusinessConversionActivity) interfaceC37222GaX;
            BusinessConversionActivity.A01(null, businessConversionActivity3);
            BusinessConversionActivity.A02(businessConversionActivity3);
            C35034Fc7 c35034Fc7 = businessConversionActivity3.A01;
            if (c35034Fc7 == null) {
                C14360o3.A0F("conversionLogic");
                throw C00O.createAndThrow();
            }
            c35034Fc7.A03(A02);
            BusinessConversionActivity.A03(businessConversionActivity3, true);
        }
        CategorySearchFragment.A04(categorySearchFragment);
    }
}
