package X;

import android.content.Intent;
import android.location.Location;
import android.view.View;
import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Pt2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC58310Pt2 extends InterfaceC58178Pqi {
    NonSupportedContentSchedulingFeatures CD1();

    void Clh(String str);

    void CoZ(IgSimpleImageView igSimpleImageView);

    void Cod(View view);

    void Coh(String str);

    boolean Col();

    void Con(IgSimpleImageView igSimpleImageView, int i);

    void Cp5(boolean z);

    void Cp8();

    void CvP(AbstractC59962oe abstractC59962oe);

    void Cvb(AbstractC59962oe abstractC59962oe, User user);

    void Cw0(AbstractC59962oe abstractC59962oe);

    void Cw1(C50821Mcw c50821Mcw);

    void Cxf();

    void CyF();

    void CyO(List list, long j);

    void D0M(AbstractC59962oe abstractC59962oe);

    void D3F(AbstractC59962oe abstractC59962oe);

    void DCl(NewFundraiserInfo newFundraiserInfo);

    void DGO(C82G c82g, AbstractC59962oe abstractC59962oe);

    void DJC(String str, ArrayList arrayList, boolean z);

    void DJb(C54586O9n c54586O9n, String str);

    void DMx(boolean z);

    void DPB(AbstractC59962oe abstractC59962oe, boolean z, boolean z2);

    void DWh(String str);

    void DWj(boolean z);

    void DXm();

    void DY6();

    void DbZ();

    void DcT(AbstractC59962oe abstractC59962oe, PublishScreenCategoryType publishScreenCategoryType);

    void DdU(AbstractC59962oe abstractC59962oe, boolean z, boolean z2);

    void DfE();

    void Dqd(AbstractC59962oe abstractC59962oe, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel);

    void Dqg(AbstractC59962oe abstractC59962oe, ShoppingCreationConfig shoppingCreationConfig, MediaSuggestedProductTag mediaSuggestedProductTag, int i);

    void Dqh(boolean z, int i);

    void Ds6(View view);

    void Ds7(AbstractC59962oe abstractC59962oe, ShoppingCreationConfig shoppingCreationConfig);

    void Dwf(AbstractC59962oe abstractC59962oe, boolean z, boolean z2);

    void E2B(boolean z);

    void E2h(C54400O2g c54400O2g);

    void E2k(Location location, long j);

    void E5H(NewFundraiserInfo newFundraiserInfo);

    void Ekv(C130135uJ c130135uJ, String str, String str2, boolean z);

    void ElP(View view, String str);

    void ElY(C65782Tu0 c65782Tu0, InterfaceC16820sZ interfaceC16820sZ);

    void FB6(ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel);

    void FBT(NewFundraiserInfo newFundraiserInfo);

    void FCy(UpcomingEvent upcomingEvent);

    void onActivityResult(int i, int i2, Intent intent);
}
