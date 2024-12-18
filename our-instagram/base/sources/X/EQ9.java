package X;

import android.content.Context;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.fragment.FBPageListWithPreviewFragment;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQ9 extends C2US implements GXE {
    public final C32471ERx A00;
    public final ESH A01;
    public final C32453ERf A02;
    public final C32454ERg A03;
    public final FBPageListWithPreviewFragment A04;
    public final UserSession A05;
    public final List A06;

    @Override // X.GXE
    public final void D8G() {
        ImmutableList A0K;
        String str;
        C34693FQe c34693FQe = this.A04.A03;
        Bundle A0b = AbstractC166987dD.A0b();
        PageSelectionOverrideData pageSelectionOverrideData = c34693FQe.A03;
        if (pageSelectionOverrideData != null && (str = pageSelectionOverrideData.A07) != null) {
            A0b.putString("prior_step", str);
        }
        c34693FQe.A00("create_page");
        InterfaceC37222GaX interfaceC37222GaX = c34693FQe.A02;
        interfaceC37222GaX.getClass();
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("prev_page_id", null);
        A1G.put("current_page_id", null);
        Bundle A0b2 = AbstractC166987dD.A0b();
        Iterator A15 = AbstractC166997dE.A15(A1G);
        while (A15.hasNext()) {
            AbstractC31179DnN.A0o(A0b2, A15);
        }
        ConversionStep conversionStep = ConversionStep.A05;
        BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) interfaceC37222GaX;
        BusinessConversionActivity.A01(A0b2, businessConversionActivity);
        BusinessConversionActivity.A02(businessConversionActivity);
        businessConversionActivity.A08.add(conversionStep);
        C35034Fc7 c35034Fc7 = businessConversionActivity.A01;
        if (c35034Fc7 != null) {
            BusinessConversionFlowStatus businessConversionFlowStatus = c35034Fc7.A00;
            C14360o3.A07(businessConversionFlowStatus);
            BusinessConversionStep businessConversionStep = new BusinessConversionStep(EnumC33376Ep9.A03, conversionStep);
            int i = businessConversionFlowStatus.A00;
            int i2 = i + 1;
            if (i2 >= 0) {
                ImmutableList immutableList = businessConversionFlowStatus.A01;
                if (i2 <= immutableList.size()) {
                    if (i2 == immutableList.size()) {
                        ImmutableList.Builder builder = new ImmutableList.Builder();
                        builder.addAll(immutableList);
                        builder.add((Object) businessConversionStep);
                        A0K = builder.build();
                        C14360o3.A0A(A0K);
                    } else {
                        ImmutableList.Builder builder2 = new ImmutableList.Builder();
                        int size = immutableList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (i3 == i2) {
                                builder2.add((Object) businessConversionStep);
                            }
                            builder2.add(immutableList.get(i3));
                        }
                        A0K = AbstractC31172DnG.A0K(builder2);
                    }
                    c35034Fc7.A00 = new BusinessConversionFlowStatus(A0K, i);
                    C35034Fc7 c35034Fc72 = businessConversionActivity.A01;
                    if (c35034Fc72 != null) {
                        c35034Fc72.A02();
                        BusinessConversionActivity.A03(businessConversionActivity, true);
                        return;
                    }
                }
            }
            throw AbstractC31172DnG.A0u();
        }
        C14360o3.A0F("conversionLogic");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQ9(Context context, FBPageListWithPreviewFragment fBPageListWithPreviewFragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, CharSequence charSequence, String str) {
        super(false);
        AbstractC167017dG.A1S(str, charSequence);
        this.A05 = userSession;
        this.A04 = fBPageListWithPreviewFragment;
        ESH esh = new ESH(context, charSequence, str);
        this.A01 = esh;
        C32454ERg c32454ERg = new C32454ERg(context, this, interfaceC11380iw, userSession);
        this.A03 = c32454ERg;
        C32471ERx c32471ERx = new C32471ERx(context, this);
        this.A00 = c32471ERx;
        C32453ERf c32453ERf = new C32453ERf(context, this, interfaceC11380iw, userSession);
        this.A02 = c32453ERf;
        this.A06 = AbstractC166987dD.A1E();
        init(esh, c32454ERg, c32471ERx, c32453ERf);
    }
}
